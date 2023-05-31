package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcci implements zzeej<zzcch> {
    private final zzeew<zzbyz> zzfnw;
    private final zzeew<zzbyo> zzfte;

    private zzcci(zzeew<zzbyo> zzeew, zzeew<zzbyz> zzeew2) {
        this.zzfte = zzeew;
        this.zzfnw = zzeew2;
    }

    public static zzcci zzr(zzeew<zzbyo> zzeew, zzeew<zzbyz> zzeew2) {
        return new zzcci(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzcch(this.zzfte.get(), this.zzfnw.get());
    }
}
