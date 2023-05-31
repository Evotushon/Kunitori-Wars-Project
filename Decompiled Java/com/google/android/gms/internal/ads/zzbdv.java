package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.zze;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public interface zzbdv extends zzi, zzaia, zzajb, zzbbm, zzbev, zzbey, zzbfc, zzbfd, zzbff, zzbfg, zzpt {
    void destroy();

    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    View getView();

    WebView getWebView();

    int getWidth();

    boolean isDestroyed();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, @Nullable String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void zza(ViewGroup viewGroup, Activity activity, String str, String str2);

    void zza(zze zze);

    void zza(zzaca zzaca);

    void zza(zzacf zzacf);

    void zza(zzbeq zzbeq);

    void zza(zzbfl zzbfl);

    void zza(zzrb zzrb);

    void zza(String str, Predicate<zzafz<? super zzbdv>> predicate);

    void zza(String str, zzafz<? super zzbdv> zzafz);

    void zza(String str, zzbda zzbda);

    Context zzaaa();

    zze zzaab();

    zze zzaac();

    zzbfl zzaad();

    String zzaae();

    @Nullable
    zzbfi zzaaf();

    WebViewClient zzaag();

    boolean zzaah();

    zzdq zzaai();

    @Nullable
    IObjectWrapper zzaaj();

    boolean zzaak();

    void zzaal();

    boolean zzaam();

    boolean zzaan();

    void zzaao();

    void zzaap();

    zzacf zzaaq();

    void zzaar();

    void zzaas();

    zzrb zzaat();

    boolean zzaau();

    zzrp zzaav();

    boolean zzaaw();

    void zzal(boolean z);

    void zzap(IObjectWrapper iObjectWrapper);

    void zzax(boolean z);

    void zzay(boolean z);

    void zzaz(boolean z);

    void zzb(zze zze);

    void zzb(String str, zzafz<? super zzbdv> zzafz);

    void zzb(String str, String str2, @Nullable String str3);

    boolean zzb(boolean z, int i);

    void zzba(boolean z);

    void zzbu(Context context);

    void zzde(int i);

    void zztw();

    @Nullable
    zzbeq zzyq();

    Activity zzys();

    zza zzyt();

    zzaal zzyv();

    zzazo zzyw();

    void zzzy();

    void zzzz();
}
