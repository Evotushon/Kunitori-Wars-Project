package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcqb implements zzbxb {
    private final zzazo zzblr;
    private final zzdei zzfhg;
    private final zzdeu zzfir;
    private final zzceb zzfrh;
    private final zzdof<zzcdp> zzgcn;
    private final zzbdv zzgdq;
    private final Context zzur;

    private zzcqb(Context context, zzceb zzceb, zzdeu zzdeu, zzazo zzazo, zzdei zzdei, zzdof<zzcdp> zzdof, zzbdv zzbdv) {
        this.zzur = context;
        this.zzfrh = zzceb;
        this.zzfir = zzdeu;
        this.zzblr = zzazo;
        this.zzfhg = zzdei;
        this.zzgcn = zzdof;
        this.zzgdq = zzbdv;
    }

    public final void zza(boolean z, Context context) {
        zzbdv zzbdv;
        zzbdv zzbdv2;
        zzcdp zzcdp = (zzcdp) zzdnt.zzb(this.zzgcn);
        try {
            zzdei zzdei = this.zzfhg;
            if (!this.zzgdq.zzaau()) {
                zzbdv2 = this.zzgdq;
            } else {
                if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcjn)).booleanValue()) {
                    zzbdv2 = this.zzgdq;
                } else {
                    zzbdv zzc = this.zzfrh.zzc(this.zzfir.zzblv);
                    zzagg.zza(zzc, (zzagj) zzcdp.zzafe());
                    zzcer zzcer = new zzcer();
                    zzcer.zza(this.zzur, zzc.getView());
                    zzcdp.zzaek().zzb(zzc, true);
                    zzc.zzaaf().zza((zzbfh) new zzcqa(zzcer, zzc));
                    zzbfi zzaaf = zzc.zzaaf();
                    zzc.getClass();
                    zzaaf.zza(zzcqd.zzq(zzc));
                    zzc.zzb(zzdei.zzgpq.zzdiu, zzdei.zzgpq.zzdiw, (String) null);
                    zzbdv = zzc;
                    zzbdv.zzax(true);
                    zzq.zzkv();
                    zzg zzg = new zzg(false, zzawo.zzbd(this.zzur), false, 0.0f, -1, z, this.zzfhg.zzgpx, this.zzfhg.zzblo);
                    zzq.zzku();
                    Context context2 = context;
                    zzl.zza(context2, new AdOverlayInfoParcel((zztz) null, (zzp) zzcdp.zzaez(), (zzv) null, zzbdv, this.zzfhg.zzgpy, this.zzblr, this.zzfhg.zzdlu, zzg, this.zzfhg.zzgpq.zzdiu, this.zzfhg.zzgpq.zzdiw), true);
                }
            }
            zzbdv = zzbdv2;
            zzbdv.zzax(true);
            zzq.zzkv();
            zzg zzg2 = new zzg(false, zzawo.zzbd(this.zzur), false, 0.0f, -1, z, this.zzfhg.zzgpx, this.zzfhg.zzblo);
            zzq.zzku();
            Context context22 = context;
            zzl.zza(context22, new AdOverlayInfoParcel((zztz) null, (zzp) zzcdp.zzaez(), (zzv) null, zzbdv, this.zzfhg.zzgpy, this.zzblr, this.zzfhg.zzdlu, zzg2, this.zzfhg.zzgpq.zzdiu, this.zzfhg.zzgpq.zzdiw), true);
        } catch (zzbei e) {
            zzazh.zzc("", e);
        }
    }
}
