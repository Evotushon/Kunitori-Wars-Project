package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcbp implements zzdku {
    static final zzdku zzdpv = new zzcbp();

    private zzcbp() {
    }

    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzcbr zzcbr : (List) obj) {
            if (zzcbr != null) {
                arrayList.add(zzcbr);
            }
        }
        return arrayList;
    }
}
