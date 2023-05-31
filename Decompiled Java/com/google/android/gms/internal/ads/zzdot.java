package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdot<V> extends zzdnn<V> implements RunnableFuture<V> {
    private volatile zzdob<?> zzhds;

    static <V> zzdot<V> zze(Callable<V> callable) {
        return new zzdot<>(callable);
    }

    static <V> zzdot<V> zza(Runnable runnable, @NullableDecl V v) {
        return new zzdot<>(Executors.callable(runnable, v));
    }

    private zzdot(Callable<V> callable) {
        this.zzhds = new zzdov(this, callable);
    }

    zzdot(zzdne<V> zzdne) {
        this.zzhds = new zzdos(this, zzdne);
    }

    public final void run() {
        zzdob<?> zzdob = this.zzhds;
        if (zzdob != null) {
            zzdob.run();
        }
        this.zzhds = null;
    }

    /* access modifiers changed from: protected */
    public final void afterDone() {
        zzdob<?> zzdob;
        super.afterDone();
        if (wasInterrupted() && (zzdob = this.zzhds) != null) {
            zzdob.interruptTask();
        }
        this.zzhds = null;
    }

    /* access modifiers changed from: protected */
    public final String pendingToString() {
        zzdob<?> zzdob = this.zzhds;
        if (zzdob == null) {
            return super.pendingToString();
        }
        String valueOf = String.valueOf(zzdob);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
