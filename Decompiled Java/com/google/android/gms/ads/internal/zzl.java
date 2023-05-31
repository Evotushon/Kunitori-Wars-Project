package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaaq;
import com.google.android.gms.internal.ads.zzabb;
import com.google.android.gms.internal.ads.zzapl;
import com.google.android.gms.internal.ads.zzapr;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzawf;
import com.google.android.gms.internal.ads.zzayx;
import com.google.android.gms.internal.ads.zzazo;
import com.google.android.gms.internal.ads.zzazq;
import com.google.android.gms.internal.ads.zzdq;
import com.google.android.gms.internal.ads.zzdt;
import com.google.android.gms.internal.ads.zzrh;
import com.google.android.gms.internal.ads.zzuh;
import com.google.android.gms.internal.ads.zzuk;
import com.google.android.gms.internal.ads.zzur;
import com.google.android.gms.internal.ads.zzvh;
import com.google.android.gms.internal.ads.zzvj;
import com.google.android.gms.internal.ads.zzvk;
import com.google.android.gms.internal.ads.zzvw;
import com.google.android.gms.internal.ads.zzwa;
import com.google.android.gms.internal.ads.zzwf;
import com.google.android.gms.internal.ads.zzwl;
import com.google.android.gms.internal.ads.zzxd;
import com.google.android.gms.internal.ads.zzxe;
import com.google.android.gms.internal.ads.zzxj;
import com.google.android.gms.internal.ads.zzxp;
import com.google.android.gms.internal.ads.zzzc;
import java.util.Map;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzl extends zzvw {
    /* access modifiers changed from: private */
    public final zzazo zzblu;
    private final zzuk zzblv;
    /* access modifiers changed from: private */
    public final Future<zzdq> zzblw = zzazq.zzdxk.zzd(new zzm(this));
    private final zzo zzblx;
    /* access modifiers changed from: private */
    @Nullable
    public WebView zzbly = new WebView(this.zzur);
    /* access modifiers changed from: private */
    @Nullable
    public zzvk zzblz;
    /* access modifiers changed from: private */
    @Nullable
    public zzdq zzbma;
    private AsyncTask<Void, Void, String> zzbmb;
    /* access modifiers changed from: private */
    public final Context zzur;

    public zzl(Context context, zzuk zzuk, String str, zzazo zzazo) {
        this.zzur = context;
        this.zzblu = zzazo;
        this.zzblv = zzuk;
        this.zzblx = new zzo(context, str);
        zzbm(0);
        this.zzbly.setVerticalScrollBarEnabled(false);
        this.zzbly.getSettings().setJavaScriptEnabled(true);
        this.zzbly.setWebViewClient(new zzk(this));
        this.zzbly.setOnTouchListener(new zzn(this));
    }

    @Nullable
    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    @Nullable
    public final zzxj getVideoController() {
        return null;
    }

    public final boolean isLoading() throws RemoteException {
        return false;
    }

    public final boolean isReady() throws RemoteException {
        return false;
    }

    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
    }

    public final void stopLoading() throws RemoteException {
    }

    public final void zza(zzxd zzxd) {
    }

    @Nullable
    public final String zzkf() throws RemoteException {
        return null;
    }

    @Nullable
    public final zzxe zzkg() {
        return null;
    }

    public final IObjectWrapper zzkc() throws RemoteException {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzbly);
    }

    public final void destroy() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzbmb.cancel(true);
        this.zzblw.cancel(true);
        this.zzbly.destroy();
        this.zzbly = null;
    }

    public final boolean zza(zzuh zzuh) throws RemoteException {
        Preconditions.checkNotNull(this.zzbly, "This Search Ad has already been torn down");
        this.zzblx.zza(zzuh, this.zzblu);
        this.zzbmb = new zzp(this, (zzk) null).execute(new Void[0]);
        return true;
    }

    public final void pause() throws RemoteException {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    public final void resume() throws RemoteException {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    public final void zza(zzvk zzvk) throws RemoteException {
        this.zzblz = zzvk;
    }

    public final void zza(zzwf zzwf) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzwa zzwa) {
        throw new IllegalStateException("Unused method");
    }

    public final Bundle getAdMetadata() {
        throw new IllegalStateException("Unused method");
    }

    public final void showInterstitial() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzkd() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final zzuk zzke() throws RemoteException {
        return this.zzblv;
    }

    public final void zza(zzuk zzuk) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public final void zza(zzapl zzapl) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzapr zzapr, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final zzwf zzkh() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final zzvk zzki() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final void zza(zzaaq zzaaq) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzvj zzvj) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzwl zzwl) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzasb zzasb) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void setUserId(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzbs(String str) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzzc zzzc) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzxp zzxp) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzur zzur2) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzrh zzrh) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void setImmersiveMode(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final int zzbt(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            zzvh.zzoz();
            return zzayx.zzb(this.zzur, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzbm(int i) {
        if (this.zzbly != null) {
            this.zzbly.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final String zzkj() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath(zzabb.zzcts.get());
        builder.appendQueryParameter(SearchIntents.EXTRA_QUERY, this.zzblx.getQuery());
        builder.appendQueryParameter("pubId", this.zzblx.zzkm());
        Map<String, String> zzkn = this.zzblx.zzkn();
        for (String next : zzkn.keySet()) {
            builder.appendQueryParameter(next, zzkn.get(next));
        }
        Uri build = builder.build();
        zzdq zzdq = this.zzbma;
        if (zzdq != null) {
            try {
                build = zzdq.zza(build, this.zzur);
            } catch (zzdt e) {
                zzawf.zzd("Unable to process ad data", e);
            }
        }
        String zzkk = zzkk();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(String.valueOf(zzkk).length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(zzkk);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final String zzkk() {
        String zzkl = this.zzblx.zzkl();
        if (TextUtils.isEmpty(zzkl)) {
            zzkl = "www.google.com";
        }
        String str = zzabb.zzcts.get();
        StringBuilder sb = new StringBuilder(String.valueOf(zzkl).length() + 8 + String.valueOf(str).length());
        sb.append("https://");
        sb.append(zzkl);
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public final String zzbu(String str) {
        if (this.zzbma == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.zzbma.zza(parse, this.zzur, (View) null, (Activity) null);
        } catch (zzdt e) {
            zzawf.zzd("Unable to process ad data", e);
        }
        return parse.toString();
    }

    /* access modifiers changed from: private */
    public final void zzbv(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.zzur.startActivity(intent);
    }
}
