package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbpr;
import com.google.android.gms.internal.ads.zzsz;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdbs<R extends zzbpr<AdT>, AdT extends zzbnf> implements zzdco<R, AdT> {
    private final Executor executor;
    private final zzdco<R, AdT> zzgmg;
    private final zzdco<R, zzdcb<AdT>> zzgnp;
    private final zzdco<R, zzdgk<AdT>> zzgnq;
    private final zzdgs<AdT> zzgnr;
    @GuardedBy("this")
    private R zzgns;

    public zzdbs(zzdco<R, AdT> zzdco, zzdco<R, zzdcb<AdT>> zzdco2, zzdco<R, zzdgk<AdT>> zzdco3, zzdgs<AdT> zzdgs, Executor executor2) {
        this.zzgmg = zzdco;
        this.zzgnp = zzdco2;
        this.zzgnq = zzdco3;
        this.zzgnr = zzdgs;
        this.executor = executor2;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzaqk */
    public final synchronized R zzaqj() {
        return this.zzgns;
    }

    public final synchronized zzdof<AdT> zza(zzdcp zzdcp, zzdcq<R> zzdcq) {
        zzdeu zzaef;
        zzdcq<R> zzdcq2;
        zzdcp zzdcp2;
        zzaef = ((zzbpr) zzdcq.zzc(zzdcp.zzgoi).zzadi()).zzaef();
        zzdcq2 = zzdcq;
        zzdcp2 = zzdcp;
        return zzdno.zzg(this.zzgnp.zza(zzdcp, zzdcq)).zzb(new zzdbr(this, zzdcp, new zzdbv(zzdcq2, zzdcp2, zzaef.zzgqq, zzaef.zzgqr, this.executor, zzaef.zzgqu, (zzdgj) null), zzdcq), this.executor);
    }

    private final zzdof<AdT> zza(zzdgk<AdT> zzdgk, zzdcp zzdcp, zzdcq<R> zzdcq) {
        zzbpq<R> zzc = zzdcq.zzc(zzdcp.zzgoi);
        if (zzdgk.zzgtl != null) {
            zzdgk.zzgtl.zzahj().zzb(((zzbpr) zzc.zzadi()).zzaeg());
            return zzdnt.zzaj(zzdgk.zzgtl);
        }
        zzc.zza(zzdgk.zzenb);
        zzdof<AdT> zza = this.zzgmg.zza(zzdcp, new zzdbu(zzc));
        this.zzgns = (zzbpr) this.zzgmg.zzaqj();
        return zza;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zza(zzdgw zzdgw) throws Exception {
        if (zzdgw == null || zzdgw.zzgoc == null || zzdgw.zzgua == null) {
            throw new zzcke("Empty prefetch");
        }
        zzdbv zzdbv = (zzdbv) zzdgw.zzgua;
        zzdgw.zzgoc.zzgtk.zzahr().zzc((zzsz.zza) ((zzdyz) zzsz.zza.zzne().zza(zzsz.zza.C0020zza.zznc().zzb(zzsz.zza.zzc.IN_MEMORY).zza(zzsz.zza.zzd.zzng())).zzbcx()));
        return zza(zzdgw.zzgoc, zzdbv.zzgnv, zzdbv.zzgnu);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zza(zzdcp zzdcp, zzdbv zzdbv, zzdcq zzdcq, zzdcb zzdcb) throws Exception {
        if (zzdcb != null) {
            zzdbv zzdbv2 = new zzdbv(zzdbv.zzgnu, zzdbv.zzgnv, zzdbv.zzdjt, zzdbv.zzbri, zzdbv.executor, zzdbv.zzgif, zzdcb.zzgnw);
            if (zzdcb.zzgoc != null) {
                this.zzgns = null;
                this.zzgnr.zzb((zzdgy) zzdbv2);
                return zza(zzdcb.zzgoc, zzdcp, zzdcq);
            }
            zzdof<zzdgw<AdT>> zzc = this.zzgnr.zzc((zzdgy) zzdbv2);
            if (zzc != null) {
                this.zzgns = (zzbpr) this.zzgnq.zzaqj();
                return zzdnt.zzb(zzc, new zzdbt(this), this.executor);
            }
            this.zzgnr.zzb((zzdgy) zzdbv2);
            zzdcp = new zzdcp(zzdcp.zzgoi, zzdcb.zzfyj);
        }
        zzdof<AdT> zza = this.zzgmg.zza(zzdcp, zzdcq);
        this.zzgns = (zzbpr) this.zzgmg.zzaqj();
        return zza;
    }
}
