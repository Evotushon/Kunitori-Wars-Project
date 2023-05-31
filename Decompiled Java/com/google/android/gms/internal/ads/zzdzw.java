package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdzw extends zzdzr {
    private zzdzw() {
        super();
    }

    /* access modifiers changed from: package-private */
    public final <L> List<L> zza(Object obj, long j) {
        zzdzi zzd = zzd(obj, j);
        if (zzd.zzbam()) {
            return zzd;
        }
        int size = zzd.size();
        zzdzi zzfd = zzd.zzfd(size == 0 ? 10 : size << 1);
        zzecb.zza(obj, j, (Object) zzfd);
        return zzfd;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j) {
        zzd(obj, j).zzban();
    }

    /* access modifiers changed from: package-private */
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzdzi zzd = zzd(obj, j);
        zzdzi zzd2 = zzd(obj2, j);
        int size = zzd.size();
        int size2 = zzd2.size();
        if (size > 0 && size2 > 0) {
            if (!zzd.zzbam()) {
                zzd = zzd.zzfd(size2 + size);
            }
            zzd.addAll(zzd2);
        }
        if (size > 0) {
            zzd2 = zzd;
        }
        zzecb.zza(obj, j, (Object) zzd2);
    }

    private static <E> zzdzi<E> zzd(Object obj, long j) {
        return (zzdzi) zzecb.zzp(obj, j);
    }
}
