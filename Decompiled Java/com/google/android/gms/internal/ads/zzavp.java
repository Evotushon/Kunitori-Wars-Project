package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzavp {
    private long zzdrc = -1;
    private long zzdrd = -1;
    private final /* synthetic */ zzavq zzdre;

    public zzavp(zzavq zzavq) {
        this.zzdre = zzavq;
    }

    public final long zzux() {
        return this.zzdrd;
    }

    public final void zzuy() {
        this.zzdrd = this.zzdre.zzbmz.elapsedRealtime();
    }

    public final void zzuz() {
        this.zzdrc = this.zzdre.zzbmz.elapsedRealtime();
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzdrc);
        bundle.putLong("tclose", this.zzdrd);
        return bundle;
    }
}
