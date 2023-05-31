package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zaa extends ActivityLifecycleObserver {
    private final WeakReference<C0001zaa> zacp;

    public zaa(Activity activity) {
        this(C0001zaa.zaa(activity));
    }

    @VisibleForTesting(otherwise = 2)
    private zaa(C0001zaa zaa) {
        this.zacp = new WeakReference<>(zaa);
    }

    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        C0001zaa zaa = (C0001zaa) this.zacp.get();
        if (zaa != null) {
            zaa.zaa(runnable);
            return this;
        }
        throw new IllegalStateException("The target activity has already been GC'd");
    }

    @VisibleForTesting(otherwise = 2)
    /* renamed from: com.google.android.gms.common.api.internal.zaa$zaa  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    static class C0001zaa extends LifecycleCallback {
        private List<Runnable> zacq = new ArrayList();

        /* access modifiers changed from: private */
        public static C0001zaa zaa(Activity activity) {
            C0001zaa zaa;
            synchronized (activity) {
                LifecycleFragment fragment = getFragment(activity);
                zaa = (C0001zaa) fragment.getCallbackOrNull("LifecycleObserverOnStop", C0001zaa.class);
                if (zaa == null) {
                    zaa = new C0001zaa(fragment);
                }
            }
            return zaa;
        }

        private C0001zaa(LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
        }

        /* access modifiers changed from: private */
        public final synchronized void zaa(Runnable runnable) {
            this.zacq.add(runnable);
        }

        @MainThread
        public void onStop() {
            List<Runnable> list;
            synchronized (this) {
                list = this.zacq;
                this.zacq = new ArrayList();
            }
            for (Runnable run : list) {
                run.run();
            }
        }
    }
}
