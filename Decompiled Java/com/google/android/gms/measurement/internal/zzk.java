package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzw;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.6.0 */
final class zzk implements Runnable {
    private final /* synthetic */ zzw zza;
    private final /* synthetic */ AppMeasurementDynamiteService zzb;

    zzk(AppMeasurementDynamiteService appMeasurementDynamiteService, zzw zzw) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzw;
    }

    public final void run() {
        this.zzb.zza.zzh().zza(this.zza, this.zzb.zza.zzz());
    }
}
