package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzlx implements zzmn {
    /* access modifiers changed from: private */
    public final int track;
    private final /* synthetic */ zzls zzbab;

    public zzlx(zzls zzls, int i) {
        this.zzbab = zzls;
        this.track = i;
    }

    public final boolean isReady() {
        return this.zzbab.zzat(this.track);
    }

    public final void zzhp() throws IOException {
        this.zzbab.zzhp();
    }

    public final int zzb(zzhb zzhb, zziv zziv, boolean z) {
        return this.zzbab.zza(this.track, zzhb, zziv, z);
    }

    public final void zzeh(long j) {
        this.zzbab.zzd(this.track, j);
    }
}
