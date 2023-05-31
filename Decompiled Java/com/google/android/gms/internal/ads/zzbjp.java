package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbjp implements zzbjj {
    private final zzawh zzdsq;

    public zzbjp(zzawh zzawh) {
        this.zzdsq = zzawh;
    }

    public final void zzk(Map<String, String> map) {
        String str = map.get("value");
        if ("auto_collect_location".equals(map.get("key"))) {
            this.zzdsq.zzaq(Boolean.parseBoolean(str));
        }
    }
}
