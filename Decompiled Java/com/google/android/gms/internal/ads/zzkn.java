package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzkn implements zzjg, zzjl {
    private static final zzjh zzanu = new zzkq();
    private static final int zzavv = zzop.zzbo("qt  ");
    private long zzagy;
    private final zzom zzaob = new zzom(zzoh.zzbgi);
    private final zzom zzaoc = new zzom(4);
    private int zzapq;
    private int zzapr;
    private zzji zzapu;
    private final zzom zzavw = new zzom(16);
    private final Stack<zzkb> zzavx = new Stack<>();
    private int zzavy;
    private int zzavz;
    private long zzawa;
    private int zzawb;
    private zzom zzawc;
    private zzkp[] zzawd;
    private boolean zzawe;

    public final void release() {
    }

    public final boolean zzgn() {
        return true;
    }

    public final boolean zza(zzjf zzjf) throws IOException, InterruptedException {
        return zzks.zzd(zzjf);
    }

    public final void zza(zzji zzji) {
        this.zzapu = zzji;
    }

    public final void zzc(long j, long j2) {
        this.zzavx.clear();
        this.zzawb = 0;
        this.zzapr = 0;
        this.zzapq = 0;
        if (j == 0) {
            zzgy();
            return;
        }
        zzkp[] zzkpArr = this.zzawd;
        if (zzkpArr != null) {
            for (zzkp zzkp : zzkpArr) {
                zzkt zzkt = zzkp.zzaxk;
                int zzec = zzkt.zzec(j2);
                if (zzec == -1) {
                    zzec = zzkt.zzed(j2);
                }
                zzkp.zzavq = zzec;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:150:0x019a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02af A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0196  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzjf r25, com.google.android.gms.internal.ads.zzjm r26) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
        L_0x0006:
            int r3 = r0.zzavy
            r4 = -1
            r5 = 8
            r6 = 1
            if (r3 == 0) goto L_0x019c
            r8 = 262144(0x40000, double:1.295163E-318)
            r10 = 2
            if (r3 == r6) goto L_0x0115
            if (r3 != r10) goto L_0x010f
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
            r5 = -1
        L_0x001d:
            com.google.android.gms.internal.ads.zzkp[] r14 = r0.zzawd
            int r15 = r14.length
            if (r3 >= r15) goto L_0x003b
            r14 = r14[r3]
            int r15 = r14.zzavq
            com.google.android.gms.internal.ads.zzkt r11 = r14.zzaxk
            int r11 = r11.zzavm
            if (r15 == r11) goto L_0x0038
            com.google.android.gms.internal.ads.zzkt r11 = r14.zzaxk
            long[] r11 = r11.zzanf
            r14 = r11[r15]
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x0038
            r5 = r3
            r12 = r14
        L_0x0038:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x003b:
            if (r5 != r4) goto L_0x003e
            return r4
        L_0x003e:
            r3 = r14[r5]
            com.google.android.gms.internal.ads.zzjn r4 = r3.zzaxl
            int r5 = r3.zzavq
            com.google.android.gms.internal.ads.zzkt r11 = r3.zzaxk
            long[] r11 = r11.zzanf
            r12 = r11[r5]
            com.google.android.gms.internal.ads.zzkt r11 = r3.zzaxk
            int[] r11 = r11.zzane
            r11 = r11[r5]
            com.google.android.gms.internal.ads.zzkr r14 = r3.zzaxj
            int r14 = r14.zzaxn
            if (r14 != r6) goto L_0x005b
            r14 = 8
            long r12 = r12 + r14
            int r11 = r11 + -8
        L_0x005b:
            long r14 = r25.getPosition()
            long r14 = r12 - r14
            int r10 = r0.zzapr
            long r6 = (long) r10
            long r14 = r14 + r6
            r6 = 0
            int r10 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x010b
            int r6 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0071
            goto L_0x010b
        L_0x0071:
            int r2 = (int) r14
            r1.zzac(r2)
            com.google.android.gms.internal.ads.zzkr r2 = r3.zzaxj
            int r2 = r2.zzara
            if (r2 == 0) goto L_0x00d2
            com.google.android.gms.internal.ads.zzom r2 = r0.zzaoc
            byte[] r2 = r2.data
            r6 = 0
            r2[r6] = r6
            r7 = 1
            r2[r7] = r6
            r7 = 2
            r2[r7] = r6
            com.google.android.gms.internal.ads.zzkr r2 = r3.zzaxj
            int r2 = r2.zzara
            com.google.android.gms.internal.ads.zzkr r6 = r3.zzaxj
            int r6 = r6.zzara
            r7 = 4
            int r6 = 4 - r6
        L_0x0093:
            int r7 = r0.zzapr
            if (r7 >= r11) goto L_0x00e8
            int r7 = r0.zzapq
            if (r7 != 0) goto L_0x00c2
            com.google.android.gms.internal.ads.zzom r7 = r0.zzaoc
            byte[] r7 = r7.data
            r1.readFully(r7, r6, r2)
            com.google.android.gms.internal.ads.zzom r7 = r0.zzaoc
            r8 = 0
            r7.zzbh(r8)
            com.google.android.gms.internal.ads.zzom r7 = r0.zzaoc
            int r7 = r7.zzjc()
            r0.zzapq = r7
            com.google.android.gms.internal.ads.zzom r7 = r0.zzaob
            r7.zzbh(r8)
            com.google.android.gms.internal.ads.zzom r7 = r0.zzaob
            r9 = 4
            r4.zza(r7, r9)
            int r7 = r0.zzapr
            int r7 = r7 + r9
            r0.zzapr = r7
            int r11 = r11 + r6
            goto L_0x0093
        L_0x00c2:
            r8 = 0
            int r7 = r4.zza(r1, r7, r8)
            int r8 = r0.zzapr
            int r8 = r8 + r7
            r0.zzapr = r8
            int r8 = r0.zzapq
            int r8 = r8 - r7
            r0.zzapq = r8
            goto L_0x0093
        L_0x00d2:
            int r2 = r0.zzapr
            if (r2 >= r11) goto L_0x00e8
            int r2 = r11 - r2
            r6 = 0
            int r2 = r4.zza(r1, r2, r6)
            int r6 = r0.zzapr
            int r6 = r6 + r2
            r0.zzapr = r6
            int r6 = r0.zzapq
            int r6 = r6 - r2
            r0.zzapq = r6
            goto L_0x00d2
        L_0x00e8:
            r20 = r11
            com.google.android.gms.internal.ads.zzkt r1 = r3.zzaxk
            long[] r1 = r1.zzaxs
            r17 = r1[r5]
            com.google.android.gms.internal.ads.zzkt r1 = r3.zzaxk
            int[] r1 = r1.zzavu
            r19 = r1[r5]
            r21 = 0
            r22 = 0
            r16 = r4
            r16.zza(r17, r19, r20, r21, r22)
            int r1 = r3.zzavq
            r4 = 1
            int r1 = r1 + r4
            r3.zzavq = r1
            r1 = 0
            r0.zzapr = r1
            r0.zzapq = r1
            return r1
        L_0x010b:
            r4 = 1
            r2.zzana = r12
            return r4
        L_0x010f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0115:
            long r3 = r0.zzawa
            int r6 = r0.zzawb
            long r6 = (long) r6
            long r3 = r3 - r6
            long r6 = r25.getPosition()
            long r6 = r6 + r3
            com.google.android.gms.internal.ads.zzom r10 = r0.zzawc
            if (r10 == 0) goto L_0x0177
            byte[] r8 = r10.data
            int r9 = r0.zzawb
            int r4 = (int) r3
            r1.readFully(r8, r9, r4)
            int r3 = r0.zzavz
            int r4 = com.google.android.gms.internal.ads.zzkc.zzarh
            if (r3 != r4) goto L_0x0158
            com.google.android.gms.internal.ads.zzom r3 = r0.zzawc
            r3.zzbh(r5)
            int r4 = r3.readInt()
            int r5 = zzavv
            if (r4 != r5) goto L_0x0141
        L_0x013f:
            r3 = 1
            goto L_0x0155
        L_0x0141:
            r4 = 4
            r3.zzbi(r4)
        L_0x0145:
            int r4 = r3.zzix()
            if (r4 <= 0) goto L_0x0154
            int r4 = r3.readInt()
            int r5 = zzavv
            if (r4 != r5) goto L_0x0145
            goto L_0x013f
        L_0x0154:
            r3 = 0
        L_0x0155:
            r0.zzawe = r3
            goto L_0x017f
        L_0x0158:
            java.util.Stack<com.google.android.gms.internal.ads.zzkb> r3 = r0.zzavx
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x017f
            java.util.Stack<com.google.android.gms.internal.ads.zzkb> r3 = r0.zzavx
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.zzkb r3 = (com.google.android.gms.internal.ads.zzkb) r3
            com.google.android.gms.internal.ads.zzke r4 = new com.google.android.gms.internal.ads.zzke
            int r5 = r0.zzavz
            com.google.android.gms.internal.ads.zzom r8 = r0.zzawc
            r4.<init>(r5, r8)
            java.util.List<com.google.android.gms.internal.ads.zzke> r3 = r3.zzarf
            r3.add(r4)
            goto L_0x017f
        L_0x0177:
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x0181
            int r4 = (int) r3
            r1.zzac(r4)
        L_0x017f:
            r3 = 0
            goto L_0x0189
        L_0x0181:
            long r8 = r25.getPosition()
            long r8 = r8 + r3
            r2.zzana = r8
            r3 = 1
        L_0x0189:
            r0.zzeb(r6)
            if (r3 == 0) goto L_0x0196
            int r3 = r0.zzavy
            r4 = 2
            if (r3 == r4) goto L_0x0196
            r23 = 1
            goto L_0x0198
        L_0x0196:
            r23 = 0
        L_0x0198:
            if (r23 == 0) goto L_0x0006
            r3 = 1
            return r3
        L_0x019c:
            r3 = 1
            int r6 = r0.zzawb
            if (r6 != 0) goto L_0x01c6
            com.google.android.gms.internal.ads.zzom r6 = r0.zzavw
            byte[] r6 = r6.data
            r7 = 0
            boolean r6 = r1.zza(r6, r7, r5, r3)
            if (r6 != 0) goto L_0x01af
            r3 = 0
            goto L_0x02ad
        L_0x01af:
            r0.zzawb = r5
            com.google.android.gms.internal.ads.zzom r3 = r0.zzavw
            r3.zzbh(r7)
            com.google.android.gms.internal.ads.zzom r3 = r0.zzavw
            long r6 = r3.zziz()
            r0.zzawa = r6
            com.google.android.gms.internal.ads.zzom r3 = r0.zzavw
            int r3 = r3.readInt()
            r0.zzavz = r3
        L_0x01c6:
            long r6 = r0.zzawa
            r8 = 1
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x01e2
            com.google.android.gms.internal.ads.zzom r3 = r0.zzavw
            byte[] r3 = r3.data
            r1.readFully(r3, r5, r5)
            int r3 = r0.zzawb
            int r3 = r3 + r5
            r0.zzawb = r3
            com.google.android.gms.internal.ads.zzom r3 = r0.zzavw
            long r6 = r3.zzjd()
            r0.zzawa = r6
        L_0x01e2:
            int r3 = r0.zzavz
            int r6 = com.google.android.gms.internal.ads.zzkc.zzasi
            if (r3 == r6) goto L_0x01ff
            int r6 = com.google.android.gms.internal.ads.zzkc.zzask
            if (r3 == r6) goto L_0x01ff
            int r6 = com.google.android.gms.internal.ads.zzkc.zzasl
            if (r3 == r6) goto L_0x01ff
            int r6 = com.google.android.gms.internal.ads.zzkc.zzasm
            if (r3 == r6) goto L_0x01ff
            int r6 = com.google.android.gms.internal.ads.zzkc.zzasn
            if (r3 == r6) goto L_0x01ff
            int r6 = com.google.android.gms.internal.ads.zzkc.zzasw
            if (r3 != r6) goto L_0x01fd
            goto L_0x01ff
        L_0x01fd:
            r3 = 0
            goto L_0x0200
        L_0x01ff:
            r3 = 1
        L_0x0200:
            if (r3 == 0) goto L_0x022c
            long r5 = r25.getPosition()
            long r7 = r0.zzawa
            long r5 = r5 + r7
            int r3 = r0.zzawb
            long r7 = (long) r3
            long r5 = r5 - r7
            java.util.Stack<com.google.android.gms.internal.ads.zzkb> r3 = r0.zzavx
            com.google.android.gms.internal.ads.zzkb r7 = new com.google.android.gms.internal.ads.zzkb
            int r8 = r0.zzavz
            r7.<init>(r8, r5)
            r3.add(r7)
            long r7 = r0.zzawa
            int r3 = r0.zzawb
            long r9 = (long) r3
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x0226
            r0.zzeb(r5)
            goto L_0x0229
        L_0x0226:
            r24.zzgy()
        L_0x0229:
            r3 = 1
            goto L_0x02ad
        L_0x022c:
            int r3 = r0.zzavz
            int r6 = com.google.android.gms.internal.ads.zzkc.zzasy
            if (r3 == r6) goto L_0x0271
            int r6 = com.google.android.gms.internal.ads.zzkc.zzasj
            if (r3 == r6) goto L_0x0271
            int r6 = com.google.android.gms.internal.ads.zzkc.zzasz
            if (r3 == r6) goto L_0x0271
            int r6 = com.google.android.gms.internal.ads.zzkc.zzata
            if (r3 == r6) goto L_0x0271
            int r6 = com.google.android.gms.internal.ads.zzkc.zzatt
            if (r3 == r6) goto L_0x0271
            int r6 = com.google.android.gms.internal.ads.zzkc.zzatu
            if (r3 == r6) goto L_0x0271
            int r6 = com.google.android.gms.internal.ads.zzkc.zzatv
            if (r3 == r6) goto L_0x0271
            int r6 = com.google.android.gms.internal.ads.zzkc.zzasx
            if (r3 == r6) goto L_0x0271
            int r6 = com.google.android.gms.internal.ads.zzkc.zzatw
            if (r3 == r6) goto L_0x0271
            int r6 = com.google.android.gms.internal.ads.zzkc.zzatx
            if (r3 == r6) goto L_0x0271
            int r6 = com.google.android.gms.internal.ads.zzkc.zzaty
            if (r3 == r6) goto L_0x0271
            int r6 = com.google.android.gms.internal.ads.zzkc.zzatz
            if (r3 == r6) goto L_0x0271
            int r6 = com.google.android.gms.internal.ads.zzkc.zzaua
            if (r3 == r6) goto L_0x0271
            int r6 = com.google.android.gms.internal.ads.zzkc.zzasv
            if (r3 == r6) goto L_0x0271
            int r6 = com.google.android.gms.internal.ads.zzkc.zzarh
            if (r3 == r6) goto L_0x0271
            int r6 = com.google.android.gms.internal.ads.zzkc.zzauh
            if (r3 != r6) goto L_0x026f
            goto L_0x0271
        L_0x026f:
            r3 = 0
            goto L_0x0272
        L_0x0271:
            r3 = 1
        L_0x0272:
            if (r3 == 0) goto L_0x02a7
            int r3 = r0.zzawb
            if (r3 != r5) goto L_0x027a
            r3 = 1
            goto L_0x027b
        L_0x027a:
            r3 = 0
        L_0x027b:
            com.google.android.gms.internal.ads.zzob.checkState(r3)
            long r6 = r0.zzawa
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x0289
            r3 = 1
            goto L_0x028a
        L_0x0289:
            r3 = 0
        L_0x028a:
            com.google.android.gms.internal.ads.zzob.checkState(r3)
            com.google.android.gms.internal.ads.zzom r3 = new com.google.android.gms.internal.ads.zzom
            long r6 = r0.zzawa
            int r7 = (int) r6
            r3.<init>((int) r7)
            r0.zzawc = r3
            com.google.android.gms.internal.ads.zzom r3 = r0.zzavw
            byte[] r3 = r3.data
            com.google.android.gms.internal.ads.zzom r6 = r0.zzawc
            byte[] r6 = r6.data
            r7 = 0
            java.lang.System.arraycopy(r3, r7, r6, r7, r5)
            r3 = 1
            r0.zzavy = r3
            goto L_0x02ad
        L_0x02a7:
            r3 = 1
            r5 = 0
            r0.zzawc = r5
            r0.zzavy = r3
        L_0x02ad:
            if (r3 != 0) goto L_0x0006
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkn.zza(com.google.android.gms.internal.ads.zzjf, com.google.android.gms.internal.ads.zzjm):int");
    }

    public final long getDurationUs() {
        return this.zzagy;
    }

    public final long zzdz(long j) {
        long j2 = Long.MAX_VALUE;
        for (zzkp zzkp : this.zzawd) {
            zzkt zzkt = zzkp.zzaxk;
            int zzec = zzkt.zzec(j);
            if (zzec == -1) {
                zzec = zzkt.zzed(j);
            }
            long j3 = zzkt.zzanf[zzec];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    private final void zzgy() {
        this.zzavy = 0;
        this.zzawb = 0;
    }

    private final void zzeb(long j) throws zzhc {
        zzlh zzlh;
        zzjk zzjk;
        zzkr zza;
        while (!this.zzavx.isEmpty() && this.zzavx.peek().zzare == j) {
            zzkb pop = this.zzavx.pop();
            if (pop.type == zzkc.zzasi) {
                ArrayList arrayList = new ArrayList();
                zzlh zzlh2 = null;
                zzjk zzjk2 = new zzjk();
                zzke zzal = pop.zzal(zzkc.zzauh);
                if (!(zzal == null || (zzlh2 = zzkd.zza(zzal, this.zzawe)) == null)) {
                    zzjk2.zzb(zzlh2);
                }
                long j2 = Long.MAX_VALUE;
                long j3 = -9223372036854775807L;
                int i = 0;
                while (i < pop.zzarg.size()) {
                    zzkb zzkb = pop.zzarg.get(i);
                    if (zzkb.type == zzkc.zzask && (zza = zzkd.zza(zzkb, pop.zzal(zzkc.zzasj), -9223372036854775807L, (zziu) null, this.zzawe)) != null) {
                        zzkt zza2 = zzkd.zza(zza, zzkb.zzam(zzkc.zzasl).zzam(zzkc.zzasm).zzam(zzkc.zzasn), zzjk2);
                        if (zza2.zzavm != 0) {
                            zzkp zzkp = new zzkp(zza, zza2, this.zzapu.zzc(i, zza.type));
                            zzgz zzp = zza.zzagi.zzp(zza2.zzavs + 30);
                            if (zza.type == 1) {
                                if (zzjk2.zzgq()) {
                                    zzp = zzp.zzb(zzjk2.zzaga, zzjk2.zzagb);
                                }
                                if (zzlh2 != null) {
                                    zzp = zzp.zza(zzlh2);
                                }
                            }
                            zzkp.zzaxl.zze(zzp);
                            zzlh = zzlh2;
                            zzjk = zzjk2;
                            j3 = Math.max(j3, zza.zzagy);
                            arrayList.add(zzkp);
                            long j4 = zza2.zzanf[0];
                            if (j4 < j2) {
                                j2 = j4;
                            }
                            i++;
                            zzjk2 = zzjk;
                            zzlh2 = zzlh;
                        }
                    }
                    zzlh = zzlh2;
                    zzjk = zzjk2;
                    i++;
                    zzjk2 = zzjk;
                    zzlh2 = zzlh;
                }
                this.zzagy = j3;
                this.zzawd = (zzkp[]) arrayList.toArray(new zzkp[arrayList.size()]);
                this.zzapu.zzgp();
                this.zzapu.zza(this);
                this.zzavx.clear();
                this.zzavy = 2;
            } else if (!this.zzavx.isEmpty()) {
                this.zzavx.peek().zzarg.add(pop);
            }
        }
        if (this.zzavy != 2) {
            zzgy();
        }
    }
}
