package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

@TargetApi(11)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbex extends zzbfa {
    public zzbex(zzbdv zzbdv, zzsn zzsn, boolean z) {
        super(zzbdv, zzsn, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zza(webView, str, (Map<String, String>) null);
    }
}
