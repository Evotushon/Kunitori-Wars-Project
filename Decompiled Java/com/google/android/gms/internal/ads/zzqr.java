package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzqr implements Comparator<zzqx> {
    zzqr(zzqs zzqs) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzqx zzqx = (zzqx) obj;
        zzqx zzqx2 = (zzqx) obj2;
        int i = zzqx.zzbqp - zzqx2.zzbqp;
        if (i != 0) {
            return i;
        }
        return (int) (zzqx.value - zzqx2.value);
    }
}
