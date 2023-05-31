package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzxv {
    private final zzui zzabf;
    private AppEventListener zzbkr;
    private boolean zzblm;
    private zzvx zzbrh;
    private String zzbri;
    private final zzall zzbrk;
    private zztz zzcch;
    private AdListener zzcck;
    private AdMetadataListener zzccl;
    private OnCustomRenderedAdLoadedListener zzcfg;
    @Nullable
    private OnPaidEventListener zzcfj;
    private RewardedVideoAdListener zzcfp;
    private boolean zzcfq;
    private final Context zzur;

    public zzxv(Context context) {
        this(context, zzui.zzcdb, (PublisherInterstitialAd) null);
    }

    public zzxv(Context context, PublisherInterstitialAd publisherInterstitialAd) {
        this(context, zzui.zzcdb, publisherInterstitialAd);
    }

    @VisibleForTesting
    private zzxv(Context context, zzui zzui, PublisherInterstitialAd publisherInterstitialAd) {
        this.zzbrk = new zzall();
        this.zzur = context;
        this.zzabf = zzui;
    }

    public final AdListener getAdListener() {
        return this.zzcck;
    }

    public final String getAdUnitId() {
        return this.zzbri;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzbkr;
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzcfg;
    }

    public final boolean isLoaded() {
        try {
            if (this.zzbrh == null) {
                return false;
            }
            return this.zzbrh.isReady();
        } catch (RemoteException e) {
            zzazh.zze("#008 Must be called on the main UI thread.", e);
            return false;
        }
    }

    public final boolean isLoading() {
        try {
            if (this.zzbrh == null) {
                return false;
            }
            return this.zzbrh.isLoading();
        } catch (RemoteException e) {
            zzazh.zze("#008 Must be called on the main UI thread.", e);
            return false;
        }
    }

    public final void zza(zzxr zzxr) {
        try {
            if (this.zzbrh == null) {
                if (this.zzbri == null) {
                    zzco("loadAd");
                }
                zzuk zzoq = this.zzcfq ? zzuk.zzoq() : new zzuk();
                zzus zzpa = zzvh.zzpa();
                Context context = this.zzur;
                this.zzbrh = (zzvx) new zzuy(zzpa, context, zzoq, this.zzbri, this.zzbrk).zzd(context, false);
                if (this.zzcck != null) {
                    this.zzbrh.zza((zzvk) new zzud(this.zzcck));
                }
                if (this.zzcch != null) {
                    this.zzbrh.zza((zzvj) new zzty(this.zzcch));
                }
                if (this.zzccl != null) {
                    this.zzbrh.zza((zzwa) new zzue(this.zzccl));
                }
                if (this.zzbkr != null) {
                    this.zzbrh.zza((zzwf) new zzuo(this.zzbkr));
                }
                if (this.zzcfg != null) {
                    this.zzbrh.zza((zzaaq) new zzaav(this.zzcfg));
                }
                if (this.zzcfp != null) {
                    this.zzbrh.zza((zzasb) new zzasi(this.zzcfp));
                }
                this.zzbrh.zza((zzxd) new zzyx(this.zzcfj));
                this.zzbrh.setImmersiveMode(this.zzblm);
            }
            if (this.zzbrh.zza(zzui.zza(this.zzur, zzxr))) {
                this.zzbrk.zzf(zzxr.zzps());
            }
        } catch (RemoteException e) {
            zzazh.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void setAdListener(AdListener adListener) {
        try {
            this.zzcck = adListener;
            if (this.zzbrh != null) {
                this.zzbrh.zza((zzvk) adListener != null ? new zzud(adListener) : null);
            }
        } catch (RemoteException e) {
            zzazh.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void zza(zztz zztz) {
        try {
            this.zzcch = zztz;
            if (this.zzbrh != null) {
                this.zzbrh.zza((zzvj) zztz != null ? new zzty(zztz) : null);
            }
        } catch (RemoteException e) {
            zzazh.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void setAdUnitId(String str) {
        if (this.zzbri == null) {
            this.zzbri = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }

    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        try {
            this.zzccl = adMetadataListener;
            if (this.zzbrh != null) {
                this.zzbrh.zza((zzwa) adMetadataListener != null ? new zzue(adMetadataListener) : null);
            }
        } catch (RemoteException e) {
            zzazh.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final Bundle getAdMetadata() {
        try {
            if (this.zzbrh != null) {
                return this.zzbrh.getAdMetadata();
            }
        } catch (RemoteException e) {
            zzazh.zze("#008 Must be called on the main UI thread.", e);
        }
        return new Bundle();
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.zzbkr = appEventListener;
            if (this.zzbrh != null) {
                this.zzbrh.zza((zzwf) appEventListener != null ? new zzuo(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzazh.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        try {
            this.zzcfg = onCustomRenderedAdLoadedListener;
            if (this.zzbrh != null) {
                this.zzbrh.zza((zzaaq) onCustomRenderedAdLoadedListener != null ? new zzaav(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e) {
            zzazh.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        try {
            this.zzcfp = rewardedVideoAdListener;
            if (this.zzbrh != null) {
                this.zzbrh.zza((zzasb) rewardedVideoAdListener != null ? new zzasi(rewardedVideoAdListener) : null);
            }
        } catch (RemoteException e) {
            zzazh.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void zzd(boolean z) {
        this.zzcfq = true;
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.zzbrh != null) {
                return this.zzbrh.zzkf();
            }
            return null;
        } catch (RemoteException e) {
            zzazh.zze("#008 Must be called on the main UI thread.", e);
            return null;
        }
    }

    public final ResponseInfo getResponseInfo() {
        zzxe zzxe = null;
        try {
            if (this.zzbrh != null) {
                zzxe = this.zzbrh.zzkg();
            }
        } catch (RemoteException e) {
            zzazh.zze("#008 Must be called on the main UI thread.", e);
        }
        return ResponseInfo.zza(zzxe);
    }

    public final void show() {
        try {
            zzco("show");
            this.zzbrh.showInterstitial();
        } catch (RemoteException e) {
            zzazh.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void setImmersiveMode(boolean z) {
        try {
            this.zzblm = z;
            if (this.zzbrh != null) {
                this.zzbrh.setImmersiveMode(z);
            }
        } catch (RemoteException e) {
            zzazh.zze("#008 Must be called on the main UI thread.", e);
        }
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

    private final void zzco(String str) {
        if (this.zzbrh == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
            sb.append("The ad unit ID must be set on InterstitialAd before ");
            sb.append(str);
            sb.append(" is called.");
            throw new IllegalStateException(sb.toString());
        }
    }
}
