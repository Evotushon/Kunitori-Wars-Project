package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zzawf;
import com.google.android.gms.internal.ads.zzawo;
import com.google.android.gms.internal.ads.zzvh;
import com.google.android.gms.internal.ads.zzzx;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zza {
    public static boolean zza(Context context, zzb zzb, zzv zzv) {
        int i = 0;
        if (zzb == null) {
            zzawf.zzfa("No intent data for launcher overlay.");
            return false;
        }
        zzzx.initialize(context);
        if (zzb.intent != null) {
            return zza(context, zzb.intent, zzv);
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(zzb.url)) {
            zzawf.zzfa("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzb.mimeType)) {
            intent.setDataAndType(Uri.parse(zzb.url), zzb.mimeType);
        } else {
            intent.setData(Uri.parse(zzb.url));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzb.packageName)) {
            intent.setPackage(zzb.packageName);
        }
        if (!TextUtils.isEmpty(zzb.zzdhq)) {
            String[] split = zzb.zzdhq.split("/", 2);
            if (split.length < 2) {
                String valueOf = String.valueOf(zzb.zzdhq);
                zzawf.zzfa(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                return false;
            }
            intent.setClassName(split[0], split[1]);
        }
        String str = zzb.zzdhr;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                zzawf.zzfa("Could not parse intent flags.");
            }
            intent.addFlags(i);
        }
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcoh)).booleanValue()) {
            intent.addFlags(268435456);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcog)).booleanValue()) {
                zzq.zzkv();
                zzawo.zzb(context, intent);
            }
        }
        return zza(context, intent, zzv);
    }

    private static boolean zza(Context context, Intent intent, zzv zzv) {
        try {
            String valueOf = String.valueOf(intent.toURI());
            zzawf.zzee(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            zzq.zzkv();
            zzawo.zza(context, intent);
            if (zzv == null) {
                return true;
            }
            zzv.zzub();
            return true;
        } catch (ActivityNotFoundException e) {
            zzawf.zzfa(e.getMessage());
            return false;
        }
    }
}
