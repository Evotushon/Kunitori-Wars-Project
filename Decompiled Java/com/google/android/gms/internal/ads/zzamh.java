package com.google.android.gms.internal.ads;

import android.location.Location;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzamh implements MediationAdRequest {
    private final String zzabx;
    private final int zzccn;
    private final boolean zzccy;
    private final int zzdeq;
    private final int zzder;
    private final Date zzmg;
    private final Set<String> zzmi;
    private final boolean zzmj;
    private final Location zzmk;

    public zzamh(@Nullable Date date, int i, @Nullable Set<String> set, @Nullable Location location, boolean z, int i2, boolean z2, int i3, String str) {
        this.zzmg = date;
        this.zzccn = i;
        this.zzmi = set;
        this.zzmk = location;
        this.zzmj = z;
        this.zzdeq = i2;
        this.zzccy = z2;
        this.zzder = i3;
        this.zzabx = str;
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

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzccy;
    }
}
