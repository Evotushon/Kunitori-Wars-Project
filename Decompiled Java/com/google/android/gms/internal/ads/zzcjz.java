package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcjz implements zzdng {
    private final zzaqx zzfks;

    zzcjz(zzaqx zzaqx) {
        this.zzfks = zzaqx;
    }

    public final zzdof zzf(Object obj) {
        zzaqx zzaqx = this.zzfks;
        zzaqx.zzdnd = new String(zzdmo.toByteArray((InputStream) obj), zzdks.UTF_8);
        return zzdnt.zzaj(zzaqx);
    }
}
