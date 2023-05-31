package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzecy implements Cloneable {
    private Object value;
    private zzecw<?, ?> zziaa;
    private List<zzedc> zziab = new ArrayList();

    zzecy() {
    }

    /* access modifiers changed from: package-private */
    public final int zzon() {
        if (this.value == null) {
            Iterator<zzedc> it = this.zziab.iterator();
            if (!it.hasNext()) {
                return 0;
            }
            zzedc next = it.next();
            throw new NoSuchMethodError();
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzecr zzecr) throws IOException {
        if (this.value == null) {
            Iterator<zzedc> it = this.zziab.iterator();
            if (it.hasNext()) {
                zzedc next = it.next();
                throw new NoSuchMethodError();
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        List<zzedc> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzecy)) {
            return false;
        }
        zzecy zzecy = (zzecy) obj;
        if (this.value == null || zzecy.value == null) {
            List<zzedc> list2 = this.zziab;
            if (list2 != null && (list = zzecy.zziab) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(toByteArray(), zzecy.toByteArray());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            zzecw<?, ?> zzecw = this.zziaa;
            if (zzecw != zzecy.zziaa) {
                return false;
            }
            if (!zzecw.zzhdy.isArray()) {
                return this.value.equals(zzecy.value);
            }
            Object obj2 = this.value;
            if (obj2 instanceof byte[]) {
                return Arrays.equals((byte[]) obj2, (byte[]) zzecy.value);
            }
            if (obj2 instanceof int[]) {
                return Arrays.equals((int[]) obj2, (int[]) zzecy.value);
            }
            if (obj2 instanceof long[]) {
                return Arrays.equals((long[]) obj2, (long[]) zzecy.value);
            }
            if (obj2 instanceof float[]) {
                return Arrays.equals((float[]) obj2, (float[]) zzecy.value);
            }
            if (obj2 instanceof double[]) {
                return Arrays.equals((double[]) obj2, (double[]) zzecy.value);
            }
            if (obj2 instanceof boolean[]) {
                return Arrays.equals((boolean[]) obj2, (boolean[]) zzecy.value);
            }
            return Arrays.deepEquals((Object[]) obj2, (Object[]) zzecy.value);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(toByteArray()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private final byte[] toByteArray() throws IOException {
        byte[] bArr = new byte[zzon()];
        zza(zzecr.zzz(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzbfr */
    public final zzecy clone() {
        zzecy zzecy = new zzecy();
        try {
            zzecy.zziaa = this.zziaa;
            if (this.zziab == null) {
                zzecy.zziab = null;
            } else {
                zzecy.zziab.addAll(this.zziab);
            }
            if (this.value != null) {
                if (this.value instanceof zzeda) {
                    zzecy.value = (zzeda) ((zzeda) this.value).clone();
                } else if (this.value instanceof byte[]) {
                    zzecy.value = ((byte[]) this.value).clone();
                } else {
                    int i = 0;
                    if (this.value instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.value;
                        byte[][] bArr2 = new byte[bArr.length][];
                        zzecy.value = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.value instanceof boolean[]) {
                        zzecy.value = ((boolean[]) this.value).clone();
                    } else if (this.value instanceof int[]) {
                        zzecy.value = ((int[]) this.value).clone();
                    } else if (this.value instanceof long[]) {
                        zzecy.value = ((long[]) this.value).clone();
                    } else if (this.value instanceof float[]) {
                        zzecy.value = ((float[]) this.value).clone();
                    } else if (this.value instanceof double[]) {
                        zzecy.value = ((double[]) this.value).clone();
                    } else if (this.value instanceof zzeda[]) {
                        zzeda[] zzedaArr = (zzeda[]) this.value;
                        zzeda[] zzedaArr2 = new zzeda[zzedaArr.length];
                        zzecy.value = zzedaArr2;
                        while (i < zzedaArr.length) {
                            zzedaArr2[i] = (zzeda) zzedaArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return zzecy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
