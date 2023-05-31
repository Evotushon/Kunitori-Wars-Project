package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzrc implements Comparator<zzqq> {
    public zzrc(zzqz zzqz) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzqq zzqq = (zzqq) obj;
        zzqq zzqq2 = (zzqq) obj2;
        if (zzqq.zzmn() < zzqq2.zzmn()) {
            return -1;
        }
        if (zzqq.zzmn() > zzqq2.zzmn()) {
            return 1;
        }
        if (zzqq.zzmm() < zzqq2.zzmm()) {
            return -1;
        }
        if (zzqq.zzmm() > zzqq2.zzmm()) {
            return 1;
        }
        float zzmp = (zzqq.zzmp() - zzqq.zzmn()) * (zzqq.zzmo() - zzqq.zzmm());
        float zzmp2 = (zzqq2.zzmp() - zzqq2.zzmn()) * (zzqq2.zzmo() - zzqq2.zzmm());
        if (zzmp > zzmp2) {
            return -1;
        }
        if (zzmp < zzmp2) {
            return 1;
        }
        return 0;
    }
}
