package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbjk implements zzbjj {
    private zzawh zzdsq;

    public zzbjk(zzawh zzawh) {
        this.zzdsq = zzawh;
    }

    public final void zzk(Map<String, String> map) {
        this.zzdsq.zzap(Boolean.parseBoolean(map.get("content_vertical_opted_out")));
    }
}
