package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class NativeContentAdMapper extends NativeAdMapper {
    private String zzdln;
    private String zzejs;
    private List<NativeAd.Image> zzejt;
    private String zzejv;
    private NativeAd.Image zzekb;
    private String zzekc;

    public final void setHeadline(String str) {
        this.zzejs = str;
    }

    public final void setImages(List<NativeAd.Image> list) {
        this.zzejt = list;
    }

    public final void setBody(String str) {
        this.zzdln = str;
    }

    public final void setLogo(NativeAd.Image image) {
        this.zzekb = image;
    }

    public final void setCallToAction(String str) {
        this.zzejv = str;
    }

    public final void setAdvertiser(String str) {
        this.zzekc = str;
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

    public final NativeAd.Image getLogo() {
        return this.zzekb;
    }

    public final String getCallToAction() {
        return this.zzejv;
    }

    public final String getAdvertiser() {
        return this.zzekc;
    }
}
