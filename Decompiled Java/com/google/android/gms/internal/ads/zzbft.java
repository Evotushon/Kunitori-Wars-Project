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
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbft extends zzbfz implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzaii, zzbdv {
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
    private zzaai zzebu;
    private final zzsn zzefm;
    private final zzbfm zzeha;
    @Nullable
    private final zzdq zzehb;
    private final zzi zzehc;
    private final zza zzehd;
    @Nullable
    private final zzrp zzehf;
    private final boolean zzehg;
    @GuardedBy("this")
    private zze zzehk;
    @GuardedBy("this")
    private zzbfl zzehm;
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
    private zzayy zzeih;
    private Map<String, zzbda> zzeii;
    private final zzbfo zzejd;
    private final AtomicReference<IObjectWrapper> zzeje = new AtomicReference<>();
    private final DisplayMetrics zzwi;

    @VisibleForTesting
    protected zzbft(zzbfm zzbfm, zzbfo zzbfo, zzbfl zzbfl, String str, boolean z, boolean z2, @Nullable zzdq zzdq, zzazo zzazo, zzaak zzaak, zzi zzi, zza zza, zzsn zzsn, zzrp zzrp, boolean z3) {
        super(zzbfm, zzbfo);
        this.zzeha = zzbfm;
        this.zzejd = zzbfo;
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
        this.zzefm = zzsn;
        this.zzehf = zzrp;
        this.zzehg = z3;
        this.zzeih = new zzayy(this.zzeha.zzys(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        zzq.zzkv().zza((Context) zzbfm, zzazo.zzbmj, getSettings());
        setDownloadListener(this);
        zzabo();
        if (PlatformVersion.isAtLeastJellyBeanMR1()) {
            addJavascriptInterface(zzber.zzc(this), "googleAdsJsInterface");
        }
        zzabs();
        this.zzeid = new zzaal(new zzaak(true, "make_wv", this.zzabk));
        this.zzeid.zzqw().zzc(zzaak);
        this.zzebu = zzaaf.zzb(this.zzeid.zzqw());
        this.zzeid.zza("native:view_create", this.zzebu);
        this.zzeic = null;
        this.zzeib = null;
        zzq.zzkx().zzbf(zzbfm);
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    public final void zza(String str, Map map) {
        zzail.zza((zzaii) this, str, map);
    }

    public final void zza(String str, JSONObject jSONObject) {
        zzail.zzb(this, str, jSONObject);
    }

    public final void zzaal() {
    }

    public final boolean zzaau() {
        return false;
    }

    public final void zzb(String str, JSONObject jSONObject) {
        zzail.zza((zzaii) this, str, jSONObject);
    }

    public final void zzj(String str, String str2) {
        zzail.zza((zzaii) this, str, str2);
    }

    public final zzbbb zzyp() {
        return null;
    }

    public final zza zzyt() {
        return this.zzehd;
    }

    private final boolean zzabl() {
        int i;
        int i2;
        boolean z = false;
        if (!this.zzejd.zzaay() && !this.zzejd.zzaaz()) {
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

    public final synchronized void zzb(String str, String str2, @Nullable String str3) {
        String str4 = str;
        super.loadDataWithBaseURL(str4, zzbfb.zzf(str2, zzbfb.zzabu()), "text/html", Constants.ENCODING, str3);
    }

    public final synchronized void zzcz(String str) {
        if (!isDestroyed()) {
            super.zzcz(str);
        } else {
            zzawf.zzfa("The webview is destroyed. Ignoring action.");
        }
    }

    public final void zzzy() {
        zzabn();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzblu.zzbmj);
        zzail.zza((zzaii) this, "onhide", (Map) hashMap);
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
        zzail.zza((zzaii) this, "onhide", (Map) hashMap);
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
        zzail.zza((zzaii) this, "onshow", (Map) hashMap);
    }

    public final void zzzz() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzq.zzla().zzpk()));
        hashMap.put("app_volume", String.valueOf(zzq.zzla().zzpj()));
        hashMap.put("device_volume", String.valueOf(zzaxd.zzbh(getContext())));
        zzail.zza((zzaii) this, "volume", (Map) hashMap);
    }

    public final void zza(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(FirebaseAnalytics.Param.SUCCESS, z ? "1" : "0");
        hashMap.put("duration", Long.toString(j));
        zzail.zza((zzaii) this, "onCacheAccessComplete", (Map) hashMap);
    }

    public final synchronized zze zzaab() {
        return this.zzehk;
    }

    public final IObjectWrapper zzaaj() {
        return this.zzeje.get();
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
        return this.zzejd;
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
        if (!this.zzejd.zzaaz() || this.zzejd.zzaba()) {
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
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01d8 A[SYNTHETIC, Splitter:B:109:0x01d8] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0141  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:64:0x00de=Splitter:B:64:0x00de, B:116:0x01ee=Splitter:B:116:0x01ee} */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.isDestroyed()     // Catch:{ all -> 0x01f3 }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x01ee
            boolean r0 = r7.zzeho     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x01ee
            com.google.android.gms.internal.ads.zzbfl r0 = r7.zzehm     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.zzabz()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x0021
            goto L_0x01ee
        L_0x0021:
            com.google.android.gms.internal.ads.zzbfl r0 = r7.zzehm     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.zzacb()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.zzbfl r0 = r7.zzehm     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.zzaca()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzzx.zzcnd     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.zzzt r1 = com.google.android.gms.internal.ads.zzvh.zzpd()     // Catch:{ all -> 0x01f3 }
            java.lang.Object r0 = r1.zzd(r0)     // Catch:{ all -> 0x01f3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.zzbeq r0 = r7.zzyq()     // Catch:{ all -> 0x01f3 }
            r1 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.getAspectRatio()     // Catch:{ all -> 0x01f3 }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0063
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x0063:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01f3 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01f3 }
            float r1 = (float) r9     // Catch:{ all -> 0x01f3 }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01f3 }
            float r2 = (float) r8     // Catch:{ all -> 0x01f3 }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01f3 }
            if (r9 != 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            float r9 = (float) r2     // Catch:{ all -> 0x01f3 }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01f3 }
            r9 = r2
            goto L_0x0084
        L_0x007c:
            if (r8 != 0) goto L_0x0084
            if (r1 == 0) goto L_0x0084
            float r8 = (float) r1     // Catch:{ all -> 0x01f3 }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01f3 }
            r8 = r1
        L_0x0084:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01f3 }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01f3 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x0091:
            com.google.android.gms.internal.ads.zzbfl r0 = r7.zzehm     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.isFluid()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x00e3
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzzx.zzcng     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.zzzt r1 = com.google.android.gms.internal.ads.zzvh.zzpd()     // Catch:{ all -> 0x01f3 }
            java.lang.Object r0 = r1.zzd(r0)     // Catch:{ all -> 0x01f3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x00de
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR1()     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x00b2
            goto L_0x00de
        L_0x00b2:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.zzbfv r1 = new com.google.android.gms.internal.ads.zzbfv     // Catch:{ all -> 0x01f3 }
            r1.<init>(r7)     // Catch:{ all -> 0x01f3 }
            r7.zza((java.lang.String) r0, (com.google.android.gms.internal.ads.zzafz<? super com.google.android.gms.internal.ads.zzbdv>) r1)     // Catch:{ all -> 0x01f3 }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.zzcz(r0)     // Catch:{ all -> 0x01f3 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01f3 }
            int r0 = r7.zzeia     // Catch:{ all -> 0x01f3 }
            r1 = -1
            if (r0 == r1) goto L_0x00d5
            int r9 = r7.zzeia     // Catch:{ all -> 0x01f3 }
            float r9 = (float) r9     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r0 = r7.zzwi     // Catch:{ all -> 0x01f3 }
            float r0 = r0.density     // Catch:{ all -> 0x01f3 }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01f3 }
            goto L_0x00d9
        L_0x00d5:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01f3 }
        L_0x00d9:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x00de:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x00e3:
            com.google.android.gms.internal.ads.zzbfl r0 = r7.zzehm     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.zzaby()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x00f8
            android.util.DisplayMetrics r8 = r7.zzwi     // Catch:{ all -> 0x01f3 }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r9 = r7.zzwi     // Catch:{ all -> 0x01f3 }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01f3 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x00f8:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01f3 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01f3 }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01f3 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01f3 }
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
            com.google.android.gms.internal.ads.zzbfl r2 = r7.zzehm     // Catch:{ all -> 0x01f3 }
            int r2 = r2.widthPixels     // Catch:{ all -> 0x01f3 }
            r3 = 1
            if (r2 > r0) goto L_0x012e
            com.google.android.gms.internal.ads.zzbfl r2 = r7.zzehm     // Catch:{ all -> 0x01f3 }
            int r2 = r2.heightPixels     // Catch:{ all -> 0x01f3 }
            if (r2 <= r5) goto L_0x012c
            goto L_0x012e
        L_0x012c:
            r2 = 0
            goto L_0x012f
        L_0x012e:
            r2 = 1
        L_0x012f:
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.zzzx.zzcpn     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.zzzt r6 = com.google.android.gms.internal.ads.zzvh.zzpd()     // Catch:{ all -> 0x01f3 }
            java.lang.Object r4 = r6.zzd(r4)     // Catch:{ all -> 0x01f3 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01f3 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01f3 }
            if (r4 == 0) goto L_0x016e
            com.google.android.gms.internal.ads.zzbfl r4 = r7.zzehm     // Catch:{ all -> 0x01f3 }
            int r4 = r4.widthPixels     // Catch:{ all -> 0x01f3 }
            float r4 = (float) r4     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r6 = r7.zzwi     // Catch:{ all -> 0x01f3 }
            float r6 = r6.density     // Catch:{ all -> 0x01f3 }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r6 = r7.zzwi     // Catch:{ all -> 0x01f3 }
            float r6 = r6.density     // Catch:{ all -> 0x01f3 }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x016a
            com.google.android.gms.internal.ads.zzbfl r0 = r7.zzehm     // Catch:{ all -> 0x01f3 }
            int r0 = r0.heightPixels     // Catch:{ all -> 0x01f3 }
            float r0 = (float) r0     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.zzwi     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r5 = r7.zzwi     // Catch:{ all -> 0x01f3 }
            float r5 = r5.density     // Catch:{ all -> 0x01f3 }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x016a
            goto L_0x016b
        L_0x016a:
            r3 = 0
        L_0x016b:
            if (r2 == 0) goto L_0x016e
            r2 = r3
        L_0x016e:
            r0 = 8
            if (r2 == 0) goto L_0x01d8
            com.google.android.gms.internal.ads.zzbfl r2 = r7.zzehm     // Catch:{ all -> 0x01f3 }
            int r2 = r2.widthPixels     // Catch:{ all -> 0x01f3 }
            float r2 = (float) r2     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r3 = r7.zzwi     // Catch:{ all -> 0x01f3 }
            float r3 = r3.density     // Catch:{ all -> 0x01f3 }
            float r2 = r2 / r3
            int r2 = (int) r2     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.zzbfl r3 = r7.zzehm     // Catch:{ all -> 0x01f3 }
            int r3 = r3.heightPixels     // Catch:{ all -> 0x01f3 }
            float r3 = (float) r3     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.zzwi     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ all -> 0x01f3 }
            float r8 = (float) r8     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.zzwi     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r8 = r8 / r4
            int r8 = (int) r8     // Catch:{ all -> 0x01f3 }
            float r9 = (float) r9     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.zzwi     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01f3 }
            r4 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f3 }
            r5.<init>(r4)     // Catch:{ all -> 0x01f3 }
            java.lang.String r4 = "Not enough space to show ad. Needs "
            r5.append(r4)     // Catch:{ all -> 0x01f3 }
            r5.append(r2)     // Catch:{ all -> 0x01f3 }
            java.lang.String r2 = "x"
            r5.append(r2)     // Catch:{ all -> 0x01f3 }
            r5.append(r3)     // Catch:{ all -> 0x01f3 }
            java.lang.String r2 = " dp, but only has "
            r5.append(r2)     // Catch:{ all -> 0x01f3 }
            r5.append(r8)     // Catch:{ all -> 0x01f3 }
            java.lang.String r8 = "x"
            r5.append(r8)     // Catch:{ all -> 0x01f3 }
            r5.append(r9)     // Catch:{ all -> 0x01f3 }
            java.lang.String r8 = " dp."
            r5.append(r8)     // Catch:{ all -> 0x01f3 }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.zzawf.zzfa(r8)     // Catch:{ all -> 0x01f3 }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01f3 }
            if (r8 == r0) goto L_0x01d3
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01f3 }
        L_0x01d3:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x01d8:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01f3 }
            if (r8 == r0) goto L_0x01e1
            r7.setVisibility(r1)     // Catch:{ all -> 0x01f3 }
        L_0x01e1:
            com.google.android.gms.internal.ads.zzbfl r8 = r7.zzehm     // Catch:{ all -> 0x01f3 }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.zzbfl r9 = r7.zzehm     // Catch:{ all -> 0x01f3 }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01f3 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x01ee:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x01f3:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbft.onMeasure(int, int):void");
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

    public final void zzap(IObjectWrapper iObjectWrapper) {
        this.zzeje.set(iObjectWrapper);
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
        if (this.zzejd != null && this.zzejd.zzaaz()) {
            if (!this.zzehv) {
                this.zzejd.zzabb();
                this.zzejd.zzabc();
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
            if (this.zzehv && this.zzejd != null && this.zzejd.zzaaz() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzejd.zzabb();
                this.zzejd.zzabc();
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
            this.zzehk.zza(this.zzejd.zzaay(), z);
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

    /* access modifiers changed from: protected */
    public final synchronized void zzbe(boolean z) {
        if (!z) {
            zzabs();
            this.zzeih.zzxm();
            if (this.zzehk != null) {
                this.zzehk.close();
                this.zzehk.onDestroy();
                this.zzehk = null;
            }
        }
        this.zzeje.set((Object) null);
        this.zzejd.destroy();
        zzq.zzlr();
        zzbcx.zzc(this);
        zzabr();
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
            super.onDraw(canvas);
            zzbfo zzbfo = this.zzejd;
        }
    }

    public final void zzaap() {
        if (this.zzeic == null) {
            this.zzeic = zzaaf.zzb(this.zzeid.zzqw());
            this.zzeid.zza("native:view_load", this.zzeic);
        }
    }

    public final void onPause() {
        try {
            super.onPause();
        } catch (Exception e) {
            zzawf.zzc("Could not pause webview.", e);
        }
    }

    public final void onResume() {
        try {
            super.onResume();
        } catch (Exception e) {
            zzawf.zzc("Could not resume webview.", e);
        }
    }

    public final void zzaas() {
        zzawf.zzee("Cannot add text view to inner AdWebView");
    }

    public final void zzba(boolean z) {
        this.zzejd.zzba(z);
    }

    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e) {
            zzawf.zzc("Could not stop loading webview.", e);
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
        this.zzejd.zzav(z);
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
        this.zzejd.zza(zzb);
    }

    public final void zzc(boolean z, int i) {
        this.zzejd.zzc(z, i);
    }

    public final void zza(boolean z, int i, String str) {
        this.zzejd.zza(z, i, str);
    }

    public final void zza(boolean z, int i, String str, String str2) {
        this.zzejd.zza(z, i, str, str2);
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
        zzail.zza((zzaii) this, "onAdVisibilityChanged", (Map) hashMap);
    }

    public final void zza(String str, zzafz<? super zzbdv> zzafz) {
        zzbfo zzbfo = this.zzejd;
        if (zzbfo != null) {
            zzbfo.zza(str, zzafz);
        }
    }

    public final void zzb(String str, zzafz<? super zzbdv> zzafz) {
        zzbfo zzbfo = this.zzejd;
        if (zzbfo != null) {
            zzbfo.zzb(str, zzafz);
        }
    }

    public final void zza(String str, Predicate<zzafz<? super zzbdv>> predicate) {
        zzbfo zzbfo = this.zzejd;
        if (zzbfo != null) {
            zzbfo.zza(str, predicate);
        }
    }

    public final boolean zzb(boolean z, int i) {
        destroy();
        this.zzefm.zza((zzsq) new zzbfw(z, i));
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
        return this.zzejd;
    }

    static final /* synthetic */ void zza(boolean z, int i, zztv zztv) {
        zzsz.zzw.zza zzol = zzsz.zzw.zzol();
        if (zzol.zzok() != z) {
            zzol.zzw(z);
        }
        zztv.zzcbo = (zzsz.zzw) ((zzdyz) zzol.zzci(i).zzbcx());
    }
}
