package com.google.android.gms.dynamic;

import android.os.Bundle;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zab implements OnDelegateCreatedListener<T> {
    private final /* synthetic */ DeferredLifecycleHelper zasb;

    zab(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zasb = deferredLifecycleHelper;
    }

    public final void onDelegateCreated(T t) {
        LifecycleDelegate unused = this.zasb.zarv = t;
        Iterator it = this.zasb.zarx.iterator();
        while (it.hasNext()) {
            ((DeferredLifecycleHelper.zaa) it.next()).zaa(this.zasb.zarv);
        }
        this.zasb.zarx.clear();
        Bundle unused2 = this.zasb.zarw = null;
    }
}
