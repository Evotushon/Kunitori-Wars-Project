package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcuf implements zzeej<zzcud> {
    private final zzeew<zzdoe> zzfev;
    private final zzeew<zzdeu> zzfgu;

    private zzcuf(zzeew<zzdoe> zzeew, zzeew<zzdeu> zzeew2) {
        this.zzfev = zzeew;
        this.zzfgu = zzeew2;
    }

    public static zzcuf zzaq(zzeew<zzdoe> zzeew, zzeew<zzdeu> zzeew2) {
        return new zzcuf(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzcud(this.zzfev.get(), this.zzfgu.get());
    }
}
