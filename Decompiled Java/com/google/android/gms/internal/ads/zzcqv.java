package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcqv implements zzcly<zzblg> {
    private final zzdif zzfis;
    private final zzbmc zzgbj;
    private final zzdoe zzgef;
    private final Context zzgel;
    @Nullable
    private final zzaaq zzgem;

    public zzcqv(Context context, zzbmc zzbmc, zzdif zzdif, zzdoe zzdoe, @Nullable zzaaq zzaaq) {
        this.zzgel = context;
        this.zzgbj = zzbmc;
        this.zzfis = zzdif;
        this.zzgef = zzdoe;
        this.zzgem = zzaaq;
    }

    public final boolean zza(zzdeq zzdeq, zzdei zzdei) {
        return (this.zzgem == null || zzdei.zzgpq == null || zzdei.zzgpq.zzdiw == null) ? false : true;
    }

    public final zzdof<zzblg> zzb(zzdeq zzdeq, zzdei zzdei) {
        zzblj zza = this.zzgbj.zza(new zzbnv(zzdeq, zzdei, (String) null), (zzbln) new zzcqw(this, new View(this.zzgel), (zzbdv) null, zzcqu.zzgek, zzdei.zzgps.get(0)));
        return this.zzfis.zzu(zzdig.CUSTOM_RENDER_SYN).zza((zzdhp) new zzcqx(this, new zzaan(zza.zzaeq(), zzdei.zzgpq.zzdiu, zzdei.zzgpq.zzdiw)), this.zzgef).zzw(zzdig.CUSTOM_RENDER_ACK).zze(zzdnt.zzaj(zza.zzaeo())).zzata();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzaan zzaan) throws Exception {
        this.zzgem.zza(zzaan);
    }
}
