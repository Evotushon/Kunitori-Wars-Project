package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbj extends zzeds {
    private ByteBuffer zzcs;

    public zzbj(String str) {
        super(str);
    }

    public final void zzg(ByteBuffer byteBuffer) {
        this.zzcs = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
