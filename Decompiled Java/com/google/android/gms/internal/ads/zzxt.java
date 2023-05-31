package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzxt {
    private final zzui zzabf;
    private VideoOptions zzbki;
    private boolean zzbkp;
    private AppEventListener zzbkr;
    private zzvx zzbrh;
    private String zzbri;
    private final zzall zzbrk;
    private zztz zzcch;
    private AdListener zzcck;
    private AdSize[] zzcdt;
    private final AtomicBoolean zzcfd;
    /* access modifiers changed from: private */
    public final VideoController zzcfe;
    @VisibleForTesting
    private final zzvg zzcff;
    private OnCustomRenderedAdLoadedListener zzcfg;
    private ViewGroup zzcfh;
    private int zzcfi;
    @Nullable
    private OnPaidEventListener zzcfj;

    private static boolean zzcm(int i) {
        return i == 1;
    }

    public zzxt(ViewGroup viewGroup) {
        this(viewGroup, (AttributeSet) null, false, zzui.zzcdb, 0);
    }

    public zzxt(ViewGroup viewGroup, int i) {
        this(viewGroup, (AttributeSet) null, false, zzui.zzcdb, i);
    }

    public zzxt(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzui.zzcdb, 0);
    }

    public zzxt(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, false, zzui.zzcdb, i);
    }

    @VisibleForTesting
    private zzxt(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzui zzui, zzvx zzvx, int i) {
        zzuk zzuk;
        this.zzbrk = new zzall();
        this.zzcfe = new VideoController();
        this.zzcff = new zzxs(this);
        this.zzcfh = viewGroup;
        this.zzabf = zzui;
        this.zzbrh = null;
        this.zzcfd = new AtomicBoolean(false);
        this.zzcfi = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzut zzut = new zzut(context, attributeSet);
                this.zzcdt = zzut.zzy(z);
                this.zzbri = zzut.getAdUnitId();
                if (viewGroup.isInEditMode()) {
                    zzayx zzoz = zzvh.zzoz();
                    AdSize adSize = this.zzcdt[0];
                    int i2 = this.zzcfi;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzuk = zzuk.zzos();
                    } else {
                        zzuk zzuk2 = new zzuk(context, adSize);
                        zzuk2.zzcdf = zzcm(i2);
                        zzuk = zzuk2;
                    }
                    zzoz.zza(viewGroup, zzuk, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzvh.zzoz().zza(viewGroup, new zzuk(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }

    @VisibleForTesting
    private zzxt(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzui zzui, int i) {
        this(viewGroup, attributeSet, z, zzui, (zzvx) null, i);
    }

    public final void destroy() {
        try {
            if (this.zzbrh != null) {
                this.zzbrh.destroy();
            }
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final AdListener getAdListener() {
        return this.zzcck;
    }

    public final AdSize getAdSize() {
        zzuk zzke;
        try {
            if (!(this.zzbrh == null || (zzke = this.zzbrh.zzke()) == null)) {
                return zzke.zzot();
            }
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.zzcdt;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final AdSize[] getAdSizes() {
        return this.zzcdt;
    }

    public final String getAdUnitId() {
        zzvx zzvx;
        if (this.zzbri == null && (zzvx = this.zzbrh) != null) {
            try {
                this.zzbri = zzvx.getAdUnitId();
            } catch (RemoteException e) {
                zzazh.zze("#007 Could not call remote method.", e);
            }
        }
        return this.zzbri;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzbkr;
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzcfg;
    }

    public final void zza(zzxr zzxr) {
        zzvx zzvx;
        try {
            if (this.zzbrh == null) {
                if ((this.zzcdt == null || this.zzbri == null) && this.zzbrh == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.zzcfh.getContext();
                zzuk zza = zza(context, this.zzcdt, this.zzcfi);
                if ("search_v2".equals(zza.zzabk)) {
                    zzvx = (zzvx) new zzuz(zzvh.zzpa(), context, zza, this.zzbri).zzd(context, false);
                } else {
                    zzvx = (zzvx) new zzuv(zzvh.zzpa(), context, zza, this.zzbri, this.zzbrk).zzd(context, false);
                }
                this.zzbrh = zzvx;
                this.zzbrh.zza((zzvk) new zzud(this.zzcff));
                if (this.zzcch != null) {
                    this.zzbrh.zza((zzvj) new zzty(this.zzcch));
                }
                if (this.zzbkr != null) {
                    this.zzbrh.zza((zzwf) new zzuo(this.zzbkr));
                }
                if (this.zzcfg != null) {
                    this.zzbrh.zza((zzaaq) new zzaav(this.zzcfg));
                }
                if (this.zzbki != null) {
                    this.zzbrh.zza(new zzzc(this.zzbki));
                }
                this.zzbrh.zza((zzxd) new zzyx(this.zzcfj));
                this.zzbrh.setManualImpressionsEnabled(this.zzbkp);
                try {
                    IObjectWrapper zzkc = this.zzbrh.zzkc();
                    if (zzkc != null) {
                        this.zzcfh.addView((View) ObjectWrapper.unwrap(zzkc));
                    }
                } catch (RemoteException e) {
                    zzazh.zze("#007 Could not call remote method.", e);
                }
            }
            if (this.zzbrh.zza(zzui.zza(this.zzcfh.getContext(), zzxr))) {
                this.zzbrk.zzf(zzxr.zzps());
            }
        } catch (RemoteException e2) {
            zzazh.zze("#007 Could not call remote method.", e2);
        }
    }

    public final void pause() {
        try {
            if (this.zzbrh != null) {
                this.zzbrh.pause();
            }
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void recordManualImpression() {
        if (!this.zzcfd.getAndSet(true)) {
            try {
                if (this.zzbrh != null) {
                    this.zzbrh.zzkd();
                }
            } catch (RemoteException e) {
                zzazh.zze("#007 Could not call remote method.", e);
            }
        }
    }

    public final void resume() {
        try {
            if (this.zzbrh != null) {
                this.zzbrh.resume();
            }
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setAdListener(AdListener adListener) {
        this.zzcck = adListener;
        this.zzcff.zza(adListener);
    }

    public final void zza(zztz zztz) {
        try {
            this.zzcch = zztz;
            if (this.zzbrh != null) {
                this.zzbrh.zza((zzvj) zztz != null ? new zzty(zztz) : null);
            }
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setAdSizes(AdSize... adSizeArr) {
        if (this.zzcdt == null) {
            zza(adSizeArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public final void zza(AdSize... adSizeArr) {
        this.zzcdt = adSizeArr;
        try {
            if (this.zzbrh != null) {
                this.zzbrh.zza(zza(this.zzcfh.getContext(), this.zzcdt, this.zzcfi));
            }
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
        this.zzcfh.requestLayout();
    }

    public final void setAdUnitId(String str) {
        if (this.zzbri == null) {
            this.zzbri = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.zzbkr = appEventListener;
            if (this.zzbrh != null) {
                this.zzbrh.zza((zzwf) appEventListener != null ? new zzuo(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzcfg = onCustomRenderedAdLoadedListener;
        try {
            if (this.zzbrh != null) {
                this.zzbrh.zza((zzaaq) onCustomRenderedAdLoadedListener != null ? new zzaav(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzbkp = z;
        try {
            if (this.zzbrh != null) {
                this.zzbrh.setManualImpressionsEnabled(this.zzbkp);
            }
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.zzbrh != null) {
                return this.zzbrh.zzkf();
            }
            return null;
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final boolean isLoading() {
        try {
            if (this.zzbrh != null) {
                return this.zzbrh.isLoading();
            }
            return false;
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            return false;
        }
    }

    @Nullable
    public final ResponseInfo getResponseInfo() {
        zzxe zzxe = null;
        try {
            if (this.zzbrh != null) {
                zzxe = this.zzbrh.zzkg();
            }
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(zzxe);
    }

    public final void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        try {
            this.zzcfj = onPaidEventListener;
            if (this.zzbrh != null) {
                this.zzbrh.zza((zzxd) new zzyx(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzazh.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final VideoController getVideoController() {
        return this.zzcfe;
    }

    public final zzxj zzdq() {
        zzvx zzvx = this.zzbrh;
        if (zzvx == null) {
            return null;
        }
        try {
            return zzvx.getVideoController();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void setVideoOptions(VideoOptions videoOptions) {
        zzzc zzzc;
        this.zzbki = videoOptions;
        try {
            if (this.zzbrh != null) {
                zzvx zzvx = this.zzbrh;
                if (videoOptions == null) {
                    zzzc = null;
                } else {
                    zzzc = new zzzc(videoOptions);
                }
                zzvx.zza(zzzc);
            }
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final VideoOptions getVideoOptions() {
        return this.zzbki;
    }

    public final boolean zza(zzvx zzvx) {
        if (zzvx == null) {
            return false;
        }
        try {
            IObjectWrapper zzkc = zzvx.zzkc();
            if (zzkc == null || ((View) ObjectWrapper.unwrap(zzkc)).getParent() != null) {
                return false;
            }
            this.zzcfh.addView((View) ObjectWrapper.unwrap(zzkc));
            this.zzbrh = zzvx;
            return true;
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            return false;
        }
    }

    private static zzuk zza(Context context, AdSize[] adSizeArr, int i) {
        for (AdSize equals : adSizeArr) {
            if (equals.equals(AdSize.INVALID)) {
                return zzuk.zzos();
            }
        }
        zzuk zzuk = new zzuk(context, adSizeArr);
        zzuk.zzcdf = zzcm(i);
        return zzuk;
    }
}
