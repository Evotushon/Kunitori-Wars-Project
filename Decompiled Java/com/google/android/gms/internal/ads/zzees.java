package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzees<T> implements zzeej<Set<T>> {
    private static final zzeej<Set<Object>> zzigm = zzeem.zzbe(Collections.emptySet());
    private final List<zzeew<T>> zzign;
    private final List<zzeew<Collection<T>>> zzigo;

    public static <T> zzeeu<T> zzas(int i, int i2) {
        return new zzeeu<>(i, i2);
    }

    private zzees(List<zzeew<T>> list, List<zzeew<Collection<T>>> list2) {
        this.zzign = list;
        this.zzigo = list2;
    }

    public final /* synthetic */ Object get() {
        int size = this.zzign.size();
        ArrayList arrayList = new ArrayList(this.zzigo.size());
        int size2 = this.zzigo.size();
        int i = size;
        for (int i2 = 0; i2 < size2; i2++) {
            Collection collection = (Collection) this.zzigo.get(i2).get();
            i += collection.size();
            arrayList.add(collection);
        }
        HashSet zzhj = zzeei.zzhj(i);
        int size3 = this.zzign.size();
        for (int i3 = 0; i3 < size3; i3++) {
            zzhj.add(zzeep.checkNotNull(this.zzign.get(i3).get()));
        }
        int size4 = arrayList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            for (Object checkNotNull : (Collection) arrayList.get(i4)) {
                zzhj.add(zzeep.checkNotNull(checkNotNull));
            }
        }
        return Collections.unmodifiableSet(zzhj);
    }
}
