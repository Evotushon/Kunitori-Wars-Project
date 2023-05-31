package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public abstract class zzdly<E> extends zzdlq<E> implements Set<E> {
    @NullableDecl
    private transient zzdlr<E> zzham;

    public static <E> zzdly<E> zzah(E e) {
        return new zzdmj(e);
    }

    /* access modifiers changed from: private */
    public static boolean zzv(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* access modifiers changed from: package-private */
    public boolean zzauh() {
        return false;
    }

    @SafeVarargs
    public static <E> zzdly<E> zza(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        zzdlg.checkArgument(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        Object[] objArr = new Object[(eArr.length + 6)];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return zza(objArr.length, objArr);
    }

    /* access modifiers changed from: private */
    public static <E> zzdly<E> zza(int i, Object... objArr) {
        while (i != 0) {
            if (i == 1) {
                return zzah(objArr[0]);
            }
            int zzdx = zzdx(i);
            Object[] objArr2 = new Object[zzdx];
            int i2 = zzdx - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object zzd = zzdmc.zzd(objArr[i5], i5);
                int hashCode = zzd.hashCode();
                int zzdv = zzdln.zzdv(hashCode);
                while (true) {
                    int i6 = zzdv & i2;
                    Object obj = objArr2[i6];
                    if (obj != null) {
                        if (obj.equals(zzd)) {
                            break;
                        }
                        zzdv++;
                    } else {
                        objArr[i4] = zzd;
                        objArr2[i6] = zzd;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                return new zzdmj(objArr[0], i3);
            }
            if (zzdx(i4) < zzdx / 2) {
                i = i4;
            } else {
                if (zzv(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new zzdmh(objArr, i3, objArr2, i2, i4);
            }
        }
        return zzdmh.zzhax;
    }

    static int zzdx(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (true) {
                double d = (double) highestOneBit;
                Double.isNaN(d);
                if (d * 0.7d >= ((double) max)) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            if (max >= 1073741824) {
                z = false;
            }
            zzdlg.checkArgument(z, "collection too large");
            return 1073741824;
        }
    }

    zzdly() {
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdly) || !zzauh() || !((zzdly) obj).zzauh() || hashCode() == obj.hashCode()) {
            return zzdmk.zza(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return zzdmk.zzg(this);
    }

    public zzdlr<E> zzaua() {
        zzdlr<E> zzdlr = this.zzham;
        if (zzdlr != null) {
            return zzdlr;
        }
        zzdlr<E> zzaui = zzaui();
        this.zzham = zzaui;
        return zzaui;
    }

    /* access modifiers changed from: package-private */
    public zzdlr<E> zzaui() {
        return zzdlr.zzc(toArray());
    }

    public static <E> zzdlx<E> zzdy(int i) {
        zzdll.zze(i, "expectedSize");
        return new zzdlx<>(i);
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
