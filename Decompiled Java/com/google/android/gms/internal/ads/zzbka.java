package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbka implements Runnable {
    private final zzbdv zzeiw;
    private final JSONObject zzfej;

    zzbka(zzbdv zzbdv, JSONObject jSONObject) {
        this.zzeiw = zzbdv;
        this.zzfej = jSONObject;
    }

    public final void run() {
        this.zzeiw.zzb("AFMA_updateActiveView", this.zzfej);
    }
}
