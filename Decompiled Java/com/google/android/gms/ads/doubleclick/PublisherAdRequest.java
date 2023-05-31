package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzxq;
import com.google.android.gms.internal.ads.zzxr;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.List;
import java.util.Set;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class PublisherAdRequest {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    @Deprecated
    public static final String MAX_AD_CONTENT_RATING_G = "G";
    @Deprecated
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    @Deprecated
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    @Deprecated
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    private final zzxr zzabh;

    @Deprecated
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public @interface MaxAdContentRating {
    }

    @Deprecated
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public @interface TagForUnderAgeOfConsent {
    }

    private PublisherAdRequest(Builder builder) {
        this.zzabh = new zzxr(builder.zzabi);
    }

    @KeepForSdk
    @Deprecated
    public static void updateCorrelator() {
    }

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public static final class Builder {
        /* access modifiers changed from: private */
        public final zzxq zzabi = new zzxq();

        public final Builder addKeyword(String str) {
            this.zzabi.zzcg(str);
            return this;
        }

        public final Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.zzabi.zza(networkExtras);
            return this;
        }

        public final Builder addNetworkExtrasBundle(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
            this.zzabi.zza(cls, bundle);
            return this;
        }

        public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.zzabi.zzb(cls, bundle);
            return this;
        }

        @Deprecated
        public final Builder addTestDevice(String str) {
            this.zzabi.zzch(str);
            return this;
        }

        public final PublisherAdRequest build() {
            return new PublisherAdRequest(this);
        }

        @Deprecated
        public final Builder setBirthday(Date date) {
            this.zzabi.zza(date);
            return this;
        }

        public final Builder setContentUrl(String str) {
            Preconditions.checkNotNull(str, "Content URL must be non-null.");
            Preconditions.checkNotEmpty(str, "Content URL must be non-empty.");
            Preconditions.checkArgument(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.zzabi.zzcj(str);
            return this;
        }

        @Deprecated
        public final Builder setGender(int i) {
            this.zzabi.zzck(i);
            return this;
        }

        public final Builder setLocation(Location location) {
            this.zzabi.zza(location);
            return this;
        }

        @Deprecated
        public final Builder setManualImpressionsEnabled(boolean z) {
            this.zzabi.setManualImpressionsEnabled(z);
            return this;
        }

        public final Builder setPublisherProvidedId(String str) {
            this.zzabi.zzck(str);
            return this;
        }

        public final Builder setRequestAgent(String str) {
            this.zzabi.zzcl(str);
            return this;
        }

        @Deprecated
        public final Builder tagForChildDirectedTreatment(boolean z) {
            this.zzabi.zzz(z);
            return this;
        }

        public final Builder addCustomTargeting(String str, String str2) {
            this.zzabi.zze(str, str2);
            return this;
        }

        public final Builder addCustomTargeting(String str, List<String> list) {
            if (list != null) {
                this.zzabi.zze(str, TextUtils.join(",", list));
            }
            return this;
        }

        public final Builder addCategoryExclusion(String str) {
            this.zzabi.zzcm(str);
            return this;
        }

        @KeepForSdk
        public final Builder setAdInfo(AdInfo adInfo) {
            this.zzabi.zza(adInfo);
            return this;
        }

        @Deprecated
        public final Builder setIsDesignedForFamilies(boolean z) {
            this.zzabi.zzaa(z);
            return this;
        }

        @Deprecated
        public final Builder setTagForUnderAgeOfConsent(int i) {
            this.zzabi.zzcl(i);
            return this;
        }

        @Deprecated
        public final Builder setMaxAdContentRating(String str) {
            this.zzabi.zzcn(str);
            return this;
        }
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zzabh.getBirthday();
    }

    public final String getContentUrl() {
        return this.zzabh.getContentUrl();
    }

    @Deprecated
    public final int getGender() {
        return this.zzabh.getGender();
    }

    public final Set<String> getKeywords() {
        return this.zzabh.getKeywords();
    }

    public final Location getLocation() {
        return this.zzabh.getLocation();
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzabh.getManualImpressionsEnabled();
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return this.zzabh.getNetworkExtras(cls);
    }

    public final <T extends MediationExtrasReceiver> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.zzabh.getNetworkExtrasBundle(cls);
    }

    public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.zzabh.getCustomEventExtrasBundle(cls);
    }

    public final String getPublisherProvidedId() {
        return this.zzabh.getPublisherProvidedId();
    }

    public final boolean isTestDevice(Context context) {
        return this.zzabh.isTestDevice(context);
    }

    public final Bundle getCustomTargeting() {
        return this.zzabh.getCustomTargeting();
    }

    public final zzxr zzdl() {
        return this.zzabh;
    }
}
