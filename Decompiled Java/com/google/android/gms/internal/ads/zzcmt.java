package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.zzb;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcmt implements zzcmf<zzblg, zzdfb, zzcni> {
    private final zzazo zzblr;
    private final Executor zzfeo;
    private final zzbmc zzgbj;
    private final Context zzur;

    public zzcmt(Context context, zzazo zzazo, zzbmc zzbmc, Executor executor) {
        this.zzur = context;
        this.zzblr = zzazo;
        this.zzgbj = zzbmc;
        this.zzfeo = executor;
    }

    public final void zza(zzdeq zzdeq, zzdei zzdei, zzcmd<zzdfb, zzcni> zzcmd) throws zzdfa {
        zzuk zzuk;
        zzuk zzuk2 = zzdeq.zzgql.zzfir.zzblv;
        if (zzuk2.zzcdj) {
            zzuk = new zzuk(this.zzur, zzb.zza(zzuk2.width, zzuk2.height));
        } else {
            zzuk = zzdex.zzb(this.zzur, zzdei.zzgps);
        }
        zzuk zzuk3 = zzuk;
        if (this.zzblr.zzdxg < 4100000) {
            ((zzdfb) zzcmd.zzdel).zza(this.zzur, zzuk3, zzdeq.zzgql.zzfir.zzgqq, zzdei.zzgpt.toString(), (zzalq) zzcmd.zzgbd);
        } else {
            ((zzdfb) zzcmd.zzdel).zza(this.zzur, zzuk3, zzdeq.zzgql.zzfir.zzgqq, zzdei.zzgpt.toString(), zzayf.zza((zzayk) zzdei.zzgpq), (zzalq) zzcmd.zzgbd);
        }
    }

    public final /* synthetic */ Object zzb(zzdeq zzdeq, zzdei zzdei, zzcmd zzcmd) throws zzdfa, zzcpe {
        zzbmc zzbmc = this.zzgbj;
        zzbnv zzbnv = new zzbnv(zzdeq, zzdei, zzcmd.zzfik);
        View view = ((zzdfb) zzcmd.zzdel).getView();
        zzdfb zzdfb = (zzdfb) zzcmd.zzdel;
        zzdfb.getClass();
        zzblj zza = zzbmc.zza(zzbnv, new zzbln(view, (zzbdv) null, zzcms.zza(zzdfb), zzdei.zzgps.get(0)));
        zza.zzaep().zzq(((zzdfb) zzcmd.zzdel).getView());
        zza.zzadj().zza(new zzbjo((zzdfb) zzcmd.zzdel), this.zzfeo);
        ((zzcni) zzcmd.zzgbd).zza((zzalq) zza.zzado());
        return zza.zzaeo();
    }
}
