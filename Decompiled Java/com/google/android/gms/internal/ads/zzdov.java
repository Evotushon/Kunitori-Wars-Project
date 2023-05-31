package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdov extends zzdob<V> {
    private final Callable<V> zzhct;
    private final /* synthetic */ zzdot zzhdr;

    zzdov(zzdot zzdot, Callable<V> callable) {
        this.zzhdr = zzdot;
        this.zzhct = (Callable) zzdlg.checkNotNull(callable);
    }

    /* access modifiers changed from: package-private */
    public final boolean isDone() {
        return this.zzhdr.isDone();
    }

    /* access modifiers changed from: package-private */
    public final V zzaur() throws Exception {
        return this.zzhct.call();
    }

    /* access modifiers changed from: package-private */
    public final void zzb(V v, Throwable th) {
        if (th == null) {
            this.zzhdr.set(v);
        } else {
            this.zzhdr.setException(th);
        }
    }

    /* access modifiers changed from: package-private */
    public final String zzaus() {
        return this.zzhct.toString();
    }
}
