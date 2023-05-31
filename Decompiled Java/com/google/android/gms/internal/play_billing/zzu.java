package com.google.android.gms.internal.play_billing;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
public abstract class zzu extends zzr implements List, RandomAccess {
    private static final zzai zza = new zzs(zzaa.zza, 0);

    zzu() {
    }

    static zzu zzg(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return zzaa.zza;
        }
        return new zzaa(objArr, length);
    }

    public static zzu zzh() {
        return zzaa.zza;
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 != r6) goto L_0x0006
        L_0x0004:
            r1 = 1
            goto L_0x005c
        L_0x0006:
            boolean r2 = r7 instanceof java.util.List
            if (r2 != 0) goto L_0x000b
            goto L_0x005c
        L_0x000b:
            java.util.List r7 = (java.util.List) r7
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0018
            goto L_0x005c
        L_0x0018:
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L_0x0031
            r3 = 0
        L_0x001d:
            if (r3 >= r2) goto L_0x0004
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = com.google.android.gms.internal.play_billing.zzl.zza(r4, r5)
            if (r4 != 0) goto L_0x002e
            goto L_0x005c
        L_0x002e:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x0031:
            java.util.Iterator r2 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x0039:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0055
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L_0x0046
            goto L_0x005c
        L_0x0046:
            java.lang.Object r3 = r2.next()
            java.lang.Object r4 = r7.next()
            boolean r3 = com.google.android.gms.internal.play_billing.zzl.zza(r3, r4)
            if (r3 != 0) goto L_0x0039
            goto L_0x005c
        L_0x0055:
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x005c
            goto L_0x0004
        L_0x005c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzu.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    public final zzah zzd() {
        return listIterator(0);
    }

    /* renamed from: zzf */
    public zzu subList(int i, int i2) {
        zzm.zzc(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzaa.zza;
        }
        return new zzt(this, i, i3);
    }

    /* renamed from: zzi */
    public final zzai listIterator(int i) {
        zzm.zzb(i, size(), FirebaseAnalytics.Param.INDEX);
        if (isEmpty()) {
            return zza;
        }
        return new zzs(this, i);
    }
}
