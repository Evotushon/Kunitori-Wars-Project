package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzckg implements Callable {
    private final zzdof zzfjy;
    private final zzdof zzfsq;

    zzckg(zzdof zzdof, zzdof zzdof2) {
        this.zzfsq = zzdof;
        this.zzfjy = zzdof2;
    }

    public final Object call() {
        return new zzckz((JSONObject) this.zzfsq.get(), (zzard) this.zzfjy.get());
    }
}
