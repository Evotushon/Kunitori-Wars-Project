package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzdhy implements Callable {
    private final zzdhp zzguy;

    zzdhy(zzdhp zzdhp) {
        this.zzguy = zzdhp;
    }

    public final Object call() {
        this.zzguy.run();
        return null;
    }
}
