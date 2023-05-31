package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcqf implements zzcmf<zzcdn, zzdfb, zzcnl> {
    /* access modifiers changed from: private */
    public final Executor zzfeo;
    private final zzcdq zzgdj;
    private final Context zzur;

    public zzcqf(Context context, Executor executor, zzcdq zzcdq) {
        this.zzur = context;
        this.zzfeo = executor;
        this.zzgdj = zzcdq;
    }

    public final void zza(zzdeq zzdeq, zzdei zzdei, zzcmd<zzdfb, zzcnl> zzcmd) throws zzdfa {
        if (!((zzdfb) zzcmd.zzdel).isInitialized()) {
            ((zzcnl) zzcmd.zzgbd).zza((zzbvi) new zzcqh(this, zzdeq, zzdei, zzcmd));
            ((zzdfb) zzcmd.zzdel).zza(this.zzur, zzdeq.zzgql.zzfir.zzgqq, (String) null, (zzasm) zzcmd.zzgbd, zzdei.zzgpt.toString());
            return;
        }
        zzc(zzdeq, zzdei, zzcmd);
    }

    /* access modifiers changed from: private */
    public static void zzc(zzdeq zzdeq, zzdei zzdei, zzcmd<zzdfb, zzcnl> zzcmd) {
        try {
            ((zzdfb) zzcmd.zzdel).zza(zzdeq.zzgql.zzfir.zzgqq, zzdei.zzgpt.toString());
        } catch (Exception e) {
            String valueOf = String.valueOf(zzcmd.zzfik);
            zzawf.zzd(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    public final /* synthetic */ Object zzb(zzdeq zzdeq, zzdei zzdei, zzcmd zzcmd) throws zzdfa, zzcpe {
        zzcdp zza = this.zzgdj.zza(new zzbnv(zzdeq, zzdei, zzcmd.zzfik), new zzcdo(new zzcqe(zzcmd)));
        zza.zzadj().zza(new zzbjo((zzdfb) zzcmd.zzdel), this.zzfeo);
        zzbrc zzadk = zza.zzadk();
        zzbqg zzadl = zza.zzadl();
        ((zzcnl) zzcmd.zzgbd).zza((zzasm) new zzcqj(this, zza.zzaey(), zzadl, zzadk, zza.zzafe()));
        return zza.zzafd();
    }
}
