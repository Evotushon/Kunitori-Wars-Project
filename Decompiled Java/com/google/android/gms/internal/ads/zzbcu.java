package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbcu extends zzbc {
    static final zzbcu zzeed = new zzbcu();

    zzbcu() {
    }

    public final zzbf zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzbh();
        }
        if ("mvhd".equals(str)) {
            return new zzbk();
        }
        return new zzbj(str);
    }
}
