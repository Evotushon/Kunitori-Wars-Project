package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzabw {
    private static final AtomicReference<zzabx> zzcwc = new AtomicReference<>();
    static final AtomicBoolean zzcwd = new AtomicBoolean();

    static zzabx zzra() {
        return zzcwc.get();
    }

    public static void zza(zzabx zzabx) {
        zzcwc.set(zzabx);
    }
}
