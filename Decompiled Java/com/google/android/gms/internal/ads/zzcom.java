package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcom implements zzcmf<zzbyo, zzdfb, zzcni> {
    private final Executor zzfeo;
    private final zzbxo zzgcr;
    private final Context zzur;

    public zzcom(Context context, zzbxo zzbxo, Executor executor) {
        this.zzur = context;
        this.zzgcr = zzbxo;
        this.zzfeo = executor;
    }

    public final void zza(zzdeq zzdeq, zzdei zzdei, zzcmd<zzdfb, zzcni> zzcmd) throws zzdfa {
        ((zzdfb) zzcmd.zzdel).zza(this.zzur, zzdeq.zzgql.zzfir.zzgqq, zzdei.zzgpt.toString(), zzayf.zza((zzayk) zzdei.zzgpq), (zzalq) zzcmd.zzgbd, zzdeq.zzgql.zzfir.zzdff, zzdeq.zzgql.zzfir.zzgqs);
    }

    private static boolean zza(zzdeq zzdeq, int i) {
        return zzdeq.zzgql.zzfir.zzgqs.contains(Integer.toString(i));
    }

    public final /* synthetic */ Object zzb(zzdeq zzdeq, zzdei zzdei, zzcmd zzcmd) throws zzdfa, zzcpe {
        zzbyz zzbyz;
        zzalx zzsq = ((zzdfb) zzcmd.zzdel).zzsq();
        zzaly zzsr = ((zzdfb) zzcmd.zzdel).zzsr();
        zzamd zzsw = ((zzdfb) zzcmd.zzdel).zzsw();
        if (zzsw != null && zza(zzdeq, 6)) {
            zzbyz = zzbyz.zzb(zzsw);
        } else if (zzsq != null && zza(zzdeq, 6)) {
            zzbyz = zzbyz.zzb(zzsq);
        } else if (zzsq != null && zza(zzdeq, 2)) {
            zzbyz = zzbyz.zza(zzsq);
        } else if (zzsr != null && zza(zzdeq, 6)) {
            zzbyz = zzbyz.zzb(zzsr);
        } else if (zzsr == null || !zza(zzdeq, 1)) {
            throw new zzcpe("No native ad mappers", 0);
        } else {
            zzbyz = zzbyz.zza(zzsr);
        }
        if (zzdeq.zzgql.zzfir.zzgqs.contains(Integer.toString(zzbyz.zzake()))) {
            zzbza zza = this.zzgcr.zza(new zzbnv(zzdeq, zzdei, zzcmd.zzfik), new zzbzl(zzbyz), new zzcao(zzsr, zzsq, zzsw));
            ((zzcni) zzcmd.zzgbd).zza((zzalq) zza.zzado());
            zza.zzadj().zza(new zzbjo((zzdfb) zzcmd.zzdel), this.zzfeo);
            return zza.zzadq();
        }
        throw new zzcpe("No corresponding native ad listener", 0);
    }
}
