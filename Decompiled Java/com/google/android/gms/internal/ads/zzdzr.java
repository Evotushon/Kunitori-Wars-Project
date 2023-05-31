package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
abstract class zzdzr {
    private static final zzdzr zzhuq = new zzdzt();
    private static final zzdzr zzhur = new zzdzw();

    private zzdzr() {
    }

    /* access modifiers changed from: package-private */
    public abstract <L> List<L> zza(Object obj, long j);

    /* access modifiers changed from: package-private */
    public abstract <L> void zza(Object obj, Object obj2, long j);

    /* access modifiers changed from: package-private */
    public abstract void zzb(Object obj, long j);

    static zzdzr zzbdw() {
        return zzhuq;
    }

    static zzdzr zzbdx() {
        return zzhur;
    }
}
