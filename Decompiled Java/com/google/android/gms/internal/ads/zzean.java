package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzean<T> implements zzebd<T> {
    private final zzeah zzhvj;
    private final boolean zzhvk;
    private final zzebv<?, ?> zzhvt;
    private final zzdyo<?> zzhvu;

    private zzean(zzebv<?, ?> zzebv, zzdyo<?> zzdyo, zzeah zzeah) {
        this.zzhvt = zzebv;
        this.zzhvk = zzdyo.zzj(zzeah);
        this.zzhvu = zzdyo;
        this.zzhvj = zzeah;
    }

    static <T> zzean<T> zza(zzebv<?, ?> zzebv, zzdyo<?> zzdyo, zzeah zzeah) {
        return new zzean<>(zzebv, zzdyo, zzeah);
    }

    public final T newInstance() {
        return this.zzhvj.zzbde().zzbcw();
    }

    public final boolean equals(T t, T t2) {
        if (!this.zzhvt.zzbb(t).equals(this.zzhvt.zzbb(t2))) {
            return false;
        }
        if (this.zzhvk) {
            return this.zzhvu.zzal(t).equals(this.zzhvu.zzal(t2));
        }
        return true;
    }

    public final int hashCode(T t) {
        int hashCode = this.zzhvt.zzbb(t).hashCode();
        return this.zzhvk ? (hashCode * 53) + this.zzhvu.zzal(t).hashCode() : hashCode;
    }

    public final void zzf(T t, T t2) {
        zzebf.zza(this.zzhvt, t, t2);
        if (this.zzhvk) {
            zzebf.zza(this.zzhvu, t, t2);
        }
    }

    public final void zza(T t, zzecs zzecs) throws IOException {
        Iterator<Map.Entry<?, Object>> it = this.zzhvu.zzal(t).iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            zzdyr zzdyr = (zzdyr) next.getKey();
            if (zzdyr.zzbco() != zzecp.MESSAGE || zzdyr.zzbcp() || zzdyr.zzbcq()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof zzdzo) {
                zzecs.zzc(zzdyr.zzaf(), ((zzdzo) next).zzbdt().zzbai());
            } else {
                zzecs.zzc(zzdyr.zzaf(), next.getValue());
            }
        }
        zzebv<?, ?> zzebv = this.zzhvt;
        zzebv.zzc(zzebv.zzbb(t), zzecs);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.ads.zzdyz$zzd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.ads.zzdxm r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.ads.zzdyz r0 = (com.google.android.gms.internal.ads.zzdyz) r0
            com.google.android.gms.internal.ads.zzeby r1 = r0.zzhsw
            com.google.android.gms.internal.ads.zzeby r2 = com.google.android.gms.internal.ads.zzeby.zzbff()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.ads.zzeby r1 = com.google.android.gms.internal.ads.zzeby.zzbfg()
            r0.zzhsw = r1
        L_0x0011:
            com.google.android.gms.internal.ads.zzdyz$zzb r10 = (com.google.android.gms.internal.ads.zzdyz.zzb) r10
            r10.zzbdf()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00a4
            int r4 = com.google.android.gms.internal.ads.zzdxj.zza(r11, r12, r14)
            int r2 = r14.zzhoa
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0051
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004c
            com.google.android.gms.internal.ads.zzdyo<?> r12 = r9.zzhvu
            com.google.android.gms.internal.ads.zzdym r0 = r14.zzhod
            com.google.android.gms.internal.ads.zzeah r3 = r9.zzhvj
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.ads.zzdyz$zzd r0 = (com.google.android.gms.internal.ads.zzdyz.zzd) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.ads.zzdxj.zza((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.ads.zzeby) r6, (com.google.android.gms.internal.ads.zzdxm) r7)
            goto L_0x0018
        L_0x0043:
            com.google.android.gms.internal.ads.zzeaw.zzbem()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004c:
            int r12 = com.google.android.gms.internal.ads.zzdxj.zza((int) r2, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.ads.zzdxm) r14)
            goto L_0x0018
        L_0x0051:
            r12 = 0
            r2 = r10
        L_0x0053:
            if (r4 >= r13) goto L_0x0099
            int r4 = com.google.android.gms.internal.ads.zzdxj.zza(r11, r4, r14)
            int r5 = r14.zzhoa
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x007b
            r8 = 3
            if (r6 == r8) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            if (r0 != 0) goto L_0x0072
            if (r7 != r3) goto L_0x0090
            int r4 = com.google.android.gms.internal.ads.zzdxj.zze(r11, r4, r14)
            java.lang.Object r2 = r14.zzhoc
            com.google.android.gms.internal.ads.zzdxn r2 = (com.google.android.gms.internal.ads.zzdxn) r2
            goto L_0x0053
        L_0x0072:
            com.google.android.gms.internal.ads.zzeaw.zzbem()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x007b:
            if (r7 != 0) goto L_0x0090
            int r4 = com.google.android.gms.internal.ads.zzdxj.zza(r11, r4, r14)
            int r12 = r14.zzhoa
            com.google.android.gms.internal.ads.zzdyo<?> r0 = r9.zzhvu
            com.google.android.gms.internal.ads.zzdym r5 = r14.zzhod
            com.google.android.gms.internal.ads.zzeah r6 = r9.zzhvj
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.ads.zzdyz$zzd r0 = (com.google.android.gms.internal.ads.zzdyz.zzd) r0
            goto L_0x0053
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = com.google.android.gms.internal.ads.zzdxj.zza((int) r5, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.ads.zzdxm) r14)
            goto L_0x0053
        L_0x0099:
            if (r2 == 0) goto L_0x00a1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zzd(r12, r2)
        L_0x00a1:
            r12 = r4
            goto L_0x0018
        L_0x00a4:
            if (r12 != r13) goto L_0x00a7
            return
        L_0x00a7:
            com.google.android.gms.internal.ads.zzdzh r10 = com.google.android.gms.internal.ads.zzdzh.zzbdp()
            goto L_0x00ad
        L_0x00ac:
            throw r10
        L_0x00ad:
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzean.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zzdxm):void");
    }

    public final void zza(T t, zzeax zzeax, zzdym zzdym) throws IOException {
        boolean z;
        zzebv<?, ?> zzebv = this.zzhvt;
        zzdyo<?> zzdyo = this.zzhvu;
        Object zzbc = zzebv.zzbc(t);
        zzdyp<?> zzam = zzdyo.zzam(t);
        do {
            try {
                if (zzeax.zzbbz() == Integer.MAX_VALUE) {
                    zzebv.zzi(t, zzbc);
                    return;
                }
                int tag = zzeax.getTag();
                if (tag == 11) {
                    int i = 0;
                    Object obj = null;
                    zzdxn zzdxn = null;
                    while (zzeax.zzbbz() != Integer.MAX_VALUE) {
                        int tag2 = zzeax.getTag();
                        if (tag2 == 16) {
                            i = zzeax.zzbbk();
                            obj = zzdyo.zza(zzdym, this.zzhvj, i);
                        } else if (tag2 == 26) {
                            if (obj != null) {
                                zzdyo.zza(zzeax, obj, zzdym, zzam);
                            } else {
                                zzdxn = zzeax.zzbbj();
                            }
                        } else if (!zzeax.zzbca()) {
                            break;
                        }
                    }
                    if (zzeax.getTag() != 12) {
                        throw zzdzh.zzbdm();
                    } else if (zzdxn != null) {
                        if (obj != null) {
                            zzdyo.zza(zzdxn, obj, zzdym, zzam);
                        } else {
                            zzebv.zza(zzbc, i, zzdxn);
                        }
                    }
                } else if ((tag & 7) == 2) {
                    Object zza = zzdyo.zza(zzdym, this.zzhvj, tag >>> 3);
                    if (zza != null) {
                        zzdyo.zza(zzeax, zza, zzdym, zzam);
                    } else {
                        z = zzebv.zza(zzbc, zzeax);
                        continue;
                    }
                } else {
                    z = zzeax.zzbca();
                    continue;
                }
                z = true;
                continue;
            } finally {
                zzebv.zzi(t, zzbc);
            }
        } while (z);
    }

    public final void zzan(T t) {
        this.zzhvt.zzan(t);
        this.zzhvu.zzan(t);
    }

    public final boolean zzaz(T t) {
        return this.zzhvu.zzal(t).isInitialized();
    }

    public final int zzax(T t) {
        zzebv<?, ?> zzebv = this.zzhvt;
        int zzbd = zzebv.zzbd(zzebv.zzbb(t)) + 0;
        return this.zzhvk ? zzbd + this.zzhvu.zzal(t).zzbcj() : zzbd;
    }
}
