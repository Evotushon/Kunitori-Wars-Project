package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Predicate;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzaiv implements Predicate {
    private final zzafz zzdag;

    zzaiv(zzafz zzafz) {
        this.zzdag = zzafz;
    }

    public final boolean apply(Object obj) {
        zzafz zzafz = (zzafz) obj;
        return (zzafz instanceof zzaiy) && zzaiy.zza((zzaiy) zzafz).equals(this.zzdag);
    }
}
