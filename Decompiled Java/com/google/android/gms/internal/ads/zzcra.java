package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcra<AdT> implements zzcly<AdT> {
    private final zzdif zzfis;
    private final zzdoe zzgef;
    @Nullable
    private final zzaaq zzgem;
    /* access modifiers changed from: private */
    public final zzcrf<AdT> zzgeq;

    public zzcra(zzdif zzdif, zzdoe zzdoe, @Nullable zzaaq zzaaq, zzcrf<AdT> zzcrf) {
        this.zzfis = zzdif;
        this.zzgef = zzdoe;
        this.zzgem = zzaaq;
        this.zzgeq = zzcrf;
    }

    public final boolean zza(zzdeq zzdeq, zzdei zzdei) {
        return (this.zzgem == null || zzdei.zzgpq == null || zzdei.zzgpq.zzdiw == null) ? false : true;
    }

    public final zzdof<AdT> zzb(zzdeq zzdeq, zzdei zzdei) {
        zzazy zzazy = new zzazy();
        zzcri zzcri = new zzcri();
        zzcri.zza(new zzcrc(this, zzazy, zzdeq, zzdei, zzcri));
        return this.zzfis.zzu(zzdig.CUSTOM_RENDER_SYN).zza((zzdhp) new zzcrd(this, new zzaan(zzcri, zzdei.zzgpq.zzdiu, zzdei.zzgpq.zzdiw)), this.zzgef).zzw(zzdig.CUSTOM_RENDER_ACK).zze(zzazy).zzata();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzaan zzaan) throws Exception {
        this.zzgem.zza(zzaan);
    }
}
