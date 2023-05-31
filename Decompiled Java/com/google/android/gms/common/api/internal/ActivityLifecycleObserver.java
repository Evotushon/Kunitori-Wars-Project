package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public abstract class ActivityLifecycleObserver {
    @KeepForSdk
    public abstract ActivityLifecycleObserver onStopCallOnce(Runnable runnable);

    @KeepForSdk
    public static final ActivityLifecycleObserver of(Activity activity) {
        return new zaa(activity);
    }
}
