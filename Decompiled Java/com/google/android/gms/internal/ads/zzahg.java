package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzahg implements InitializationStatus {
    private final Map<String, AdapterStatus> zzczi;

    public zzahg(Map<String, AdapterStatus> map) {
        this.zzczi = map;
    }

    public final Map<String, AdapterStatus> getAdapterStatusMap() {
        return this.zzczi;
    }
}
