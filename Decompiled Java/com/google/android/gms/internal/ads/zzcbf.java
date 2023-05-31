package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcbf implements zzdku {
    static final zzdku zzdpv = new zzcbf();

    private zzcbf() {
    }

    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzacd zzacd : (List) obj) {
            if (zzacd != null) {
                arrayList.add(zzacd);
            }
        }
        return arrayList;
    }
}
