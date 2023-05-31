package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaux {
    public static String zzb(String str, Context context, boolean z) {
        String zzai;
        if ((((Boolean) zzvh.zzpd().zzd(zzzx.zzcjd)).booleanValue() && !z) || !zzq.zzlt().zzad(context) || TextUtils.isEmpty(str) || (zzai = zzq.zzlt().zzai(context)) == null) {
            return str;
        }
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzciv)).booleanValue()) {
            String str2 = (String) zzvh.zzpd().zzd(zzzx.zzciw);
            if (!str.contains(str2)) {
                return str;
            }
            if (zzq.zzkv().zzel(str)) {
                zzq.zzlt().zzh(context, zzai);
                return str.replace(str2, zzai);
            } else if (!zzq.zzkv().zzem(str)) {
                return str;
            } else {
                zzq.zzlt().zzi(context, zzai);
                return str.replace(str2, zzai);
            }
        } else if (str.contains("fbs_aeid")) {
            return str;
        } else {
            if (zzq.zzkv().zzel(str)) {
                zzq.zzlt().zzh(context, zzai);
                return zza(str, "fbs_aeid", zzai).toString();
            } else if (!zzq.zzkv().zzem(str)) {
                return str;
            } else {
                zzq.zzlt().zzi(context, zzai);
                return zza(str, "fbs_aeid", zzai).toString();
            }
        }
    }

    public static String zzb(Uri uri, Context context) {
        if (!zzq.zzlt().zzad(context)) {
            return uri.toString();
        }
        String zzai = zzq.zzlt().zzai(context);
        if (zzai == null) {
            return uri.toString();
        }
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzciv)).booleanValue()) {
            String str = (String) zzvh.zzpd().zzd(zzzx.zzciw);
            String uri2 = uri.toString();
            if (uri2.contains(str)) {
                zzq.zzlt().zzh(context, zzai);
                return uri2.replace(str, zzai);
            }
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            uri = zza(uri.toString(), "fbs_aeid", zzai);
            zzq.zzlt().zzh(context, zzai);
        }
        return uri.toString();
    }

    @VisibleForTesting
    private static Uri zza(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }
}
