package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzchp implements zzeej<zzchm> {
    private final zzeew<zzbgk> zzela;
    private final zzeew<zzcha> zzfve;

    private zzchp(zzeew<zzcha> zzeew, zzeew<zzbgk> zzeew2) {
        this.zzfve = zzeew;
        this.zzela = zzeew2;
    }

    public static zzchp zzag(zzeew<zzcha> zzeew, zzeew<zzbgk> zzeew2) {
        return new zzchp(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzchm(this.zzfve.get(), this.zzela.get());
    }
}
