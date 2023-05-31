package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcnx implements zzcmf<zzbvu, zzdfb, zzcni> {
    private final zzazo zzblr;
    private final Executor zzfeo;
    private final zzbwt zzgbv;
    private final Context zzur;

    public zzcnx(Context context, zzazo zzazo, zzbwt zzbwt, Executor executor) {
        this.zzur = context;
        this.zzblr = zzazo;
        this.zzgbv = zzbwt;
        this.zzfeo = executor;
    }

    public final void zza(zzdeq zzdeq, zzdei zzdei, zzcmd<zzdfb, zzcni> zzcmd) throws zzdfa {
        if (this.zzblr.zzdxg < 4100000) {
            ((zzdfb) zzcmd.zzdel).zza(this.zzur, zzdeq.zzgql.zzfir.zzgqq, zzdei.zzgpt.toString(), (zzalq) zzcmd.zzgbd);
        } else {
            ((zzdfb) zzcmd.zzdel).zza(this.zzur, zzdeq.zzgql.zzfir.zzgqq, zzdei.zzgpt.toString(), zzayf.zza((zzayk) zzdei.zzgpq), (zzalq) zzcmd.zzgbd);
        }
    }

    public final /* synthetic */ Object zzb(zzdeq zzdeq, zzdei zzdei, zzcmd zzcmd) throws zzdfa, zzcpe {
        zzbvw zza = this.zzgbv.zza(new zzbnv(zzdeq, zzdei, zzcmd.zzfik), new zzbvz(new zzcnw(zzcmd)));
        zza.zzadj().zza(new zzbjo((zzdfb) zzcmd.zzdel), this.zzfeo);
        ((zzcni) zzcmd.zzgbd).zza((zzalq) zza.zzado());
        return zza.zzaex();
    }
}
