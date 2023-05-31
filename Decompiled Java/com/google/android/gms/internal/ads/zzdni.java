package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdni<V> extends zzdnf<V, List<V>> {
    zzdni(zzdlq<? extends zzdof<? extends V>> zzdlq, boolean z) {
        super(zzdlq, true);
        zzaum();
    }

    public final /* synthetic */ Object zzi(List list) {
        ArrayList zzdz = zzdlz.zzdz(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzdla zzdla = (zzdla) it.next();
            zzdz.add(zzdla != null ? zzdla.zzats() : null);
        }
        return Collections.unmodifiableList(zzdz);
    }
}
