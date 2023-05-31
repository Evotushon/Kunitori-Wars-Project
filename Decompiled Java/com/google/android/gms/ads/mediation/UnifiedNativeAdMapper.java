package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class UnifiedNativeAdMapper {
    private Bundle extras = new Bundle();
    private VideoController zzcfe;
    private String zzdln;
    private String zzejs;
    private List<NativeAd.Image> zzejt;
    private NativeAd.Image zzeju;
    private String zzejv;
    private String zzejx;
    private String zzejy;
    private View zzejz;
    private boolean zzeka;
    private String zzekc;
    private Double zzekd;
    private View zzeke;
    private Object zzekf;
    private boolean zzekg;
    private boolean zzekh;
    private float zzeki;

    public float getCurrentTime() {
        return 0.0f;
    }

    public float getDuration() {
        return 0.0f;
    }

    public void handleClick(View view) {
    }

    public void recordImpression() {
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }

    public void untrackView(View view) {
    }

    public final void setHeadline(String str) {
        this.zzejs = str;
    }

    public final void setImages(List<NativeAd.Image> list) {
        this.zzejt = list;
    }

    public final void setBody(String str) {
        this.zzdln = str;
    }

    public final void setIcon(NativeAd.Image image) {
        this.zzeju = image;
    }

    public final void setCallToAction(String str) {
        this.zzejv = str;
    }

    public final void setAdvertiser(String str) {
        this.zzekc = str;
    }

    public final void setStarRating(Double d) {
        this.zzekd = d;
    }

    public final void setStore(String str) {
        this.zzejx = str;
    }

    public final void setPrice(String str) {
        this.zzejy = str;
    }

    public final void zza(VideoController videoController) {
        this.zzcfe = videoController;
    }

    public void setHasVideoContent(boolean z) {
        this.zzeka = z;
    }

    public void setAdChoicesContent(View view) {
        this.zzeke = view;
    }

    public void setMediaView(View view) {
        this.zzejz = view;
    }

    public void setMediaContentAspectRatio(float f) {
        this.zzeki = f;
    }

    public final void zzn(Object obj) {
        this.zzekf = obj;
    }

    public final void setExtras(Bundle bundle) {
        this.extras = bundle;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.zzekg = z;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.zzekh = z;
    }

    public final String getHeadline() {
        return this.zzejs;
    }

    public final List<NativeAd.Image> getImages() {
        return this.zzejt;
    }

    public final String getBody() {
        return this.zzdln;
    }

    public final NativeAd.Image getIcon() {
        return this.zzeju;
    }

    public final String getCallToAction() {
        return this.zzejv;
    }

    public final String getAdvertiser() {
        return this.zzekc;
    }

    public final Double getStarRating() {
        return this.zzekd;
    }

    public final String getStore() {
        return this.zzejx;
    }

    public final String getPrice() {
        return this.zzejy;
    }

    public final VideoController getVideoController() {
        return this.zzcfe;
    }

    public boolean hasVideoContent() {
        return this.zzeka;
    }

    public View getAdChoicesContent() {
        return this.zzeke;
    }

    public final View zzace() {
        return this.zzejz;
    }

    public float getMediaContentAspectRatio() {
        return this.zzeki;
    }

    public final Object zzjt() {
        return this.zzekf;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzekg;
    }

    public final boolean getOverrideClickHandling() {
        return this.zzekh;
    }
}
