package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcmu implements zzcmf<zzblg, zzanq, zzcni> {
    /* access modifiers changed from: private */
    public View view;
    private final zzbmc zzgbj;
    private final Context zzur;

    public zzcmu(Context context, zzbmc zzbmc) {
        this.zzur = context;
        this.zzgbj = zzbmc;
    }

    public final void zza(zzdeq zzdeq, zzdei zzdei, zzcmd<zzanq, zzcni> zzcmd) throws zzdfa {
        try {
            ((zzanq) zzcmd.zzdel).zzdn(zzdei.zzdfr);
            ((zzanq) zzcmd.zzdel).zza(zzdei.zzejm, zzdei.zzgpt.toString(), zzdeq.zzgql.zzfir.zzgqq, ObjectWrapper.wrap(this.zzur), new zzcmz(this, zzcmd), (zzalq) zzcmd.zzgbd, zzdeq.zzgql.zzfir.zzblv);
        } catch (RemoteException e) {
            throw new zzdfa(e);
        }
    }

    public final /* synthetic */ Object zzb(zzdeq zzdeq, zzdei zzdei, zzcmd zzcmd) throws zzdfa, zzcpe {
        zzblj zza = this.zzgbj.zza(new zzbnv(zzdeq, zzdei, zzcmd.zzfik), new zzbln(this.view, (zzbdv) null, new zzcmx(zzcmd), zzdei.zzgps.get(0)));
        zza.zzaep().zzq(this.view);
        ((zzcni) zzcmd.zzgbd).zza((zzalq) zza.zzadp());
        return zza.zzaeo();
    }

    static final /* synthetic */ zzxj zza(zzcmd zzcmd) throws zzdfa {
        try {
            return ((zzanq) zzcmd.zzdel).getVideoController();
        } catch (RemoteException e) {
            throw new zzdfa(e);
        }
    }
}
