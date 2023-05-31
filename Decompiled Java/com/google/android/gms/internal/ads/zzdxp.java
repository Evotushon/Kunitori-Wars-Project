package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdxp implements Comparator<zzdxn> {
    zzdxp() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzdxn zzdxn = (zzdxn) obj;
        zzdxn zzdxn2 = (zzdxn) obj2;
        zzdxw zzdxw = (zzdxw) zzdxn.iterator();
        zzdxw zzdxw2 = (zzdxw) zzdxn2.iterator();
        while (zzdxw.hasNext() && zzdxw2.hasNext()) {
            int compare = Integer.compare(zzdxn.zzb(zzdxw.nextByte()), zzdxn.zzb(zzdxw2.nextByte()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzdxn.size(), zzdxn2.size());
    }
}
