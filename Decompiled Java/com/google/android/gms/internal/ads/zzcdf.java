package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcdf implements Callable<zzccv> {
    /* access modifiers changed from: private */
    public final zzbee zzbms;
    /* access modifiers changed from: private */
    public final zzazo zzdjo;
    /* access modifiers changed from: private */
    public final zzdq zzehb;
    /* access modifiers changed from: private */
    public final Executor zzfeo;
    /* access modifiers changed from: private */
    public final zza zzfsj;
    /* access modifiers changed from: private */
    public final Context zzur;

    public zzcdf(Context context, Executor executor, zzdq zzdq, zzazo zzazo, zza zza, zzbee zzbee) {
        this.zzur = context;
        this.zzfeo = executor;
        this.zzehb = zzdq;
        this.zzdjo = zzazo;
        this.zzfsj = zza;
        this.zzbms = zzbee;
    }

    public final /* synthetic */ Object call() throws Exception {
        zzccv zzccv = new zzccv(this);
        zzccv.zzalx();
        return zzccv;
    }
}
