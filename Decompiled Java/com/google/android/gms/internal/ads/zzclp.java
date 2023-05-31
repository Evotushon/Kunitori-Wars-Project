package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzclp implements zzdil {
    private final zzclk zzgal;

    zzclp(zzclk zzclk) {
        this.zzgal = zzclk;
    }

    public final void zza(zzdig zzdig, String str) {
    }

    public final void zzb(zzdig zzdig, String str) {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcre)).booleanValue() && zzdig.RENDERER == zzdig) {
            this.zzgal.zzfe(zzq.zzlc().elapsedRealtime());
        }
    }

    public final void zza(zzdig zzdig, String str, Throwable th) {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcre)).booleanValue() && zzdig.RENDERER == zzdig && this.zzgal.zzanx() != 0) {
            this.zzgal.zzer(zzq.zzlc().elapsedRealtime() - this.zzgal.zzanx());
        }
    }

    public final void zzc(zzdig zzdig, String str) {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcre)).booleanValue() && zzdig.RENDERER == zzdig && this.zzgal.zzanx() != 0) {
            this.zzgal.zzer(zzq.zzlc().elapsedRealtime() - this.zzgal.zzanx());
        }
    }
}
