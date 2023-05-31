package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import com.adjust.sdk.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbvt implements zzrp {
    private zzdkq zzflt;

    public final void zza(Activity activity, WebView webView) {
        try {
            this.zzflt = new zzdkq(activity, webView);
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
            sb.append(" Failed to initialize the internal ArWebView: ");
            sb.append(valueOf);
            zzawf.zzey(sb.toString());
        }
    }

    public final void zzc(String str, String str2) {
        if (this.zzflt == null) {
            zzawf.zzey("ArWebView is not initialized.");
        } else {
            zzdkq.getWebView().loadDataWithBaseURL(str, str2, "text/html", Constants.ENCODING, (String) null);
        }
    }

    public final WebView getWebView() {
        if (this.zzflt == null) {
            return null;
        }
        return zzdkq.getWebView();
    }

    public final View getView() {
        return this.zzflt;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.zzflt != null) {
            zzdkq.onPageStarted(webView, str, bitmap);
        }
    }
}
