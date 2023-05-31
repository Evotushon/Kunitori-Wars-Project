package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.zzq;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcju {
    private final zzdoe zzfrv;
    private final zzeed<zzckh> zzfxn;
    private final zzcjp zzfyv;

    public zzcju(zzdoe zzdoe, zzcjp zzcjp, zzeed<zzckh> zzeed) {
        this.zzfrv = zzdoe;
        this.zzfyv = zzcjp;
        this.zzfxn = zzeed;
    }

    private final <RetT> zzdof<RetT> zza(zzaqx zzaqx, zzckf<InputStream> zzckf, zzckf<InputStream> zzckf2, zzdng<InputStream, RetT> zzdng) {
        zzdof<V> zzdof;
        String str = zzaqx.packageName;
        zzq.zzkv();
        if (zzawo.zzen(str)) {
            zzdof = zzdnt.immediateFailedFuture(new zzcjv(0));
        } else {
            zzdof = zzdnt.zzb(zzckf.zzo(zzaqx), ExecutionException.class, zzcjx.zzblf, this.zzfrv);
        }
        return (zzdno) zzdnt.zzb(zzdno.zzg(zzdof).zzb(zzdng, this.zzfrv), zzcjv.class, new zzcjw(this, zzckf2, zzaqx, zzdng), this.zzfrv);
    }

    public final zzdof<zzaqx> zzj(zzaqx zzaqx) {
        zzcjz zzcjz = new zzcjz(zzaqx);
        zzcjp zzcjp = this.zzfyv;
        zzcjp.getClass();
        return zza(zzaqx, (zzckf<InputStream>) zzcjy.zza(zzcjp), (zzckf<InputStream>) new zzckb(this), zzcjz);
    }

    public final zzdof<Void> zzk(zzaqx zzaqx) {
        if (zzep.zzav(zzaqx.zzdnd)) {
            return zzdnt.immediateFailedFuture(new zzcke("Pool key missing from removeUrl call.", 1));
        }
        return zza(zzaqx, (zzckf<InputStream>) new zzckd(this), (zzckf<InputStream>) new zzckc(this), zzcka.zzblf);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zzl(zzaqx zzaqx) {
        return this.zzfxn.get().zzgi(zzaqx.zzdnd);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zzm(zzaqx zzaqx) {
        return this.zzfyv.zzgh(zzaqx.zzdnd);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zzn(zzaqx zzaqx) {
        return this.zzfxn.get().zzc(zzaqx, Binder.getCallingUid());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zza(zzckf zzckf, zzaqx zzaqx, zzdng zzdng, zzcjv zzcjv) throws Exception {
        return zzdnt.zzb(zzckf.zzo(zzaqx), zzdng, (Executor) this.zzfrv);
    }
}
