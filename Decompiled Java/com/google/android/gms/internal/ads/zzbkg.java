package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbkg implements zzeej<zzakt> {
    private final zzeew<zzakk> zzffg;

    private zzbkg(zzeew<zzakk> zzeew) {
        this.zzffg = zzeew;
    }

    public static zzbkg zzb(zzeew<zzakk> zzeew) {
        return new zzbkg(zzeew);
    }

    public final /* synthetic */ Object get() {
        return (zzakt) zzeep.zza(this.zzffg.get().zzsm(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
