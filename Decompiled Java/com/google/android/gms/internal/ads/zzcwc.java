package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcwc implements zzcyb<Bundle> {
    private final zzdeg zzfdn;

    public zzcwc(zzdeg zzdeg) {
        this.zzfdn = zzdeg;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzdeg zzdeg = this.zzfdn;
        if (zzdeg != null) {
            bundle.putBoolean("render_in_browser", zzdeg.zzaqt());
            bundle.putBoolean("disable_ml", this.zzfdn.zzaqu());
        }
    }
}
