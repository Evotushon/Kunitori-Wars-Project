package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzach;
import com.google.android.gms.internal.ads.zzadr;
import com.google.android.gms.internal.ads.zzads;
import com.google.android.gms.internal.ads.zzaeg;
import com.google.android.gms.internal.ads.zzaew;
import com.google.android.gms.internal.ads.zzaex;
import com.google.android.gms.internal.ads.zzaey;
import com.google.android.gms.internal.ads.zzaez;
import com.google.android.gms.internal.ads.zzafb;
import com.google.android.gms.internal.ads.zzafd;
import com.google.android.gms.internal.ads.zzall;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzud;
import com.google.android.gms.internal.ads.zzui;
import com.google.android.gms.internal.ads.zzuk;
import com.google.android.gms.internal.ads.zzvh;
import com.google.android.gms.internal.ads.zzvk;
import com.google.android.gms.internal.ads.zzvp;
import com.google.android.gms.internal.ads.zzvq;
import com.google.android.gms.internal.ads.zzxr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class AdLoader {
    private final zzui zzabf;
    private final zzvp zzabg;
    private final Context zzur;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public static class Builder {
        private final zzvq zzabe;
        private final Context zzur;

        @KeepForSdk
        @Deprecated
        public Builder withCorrelator(@NonNull Correlator correlator) {
            return this;
        }

        public Builder(Context context, String str) {
            this((Context) Preconditions.checkNotNull(context, "context cannot be null"), zzvh.zzpa().zzb(context, str, new zzall()));
        }

        private Builder(Context context, zzvq zzvq) {
            this.zzur = context;
            this.zzabe = zzvq;
        }

        @Deprecated
        public Builder forContentAd(NativeContentAd.OnContentAdLoadedListener onContentAdLoadedListener) {
            try {
                this.zzabe.zza((zzads) new zzaew(onContentAdLoadedListener));
            } catch (RemoteException e) {
                zzazh.zzd("Failed to add content ad listener", e);
            }
            return this;
        }

        @Deprecated
        public Builder forAppInstallAd(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
            try {
                this.zzabe.zza((zzadr) new zzaex(onAppInstallAdLoadedListener));
            } catch (RemoteException e) {
                zzazh.zzd("Failed to add app install ad listener", e);
            }
            return this;
        }

        public Builder forUnifiedNativeAd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.zzabe.zza((zzaeg) new zzafd(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e) {
                zzazh.zzd("Failed to add google native ad listener", e);
            }
            return this;
        }

        public Builder forCustomTemplateAd(String str, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            zzaez zzaez;
            try {
                zzvq zzvq = this.zzabe;
                zzaey zzaey = new zzaey(onCustomTemplateAdLoadedListener);
                if (onCustomClickListener == null) {
                    zzaez = null;
                } else {
                    zzaez = new zzaez(onCustomClickListener);
                }
                zzvq.zza(str, zzaey, zzaez);
            } catch (RemoteException e) {
                zzazh.zzd("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public Builder forPublisherAdView(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.zzabe.zza(new zzafb(onPublisherAdViewLoadedListener), new zzuk(this.zzur, adSizeArr));
            } catch (RemoteException e) {
                zzazh.zzd("Failed to add publisher banner ad listener", e);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.zzabe.zzb((zzvk) new zzud(adListener));
            } catch (RemoteException e) {
                zzazh.zzd("Failed to set AdListener.", e);
            }
            return this;
        }

        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.zzabe.zza(new zzach(nativeAdOptions));
            } catch (RemoteException e) {
                zzazh.zzd("Failed to specify native ad options", e);
            }
            return this;
        }

        public Builder withPublisherAdViewOptions(PublisherAdViewOptions publisherAdViewOptions) {
            try {
                this.zzabe.zza(publisherAdViewOptions);
            } catch (RemoteException e) {
                zzazh.zzd("Failed to specify DFP banner ad options", e);
            }
            return this;
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.zzur, this.zzabe.zzpi());
            } catch (RemoteException e) {
                zzazh.zzc("Failed to build AdLoader.", e);
                return null;
            }
        }
    }

    AdLoader(Context context, zzvp zzvp) {
        this(context, zzvp, zzui.zzcdb);
    }

    private AdLoader(Context context, zzvp zzvp, zzui zzui) {
        this.zzur = context;
        this.zzabg = zzvp;
        this.zzabf = zzui;
    }

    private final void zza(zzxr zzxr) {
        try {
            this.zzabg.zzb(zzui.zza(this.zzur, zzxr));
        } catch (RemoteException e) {
            zzazh.zzc("Failed to load ad.", e);
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(AdRequest adRequest) {
        zza(adRequest.zzdl());
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAds(AdRequest adRequest, int i) {
        try {
            this.zzabg.zza(zzui.zza(this.zzur, adRequest.zzdl()), i);
        } catch (RemoteException e) {
            zzazh.zzc("Failed to load ads.", e);
        }
    }

    public void loadAd(PublisherAdRequest publisherAdRequest) {
        zza(publisherAdRequest.zzdl());
    }

    @Deprecated
    public String getMediationAdapterClassName() {
        try {
            return this.zzabg.zzkf();
        } catch (RemoteException e) {
            zzazh.zzd("Failed to get the mediation adapter class name.", e);
            return null;
        }
    }

    public boolean isLoading() {
        try {
            return this.zzabg.isLoading();
        } catch (RemoteException e) {
            zzazh.zzd("Failed to check if ad is loading.", e);
            return false;
        }
    }
}
