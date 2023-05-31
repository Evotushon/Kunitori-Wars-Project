package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzblm implements zzbrn {
    private final Context zzcgz;
    private final zzazo zzfgo;
    private final zzdei zzfgp;
    private final zzdeu zzfgq;

    zzblm(Context context, zzazo zzazo, zzdei zzdei, zzdeu zzdeu) {
        this.zzcgz = context;
        this.zzfgo = zzazo;
        this.zzfgp = zzdei;
        this.zzfgq = zzdeu;
    }

    public final void onAdLoaded() {
        zzq.zzlf().zzb(this.zzcgz, this.zzfgo.zzbmj, this.zzfgp.zzgpv.toString(), this.zzfgq.zzgqr);
    }
}
