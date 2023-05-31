package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzamm extends zzamb {
    private final NativeContentAdMapper zzdfb;

    public zzamm(NativeContentAdMapper nativeContentAdMapper) {
        this.zzdfb = nativeContentAdMapper;
    }

    public final zzacj zzrl() {
        return null;
    }

    public final IObjectWrapper zzrm() {
        return null;
    }

    public final String getHeadline() {
        return this.zzdfb.getHeadline();
    }

    public final List getImages() {
        List<NativeAd.Image> images = this.zzdfb.getImages();
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
        return this.zzdfb.getBody();
    }

    public final zzacr zzrn() {
        NativeAd.Image logo = this.zzdfb.getLogo();
        if (logo != null) {
            return new zzacd(logo.getDrawable(), logo.getUri(), logo.getScale(), logo.getWidth(), logo.getHeight());
        }
        return null;
    }

    public final String getCallToAction() {
        return this.zzdfb.getCallToAction();
    }

    public final String getAdvertiser() {
        return this.zzdfb.getAdvertiser();
    }

    public final void recordImpression() {
        this.zzdfb.recordImpression();
    }

    public final void zzu(IObjectWrapper iObjectWrapper) {
        this.zzdfb.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void zzv(IObjectWrapper iObjectWrapper) {
        this.zzdfb.trackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zzdfb.trackViews((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    public final void zzw(IObjectWrapper iObjectWrapper) {
        this.zzdfb.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzdfb.getOverrideImpressionRecording();
    }

    public final boolean getOverrideClickHandling() {
        return this.zzdfb.getOverrideClickHandling();
    }

    public final Bundle getExtras() {
        return this.zzdfb.getExtras();
    }

    public final IObjectWrapper zzsz() {
        View adChoicesContent = this.zzdfb.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    public final zzxj getVideoController() {
        if (this.zzdfb.getVideoController() != null) {
            return this.zzdfb.getVideoController().zzdq();
        }
        return null;
    }

    public final IObjectWrapper zzta() {
        View zzace = this.zzdfb.zzace();
        if (zzace == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzace);
    }
}
