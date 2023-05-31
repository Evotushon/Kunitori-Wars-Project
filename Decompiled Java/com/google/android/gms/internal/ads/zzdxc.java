package com.google.android.gms.internal.ads;

import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-ads-base@@19.0.1 */
final class zzdxc extends zzdwz {
    zzdxc() {
    }

    public final void zza(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }

    public final void zza(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }
}
