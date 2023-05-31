package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdw implements zzef {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ Bundle zzxd;

    zzdw(zzdx zzdx, Activity activity, Bundle bundle) {
        this.val$activity = activity;
        this.zzxd = bundle;
    }

    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.val$activity, this.zzxd);
    }
}
