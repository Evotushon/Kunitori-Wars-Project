package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzaqc implements Thread.UncaughtExceptionHandler {
    private final /* synthetic */ zzaqa zzdjq;
    private final /* synthetic */ Thread.UncaughtExceptionHandler zzdjr;

    zzaqc(zzaqa zzaqa, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzdjq = zzaqa;
        this.zzdjr = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.zzdjq.zza(thread, th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zzdjr;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.zzdjr;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
