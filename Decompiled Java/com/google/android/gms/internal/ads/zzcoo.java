package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcoo implements zzcmf<zzbyo, zzanq, zzcni> {
    private final zzbxo zzgcr;
    /* access modifiers changed from: private */
    public zzamd zzgcv;
    private final Context zzur;

    public zzcoo(Context context, zzbxo zzbxo) {
        this.zzur = context;
        this.zzgcr = zzbxo;
    }

    public final void zza(zzdeq zzdeq, zzdei zzdei, zzcmd<zzanq, zzcni> zzcmd) throws zzdfa {
        try {
            ((zzanq) zzcmd.zzdel).zzdn(zzdei.zzdfr);
            ((zzanq) zzcmd.zzdel).zza(zzdei.zzejm, zzdei.zzgpt.toString(), zzdeq.zzgql.zzfir.zzgqq, ObjectWrapper.wrap(this.zzur), (zzank) new zzcoq(this, zzcmd), (zzalq) zzcmd.zzgbd);
        } catch (RemoteException e) {
            throw new zzdfa(e);
        }
    }

    public final /* synthetic */ Object zzb(zzdeq zzdeq, zzdei zzdei, zzcmd zzcmd) throws zzdfa, zzcpe {
        if (zzdeq.zzgql.zzfir.zzgqs.contains(Integer.toString(6))) {
            zzbyz zzb = zzbyz.zzb(this.zzgcv);
            if (zzdeq.zzgql.zzfir.zzgqs.contains(Integer.toString(zzb.zzake()))) {
                zzbza zza = this.zzgcr.zza(new zzbnv(zzdeq, zzdei, zzcmd.zzfik), new zzbzl(zzb), new zzcao((zzaly) null, (zzalx) null, this.zzgcv));
                ((zzcni) zzcmd.zzgbd).zza((zzalq) zza.zzadp());
                return zza.zzadq();
            }
            throw new zzcpe("No corresponding native ad listener", 0);
        }
        throw new zzcpe("Unified must be used for RTB.", 1);
    }
}
