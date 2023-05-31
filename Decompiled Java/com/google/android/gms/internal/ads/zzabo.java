package com.google.android.gms.internal.ads;

import com.level5.l5id.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzabo {
    public static zzaax<Long> zzcvh = zzaax.zzb("gads:dynamite_load:fail:sample_rate", 10000);
    public static zzaax<Boolean> zzcvi = zzaax.zzf("gads:report_dynamite_crash_in_background_thread", false);
    public static zzaax<String> zzcvj = zzaax.zzi("gads:public_beta:traffic_multiplier", BuildConfig.VERSION_NAME);
    public static zzaax<String> zzcvk = zzaax.zzi("gads:sdk_crash_report_class_prefix", "com.google.");
    public static zzaax<Boolean> zzcvl = zzaax.zzf("gads:sdk_crash_report_enabled", false);
    public static zzaax<Boolean> zzcvm = zzaax.zzf("gads:sdk_crash_report_full_stacktrace", false);
    public static zzaax<Double> zzcvn = new zzaax<>("gads:trapped_exception_sample_rate", Double.valueOf(0.01d), zzaaz.zzctl);
}
