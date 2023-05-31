package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcsb extends zzvt {
    private zzvk zzblz;
    private final zzbgk zzgcx;
    private final Context zzgfp;
    @VisibleForTesting
    private final zzdew zzgfq = new zzdew();
    @VisibleForTesting
    private final zzbzi zzgfr = new zzbzi();

    public zzcsb(zzbgk zzbgk, Context context, String str) {
        this.zzgcx = zzbgk;
        this.zzgfq.zzgn(str);
        this.zzgfp = context;
    }

    public final zzvp zzpi() {
        zzbzg zzala = this.zzgfr.zzala();
        this.zzgfq.zzb(zzala.zzaky());
        this.zzgfq.zzc(zzala.zzakz());
        zzdew zzdew = this.zzgfq;
        if (zzdew.zzke() == null) {
            zzdew.zzd(zzuk.zzh(this.zzgfp));
        }
        return new zzcsa(this.zzgfp, this.zzgcx, this.zzgfq, zzala, this.zzblz);
    }

    public final void zzb(zzvk zzvk) {
        this.zzblz = zzvk;
    }

    public final void zza(zzadr zzadr) {
        this.zzgfr.zzb(zzadr);
    }

    public final void zza(zzaeg zzaeg) {
        this.zzgfr.zzb(zzaeg);
    }

    public final void zza(zzads zzads) {
        this.zzgfr.zzb(zzads);
    }

    public final void zza(String str, zzady zzady, zzadx zzadx) {
        this.zzgfr.zzb(str, zzady, zzadx);
    }

    public final void zza(zzach zzach) {
        this.zzgfq.zzb(zzach);
    }

    public final void zza(zzahl zzahl) {
        this.zzgfq.zzb(zzahl);
    }

    public final void zza(zzaht zzaht) {
        this.zzgfr.zzb(zzaht);
    }

    public final void zzb(zzwl zzwl) {
        this.zzgfq.zzc(zzwl);
    }

    public final void zza(zzaef zzaef, zzuk zzuk) {
        this.zzgfr.zza(zzaef);
        this.zzgfq.zzd(zzuk);
    }

    public final void zza(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzgfq.zzb(publisherAdViewOptions);
    }
}
