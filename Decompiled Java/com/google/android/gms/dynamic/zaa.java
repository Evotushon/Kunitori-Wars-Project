package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zaa implements DeferredLifecycleHelper.zaa {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ Bundle zarz;
    private final /* synthetic */ Bundle zasa;
    private final /* synthetic */ DeferredLifecycleHelper zasb;

    zaa(DeferredLifecycleHelper deferredLifecycleHelper, Activity activity, Bundle bundle, Bundle bundle2) {
        this.zasb = deferredLifecycleHelper;
        this.val$activity = activity;
        this.zarz = bundle;
        this.zasa = bundle2;
    }

    public final int getState() {
        return 0;
    }

    public final void zaa(LifecycleDelegate lifecycleDelegate) {
        this.zasb.zarv.onInflate(this.val$activity, this.zarz, this.zasa);
    }
}
