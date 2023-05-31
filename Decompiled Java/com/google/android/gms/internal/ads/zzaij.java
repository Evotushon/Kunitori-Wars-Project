package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzaij extends zzbfx {
    private final /* synthetic */ zzaid zzczw;

    private zzaij(zzaid zzaid) {
        this.zzczw = zzaid;
    }

    public final void zza(zzbga zzbga) {
        if (this.zzczw.zzczu != null) {
            this.zzczw.zzczu.zzsf();
        }
    }

    public final void zzb(zzbga zzbga) {
        this.zzczw.zzg(zzbga.uri);
    }

    public final boolean zzc(zzbga zzbga) {
        return this.zzczw.zzg(zzbga.uri);
    }
}
