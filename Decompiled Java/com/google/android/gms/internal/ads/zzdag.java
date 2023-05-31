package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdag implements zzeej<zzdae> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzapj> zzevg;
    private final zzeew<ScheduledExecutorService> zzfst;

    public zzdag(zzeew<zzapj> zzeew, zzeew<ScheduledExecutorService> zzeew2, zzeew<Context> zzeew3) {
        this.zzevg = zzeew;
        this.zzfst = zzeew2;
        this.zzelc = zzeew3;
    }

    public final /* synthetic */ Object get() {
        return new zzdae(this.zzevg.get(), this.zzfst.get(), this.zzelc.get());
    }
}
