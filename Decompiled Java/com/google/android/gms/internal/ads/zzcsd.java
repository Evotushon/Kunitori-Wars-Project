package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpt;
import com.google.android.gms.internal.ads.zzbtl;
import java.util.Collections;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcsd extends zzvw implements zzbsj {
    /* access modifiers changed from: private */
    public final ViewGroup zzfgb;
    private final zzbgk zzgcx;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    @Nullable
    public zzblg zzgfn;
    private final Context zzgfp;
    @GuardedBy("this")
    private final zzdew zzgfq = new zzdew();
    private final zzcsg zzgfu = new zzcsg();
    private final zzcsh zzgfv = new zzcsh();
    private final zzcsj zzgfw = new zzcsj();
    private final zzcsf zzgfx = new zzcsf();
    /* access modifiers changed from: private */
    public final zzbsf zzgfy;
    @GuardedBy("this")
    @Nullable
    private zzaaq zzgfz;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    @Nullable
    public zzdof<zzblg> zzgga;

    public zzcsd(zzbgk zzbgk, Context context, zzuk zzuk, String str) {
        this.zzfgb = new FrameLayout(context);
        this.zzgcx = zzbgk;
        this.zzgfp = context;
        this.zzgfq.zzd(zzuk).zzgn(str);
        this.zzgfy = zzbgk.zzacj();
        this.zzgfy.zza(this, this.zzgcx.zzacf());
    }

    public final boolean isReady() {
        return false;
    }

    public final void setImmersiveMode(boolean z) {
    }

    public final void setUserId(String str) {
    }

    public final void showInterstitial() {
    }

    public final void stopLoading() {
    }

    public final void zza(zzapl zzapl) {
    }

    public final void zza(zzapr zzapr, String str) {
    }

    public final void zza(zzasb zzasb) {
    }

    public final void zza(zzrh zzrh) {
    }

    public final void zza(zzur zzur) {
    }

    public final void zza(zzxp zzxp) {
    }

    public final void zzbs(String str) {
    }

    public final IObjectWrapper zzkc() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzfgb);
    }

    public final synchronized boolean zza(zzuh zzuh) {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (this.zzgga != null) {
            return false;
        }
        zzdfc.zze(this.zzgfp, zzuh.zzccp);
        zzdeu zzarb = this.zzgfq.zzg(zzuh).zzarb();
        if (!zzabk.zzcvb.get().booleanValue() || !this.zzgfq.zzke().zzcdg || this.zzgfu == null) {
            zzbmc zzb = zzb(zzarb);
            this.zzgga = zzb.zzadx().zzahq();
            zzdnt.zza(this.zzgga, new zzcsc(this, zzb), this.zzgcx.zzacf());
            return true;
        }
        this.zzgfu.onAdFailedToLoad(1);
        return false;
    }

    private final synchronized zzbmc zzb(zzdeu zzdeu) {
        return this.zzgcx.zzacm().zzc(new zzbpt.zza().zzcc(this.zzgfp).zza(zzdeu).zzahz()).zzc(new zzbtl.zza().zza((zztz) this.zzgfu, this.zzgcx.zzacf()).zza((zztz) this.zzgfv, this.zzgcx.zzacf()).zza((zzbqh) this.zzgfu, this.zzgcx.zzacf()).zza((zzbrn) this.zzgfu, this.zzgcx.zzacf()).zza((zzbqm) this.zzgfu, this.zzgcx.zzacf()).zza((AppEventListener) this.zzgfw, this.zzgcx.zzacf()).zza((zzbsg) this.zzgfx, this.zzgcx.zzacf()).zzais()).zza(new zzcrh(this.zzgfz)).zzb(new zzbxk(zzbzg.zzfpz, (zzvk) null)).zza(new zzbmy(this.zzgfy)).zzb(new zzblf(this.zzfgb)).zzael();
    }

    public final synchronized void destroy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        if (this.zzgfn != null) {
            this.zzgfn.destroy();
        }
    }

    public final synchronized void pause() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzgfn != null) {
            this.zzgfn.zzahh().zzby((Context) null);
        }
    }

    public final synchronized void resume() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzgfn != null) {
            this.zzgfn.zzahh().zzbz((Context) null);
        }
    }

    public final void zza(zzvk zzvk) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzgfu.zzc(zzvk);
    }

    public final zzvk zzki() {
        return this.zzgfu.zzaon();
    }

    public final void zza(zzwf zzwf) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzgfw.zzb(zzwf);
    }

    public final zzwf zzkh() {
        return this.zzgfw.zzaop();
    }

    public final synchronized void zzkd() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        if (this.zzgfn != null) {
            this.zzgfn.zzkd();
        }
    }

    public final synchronized zzuk zzke() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        if (this.zzgfn != null) {
            return zzdex.zzb(this.zzgfp, Collections.singletonList(this.zzgfn.zzagl()));
        }
        return this.zzgfq.zzke();
    }

    public final synchronized void zza(zzuk zzuk) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzgfq.zzd(zzuk);
        if (this.zzgfn != null) {
            this.zzgfn.zza(this.zzfgb, zzuk);
        }
    }

    public final synchronized String getMediationAdapterClassName() {
        if (this.zzgfn == null || this.zzgfn.zzahi() == null) {
            return null;
        }
        return this.zzgfn.zzahi().getMediationAdapterClassName();
    }

    public final synchronized String zzkf() {
        if (this.zzgfn == null || this.zzgfn.zzahi() == null) {
            return null;
        }
        return this.zzgfn.zzahi().getMediationAdapterClassName();
    }

    public final synchronized zzxe zzkg() {
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcsf)).booleanValue()) {
            return null;
        }
        if (this.zzgfn == null) {
            return null;
        }
        return this.zzgfn.zzahi();
    }

    public final synchronized void zza(zzwl zzwl) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzgfq.zzc(zzwl);
    }

    public final synchronized void setManualImpressionsEnabled(boolean z) {
        Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        this.zzgfq.zzbo(z);
    }

    public final synchronized boolean isLoading() {
        return this.zzgga != null && !this.zzgga.isDone();
    }

    public final synchronized zzxj getVideoController() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        if (this.zzgfn == null) {
            return null;
        }
        return this.zzgfn.getVideoController();
    }

    public final synchronized String getAdUnitId() {
        return this.zzgfq.zzara();
    }

    public final synchronized void zza(zzzc zzzc) {
        Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        this.zzgfq.zzc(zzzc);
    }

    public final void zza(zzvj zzvj) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzgfv.zzb(zzvj);
    }

    public final synchronized void zza(zzaaq zzaaq) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzgfz = zzaaq;
    }

    public final synchronized void zzaie() {
        boolean z;
        ViewParent parent = this.zzfgb.getParent();
        if (!(parent instanceof View)) {
            z = false;
        } else {
            View view = (View) parent;
            z = zzq.zzkv().zza(view, view.getContext());
        }
        if (z) {
            zza(this.zzgfq.zzaqz());
        } else {
            this.zzgfy.zzdg(60);
        }
    }

    public final void zza(zzxd zzxd) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        this.zzgfx.zzb(zzxd);
    }

    public final void zza(zzwa zzwa) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    public final Bundle getAdMetadata() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }
}
