package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbmh implements zzeej<zzcly<zzblg>> {
    private final zzeew<zzcqp<zzblg, zzdfb, zzcni>> zzeun;
    private final zzeew<Boolean> zzezs;
    private final zzeew<zzcow> zzezu;

    public zzbmh(zzeew<Boolean> zzeew, zzeew<zzcow> zzeew2, zzeew<zzcqp<zzblg, zzdfb, zzcni>> zzeew3) {
        this.zzezs = zzeew;
        this.zzezu = zzeew2;
        this.zzeun = zzeew3;
    }

    public final /* synthetic */ Object get() {
        boolean booleanValue = this.zzezs.get().booleanValue();
        zzcly zzcly = (zzcow) this.zzezu.get();
        zzcly zzcly2 = (zzcqp) this.zzeun.get();
        if (!booleanValue) {
            zzcly = zzcly2;
        }
        return (zzcly) zzeep.zza(zzcly, "Cannot return null from a non-@Nullable @Provides method");
    }
}
