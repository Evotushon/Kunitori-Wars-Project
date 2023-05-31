package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdor<V> implements Runnable {
    @NullableDecl
    private zzdop<V> zzhdp;

    zzdor(zzdop<V> zzdop) {
        this.zzhdp = zzdop;
    }

    public final void run() {
        zzdof zza;
        String str;
        zzdop<V> zzdop = this.zzhdp;
        if (zzdop != null && (zza = zzdop.zzhdn) != null) {
            this.zzhdp = null;
            if (zza.isDone()) {
                zzdop.setFuture(zza);
                return;
            }
            try {
                ScheduledFuture zzb = zzdop.zzhdo;
                ScheduledFuture unused = zzdop.zzhdo = null;
                str = "Timed out";
                if (zzb != null) {
                    long abs = Math.abs(zzb.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        StringBuilder sb = new StringBuilder(str.length() + 66);
                        sb.append(str);
                        sb.append(" (timeout delayed by ");
                        sb.append(abs);
                        sb.append(" ms after scheduled time)");
                        str = sb.toString();
                    }
                }
                String valueOf = String.valueOf(str);
                String valueOf2 = String.valueOf(zza);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
                sb2.append(valueOf);
                sb2.append(": ");
                sb2.append(valueOf2);
                zzdop.setException(new zzdoq(sb2.toString()));
                zza.cancel(true);
            } catch (Throwable th) {
                zza.cancel(true);
                throw th;
            }
        }
    }
}
