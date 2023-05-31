package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzoi {
    public static boolean zzbi(String str) {
        return "audio".equals(zzbk(str));
    }

    public static boolean zzbj(String str) {
        return "video".equals(zzbk(str));
    }

    private static String zzbk(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid mime type: ".concat(valueOf) : new String("Invalid mime type: "));
    }
}
