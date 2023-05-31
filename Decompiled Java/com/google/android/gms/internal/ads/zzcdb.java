package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcdb implements zzdnu<zzbdv> {
    private final /* synthetic */ String zzftp;
    private final /* synthetic */ Map zzftq;

    zzcdb(zzccv zzccv, String str, Map map) {
        this.zzftp = str;
        this.zzftq = map;
    }

    public final void zzb(Throwable th) {
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        ((zzbdv) obj).zza(this.zzftp, (Map<String, ?>) this.zzftq);
    }
}
