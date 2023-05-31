package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzq;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbfr {
    public static zzbdv zza(Context context, zzbfl zzbfl, String str, boolean z, boolean z2, @Nullable zzdq zzdq, zzazo zzazo, zzaak zzaak, zzi zzi, zza zza, zzsn zzsn, zzrp zzrp, boolean z3) throws zzbei {
        try {
            return (zzbdv) zzayp.zza(new zzbfu(context, zzbfl, str, z, z2, zzdq, zzazo, (zzaak) null, zzi, zza, zzsn, zzrp, z3));
        } catch (Throwable th) {
            zzq.zzkz().zza(th, "AdWebViewFactory.newAdWebView2");
            throw new zzbei("Webview initialization failed.", th);
        }
    }
}
