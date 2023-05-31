package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbcm implements zznn {
    private final byte[] zzdmv;
    private final zznn zzedx;

    zzbcm(zznn zznn, byte[] bArr) {
        this.zzedx = zznn;
        this.zzdmv = bArr;
    }

    public final zzno zzim() {
        zznn zznn = this.zzedx;
        byte[] bArr = this.zzdmv;
        return new zzbcq(new zznl(bArr), bArr.length, zznn.zzim());
    }
}
