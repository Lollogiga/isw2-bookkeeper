#!/usr/bin/env bash
set -euo pipefail

# Test Randoop per due classi (BufferedChannel + WriteCache),

TIME_LIMIT=300
HEAP="4g"

# Jar dentro la cartella tools/ del modulo, path assoluto
RANDOOP_JAR="$(pwd)/tools/randoop-all-4.3.4.jar"
if [[ ! -f "$RANDOOP_JAR" ]]; then
  echo "Errore: non trovo $RANDOOP_JAR (atteso: bookkeeper-server/tools/randoop-all-4.3.4.jar)"
  exit 1
fi

# 1) Compilo il modulo
mvn -q -DskipTests package
mvn -q -DskipTests test-compile

# 2) Costruisco il classpath (runtime + test)
mvn -q dependency:build-classpath -DincludeScope=test -Dmdep.outputFile=cp.txt
CP="target/classes:target/test-classes:$(cat cp.txt)"

# 3) Definisco gli output separati e i package dei test generati
OUTDIR_BC="target/randoop-tests-bc"
OUTDIR_WC="target/randoop-tests-wc"

PKG_BC="org.apache.bookkeeper.generated.bc"  # package per BufferedChannel
PKG_WC="org.apache.bookkeeper.generated.wc"  # package per WriteCache

rm -rf "$OUTDIR_BC" "$OUTDIR_WC"
mkdir -p "$OUTDIR_BC" "$OUTDIR_WC"

# --- Flag:
# --time-limit         = tempo massimo (s) per la generazione dei test
# --usethreads=true    = uso thread multipli per velocizzare
# --flaky-test-behavior= scarto i test "flaky" (non deterministici)
# --junit-output-dir   = cartella in cui salvo i .java dei test generati
# --junit-package-name = package dei test generati (così li separo per classe)
# --forbid-null        = evito di passare null a caso
# --null-ratio         = probabilità di usare null (qui molto bassa)

# 4) Genero test per BufferedChannel (uso di Support e Netty)
java -Xmx"$HEAP" -cp "$CP:$RANDOOP_JAR" randoop.main.Main gentests \
  --time-limit="$TIME_LIMIT" \
  --usethreads=true \
  --flaky-test-behavior=DISCARD \
  --junit-output-dir="$OUTDIR_BC" \
  --junit-package-name="$PKG_BC" \
  --testclass=org.apache.bookkeeper.bookie.BufferedChannel \
  --testclass=org.apache.bookkeeper.generated.Support \
  --testclass=io.netty.buffer.Unpooled \
  --testclass=io.netty.buffer.UnpooledByteBufAllocator \
  --forbid-null=true \
  --null-ratio=0.05

# 5) Genero test per WriteCache (Support + Netty)
java -Xmx"$HEAP" -cp "$CP:$RANDOOP_JAR" randoop.main.Main gentests \
  --time-limit="$TIME_LIMIT" \
  --usethreads=true \
  --flaky-test-behavior=DISCARD \
  --junit-output-dir="$OUTDIR_WC" \
  --junit-package-name="$PKG_WC" \
  --testclass=org.apache.bookkeeper.bookie.storage.ldb.WriteCache \
  --testclass=org.apache.bookkeeper.generated.Support \
  --testclass=io.netty.buffer.Unpooled \
  --testclass=io.netty.buffer.UnpooledByteBufAllocator \
  --forbid-null=true \
  --null-ratio=0.05

# 6) Compilo i test generati (mantengo i package)
if find "$OUTDIR_BC" -name '*.java' -print -quit | grep -q . ; then
  find "$OUTDIR_BC" -name '*.java' -print0 | xargs -0 javac -cp "$OUTDIR_BC:$CP" -d "$OUTDIR_BC"
fi
if find "$OUTDIR_WC" -name '*.java' -print -quit | grep -q . ; then
  find "$OUTDIR_WC" -name '*.java' -print0 | xargs -0 javac -cp "$OUTDIR_WC:$CP" -d "$OUTDIR_WC"
fi

# 7) Copio SOLO i due package in src/test/java (li tengo separati: .../generated/bc e .../generated/wc)
DEST="src/test/java"
mkdir -p "$DEST"

PKGDIR_BC="${PKG_BC//.//}"  # org/apache/bookkeeper/generated/bc
PKGDIR_WC="${PKG_WC//.//}"  # org/apache/bookkeeper/generated/wc

if command -v rsync >/dev/null 2>&1; then
  if [[ -d "$OUTDIR_BC/$PKGDIR_BC" ]]; then
    mkdir -p "$DEST/$PKGDIR_BC"
    rsync -a "$OUTDIR_BC/$PKGDIR_BC/." "$DEST/$PKGDIR_BC/"
  fi
  if [[ -d "$OUTDIR_WC/$PKGDIR_WC" ]]; then
    mkdir -p "$DEST/$PKGDIR_WC"
    rsync -a "$OUTDIR_WC/$PKGDIR_WC/." "$DEST/$PKGDIR_WC/"
  fi
else
  # fallback con cp -R
  [[ -d "$OUTDIR_BC/$PKGDIR_BC" ]] && mkdir -p "$DEST/$PKGDIR_BC" && cp -R "$OUTDIR_BC/$PKGDIR_BC/." "$DEST/$PKGDIR_BC/"
  [[ -d "$OUTDIR_WC/$PKGDIR_WC" ]] && mkdir -p "$DEST/$PKGDIR_WC" && cp -R "$OUTDIR_WC/$PKGDIR_WC/." "$DEST/$PKGDIR_WC/"
fi

echo "Test copiati in:"
echo "  - $DEST/$PKGDIR_BC"
echo "  - $DEST/$PKGDIR_WC"

# 8) Coverage con il profilo dedicato
mvn -q -Prandoop-coverage test verify
open "target/site/jacoco-randoop/index.html" || true

echo "Done."
