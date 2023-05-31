package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcun implements zzcyb<Bundle> {
    private final boolean zzgik = false;
    private final boolean zzgil = false;
    private final boolean zzgim;

    public zzcun(boolean z, boolean z2, boolean z3) {
        this.zzgim = z3;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("c_pcbg", this.zzgik);
        bundle.putBoolean("c_phbg", this.zzgil);
        bundle.putBoolean("ar_lr", this.zzgim);
    }
}
