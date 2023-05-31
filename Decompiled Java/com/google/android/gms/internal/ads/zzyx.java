package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzyx extends zzxc {
    @Nullable
    private final OnPaidEventListener zzcgi;

    public zzyx(@Nullable OnPaidEventListener onPaidEventListener) {
        this.zzcgi = onPaidEventListener;
    }

    public final void zza(zzum zzum) {
        if (this.zzcgi != null) {
            this.zzcgi.onPaidEvent(AdValue.zza(zzum.zzabo, zzum.zzabp, zzum.zzabq));
        }
    }
}
