package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcuo implements zzeej<zzcum> {
    private final zzeew<zzbop> zzequ;
    private final zzeew<zzdfj> zzesd;
    private final zzeew<zzdeu> zzfgu;
    private final zzeew<String> zzgin;
    private final zzeew<String> zzgio;

    private zzcuo(zzeew<String> zzeew, zzeew<String> zzeew2, zzeew<zzbop> zzeew3, zzeew<zzdfj> zzeew4, zzeew<zzdeu> zzeew5) {
        this.zzgin = zzeew;
        this.zzgio = zzeew2;
        this.zzequ = zzeew3;
        this.zzesd = zzeew4;
        this.zzfgu = zzeew5;
    }

    public static zzcuo zzf(zzeew<String> zzeew, zzeew<String> zzeew2, zzeew<zzbop> zzeew3, zzeew<zzdfj> zzeew4, zzeew<zzdeu> zzeew5) {
        return new zzcuo(zzeew, zzeew2, zzeew3, zzeew4, zzeew5);
    }

    public final /* synthetic */ Object get() {
        return new zzcum(this.zzgin.get(), this.zzgio.get(), this.zzequ.get(), this.zzesd.get(), this.zzfgu.get());
    }
}
