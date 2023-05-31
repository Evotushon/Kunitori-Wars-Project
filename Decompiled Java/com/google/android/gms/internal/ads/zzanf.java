package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzanf extends zzamc {
    private final UnifiedNativeAdMapper zzdfm;

    public zzanf(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.zzdfm = unifiedNativeAdMapper;
    }

    public final zzacj zzrl() {
        return null;
    }

    public final String getHeadline() {
        return this.zzdfm.getHeadline();
    }

    public final List getImages() {
        List<NativeAd.Image> images = this.zzdfm.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image next : images) {
                arrayList.add(new zzacd(next.getDrawable(), next.getUri(), next.getScale(), next.getWidth(), next.getHeight()));
            }
        }
        return arrayList;
    }

    public final String getBody() {
        return this.zzdfm.getBody();
    }

    public final zzacr zzrk() {
        NativeAd.Image icon = this.zzdfm.getIcon();
        if (icon != null) {
            return new zzacd(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.getWidth(), icon.getHeight());
        }
        return null;
    }

    public final String getCallToAction() {
        return this.zzdfm.getCallToAction();
    }

    public final String getAdvertiser() {
        return this.zzdfm.getAdvertiser();
    }

    public final double getStarRating() {
        if (this.zzdfm.getStarRating() != null) {
            return this.zzdfm.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    public final String getStore() {
        return this.zzdfm.getStore();
    }

    public final String getPrice() {
        return this.zzdfm.getPrice();
    }

    public final zzxj getVideoController() {
        if (this.zzdfm.getVideoController() != null) {
            return this.zzdfm.getVideoController().zzdq();
        }
        return null;
    }

    public final IObjectWrapper zzsz() {
        View adChoicesContent = this.zzdfm.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    public final IObjectWrapper zzta() {
        View zzace = this.zzdfm.zzace();
        if (zzace == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzace);
    }

    public final float getMediaContentAspectRatio() {
        return this.zzdfm.getMediaContentAspectRatio();
    }

    public final float getVideoDuration() {
        return this.zzdfm.getDuration();
    }

    public final float getVideoCurrentTime() {
        return this.zzdfm.getCurrentTime();
    }

    public final IObjectWrapper zzrm() {
        Object zzjt = this.zzdfm.zzjt();
        if (zzjt == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzjt);
    }

    public final Bundle getExtras() {
        return this.zzdfm.getExtras();
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzdfm.getOverrideImpressionRecording();
    }

    public final boolean getOverrideClickHandling() {
        return this.zzdfm.getOverrideClickHandling();
    }

    public final void recordImpression() {
        this.zzdfm.recordImpression();
    }

    public final void zzu(IObjectWrapper iObjectWrapper) {
        this.zzdfm.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zzdfm.trackViews((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    public final void zzw(IObjectWrapper iObjectWrapper) {
        this.zzdfm.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }
}
