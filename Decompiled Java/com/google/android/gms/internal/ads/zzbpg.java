package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbpg implements zzeej<zzbuv<zzbsn>> {
    private final zzeew<zzbpf> zzffc;
    private final zzbph zzfjk;

    private zzbpg(zzbph zzbph, zzeew<zzbpf> zzeew) {
        this.zzfjk = zzbph;
        this.zzffc = zzeew;
    }

    public static zzbpg zza(zzbph zzbph, zzeew<zzbpf> zzeew) {
        return new zzbpg(zzbph, zzeew);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzffc.get(), zzazq.zzdxp), "Cannot return null from a non-@Nullable @Provides method");
    }
}
