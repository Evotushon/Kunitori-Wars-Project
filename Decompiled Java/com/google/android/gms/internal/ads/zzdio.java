package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdio implements zzeej<zzdif> {
    private final zzeew<zzdii> zzerz;
    private final zzeew<zzdoe> zzfev;
    private final zzeew<ScheduledExecutorService> zzfgc;

    private zzdio(zzeew<zzdoe> zzeew, zzeew<ScheduledExecutorService> zzeew2, zzeew<zzdii> zzeew3) {
        this.zzfev = zzeew;
        this.zzfgc = zzeew2;
        this.zzerz = zzeew3;
    }

    public static zzdio zzs(zzeew<zzdoe> zzeew, zzeew<ScheduledExecutorService> zzeew2, zzeew<zzdii> zzeew3) {
        return new zzdio(zzeew, zzeew2, zzeew3);
    }

    public final /* synthetic */ Object get() {
        return new zzdif(this.zzfev.get(), this.zzfgc.get(), this.zzerz.get());
    }
}
