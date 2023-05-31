package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbkn implements Runnable {
    private final JSONObject zzfej;
    private final zzbkk zzffl;

    zzbkn(zzbkk zzbkk, JSONObject jSONObject) {
        this.zzffl = zzbkk;
        this.zzfej = jSONObject;
    }

    public final void run() {
        this.zzffl.zzi(this.zzfej);
    }
}
