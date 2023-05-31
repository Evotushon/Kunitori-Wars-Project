package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzawf;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzk extends WebViewClient {
    private final /* synthetic */ zzl zzblt;

    zzk(zzl zzl) {
        this.zzblt = zzl;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.zzblt.zzkk())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            if (this.zzblt.zzblz != null) {
                try {
                    this.zzblt.zzblz.onAdFailedToLoad(3);
                } catch (RemoteException e) {
                    zzawf.zze("#007 Could not call remote method.", e);
                }
            }
            this.zzblt.zzbm(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            if (this.zzblt.zzblz != null) {
                try {
                    this.zzblt.zzblz.onAdFailedToLoad(0);
                } catch (RemoteException e2) {
                    zzawf.zze("#007 Could not call remote method.", e2);
                }
            }
            this.zzblt.zzbm(0);
            return true;
        } else if (str.startsWith("gmsg://adResized")) {
            if (this.zzblt.zzblz != null) {
                try {
                    this.zzblt.zzblz.onAdLoaded();
                } catch (RemoteException e3) {
                    zzawf.zze("#007 Could not call remote method.", e3);
                }
            }
            this.zzblt.zzbm(this.zzblt.zzbt(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            if (this.zzblt.zzblz != null) {
                try {
                    this.zzblt.zzblz.onAdLeftApplication();
                } catch (RemoteException e4) {
                    zzawf.zze("#007 Could not call remote method.", e4);
                }
            }
            this.zzblt.zzbv(this.zzblt.zzbu(str));
            return true;
        }
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.zzblt.zzblz != null) {
            try {
                this.zzblt.zzblz.onAdFailedToLoad(0);
            } catch (RemoteException e) {
                zzawf.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
