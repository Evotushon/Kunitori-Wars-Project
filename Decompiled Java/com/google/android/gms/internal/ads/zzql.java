package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzql implements Runnable {
    private ValueCallback<String> zzbqe = new zzqo(this);
    final /* synthetic */ zzqd zzbqf;
    final /* synthetic */ WebView zzbqg;
    final /* synthetic */ boolean zzbqh;
    final /* synthetic */ zzqj zzbqi;

    zzql(zzqj zzqj, zzqd zzqd, WebView webView, boolean z) {
        this.zzbqi = zzqj;
        this.zzbqf = zzqd;
        this.zzbqg = webView;
        this.zzbqh = z;
    }

    public final void run() {
        if (this.zzbqg.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzbqg.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zzbqe);
            } catch (Throwable unused) {
                this.zzbqe.onReceiveValue("");
            }
        }
    }
}
