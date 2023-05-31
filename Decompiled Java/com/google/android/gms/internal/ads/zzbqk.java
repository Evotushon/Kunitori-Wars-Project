package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbqk extends zzbtk<zzbqm> implements zzbqm {
    public zzbqk(Set<zzbuv<zzbqm>> set) {
        super(set);
    }

    public final void onAdFailedToLoad(int i) {
        zza(new zzbqj(i));
    }
}
