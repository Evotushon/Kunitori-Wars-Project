package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzahh implements AdapterStatus {
    private final String description;
    private final int zzczh;
    private final AdapterStatus.State zzczj;

    public zzahh(AdapterStatus.State state, String str, int i) {
        this.zzczj = state;
        this.description = str;
        this.zzczh = i;
    }

    public final AdapterStatus.State getInitializationState() {
        return this.zzczj;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getLatency() {
        return this.zzczh;
    }
}
