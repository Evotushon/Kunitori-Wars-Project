package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzamn extends zzalw {
    private final NativeAppInstallAdMapper zzdfc;

    public zzamn(NativeAppInstallAdMapper nativeAppInstallAdMapper) {
        this.zzdfc = nativeAppInstallAdMapper;
    }

    public final zzacj zzrl() {
        return null;
    }

    public final IObjectWrapper zzrm() {
        return null;
    }

    public final String getHeadline() {
        return this.zzdfc.getHeadline();
    }

    public final List getImages() {
        List<NativeAd.Image> images = this.zzdfc.getImages();
        if (images == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (NativeAd.Image next : images) {
            arrayList.add(new zzacd(next.getDrawable(), next.getUri(), next.getScale(), next.getWidth(), next.getHeight()));
        }
        return arrayList;
    }

    public final String getBody() {
        return this.zzdfc.getBody();
    }

    public final zzacr zzrk() {
        NativeAd.Image icon = this.zzdfc.getIcon();
        if (icon != null) {
            return new zzacd(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.getWidth(), icon.getHeight());
        }
        return null;
    }

    public final String getCallToAction() {
        return this.zzdfc.getCallToAction();
    }

    public final double getStarRating() {
        return this.zzdfc.getStarRating();
    }

    public final String getStore() {
        return this.zzdfc.getStore();
    }

    public final String getPrice() {
        return this.zzdfc.getPrice();
    }

    public final void recordImpression() {
        this.zzdfc.recordImpression();
    }

    public final void zzu(IObjectWrapper iObjectWrapper) {
        this.zzdfc.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void zzv(IObjectWrapper iObjectWrapper) {
        this.zzdfc.trackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zzdfc.trackViews((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    public final void zzw(IObjectWrapper iObjectWrapper) {
        this.zzdfc.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzdfc.getOverrideImpressionRecording();
    }

    public final boolean getOverrideClickHandling() {
        return this.zzdfc.getOverrideClickHandling();
    }

    public final Bundle getExtras() {
        return this.zzdfc.getExtras();
    }

    public final zzxj getVideoController() {
        if (this.zzdfc.getVideoController() != null) {
            return this.zzdfc.getVideoController().zzdq();
        }
        return null;
    }

    public final IObjectWrapper zzsz() {
        View adChoicesContent = this.zzdfc.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    public final IObjectWrapper zzta() {
        View zzace = this.zzdfc.zzace();
        if (zzace == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzace);
    }
}
