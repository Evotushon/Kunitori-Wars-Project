package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.zzq;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcic {
    private final zzdoe zzfrv;
    private final zzdoe zzfxl;
    private final zzcjg zzfxm;
    private final zzeed<zzckh> zzfxn;

    public zzcic(zzdoe zzdoe, zzdoe zzdoe2, zzcjg zzcjg, zzeed<zzckh> zzeed) {
        this.zzfxl = zzdoe;
        this.zzfrv = zzdoe2;
        this.zzfxm = zzcjg;
        this.zzfxn = zzeed;
    }

    public final zzdof<InputStream> zze(zzaqx zzaqx) {
        zzdof<V> zzdof;
        String str = zzaqx.packageName;
        zzq.zzkv();
        if (zzawo.zzen(str)) {
            zzdof = zzdnt.immediateFailedFuture(new zzcjv(0));
        } else {
            zzdof = zzdnt.zzb(this.zzfxl.zzd(new zzcif(this, zzaqx)), ExecutionException.class, zzcie.zzblf, this.zzfrv);
        }
        return zzdnt.zzb(zzdof, zzcjv.class, new zzcih(this, zzaqx, Binder.getCallingUid()), this.zzfrv);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zza(zzaqx zzaqx, int i, zzcjv zzcjv) throws Exception {
        return this.zzfxn.get().zzb(zzaqx, i);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzf(zzaqx zzaqx) throws Exception {
        return (InputStream) this.zzfxm.zzg(zzaqx).get((long) ((Integer) zzvh.zzpd().zzd(zzzx.zzcpu)).intValue(), TimeUnit.SECONDS);
    }
}
