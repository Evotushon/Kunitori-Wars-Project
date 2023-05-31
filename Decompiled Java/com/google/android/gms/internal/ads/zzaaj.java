package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzaaj extends zzaae {
    zzaaj() {
    }

    public final String zzg(@Nullable String str, String str2) {
        String zzct = zzct(str);
        String zzct2 = zzct(str2);
        if (TextUtils.isEmpty(zzct)) {
            return zzct2;
        }
        if (TextUtils.isEmpty(zzct2)) {
            return zzct;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(zzct).length() + 1 + String.valueOf(zzct2).length());
        sb.append(zzct);
        sb.append(",");
        sb.append(zzct2);
        return sb.toString();
    }

    @Nullable
    private static String zzct(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = 0;
        int length = str.length();
        while (i < str.length() && str.charAt(i) == ',') {
            i++;
        }
        while (length > 0 && str.charAt(length - 1) == ',') {
            length--;
        }
        if (length < i) {
            return null;
        }
        if (i == 0 && length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }
}
