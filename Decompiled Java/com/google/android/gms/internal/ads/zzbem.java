package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.overlay.zzb;
import com.google.android.gms.ads.internal.overlay.zze;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzsp;
import com.google.android.gms.internal.ads.zzsz;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbem extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzbdv {
    private int maxHeight = -1;
    private int maxWidth = -1;
    @GuardedBy("this")
    private String zzabk;
    private final zzazo zzblu;
    private final WindowManager zzbnu;
    private int zzdhj = -1;
    private int zzdhk = -1;
    @GuardedBy("this")
    private boolean zzdiv;
    @GuardedBy("this")
    private String zzdkd = "";
    @GuardedBy("this")
    private Boolean zzdrq;
    private zzaai zzebu;
    private final zzsn zzefm;
    private final zzbfm zzeha;
    @Nullable
    private final zzdq zzehb;
    private final zzi zzehc;
    private final zza zzehd;
    private final float zzehe;
    @Nullable
    private final zzrp zzehf;
    private final boolean zzehg;
    private boolean zzehh = false;
    private boolean zzehi = false;
    private zzbdy zzehj;
    @GuardedBy("this")
    private zze zzehk;
    @GuardedBy("this")
    private IObjectWrapper zzehl;
    @GuardedBy("this")
    private zzbfl zzehm;
    @GuardedBy("this")
    private boolean zzehn;
    @GuardedBy("this")
    private boolean zzeho;
    @GuardedBy("this")
    private boolean zzehp;
    @GuardedBy("this")
    private int zzehq;
    @GuardedBy("this")
    private boolean zzehr = true;
    @GuardedBy("this")
    private boolean zzehs = false;
    @GuardedBy("this")
    private zzbeq zzeht;
    @GuardedBy("this")
    private boolean zzehu;
    @GuardedBy("this")
    private boolean zzehv;
    @GuardedBy("this")
    private zzacf zzehw;
    @GuardedBy("this")
    private zzaca zzehx;
    @GuardedBy("this")
    private zzrb zzehy;
    @GuardedBy("this")
    private int zzehz;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    public int zzeia;
    private zzaai zzeib;
    private zzaai zzeic;
    private zzaal zzeid;
    private WeakReference<View.OnClickListener> zzeie;
    @GuardedBy("this")
    private zze zzeif;
    @GuardedBy("this")
    private boolean zzeig;
    private zzayy zzeih;
    private Map<String, zzbda> zzeii;
    private final DisplayMetrics zzwi;

    static zzbem zzb(Context context, zzbfl zzbfl, String str, boolean z, boolean z2, @Nullable zzdq zzdq, zzazo zzazo, zzaak zzaak, zzi zzi, zza zza, zzsn zzsn, zzrp zzrp, boolean z3) {
        Context context2 = context;
        return new zzbem(new zzbfm(context), zzbfl, str, z, z2, zzdq, zzazo, zzaak, zzi, zza, zzsn, zzrp, z3);
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    public final boolean zzaau() {
        return false;
    }

    public final zzbbb zzyp() {
        return null;
    }

    @VisibleForTesting
    private zzbem(zzbfm zzbfm, zzbfl zzbfl, String str, boolean z, boolean z2, @Nullable zzdq zzdq, zzazo zzazo, zzaak zzaak, zzi zzi, zza zza, zzsn zzsn, zzrp zzrp, boolean z3) {
        super(zzbfm);
        this.zzeha = zzbfm;
        this.zzehm = zzbfl;
        this.zzabk = str;
        this.zzeho = z;
        this.zzehq = -1;
        this.zzehb = zzdq;
        this.zzblu = zzazo;
        this.zzehc = zzi;
        this.zzehd = zza;
        this.zzbnu = (WindowManager) getContext().getSystemService("window");
        zzq.zzkv();
        this.zzwi = zzawo.zza(this.zzbnu);
        this.zzehe = this.zzwi.density;
        this.zzefm = zzsn;
        this.zzehf = zzrp;
        this.zzehg = z3;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            zzawf.zzc("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        zzq.zzkv().zza((Context) zzbfm, zzazo.zzbmj, settings);
        zzq.zzkx().zza(getContext(), settings);
        setDownloadListener(this);
        zzabo();
        if (PlatformVersion.isAtLeastJellyBeanMR1()) {
            addJavascriptInterface(zzber.zzc(this), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.zzeih = new zzayy(this.zzeha.zzys(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        zzabs();
        this.zzeid = new zzaal(new zzaak(true, "make_wv", this.zzabk));
        this.zzeid.zzqw().zzc(zzaak);
        this.zzebu = zzaaf.zzb(this.zzeid.zzqw());
        this.zzeid.zza("native:view_create", this.zzebu);
        this.zzeic = null;
        this.zzeib = null;
        zzq.zzkx().zzbf(zzbfm);
        zzq.zzkz().zzvh();
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzbdy) {
            this.zzehj = (zzbdy) webViewClient;
        }
    }

    public final zza zzyt() {
        return this.zzehd;
    }

    private final boolean zzabl() {
        int i;
        int i2;
        boolean z = false;
        if (!this.zzehj.zzaay() && !this.zzehj.zzaaz()) {
            return false;
        }
        zzvh.zzoz();
        DisplayMetrics displayMetrics = this.zzwi;
        int zzb = zzayx.zzb(displayMetrics, displayMetrics.widthPixels);
        zzvh.zzoz();
        DisplayMetrics displayMetrics2 = this.zzwi;
        int zzb2 = zzayx.zzb(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzys = this.zzeha.zzys();
        if (zzys == null || zzys.getWindow() == null) {
            i2 = zzb;
            i = zzb2;
        } else {
            zzq.zzkv();
            int[] zzd = zzawo.zzd(zzys);
            zzvh.zzoz();
            int zzb3 = zzayx.zzb(this.zzwi, zzd[0]);
            zzvh.zzoz();
            i = zzayx.zzb(this.zzwi, zzd[1]);
            i2 = zzb3;
        }
        if (this.zzdhj == zzb && this.zzdhk == zzb2 && this.maxWidth == i2 && this.maxHeight == i) {
            return false;
        }
        if (!(this.zzdhj == zzb && this.zzdhk == zzb2)) {
            z = true;
        }
        this.zzdhj = zzb;
        this.zzdhk = zzb2;
        this.maxWidth = i2;
        this.maxHeight = i;
        new zzaow(this).zza(zzb, zzb2, i2, i, this.zzwi.density, this.zzbnu.getDefaultDisplay().getRotation());
        return z;
    }

    public final void zza(String str, Map<String, ?> map) {
        try {
            zza(str, zzq.zzkv().zzi(map));
        } catch (JSONException unused) {
            zzawf.zzfa("Could not convert parameters to JSON.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isDestroyed()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.ads.zzawf.zzfc(r2)     // Catch:{ all -> 0x0019 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbem.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    private final synchronized void zzfn(String str) {
        if (!isDestroyed()) {
            loadUrl(str);
        } else {
            zzawf.zzfa("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!isDestroyed()) {
            try {
                super.loadUrl(str);
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
                zzq.zzkz().zza(e, "AdWebViewImpl.loadUrl");
                zzawf.zzd("Could not call loadUrl. ", e);
            }
        } else {
            zzawf.zzfa("#004 The webview is destroyed. Ignoring action.");
        }
    }

    private final synchronized void zzfo(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e) {
            zzq.zzkz().zza(e, "AdWebViewImpl.loadUrlUnsafe");
            zzawf.zzd("Could not call loadUrl. ", e);
        }
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!isDestroyed()) {
            super.loadData(str, str2, str3);
        } else {
            zzawf.zzfa("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!isDestroyed()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            zzawf.zzfa("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void zzb(String str, String str2, @Nullable String str3) {
        if (!isDestroyed()) {
            String str4 = str;
            super.loadDataWithBaseURL(str4, zzbfb.zzf(str2, zzbfb.zzabu()), "text/html", Constants.ENCODING, str3);
            return;
        }
        zzawf.zzfa("#004 The webview is destroyed. Ignoring action.");
    }

    @TargetApi(19)
    private final synchronized void zza(String str, ValueCallback<String> valueCallback) {
        if (!isDestroyed()) {
            evaluateJavascript(str, (ValueCallback<String>) null);
        } else {
            zzawf.zzfa("#004 The webview is destroyed. Ignoring action.");
        }
    }

    private final void zzfp(String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            if (zzvf() == null) {
                zzabm();
            }
            if (zzvf().booleanValue()) {
                zza(str, (ValueCallback<String>) null);
                return;
            }
            String valueOf = String.valueOf(str);
            zzfn(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        String valueOf2 = String.valueOf(str);
        zzfn(valueOf2.length() != 0 ? "javascript:".concat(valueOf2) : new String("javascript:"));
    }

    public final void zzcz(String str) {
        zzfp(str);
    }

    private final synchronized void zzabm() {
        this.zzdrq = zzq.zzkz().zzvf();
        if (this.zzdrq == null) {
            try {
                evaluateJavascript("(function(){})()", (ValueCallback<String>) null);
                zza((Boolean) true);
            } catch (IllegalStateException unused) {
                zza((Boolean) false);
            }
        }
    }

    @VisibleForTesting
    private final void zza(Boolean bool) {
        synchronized (this) {
            this.zzdrq = bool;
        }
        zzq.zzkz().zza(bool);
    }

    @VisibleForTesting
    private final synchronized Boolean zzvf() {
        return this.zzdrq;
    }

    public final void zzb(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        zzfp(sb.toString());
    }

    public final void zza(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        zzawf.zzeb(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        zzfp(sb.toString());
    }

    public final void zzzy() {
        zzabn();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzblu.zzbmj);
        zza("onhide", (Map<String, ?>) hashMap);
    }

    public final void zzde(int i) {
        if (i == 0) {
            zzaaf.zza(this.zzeid.zzqw(), this.zzebu, "aebb2");
        }
        zzabn();
        if (this.zzeid.zzqw() != null) {
            this.zzeid.zzqw().zzh("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zzblu.zzbmj);
        zza("onhide", (Map<String, ?>) hashMap);
    }

    private final void zzabn() {
        zzaaf.zza(this.zzeid.zzqw(), this.zzebu, "aeh2");
    }

    public final void zztw() {
        if (this.zzeib == null) {
            zzaaf.zza(this.zzeid.zzqw(), this.zzebu, "aes2");
            this.zzeib = zzaaf.zzb(this.zzeid.zzqw());
            this.zzeid.zza("native:view_show", this.zzeib);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzblu.zzbmj);
        zza("onshow", (Map<String, ?>) hashMap);
    }

    public final void zzzz() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzq.zzla().zzpk()));
        hashMap.put("app_volume", String.valueOf(zzq.zzla().zzpj()));
        hashMap.put("device_volume", String.valueOf(zzaxd.zzbh(getContext())));
        zza("volume", (Map<String, ?>) hashMap);
    }

    public final void zza(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(FirebaseAnalytics.Param.SUCCESS, z ? "1" : "0");
        hashMap.put("duration", Long.toString(j));
        zza("onCacheAccessComplete", (Map<String, ?>) hashMap);
    }

    public final synchronized zze zzaab() {
        return this.zzehk;
    }

    public final synchronized IObjectWrapper zzaaj() {
        return this.zzehl;
    }

    public final synchronized zze zzaac() {
        return this.zzeif;
    }

    public final synchronized zzbfl zzaad() {
        return this.zzehm;
    }

    public final synchronized String zzaae() {
        return this.zzabk;
    }

    public final WebViewClient zzaag() {
        return this.zzehj;
    }

    public final synchronized boolean zzaah() {
        return this.zzdiv;
    }

    public final zzdq zzaai() {
        return this.zzehb;
    }

    public final zzazo zzyw() {
        return this.zzblu;
    }

    public final synchronized boolean zzaak() {
        return this.zzeho;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            zzq.zzkv();
            zzawo.zza(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            zzawf.zzeb(sb.toString());
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zzehj.zzaaz() || this.zzehj.zzaba()) {
            zzdq zzdq = this.zzehb;
            if (zzdq != null) {
                zzdq.zza(motionEvent);
            }
        } else {
            synchronized (this) {
                if (this.zzehw != null) {
                    this.zzehw.zzc(motionEvent);
                }
            }
        }
        if (isDestroyed()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01f9, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01d7 A[SYNTHETIC, Splitter:B:112:0x01d7] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0141  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:122:0x01fa=Splitter:B:122:0x01fa, B:64:0x00de=Splitter:B:64:0x00de} */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.isDestroyed()     // Catch:{ all -> 0x01ff }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x01fa
            boolean r0 = r7.zzeho     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x01fa
            com.google.android.gms.internal.ads.zzbfl r0 = r7.zzehm     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.zzabz()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x0021
            goto L_0x01fa
        L_0x0021:
            com.google.android.gms.internal.ads.zzbfl r0 = r7.zzehm     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.zzacb()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.zzbfl r0 = r7.zzehm     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.zzaca()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzzx.zzcnd     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.zzzt r1 = com.google.android.gms.internal.ads.zzvh.zzpd()     // Catch:{ all -> 0x01ff }
            java.lang.Object r0 = r1.zzd(r0)     // Catch:{ all -> 0x01ff }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.zzbeq r0 = r7.zzyq()     // Catch:{ all -> 0x01ff }
            r1 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.getAspectRatio()     // Catch:{ all -> 0x01ff }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0063
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x0063:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01ff }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01ff }
            float r1 = (float) r9     // Catch:{ all -> 0x01ff }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01ff }
            float r2 = (float) r8     // Catch:{ all -> 0x01ff }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01ff }
            if (r9 != 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            float r9 = (float) r2     // Catch:{ all -> 0x01ff }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01ff }
            r9 = r2
            goto L_0x0084
        L_0x007c:
            if (r8 != 0) goto L_0x0084
            if (r1 == 0) goto L_0x0084
            float r8 = (float) r1     // Catch:{ all -> 0x01ff }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01ff }
            r8 = r1
        L_0x0084:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01ff }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01ff }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x0091:
            com.google.android.gms.internal.ads.zzbfl r0 = r7.zzehm     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.isFluid()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x00e3
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzzx.zzcng     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.zzzt r1 = com.google.android.gms.internal.ads.zzvh.zzpd()     // Catch:{ all -> 0x01ff }
            java.lang.Object r0 = r1.zzd(r0)     // Catch:{ all -> 0x01ff }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x00de
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR1()     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x00b2
            goto L_0x00de
        L_0x00b2:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.zzbeo r1 = new com.google.android.gms.internal.ads.zzbeo     // Catch:{ all -> 0x01ff }
            r1.<init>(r7)     // Catch:{ all -> 0x01ff }
            r7.zza((java.lang.String) r0, (com.google.android.gms.internal.ads.zzafz<? super com.google.android.gms.internal.ads.zzbdv>) r1)     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.zzfp(r0)     // Catch:{ all -> 0x01ff }
            android.util.DisplayMetrics r0 = r7.zzwi     // Catch:{ all -> 0x01ff }
            float r0 = r0.density     // Catch:{ all -> 0x01ff }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01ff }
            int r1 = r7.zzeia     // Catch:{ all -> 0x01ff }
            r2 = -1
            if (r1 == r2) goto L_0x00d5
            int r9 = r7.zzeia     // Catch:{ all -> 0x01ff }
            float r9 = (float) r9     // Catch:{ all -> 0x01ff }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01ff }
            goto L_0x00d9
        L_0x00d5:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01ff }
        L_0x00d9:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x00de:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x00e3:
            com.google.android.gms.internal.ads.zzbfl r0 = r7.zzehm     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.zzaby()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x00f8
            android.util.DisplayMetrics r8 = r7.zzwi     // Catch:{ all -> 0x01ff }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01ff }
            android.util.DisplayMetrics r9 = r7.zzwi     // Catch:{ all -> 0x01ff }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01ff }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x00f8:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01ff }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01ff }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01ff }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01ff }
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r4) goto L_0x0118
            if (r0 != r3) goto L_0x0114
            goto L_0x0118
        L_0x0114:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0119
        L_0x0118:
            r0 = r8
        L_0x0119:
            if (r2 == r4) goto L_0x011d
            if (r2 != r3) goto L_0x011e
        L_0x011d:
            r5 = r9
        L_0x011e:
            com.google.android.gms.internal.ads.zzbfl r2 = r7.zzehm     // Catch:{ all -> 0x01ff }
            int r2 = r2.widthPixels     // Catch:{ all -> 0x01ff }
            r3 = 1
            if (r2 > r0) goto L_0x012e
            com.google.android.gms.internal.ads.zzbfl r2 = r7.zzehm     // Catch:{ all -> 0x01ff }
            int r2 = r2.heightPixels     // Catch:{ all -> 0x01ff }
            if (r2 <= r5) goto L_0x012c
            goto L_0x012e
        L_0x012c:
            r2 = 0
            goto L_0x012f
        L_0x012e:
            r2 = 1
        L_0x012f:
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.zzzx.zzcpn     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.zzzt r6 = com.google.android.gms.internal.ads.zzvh.zzpd()     // Catch:{ all -> 0x01ff }
            java.lang.Object r4 = r6.zzd(r4)     // Catch:{ all -> 0x01ff }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01ff }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01ff }
            if (r4 == 0) goto L_0x0167
            com.google.android.gms.internal.ads.zzbfl r4 = r7.zzehm     // Catch:{ all -> 0x01ff }
            int r4 = r4.widthPixels     // Catch:{ all -> 0x01ff }
            float r4 = (float) r4     // Catch:{ all -> 0x01ff }
            float r6 = r7.zzehe     // Catch:{ all -> 0x01ff }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01ff }
            float r6 = r7.zzehe     // Catch:{ all -> 0x01ff }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0163
            com.google.android.gms.internal.ads.zzbfl r0 = r7.zzehm     // Catch:{ all -> 0x01ff }
            int r0 = r0.heightPixels     // Catch:{ all -> 0x01ff }
            float r0 = (float) r0     // Catch:{ all -> 0x01ff }
            float r4 = r7.zzehe     // Catch:{ all -> 0x01ff }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01ff }
            float r5 = r7.zzehe     // Catch:{ all -> 0x01ff }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0163
            r0 = 1
            goto L_0x0164
        L_0x0163:
            r0 = 0
        L_0x0164:
            if (r2 == 0) goto L_0x0167
            goto L_0x0168
        L_0x0167:
            r0 = r2
        L_0x0168:
            r2 = 8
            if (r0 == 0) goto L_0x01d7
            com.google.android.gms.internal.ads.zzbfl r0 = r7.zzehm     // Catch:{ all -> 0x01ff }
            int r0 = r0.widthPixels     // Catch:{ all -> 0x01ff }
            float r0 = (float) r0     // Catch:{ all -> 0x01ff }
            float r4 = r7.zzehe     // Catch:{ all -> 0x01ff }
            float r0 = r0 / r4
            int r0 = (int) r0     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.zzbfl r4 = r7.zzehm     // Catch:{ all -> 0x01ff }
            int r4 = r4.heightPixels     // Catch:{ all -> 0x01ff }
            float r4 = (float) r4     // Catch:{ all -> 0x01ff }
            float r5 = r7.zzehe     // Catch:{ all -> 0x01ff }
            float r4 = r4 / r5
            int r4 = (int) r4     // Catch:{ all -> 0x01ff }
            float r8 = (float) r8     // Catch:{ all -> 0x01ff }
            float r5 = r7.zzehe     // Catch:{ all -> 0x01ff }
            float r8 = r8 / r5
            int r8 = (int) r8     // Catch:{ all -> 0x01ff }
            float r9 = (float) r9     // Catch:{ all -> 0x01ff }
            float r5 = r7.zzehe     // Catch:{ all -> 0x01ff }
            float r9 = r9 / r5
            int r9 = (int) r9     // Catch:{ all -> 0x01ff }
            r5 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ff }
            r6.<init>(r5)     // Catch:{ all -> 0x01ff }
            java.lang.String r5 = "Not enough space to show ad. Needs "
            r6.append(r5)     // Catch:{ all -> 0x01ff }
            r6.append(r0)     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = "x"
            r6.append(r0)     // Catch:{ all -> 0x01ff }
            r6.append(r4)     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = " dp, but only has "
            r6.append(r0)     // Catch:{ all -> 0x01ff }
            r6.append(r8)     // Catch:{ all -> 0x01ff }
            java.lang.String r8 = "x"
            r6.append(r8)     // Catch:{ all -> 0x01ff }
            r6.append(r9)     // Catch:{ all -> 0x01ff }
            java.lang.String r8 = " dp."
            r6.append(r8)     // Catch:{ all -> 0x01ff }
            java.lang.String r8 = r6.toString()     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.zzawf.zzfa(r8)     // Catch:{ all -> 0x01ff }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01ff }
            if (r8 == r2) goto L_0x01c5
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01ff }
        L_0x01c5:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01ff }
            boolean r8 = r7.zzehh     // Catch:{ all -> 0x01ff }
            if (r8 != 0) goto L_0x01f8
            com.google.android.gms.internal.ads.zzsn r8 = r7.zzefm     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.zzsp$zza$zza r9 = com.google.android.gms.internal.ads.zzsp.zza.C0019zza.BANNER_SIZE_INVALID     // Catch:{ all -> 0x01ff }
            r8.zza((com.google.android.gms.internal.ads.zzsp.zza.C0019zza) r9)     // Catch:{ all -> 0x01ff }
            r7.zzehh = r3     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x01d7:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01ff }
            if (r8 == r2) goto L_0x01e0
            r7.setVisibility(r1)     // Catch:{ all -> 0x01ff }
        L_0x01e0:
            boolean r8 = r7.zzehi     // Catch:{ all -> 0x01ff }
            if (r8 != 0) goto L_0x01ed
            com.google.android.gms.internal.ads.zzsn r8 = r7.zzefm     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.zzsp$zza$zza r9 = com.google.android.gms.internal.ads.zzsp.zza.C0019zza.BANNER_SIZE_VALID     // Catch:{ all -> 0x01ff }
            r8.zza((com.google.android.gms.internal.ads.zzsp.zza.C0019zza) r9)     // Catch:{ all -> 0x01ff }
            r7.zzehi = r3     // Catch:{ all -> 0x01ff }
        L_0x01ed:
            com.google.android.gms.internal.ads.zzbfl r8 = r7.zzehm     // Catch:{ all -> 0x01ff }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.zzbfl r9 = r7.zzehm     // Catch:{ all -> 0x01ff }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01ff }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01ff }
        L_0x01f8:
            monitor-exit(r7)
            return
        L_0x01fa:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x01ff:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbem.onMeasure(int, int):void");
    }

    public final void onGlobalLayout() {
        boolean zzabl = zzabl();
        zze zzaab = zzaab();
        if (zzaab != null && zzabl) {
            zzaab.zztv();
        }
    }

    public final synchronized void zza(zze zze) {
        this.zzehk = zze;
    }

    public final synchronized void zzap(IObjectWrapper iObjectWrapper) {
        this.zzehl = iObjectWrapper;
    }

    public final synchronized void zzb(zze zze) {
        this.zzeif = zze;
    }

    public final synchronized void zza(zzbfl zzbfl) {
        this.zzehm = zzbfl;
        requestLayout();
    }

    public final synchronized void zzax(boolean z) {
        boolean z2 = z != this.zzeho;
        this.zzeho = z;
        zzabo();
        if (z2) {
            if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcii)).booleanValue() || !this.zzehm.zzaby()) {
                new zzaow(this).zzdv(z ? "expanded" : "default");
            }
        }
    }

    public final void zzaao() {
        this.zzeih.zzxl();
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isDestroyed()) {
            this.zzeih.onAttachedToWindow();
        }
        boolean z = this.zzehu;
        if (this.zzehj != null && this.zzehj.zzaaz()) {
            if (!this.zzehv) {
                this.zzehj.zzabb();
                this.zzehj.zzabc();
                this.zzehv = true;
            }
            zzabl();
            z = true;
        }
        zzbd(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!isDestroyed()) {
                this.zzeih.onDetachedFromWindow();
            }
            super.onDetachedFromWindow();
            if (this.zzehv && this.zzehj != null && this.zzehj.zzaaz() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzehj.zzabb();
                this.zzehj.zzabc();
                this.zzehv = false;
            }
        }
        zzbd(false);
    }

    public final void zzbu(Context context) {
        this.zzeha.setBaseContext(context);
        this.zzeih.zzh(this.zzeha.zzys());
    }

    public final synchronized void zzal(boolean z) {
        if (this.zzehk != null) {
            this.zzehk.zza(this.zzehj.zzaay(), z);
        } else {
            this.zzdiv = z;
        }
    }

    public final synchronized void setRequestedOrientation(int i) {
        this.zzehq = i;
        if (this.zzehk != null) {
            this.zzehk.setRequestedOrientation(this.zzehq);
        }
    }

    public final Activity zzys() {
        return this.zzeha.zzys();
    }

    public final Context zzaaa() {
        return this.zzeha.zzaaa();
    }

    private final synchronized void zzabo() {
        if (!this.zzeho) {
            if (!this.zzehm.zzaby()) {
                if (Build.VERSION.SDK_INT < 18) {
                    zzawf.zzeb("Disabling hardware acceleration on an AdView.");
                    zzabp();
                    return;
                }
                zzawf.zzeb("Enabling hardware acceleration on an AdView.");
                zzabq();
                return;
            }
        }
        zzawf.zzeb("Enabling hardware acceleration on an overlay.");
        zzabq();
    }

    private final synchronized void zzabp() {
        if (!this.zzehp) {
            zzq.zzkx();
            setLayerType(1, (Paint) null);
        }
        this.zzehp = true;
    }

    private final synchronized void zzabq() {
        if (this.zzehp) {
            zzq.zzkx();
            setLayerType(0, (Paint) null);
        }
        this.zzehp = false;
    }

    public final synchronized void destroy() {
        zzabs();
        this.zzeih.zzxm();
        if (this.zzehk != null) {
            this.zzehk.close();
            this.zzehk.onDestroy();
            this.zzehk = null;
        }
        this.zzehl = null;
        this.zzehj.reset();
        if (!this.zzehn) {
            zzq.zzlr();
            zzbcx.zzc(this);
            zzabr();
            this.zzehn = true;
            zzawf.zzee("Initiating WebView self destruct sequence in 3...");
            zzawf.zzee("Loading blank page in WebView, 2...");
            zzfo("about:blank");
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzehn) {
                    this.zzehj.reset();
                    zzq.zzlr();
                    zzbcx.zzc(this);
                    zzabr();
                    zzvi();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final synchronized void zzaal() {
        zzawf.zzee("Destroying WebView!");
        zzvi();
        zzawo.zzdtx.post(new zzben(this));
    }

    private final synchronized void zzvi() {
        if (!this.zzeig) {
            this.zzeig = true;
            zzq.zzkz().zzvi();
        }
    }

    public final synchronized boolean isDestroyed() {
        return this.zzehn;
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (!isDestroyed()) {
            if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
                zzbdy zzbdy = this.zzehj;
            }
        }
    }

    public final void zzaap() {
        if (this.zzeic == null) {
            this.zzeic = zzaaf.zzb(this.zzeid.zzqw());
            this.zzeid.zza("native:view_load", this.zzeic);
        }
    }

    public final void onPause() {
        if (!isDestroyed()) {
            try {
                super.onPause();
            } catch (Exception e) {
                zzawf.zzc("Could not pause webview.", e);
            }
        }
    }

    public final void onResume() {
        if (!isDestroyed()) {
            try {
                super.onResume();
            } catch (Exception e) {
                zzawf.zzc("Could not resume webview.", e);
            }
        }
    }

    public final void zzaas() {
        zzawf.zzee("Cannot add text view to inner AdWebView");
    }

    public final void zzba(boolean z) {
        this.zzehj.zzba(z);
    }

    public final void stopLoading() {
        if (!isDestroyed()) {
            try {
                super.stopLoading();
            } catch (Exception e) {
                zzawf.zzc("Could not stop loading webview.", e);
            }
        }
    }

    public final synchronized void zzay(boolean z) {
        this.zzehr = z;
    }

    public final synchronized boolean zzaam() {
        return this.zzehr;
    }

    public final synchronized void zzka() {
        this.zzehs = true;
        if (this.zzehc != null) {
            this.zzehc.zzka();
        }
    }

    public final synchronized void zzkb() {
        this.zzehs = false;
        if (this.zzehc != null) {
            this.zzehc.zzkb();
        }
    }

    private final synchronized void zzabr() {
        if (this.zzeii != null) {
            for (zzbda release : this.zzeii.values()) {
                release.release();
            }
        }
        this.zzeii = null;
    }

    public final synchronized void zza(String str, zzbda zzbda) {
        if (this.zzeii == null) {
            this.zzeii = new HashMap();
        }
        this.zzeii.put(str, zzbda);
    }

    public final synchronized zzbda zzff(String str) {
        if (this.zzeii == null) {
            return null;
        }
        return this.zzeii.get(str);
    }

    public final synchronized String zzyu() {
        return this.zzdkd;
    }

    public final synchronized void zzyz() {
        if (this.zzehx != null) {
            this.zzehx.zzrf();
        }
    }

    public final synchronized void zza(zzaca zzaca) {
        this.zzehx = zzaca;
    }

    public final synchronized void zza(zzrb zzrb) {
        this.zzehy = zzrb;
    }

    public final synchronized zzrb zzaat() {
        return this.zzehy;
    }

    public final zzaai zzyr() {
        return this.zzebu;
    }

    public final zzaal zzyv() {
        return this.zzeid;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zzeie = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final synchronized void zza(zzacf zzacf) {
        this.zzehw = zzacf;
    }

    public final synchronized zzacf zzaaq() {
        return this.zzehw;
    }

    public final synchronized zzbeq zzyq() {
        return this.zzeht;
    }

    public final synchronized void zza(zzbeq zzbeq) {
        if (this.zzeht != null) {
            zzawf.zzey("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzeht = zzbeq;
        }
    }

    public final synchronized boolean zzaan() {
        return this.zzehz > 0;
    }

    public final synchronized void zzaz(boolean z) {
        this.zzehz += z ? 1 : -1;
        if (this.zzehz <= 0 && this.zzehk != null) {
            this.zzehk.zzty();
        }
    }

    private final void zzabs() {
        zzaak zzqw;
        zzaal zzaal = this.zzeid;
        if (zzaal != null && (zzqw = zzaal.zzqw()) != null && zzq.zzkz().zzve() != null) {
            zzq.zzkz().zzve().zza(zzqw);
        }
    }

    public final void zzaar() {
        setBackgroundColor(0);
    }

    public final void zzav(boolean z) {
        this.zzehj.zzav(z);
    }

    public final void zztx() {
        zze zzaab = zzaab();
        if (zzaab != null) {
            zzaab.zztx();
        }
    }

    public final int zzyx() {
        return getMeasuredHeight();
    }

    public final int zzyy() {
        return getMeasuredWidth();
    }

    public final void zza(zzb zzb) {
        this.zzehj.zza(zzb);
    }

    public final void zzc(boolean z, int i) {
        this.zzehj.zzc(z, i);
    }

    public final void zza(boolean z, int i, String str) {
        this.zzehj.zza(z, i, str);
    }

    public final void zza(boolean z, int i, String str, String str2) {
        this.zzehj.zza(z, i, str, str2);
    }

    public final void zza(zzpu zzpu) {
        synchronized (this) {
            this.zzehu = zzpu.zzbnz;
        }
        zzbd(zzpu.zzbnz);
    }

    private final void zzbd(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        zza("onAdVisibilityChanged", (Map<String, ?>) hashMap);
    }

    public final void zza(String str, zzafz<? super zzbdv> zzafz) {
        zzbdy zzbdy = this.zzehj;
        if (zzbdy != null) {
            zzbdy.zza(str, zzafz);
        }
    }

    public final void zzb(String str, zzafz<? super zzbdv> zzafz) {
        zzbdy zzbdy = this.zzehj;
        if (zzbdy != null) {
            zzbdy.zzb(str, zzafz);
        }
    }

    public final void zza(String str, Predicate<zzafz<? super zzbdv>> predicate) {
        zzbdy zzbdy = this.zzehj;
        if (zzbdy != null) {
            zzbdy.zza(str, predicate);
        }
    }

    public final boolean zzb(boolean z, int i) {
        destroy();
        this.zzefm.zza((zzsq) new zzbel(z, i));
        this.zzefm.zza(zzsp.zza.C0019zza.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    public final void zza(ViewGroup viewGroup, Activity activity, String str, String str2) {
        if (!zzaaw()) {
            zzawf.zzee("AR ad is not enabled or the ad from the server is not an AR ad.");
            return;
        }
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
        zzawf.zzee("Initializing ArWebView object.");
        this.zzehf.zza(activity, this);
        this.zzehf.zzc(str, str2);
        if (viewGroup != null) {
            viewGroup.addView(this.zzehf.getView());
        } else {
            zzawf.zzey("The FrameLayout object cannot be null.");
        }
    }

    public final zzrp zzaav() {
        return this.zzehf;
    }

    public final boolean zzaaw() {
        return ((Boolean) zzvh.zzpd().zzd(zzzx.zzcrj)).booleanValue() && this.zzehf != null && this.zzehg;
    }

    public final /* synthetic */ zzbfi zzaaf() {
        return this.zzehj;
    }

    static final /* synthetic */ void zza(boolean z, int i, zztv zztv) {
        zzsz.zzw.zza zzol = zzsz.zzw.zzol();
        if (zzol.zzok() != z) {
            zzol.zzw(z);
        }
        zztv.zzcbo = (zzsz.zzw) ((zzdyz) zzol.zzci(i).zzbcx());
    }
}
