package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;

@TargetApi(21)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbez extends zzbfa {
    public zzbez(zzbdv zzbdv, zzsn zzsn, boolean z) {
        super(zzbdv, zzsn, z);
    }

    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zza(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
