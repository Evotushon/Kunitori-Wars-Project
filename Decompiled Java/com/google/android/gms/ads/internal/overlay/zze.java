package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaak;
import com.google.android.gms.internal.ads.zzafy;
import com.google.android.gms.internal.ads.zzaoz;
import com.google.android.gms.internal.ads.zzape;
import com.google.android.gms.internal.ads.zzaub;
import com.google.android.gms.internal.ads.zzawf;
import com.google.android.gms.internal.ads.zzawo;
import com.google.android.gms.internal.ads.zzawu;
import com.google.android.gms.internal.ads.zzbdv;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzdq;
import com.google.android.gms.internal.ads.zzrp;
import com.google.android.gms.internal.ads.zzsn;
import com.google.android.gms.internal.ads.zztz;
import com.google.android.gms.internal.ads.zzvh;
import com.google.android.gms.internal.ads.zzzx;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zze extends zzape implements zzw {
    @VisibleForTesting
    private static final int zzdhu = Color.argb(0, 0, 0, 0);
    @VisibleForTesting
    private boolean zzblg = false;
    @VisibleForTesting
    zzbdv zzdae;
    @VisibleForTesting
    AdOverlayInfoParcel zzdhv;
    @VisibleForTesting
    private zzk zzdhw;
    @VisibleForTesting
    private zzo zzdhx;
    @VisibleForTesting
    private boolean zzdhy = false;
    @VisibleForTesting
    private FrameLayout zzdhz;
    @VisibleForTesting
    private WebChromeClient.CustomViewCallback zzdia;
    @VisibleForTesting
    private boolean zzdib = false;
    @VisibleForTesting
    private zzh zzdic;
    @VisibleForTesting
    private boolean zzdid = false;
    @VisibleForTesting
    int zzdie = 0;
    private final Object zzdif = new Object();
    private Runnable zzdig;
    private boolean zzdih;
    private boolean zzdii;
    private boolean zzdij = false;
    private boolean zzdik = false;
    private boolean zzdil = true;
    protected final Activity zzzo;

    public zze(Activity activity) {
        this.zzzo = activity;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onRestart() {
    }

    public final void close() {
        this.zzdie = 2;
        this.zzzo.finish();
    }

    public final void zztp() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdhv;
        if (adOverlayInfoParcel != null && this.zzdhy) {
            setRequestedOrientation(adOverlayInfoParcel.orientation);
        }
        if (this.zzdhz != null) {
            this.zzzo.setContentView(this.zzdic);
            this.zzdii = true;
            this.zzdhz.removeAllViews();
            this.zzdhz = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzdia;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzdia = null;
        }
        this.zzdhy = false;
    }

    public final void zztq() {
        this.zzdie = 1;
        this.zzzo.finish();
    }

    public final void onBackPressed() {
        this.zzdie = 0;
    }

    public final boolean zztr() {
        this.zzdie = 0;
        zzbdv zzbdv = this.zzdae;
        if (zzbdv == null) {
            return true;
        }
        boolean zzaam = zzbdv.zzaam();
        if (!zzaam) {
            this.zzdae.zza("onbackblocked", (Map<String, ?>) Collections.emptyMap());
        }
        return zzaam;
    }

    public void onCreate(Bundle bundle) {
        this.zzzo.requestWindowFeature(1);
        this.zzdib = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            this.zzdhv = AdOverlayInfoParcel.zzc(this.zzzo.getIntent());
            if (this.zzdhv != null) {
                if (this.zzdhv.zzblu.zzdxg > 7500000) {
                    this.zzdie = 3;
                }
                if (this.zzzo.getIntent() != null) {
                    this.zzdil = this.zzzo.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                if (this.zzdhv.zzdja != null) {
                    this.zzblg = this.zzdhv.zzdja.zzblg;
                } else {
                    this.zzblg = false;
                }
                if (this.zzblg && this.zzdhv.zzdja.zzbll != -1) {
                    new zzj(this).zzvw();
                }
                if (bundle == null) {
                    if (this.zzdhv.zzdit != null && this.zzdil) {
                        this.zzdhv.zzdit.zztk();
                    }
                    if (!(this.zzdhv.zzdiy == 1 || this.zzdhv.zzcch == null)) {
                        this.zzdhv.zzcch.onAdClicked();
                    }
                }
                this.zzdic = new zzh(this.zzzo, this.zzdhv.zzdiz, this.zzdhv.zzblu.zzbmj);
                this.zzdic.setId(1000);
                zzq.zzkx().zzg(this.zzzo);
                int i = this.zzdhv.zzdiy;
                if (i == 1) {
                    zzak(false);
                } else if (i == 2) {
                    this.zzdhw = new zzk(this.zzdhv.zzdae);
                    zzak(false);
                } else if (i == 3) {
                    zzak(true);
                } else {
                    throw new zzi("Could not determine ad overlay type.");
                }
            } else {
                throw new zzi("Could not get info for ad overlay.");
            }
        } catch (zzi e) {
            zzawf.zzfa(e.getMessage());
            this.zzdie = 3;
            this.zzzo.finish();
        }
    }

    public final void onStart() {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcoq)).booleanValue()) {
            zzbdv zzbdv = this.zzdae;
            if (zzbdv == null || zzbdv.isDestroyed()) {
                zzawf.zzfa("The webview does not exist. Ignoring action.");
                return;
            }
            zzq.zzkx();
            zzawu.zzb(this.zzdae);
        }
    }

    public final void onResume() {
        if (this.zzdhv.zzdit != null) {
            this.zzdhv.zzdit.onResume();
        }
        zza(this.zzzo.getResources().getConfiguration());
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcoq)).booleanValue()) {
            zzbdv zzbdv = this.zzdae;
            if (zzbdv == null || zzbdv.isDestroyed()) {
                zzawf.zzfa("The webview does not exist. Ignoring action.");
                return;
            }
            zzq.zzkx();
            zzawu.zzb(this.zzdae);
        }
    }

    public final void onPause() {
        zztp();
        if (this.zzdhv.zzdit != null) {
            this.zzdhv.zzdit.onPause();
        }
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcoq)).booleanValue() && this.zzdae != null && (!this.zzzo.isFinishing() || this.zzdhw == null)) {
            zzq.zzkx();
            zzawu.zza(this.zzdae);
        }
        zztt();
    }

    public final void zzad(IObjectWrapper iObjectWrapper) {
        zza((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdib);
    }

    public final void onStop() {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcoq)).booleanValue() && this.zzdae != null && (!this.zzzo.isFinishing() || this.zzdhw == null)) {
            zzq.zzkx();
            zzawu.zza(this.zzdae);
        }
        zztt();
    }

    public final void onDestroy() {
        zzbdv zzbdv = this.zzdae;
        if (zzbdv != null) {
            try {
                this.zzdic.removeView(zzbdv.getView());
            } catch (NullPointerException unused) {
            }
        }
        zztt();
    }

    private final void zzaj(boolean z) {
        int intValue = ((Integer) zzvh.zzpd().zzd(zzzx.zzcos)).intValue();
        zzr zzr = new zzr();
        zzr.size = 50;
        zzr.paddingLeft = z ? intValue : 0;
        zzr.paddingRight = z ? 0 : intValue;
        zzr.paddingTop = 0;
        zzr.paddingBottom = intValue;
        this.zzdhx = new zzo(this.zzzo, zzr, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        zza(z, this.zzdhv.zzdiv);
        this.zzdic.addView(this.zzdhx, layoutParams);
    }

    public final void zzdk() {
        this.zzdii = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r0 = r6.zzdhv;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(boolean r7, boolean r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzzx.zzcka
            com.google.android.gms.internal.ads.zzzt r1 = com.google.android.gms.internal.ads.zzvh.zzpd()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0026
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.zzdhv
            if (r0 == 0) goto L_0x0026
            com.google.android.gms.ads.internal.zzg r0 = r0.zzdja
            if (r0 == 0) goto L_0x0026
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.zzdhv
            com.google.android.gms.ads.internal.zzg r0 = r0.zzdja
            boolean r0 = r0.zzbln
            if (r0 == 0) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.zzzx.zzckb
            com.google.android.gms.internal.ads.zzzt r4 = com.google.android.gms.internal.ads.zzvh.zzpd()
            java.lang.Object r3 = r4.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x004b
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.zzdhv
            if (r3 == 0) goto L_0x004b
            com.google.android.gms.ads.internal.zzg r3 = r3.zzdja
            if (r3 == 0) goto L_0x004b
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.zzdhv
            com.google.android.gms.ads.internal.zzg r3 = r3.zzdja
            boolean r3 = r3.zzblo
            if (r3 == 0) goto L_0x004b
            r3 = 1
            goto L_0x004c
        L_0x004b:
            r3 = 0
        L_0x004c:
            if (r7 == 0) goto L_0x0062
            if (r8 == 0) goto L_0x0062
            if (r0 == 0) goto L_0x0062
            if (r3 != 0) goto L_0x0062
            com.google.android.gms.internal.ads.zzaow r7 = new com.google.android.gms.internal.ads.zzaow
            com.google.android.gms.internal.ads.zzbdv r4 = r6.zzdae
            java.lang.String r5 = "useCustomClose"
            r7.<init>(r4, r5)
            java.lang.String r4 = "Custom close has been disabled for interstitial ads in this ad slot."
            r7.zzdt(r4)
        L_0x0062:
            com.google.android.gms.ads.internal.overlay.zzo r7 = r6.zzdhx
            if (r7 == 0) goto L_0x0071
            if (r3 != 0) goto L_0x006e
            if (r8 == 0) goto L_0x006d
            if (r0 != 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r1 = 0
        L_0x006e:
            r7.zzal(r1)
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zze.zza(boolean, boolean):void");
    }

    public final void zzts() {
        this.zzdic.removeView(this.zzdhx);
        zzaj(true);
    }

    public final void setRequestedOrientation(int i) {
        if (this.zzzo.getApplicationInfo().targetSdkVersion >= ((Integer) zzvh.zzpd().zzd(zzzx.zzcqq)).intValue()) {
            if (this.zzzo.getApplicationInfo().targetSdkVersion <= ((Integer) zzvh.zzpd().zzd(zzzx.zzcqr)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzvh.zzpd().zzd(zzzx.zzcqs)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzvh.zzpd().zzd(zzzx.zzcqt)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzzo.setRequestedOrientation(i);
        } catch (Throwable th) {
            zzq.zzkz().zzb(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zza(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.zzdhz = new FrameLayout(this.zzzo);
        this.zzdhz.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzdhz.addView(view, -1, -1);
        this.zzzo.setContentView(this.zzdhz);
        this.zzdii = true;
        this.zzdia = customViewCallback;
        this.zzdhy = true;
    }

    private final void zzak(boolean z) throws zzi {
        if (!this.zzdii) {
            this.zzzo.requestWindowFeature(1);
        }
        Window window = this.zzzo.getWindow();
        if (window != null) {
            zzbfi zzaaf = this.zzdhv.zzdae != null ? this.zzdhv.zzdae.zzaaf() : null;
            boolean z2 = false;
            boolean z3 = zzaaf != null && zzaaf.zzaay();
            this.zzdid = false;
            if (z3) {
                int i = this.zzdhv.orientation;
                zzq.zzkx();
                if (i == 6) {
                    if (this.zzzo.getResources().getConfiguration().orientation == 1) {
                        z2 = true;
                    }
                    this.zzdid = z2;
                } else {
                    int i2 = this.zzdhv.orientation;
                    zzq.zzkx();
                    if (i2 == 7) {
                        if (this.zzzo.getResources().getConfiguration().orientation == 2) {
                            z2 = true;
                        }
                        this.zzdid = z2;
                    }
                }
            }
            boolean z4 = this.zzdid;
            StringBuilder sb = new StringBuilder(46);
            sb.append("Delay onShow to next orientation change: ");
            sb.append(z4);
            zzawf.zzeb(sb.toString());
            setRequestedOrientation(this.zzdhv.orientation);
            zzq.zzkx();
            window.setFlags(16777216, 16777216);
            zzawf.zzeb("Hardware acceleration on the AdActivity window enabled.");
            if (!this.zzblg) {
                this.zzdic.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            } else {
                this.zzdic.setBackgroundColor(zzdhu);
            }
            this.zzzo.setContentView(this.zzdic);
            this.zzdii = true;
            if (z) {
                try {
                    zzq.zzkw();
                    this.zzdae = zzbee.zza(this.zzzo, this.zzdhv.zzdae != null ? this.zzdhv.zzdae.zzaad() : null, this.zzdhv.zzdae != null ? this.zzdhv.zzdae.zzaae() : null, true, z3, (zzdq) null, this.zzdhv.zzblu, (zzaak) null, (zzi) null, this.zzdhv.zzdae != null ? this.zzdhv.zzdae.zzyt() : null, zzsn.zzmy(), (zzrp) null, false);
                    this.zzdae.zzaaf().zza((zztz) null, this.zzdhv.zzcxu, (zzp) null, this.zzdhv.zzcxv, this.zzdhv.zzdix, true, (zzafy) null, this.zzdhv.zzdae != null ? this.zzdhv.zzdae.zzaaf().zzaax() : null, (zzaoz) null, (zzaub) null);
                    this.zzdae.zzaaf().zza((zzbfh) new zzd(this));
                    if (this.zzdhv.url != null) {
                        this.zzdae.loadUrl(this.zzdhv.url);
                    } else if (this.zzdhv.zzdiw != null) {
                        this.zzdae.loadDataWithBaseURL(this.zzdhv.zzdiu, this.zzdhv.zzdiw, "text/html", Constants.ENCODING, (String) null);
                    } else {
                        throw new zzi("No URL or HTML to display in ad overlay.");
                    }
                    if (this.zzdhv.zzdae != null) {
                        this.zzdhv.zzdae.zzb(this);
                    }
                } catch (Exception e) {
                    zzawf.zzc("Error obtaining webview.", e);
                    throw new zzi("Could not obtain webview for the overlay.");
                }
            } else {
                this.zzdae = this.zzdhv.zzdae;
                this.zzdae.zzbu(this.zzzo);
            }
            this.zzdae.zza(this);
            if (this.zzdhv.zzdae != null) {
                zzc(this.zzdhv.zzdae.zzaaj(), this.zzdic);
            }
            ViewParent parent = this.zzdae.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.zzdae.getView());
            }
            if (this.zzblg) {
                this.zzdae.zzaar();
            }
            this.zzdae.zza((ViewGroup) null, this.zzzo, this.zzdhv.zzdiu, this.zzdhv.zzdiw);
            this.zzdic.addView(this.zzdae.getView(), -1, -1);
            if (!z && !this.zzdid) {
                zztw();
            }
            zzaj(z3);
            if (this.zzdae.zzaah()) {
                zza(z3, true);
                return;
            }
            return;
        }
        throw new zzi("Invalid activity, no window available.");
    }

    private final void zztt() {
        if (this.zzzo.isFinishing() && !this.zzdij) {
            this.zzdij = true;
            zzbdv zzbdv = this.zzdae;
            if (zzbdv != null) {
                zzbdv.zzde(this.zzdie);
                synchronized (this.zzdif) {
                    if (!this.zzdih && this.zzdae.zzaan()) {
                        this.zzdig = new zzg(this);
                        zzawo.zzdtx.postDelayed(this.zzdig, ((Long) zzvh.zzpd().zzd(zzzx.zzcjz)).longValue());
                        return;
                    }
                }
            }
            zztu();
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zztu() {
        if (!this.zzdik) {
            this.zzdik = true;
            zzbdv zzbdv = this.zzdae;
            if (zzbdv != null) {
                this.zzdic.removeView(zzbdv.getView());
                zzk zzk = this.zzdhw;
                if (zzk != null) {
                    this.zzdae.zzbu(zzk.zzur);
                    this.zzdae.zzax(false);
                    this.zzdhw.parent.addView(this.zzdae.getView(), this.zzdhw.index, this.zzdhw.zzdip);
                    this.zzdhw = null;
                } else if (this.zzzo.getApplicationContext() != null) {
                    this.zzdae.zzbu(this.zzzo.getApplicationContext());
                }
                this.zzdae = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzdhv;
            if (!(adOverlayInfoParcel == null || adOverlayInfoParcel.zzdit == null)) {
                this.zzdhv.zzdit.zztj();
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdhv;
            if (adOverlayInfoParcel2 != null && adOverlayInfoParcel2.zzdae != null) {
                zzc(this.zzdhv.zzdae.zzaaj(), this.zzdhv.zzdae.getView());
            }
        }
    }

    private static void zzc(@Nullable IObjectWrapper iObjectWrapper, @Nullable View view) {
        if (iObjectWrapper != null && view != null) {
            zzq.zzlk().zza(iObjectWrapper, view);
        }
    }

    public final void zztv() {
        if (this.zzdid) {
            this.zzdid = false;
            zztw();
        }
    }

    private final void zztw() {
        this.zzdae.zztw();
    }

    public final void zztx() {
        this.zzdic.zzdin = true;
    }

    public final void zzty() {
        synchronized (this.zzdif) {
            this.zzdih = true;
            if (this.zzdig != null) {
                zzawo.zzdtx.removeCallbacks(this.zzdig);
                zzawo.zzdtx.post(this.zzdig);
            }
        }
    }

    private final void zza(Configuration configuration) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdhv;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel2 == null || adOverlayInfoParcel2.zzdja == null || !this.zzdhv.zzdja.zzblh) ? false : true;
        boolean zza = zzq.zzkx().zza(this.zzzo, configuration);
        if ((this.zzblg && !z3) || zza) {
            z = false;
        } else if (Build.VERSION.SDK_INT >= 19 && (adOverlayInfoParcel = this.zzdhv) != null && adOverlayInfoParcel.zzdja != null && this.zzdhv.zzdja.zzblm) {
            z2 = true;
        }
        Window window = this.zzzo.getWindow();
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzckc)).booleanValue() && Build.VERSION.SDK_INT >= 19) {
            View decorView = window.getDecorView();
            int i = 256;
            if (z) {
                i = 5380;
                if (z2) {
                    i = 5894;
                }
            }
            decorView.setSystemUiVisibility(i);
        } else if (z) {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (Build.VERSION.SDK_INT >= 19 && z2) {
                window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            }
        } else {
            window.addFlags(2048);
            window.clearFlags(1024);
        }
    }
}
