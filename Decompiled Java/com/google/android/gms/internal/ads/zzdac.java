package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdac implements zzeej<zzdaa> {
    private final zzeew<zzalb> zzevg;
    private final zzeew<ScheduledExecutorService> zzfst;
    private final zzeew<ApplicationInfo> zzfxt;
    private final zzeew<Boolean> zzglz;

    public zzdac(zzeew<zzalb> zzeew, zzeew<ScheduledExecutorService> zzeew2, zzeew<Boolean> zzeew3, zzeew<ApplicationInfo> zzeew4) {
        this.zzevg = zzeew;
        this.zzfst = zzeew2;
        this.zzglz = zzeew3;
        this.zzfxt = zzeew4;
    }

    public final /* synthetic */ Object get() {
        return new zzdaa(this.zzevg.get(), this.zzfst.get(), this.zzglz.get().booleanValue(), this.zzfxt.get());
    }
}
