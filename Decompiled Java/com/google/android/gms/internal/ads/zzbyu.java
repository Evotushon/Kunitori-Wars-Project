package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbyu {
    @Nullable
    private zzacm zzcfx;

    public zzbyu(zzbym zzbym) {
        this.zzcfx = zzbym;
    }

    @Nullable
    public final synchronized zzacm zzrv() {
        return this.zzcfx;
    }

    public final synchronized void zza(@Nullable zzacm zzacm) {
        this.zzcfx = zzacm;
    }
}
