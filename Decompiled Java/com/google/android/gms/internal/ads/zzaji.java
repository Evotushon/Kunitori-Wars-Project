package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzaji implements zzafz<zzajy> {
    private final /* synthetic */ zzdq zzdaw;
    private final /* synthetic */ zzair zzdax;
    private final /* synthetic */ zzayq zzday;
    private final /* synthetic */ zzaja zzdaz;

    zzaji(zzaja zzaja, zzdq zzdq, zzair zzair, zzayq zzayq) {
        this.zzdaz = zzaja;
        this.zzdaw = zzdq;
        this.zzdax = zzair;
        this.zzday = zzayq;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzajy zzajy = (zzajy) obj;
        synchronized (this.zzdaz.lock) {
            zzawf.zzez("JS Engine is requesting an update");
            if (this.zzdaz.status == 0) {
                zzawf.zzez("Starting reload.");
                int unused = this.zzdaz.status = 2;
                this.zzdaz.zza(this.zzdaw);
            }
            this.zzdax.zzb("/requestReload", (zzafz) this.zzday.get());
        }
    }
}
