package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcny implements zzcmf<zzbvu, zzanq, zzcni> {
    private final zzbwt zzgbv;
    private final Context zzur;

    public zzcny(Context context, zzbwt zzbwt) {
        this.zzur = context;
        this.zzgbv = zzbwt;
    }

    public final void zza(zzdeq zzdeq, zzdei zzdei, zzcmd<zzanq, zzcni> zzcmd) throws zzdfa {
        try {
            ((zzanq) zzcmd.zzdel).zzdn(zzdei.zzdfr);
            ((zzanq) zzcmd.zzdel).zza(zzdei.zzejm, zzdei.zzgpt.toString(), zzdeq.zzgql.zzfir.zzgqq, ObjectWrapper.wrap(this.zzur), (zzanj) new zzcod(this, zzcmd), (zzalq) zzcmd.zzgbd);
        } catch (RemoteException e) {
            throw new zzdfa(e);
        }
    }

    public final /* synthetic */ Object zzb(zzdeq zzdeq, zzdei zzdei, zzcmd zzcmd) throws zzdfa, zzcpe {
        zzcma zzcma = new zzcma(zzdei);
        zzbvw zza = this.zzgbv.zza(new zzbnv(zzdeq, zzdei, zzcmd.zzfik), new zzbvz(new zzcob(zzcmd, zzcma)));
        zzcma.zza(zza.zzadm());
        ((zzcni) zzcmd.zzgbd).zza((zzalq) zza.zzadp());
        return zza.zzaex();
    }
}
