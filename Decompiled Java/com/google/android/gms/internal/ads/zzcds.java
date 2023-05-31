package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcds implements zzeej<zzcly<zzcdn>> {
    private final zzeew<zzcqp<zzcdn, zzdfb, zzcnl>> zzfeu;
    private final zzeew<zzdeu> zzfgu;
    private final zzeew<zzcqp<zzcdn, zzdfb, zzcni>> zzfud;

    public zzcds(zzeew<zzcqp<zzcdn, zzdfb, zzcnl>> zzeew, zzeew<zzcqp<zzcdn, zzdfb, zzcni>> zzeew2, zzeew<zzdeu> zzeew3) {
        this.zzfeu = zzeew;
        this.zzfud = zzeew2;
        this.zzfgu = zzeew3;
    }

    public final /* synthetic */ Object get() {
        zzcly zzcly;
        zzeew<zzcqp<zzcdn, zzdfb, zzcnl>> zzeew = this.zzfeu;
        zzeew<zzcqp<zzcdn, zzdfb, zzcni>> zzeew2 = this.zzfud;
        if (this.zzfgu.get().zzgqx.contains("new_rewarded")) {
            zzcly = zzeew2.get();
        } else {
            zzcly = zzeew.get();
        }
        return (zzcly) zzeep.zza(zzcly, "Cannot return null from a non-@Nullable @Provides method");
    }
}
