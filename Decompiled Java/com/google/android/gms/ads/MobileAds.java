package com.google.android.gms.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzxu;
import com.google.android.gms.internal.ads.zzyd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class MobileAds {
    private MobileAds() {
    }

    @RequiresPermission("android.permission.INTERNET")
    public static void initialize(Context context, String str) {
        initialize(context, str, (Settings) null);
    }

    @RequiresPermission("android.permission.INTERNET")
    @Deprecated
    public static void initialize(Context context, String str, Settings settings) {
        zzyd zzyd;
        zzxu zzpy = zzxu.zzpy();
        if (settings == null) {
            zzyd = null;
        } else {
            zzyd = settings.zzdp();
        }
        zzpy.zza(context, str, zzyd, (OnInitializationCompleteListener) null);
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public static final class Settings {
        private final zzyd zzabt = new zzyd();

        @Deprecated
        public final String getTrackingId() {
            return null;
        }

        @Deprecated
        public final boolean isGoogleAnalyticsEnabled() {
            return false;
        }

        @Deprecated
        public final Settings setGoogleAnalyticsEnabled(boolean z) {
            return this;
        }

        @Deprecated
        public final Settings setTrackingId(String str) {
            return this;
        }

        /* access modifiers changed from: package-private */
        public final zzyd zzdp() {
            return this.zzabt;
        }
    }

    public static void initialize(Context context) {
        initialize(context, (String) null, (Settings) null);
    }

    public static void initialize(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        zzxu.zzpy().zza(context, (String) null, (zzyd) null, onInitializationCompleteListener);
    }

    public static RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        return zzxu.zzpy().getRewardedVideoAdInstance(context);
    }

    public static void setAppVolume(float f) {
        zzxu.zzpy().setAppVolume(f);
    }

    public static void setAppMuted(boolean z) {
        zzxu.zzpy().setAppMuted(z);
    }

    public static void openDebugMenu(Context context, String str) {
        zzxu.zzpy().openDebugMenu(context, str);
    }

    public static String getVersionString() {
        return zzxu.zzpy().getVersionString();
    }

    @KeepForSdk
    public static void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        zzxu.zzpy().registerRtbAdapter(cls);
    }

    public static InitializationStatus getInitializationStatus() {
        return zzxu.zzpy().getInitializationStatus();
    }

    @NonNull
    public static RequestConfiguration getRequestConfiguration() {
        return zzxu.zzpy().getRequestConfiguration();
    }

    public static void setRequestConfiguration(@NonNull RequestConfiguration requestConfiguration) {
        zzxu.zzpy().setRequestConfiguration(requestConfiguration);
    }
}
