package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdxk {
    private static final Class<?> zzhnw = zzhh("libcore.io.Memory");
    private static final boolean zzhnx = (zzhh("org.robolectric.Robolectric") != null);

    static boolean zzbap() {
        return zzhnw != null && !zzhnx;
    }

    static Class<?> zzbaq() {
        return zzhnw;
    }

    private static <T> Class<T> zzhh(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
