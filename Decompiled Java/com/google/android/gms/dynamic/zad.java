package com.google.android.gms.dynamic;

import android.os.Bundle;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zad implements DeferredLifecycleHelper.zaa {
    private final /* synthetic */ Bundle zasa;
    private final /* synthetic */ DeferredLifecycleHelper zasb;

    zad(DeferredLifecycleHelper deferredLifecycleHelper, Bundle bundle) {
        this.zasb = deferredLifecycleHelper;
        this.zasa = bundle;
    }

    public final int getState() {
        return 1;
    }

    public final void zaa(LifecycleDelegate lifecycleDelegate) {
        this.zasb.zarv.onCreate(this.zasa);
    }
}
