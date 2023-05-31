package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcvy implements zzcyb<Bundle> {
    private final Bundle zzdks;

    public zzcvy(Bundle bundle) {
        this.zzdks = bundle;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza = zzdez.zza(bundle, "device");
        zza.putBundle("android_mem_info", this.zzdks);
        bundle.putBundle("device", zza);
    }
}
