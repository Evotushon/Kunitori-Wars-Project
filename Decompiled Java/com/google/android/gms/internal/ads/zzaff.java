package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaff implements zzafz<Object> {
    private final zzafe zzcxu;

    public zzaff(zzafe zzafe) {
        this.zzcxu = zzafe;
    }

    public final void zza(Object obj, Map<String, String> map) {
        if (this.zzcxu != null) {
            String str = map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (str == null) {
                zzawf.zzez("Ad metadata with no name parameter.");
                str = "";
            }
            Bundle bundle = null;
            if (map.containsKey("info")) {
                try {
                    bundle = zzayf.zzh(new JSONObject(map.get("info")));
                } catch (JSONException e) {
                    zzawf.zzc("Failed to convert ad metadata to JSON.", e);
                }
            }
            if (bundle == null) {
                zzawf.zzey("Failed to convert ad metadata to Bundle.");
            } else {
                this.zzcxu.zza(str, bundle);
            }
        }
    }
}
