package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcxi implements zzdne {
    private final String zzczs;
    private final zzcxg zzgjs;
    private final List zzgju;
    private final Bundle zzgjv;

    zzcxi(zzcxg zzcxg, String str, List list, Bundle bundle) {
        this.zzgjs = zzcxg;
        this.zzczs = str;
        this.zzgju = list;
        this.zzgjv = bundle;
    }

    public final zzdof zzapl() {
        return this.zzgjs.zza(this.zzczs, this.zzgju, this.zzgjv);
    }
}
