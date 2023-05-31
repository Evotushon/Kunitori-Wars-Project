package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final /* synthetic */ class zzaze implements zzazi {
    private final String zzczs;
    private final String zzczz;
    private final Map zzdac;
    private final byte[] zzdxd;

    zzaze(String str, String str2, Map map, byte[] bArr) {
        this.zzczz = str;
        this.zzczs = str2;
        this.zzdac = map;
        this.zzdxd = bArr;
    }

    public final void zzb(JsonWriter jsonWriter) {
        zzazb.zza(this.zzczz, this.zzczs, this.zzdac, this.zzdxd, jsonWriter);
    }
}
