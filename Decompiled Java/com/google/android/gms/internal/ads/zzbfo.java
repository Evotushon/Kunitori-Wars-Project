package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
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
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbfo extends zzbfx implements zzbfi {
    private final Object lock = new Object();
    private volatile boolean zzbmk;
    private zztz zzcch;
    private zzafe zzcxu;
    private zzafg zzcxv;
    private zzc zzcyp;
    private zzaom zzcyq;
    private zzp zzdit;
    private zzv zzdix;
    private boolean zzdmq;
    protected zzbdv zzefl;
    private zzbfh zzefo;
    private zzbfk zzefp;
    private zzbfj zzefq;
    private boolean zzefr = false;
    @GuardedBy("lock")
    private boolean zzefs;
    @GuardedBy("lock")
    private boolean zzeft;
    @GuardedBy("lock")
    private boolean zzefu;
    private zzaox zzefv;
    @Nullable
    private zzaub zzefw;
    private boolean zzefx;
    private boolean zzefy;
    private int zzefz;
    private View.OnAttachStateChangeListener zzega;
    private final zzaim<zzbdv> zzejb = new zzaim<>();

    /* access modifiers changed from: package-private */
    public final void zza(zzbdv zzbdv, boolean z) {
        zzaox zzaox = new zzaox(zzbdv, zzbdv.zzaaa(), new zzze(zzbdv.getContext()));
        this.zzefl = zzbdv;
        this.zzbmk = z;
        this.zzefv = zzaox;
        this.zzcyq = null;
        this.zzejb.zzg(zzbdv);
    }

    public final void zza(int i, int i2, boolean z) {
        this.zzefv.zzj(i, i2);
        zzaom zzaom = this.zzcyq;
        if (zzaom != null) {
            zzaom.zza(i, i2, false);
        }
    }

    public final void zza(String str, zzafz<? super zzbdv> zzafz) {
        this.zzejb.zza(str, zzafz);
    }

    public final void zzb(String str, zzafz<? super zzbdv> zzafz) {
        this.zzejb.zzb(str, zzafz);
    }

    public final void zza(String str, Predicate<zzafz<? super zzbdv>> predicate) {
        this.zzejb.zza(str, predicate);
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
        return this.zzbmk;
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

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        zzrp zzaav = this.zzefl.zzaav();
        if (zzaav != null && webView == zzaav.getWebView()) {
            zzaav.onPageStarted(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    public final void zza(zzbga zzbga) {
        this.zzefx = true;
        zzbfk zzbfk = this.zzefp;
        if (zzbfk != null) {
            zzbfk.zzsg();
            this.zzefp = null;
        }
        zzabi();
    }

    /* access modifiers changed from: private */
    public final void zza(View view, zzaub zzaub, int i) {
        if (zzaub.zzuq() && i > 0) {
            zzaub.zzj(view);
            if (zzaub.zzuq()) {
                zzawo.zzdtx.postDelayed(new zzbfq(this, view, zzaub, i), 100);
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
            this.zzega = new zzbfp(this, zzaub);
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
        this.zzefy = true;
        zzabi();
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
        zzbfs zzbfs;
        boolean zzaak = this.zzefl.zzaak();
        zztz zztz = (!zzaak || this.zzefl.zzaad().zzaby()) ? this.zzcch : null;
        if (zzaak) {
            zzbfs = null;
        } else {
            zzbfs = new zzbfs(this.zzefl, this.zzdit);
        }
        zzafe zzafe = this.zzcxu;
        zzafg zzafg = this.zzcxv;
        zzv zzv = this.zzdix;
        zzbdv zzbdv = this.zzefl;
        zza(new AdOverlayInfoParcel(zztz, (zzp) zzbfs, zzafe, zzafg, zzv, zzbdv, z, i, str, zzbdv.zzyw()));
    }

    public final void zza(boolean z, int i, String str, String str2) {
        zzbfs zzbfs;
        boolean zzaak = this.zzefl.zzaak();
        zztz zztz = (!zzaak || this.zzefl.zzaad().zzaby()) ? this.zzcch : null;
        if (zzaak) {
            zzbfs = null;
        } else {
            zzbfs = new zzbfs(this.zzefl, this.zzdit);
        }
        zzafe zzafe = this.zzcxu;
        zzafg zzafg = this.zzcxv;
        zzv zzv = this.zzdix;
        zzbdv zzbdv = this.zzefl;
        zza(new AdOverlayInfoParcel(zztz, zzbfs, zzafe, zzafg, zzv, zzbdv, z, i, str, str2, zzbdv.zzyw()));
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

    public final void destroy() {
        zzaub zzaub = this.zzefw;
        if (zzaub != null) {
            zzaub.zzus();
            this.zzefw = null;
        }
        zzabd();
        this.zzejb.reset();
        this.zzejb.zzg(null);
        synchronized (this.lock) {
            this.zzcch = null;
            this.zzdit = null;
            this.zzefo = null;
            this.zzefp = null;
            this.zzcxu = null;
            this.zzcxv = null;
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

    public final void zzb(zzbga zzbga) {
        this.zzejb.zzg(zzbga.uri);
    }

    public final boolean zzc(zzbga zzbga) {
        String valueOf = String.valueOf(zzbga.url);
        zzawf.zzee(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uri = zzbga.uri;
        if (this.zzejb.zzg(uri)) {
            return true;
        }
        if (this.zzefr) {
            String scheme = uri.getScheme();
            if ("http".equalsIgnoreCase(scheme) || Constants.SCHEME.equalsIgnoreCase(scheme)) {
                zztz zztz = this.zzcch;
                if (zztz != null) {
                    zztz.onAdClicked();
                    zzaub zzaub = this.zzefw;
                    if (zzaub != null) {
                        zzaub.zzdw(zzbga.url);
                    }
                    this.zzcch = null;
                }
                return false;
            }
        }
        if (!this.zzefl.getWebView().willNotDraw()) {
            try {
                zzdq zzaai = this.zzefl.zzaai();
                if (zzaai != null && zzaai.zzb(uri)) {
                    uri = zzaai.zza(uri, this.zzefl.getContext(), this.zzefl.getView(), this.zzefl.zzys());
                }
            } catch (zzdt unused) {
                String valueOf2 = String.valueOf(zzbga.url);
                zzawf.zzfa(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
            }
            zzc zzc = this.zzcyp;
            if (zzc == null || zzc.zzjv()) {
                zza(new zzb("android.intent.action.VIEW", uri.toString(), (String) null, (String) null, (String) null, (String) null, (String) null));
            } else {
                this.zzcyp.zzbr(zzbga.url);
            }
        } else {
            String valueOf3 = String.valueOf(zzbga.url);
            zzawf.zzfa(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
        }
        return true;
    }

    @Nullable
    public final WebResourceResponse zzd(zzbga zzbga) {
        WebResourceResponse webResourceResponse;
        zzry zza;
        String str;
        zzaub zzaub = this.zzefw;
        if (zzaub != null) {
            zzaub.zza(zzbga.url, zzbga.zzab, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(zzbga.url).getName())) {
            webResourceResponse = null;
        } else {
            zzts();
            if (this.zzefl.zzaad().zzaby()) {
                str = (String) zzvh.zzpd().zzd(zzzx.zzcig);
            } else if (this.zzefl.zzaak()) {
                str = (String) zzvh.zzpd().zzd(zzzx.zzcif);
            } else {
                str = (String) zzvh.zzpd().zzd(zzzx.zzcie);
            }
            zzq.zzkv();
            webResourceResponse = zzawo.zzd(this.zzefl.getContext(), this.zzefl.zzyw().zzbmj, str);
        }
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        try {
            if (!zzaux.zzb(zzbga.url, this.zzefl.getContext(), this.zzdmq).equals(zzbga.url)) {
                return zze(zzbga);
            }
            zzrz zzbz = zzrz.zzbz(zzbga.url);
            if (zzbz != null && (zza = zzq.zzlb().zza(zzbz)) != null && zza.zzmu()) {
                return new WebResourceResponse("", "", zza.zzmv());
            }
            if (!zzazb.isEnabled() || !zzabh.zzcuv.get().booleanValue()) {
                return null;
            }
            return zze(zzbga);
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

    private final WebResourceResponse zze(zzbga zzbga) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(zzbga.url);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry next : zzbga.zzab.entrySet()) {
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
            zzazq.zzdxo.execute(new zzbfn(this));
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

    public final void zzh(Uri uri) {
        this.zzejb.zzh(uri);
    }

    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzefl.zzb(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }
}
