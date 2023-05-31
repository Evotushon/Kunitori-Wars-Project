package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbpj implements zzdku {
    private final Context zzcgz;
    private final zzazo zzfgo;
    private final zzdeu zzfjl;

    zzbpj(Context context, zzazo zzazo, zzdeu zzdeu) {
        this.zzcgz = context;
        this.zzfgo = zzazo;
        this.zzfjl = zzdeu;
    }

    public final Object apply(Object obj) {
        Context context = this.zzcgz;
        zzazo zzazo = this.zzfgo;
        zzdeu zzdeu = this.zzfjl;
        zzdei zzdei = (zzdei) obj;
        zzaxg zzaxg = new zzaxg(context);
        zzaxg.zzep(zzdei.zzdlu);
        zzaxg.zzeq(zzdei.zzgpv.toString());
        zzaxg.zzx(zzazo.zzbmj);
        zzaxg.setAdUnitId(zzdeu.zzgqr);
        return zzaxg;
    }
}
