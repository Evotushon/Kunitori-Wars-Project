package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcyl implements zzcyb<Bundle> {
    private final String zzdns;
    private final int zzdnt;
    private final int zzdnu;
    private final int zzdnv;
    private final boolean zzdnw;
    private final int zzdnx;

    public zzcyl(String str, int i, int i2, int i3, boolean z, int i4) {
        this.zzdns = str;
        this.zzdnt = i;
        this.zzdnu = i2;
        this.zzdnv = i3;
        this.zzdnw = z;
        this.zzdnx = i4;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.zzdns;
        boolean z = true;
        zzdez.zza(bundle, "carrier", str, !TextUtils.isEmpty(str));
        Integer valueOf = Integer.valueOf(this.zzdnt);
        if (this.zzdnt == -2) {
            z = false;
        }
        zzdez.zza(bundle, "cnt", valueOf, z);
        bundle.putInt("gnt", this.zzdnu);
        bundle.putInt("pt", this.zzdnv);
        Bundle zza = zzdez.zza(bundle, "device");
        bundle.putBundle("device", zza);
        Bundle zza2 = zzdez.zza(zza, "network");
        zza.putBundle("network", zza2);
        zza2.putInt("active_network_state", this.zzdnx);
        zza2.putBoolean("active_network_metered", this.zzdnw);
    }
}
