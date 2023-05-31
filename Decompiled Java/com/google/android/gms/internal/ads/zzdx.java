package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdx implements Application.ActivityLifecycleCallbacks {
    private final Application zzxe;
    private final WeakReference<Application.ActivityLifecycleCallbacks> zzxf;
    private boolean zzxg = false;

    public zzdx(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzxf = new WeakReference<>(activityLifecycleCallbacks);
        this.zzxe = application;
    }

    private final void zza(zzef zzef) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.zzxf.get();
            if (activityLifecycleCallbacks != null) {
                zzef.zza(activityLifecycleCallbacks);
            } else if (!this.zzxg) {
                this.zzxe.unregisterActivityLifecycleCallbacks(this);
                this.zzxg = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzdw(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        zza(new zzdz(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        zza(new zzdy(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        zza(new zzeb(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        zza(new zzea(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzed(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        zza(new zzec(this, activity));
    }
}
