package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
abstract class zzdnj<T> extends zzdob<T> {
    private final Executor zzhcq;
    boolean zzhcr = true;
    private final /* synthetic */ zzdnh zzhcs;

    zzdnj(zzdnh zzdnh, Executor executor) {
        this.zzhcs = zzdnh;
        this.zzhcq = (Executor) zzdlg.checkNotNull(executor);
    }

    /* access modifiers changed from: package-private */
    public abstract void setValue(T t);

    /* access modifiers changed from: package-private */
    public final boolean isDone() {
        return this.zzhcs.isDone();
    }

    /* access modifiers changed from: package-private */
    public final void execute() {
        try {
            this.zzhcq.execute(this);
        } catch (RejectedExecutionException e) {
            if (this.zzhcr) {
                this.zzhcs.setException(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(T t, Throwable th) {
        zzdnj unused = this.zzhcs.zzhcp = null;
        if (th == null) {
            setValue(t);
        } else if (th instanceof ExecutionException) {
            this.zzhcs.setException(th.getCause());
        } else if (th instanceof CancellationException) {
            this.zzhcs.cancel(false);
        } else {
            this.zzhcs.setException(th);
        }
    }
}
