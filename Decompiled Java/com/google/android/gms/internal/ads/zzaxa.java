package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.zzq;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzaxa extends zzawx {
    public final int zzww() {
        return 16974374;
    }

    public final CookieManager zzbg(Context context) {
        if (zzwv()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzawf.zzc("Failed to obtain CookieManager.", th);
            zzq.zzkz().zza(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public final zzbdy zza(zzbdv zzbdv, zzsn zzsn, boolean z) {
        return new zzbez(zzbdv, zzsn, z);
    }

    public final WebResourceResponse zza(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }
}
