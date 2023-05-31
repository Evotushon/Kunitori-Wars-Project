package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zac implements DeferredLifecycleHelper.zaa {
    private final /* synthetic */ ViewGroup val$container;
    private final /* synthetic */ Bundle zasa;
    private final /* synthetic */ DeferredLifecycleHelper zasb;
    private final /* synthetic */ FrameLayout zasc;
    private final /* synthetic */ LayoutInflater zasd;

    zac(DeferredLifecycleHelper deferredLifecycleHelper, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.zasb = deferredLifecycleHelper;
        this.zasc = frameLayout;
        this.zasd = layoutInflater;
        this.val$container = viewGroup;
        this.zasa = bundle;
    }

    public final int getState() {
        return 2;
    }

    public final void zaa(LifecycleDelegate lifecycleDelegate) {
        this.zasc.removeAllViews();
        this.zasc.addView(this.zasb.zarv.onCreateView(this.zasd, this.val$container, this.zasa));
    }
}
