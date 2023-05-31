package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcnv implements zzbxb {
    private final zzazo zzblr;
    private final zzdei zzfpr;
    private final zzdof<zzbvw> zzgcn;
    private final zzbdv zzgco;
    private final Context zzur;

    private zzcnv(Context context, zzazo zzazo, zzdof<zzbvw> zzdof, zzdei zzdei, zzbdv zzbdv) {
        this.zzur = context;
        this.zzblr = zzazo;
        this.zzgcn = zzdof;
        this.zzfpr = zzdei;
        this.zzgco = zzbdv;
    }

    public final void zza(boolean z, Context context) {
        this.zzgco.zzax(true);
        zzq.zzkv();
        zzg zzg = new zzg(false, zzawo.zzbd(this.zzur), false, 0.0f, -1, z, this.zzfpr.zzgpx, false);
        zzq.zzku();
        Context context2 = context;
        zzl.zza(context2, new AdOverlayInfoParcel((zztz) null, (zzp) ((zzbvw) zzdnt.zzb(this.zzgcn)).zzaez(), (zzv) null, this.zzgco, this.zzfpr.zzgpy, this.zzblr, this.zzfpr.zzdlu, zzg, this.zzfpr.zzgpq.zzdiu, this.zzfpr.zzgpq.zzdiw), true);
    }
}
