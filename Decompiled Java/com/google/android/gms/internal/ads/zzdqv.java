package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdqv implements zzdoy {
    private static final byte[] zzhfn = new byte[0];
    private final zzdui zzhfo;
    private final zzdoy zzhfp;

    public zzdqv(zzdui zzdui, zzdoy zzdoy) {
        this.zzhfo = zzdui;
        this.zzhfp = zzdoy;
    }

    public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] byteArray = zzdpu.zzb(this.zzhfo).toByteArray();
        byte[] zzc = this.zzhfp.zzc(byteArray, zzhfn);
        byte[] zzc2 = ((zzdoy) zzdpu.zza(this.zzhfo.zzayh(), byteArray, zzdoy.class)).zzc(bArr, bArr2);
        return ByteBuffer.allocate(zzc.length + 4 + zzc2.length).putInt(zzc.length).put(zzc).put(zzc2).array();
    }
}
