package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcpv implements zzcly<zzcdn> {
    private final zzazo zzblr;
    private final Executor zzfeo;
    private final zzdeu zzfir;
    private final zzceb zzfrh;
    private final zzcdq zzgdj;
    private final Context zzur;

    public zzcpv(Context context, zzazo zzazo, zzdeu zzdeu, Executor executor, zzcdq zzcdq, zzceb zzceb) {
        this.zzur = context;
        this.zzfir = zzdeu;
        this.zzgdj = zzcdq;
        this.zzfeo = executor;
        this.zzblr = zzazo;
        this.zzfrh = zzceb;
    }

    public final boolean zza(zzdeq zzdeq, zzdei zzdei) {
        return (zzdei.zzgpq == null || zzdei.zzgpq.zzdiw == null) ? false : true;
    }

    public final zzdof<zzcdn> zzb(zzdeq zzdeq, zzdei zzdei) {
        zzcer zzcer = new zzcer();
        zzdof<zzcdn> zzb = zzdnt.zzb(zzdnt.zzaj(null), new zzcpu(this, zzdei, zzcer, zzdeq), this.zzfeo);
        zzcer.getClass();
        zzb.addListener(zzcpx.zza(zzcer), this.zzfeo);
        return zzb;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zzb(zzdei zzdei, zzcer zzcer, zzdeq zzdeq, Object obj) throws Exception {
        zzdof<?> zzdof;
        zzdei zzdei2 = zzdei;
        zzbdv zza = this.zzfrh.zza(this.zzfir.zzblv, zzdei2.zzehg);
        zza.zzba(zzdei2.zzdmq);
        zzcer.zza(this.zzur, zza.getView());
        zzazy zzazy = new zzazy();
        zzcdq zzcdq = this.zzgdj;
        zzbnv zzbnv = new zzbnv(zzdeq, zzdei2, (String) null);
        zzcqb zzcqb = r1;
        zzcqb zzcqb2 = new zzcqb(this.zzur, this.zzfrh, this.zzfir, this.zzblr, zzdei, zzazy, zza);
        zzcdp zza2 = zzcdq.zza(zzbnv, new zzcdo(zzcqb, zza));
        zzazy.set(zza2);
        zzagg.zza(zza, (zzagj) zza2.zzafe());
        zza2.zzadm().zza(new zzcpw(zza), zzazq.zzdxp);
        zza2.zzaek().zzb(zza, true);
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcrj)).booleanValue() || !zzdei2.zzehg) {
            zza2.zzaek();
            zzdof = zzced.zza(zza, zzdei2.zzgpq.zzdiu, zzdei2.zzgpq.zzdiw);
        } else {
            zzdof = zzdnt.zzaj(null);
        }
        return zzdnt.zzb(zzdof, new zzcpz(this, zza, zzdei2, zza2), this.zzfeo);
    }
}
