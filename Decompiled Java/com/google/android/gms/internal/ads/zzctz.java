package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzctz implements zzcye<zzcyb<Bundle>> {
    private final Set<String> zzgib;

    zzctz(Set<String> set) {
        this.zzgib = set;
    }

    public final zzdof<zzcyb<Bundle>> zzapb() {
        ArrayList arrayList = new ArrayList();
        for (String add : this.zzgib) {
            arrayList.add(add);
        }
        return zzdnt.zzaj(new zzcuc(arrayList));
    }
}
