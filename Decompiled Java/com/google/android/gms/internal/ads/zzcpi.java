package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcpi implements zzcmf<zzcdn, zzdfb, zzcni> {
    private final Executor zzfeo;
    private final zzcdq zzgdj;
    private final Context zzur;

    public zzcpi(Context context, Executor executor, zzcdq zzcdq) {
        this.zzur = context;
        this.zzfeo = executor;
        this.zzgdj = zzcdq;
    }

    public final void zza(zzdeq zzdeq, zzdei zzdei, zzcmd<zzdfb, zzcni> zzcmd) throws zzdfa {
        try {
            ((zzdfb) zzcmd.zzdel).zzb(this.zzur, zzdeq.zzgql.zzfir.zzgqq, zzdei.zzgpt.toString(), (zzalq) zzcmd.zzgbd);
        } catch (Exception e) {
            String valueOf = String.valueOf(zzcmd.zzfik);
            zzawf.zzd(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    public final /* synthetic */ Object zzb(zzdeq zzdeq, zzdei zzdei, zzcmd zzcmd) throws zzdfa, zzcpe {
        zzcdp zza = this.zzgdj.zza(new zzbnv(zzdeq, zzdei, zzcmd.zzfik), new zzcdo(new zzcpl(zzcmd)));
        zza.zzadj().zza(new zzbjo((zzdfb) zzcmd.zzdel), this.zzfeo);
        ((zzcni) zzcmd.zzgbd).zza((zzalq) zza.zzaff());
        return zza.zzafd();
    }
}
