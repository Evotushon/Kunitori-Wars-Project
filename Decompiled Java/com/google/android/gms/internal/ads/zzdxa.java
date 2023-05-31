package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-base@@19.0.1 */
final class zzdxa extends zzdwz {
    private final zzdwy zzhnn = new zzdwy();

    zzdxa() {
    }

    public final void zza(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.zzhnn.zza(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }

    public final void zza(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> zza = this.zzhnn.zza(th, false);
        if (zza != null) {
            synchronized (zza) {
                for (Throwable printStackTrace : zza) {
                    printWriter.print("Suppressed: ");
                    printStackTrace.printStackTrace(printWriter);
                }
            }
        }
    }
}
