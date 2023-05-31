package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcpf implements zzdnu<T> {
    private final /* synthetic */ String zzgdc;
    private final /* synthetic */ long zzgdd;
    private final /* synthetic */ zzcpc zzgde;

    zzcpf(zzcpc zzcpc, String str, long j) {
        this.zzgde = zzcpc;
        this.zzgdc = str;
        this.zzgdd = j;
    }

    public final void onSuccess(T t) {
        this.zzgde.zza(this.zzgdc, 0, this.zzgde.zzbmz.elapsedRealtime() - this.zzgdd);
    }

    public final void zzb(Throwable th) {
        long elapsedRealtime = this.zzgde.zzbmz.elapsedRealtime();
        int i = 3;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (!(th instanceof zzcos)) {
            i = th instanceof CancellationException ? 4 : (!(th instanceof zzcid) || ((zzcid) th).getErrorCode() != 3) ? 6 : 1;
        }
        this.zzgde.zza(this.zzgdc, i, elapsedRealtime - this.zzgdd);
    }
}
