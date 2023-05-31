package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbod<T> {
    private final Executor executor;
    private final zzciz zzfip;
    private final zzcjc zzfiq;
    private final zzdeu zzfir;
    private final zzdif zzfis;
    private final zzbjg zzfit;
    private final zzcph<T> zzfiu;
    /* access modifiers changed from: private */
    public final zzbsz zzfiv;
    @Nullable
    private final zzdeq zzfiw;
    private final zzcju zzfix;
    private final zzbpm zzfiy;

    zzbod(zzciz zzciz, zzcjc zzcjc, zzdeu zzdeu, zzdif zzdif, zzbjg zzbjg, zzcph<T> zzcph, zzbsz zzbsz, @Nullable zzdeq zzdeq, zzcju zzcju, zzbpm zzbpm, Executor executor2) {
        this.zzfip = zzciz;
        this.zzfiq = zzcjc;
        this.zzfir = zzdeu;
        this.zzfis = zzdif;
        this.zzfit = zzbjg;
        this.zzfiu = zzcph;
        this.zzfiv = zzbsz;
        this.zzfiw = zzdeq;
        this.zzfix = zzcju;
        this.zzfiy = zzbpm;
        this.executor = executor2;
    }

    private final zzdof<zzdeq> zza(zzdof<zzaqx> zzdof) {
        if (this.zzfiw != null) {
            return this.zzfis.zzu(zzdig.SERVER_TRANSACTION).zze(zzdnt.zzaj(this.zzfiw)).zzata();
        }
        zzq.zzlb().zzmt();
        if (this.zzfir.zzgqq.zzcda != null) {
            return this.zzfis.zzu(zzdig.SERVER_TRANSACTION).zze(this.zzfiq.zzanr()).zzata();
        }
        return this.zzfis.zza(zzdig.SERVER_TRANSACTION, zzdof).zza(this.zzfip).zzata();
    }

    public final zzdof<zzdeq> zza(@NonNull zzaqx zzaqx) {
        return zza((zzdof<zzaqx>) zzdnt.zzaj(zzaqx));
    }

    public final zzdof<zzdeq> zzahp() {
        return zza(this.zzfiy.zzaht());
    }

    public final zzdof<T> zzb(zzdof<zzdeq> zzdof) {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcpt)).booleanValue()) {
            return this.zzfis.zza(zzdig.RENDERER, zzdof).zza(this.zzfit).zza(this.zzfiu).zzata();
        }
        return this.zzfis.zza(zzdig.RENDERER, zzdof).zza(this.zzfit).zza(this.zzfiu).zza((long) ((Integer) zzvh.zzpd().zzd(zzzx.zzcpu)).intValue(), TimeUnit.SECONDS).zzata();
    }

    public final zzdof<T> zzb(@NonNull zzaqx zzaqx) {
        return zzb(zza(zzaqx));
    }

    public final zzdof<T> zzahq() {
        return zzb(zzahp());
    }

    public final zzbsz zzahr() {
        return this.zzfiv;
    }

    public final zzdof<zzaqx> zza(zzdgg zzdgg) {
        zzdhs<E, O2> zzata = this.zzfis.zza(zzdig.GET_CACHE_KEY, this.zzfiy.zzaht()).zza(new zzboc(this, zzdgg)).zzata();
        zzdnt.zza(zzata, new zzbof(this), this.executor);
        return zzata;
    }

    public final zzdof<Void> zzc(zzaqx zzaqx) {
        zzdhs<E, I> zzata = this.zzfis.zza(zzdig.NOTIFY_CACHE_HIT, this.zzfix.zzk(zzaqx)).zzata();
        zzdnt.zza(zzata, new zzboe(this), this.executor);
        return zzata;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zza(zzdgg zzdgg, zzaqx zzaqx) throws Exception {
        zzaqx.zzdnc = zzdgg;
        return this.zzfix.zzj(zzaqx);
    }
}
