package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zznw {
    private final Map<String, String> zzbfy = new HashMap();
    private Map<String, String> zzbfz;

    public final synchronized Map<String, String> zziq() {
        if (this.zzbfz == null) {
            this.zzbfz = Collections.unmodifiableMap(new HashMap(this.zzbfy));
        }
        return this.zzbfz;
    }
}
