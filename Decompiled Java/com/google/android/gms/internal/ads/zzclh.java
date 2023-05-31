package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzclh implements Callable {
    private final zzclc zzfzw;

    private zzclh(zzclc zzclc) {
        this.zzfzw = zzclc;
    }

    static Callable zza(zzclc zzclc) {
        return new zzclh(zzclc);
    }

    public final Object call() {
        return this.zzfzw.getWritableDatabase();
    }
}
