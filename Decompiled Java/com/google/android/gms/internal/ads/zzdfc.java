package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdfc {
    public static void zzc(Throwable th, String str) {
        int zzd = zzcid.zzd(th);
        StringBuilder sb = new StringBuilder(31);
        sb.append("Ad failed to load : ");
        sb.append(zzd);
        zzawf.zzez(sb.toString());
        zzawf.zza(str, th);
        if (zzcid.zzd(th) != 3) {
            zzq.zzkz().zzb(th, str);
        }
    }

    public static void zze(Context context, boolean z) {
        if (z) {
            zzawf.zzez("This request is sent from a test device.");
            return;
        }
        zzvh.zzoz();
        String zzbl = zzayx.zzbl(context);
        StringBuilder sb = new StringBuilder(String.valueOf(zzbl).length() + 101);
        sb.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb.append(zzbl);
        sb.append("\") to get test ads on this device.");
        zzawf.zzez(sb.toString());
    }
}
