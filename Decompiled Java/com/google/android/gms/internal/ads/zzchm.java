package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.internal.zzq;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzchm implements AppEventListener, zzbqh, zzbqm, zzbqt, zzbqu, zzbrn, zzbsn, zzdil, zztz {
    private long startTime;
    private final List<Object> zzdxa;
    private final zzcha zzfwm;

    public zzchm(zzcha zzcha, zzbgk zzbgk) {
        this.zzfwm = zzcha;
        this.zzdxa = Collections.singletonList(zzbgk);
    }

    public final void zzb(zzdeq zzdeq) {
    }

    public final void zzby(Context context) {
        zza((Class<?>) zzbqt.class, "onPause", context);
    }

    public final void zzbz(Context context) {
        zza((Class<?>) zzbqt.class, "onResume", context);
    }

    public final void zzca(Context context) {
        zza((Class<?>) zzbqt.class, "onDestroy", context);
    }

    public final void onAppEvent(String str, String str2) {
        zza((Class<?>) AppEventListener.class, "onAppEvent", str, str2);
    }

    public final void onAdLoaded() {
        long elapsedRealtime = zzq.zzlc().elapsedRealtime() - this.startTime;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(elapsedRealtime);
        zzawf.zzee(sb.toString());
        zza((Class<?>) zzbrn.class, "onAdLoaded", new Object[0]);
    }

    public final void onAdFailedToLoad(int i) {
        zza((Class<?>) zzbqm.class, "onAdFailedToLoad", Integer.valueOf(i));
    }

    public final void onAdOpened() {
        zza((Class<?>) zzbqh.class, "onAdOpened", new Object[0]);
    }

    public final void onAdClosed() {
        zza((Class<?>) zzbqh.class, "onAdClosed", new Object[0]);
    }

    public final void onAdLeftApplication() {
        zza((Class<?>) zzbqh.class, "onAdLeftApplication", new Object[0]);
    }

    public final void onAdClicked() {
        zza((Class<?>) zztz.class, "onAdClicked", new Object[0]);
    }

    public final void onAdImpression() {
        zza((Class<?>) zzbqu.class, "onAdImpression", new Object[0]);
    }

    public final void onRewardedVideoStarted() {
        zza((Class<?>) zzbqh.class, "onRewardedVideoStarted", new Object[0]);
    }

    @ParametersAreNonnullByDefault
    public final void zzb(zzarr zzarr, String str, String str2) {
        zza((Class<?>) zzbqh.class, "onRewarded", zzarr, str, str2);
    }

    public final void onRewardedVideoCompleted() {
        zza((Class<?>) zzbqh.class, "onRewardedVideoCompleted", new Object[0]);
    }

    public final void zza(zzdig zzdig, String str) {
        zza((Class<?>) zzdid.class, "onTaskCreated", str);
    }

    public final void zzb(zzdig zzdig, String str) {
        zza((Class<?>) zzdid.class, "onTaskStarted", str);
    }

    public final void zza(zzdig zzdig, String str, Throwable th) {
        zza((Class<?>) zzdid.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    public final void zzc(zzdig zzdig, String str) {
        zza((Class<?>) zzdid.class, "onTaskSucceeded", str);
    }

    private final void zza(Class<?> cls, String str, Object... objArr) {
        zzcha zzcha = this.zzfwm;
        List<Object> list = this.zzdxa;
        String valueOf = String.valueOf(cls.getSimpleName());
        zzcha.zza(list, valueOf.length() != 0 ? "Event-".concat(valueOf) : new String("Event-"), str, objArr);
    }

    public final void zzd(zzaqx zzaqx) {
        this.startTime = zzq.zzlc().elapsedRealtime();
        zza((Class<?>) zzbsn.class, "onAdRequest", new Object[0]);
    }
}
