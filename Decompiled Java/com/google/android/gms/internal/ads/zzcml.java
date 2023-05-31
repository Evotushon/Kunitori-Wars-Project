package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcml implements zzcly<zzblg> {
    private final Executor zzfeo;
    private final zzdeu zzfir;
    private final zzceb zzfrh;
    private final zzbmc zzgbj;
    private final zzdku<zzdei, zzaxg> zzgbk;
    private final Context zzur;

    public zzcml(zzbmc zzbmc, Context context, Executor executor, zzceb zzceb, zzdeu zzdeu, zzdku<zzdei, zzaxg> zzdku) {
        this.zzur = context;
        this.zzgbj = zzbmc;
        this.zzfeo = executor;
        this.zzfrh = zzceb;
        this.zzfir = zzdeu;
        this.zzgbk = zzdku;
    }

    public final boolean zza(zzdeq zzdeq, zzdei zzdei) {
        return (zzdei.zzgpq == null || zzdei.zzgpq.zzdiw == null) ? false : true;
    }

    public final zzdof<zzblg> zzb(zzdeq zzdeq, zzdei zzdei) {
        return zzdnt.zzb(zzdnt.zzaj(null), new zzcmk(this, zzdeq, zzdei), this.zzfeo);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(zzbdv zzbdv) {
        zzbdv.zzzz();
        zzbeq zzyq = zzbdv.zzyq();
        if (this.zzfir.zzgqp != null && zzyq != null) {
            zzyq.zzb(this.zzfir.zzgqp);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zzb(zzdeq zzdeq, zzdei zzdei, Object obj) throws Exception {
        zzuk zzb = zzdex.zzb(this.zzur, zzdei.zzgps);
        zzbdv zzc = this.zzfrh.zzc(zzb);
        zzc.zzba(zzdei.zzdmq);
        zzbmc zzbmc = this.zzgbj;
        zzbnv zzbnv = new zzbnv(zzdeq, zzdei, (String) null);
        zzceo zzceo = new zzceo(this.zzur, zzc.getView(), this.zzgbk.apply(zzdei));
        zzc.getClass();
        zzblj zza = zzbmc.zza(zzbnv, new zzbln(zzceo, zzc, zzcmn.zzp(zzc), zzdex.zze(zzb)));
        zza.zzaek().zzb(zzc, false);
        zza.zzadm().zza(new zzcmm(zzc), zzazq.zzdxp);
        zza.zzaek();
        zzdof<?> zza2 = zzced.zza(zzc, zzdei.zzgpq.zzdiu, zzdei.zzgpq.zzdiw);
        if (zzdei.zzdnk) {
            zzc.getClass();
            zza2.addListener(zzcmp.zzh(zzc), this.zzfeo);
        }
        zza2.addListener(new zzcmo(this, zzc), this.zzfeo);
        return zzdnt.zzb(zza2, new zzcmr(zza), (Executor) zzazq.zzdxp);
    }
}
