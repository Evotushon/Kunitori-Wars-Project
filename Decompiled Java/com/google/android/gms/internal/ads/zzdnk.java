package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdnk extends zzdnj<V> {
    private final /* synthetic */ zzdnh zzhcs;
    private final Callable<V> zzhct;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdnk(zzdnh zzdnh, Callable<V> callable, Executor executor) {
        super(zzdnh, executor);
        this.zzhcs = zzdnh;
        this.zzhct = (Callable) zzdlg.checkNotNull(callable);
    }

    /* access modifiers changed from: package-private */
    public final V zzaur() throws Exception {
        this.zzhcr = false;
        return this.zzhct.call();
    }

    /* access modifiers changed from: package-private */
    public final void setValue(V v) {
        this.zzhcs.set(v);
    }

    /* access modifiers changed from: package-private */
    public final String zzaus() {
        return this.zzhct.toString();
    }
}
