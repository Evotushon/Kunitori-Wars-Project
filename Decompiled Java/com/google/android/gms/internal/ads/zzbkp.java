package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbkp implements zzeej<JSONObject> {
    private final zzeew<zzdei> zzffh;

    private zzbkp(zzeew<zzdei> zzeew) {
        this.zzffh = zzeew;
    }

    public static zzbkp zzc(zzeew<zzdei> zzeew) {
        return new zzbkp(zzeew);
    }

    @Nullable
    public final /* synthetic */ Object get() {
        return zzbkm.zza(this.zzffh.get());
    }
}
