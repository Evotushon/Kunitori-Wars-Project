package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcut implements zzcyb<Bundle> {
    private final float zzdkj;
    private final int zzdnm;
    private final boolean zzdnn;
    private final boolean zzdno;
    private final int zzdnp;
    private final int zzdnq;
    private final int zzdnr;
    private final boolean zzgiq;

    public zzcut(int i, boolean z, boolean z2, int i2, int i3, int i4, float f, boolean z3) {
        this.zzdnm = i;
        this.zzdnn = z;
        this.zzdno = z2;
        this.zzdnp = i2;
        this.zzdnq = i3;
        this.zzdnr = i4;
        this.zzdkj = f;
        this.zzgiq = z3;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.zzdnm);
        bundle.putBoolean("ma", this.zzdnn);
        bundle.putBoolean("sp", this.zzdno);
        bundle.putInt("muv", this.zzdnp);
        bundle.putInt("rm", this.zzdnq);
        bundle.putInt("riv", this.zzdnr);
        bundle.putFloat("android_app_volume", this.zzdkj);
        bundle.putBoolean("android_app_muted", this.zzgiq);
    }
}
