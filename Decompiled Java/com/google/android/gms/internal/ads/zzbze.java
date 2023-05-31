package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbze implements zzeej<zzbzc> {
    private final zzeew<JSONObject> zzenk;
    private final zzeew<zzdei> zzffh;

    public zzbze(zzeew<zzdei> zzeew, zzeew<JSONObject> zzeew2) {
        this.zzffh = zzeew;
        this.zzenk = zzeew2;
    }

    public final /* synthetic */ Object get() {
        return new zzbzc(this.zzffh.get(), this.zzenk.get());
    }
}
