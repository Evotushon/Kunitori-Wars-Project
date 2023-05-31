package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzccm implements zzeej<zzccn> {
    private final zzeew<String> zzfkd;
    private final zzeew<zzbyz> zzfnw;
    private final zzeew<zzbyo> zzfte;

    private zzccm(zzeew<String> zzeew, zzeew<zzbyo> zzeew2, zzeew<zzbyz> zzeew3) {
        this.zzfkd = zzeew;
        this.zzfte = zzeew2;
        this.zzfnw = zzeew3;
    }

    public static zzccm zzk(zzeew<String> zzeew, zzeew<zzbyo> zzeew2, zzeew<zzbyz> zzeew3) {
        return new zzccm(zzeew, zzeew2, zzeew3);
    }

    public final /* synthetic */ Object get() {
        return new zzccn(this.zzfkd.get(), this.zzfte.get(), this.zzfnw.get());
    }
}
