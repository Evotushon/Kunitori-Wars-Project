package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.6.0 */
final class zzjy implements Runnable {
    long zza;
    long zzb;
    final /* synthetic */ zzjz zzc;

    zzjy(zzjz zzjz, long j, long j2) {
        this.zzc = zzjz;
        this.zza = j;
        this.zzb = j2;
    }

    public final void run() {
        this.zzc.zza.zzp().zza((Runnable) new zzkb(this));
    }
}
