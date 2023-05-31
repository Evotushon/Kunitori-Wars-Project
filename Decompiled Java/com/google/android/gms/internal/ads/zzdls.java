package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public abstract class zzdls<E> {
    zzdls() {
    }

    public abstract zzdls<E> zzaf(E e);

    public zzdls<E> zze(Iterable<? extends E> iterable) {
        for (Object zzaf : iterable) {
            zzaf(zzaf);
        }
        return this;
    }

    public zzdls<E> zza(Iterator<? extends E> it) {
        while (it.hasNext()) {
            zzaf(it.next());
        }
        return this;
    }
}
