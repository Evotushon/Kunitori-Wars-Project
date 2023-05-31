package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzafh implements zzafz<Object> {
    private final zzafg zzcxv;

    public zzafh(zzafg zzafg) {
        this.zzcxv = zzafg;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            zzawf.zzfa("App event with no name parameter.");
        } else {
            this.zzcxv.onAppEvent(str, map.get("info"));
        }
    }
}
