package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbkm {
    @Nullable
    public static JSONObject zza(zzdei zzdei) {
        try {
            return new JSONObject(zzdei.zzdlx);
        } catch (JSONException unused) {
            return null;
        }
    }
}
