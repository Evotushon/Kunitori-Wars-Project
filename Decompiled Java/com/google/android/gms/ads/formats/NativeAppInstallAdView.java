package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.internal.ads.zzazh;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class NativeAppInstallAdView extends NativeAdView {
    public NativeAppInstallAdView(Context context) {
        super(context);
    }

    public NativeAppInstallAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeAppInstallAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NativeAppInstallAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final void setHeadlineView(View view) {
        super.zza(NativeAppInstallAd.ASSET_HEADLINE, view);
    }

    public final void setCallToActionView(View view) {
        super.zza(NativeAppInstallAd.ASSET_CALL_TO_ACTION, view);
    }

    public final void setIconView(View view) {
        super.zza(NativeAppInstallAd.ASSET_ICON, view);
    }

    public final void setBodyView(View view) {
        super.zza(NativeAppInstallAd.ASSET_BODY, view);
    }

    public final void setStoreView(View view) {
        super.zza(NativeAppInstallAd.ASSET_STORE, view);
    }

    public final void setPriceView(View view) {
        super.zza(NativeAppInstallAd.ASSET_PRICE, view);
    }

    public final void setImageView(View view) {
        super.zza(NativeAppInstallAd.ASSET_IMAGE, view);
    }

    public final void setStarRatingView(View view) {
        super.zza(NativeAppInstallAd.ASSET_STAR_RATING, view);
    }

    public final void setMediaView(MediaView mediaView) {
        super.zza(NativeAppInstallAd.ASSET_MEDIA_VIDEO, mediaView);
    }

    public final View getHeadlineView() {
        return super.zzbq(NativeAppInstallAd.ASSET_HEADLINE);
    }

    public final View getCallToActionView() {
        return super.zzbq(NativeAppInstallAd.ASSET_CALL_TO_ACTION);
    }

    public final View getIconView() {
        return super.zzbq(NativeAppInstallAd.ASSET_ICON);
    }

    public final View getBodyView() {
        return super.zzbq(NativeAppInstallAd.ASSET_BODY);
    }

    public final View getStoreView() {
        return super.zzbq(NativeAppInstallAd.ASSET_STORE);
    }

    public final View getPriceView() {
        return super.zzbq(NativeAppInstallAd.ASSET_PRICE);
    }

    public final View getImageView() {
        return super.zzbq(NativeAppInstallAd.ASSET_IMAGE);
    }

    public final View getStarRatingView() {
        return super.zzbq(NativeAppInstallAd.ASSET_STAR_RATING);
    }

    public final MediaView getMediaView() {
        View zzbq = super.zzbq(NativeAppInstallAd.ASSET_MEDIA_VIDEO);
        if (zzbq instanceof MediaView) {
            return (MediaView) zzbq;
        }
        if (zzbq == null) {
            return null;
        }
        zzazh.zzeb("View is not an instance of MediaView");
        return null;
    }
}
