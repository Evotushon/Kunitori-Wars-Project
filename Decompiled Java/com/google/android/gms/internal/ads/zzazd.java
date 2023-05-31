package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final /* synthetic */ class zzazd implements zzazi {
    private final int zzdxb;
    private final Map zzdxc;

    zzazd(int i, Map map) {
        this.zzdxb = i;
        this.zzdxc = map;
    }

    public final void zzb(JsonWriter jsonWriter) {
        zzazb.zza(this.zzdxb, this.zzdxc, jsonWriter);
    }
}
