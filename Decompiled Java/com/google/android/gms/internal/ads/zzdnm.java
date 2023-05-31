package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
enum zzdnm implements Executor {
    INSTANCE;

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
