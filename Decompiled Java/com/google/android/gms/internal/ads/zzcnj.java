package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcnj implements zzeej<zzcnf> {
    private final zzeew<zzbmc> zzezl;
    private final zzeew<zzcml> zzezp;
    private final zzeew<zzdoe> zzfev;
    private final zzeew<ScheduledExecutorService> zzfst;
    private final zzeew<zzbqk> zzgcc;

    public zzcnj(zzeew<zzbmc> zzeew, zzeew<zzcml> zzeew2, zzeew<zzbqk> zzeew3, zzeew<ScheduledExecutorService> zzeew4, zzeew<zzdoe> zzeew5) {
        this.zzezl = zzeew;
        this.zzezp = zzeew2;
        this.zzgcc = zzeew3;
        this.zzfst = zzeew4;
        this.zzfev = zzeew5;
    }

    public final /* synthetic */ Object get() {
        return new zzcnf(this.zzezl.get(), this.zzezp.get(), this.zzgcc.get(), this.zzfst.get(), this.zzfev.get());
    }
}
