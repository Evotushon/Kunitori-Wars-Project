package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzage implements zzagh {
    private final /* synthetic */ zzazy zzcyv;

    zzage(zzagf zzagf, zzazy zzazy) {
        this.zzcyv = zzazy;
    }

    public final void zzc(JSONObject jSONObject) {
        this.zzcyv.set(jSONObject);
    }

    public final void onFailure(@Nullable String str) {
        this.zzcyv.setException(new zzakd(str));
    }
}
