package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzedu extends zzeds implements zzbf {
    private int flags;
    private int version;

    protected zzedu(String str) {
        super(str);
    }

    public final int getVersion() {
        if (!this.zzifi) {
            zzbgj();
        }
        return this.version;
    }

    /* access modifiers changed from: protected */
    public final long zzo(ByteBuffer byteBuffer) {
        this.version = zzbg.zza(byteBuffer.get());
        this.flags = (zzbg.zzb(byteBuffer) << 8) + 0 + zzbg.zza(byteBuffer.get());
        return 4;
    }
}
