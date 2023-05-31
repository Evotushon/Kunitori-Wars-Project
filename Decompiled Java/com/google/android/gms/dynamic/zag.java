package com.google.android.gms.dynamic;

import com.google.android.gms.dynamic.DeferredLifecycleHelper;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zag implements DeferredLifecycleHelper.zaa {
    private final /* synthetic */ DeferredLifecycleHelper zasb;

    zag(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zasb = deferredLifecycleHelper;
    }

    public final int getState() {
        return 5;
    }

    public final void zaa(LifecycleDelegate lifecycleDelegate) {
        this.zasb.zarv.onResume();
    }
}
