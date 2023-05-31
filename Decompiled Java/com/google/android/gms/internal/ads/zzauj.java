package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzauj implements zzauy {
    private final String zzczz;
    private final Bundle zzdqv;

    zzauj(String str, Bundle bundle) {
        this.zzczz = str;
        this.zzdqv = bundle;
    }

    public final void zza(zzbgd zzbgd) {
        zzbgd.logEvent("am", this.zzczz, this.zzdqv);
    }
}
