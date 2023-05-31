package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzbfz extends zzbfy implements zzbge {
    @GuardedBy("this")
    private boolean zzehn;
    @GuardedBy("this")
    private boolean zzeig;
    private final zzbfx zzejj;

    public zzbfz(Context context, zzbfx zzbfx) {
        super(context);
        zzq.zzkz().zzvh();
        this.zzejj = zzbfx;
        super.setWebViewClient(zzbfx);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
    }

    /* access modifiers changed from: protected */
    @GuardedBy("this")
    public void zzbe(boolean z) {
    }

    public final synchronized boolean isDestroyed() {
        return this.zzehn;
    }

    public synchronized void destroy() {
        if (!this.zzehn) {
            this.zzehn = true;
            this.zzejj.zza((zzbge) this);
            zzbe(false);
            zzawf.zzee("Initiating WebView self destruct sequence in 3...");
            zzawf.zzee("Loading blank page in WebView, 2...");
            try {
                super.loadUrl("about:blank");
            } catch (UnsatisfiedLinkError e) {
                zzq.zzkz().zza(e, "AdWebViewImpl.loadUrlUnsafe");
                zzawf.zze("#007 Could not call remote method.", e);
            }
        }
    }

    public final synchronized void zza(zzbga zzbga) {
        zzawf.zzee("Blank page loaded, 1...");
        zzaal();
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public synchronized void zzaal() {
        zzawf.zzee("Destroying WebView!");
        zzvi();
        zzazq.zzdxo.execute(new zzbgc(this));
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!isDestroyed()) {
                    zzbe(true);
                }
                zzvi();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    private final synchronized void zzvi() {
        if (!this.zzeig) {
            this.zzeig = true;
            zzq.zzkz().zzvi();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isDestroyed()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.ads.zzawf.zzfa(r2)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0012
            r2 = 0
            r3.onReceiveValue(r2)     // Catch:{ all -> 0x0019 }
        L_0x0012:
            monitor-exit(r1)
            return
        L_0x0014:
            super.evaluateJavascript(r2, r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfz.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    public synchronized void loadUrl(String str) {
        if (!isDestroyed()) {
            super.loadUrl(str);
        } else {
            zzawf.zzfa("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadData(String str, String str2, String str3) {
        if (!isDestroyed()) {
            super.loadData(str, str2, str3);
        } else {
            zzawf.zzfa("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!isDestroyed()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            zzawf.zzfa("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !isDestroyed() && super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public void onDraw(Canvas canvas) {
        if (!isDestroyed()) {
            super.onDraw(canvas);
        }
    }

    public void onPause() {
        if (!isDestroyed()) {
            super.onPause();
        }
    }

    public void onResume() {
        if (!isDestroyed()) {
            super.onResume();
        }
    }

    public void stopLoading() {
        if (!isDestroyed()) {
            super.stopLoading();
        }
    }

    public /* bridge */ /* synthetic */ void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
    }

    public /* bridge */ /* synthetic */ void zzcz(String str) {
        super.zzcz(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzacc() {
        super.destroy();
    }
}
