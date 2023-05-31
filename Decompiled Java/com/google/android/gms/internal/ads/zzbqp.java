package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbqp extends zzbtk<zzbqu> {
    private boolean zzfkk = false;

    public zzbqp(Set<zzbuv<zzbqu>> set) {
        super(set);
    }

    public final synchronized void onAdImpression() {
        if (!this.zzfkk) {
            zza(zzbqs.zzfkj);
            this.zzfkk = true;
        }
    }
}
