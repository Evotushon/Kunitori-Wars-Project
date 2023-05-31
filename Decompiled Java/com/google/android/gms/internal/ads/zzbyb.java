package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbyb implements zzafz<Object> {
    private WeakReference<zzbxz> zzfnt;

    private zzbyb(zzbxz zzbxz) {
        this.zzfnt = new WeakReference<>(zzbxz);
    }

    public final void zza(Object obj, Map<String, String> map) {
        zzbxz zzbxz = (zzbxz) this.zzfnt.get();
        if (zzbxz != null && "_ac".equals(map.get("eventName"))) {
            zzbxz.zzfng.onAdClicked();
        }
    }
}
