package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public final class zzdlx<E> extends zzdlp<E> {
    private int zzagg;
    @NullableDecl
    private Object[] zzhal;

    public zzdlx() {
        super(4);
    }

    zzdlx(int i) {
        super(i);
        this.zzhal = new Object[zzdly.zzdx(i)];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.gms.internal.ads.zzdmh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.google.android.gms.internal.ads.zzdly} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: com.google.android.gms.internal.ads.zzdmh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: com.google.android.gms.internal.ads.zzdmh} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzdly<E> zzaug() {
        /*
            r8 = this;
            int r0 = r8.size
            if (r0 == 0) goto L_0x005b
            r1 = 1
            if (r0 == r1) goto L_0x0051
            java.lang.Object[] r0 = r8.zzhal
            if (r0 == 0) goto L_0x003d
            int r0 = r8.size
            int r0 = com.google.android.gms.internal.ads.zzdly.zzdx(r0)
            java.lang.Object[] r2 = r8.zzhal
            int r2 = r2.length
            if (r0 != r2) goto L_0x003d
            int r0 = r8.size
            java.lang.Object[] r2 = r8.zzhab
            int r2 = r2.length
            boolean r0 = com.google.android.gms.internal.ads.zzdly.zzv(r0, r2)
            if (r0 == 0) goto L_0x002a
            java.lang.Object[] r0 = r8.zzhab
            int r2 = r8.size
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            goto L_0x002c
        L_0x002a:
            java.lang.Object[] r0 = r8.zzhab
        L_0x002c:
            r3 = r0
            com.google.android.gms.internal.ads.zzdmh r0 = new com.google.android.gms.internal.ads.zzdmh
            int r4 = r8.zzagg
            java.lang.Object[] r5 = r8.zzhal
            int r2 = r5.length
            int r6 = r2 + -1
            int r7 = r8.size
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x004b
        L_0x003d:
            int r0 = r8.size
            java.lang.Object[] r2 = r8.zzhab
            com.google.android.gms.internal.ads.zzdly r0 = com.google.android.gms.internal.ads.zzdly.zza(r0, r2)
            int r2 = r0.size()
            r8.size = r2
        L_0x004b:
            r8.zzhac = r1
            r1 = 0
            r8.zzhal = r1
            return r0
        L_0x0051:
            java.lang.Object[] r0 = r8.zzhab
            r1 = 0
            r0 = r0[r1]
            com.google.android.gms.internal.ads.zzdly r0 = com.google.android.gms.internal.ads.zzdly.zzah(r0)
            return r0
        L_0x005b:
            com.google.android.gms.internal.ads.zzdmh<java.lang.Object> r0 = com.google.android.gms.internal.ads.zzdmh.zzhax
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdlx.zzaug():com.google.android.gms.internal.ads.zzdly");
    }

    public final /* synthetic */ zzdls zze(Iterable iterable) {
        zzdlg.checkNotNull(iterable);
        if (this.zzhal != null) {
            for (Object zzaf : iterable) {
                zzaf(zzaf);
            }
        } else {
            super.zze(iterable);
        }
        return this;
    }

    public final /* synthetic */ zzdlp zzae(Object obj) {
        return (zzdlx) zzaf(obj);
    }

    public final /* synthetic */ zzdls zza(Iterator it) {
        zzdlg.checkNotNull(it);
        while (it.hasNext()) {
            zzaf(it.next());
        }
        return this;
    }

    public final /* synthetic */ zzdls zzaf(Object obj) {
        zzdlg.checkNotNull(obj);
        if (this.zzhal != null) {
            int zzdx = zzdly.zzdx(this.size);
            Object[] objArr = this.zzhal;
            if (zzdx <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int zzdv = zzdln.zzdv(hashCode);
                while (true) {
                    int i = zzdv & length;
                    Object[] objArr2 = this.zzhal;
                    Object obj2 = objArr2[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        zzdv = i + 1;
                    } else {
                        objArr2[i] = obj;
                        this.zzagg += hashCode;
                        super.zzaf(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzhal = null;
        super.zzaf(obj);
        return this;
    }
}
