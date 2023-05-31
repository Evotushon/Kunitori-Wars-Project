package com.google.android.gms.internal.ads;

import android.location.Location;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzamp implements NativeMediationAdRequest {
    private final String zzabx;
    private final int zzccn;
    private final boolean zzccy;
    private final int zzdeq;
    private final int zzder;
    private final zzach zzdff;
    private final List<String> zzdfg = new ArrayList();
    private final Map<String, Boolean> zzdfh = new HashMap();
    private final Date zzmg;
    private final Set<String> zzmi;
    private final boolean zzmj;
    private final Location zzmk;

    public zzamp(@Nullable Date date, int i, @Nullable Set<String> set, @Nullable Location location, boolean z, int i2, zzach zzach, List<String> list, boolean z2, int i3, String str) {
        this.zzmg = date;
        this.zzccn = i;
        this.zzmi = set;
        this.zzmk = location;
        this.zzmj = z;
        this.zzdeq = i2;
        this.zzdff = zzach;
        this.zzccy = z2;
        this.zzder = i3;
        this.zzabx = str;
        if (list != null) {
            for (String next : list) {
                if (next.startsWith("custom:")) {
                    String[] split = next.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.zzdfh.put(split[1], true);
                        } else if ("false".equals(split[2])) {
                            this.zzdfh.put(split[1], false);
                        }
                    }
                } else {
                    this.zzdfg.add(next);
                }
            }
        }
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zzmg;
    }

    @Deprecated
    public final int getGender() {
        return this.zzccn;
    }

    public final Set<String> getKeywords() {
        return this.zzmi;
    }

    public final Location getLocation() {
        return this.zzmk;
    }

    public final boolean isTesting() {
        return this.zzmj;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.zzdeq;
    }

    public final NativeAdOptions getNativeAdOptions() {
        if (this.zzdff == null) {
            return null;
        }
        NativeAdOptions.Builder requestMultipleImages = new NativeAdOptions.Builder().setReturnUrlsForImageAssets(this.zzdff.zzcws).setImageOrientation(this.zzdff.zzbke).setRequestMultipleImages(this.zzdff.zzbkg);
        if (this.zzdff.versionCode >= 2) {
            requestMultipleImages.setAdChoicesPlacement(this.zzdff.zzbkh);
        }
        if (this.zzdff.versionCode >= 3 && this.zzdff.zzcwt != null) {
            requestMultipleImages.setVideoOptions(new VideoOptions(this.zzdff.zzcwt));
        }
        return requestMultipleImages.build();
    }

    public final boolean isAdMuted() {
        return zzxu.zzpy().zzpk();
    }

    public final float getAdVolume() {
        return zzxu.zzpy().zzpj();
    }

    public final boolean isAppInstallAdRequested() {
        List<String> list = this.zzdfg;
        if (list != null) {
            return list.contains("2") || this.zzdfg.contains("6");
        }
        return false;
    }

    public final boolean isUnifiedNativeAdRequested() {
        List<String> list = this.zzdfg;
        return list != null && list.contains("6");
    }

    public final boolean isContentAdRequested() {
        List<String> list = this.zzdfg;
        if (list != null) {
            return list.contains("1") || this.zzdfg.contains("6");
        }
        return false;
    }

    public final boolean zzte() {
        List<String> list = this.zzdfg;
        return list != null && list.contains("3");
    }

    public final Map<String, Boolean> zztf() {
        return this.zzdfh;
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzccy;
    }
}
