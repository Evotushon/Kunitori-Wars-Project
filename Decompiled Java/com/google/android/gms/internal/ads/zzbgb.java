package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbgb {
    @GuardedBy("InvokeJavascriptWorkaround.class")
    @VisibleForTesting
    private static Boolean zzejk;

    private zzbgb() {
    }

    @TargetApi(19)
    private static boolean zzb(WebView webView) {
        boolean booleanValue;
        synchronized (zzbgb.class) {
            if (zzejk == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", (ValueCallback) null);
                    zzejk = true;
                } catch (IllegalStateException unused) {
                    zzejk = false;
                }
            }
            booleanValue = zzejk.booleanValue();
        }
        return booleanValue;
    }

    @TargetApi(19)
    static void zza(WebView webView, String str) {
        if (!PlatformVersion.isAtLeastKitKat() || !zzb(webView)) {
            String valueOf = String.valueOf(str);
            webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        webView.evaluateJavascript(str, (ValueCallback) null);
    }
}
