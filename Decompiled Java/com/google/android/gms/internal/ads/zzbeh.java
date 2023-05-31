package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.overlay.zzb;
import com.google.android.gms.ads.internal.overlay.zze;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbeh extends FrameLayout implements zzbdv {
    /* access modifiers changed from: private */
    public final zzbdv zzegu;
    private final zzbbb zzegv;
    private final AtomicBoolean zzegw = new AtomicBoolean();

    public zzbeh(zzbdv zzbdv) {
        super(zzbdv.getContext());
        this.zzegu = zzbdv;
        this.zzegv = new zzbbb(zzbdv.zzaaa(), this, this);
        if (!zzaaw()) {
            addView(this.zzegu.getView());
        }
    }

    public final View getView() {
        return this;
    }

    public final zzbbb zzyp() {
        return this.zzegv;
    }

    public final void onPause() {
        this.zzegv.onPause();
        this.zzegu.onPause();
    }

    public final void zzaal() {
        this.zzegv.onDestroy();
        this.zzegu.zzaal();
    }

    public final void zzaar() {
        setBackgroundColor(0);
        this.zzegu.setBackgroundColor(0);
    }

    public final int zzyx() {
        return getMeasuredHeight();
    }

    public final int zzyy() {
        return getMeasuredWidth();
    }

    public final void zzyz() {
        this.zzegu.zzyz();
    }

    public final WebView getWebView() {
        return this.zzegu.getWebView();
    }

    public final void zza(String str, Map<String, ?> map) {
        this.zzegu.zza(str, map);
    }

    public final void zza(String str, JSONObject jSONObject) {
        this.zzegu.zza(str, jSONObject);
    }

    public final void zza(String str, zzafz<? super zzbdv> zzafz) {
        this.zzegu.zza(str, zzafz);
    }

    public final void zzb(String str, zzafz<? super zzbdv> zzafz) {
        this.zzegu.zzb(str, zzafz);
    }

    public final void zza(String str, Predicate<zzafz<? super zzbdv>> predicate) {
        this.zzegu.zza(str, predicate);
    }

    public final void zzzy() {
        this.zzegu.zzzy();
    }

    public final void zzde(int i) {
        this.zzegu.zzde(i);
    }

    public final void zztw() {
        this.zzegu.zztw();
    }

    public final void zzzz() {
        this.zzegu.zzzz();
    }

    public final void zza(boolean z, long j) {
        this.zzegu.zza(z, j);
    }

    public final void zzcz(String str) {
        this.zzegu.zzcz(str);
    }

    public final void zzb(String str, JSONObject jSONObject) {
        this.zzegu.zzb(str, jSONObject);
    }

    public final Activity zzys() {
        return this.zzegu.zzys();
    }

    public final Context zzaaa() {
        return this.zzegu.zzaaa();
    }

    public final zza zzyt() {
        return this.zzegu.zzyt();
    }

    public final zze zzaab() {
        return this.zzegu.zzaab();
    }

    public final IObjectWrapper zzaaj() {
        return this.zzegu.zzaaj();
    }

    public final zze zzaac() {
        return this.zzegu.zzaac();
    }

    public final zzbfl zzaad() {
        return this.zzegu.zzaad();
    }

    public final String zzaae() {
        return this.zzegu.zzaae();
    }

    public final zzbfi zzaaf() {
        return this.zzegu.zzaaf();
    }

    public final WebViewClient zzaag() {
        return this.zzegu.zzaag();
    }

    public final boolean zzaah() {
        return this.zzegu.zzaah();
    }

    public final zzdq zzaai() {
        return this.zzegu.zzaai();
    }

    public final zzazo zzyw() {
        return this.zzegu.zzyw();
    }

    public final boolean zzaak() {
        return this.zzegu.zzaak();
    }

    public final boolean isDestroyed() {
        return this.zzegu.isDestroyed();
    }

    public final boolean zzaam() {
        return this.zzegu.zzaam();
    }

    public final void zzkb() {
        this.zzegu.zzkb();
    }

    public final void zzka() {
        this.zzegu.zzka();
    }

    public final String zzyu() {
        return this.zzegu.zzyu();
    }

    public final zzaai zzyr() {
        return this.zzegu.zzyr();
    }

    public final zzaal zzyv() {
        return this.zzegu.zzyv();
    }

    public final zzbeq zzyq() {
        return this.zzegu.zzyq();
    }

    public final void zza(zze zze) {
        this.zzegu.zza(zze);
    }

    public final void zzap(IObjectWrapper iObjectWrapper) {
        this.zzegu.zzap(iObjectWrapper);
    }

    public final void zza(zzbfl zzbfl) {
        this.zzegu.zza(zzbfl);
    }

    public final void zzax(boolean z) {
        this.zzegu.zzax(z);
    }

    public final void zzaao() {
        this.zzegu.zzaao();
    }

    public final void zzbu(Context context) {
        this.zzegu.zzbu(context);
    }

    public final void zzal(boolean z) {
        this.zzegu.zzal(z);
    }

    public final void setRequestedOrientation(int i) {
        this.zzegu.setRequestedOrientation(i);
    }

    public final void zzb(zze zze) {
        this.zzegu.zzb(zze);
    }

    public final void zzay(boolean z) {
        this.zzegu.zzay(z);
    }

    public final void zza(String str, zzbda zzbda) {
        this.zzegu.zza(str, zzbda);
    }

    public final zzbda zzff(String str) {
        return this.zzegu.zzff(str);
    }

    public final void zzaap() {
        this.zzegu.zzaap();
    }

    public final void destroy() {
        IObjectWrapper zzaaj = zzaaj();
        if (zzaaj != null) {
            zzawo.zzdtx.post(new zzbek(zzaaj));
            zzawo.zzdtx.postDelayed(new zzbej(this), (long) ((Integer) zzvh.zzpd().zzd(zzzx.zzcpa)).intValue());
            return;
        }
        this.zzegu.destroy();
    }

    public final void loadData(String str, String str2, String str3) {
        this.zzegu.loadData(str, str2, str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zzegu.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final void loadUrl(String str) {
        this.zzegu.loadUrl(str);
    }

    public final void zzb(String str, String str2, @Nullable String str3) {
        this.zzegu.zzb(str, str2, str3);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zzegu.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zzegu.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zzegu.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zzegu.setWebViewClient(webViewClient);
    }

    public final void onResume() {
        this.zzegu.onResume();
    }

    public final void zzaas() {
        TextView textView = new TextView(getContext());
        Resources resources = zzq.zzkz().getResources();
        textView.setText(resources != null ? resources.getString(R.string.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    public final void zzba(boolean z) {
        this.zzegu.zzba(z);
    }

    public final void zza(zzaca zzaca) {
        this.zzegu.zza(zzaca);
    }

    public final void zza(zzrb zzrb) {
        this.zzegu.zza(zzrb);
    }

    public final zzrb zzaat() {
        return this.zzegu.zzaat();
    }

    public final void zza(zzpu zzpu) {
        this.zzegu.zza(zzpu);
    }

    public final void zza(@Nullable zzacf zzacf) {
        this.zzegu.zza(zzacf);
    }

    @Nullable
    public final zzacf zzaaq() {
        return this.zzegu.zzaaq();
    }

    public final void zza(zzbeq zzbeq) {
        this.zzegu.zza(zzbeq);
    }

    public final boolean zzaan() {
        return this.zzegu.zzaan();
    }

    public final void zzaz(boolean z) {
        this.zzegu.zzaz(z);
    }

    public final void zzav(boolean z) {
        this.zzegu.zzav(z);
    }

    public final void zztx() {
        this.zzegu.zztx();
    }

    public final void zza(zzb zzb) {
        this.zzegu.zza(zzb);
    }

    public final void zzc(boolean z, int i) {
        this.zzegu.zzc(z, i);
    }

    public final void zza(boolean z, int i, String str) {
        this.zzegu.zza(z, i, str);
    }

    public final void zza(boolean z, int i, String str, String str2) {
        this.zzegu.zza(z, i, str, str2);
    }

    public final boolean zzb(boolean z, int i) {
        if (!this.zzegw.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcjl)).booleanValue()) {
            return false;
        }
        if (this.zzegu.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.zzegu.getParent()).removeView(this.zzegu.getView());
        }
        return this.zzegu.zzb(z, i);
    }

    public final boolean zzaau() {
        return this.zzegw.get();
    }

    public final void zza(ViewGroup viewGroup, Activity activity, String str, String str2) {
        this.zzegu.zza(this, activity, str, str2);
    }

    public final zzrp zzaav() {
        return this.zzegu.zzaav();
    }

    public final boolean zzaaw() {
        return this.zzegu.zzaaw();
    }
}
