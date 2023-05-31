package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class NativeAppInstallAdMapper extends NativeAdMapper {
    private String zzdln;
    private String zzejs;
    private List<NativeAd.Image> zzejt;
    private NativeAd.Image zzeju;
    private String zzejv;
    private double zzejw;
    private String zzejx;
    private String zzejy;

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

    public final void setStarRating(double d) {
        this.zzejw = d;
    }

    public final void setStore(String str) {
        this.zzejx = str;
    }

    public final void setPrice(String str) {
        this.zzejy = str;
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

    public final double getStarRating() {
        return this.zzejw;
    }

    public final String getStore() {
        return this.zzejx;
    }

    public final String getPrice() {
        return this.zzejy;
    }
}
