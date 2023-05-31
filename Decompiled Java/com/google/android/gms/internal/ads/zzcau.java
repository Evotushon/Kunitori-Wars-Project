package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcau implements zzeej<zzbuv<VideoController.VideoLifecycleCallbacks>> {
    private final zzeew<zzcdj> zzffc;
    private final zzeew<Executor> zzfgm;
    private final zzcao zzfrq;

    public zzcau(zzcao zzcao, zzeew<zzcdj> zzeew, zzeew<Executor> zzeew2) {
        this.zzfrq = zzcao;
        this.zzffc = zzeew;
        this.zzfgm = zzeew2;
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzffc.get(), this.zzfgm.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
