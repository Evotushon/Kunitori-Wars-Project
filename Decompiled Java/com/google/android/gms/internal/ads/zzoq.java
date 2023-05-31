package com.google.android.gms.internal.ads;

import android.os.Trace;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzoq {
    public static void beginSection(String str) {
        if (zzop.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void endSection() {
        if (zzop.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
