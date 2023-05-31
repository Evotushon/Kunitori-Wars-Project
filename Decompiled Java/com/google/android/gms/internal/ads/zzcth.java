package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcth implements zzdng {
    private final zzaqx zzfks;

    zzcth(zzaqx zzaqx) {
        this.zzfks = zzaqx;
    }

    public final zzdof zzf(Object obj) {
        return zzdnt.zzaj(new zzctj(new JsonReader(new InputStreamReader((InputStream) obj))).zzn(this.zzfks.zzdmz));
    }
}
