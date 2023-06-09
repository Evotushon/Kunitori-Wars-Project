package com.google.android.gms.internal.gtm;

import java.io.PrintStream;
import java.util.List;

final class zzpj extends zzpg {
    private final zzph zzavo = new zzph();

    zzpj() {
    }

    public final void zza(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
        List<Throwable> zza = this.zzavo.zza(th, false);
        if (zza != null) {
            synchronized (zza) {
                for (Throwable printStackTrace : zza) {
                    printStream.print("Suppressed: ");
                    printStackTrace.printStackTrace(printStream);
                }
            }
        }
    }
}
