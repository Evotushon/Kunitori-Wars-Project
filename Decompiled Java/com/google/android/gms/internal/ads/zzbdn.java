package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zze;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.PlatformVersion;

@TargetApi(11)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbdn extends WebChromeClient {
    private final zzbdv zzdae;

    public zzbdn(zzbdv zzbdv) {
        this.zzdae = zzbdv;
    }

    private final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zzc zzaax;
        try {
            if (this.zzdae == null || this.zzdae.zzaaf() == null || this.zzdae.zzaaf().zzaax() == null || (zzaax = this.zzdae.zzaaf().zzaax()) == null || zzaax.zzjv()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(str2);
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str3);
                    EditText editText = new EditText(context);
                    editText.setText(str4);
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    builder.setView(linearLayout).setPositiveButton(17039370, new zzbdt(jsPromptResult, editText)).setNegativeButton(17039360, new zzbdu(jsPromptResult)).setOnCancelListener(new zzbdr(jsPromptResult)).create().show();
                } else {
                    builder.setMessage(str3).setPositiveButton(17039370, new zzbds(jsResult)).setNegativeButton(17039360, new zzbdp(jsResult)).setOnCancelListener(new zzbdq(jsResult)).create().show();
                }
                return true;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            zzaax.zzbr(sb.toString());
            return false;
        } catch (WindowManager.BadTokenException e) {
            zzawf.zzd("Fail to display Dialog.", e);
        }
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.zzdae.zzaag() != null) {
            webView2.setWebViewClient(this.zzdae.zzaag());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzbdv)) {
            zzawf.zzfa("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        zze zzaab = ((zzbdv) webView).zzaab();
        if (zzaab == null) {
            zzawf.zzfa("Tried to close an AdWebView not associated with an overlay.");
        } else {
            zzaab.close();
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = zzbdw.zzefj[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            zzawf.zzey(sb2);
        } else if (i == 2) {
            zzawf.zzfa(sb2);
        } else if (i == 3 || i == 4) {
            zzawf.zzez(sb2);
        } else if (i != 5) {
            zzawf.zzez(sb2);
        } else {
            zzawf.zzeb(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min(131072, j4), 1048576);
            } else if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > 1048576) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onHideCustomView() {
        zze zzaab = this.zzdae.zzaab();
        if (zzaab == null) {
            zzawf.zzfa("Could not get ad overlay when hiding custom view.");
        } else {
            zzaab.zztp();
        }
    }

    private static Context zza(WebView webView) {
        if (!(webView instanceof zzbdv)) {
            return webView.getContext();
        }
        zzbdv zzbdv = (zzbdv) webView;
        Activity zzys = zzbdv.zzys();
        if (zzys != null) {
            return zzys;
        }
        return zzbdv.getContext();
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "alert", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "onBeforeUnload", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "confirm", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zza(webView), "prompt", str, str2, str3, (JsResult) null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = j + 131072;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }

    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        zze zzaab = this.zzdae.zzaab();
        if (zzaab == null) {
            zzawf.zzfa("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        zzaab.zza(view, customViewCallback);
        zzaab.setRequestedOrientation(i);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            zzq.zzkv();
            if (!zzawo.zzq(this.zzdae.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzq.zzkv();
                if (!zzawo.zzq(this.zzdae.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    @TargetApi(21)
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (!PlatformVersion.isAtLeastLollipop() || zzabu.zzcvy.get().booleanValue()) {
            super.onPermissionRequest(permissionRequest);
            return;
        }
        zzbdv zzbdv = this.zzdae;
        if (zzbdv == null || zzbdv.zzaaf() == null || this.zzdae.zzaaf().zzabk() == null) {
            super.onPermissionRequest(permissionRequest);
            return;
        }
        String[] zza = this.zzdae.zzaaf().zzabk().zza(permissionRequest.getResources());
        if (zza.length > 0) {
            permissionRequest.grant(zza);
        } else {
            permissionRequest.deny();
        }
    }
}
