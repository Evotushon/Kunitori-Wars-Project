package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdyp<T extends zzdyr<T>> {
    private static final zzdyp zzhpx = new zzdyp(true);
    final zzebi<T, Object> zzhpu;
    private boolean zzhpv;
    private boolean zzhpw;

    private zzdyp() {
        this.zzhpu = zzebi.zzgw(16);
    }

    private zzdyp(boolean z) {
        this(zzebi.zzgw(0));
        zzban();
    }

    private zzdyp(zzebi<T, Object> zzebi) {
        this.zzhpu = zzebi;
        zzban();
    }

    public static <T extends zzdyr<T>> zzdyp<T> zzbci() {
        return zzhpx;
    }

    public final void zzban() {
        if (!this.zzhpv) {
            this.zzhpu.zzban();
            this.zzhpv = true;
        }
    }

    public final boolean isImmutable() {
        return this.zzhpv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdyp)) {
            return false;
        }
        return this.zzhpu.equals(((zzdyp) obj).zzhpu);
    }

    public final int hashCode() {
        return this.zzhpu.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> iterator() {
        if (this.zzhpw) {
            return new zzdzn(this.zzhpu.entrySet().iterator());
        }
        return this.zzhpu.entrySet().iterator();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> descendingIterator() {
        if (this.zzhpw) {
            return new zzdzn(this.zzhpu.zzbey().iterator());
        }
        return this.zzhpu.zzbey().iterator();
    }

    private final Object zza(T t) {
        Object obj = this.zzhpu.get(t);
        if (!(obj instanceof zzdzm)) {
            return obj;
        }
        zzdzm zzdzm = (zzdzm) obj;
        return zzdzm.zzbds();
    }

    private final void zza(T t, Object obj) {
        if (!t.zzbcp()) {
            zza(t.zzbcn(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(t.zzbcn(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzdzm) {
            this.zzhpw = true;
        }
        this.zzhpu.put(t, obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.zzdzb) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.zzdzm) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zza(com.google.android.gms.internal.ads.zzecm r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.zzdzc.checkNotNull(r3)
            int[] r0 = com.google.android.gms.internal.ads.zzdys.zzhqa
            com.google.android.gms.internal.ads.zzecp r2 = r2.zzbfo()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001f;
                case 9: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r0 = 0
            goto L_0x0042
        L_0x0016:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzeah
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzdzm
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x001f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzdzb
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzdxn
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L_0x004e
        L_0x004d:
            throw r2
        L_0x004e:
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdyp.zza(com.google.android.gms.internal.ads.zzecm, java.lang.Object):void");
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzhpu.zzbew(); i++) {
            if (!zzb(this.zzhpu.zzgx(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> zzb : this.zzhpu.zzbex()) {
            if (!zzb(zzb)) {
                return false;
            }
        }
        return true;
    }

    private static <T extends zzdyr<T>> boolean zzb(Map.Entry<T, Object> entry) {
        zzdyr zzdyr = (zzdyr) entry.getKey();
        if (zzdyr.zzbco() == zzecp.MESSAGE) {
            if (zzdyr.zzbcp()) {
                for (zzeah isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzeah) {
                    if (!((zzeah) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof zzdzm) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(zzdyp<T> zzdyp) {
        for (int i = 0; i < zzdyp.zzhpu.zzbew(); i++) {
            zzc(zzdyp.zzhpu.zzgx(i));
        }
        for (Map.Entry<T, Object> zzc : zzdyp.zzhpu.zzbex()) {
            zzc(zzc);
        }
    }

    private static Object zzao(Object obj) {
        if (obj instanceof zzeaq) {
            return ((zzeaq) obj).zzbak();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final void zzc(Map.Entry<T, Object> entry) {
        Object obj;
        zzdyr zzdyr = (zzdyr) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzdzm) {
            zzdzm zzdzm = (zzdzm) value;
            value = zzdzm.zzbds();
        }
        if (zzdyr.zzbcp()) {
            Object zza = zza(zzdyr);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object zzao : (List) value) {
                ((List) zza).add(zzao(zzao));
            }
            this.zzhpu.put(zzdyr, zza);
        } else if (zzdyr.zzbco() == zzecp.MESSAGE) {
            Object zza2 = zza(zzdyr);
            if (zza2 == null) {
                this.zzhpu.put(zzdyr, zzao(value));
                return;
            }
            if (zza2 instanceof zzeaq) {
                obj = zzdyr.zza((zzeaq) zza2, (zzeaq) value);
            } else {
                obj = zzdyr.zza(((zzeah) zza2).zzbdd(), (zzeah) value).zzbcx();
            }
            this.zzhpu.put(zzdyr, obj);
        } else {
            this.zzhpu.put(zzdyr, zzao(value));
        }
    }

    static void zza(zzdyi zzdyi, zzecm zzecm, int i, Object obj) throws IOException {
        if (zzecm == zzecm.GROUP) {
            zzeah zzeah = (zzeah) obj;
            zzdzc.zzk(zzeah);
            zzdyi.zzab(i, 3);
            zzeah.zzb(zzdyi);
            zzdyi.zzab(i, 4);
            return;
        }
        zzdyi.zzab(i, zzecm.zzbfp());
        switch (zzdys.zzhoz[zzecm.ordinal()]) {
            case 1:
                zzdyi.zzb(((Double) obj).doubleValue());
                return;
            case 2:
                zzdyi.zzf(((Float) obj).floatValue());
                return;
            case 3:
                zzdyi.zzfh(((Long) obj).longValue());
                return;
            case 4:
                zzdyi.zzfh(((Long) obj).longValue());
                return;
            case 5:
                zzdyi.zzfv(((Integer) obj).intValue());
                return;
            case 6:
                zzdyi.zzfj(((Long) obj).longValue());
                return;
            case 7:
                zzdyi.zzfy(((Integer) obj).intValue());
                return;
            case 8:
                zzdyi.zzbp(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzeah) obj).zzb(zzdyi);
                return;
            case 10:
                zzdyi.zzg((zzeah) obj);
                return;
            case 11:
                if (obj instanceof zzdxn) {
                    zzdyi.zzah((zzdxn) obj);
                    return;
                } else {
                    zzdyi.zzhj((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzdxn) {
                    zzdyi.zzah((zzdxn) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzdyi.zzk(bArr, 0, bArr.length);
                return;
            case 13:
                zzdyi.zzfw(((Integer) obj).intValue());
                return;
            case 14:
                zzdyi.zzfy(((Integer) obj).intValue());
                return;
            case 15:
                zzdyi.zzfj(((Long) obj).longValue());
                return;
            case 16:
                zzdyi.zzfx(((Integer) obj).intValue());
                return;
            case 17:
                zzdyi.zzfi(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzdzb) {
                    zzdyi.zzfv(((zzdzb) obj).zzaf());
                    return;
                } else {
                    zzdyi.zzfv(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final int zzbcj() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzhpu.zzbew(); i2++) {
            i += zzd(this.zzhpu.zzgx(i2));
        }
        for (Map.Entry<T, Object> zzd : this.zzhpu.zzbex()) {
            i += zzd(zzd);
        }
        return i;
    }

    private static int zzd(Map.Entry<T, Object> entry) {
        zzdyr zzdyr = (zzdyr) entry.getKey();
        Object value = entry.getValue();
        if (zzdyr.zzbco() != zzecp.MESSAGE || zzdyr.zzbcp() || zzdyr.zzbcq()) {
            return zzb((zzdyr<?>) zzdyr, value);
        }
        if (value instanceof zzdzm) {
            return zzdyi.zzb(((zzdyr) entry.getKey()).zzaf(), (zzdzq) (zzdzm) value);
        }
        return zzdyi.zzd(((zzdyr) entry.getKey()).zzaf(), (zzeah) value);
    }

    static int zza(zzecm zzecm, int i, Object obj) {
        int zzfz = zzdyi.zzfz(i);
        if (zzecm == zzecm.GROUP) {
            zzdzc.zzk((zzeah) obj);
            zzfz <<= 1;
        }
        return zzfz + zzb(zzecm, obj);
    }

    private static int zzb(zzecm zzecm, Object obj) {
        switch (zzdys.zzhoz[zzecm.ordinal()]) {
            case 1:
                return zzdyi.zzc(((Double) obj).doubleValue());
            case 2:
                return zzdyi.zzg(((Float) obj).floatValue());
            case 3:
                return zzdyi.zzfk(((Long) obj).longValue());
            case 4:
                return zzdyi.zzfl(((Long) obj).longValue());
            case 5:
                return zzdyi.zzga(((Integer) obj).intValue());
            case 6:
                return zzdyi.zzfn(((Long) obj).longValue());
            case 7:
                return zzdyi.zzgd(((Integer) obj).intValue());
            case 8:
                return zzdyi.zzbq(((Boolean) obj).booleanValue());
            case 9:
                return zzdyi.zzi((zzeah) obj);
            case 10:
                if (obj instanceof zzdzm) {
                    return zzdyi.zza((zzdzm) obj);
                }
                return zzdyi.zzh((zzeah) obj);
            case 11:
                if (obj instanceof zzdxn) {
                    return zzdyi.zzai((zzdxn) obj);
                }
                return zzdyi.zzhk((String) obj);
            case 12:
                if (obj instanceof zzdxn) {
                    return zzdyi.zzai((zzdxn) obj);
                }
                return zzdyi.zzw((byte[]) obj);
            case 13:
                return zzdyi.zzgb(((Integer) obj).intValue());
            case 14:
                return zzdyi.zzge(((Integer) obj).intValue());
            case 15:
                return zzdyi.zzfo(((Long) obj).longValue());
            case 16:
                return zzdyi.zzgc(((Integer) obj).intValue());
            case 17:
                return zzdyi.zzfm(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzdzb) {
                    return zzdyi.zzgf(((zzdzb) obj).zzaf());
                }
                return zzdyi.zzgf(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zzb(zzdyr<?> zzdyr, Object obj) {
        zzecm zzbcn = zzdyr.zzbcn();
        int zzaf = zzdyr.zzaf();
        if (!zzdyr.zzbcp()) {
            return zza(zzbcn, zzaf, obj);
        }
        int i = 0;
        if (zzdyr.zzbcq()) {
            for (Object zzb : (List) obj) {
                i += zzb(zzbcn, zzb);
            }
            return zzdyi.zzfz(zzaf) + i + zzdyi.zzgh(i);
        }
        for (Object zza : (List) obj) {
            i += zza(zzbcn, zzaf, zza);
        }
        return i;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzdyp zzdyp = new zzdyp();
        for (int i = 0; i < this.zzhpu.zzbew(); i++) {
            Map.Entry<T, Object> zzgx = this.zzhpu.zzgx(i);
            zzdyp.zza((zzdyr) zzgx.getKey(), zzgx.getValue());
        }
        for (Map.Entry next : this.zzhpu.zzbex()) {
            zzdyp.zza((zzdyr) next.getKey(), next.getValue());
        }
        zzdyp.zzhpw = this.zzhpw;
        return zzdyp;
    }
}
