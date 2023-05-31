package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.6.0 */
final /* synthetic */ class zzkb implements Runnable {
    private final zzjy zza;

    zzkb(zzjy zzjy) {
        this.zza = zzjy;
    }

    public final void run() {
        zzjy zzjy = this.zza;
        zzjz zzjz = zzjy.zzc;
        long j = zzjy.zza;
        long j2 = zzjy.zzb;
        zzjz.zza.zzc();
        zzjz.zza.zzq().zzv().zza("Application going to the background");
        boolean z = true;
        if (zzjz.zza.zzs().zza(zzat.zzbu)) {
            zzjz.zza.zzr().zzr.zza(true);
        }
        Bundle bundle = new Bundle();
        if (!zzjz.zza.zzs().zzh().booleanValue()) {
            zzjz.zza.zzb.zzb(j2);
            if (zzjz.zza.zzs().zza(zzat.zzbl)) {
                bundle.putLong("_et", zzjz.zza.zza(j2));
                zzij.zza(zzjz.zza.zzh().zza(true), bundle, true);
            } else {
                z = false;
            }
            zzjz.zza.zza(false, z, j2);
        }
        zzjz.zza.zze().zza("auto", "_ab", j, bundle);
    }
}
