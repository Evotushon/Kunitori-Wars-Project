package com.google.android.gms.ads;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class AdValue {
    private final int zzabo;
    private final String zzabp;
    private final long zzabq;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public @interface PrecisionType {
        public static final int ESTIMATED = 1;
        public static final int PRECISE = 3;
        public static final int PUBLISHER_PROVIDED = 2;
        public static final int UNKNOWN = 0;
    }

    private AdValue(int i, String str, long j) {
        this.zzabo = i;
        this.zzabp = str;
        this.zzabq = j;
    }

    public static AdValue zza(int i, String str, long j) {
        return new AdValue(i, str, j);
    }

    public final int getPrecisionType() {
        return this.zzabo;
    }

    public final String getCurrencyCode() {
        return this.zzabp;
    }

    public final long getValueMicros() {
        return this.zzabq;
    }
}
