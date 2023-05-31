package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcok implements Callable {
    private final zzdof zzfig;
    private final zzdof zzfjy;
    private final zzdeq zzgck;
    private final zzcoh zzgcq;
    private final zzdei zzgct;
    private final JSONObject zzgcu;

    zzcok(zzcoh zzcoh, zzdof zzdof, zzdof zzdof2, zzdeq zzdeq, zzdei zzdei, JSONObject jSONObject) {
        this.zzgcq = zzcoh;
        this.zzfjy = zzdof;
        this.zzfig = zzdof2;
        this.zzgck = zzdeq;
        this.zzgct = zzdei;
        this.zzgcu = jSONObject;
    }

    public final Object call() {
        return this.zzgcq.zza(this.zzfjy, this.zzfig, this.zzgck, this.zzgct, this.zzgcu);
    }
}
