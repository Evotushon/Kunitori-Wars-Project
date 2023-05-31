package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcpn implements zzcmf<zzcdn, zzanq, zzcni> {
    private final zzcdq zzgdj;
    private final Context zzur;

    public zzcpn(Context context, zzcdq zzcdq) {
        this.zzur = context;
        this.zzgdj = zzcdq;
    }

    public final void zza(zzdeq zzdeq, zzdei zzdei, zzcmd<zzanq, zzcni> zzcmd) throws zzdfa {
        try {
            ((zzanq) zzcmd.zzdel).zzdn(zzdei.zzdfr);
            ((zzanq) zzcmd.zzdel).zza(zzdei.zzejm, zzdei.zzgpt.toString(), zzdeq.zzgql.zzfir.zzgqq, ObjectWrapper.wrap(this.zzur), (zzanp) new zzcpo(this, zzcmd), (zzalq) zzcmd.zzgbd);
        } catch (RemoteException e) {
            zzawf.zza("Remote exception loading a rewarded RTB ad", e);
        }
    }

    public final /* synthetic */ Object zzb(zzdeq zzdeq, zzdei zzdei, zzcmd zzcmd) throws zzdfa, zzcpe {
        zzcma zzcma = new zzcma(zzdei);
        zzcdp zza = this.zzgdj.zza(new zzbnv(zzdeq, zzdei, zzcmd.zzfik), new zzcdo(new zzcpm(zzcmd, zzcma)));
        zzcma.zza(zza.zzadm());
        ((zzcni) zzcmd.zzgbd).zza((zzalq) zza.zzafg());
        return zza.zzafd();
    }
}
