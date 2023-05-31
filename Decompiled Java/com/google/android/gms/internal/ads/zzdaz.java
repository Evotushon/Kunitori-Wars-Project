package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdaz extends zzvw implements zzw, zzbrw, zzrb {
    /* access modifiers changed from: private */
    public final zzazo zzblr;
    private final String zzbri;
    /* access modifiers changed from: private */
    public final ViewGroup zzfgb;
    private final zzbgk zzgcx;
    private final Context zzgfp;
    private AtomicBoolean zzgmk = new AtomicBoolean();
    private final zzdat zzgml;
    /* access modifiers changed from: private */
    public final zzdbh zzgmm;
    @Nullable
    private zzbko zzgmn;
    @GuardedBy("this")
    @Nullable
    protected zzbla zzgmo;

    public zzdaz(zzbgk zzbgk, Context context, String str, zzdat zzdat, zzdbh zzdbh, zzazo zzazo) {
        this.zzfgb = new FrameLayout(context);
        this.zzgcx = zzbgk;
        this.zzgfp = context;
        this.zzbri = str;
        this.zzgml = zzdat;
        this.zzgmm = zzdbh;
        zzdbh.zza((zzbrw) this);
        this.zzblr = zzazo;
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

    public final void zza(zzvj zzvj) {
    }

    public final void zza(zzvk zzvk) {
    }

    public final void zza(zzwa zzwa) {
    }

    public final void zza(zzwf zzwf) {
    }

    public final void zza(zzxd zzxd) {
    }

    public final void zza(zzxp zzxp) {
    }

    public final void zzbs(String str) {
    }

    public final zzwf zzkh() {
        return null;
    }

    public final zzvk zzki() {
        return null;
    }

    public final IObjectWrapper zzkc() {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzfgb);
    }

    public final void zza(zzur zzur) {
        this.zzgml.zza(zzur);
    }

    public final synchronized boolean zza(zzuh zzuh) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (isLoading()) {
            return false;
        }
        this.zzgmk = new AtomicBoolean();
        return this.zzgml.zza(zzuh, this.zzbri, new zzdbe(this), new zzdbd(this));
    }

    /* access modifiers changed from: private */
    public final zzo zza(zzbla zzbla) {
        boolean zzaay = zzbla.zzaay();
        int intValue = ((Integer) zzvh.zzpd().zzd(zzzx.zzcos)).intValue();
        zzr zzr = new zzr();
        zzr.size = 50;
        zzr.paddingLeft = zzaay ? intValue : 0;
        zzr.paddingRight = zzaay ? 0 : intValue;
        zzr.paddingTop = 0;
        zzr.paddingBottom = intValue;
        return new zzo(this.zzgfp, zzr, this);
    }

    /* access modifiers changed from: private */
    public static RelativeLayout.LayoutParams zzb(zzbla zzbla) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(zzbla.zzaay() ? 11 : 9);
        return layoutParams;
    }

    /* access modifiers changed from: private */
    public final void zzc(zzbla zzbla) {
        zzbla.zza((zzrb) this);
    }

    public final void zztq() {
        zzaqi();
    }

    public final void zzmr() {
        zzaqi();
    }

    public final void zzaia() {
        int zzagf;
        zzbla zzbla = this.zzgmo;
        if (zzbla != null && (zzagf = zzbla.zzagf()) > 0) {
            this.zzgmn = new zzbko(this.zzgcx.zzacg(), zzq.zzlc());
            this.zzgmn.zza(zzagf, new zzdbb(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzaqf */
    public final void zzaqi() {
        if (this.zzgmk.compareAndSet(false, true)) {
            zzbla zzbla = this.zzgmo;
            if (!(zzbla == null || zzbla.zzago() == null)) {
                this.zzgmm.zzb(this.zzgmo.zzago());
            }
            this.zzgmm.onAdClosed();
            this.zzfgb.removeAllViews();
            zzbko zzbko = this.zzgmn;
            if (zzbko != null) {
                zzq.zzky().zzb(zzbko);
            }
            destroy();
        }
    }

    /* access modifiers changed from: private */
    public final zzuk zzaqg() {
        return zzdex.zzb(this.zzgfp, Collections.singletonList(this.zzgmo.zzagl()));
    }

    public final synchronized void destroy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        if (this.zzgmo != null) {
            this.zzgmo.destroy();
        }
    }

    public final synchronized void pause() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    public final synchronized void resume() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    public final void zza(zzrh zzrh) {
        this.zzgmm.zzb(zzrh);
    }

    public final synchronized zzuk zzke() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        if (this.zzgmo == null) {
            return null;
        }
        return zzdex.zzb(this.zzgfp, Collections.singletonList(this.zzgmo.zzagl()));
    }

    public final synchronized void zza(zzuk zzuk) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    public final synchronized String getMediationAdapterClassName() {
        return null;
    }

    public final synchronized String zzkf() {
        return null;
    }

    public final synchronized zzxe zzkg() {
        return null;
    }

    public final synchronized boolean isLoading() {
        return this.zzgml.isLoading();
    }

    public final synchronized String getAdUnitId() {
        return this.zzbri;
    }

    public final synchronized void zzkd() {
    }

    public final synchronized void zza(zzwl zzwl) {
    }

    public final synchronized void setManualImpressionsEnabled(boolean z) {
    }

    public final synchronized zzxj getVideoController() {
        return null;
    }

    public final synchronized void zza(zzzc zzzc) {
    }

    public final synchronized void zza(zzaaq zzaaq) {
    }

    public final Bundle getAdMetadata() {
        return new Bundle();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaqh() {
        this.zzgcx.zzacf().execute(new zzdbc(this));
    }
}
