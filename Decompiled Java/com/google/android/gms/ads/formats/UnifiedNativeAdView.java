package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzacc;
import com.google.android.gms.internal.ads.zzace;
import com.google.android.gms.internal.ads.zzacm;
import com.google.android.gms.internal.ads.zzacv;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzvh;
import com.google.android.gms.internal.ads.zzye;
import com.google.android.gms.internal.ads.zzzx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class UnifiedNativeAdView extends FrameLayout {
    private final FrameLayout zzbkk;
    private final zzacv zzbkl = zzjq();

    public UnifiedNativeAdView(Context context) {
        super(context);
        this.zzbkk = zze(context);
    }

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzbkk = zze(context);
    }

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzbkk = zze(context);
    }

    @TargetApi(21)
    public UnifiedNativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.zzbkk = zze(context);
    }

    private final void zza(String str, View view) {
        try {
            this.zzbkl.zzb(str, ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzazh.zzc("Unable to call setAssetView on delegate", e);
        }
    }

    public final void setHeadlineView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_HEADLINE, view);
    }

    public final void setCallToActionView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_CALL_TO_ACTION, view);
    }

    public final void setIconView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_ICON, view);
    }

    public final void setBodyView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_BODY, view);
    }

    public final void setAdvertiserView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_ADVERTISER, view);
    }

    public final void setStoreView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_STORE, view);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.zzbkl.zze(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzazh.zzc("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setPriceView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_PRICE, view);
    }

    public final void setImageView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_IMAGE, view);
    }

    public final void setStarRatingView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_STAR_RATING, view);
    }

    public final void setMediaView(MediaView mediaView) {
        zza(UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO, mediaView);
        if (mediaView != null) {
            mediaView.zza((zzacc) new zze(this));
            mediaView.zza((zzace) new zzd(this));
        }
    }

    public final void setAdChoicesView(AdChoicesView adChoicesView) {
        zza(UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW, adChoicesView);
    }

    public final void setNativeAd(UnifiedNativeAd unifiedNativeAd) {
        try {
            this.zzbkl.zza((IObjectWrapper) unifiedNativeAd.zzjo());
        } catch (RemoteException e) {
            zzazh.zzc("Unable to call setNativeAd on delegate", e);
        }
    }

    private final View zzbq(String str) {
        try {
            IObjectWrapper zzcp = this.zzbkl.zzcp(str);
            if (zzcp != null) {
                return (View) ObjectWrapper.unwrap(zzcp);
            }
            return null;
        } catch (RemoteException e) {
            zzazh.zzc("Unable to call getAssetView on delegate", e);
            return null;
        }
    }

    public final View getHeadlineView() {
        return zzbq(UnifiedNativeAdAssetNames.ASSET_HEADLINE);
    }

    public final View getCallToActionView() {
        return zzbq(UnifiedNativeAdAssetNames.ASSET_CALL_TO_ACTION);
    }

    public final View getIconView() {
        return zzbq(UnifiedNativeAdAssetNames.ASSET_ICON);
    }

    public final View getBodyView() {
        return zzbq(UnifiedNativeAdAssetNames.ASSET_BODY);
    }

    public final View getStoreView() {
        return zzbq(UnifiedNativeAdAssetNames.ASSET_STORE);
    }

    public final View getPriceView() {
        return zzbq(UnifiedNativeAdAssetNames.ASSET_PRICE);
    }

    public final View getAdvertiserView() {
        return zzbq(UnifiedNativeAdAssetNames.ASSET_ADVERTISER);
    }

    public final View getImageView() {
        return zzbq(UnifiedNativeAdAssetNames.ASSET_IMAGE);
    }

    public final View getStarRatingView() {
        return zzbq(UnifiedNativeAdAssetNames.ASSET_STAR_RATING);
    }

    public final MediaView getMediaView() {
        View zzbq = zzbq(UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO);
        if (zzbq instanceof MediaView) {
            return (MediaView) zzbq;
        }
        if (zzbq == null) {
            return null;
        }
        zzazh.zzeb("View is not an instance of MediaView");
        return null;
    }

    public final AdChoicesView getAdChoicesView() {
        View zzbq = zzbq(UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW);
        if (zzbq instanceof AdChoicesView) {
            return (AdChoicesView) zzbq;
        }
        return null;
    }

    public final void destroy() {
        try {
            this.zzbkl.destroy();
        } catch (RemoteException e) {
            zzazh.zzc("Unable to destroy native ad view", e);
        }
    }

    private final FrameLayout zze(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final zzacv zzjq() {
        Preconditions.checkNotNull(this.zzbkk, "createDelegate must be called after overlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return zzvh.zzpa().zza(this.zzbkk.getContext(), (FrameLayout) this, this.zzbkk);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zzbkk);
    }

    public final void removeView(View view) {
        if (this.zzbkk != view) {
            super.removeView(view);
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zzbkk);
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zzbkk;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        zzacv zzacv = this.zzbkl;
        if (zzacv != null) {
            try {
                zzacv.zzc(ObjectWrapper.wrap(view), i);
            } catch (RemoteException e) {
                zzazh.zzc("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zzacv zzacv;
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcmm)).booleanValue() && (zzacv = this.zzbkl) != null) {
            try {
                zzacv.zzf(ObjectWrapper.wrap(motionEvent));
            } catch (RemoteException e) {
                zzazh.zzc("Unable to call handleTouchEvent on delegate", e);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(ImageView.ScaleType scaleType) {
        if (scaleType != null) {
            try {
                this.zzbkl.zzg(ObjectWrapper.wrap(scaleType));
            } catch (RemoteException e) {
                zzazh.zzc("Unable to call setMediaViewImageScaleType on delegate", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(MediaContent mediaContent) {
        try {
            if (mediaContent instanceof zzye) {
                this.zzbkl.zza(((zzye) mediaContent).zzqa());
            } else if (mediaContent == null) {
                this.zzbkl.zza((zzacm) null);
            } else {
                zzazh.zzeb("Use MediaContent provided by UnifiedNativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            zzazh.zzc("Unable to call setMediaContent on delegate", e);
        }
    }
}
