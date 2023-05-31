package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zziv extends zzio {
    public final zzir zzamt = new zzir();
    public long zzamu;
    private final int zzamv = 0;
    public ByteBuffer zzcs;

    public zziv(int i) {
    }

    public final void zzz(int i) throws IllegalStateException {
        ByteBuffer byteBuffer = this.zzcs;
        if (byteBuffer == null) {
            this.zzcs = zzaa(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.zzcs.position();
        int i2 = i + position;
        if (capacity < i2) {
            ByteBuffer zzaa = zzaa(i2);
            if (position > 0) {
                this.zzcs.position(0);
                this.zzcs.limit(position);
                zzaa.put(this.zzcs);
            }
            this.zzcs = zzaa;
        }
    }

    public final boolean zzgj() {
        return zzx(1073741824);
    }

    public final void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.zzcs;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    private final ByteBuffer zzaa(int i) {
        ByteBuffer byteBuffer = this.zzcs;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }
}
