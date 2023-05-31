package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbqa implements zzeej<zzdeu> {
    private final zzbpt zzfkc;

    private zzbqa(zzbpt zzbpt) {
        this.zzfkc = zzbpt;
    }

    public static zzbqa zzm(zzbpt zzbpt) {
        return new zzbqa(zzbpt);
    }

    public static zzdeu zzn(zzbpt zzbpt) {
        return (zzdeu) zzeep.zza(zzbpt.zzahv(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzn(this.zzfkc);
    }
}
