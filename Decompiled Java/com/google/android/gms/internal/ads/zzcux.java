package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcux implements zzcyb<Bundle> {
    private final double zzdny;
    private final boolean zzdnz;

    public zzcux(double d, boolean z) {
        this.zzdny = d;
        this.zzdnz = z;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza = zzdez.zza(bundle, "device");
        bundle.putBundle("device", zza);
        Bundle zza2 = zzdez.zza(zza, "battery");
        zza.putBundle("battery", zza2);
        zza2.putBoolean("is_charging", this.zzdnz);
        zza2.putDouble("battery_level", this.zzdny);
    }
}
