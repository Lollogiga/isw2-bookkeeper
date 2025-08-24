package org.apache.bookkeeper.generated;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Utility utili a costruire oggetti "validi"
 * quando Randoop prova a chiamare i metodi di BufferedChannel.
*/

public final class Support {

    private Support() {
    }

    /** Creazione allocatore Netty utile per i test*/
    public static UnpooledByteBufAllocator allocator() {
        return UnpooledByteBufAllocator.DEFAULT;
    }

    /**
     * Creazione di un FileChannel temporaneo in lettura e scrittura.
     */
    public static FileChannel rwTempChannel() throws IOException {
        Path tmpPath = Files.createTempFile("bc-", ".bin");
        File tmpFile = tmpPath.toFile();
        tmpFile.deleteOnExit(); // ok: così non lascio file in giro
        return new RandomAccessFile(tmpFile, "rw").getChannel();
    }

    /**
     * Generazione di un ByteBuf riempito per testare write
     */
    public static ByteBuf filledBuf(int size, byte fill) {
        ByteBuf buf = Unpooled.buffer(size, size);
        for (int i = 0; i < size; i++) {
            buf.writeByte(fill);
        }
        // readerIndex rimane a 0, quindi ho readableBytes == size
        return buf;
    }

    /**
     * Generazione di un ByteBuf vuoto per metodo read.
     */
    public static ByteBuf emptyWritable(int size) {
        return Unpooled.buffer(size, size);
    }
}
