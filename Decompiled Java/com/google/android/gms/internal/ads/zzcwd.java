package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcwd implements zzeej<zzcwb> {
    private final zzeew<zzdoe> zzfev;
    private final zzeew<zzdeg> zzgbw;

    private zzcwd(zzeew<zzdoe> zzeew, zzeew<zzdeg> zzeew2) {
        this.zzfev = zzeew;
        this.zzgbw = zzeew2;
    }

    public static zzcwd zzav(zzeew<zzdoe> zzeew, zzeew<zzdeg> zzeew2) {
        return new zzcwd(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzcwb(this.zzfev.get(), this.zzgbw.get());
    }
}
