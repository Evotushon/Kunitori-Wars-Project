package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzb;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzsp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzbdy extends WebViewClient implements zzbfi {
    private final Object lock;
    @GuardedBy("lock")
    private boolean zzbmk;
    private zztz zzcch;
    private zzafe zzcxu;
    private zzafg zzcxv;
    private zzc zzcyp;
    private zzaom zzcyq;
    private zzp zzdit;
    private zzv zzdix;
    private boolean zzdmq;
    protected zzbdv zzefl;
    @Nullable
    private final zzsn zzefm;
    private final HashMap<String, List<zzafz<? super zzbdv>>> zzefn;
    private zzbfh zzefo;
    private zzbfk zzefp;
    private zzbfj zzefq;
    private boolean zzefr;
    @GuardedBy("lock")
    private boolean zzefs;
    @GuardedBy("lock")
    private boolean zzeft;
    @GuardedBy("lock")
    private boolean zzefu;
    private final zzaox zzefv;
    @Nullable
    protected zzaub zzefw;
    private boolean zzefx;
    private boolean zzefy;
    private int zzefz;
    private View.OnAttachStateChangeListener zzega;

    public zzbdy(zzbdv zzbdv, zzsn zzsn, boolean z) {
        this(zzbdv, zzsn, z, new zzaox(zzbdv, zzbdv.zzaaa(), new zzze(zzbdv.getContext())), (zzaom) null);
    }

    @VisibleForTesting
    private zzbdy(zzbdv zzbdv, zzsn zzsn, boolean z, zzaox zzaox, zzaom zzaom) {
        this.zzefn = new HashMap<>();
        this.lock = new Object();
        this.zzefr = false;
        this.zzefm = zzsn;
        this.zzefl = zzbdv;
        this.zzbmk = z;
        this.zzefv = zzaox;
        this.zzcyq = null;
    }

    public final void zza(int i, int i2, boolean z) {
        this.zzefv.zzj(i, i2);
        zzaom zzaom = this.zzcyq;
        if (zzaom != null) {
            zzaom.zza(i, i2, false);
        }
    }

    public final void zza(zztz zztz, zzafe zzafe, zzp zzp, zzafg zzafg, zzv zzv, boolean z, @Nullable zzafy zzafy, zzc zzc, zzaoz zzaoz, @Nullable zzaub zzaub) {
        if (zzc == null) {
            zzc = new zzc(this.zzefl.getContext(), zzaub, (zzaqm) null);
        }
        this.zzcyq = new zzaom(this.zzefl, zzaoz);
        this.zzefw = zzaub;
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcjs)).booleanValue()) {
            zza("/adMetadata", (zzafz<? super zzbdv>) new zzaff(zzafe));
        }
        zza("/appEvent", (zzafz<? super zzbdv>) new zzafh(zzafg));
        zza("/backButton", (zzafz<? super zzbdv>) zzafi.zzcyf);
        zza("/refresh", (zzafz<? super zzbdv>) zzafi.zzcyg);
        zza("/canOpenURLs", (zzafz<? super zzbdv>) zzafi.zzcxw);
        zza("/canOpenIntents", (zzafz<? super zzbdv>) zzafi.zzcxx);
        zza("/click", (zzafz<? super zzbdv>) zzafi.zzcxy);
        zza("/close", (zzafz<? super zzbdv>) zzafi.zzcxz);
        zza("/customClose", (zzafz<? super zzbdv>) zzafi.zzcya);
        zza("/instrument", (zzafz<? super zzbdv>) zzafi.zzcyj);
        zza("/delayPageLoaded", (zzafz<? super zzbdv>) zzafi.zzcyl);
        zza("/delayPageClosed", (zzafz<? super zzbdv>) zzafi.zzcym);
        zza("/getLocationInfo", (zzafz<? super zzbdv>) zzafi.zzcyn);
        zza("/httpTrack", (zzafz<? super zzbdv>) zzafi.zzcyb);
        zza("/log", (zzafz<? super zzbdv>) zzafi.zzcyc);
        zza("/mraid", (zzafz<? super zzbdv>) new zzaga(zzc, this.zzcyq, zzaoz));
        zza("/mraidLoaded", (zzafz<? super zzbdv>) this.zzefv);
        zza("/open", (zzafz<? super zzbdv>) new zzagd(zzc, this.zzcyq));
        zza("/precache", (zzafz<? super zzbdv>) new zzbdf());
        zza("/touch", (zzafz<? super zzbdv>) zzafi.zzcye);
        zza("/video", (zzafz<? super zzbdv>) zzafi.zzcyh);
        zza("/videoMeta", (zzafz<? super zzbdv>) zzafi.zzcyi);
        if (zzq.zzlt().zzad(this.zzefl.getContext())) {
            zza("/logScionEvent", (zzafz<? super zzbdv>) new zzagb(this.zzefl.getContext()));
        }
        this.zzcch = zztz;
        this.zzdit = zzp;
        this.zzcxu = zzafe;
        this.zzcxv = zzafg;
        this.zzdix = zzv;
        this.zzcyp = zzc;
        this.zzefr = z;
    }

    public final zzc zzaax() {
        return this.zzcyp;
    }

    public final boolean zzaay() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzbmk;
        }
        return z;
    }

    public final boolean zzaaz() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzefs;
        }
        return z;
    }

    public final boolean zzaba() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzeft;
        }
        return z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzabb() {
        synchronized (this.lock) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzabc() {
        synchronized (this.lock) {
        }
        return null;
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        zzrp zzaav = this.zzefl.zzaav();
        if (zzaav != null && webView == zzaav.getWebView()) {
            zzaav.onPageStarted(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r1.zzsg();
        r0.zzefp = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        zzabi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.zzefx = true;
        r1 = r0.zzefp;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.lock
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbdv r2 = r0.zzefl     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.isDestroyed()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            com.google.android.gms.internal.ads.zzawf.zzee(r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.internal.ads.zzbdv r2 = r0.zzefl     // Catch:{ all -> 0x0029 }
            r2.zzaal()     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            r1 = 1
            r0.zzefx = r1
            com.google.android.gms.internal.ads.zzbfk r1 = r0.zzefp
            if (r1 == 0) goto L_0x0025
            r1.zzsg()
            r1 = 0
            r0.zzefp = r1
        L_0x0025:
            r0.zzabi()
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdy.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public final void zza(View view, zzaub zzaub, int i) {
        if (zzaub.zzuq() && i > 0) {
            zzaub.zzj(view);
            if (zzaub.zzuq()) {
                zzawo.zzdtx.postDelayed(new zzbdz(this, view, zzaub, i), 100);
            }
        }
    }

    private final void zzabd() {
        if (this.zzega != null) {
            this.zzefl.getView().removeOnAttachStateChangeListener(this.zzega);
        }
    }

    public final void zzabe() {
        zzaub zzaub = this.zzefw;
        if (zzaub != null) {
            WebView webView = this.zzefl.getWebView();
            if (ViewCompat.isAttachedToWindow(webView)) {
                zza((View) webView, zzaub, 10);
                return;
            }
            zzabd();
            this.zzega = new zzbec(this, zzaub);
            this.zzefl.getView().addOnAttachStateChangeListener(this.zzega);
        }
    }

    public final void zzabf() {
        synchronized (this.lock) {
            this.zzefu = true;
        }
        this.zzefz++;
        zzabi();
    }

    public final void zzabg() {
        this.zzefz--;
        zzabi();
    }

    public final void zzabh() {
        zzsn zzsn = this.zzefm;
        if (zzsn != null) {
            zzsn.zza(zzsp.zza.C0019zza.DELAY_PAGE_LOAD_CANCELLED_AD);
        }
        this.zzefy = true;
        zzabi();
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcqb)).booleanValue()) {
            this.zzefl.destroy();
        }
    }

    private final void zzabi() {
        if (this.zzefo != null && ((this.zzefx && this.zzefz <= 0) || this.zzefy)) {
            this.zzefo.zzai(!this.zzefy);
            this.zzefo = null;
        }
        this.zzefl.zzaap();
    }

    public final void zza(zzb zzb) {
        zzp zzp;
        boolean zzaak = this.zzefl.zzaak();
        zztz zztz = (!zzaak || this.zzefl.zzaad().zzaby()) ? this.zzcch : null;
        if (zzaak) {
            zzp = null;
        } else {
            zzp = this.zzdit;
        }
        zza(new AdOverlayInfoParcel(zzb, zztz, zzp, this.zzdix, this.zzefl.zzyw()));
    }

    public final void zzc(boolean z, int i) {
        zztz zztz = (!this.zzefl.zzaak() || this.zzefl.zzaad().zzaby()) ? this.zzcch : null;
        zzp zzp = this.zzdit;
        zzv zzv = this.zzdix;
        zzbdv zzbdv = this.zzefl;
        zza(new AdOverlayInfoParcel(zztz, zzp, zzv, zzbdv, z, i, zzbdv.zzyw()));
    }

    public final void zza(boolean z, int i, String str) {
        zzbeb zzbeb;
        boolean zzaak = this.zzefl.zzaak();
        zztz zztz = (!zzaak || this.zzefl.zzaad().zzaby()) ? this.zzcch : null;
        if (zzaak) {
            zzbeb = null;
        } else {
            zzbeb = new zzbeb(this.zzefl, this.zzdit);
        }
        zzafe zzafe = this.zzcxu;
        zzafg zzafg = this.zzcxv;
        zzv zzv = this.zzdix;
        zzbdv zzbdv = this.zzefl;
        zza(new AdOverlayInfoParcel(zztz, (zzp) zzbeb, zzafe, zzafg, zzv, zzbdv, z, i, str, zzbdv.zzyw()));
    }

    public final void zza(boolean z, int i, String str, String str2) {
        zzbeb zzbeb;
        boolean zzaak = this.zzefl.zzaak();
        zztz zztz = (!zzaak || this.zzefl.zzaad().zzaby()) ? this.zzcch : null;
        if (zzaak) {
            zzbeb = null;
        } else {
            zzbeb = new zzbeb(this.zzefl, this.zzdit);
        }
        zzafe zzafe = this.zzcxu;
        zzafg zzafg = this.zzcxv;
        zzv zzv = this.zzdix;
        zzbdv zzbdv = this.zzefl;
        zza(new AdOverlayInfoParcel(zztz, zzbeb, zzafe, zzafg, zzv, zzbdv, z, i, str, str2, zzbdv.zzyw()));
    }

    private final void zza(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzaom zzaom = this.zzcyq;
        boolean z = false;
        boolean zztl = zzaom != null ? zzaom.zztl() : false;
        zzq.zzku();
        Context context = this.zzefl.getContext();
        if (!zztl) {
            z = true;
        }
        zzl.zza(context, adOverlayInfoParcel, z);
        if (this.zzefw != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && adOverlayInfoParcel.zzdis != null) {
                str = adOverlayInfoParcel.zzdis.url;
            }
            this.zzefw.zzdw(str);
        }
    }

    public final void zza(String str, zzafz<? super zzbdv> zzafz) {
        synchronized (this.lock) {
            List list = this.zzefn.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zzefn.put(str, list);
            }
            list.add(zzafz);
        }
    }

    public final void zzb(String str, zzafz<? super zzbdv> zzafz) {
        synchronized (this.lock) {
            List list = this.zzefn.get(str);
            if (list != null) {
                list.remove(zzafz);
            }
        }
    }

    public final void zza(String str, Predicate<zzafz<? super zzbdv>> predicate) {
        synchronized (this.lock) {
            List<zzafz> list = this.zzefn.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (zzafz zzafz : list) {
                    if (predicate.apply(zzafz)) {
                        arrayList.add(zzafz);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    public final void reset() {
        zzaub zzaub = this.zzefw;
        if (zzaub != null) {
            zzaub.zzus();
            this.zzefw = null;
        }
        zzabd();
        synchronized (this.lock) {
            this.zzefn.clear();
            this.zzcch = null;
            this.zzdit = null;
            this.zzefo = null;
            this.zzefp = null;
            this.zzcxu = null;
            this.zzcxv = null;
            this.zzefr = false;
            this.zzbmk = false;
            this.zzefs = false;
            this.zzefu = false;
            this.zzdix = null;
            this.zzefq = null;
            if (this.zzcyq != null) {
                this.zzcyq.zzac(true);
                this.zzcyq = null;
            }
        }
    }

    public final void zza(zzbfh zzbfh) {
        this.zzefo = zzbfh;
    }

    public final void zza(zzbfk zzbfk) {
        this.zzefp = zzbfk;
    }

    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        zzawf.zzee(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzh(parse);
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        zzawf.zzee(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.zzefr && webView == this.zzefl.getWebView()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || Constants.SCHEME.equalsIgnoreCase(scheme)) {
                    zztz zztz = this.zzcch;
                    if (zztz != null) {
                        zztz.onAdClicked();
                        zzaub zzaub = this.zzefw;
                        if (zzaub != null) {
                            zzaub.zzdw(str);
                        }
                        this.zzcch = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.zzefl.getWebView().willNotDraw()) {
                try {
                    zzdq zzaai = this.zzefl.zzaai();
                    if (zzaai != null && zzaai.zzb(parse)) {
                        parse = zzaai.zza(parse, this.zzefl.getContext(), this.zzefl.getView(), this.zzefl.zzys());
                    }
                } catch (zzdt unused) {
                    String valueOf2 = String.valueOf(str);
                    zzawf.zzfa(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                zzc zzc = this.zzcyp;
                if (zzc == null || zzc.zzjv()) {
                    zza(new zzb("android.intent.action.VIEW", parse.toString(), (String) null, (String) null, (String) null, (String) null, (String) null));
                } else {
                    this.zzcyp.zzbr(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                zzawf.zzfa(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        } else {
            zzh(parse);
        }
        return true;
    }

    @TargetApi(11)
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzd(str, Collections.emptyMap());
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final WebResourceResponse zzd(String str, Map<String, String> map) {
        zzry zza;
        try {
            String zzb = zzaux.zzb(str, this.zzefl.getContext(), this.zzdmq);
            if (!zzb.equals(str)) {
                return zze(zzb, map);
            }
            zzrz zzbz = zzrz.zzbz(str);
            if (zzbz != null && (zza = zzq.zzlb().zza(zzbz)) != null && zza.zzmu()) {
                return new WebResourceResponse("", "", zza.zzmv());
            }
            if (!zzazb.isEnabled() || !zzabh.zzcuv.get().booleanValue()) {
                return null;
            }
            return zze(str, map);
        } catch (Exception | NoClassDefFoundError e) {
            zzq.zzkz().zza(e, "AdWebViewClient.interceptRequest");
            return zzabj();
        }
    }

    private static WebResourceResponse zzabj() {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcji)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zze(String str, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry next : map.entrySet()) {
                    openConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    zzq.zzkv().zza(this.zzefl.getContext(), this.zzefl.zzyw().zzbmj, false, httpURLConnection);
                    zzazb zzazb = new zzazb();
                    zzazb.zza(httpURLConnection, (byte[]) null);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzazb.zza(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        zzq.zzkv();
                    } else {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField == null) {
                            throw new IOException("Missing Location header in redirect");
                        } else if (headerField.startsWith("tel:")) {
                            return null;
                        } else {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                zzawf.zzfa("Protocol is null");
                                return zzabj();
                            } else if (protocol.equals("http") || protocol.equals(Constants.SCHEME)) {
                                String valueOf = String.valueOf(headerField);
                                zzawf.zzeb(valueOf.length() != 0 ? "Redirecting to ".concat(valueOf) : new String("Redirecting to "));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                String valueOf2 = String.valueOf(protocol);
                                zzawf.zzfa(valueOf2.length() != 0 ? "Unsupported scheme: ".concat(valueOf2) : new String("Unsupported scheme: "));
                                return zzabj();
                            }
                        }
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Too many redirects (20)");
                throw new IOException(sb.toString());
            }
        }
        zzq.zzkv();
        return zzawo.zzd(httpURLConnection);
    }

    public final void zzav(boolean z) {
        this.zzefr = z;
    }

    public final zzaub zzabk() {
        return this.zzefw;
    }

    public final void zzts() {
        synchronized (this.lock) {
            this.zzefr = false;
            this.zzbmk = true;
            zzazq.zzdxo.execute(new zzbdx(this));
        }
    }

    public final void zzba(boolean z) {
        this.zzdmq = z;
    }

    public final void zzi(int i, int i2) {
        zzaom zzaom = this.zzcyq;
        if (zzaom != null) {
            zzaom.zzi(i, i2);
        }
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
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

    public final void zzh(Uri uri) {
        String path = uri.getPath();
        List<zzafz> list = this.zzefn.get(path);
        if (list != null) {
            zzq.zzkv();
            Map<String, String> zzi = zzawo.zzi(uri);
            if (zzawf.isLoggable(2)) {
                String valueOf = String.valueOf(path);
                zzawf.zzee(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
                for (String next : zzi.keySet()) {
                    String str = zzi.get(next);
                    StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 4 + String.valueOf(str).length());
                    sb.append("  ");
                    sb.append(next);
                    sb.append(": ");
                    sb.append(str);
                    zzawf.zzee(sb.toString());
                }
            }
            for (zzafz zza : list) {
                zza.zza(this.zzefl, zzi);
            }
            return;
        }
        String valueOf2 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
        sb2.append("No GMSG handler found for GMSG: ");
        sb2.append(valueOf2);
        zzawf.zzee(sb2.toString());
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcse)).booleanValue() && zzq.zzkz().zzve() != null) {
            zzazq.zzdxk.execute(new zzbea(path));
        }
    }

    public final void zzbb(boolean z) {
        synchronized (this.lock) {
            this.zzefs = true;
        }
    }

    public final void zzbc(boolean z) {
        synchronized (this.lock) {
            this.zzeft = z;
        }
    }

    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzefl.zzb(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }
}
