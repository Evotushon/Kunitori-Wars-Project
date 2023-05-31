package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcme implements zzcly<zzbla> {
    private final Executor zzfeo;
    private final zzdeu zzfir;
    private final zzceb zzfrh;
    private final zzbku zzgbe;
    private final Context zzur;

    public zzcme(zzbku zzbku, Context context, Executor executor, zzceb zzceb, zzdeu zzdeu) {
        this.zzur = context;
        this.zzgbe = zzbku;
        this.zzfeo = executor;
        this.zzfrh = zzceb;
        this.zzfir = zzdeu;
    }

    public final boolean zza(zzdeq zzdeq, zzdei zzdei) {
        return (zzdei.zzgpq == null || zzdei.zzgpq.zzdiw == null) ? false : true;
    }

    public final zzdof<zzbla> zzb(zzdeq zzdeq, zzdei zzdei) {
        return zzdnt.zzb(zzdnt.zzaj(null), new zzcmh(this, zzdeq, zzdei), this.zzfeo);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zza(zzdeq zzdeq, zzdei zzdei, Object obj) throws Exception {
        zzuk zzb = zzdex.zzb(this.zzur, zzdei.zzgps);
        zzbdv zzc = this.zzfrh.zzc(zzb);
        zzbkr zza = this.zzgbe.zza(new zzbnv(zzdeq, zzdei, (String) null), new zzbkq(zzc.getView(), zzc, zzdex.zze(zzb), zzdei.zzffs, zzdei.zzfft));
        zza.zzaek().zzb(zzc, false);
        zza.zzadm().zza(new zzcmg(zzc), zzazq.zzdxp);
        zza.zzaek();
        return zzdnt.zzb(zzced.zza(zzc, zzdei.zzgpq.zzdiu, zzdei.zzgpq.zzdiw), new zzcmj(zza), (Executor) zzazq.zzdxp);
    }
}
