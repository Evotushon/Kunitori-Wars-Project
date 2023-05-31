package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzzz {
    public static boolean zzcq(String str) {
        return zzf((String) zzvh.zzpd().zzd(zzzx.zzcpk), str);
    }

    private static boolean zzf(String str, String str2) {
        if (!(str == null || str2 == null)) {
            try {
                return Pattern.matches(str, str2);
            } catch (RuntimeException e) {
                zzq.zzkz().zza(e, "NonagonUtil.isPatternMatched");
            }
        }
        return false;
    }
}
