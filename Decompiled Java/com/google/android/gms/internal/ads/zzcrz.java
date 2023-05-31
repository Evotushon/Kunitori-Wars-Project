package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcrz extends zzvw {
    private final ViewGroup zzfgb;
    private final zzdeu zzfir;
    private final zzvk zzfmr;
    private final zzblg zzgfn;
    private final Context zzur;

    public zzcrz(Context context, @Nullable zzvk zzvk, zzdeu zzdeu, zzblg zzblg) {
        this.zzur = context;
        this.zzfmr = zzvk;
        this.zzfir = zzdeu;
        this.zzgfn = zzblg;
        FrameLayout frameLayout = new FrameLayout(this.zzur);
        frameLayout.removeAllViews();
        frameLayout.addView(this.zzgfn.zzagm(), zzq.zzkx().zzwu());
        frameLayout.setMinimumHeight(zzke().heightPixels);
        frameLayout.setMinimumWidth(zzke().widthPixels);
        this.zzfgb = frameLayout;
    }

    public final boolean isLoading() throws RemoteException {
        return false;
    }

    public final boolean isReady() throws RemoteException {
        return false;
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
    }

    public final void setUserId(String str) throws RemoteException {
    }

    public final void showInterstitial() throws RemoteException {
    }

    public final void stopLoading() throws RemoteException {
    }

    public final void zza(zzapl zzapl) throws RemoteException {
    }

    public final void zza(zzapr zzapr, String str) throws RemoteException {
    }

    public final void zza(zzasb zzasb) throws RemoteException {
    }

    public final void zza(zzrh zzrh) throws RemoteException {
    }

    public final void zza(zzur zzur2) throws RemoteException {
    }

    public final void zza(zzxp zzxp) throws RemoteException {
    }

    public final void zzbs(String str) throws RemoteException {
    }

    public final IObjectWrapper zzkc() throws RemoteException {
        return ObjectWrapper.wrap(this.zzfgb);
    }

    public final void destroy() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzgfn.destroy();
    }

    public final boolean zza(zzuh zzuh) throws RemoteException {
        zzawf.zzez("loadAd is not supported for a Publisher AdView returned from AdLoader.");
        return false;
    }

    public final void pause() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzgfn.zzahh().zzby((Context) null);
    }

    public final void resume() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzgfn.zzahh().zzbz((Context) null);
    }

    public final void zzkd() throws RemoteException {
        this.zzgfn.zzkd();
    }

    public final zzuk zzke() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return zzdex.zzb(this.zzur, Collections.singletonList(this.zzgfn.zzagl()));
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        if (this.zzgfn.zzahi() != null) {
            return this.zzgfn.zzahi().getMediationAdapterClassName();
        }
        return null;
    }

    public final zzxj getVideoController() throws RemoteException {
        return this.zzgfn.getVideoController();
    }

    public final String getAdUnitId() throws RemoteException {
        return this.zzfir.zzgqr;
    }

    public final zzwf zzkh() throws RemoteException {
        return this.zzfir.zzgqw;
    }

    public final zzvk zzki() throws RemoteException {
        return this.zzfmr;
    }

    public final String zzkf() throws RemoteException {
        if (this.zzgfn.zzahi() != null) {
            return this.zzgfn.zzahi().getMediationAdapterClassName();
        }
        return null;
    }

    public final zzxe zzkg() {
        return this.zzgfn.zzahi();
    }

    public final void zza(zzzc zzzc) throws RemoteException {
        zzawf.zzez("setVideoOptions is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzuk zzuk) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzblg zzblg = this.zzgfn;
        if (zzblg != null) {
            zzblg.zza(this.zzfgb, zzuk);
        }
    }

    public final void zza(zzaaq zzaaq) throws RemoteException {
        zzawf.zzez("setOnCustomRenderedAdLoadedListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzvj zzvj) throws RemoteException {
        zzawf.zzez("setAdClickListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzwl zzwl) throws RemoteException {
        zzawf.zzez("setCorrelationIdProvider is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
        zzawf.zzez("setManualImpressionsEnabled is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzvk zzvk) throws RemoteException {
        zzawf.zzez("setAdListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzwf zzwf) throws RemoteException {
        zzawf.zzez("setAppEventListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzwa zzwa) throws RemoteException {
        zzawf.zzez("setAdMetadataListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final Bundle getAdMetadata() throws RemoteException {
        zzawf.zzez("getAdMetadata is not supported in Publisher AdView returned by AdLoader.");
        return new Bundle();
    }

    public final void zza(zzxd zzxd) {
        zzawf.zzez("setOnPaidEventListener is not supported in Publisher AdView returned by AdLoader.");
    }
}
