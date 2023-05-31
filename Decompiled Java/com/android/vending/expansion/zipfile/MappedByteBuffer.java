package com.android.vending.expansion.zipfile;

import androidx.core.view.MotionEventCompat;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;

public class MappedByteBuffer {
    private RandomAccessFile file_ = null;
    private long offset_ = 0;
    private ByteOrder order_ = ByteOrder.LITTLE_ENDIAN;

    public MappedByteBuffer(RandomAccessFile randomAccessFile, long j) {
        this.file_ = randomAccessFile;
        this.offset_ = j;
    }

    public final void order(ByteOrder byteOrder) {
        this.order_ = byteOrder;
    }

    public final long getLong(long j) {
        long j2;
        position(j);
        try {
            j2 = this.file_.readLong();
        } catch (IOException e) {
            e.printStackTrace();
            j2 = 0;
        }
        if (ByteOrder.LITTLE_ENDIAN != this.order_) {
            return j2;
        }
        return (j2 >>> 56) | (j2 << 56) | ((j2 << 40) & 71776119061217280L) | ((j2 << 24) & 280375465082880L) | ((j2 << 8) & 1095216660480L) | ((j2 >> 8) & 4278190080L) | ((j2 >> 24) & 16711680) | ((j2 >> 40) & 65280);
    }

    public final int getInt(long j) {
        int i;
        position(j);
        try {
            i = this.file_.readInt();
        } catch (IOException e) {
            e.printStackTrace();
            i = 0;
        }
        if (ByteOrder.LITTLE_ENDIAN != this.order_) {
            return i;
        }
        return (i >>> 24) | (i << 24) | ((i << 8) & 16711680) | ((i >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    public final short getShort(long j) {
        short s;
        position(j);
        try {
            s = this.file_.readShort();
        } catch (IOException e) {
            e.printStackTrace();
            s = 0;
        }
        if (ByteOrder.LITTLE_ENDIAN != this.order_) {
            return s;
        }
        return (short) ((s >>> 8) | (s << 8));
    }

    /* access modifiers changed from: package-private */
    public final void position(long j) {
        try {
            this.file_.seek(this.offset_ + j);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public final void get(byte[] bArr, int i, int i2) {
        try {
            this.file_.readFully(bArr, i, i2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
