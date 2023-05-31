package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaxv {
    public final int count;
    public final String name;
    private final double zzdvd;
    private final double zzdve;
    public final double zzdvf;

    public zzaxv(String str, double d, double d2, double d3, int i) {
        this.name = str;
        this.zzdve = d;
        this.zzdvd = d2;
        this.zzdvf = d3;
        this.count = i;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(AppMeasurementSdk.ConditionalUserProperty.NAME, this.name).add("minBound", Double.valueOf(this.zzdve)).add("maxBound", Double.valueOf(this.zzdvd)).add("percent", Double.valueOf(this.zzdvf)).add("count", Integer.valueOf(this.count)).toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaxv)) {
            return false;
        }
        zzaxv zzaxv = (zzaxv) obj;
        if (Objects.equal(this.name, zzaxv.name) && this.zzdvd == zzaxv.zzdvd && this.zzdve == zzaxv.zzdve && this.count == zzaxv.count && Double.compare(this.zzdvf, zzaxv.zzdvf) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.name, Double.valueOf(this.zzdvd), Double.valueOf(this.zzdve), Double.valueOf(this.zzdvf), Integer.valueOf(this.count));
    }
}
