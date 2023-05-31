package com.google.android.gms.internal.ads;

import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdlc {
    private static final Logger logger = Logger.getLogger(zzdlc.class.getName());
    private static final zzdld zzgyu = new zza();

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    static final class zza {
        private zza() {
        }
    }

    private zzdlc() {
    }

    static String emptyToNull(@NullableDecl String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return str;
    }
}
