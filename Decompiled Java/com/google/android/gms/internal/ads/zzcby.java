package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcby {
    private final Executor zzfeo;
    private final zzbuu zzfnj;
    private final zzbkk zzfsz;

    zzcby(Executor executor, zzbkk zzbkk, zzbuu zzbuu) {
        this.zzfeo = executor;
        this.zzfnj = zzbuu;
        this.zzfsz = zzbkk;
    }

    public final void zzl(zzbdv zzbdv) {
        if (zzbdv != null) {
            this.zzfnj.zzq(zzbdv.getView());
            this.zzfnj.zza(new zzccb(zzbdv), this.zzfeo);
            this.zzfnj.zza(new zzcca(zzbdv), this.zzfeo);
            this.zzfnj.zza(this.zzfsz, this.zzfeo);
            this.zzfsz.zzg(zzbdv);
            zzbdv.zza("/trackActiveViewUnit", (zzafz<? super zzbdv>) new zzccd(this));
            zzbdv.zza("/untrackActiveViewUnit", (zzafz<? super zzbdv>) new zzccc(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzbdv zzbdv, Map map) {
        this.zzfsz.disable();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzbdv zzbdv, Map map) {
        this.zzfsz.enable();
    }
}
