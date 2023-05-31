package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzckj implements Callable {
    private final zzdof zzfig;
    private final zzdof zzfjy;
    private final zzdof zzfsq;

    zzckj(zzdof zzdof, zzdof zzdof2, zzdof zzdof3) {
        this.zzfsq = zzdof;
        this.zzfjy = zzdof2;
        this.zzfig = zzdof3;
    }

    public final Object call() {
        return new zzckv((zzcky) this.zzfsq.get(), (JSONObject) this.zzfjy.get(), (zzard) this.zzfig.get());
    }
}
