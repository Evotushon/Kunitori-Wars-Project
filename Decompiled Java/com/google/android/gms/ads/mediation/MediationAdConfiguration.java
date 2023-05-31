package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class MediationAdConfiguration {
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    private final String zzabx;
    private final int zzdeq;
    private final String zzdfr;
    private final String zzejm;
    private final Bundle zzejn;
    private final Bundle zzejo;
    private final int zzejp;
    private final boolean zzmj;
    private final Location zzmk;
    private final Context zzur;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public @interface TagForChildDirectedTreatment {
    }

    public MediationAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z, @Nullable Location location, int i, int i2, @Nullable String str2, String str3) {
        this.zzejm = str;
        this.zzejn = bundle;
        this.zzejo = bundle2;
        this.zzur = context;
        this.zzmj = z;
        this.zzmk = location;
        this.zzdeq = i;
        this.zzejp = i2;
        this.zzabx = str2;
        this.zzdfr = str3;
    }

    public String getBidResponse() {
        return this.zzejm;
    }

    public Bundle getServerParameters() {
        return this.zzejn;
    }

    public Bundle getMediationExtras() {
        return this.zzejo;
    }

    public Context getContext() {
        return this.zzur;
    }

    public Location getLocation() {
        return this.zzmk;
    }

    public int taggedForChildDirectedTreatment() {
        return this.zzdeq;
    }

    public boolean isTestRequest() {
        return this.zzmj;
    }

    public int taggedForUnderAgeTreatment() {
        return this.zzejp;
    }

    @Nullable
    public String getMaxAdContentRating() {
        return this.zzabx;
    }

    public String getWatermark() {
        return this.zzdfr;
    }
}
