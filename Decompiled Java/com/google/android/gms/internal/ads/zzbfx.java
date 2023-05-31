package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzbfx extends WebViewClient {
    private static final String[] zzejg = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
    private static final String[] zzejh = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};
    private zzbge zzeji;

    public void zza(zzbga zzbga) {
    }

    public void zzb(zzbga zzbga) {
    }

    public boolean zzc(zzbga zzbga) {
        return false;
    }

    @Nullable
    public WebResourceResponse zzd(zzbga zzbga) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzbge zzbge) {
        this.zzeji = zzbge;
    }

    public final void onPageFinished(WebView webView, String str) {
        if (str != null) {
            zzbga zzbga = new zzbga(str);
            zzbge zzbge = this.zzeji;
            if (zzbge != null) {
                zzbge.zza(zzbga);
            } else {
                zza(zzbga);
            }
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        if (str != null) {
            String valueOf = String.valueOf(str);
            zzawf.zzee(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
            zzb(new zzbga(str));
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        return zzc(new zzbga(str));
    }

    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return false;
        }
        return zzc(new zzbga(webResourceRequest));
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str == null) {
            return null;
        }
        return zzd(new zzbga(str));
    }

    @TargetApi(24)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzd(new zzbga(webResourceRequest));
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (i >= 0 || (-i) - 1 >= zzejg.length) {
            String.valueOf(i);
        }
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            if (primaryError < 0 || primaryError >= zzejh.length) {
                String.valueOf(primaryError);
            }
            sslError.getUrl();
        }
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
