package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzpw implements Application.ActivityLifecycleCallbacks {
    private final Application zzxe;
    private final WeakReference<Application.ActivityLifecycleCallbacks> zzxf;
    private boolean zzxg = false;

    public zzpw(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzxf = new WeakReference<>(activityLifecycleCallbacks);
        this.zzxe = application;
    }

    private final void zza(zzqe zzqe) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.zzxf.get();
            if (activityLifecycleCallbacks != null) {
                zzqe.zza(activityLifecycleCallbacks);
            } else if (!this.zzxg) {
                this.zzxe.unregisterActivityLifecycleCallbacks(this);
                this.zzxg = true;
            }
        } catch (Exception e) {
            zzawf.zzc("Error while dispatching lifecycle callback.", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzpv(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        zza(new zzpy(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        zza(new zzpx(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        zza(new zzqa(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        zza(new zzpz(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzqc(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        zza(new zzqb(this, activity));
    }
}
