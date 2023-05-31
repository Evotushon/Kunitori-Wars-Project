package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzfy<T> {
    private final Map<String, AtomicReference<T>> zzaar = new HashMap();

    public final AtomicReference<T> zzaw(String str) {
        synchronized (this) {
            if (!this.zzaar.containsKey(str)) {
                this.zzaar.put(str, new AtomicReference());
            }
        }
        return this.zzaar.get(str);
    }
}
