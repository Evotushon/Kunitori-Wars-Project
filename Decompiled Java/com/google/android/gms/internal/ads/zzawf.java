package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.ads.AdRequest;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzawf extends zzazh {
    public static void zzee(String str) {
        if (zzvx()) {
            Log.v(AdRequest.LOGTAG, str);
        }
    }

    public static void zza(String str, Throwable th) {
        if (zzvx()) {
            Log.v(AdRequest.LOGTAG, str, th);
        }
    }

    public static boolean zzvx() {
        return isLoggable(2) && zzabi.zzcuw.get().booleanValue();
    }
}
