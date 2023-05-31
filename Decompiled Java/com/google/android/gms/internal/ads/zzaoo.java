package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaoo {
    private final zzbdv zzdae;
    private final boolean zzdgw;
    private final String zzdgx;

    public zzaoo(zzbdv zzbdv, Map<String, String> map) {
        this.zzdae = zzbdv;
        this.zzdgx = map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.zzdgw = Boolean.parseBoolean(map.get("allowOrientationChange"));
        } else {
            this.zzdgw = true;
        }
    }

    public final void execute() {
        int i;
        if (this.zzdae == null) {
            zzawf.zzfa("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(this.zzdgx)) {
            zzq.zzkx();
            i = 7;
        } else if ("landscape".equalsIgnoreCase(this.zzdgx)) {
            zzq.zzkx();
            i = 6;
        } else if (this.zzdgw) {
            i = -1;
        } else {
            i = zzq.zzkx().zzwt();
        }
        this.zzdae.setRequestedOrientation(i);
    }
}
