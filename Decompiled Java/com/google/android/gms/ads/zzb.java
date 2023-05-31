package com.google.android.gms.ads;

import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzb {
    public static AdSize zza(int i, int i2, String str) {
        return new AdSize(i, i2, str);
    }

    public static AdSize zza(int i, int i2) {
        AdSize adSize = new AdSize(i, 0);
        adSize.zzc(true);
        adSize.zzl(i2);
        return adSize;
    }

    public static boolean zza(AdSize adSize) {
        return adSize.zzdm();
    }

    public static boolean zzb(AdSize adSize) {
        return adSize.zzdn();
    }

    public static int zzc(AdSize adSize) {
        return adSize.zzdo();
    }
}
