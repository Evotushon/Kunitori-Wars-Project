package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcfs implements zzeej<zzcfp> {
    private final zzeew<zzdcu> zzeqz;
    private final zzeew<zzsn> zzfve;

    private zzcfs(zzeew<zzsn> zzeew, zzeew<zzdcu> zzeew2) {
        this.zzfve = zzeew;
        this.zzeqz = zzeew2;
    }

    public static zzcfs zzz(zzeew<zzsn> zzeew, zzeew<zzdcu> zzeew2) {
        return new zzcfs(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzcfp(this.zzfve.get(), this.zzeqz.get());
    }
}
