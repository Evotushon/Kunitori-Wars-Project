package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbcp implements zzedv {
    private final ByteBuffer zzakt;

    zzbcp(ByteBuffer byteBuffer) {
        this.zzakt = byteBuffer.duplicate();
    }

    public final void close() throws IOException {
    }

    public final int read(ByteBuffer byteBuffer) throws IOException {
        if (this.zzakt.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.zzakt.remaining());
        byte[] bArr = new byte[min];
        this.zzakt.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    public final long size() throws IOException {
        return (long) this.zzakt.limit();
    }

    public final long position() throws IOException {
        return (long) this.zzakt.position();
    }

    public final void zzfc(long j) throws IOException {
        this.zzakt.position((int) j);
    }

    public final ByteBuffer zzh(long j, long j2) throws IOException {
        int position = this.zzakt.position();
        this.zzakt.position((int) j);
        ByteBuffer slice = this.zzakt.slice();
        slice.limit((int) j2);
        this.zzakt.position(position);
        return slice;
    }
}
