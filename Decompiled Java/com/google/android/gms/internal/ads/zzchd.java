package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzchd implements zzeej<zzcha> {
    private final zzeew<Clock> zzfex;

    public zzchd(zzeew<Clock> zzeew) {
        this.zzfex = zzeew;
    }

    public final /* synthetic */ Object get() {
        return new zzcha(this.zzfex.get());
    }
}
