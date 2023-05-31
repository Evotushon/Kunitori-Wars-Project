package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzazh;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class RequestConfiguration {
    public static final String MAX_AD_CONTENT_RATING_G = "G";
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    public static final List<String> zzabz = Arrays.asList(new String[]{"MA", "T", "PG", "G"});
    private final int zzabv;
    private final int zzabw;
    private final String zzabx;
    private final List<String> zzaby;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public @interface MaxAdContentRating {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public @interface TagForChildDirectedTreatment {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public @interface TagForUnderAgeOfConsent {
    }

    private RequestConfiguration(int i, int i2, String str, List<String> list) {
        this.zzabv = i;
        this.zzabw = i2;
        this.zzabx = str;
        this.zzaby = list;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public static class Builder {
        private int zzabv = -1;
        private int zzabw = -1;
        private String zzabx = null;
        private final List<String> zzaby = new ArrayList();

        public RequestConfiguration build() {
            return new RequestConfiguration(this.zzabv, this.zzabw, this.zzabx, this.zzaby);
        }

        public Builder setTagForChildDirectedTreatment(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.zzabv = i;
            } else {
                StringBuilder sb = new StringBuilder(68);
                sb.append("Invalid value passed to setTagForChildDirectedTreatment: ");
                sb.append(i);
                zzazh.zzfa(sb.toString());
            }
            return this;
        }

        public Builder setTagForUnderAgeOfConsent(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.zzabw = i;
            } else {
                StringBuilder sb = new StringBuilder(63);
                sb.append("Invalid value passed to setTagForUnderAgeOfConsent: ");
                sb.append(i);
                zzazh.zzfa(sb.toString());
            }
            return this;
        }

        public Builder setMaxAdContentRating(String str) {
            if (str == null || "".equals(str)) {
                this.zzabx = null;
            } else if ("G".equals(str) || "PG".equals(str) || "T".equals(str) || "MA".equals(str)) {
                this.zzabx = str;
            } else {
                String valueOf = String.valueOf(str);
                zzazh.zzfa(valueOf.length() != 0 ? "Invalid value passed to setMaxAdContentRating: ".concat(valueOf) : new String("Invalid value passed to setMaxAdContentRating: "));
            }
            return this;
        }

        public Builder setTestDeviceIds(@Nullable List<String> list) {
            this.zzaby.clear();
            if (list != null) {
                this.zzaby.addAll(list);
            }
            return this;
        }
    }

    public int getTagForChildDirectedTreatment() {
        return this.zzabv;
    }

    public int getTagForUnderAgeOfConsent() {
        return this.zzabw;
    }

    public String getMaxAdContentRating() {
        String str = this.zzabx;
        return str == null ? "" : str;
    }

    public List<String> getTestDeviceIds() {
        return new ArrayList(this.zzaby);
    }

    public Builder toBuilder() {
        return new Builder().setTagForChildDirectedTreatment(this.zzabv).setTagForUnderAgeOfConsent(this.zzabw).setMaxAdContentRating(this.zzabx).setTestDeviceIds(this.zzaby);
    }
}
