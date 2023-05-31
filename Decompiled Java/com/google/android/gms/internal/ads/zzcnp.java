package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcnp implements zzcly<zzbvu> {
    private final zzazo zzblr;
    private final Executor zzfeo;
    private final zzdeu zzfir;
    private final zzceb zzfrh;
    private final zzbwt zzgbv;
    private final Context zzur;

    public zzcnp(Context context, zzazo zzazo, zzdeu zzdeu, Executor executor, zzbwt zzbwt, zzceb zzceb) {
        this.zzur = context;
        this.zzfir = zzdeu;
        this.zzgbv = zzbwt;
        this.zzfeo = executor;
        this.zzblr = zzazo;
        this.zzfrh = zzceb;
    }

    public final boolean zza(zzdeq zzdeq, zzdei zzdei) {
        return (zzdei.zzgpq == null || zzdei.zzgpq.zzdiw == null) ? false : true;
    }

    public final zzdof<zzbvu> zzb(zzdeq zzdeq, zzdei zzdei) {
        zzcer zzcer = new zzcer();
        zzdof<zzbvu> zzb = zzdnt.zzb(zzdnt.zzaj(null), new zzcno(this, zzdei, zzcer, zzdeq), this.zzfeo);
        zzcer.getClass();
        zzb.addListener(zzcnr.zza(zzcer), this.zzfeo);
        return zzb;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zza(zzdei zzdei, zzcer zzcer, zzdeq zzdeq, Object obj) throws Exception {
        zzdof<?> zzdof;
        zzbdv zza = this.zzfrh.zza(this.zzfir.zzblv, zzdei.zzehg);
        zza.zzba(zzdei.zzdmq);
        zzcer.zza(this.zzur, zza.getView());
        zzazy zzazy = new zzazy();
        zzbvw zza2 = this.zzgbv.zza(new zzbnv(zzdeq, zzdei, (String) null), new zzbvz(new zzcnv(this.zzur, this.zzblr, zzazy, zzdei, zza), zza));
        zzazy.set(zza2);
        zza2.zzadm().zza(new zzcnq(zza), zzazq.zzdxp);
        zza2.zzaek().zzb(zza, true);
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcrj)).booleanValue() || !zzdei.zzehg) {
            zza2.zzaek();
            zzdof = zzced.zza(zza, zzdei.zzgpq.zzdiu, zzdei.zzgpq.zzdiw);
        } else {
            zzdof = zzdnt.zzaj(null);
        }
        return zzdnt.zzb(zzdof, new zzcnt(this, zza, zzdei, zza2), this.zzfeo);
    }
}
