package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzec implements zzef {
    private final /* synthetic */ Activity val$activity;

    zzec(zzdx zzdx, Activity activity) {
        this.val$activity = activity;
    }

    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.val$activity);
    }
}
