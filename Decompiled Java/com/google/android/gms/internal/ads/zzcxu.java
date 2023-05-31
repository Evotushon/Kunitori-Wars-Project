package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcxu implements zzcye<zzcyb<Bundle>> {
    private final boolean zzgkh;

    zzcxu(@Nullable zzdcu zzdcu) {
        if (zzdcu != null) {
            this.zzgkh = true;
        } else {
            this.zzgkh = false;
        }
    }

    public final zzdof<zzcyb<Bundle>> zzapb() {
        return zzdnt.zzaj(this.zzgkh ? zzcxt.zzgkg : null);
    }
}
