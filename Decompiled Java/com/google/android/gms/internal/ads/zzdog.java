package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdog implements Executor {
    boolean zzhde = true;
    private final /* synthetic */ Executor zzhdf;
    private final /* synthetic */ zzdmt zzhdg;

    zzdog(Executor executor, zzdmt zzdmt) {
        this.zzhdf = executor;
        this.zzhdg = zzdmt;
    }

    public final void execute(Runnable runnable) {
        try {
            this.zzhdf.execute(new zzdoj(this, runnable));
        } catch (RejectedExecutionException e) {
            if (this.zzhde) {
                this.zzhdg.setException(e);
            }
        }
    }
}
