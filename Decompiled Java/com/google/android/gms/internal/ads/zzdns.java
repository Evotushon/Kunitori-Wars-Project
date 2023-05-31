package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzdns<V> extends zzdnp<V> implements zzdof<V> {
    protected zzdns() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: zzauu */
    public abstract zzdof<? extends V> zzaut();

    public void addListener(Runnable runnable, Executor executor) {
        zzaut().addListener(runnable, executor);
    }
}
