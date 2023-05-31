package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbvd implements zzbva {
    private final List<String> zzdlr;
    private final zzdis zzfdr;
    private boolean zzflr;

    public zzbvd(zzdei zzdei, zzdis zzdis) {
        this.zzdlr = zzdei.zzdlr;
        this.zzfdr = zzdis;
    }

    public final void zzaix() {
        if (!this.zzflr) {
            this.zzfdr.zzh(this.zzdlr);
            this.zzflr = true;
        }
    }
}
