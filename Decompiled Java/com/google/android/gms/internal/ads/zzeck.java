package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzeck extends zzecf {
    zzeck() {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (com.google.android.gms.internal.ads.zzecb.zza(r1, r8) > -65) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        if (com.google.android.gms.internal.ads.zzecb.zza(r1, r8) > -65) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0103, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x012a, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(int r24, byte[] r25, int r26, int r27) {
        /*
            r23 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r2 | r3
            int r5 = r1.length
            int r5 = r5 - r3
            r4 = r4 | r5
            r7 = 0
            if (r4 < 0) goto L_0x015e
            long r8 = (long) r2
            long r2 = (long) r3
            r4 = -19
            r10 = -62
            r11 = -16
            r12 = 16
            r13 = -96
            r14 = -32
            r15 = -1
            r6 = -65
            r16 = 1
            if (r0 == 0) goto L_0x00ad
            int r18 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r18 < 0) goto L_0x002a
            return r0
        L_0x002a:
            byte r5 = (byte) r0
            if (r5 >= r14) goto L_0x0038
            if (r5 < r10) goto L_0x0037
            long r19 = r8 + r16
            byte r0 = com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r8)
            if (r0 <= r6) goto L_0x00af
        L_0x0037:
            return r15
        L_0x0038:
            if (r5 >= r11) goto L_0x0064
            int r0 = r0 >> 8
            r0 = r0 ^ r15
            byte r0 = (byte) r0
            if (r0 != 0) goto L_0x0051
            long r19 = r8 + r16
            byte r0 = com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r8)
            int r8 = (r19 > r2 ? 1 : (r19 == r2 ? 0 : -1))
            if (r8 < 0) goto L_0x004f
            int r0 = com.google.android.gms.internal.ads.zzece.zzaq(r5, r0)
            return r0
        L_0x004f:
            r8 = r19
        L_0x0051:
            if (r0 > r6) goto L_0x0063
            if (r5 != r14) goto L_0x0057
            if (r0 < r13) goto L_0x0063
        L_0x0057:
            if (r5 != r4) goto L_0x005b
            if (r0 >= r13) goto L_0x0063
        L_0x005b:
            long r19 = r8 + r16
            byte r0 = com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r8)
            if (r0 <= r6) goto L_0x00af
        L_0x0063:
            return r15
        L_0x0064:
            int r19 = r0 >> 8
            r4 = r19 ^ -1
            byte r4 = (byte) r4
            if (r4 != 0) goto L_0x007e
            long r19 = r8 + r16
            byte r4 = com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r8)
            int r0 = (r19 > r2 ? 1 : (r19 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x007a
            int r0 = com.google.android.gms.internal.ads.zzece.zzaq(r5, r4)
            return r0
        L_0x007a:
            r8 = r19
            r0 = 0
            goto L_0x0080
        L_0x007e:
            int r0 = r0 >> r12
            byte r0 = (byte) r0
        L_0x0080:
            if (r0 != 0) goto L_0x0093
            long r19 = r8 + r16
            byte r0 = com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r8)
            int r8 = (r19 > r2 ? 1 : (r19 == r2 ? 0 : -1))
            if (r8 < 0) goto L_0x0091
            int r0 = com.google.android.gms.internal.ads.zzece.zzj(r5, r4, r0)
            return r0
        L_0x0091:
            r8 = r19
        L_0x0093:
            if (r4 > r6) goto L_0x00ac
            int r5 = r5 << 28
            int r4 = r4 + 112
            int r5 = r5 + r4
            int r4 = r5 >> 30
            if (r4 != 0) goto L_0x00ac
            if (r0 > r6) goto L_0x00ac
            long r4 = r8 + r16
            byte r0 = com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r8)
            if (r0 <= r6) goto L_0x00a9
            goto L_0x00ac
        L_0x00a9:
            r19 = r4
            goto L_0x00af
        L_0x00ac:
            return r15
        L_0x00ad:
            r19 = r8
        L_0x00af:
            long r2 = r2 - r19
            int r0 = (int) r2
            if (r0 >= r12) goto L_0x00b6
            r2 = 0
            goto L_0x00c9
        L_0x00b6:
            r3 = r19
            r2 = 0
        L_0x00b9:
            if (r2 >= r0) goto L_0x00c8
            long r8 = r3 + r16
            byte r3 = com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r3)
            if (r3 >= 0) goto L_0x00c4
            goto L_0x00c9
        L_0x00c4:
            int r2 = r2 + 1
            r3 = r8
            goto L_0x00b9
        L_0x00c8:
            r2 = r0
        L_0x00c9:
            int r0 = r0 - r2
            long r2 = (long) r2
            long r19 = r19 + r2
        L_0x00cd:
            r2 = r19
            r4 = 0
        L_0x00d0:
            if (r0 <= 0) goto L_0x00e2
            long r4 = r2 + r16
            byte r2 = com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r2)
            if (r2 < 0) goto L_0x00e7
            int r0 = r0 + -1
            r21 = r4
            r4 = r2
            r2 = r21
            goto L_0x00d0
        L_0x00e2:
            r21 = r2
            r2 = r4
            r4 = r21
        L_0x00e7:
            if (r0 != 0) goto L_0x00ea
            return r7
        L_0x00ea:
            int r0 = r0 + -1
            if (r2 >= r14) goto L_0x0104
            if (r0 != 0) goto L_0x00f1
            return r2
        L_0x00f1:
            int r0 = r0 + -1
            if (r2 < r10) goto L_0x0103
            long r2 = r4 + r16
            byte r4 = com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r4)
            if (r4 <= r6) goto L_0x00fe
            goto L_0x0103
        L_0x00fe:
            r19 = r2
            r12 = -19
            goto L_0x00cd
        L_0x0103:
            return r15
        L_0x0104:
            if (r2 >= r11) goto L_0x012b
            r3 = 2
            if (r0 >= r3) goto L_0x010e
            int r0 = zza(r1, r2, r4, r0)
            return r0
        L_0x010e:
            int r0 = r0 + -2
            long r8 = r4 + r16
            byte r3 = com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r4)
            if (r3 > r6) goto L_0x012a
            if (r2 != r14) goto L_0x011c
            if (r3 < r13) goto L_0x012a
        L_0x011c:
            r12 = -19
            if (r2 != r12) goto L_0x0122
            if (r3 >= r13) goto L_0x012a
        L_0x0122:
            long r19 = r8 + r16
            byte r2 = com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r8)
            if (r2 <= r6) goto L_0x00cd
        L_0x012a:
            return r15
        L_0x012b:
            r3 = 3
            r12 = -19
            if (r0 >= r3) goto L_0x0135
            int r0 = zza(r1, r2, r4, r0)
            return r0
        L_0x0135:
            int r0 = r0 + -3
            long r8 = r4 + r16
            byte r3 = com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r4)
            if (r3 > r6) goto L_0x015d
            int r2 = r2 << 28
            int r3 = r3 + 112
            int r2 = r2 + r3
            int r2 = r2 >> 30
            if (r2 != 0) goto L_0x015d
            long r2 = r8 + r16
            byte r4 = com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r8)
            if (r4 > r6) goto L_0x015d
            long r4 = r2 + r16
            byte r2 = com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r2)
            if (r2 <= r6) goto L_0x0159
            goto L_0x015d
        L_0x0159:
            r19 = r4
            goto L_0x00cd
        L_0x015d:
            return r15
        L_0x015e:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r1 = r1.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r7] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            r2 = 1
            r4[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
            r2 = 2
            r4[r2] = r1
            java.lang.String r1 = "Array length=%d, index=%d, limit=%d"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            r0.<init>(r1)
            goto L_0x0183
        L_0x0182:
            throw r0
        L_0x0183:
            goto L_0x0182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeck.zzb(int, byte[], int, int):int");
    }

    /* access modifiers changed from: package-private */
    public final String zzo(byte[] bArr, int i, int i2) throws zzdzh {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (r13 < i3) {
                byte zza = zzecb.zza(bArr, (long) r13);
                if (!zzecg.zze(zza)) {
                    break;
                }
                i = r13 + 1;
                zzecg.zza(zza, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (r13 < i3) {
                int i6 = r13 + 1;
                byte zza2 = zzecb.zza(bArr, (long) r13);
                if (zzecg.zze(zza2)) {
                    int i7 = i5 + 1;
                    zzecg.zza(zza2, cArr, i5);
                    while (i6 < i3) {
                        byte zza3 = zzecb.zza(bArr, (long) i6);
                        if (!zzecg.zze(zza3)) {
                            break;
                        }
                        i6++;
                        zzecg.zza(zza3, cArr, i7);
                        i7++;
                    }
                    r13 = i6;
                    i5 = i7;
                } else if (zzecg.zzf(zza2)) {
                    if (i6 < i3) {
                        int i8 = i6 + 1;
                        zzecg.zza(zza2, zzecb.zza(bArr, (long) i6), cArr, i5);
                        r13 = i8;
                        i5++;
                    } else {
                        throw zzdzh.zzbdq();
                    }
                } else if (zzecg.zzg(zza2)) {
                    if (i6 < i3 - 1) {
                        int i9 = i6 + 1;
                        int i10 = i9 + 1;
                        zzecg.zza(zza2, zzecb.zza(bArr, (long) i6), zzecb.zza(bArr, (long) i9), cArr, i5);
                        r13 = i10;
                        i5++;
                    } else {
                        throw zzdzh.zzbdq();
                    }
                } else if (i6 < i3 - 2) {
                    int i11 = i6 + 1;
                    byte zza4 = zzecb.zza(bArr, (long) i6);
                    int i12 = i11 + 1;
                    zzecg.zza(zza2, zza4, zzecb.zza(bArr, (long) i11), zzecb.zza(bArr, (long) i12), cArr, i5);
                    r13 = i12 + 1;
                    i5 = i5 + 1 + 1;
                } else {
                    throw zzdzh.zzbdq();
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:38:0x00fb, LOOP_START, PHI: r2 r3 r4 r11 
      PHI: (r2v4 int) = (r2v3 int), (r2v6 int) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v3 char) = (r3v2 char), (r3v4 char) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(java.lang.CharSequence r23, byte[] r24, int r25, int r26) {
        /*
            r22 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            long r4 = (long) r2
            long r6 = (long) r3
            long r6 = r6 + r4
            int r8 = r23.length()
            java.lang.String r9 = " at index "
            java.lang.String r10 = "Failed writing "
            if (r8 > r3) goto L_0x0146
            int r11 = r1.length
            int r11 = r11 - r3
            if (r11 < r2) goto L_0x0146
            r2 = 0
        L_0x001a:
            r3 = 128(0x80, float:1.794E-43)
            r11 = 1
            if (r2 >= r8) goto L_0x002f
            char r13 = r0.charAt(r2)
            if (r13 >= r3) goto L_0x002f
            long r11 = r11 + r4
            byte r3 = (byte) r13
            com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r4, (byte) r3)
            int r2 = r2 + 1
            r4 = r11
            goto L_0x001a
        L_0x002f:
            if (r2 != r8) goto L_0x0033
            int r0 = (int) r4
            return r0
        L_0x0033:
            if (r2 >= r8) goto L_0x0144
            char r13 = r0.charAt(r2)
            if (r13 >= r3) goto L_0x004b
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 >= 0) goto L_0x004b
            long r14 = r4 + r11
            byte r13 = (byte) r13
            com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r4, (byte) r13)
            r4 = r11
            r12 = r14
        L_0x0047:
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x00fb
        L_0x004b:
            r14 = 2048(0x800, float:2.87E-42)
            if (r13 >= r14) goto L_0x0075
            r14 = 2
            long r14 = r6 - r14
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r16 > 0) goto L_0x0075
            long r14 = r4 + r11
            int r3 = r13 >>> 6
            r3 = r3 | 960(0x3c0, float:1.345E-42)
            byte r3 = (byte) r3
            com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r4, (byte) r3)
            long r3 = r14 + r11
            r5 = r13 & 63
            r13 = 128(0x80, float:1.794E-43)
            r5 = r5 | r13
            byte r5 = (byte) r5
            com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r14, (byte) r5)
            r20 = r11
            r11 = 128(0x80, float:1.794E-43)
            r12 = r3
            r4 = r20
            goto L_0x00fb
        L_0x0075:
            r3 = 57343(0xdfff, float:8.0355E-41)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r14) goto L_0x007f
            if (r3 >= r13) goto L_0x00ae
        L_0x007f:
            r15 = 3
            long r15 = r6 - r15
            int r17 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r17 > 0) goto L_0x00ae
            long r14 = r4 + r11
            int r3 = r13 >>> 12
            r3 = r3 | 480(0x1e0, float:6.73E-43)
            byte r3 = (byte) r3
            com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r4, (byte) r3)
            long r3 = r14 + r11
            int r5 = r13 >>> 6
            r5 = r5 & 63
            r11 = 128(0x80, float:1.794E-43)
            r5 = r5 | r11
            byte r5 = (byte) r5
            com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r14, (byte) r5)
            r14 = 1
            long r18 = r3 + r14
            r5 = r13 & 63
            r5 = r5 | r11
            byte r5 = (byte) r5
            com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r3, (byte) r5)
            r12 = r18
            r4 = 1
            goto L_0x0047
        L_0x00ae:
            r11 = 4
            long r11 = r6 - r11
            int r15 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r15 > 0) goto L_0x010f
            int r3 = r2 + 1
            if (r3 == r8) goto L_0x0107
            char r2 = r0.charAt(r3)
            boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
            if (r11 == 0) goto L_0x0106
            int r2 = java.lang.Character.toCodePoint(r13, r2)
            r11 = 1
            long r13 = r4 + r11
            int r15 = r2 >>> 18
            r15 = r15 | 240(0xf0, float:3.36E-43)
            byte r15 = (byte) r15
            com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r4, (byte) r15)
            long r4 = r13 + r11
            int r15 = r2 >>> 12
            r15 = r15 & 63
            r11 = 128(0x80, float:1.794E-43)
            r12 = r15 | 128(0x80, float:1.794E-43)
            byte r12 = (byte) r12
            com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r13, (byte) r12)
            r12 = 1
            long r14 = r4 + r12
            int r16 = r2 >>> 6
            r12 = r16 & 63
            r12 = r12 | r11
            byte r12 = (byte) r12
            com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r4, (byte) r12)
            r4 = 1
            long r12 = r14 + r4
            r2 = r2 & 63
            r2 = r2 | r11
            byte r2 = (byte) r2
            com.google.android.gms.internal.ads.zzecb.zza((byte[]) r1, (long) r14, (byte) r2)
            r2 = r3
        L_0x00fb:
            int r2 = r2 + 1
            r3 = 128(0x80, float:1.794E-43)
            r20 = r4
            r4 = r12
            r11 = r20
            goto L_0x0033
        L_0x0106:
            r2 = r3
        L_0x0107:
            com.google.android.gms.internal.ads.zzech r0 = new com.google.android.gms.internal.ads.zzech
            int r2 = r2 + -1
            r0.<init>(r2, r8)
            throw r0
        L_0x010f:
            if (r14 > r13) goto L_0x0127
            if (r13 > r3) goto L_0x0127
            int r1 = r2 + 1
            if (r1 == r8) goto L_0x0121
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
            if (r0 != 0) goto L_0x0127
        L_0x0121:
            com.google.android.gms.internal.ads.zzech r0 = new com.google.android.gms.internal.ads.zzech
            r0.<init>(r2, r8)
            throw r0
        L_0x0127:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r1 = 46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r10)
            r2.append(r13)
            r2.append(r9)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0144:
            int r0 = (int) r4
            return r0
        L_0x0146:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            int r8 = r8 + -1
            char r0 = r0.charAt(r8)
            int r2 = r2 + r3
            r3 = 37
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r10)
            r4.append(r0)
            r4.append(r9)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            goto L_0x016b
        L_0x016a:
            throw r1
        L_0x016b:
            goto L_0x016a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeck.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041 A[LOOP:1: B:11:0x0041->B:36:0x0100, LOOP_START, PHI: r2 r4 r9 r10 
      PHI: (r2v2 long) = (r2v0 long), (r2v3 long) binds: [B:8:0x0039, B:36:0x0100] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v5 long) = (r4v4 long), (r4v7 long) binds: [B:8:0x0039, B:36:0x0100] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v3 int) = (r9v2 int), (r9v5 int) binds: [B:8:0x0039, B:36:0x0100] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r10v1 char) = (r10v0 char), (r10v2 char) binds: [B:8:0x0039, B:36:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(java.lang.CharSequence r22, java.nio.ByteBuffer r23) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            long r2 = com.google.android.gms.internal.ads.zzecb.zzn(r23)
            int r4 = r23.position()
            long r4 = (long) r4
            long r4 = r4 + r2
            int r6 = r23.limit()
            long r6 = (long) r6
            long r6 = r6 + r2
            int r8 = r22.length()
            long r9 = (long) r8
            long r11 = r6 - r4
            java.lang.String r13 = " at index "
            java.lang.String r14 = "Failed writing "
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 > 0) goto L_0x0153
            r9 = 0
        L_0x0024:
            r10 = 128(0x80, float:1.794E-43)
            r11 = 1
            if (r9 >= r8) goto L_0x0039
            char r15 = r0.charAt(r9)
            if (r15 >= r10) goto L_0x0039
            long r11 = r11 + r4
            byte r10 = (byte) r15
            com.google.android.gms.internal.ads.zzecb.zza((long) r4, (byte) r10)
            int r9 = r9 + 1
            r4 = r11
            goto L_0x0024
        L_0x0039:
            if (r9 != r8) goto L_0x0041
            long r4 = r4 - r2
            int r0 = (int) r4
            r1.position(r0)
            return
        L_0x0041:
            if (r9 >= r8) goto L_0x0148
            char r15 = r0.charAt(r9)
            if (r15 >= r10) goto L_0x005b
            int r16 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r16 >= 0) goto L_0x005b
            long r16 = r4 + r11
            byte r15 = (byte) r15
            com.google.android.gms.internal.ads.zzecb.zza((long) r4, (byte) r15)
            r4 = r16
            r15 = 128(0x80, float:1.794E-43)
            r17 = r2
            goto L_0x0100
        L_0x005b:
            r10 = 2048(0x800, float:2.87E-42)
            if (r15 >= r10) goto L_0x0083
            r17 = 2
            long r17 = r6 - r17
            int r10 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r10 > 0) goto L_0x0083
            r17 = r2
            long r1 = r4 + r11
            int r3 = r15 >>> 6
            r3 = r3 | 960(0x3c0, float:1.345E-42)
            byte r3 = (byte) r3
            com.google.android.gms.internal.ads.zzecb.zza((long) r4, (byte) r3)
            long r3 = r1 + r11
            r5 = r15 & 63
            r10 = 128(0x80, float:1.794E-43)
            r5 = r5 | r10
            byte r5 = (byte) r5
            com.google.android.gms.internal.ads.zzecb.zza((long) r1, (byte) r5)
            r4 = r3
        L_0x007f:
            r15 = 128(0x80, float:1.794E-43)
            goto L_0x0100
        L_0x0083:
            r17 = r2
            r1 = 57343(0xdfff, float:8.0355E-41)
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r2) goto L_0x008f
            if (r1 >= r15) goto L_0x00b9
        L_0x008f:
            r19 = 3
            long r19 = r6 - r19
            int r3 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r3 > 0) goto L_0x00b9
            long r1 = r4 + r11
            int r3 = r15 >>> 12
            r3 = r3 | 480(0x1e0, float:6.73E-43)
            byte r3 = (byte) r3
            com.google.android.gms.internal.ads.zzecb.zza((long) r4, (byte) r3)
            long r3 = r1 + r11
            int r5 = r15 >>> 6
            r5 = r5 & 63
            r10 = 128(0x80, float:1.794E-43)
            r5 = r5 | r10
            byte r5 = (byte) r5
            com.google.android.gms.internal.ads.zzecb.zza((long) r1, (byte) r5)
            long r1 = r3 + r11
            r5 = r15 & 63
            r5 = r5 | r10
            byte r5 = (byte) r5
            com.google.android.gms.internal.ads.zzecb.zza((long) r3, (byte) r5)
            r4 = r1
            goto L_0x007f
        L_0x00b9:
            r19 = 4
            long r19 = r6 - r19
            int r3 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r3 > 0) goto L_0x0113
            int r1 = r9 + 1
            if (r1 == r8) goto L_0x010a
            char r2 = r0.charAt(r1)
            boolean r3 = java.lang.Character.isSurrogatePair(r15, r2)
            if (r3 == 0) goto L_0x010b
            int r2 = java.lang.Character.toCodePoint(r15, r2)
            long r9 = r4 + r11
            int r3 = r2 >>> 18
            r3 = r3 | 240(0xf0, float:3.36E-43)
            byte r3 = (byte) r3
            com.google.android.gms.internal.ads.zzecb.zza((long) r4, (byte) r3)
            long r3 = r9 + r11
            int r5 = r2 >>> 12
            r5 = r5 & 63
            r15 = 128(0x80, float:1.794E-43)
            r5 = r5 | r15
            byte r5 = (byte) r5
            com.google.android.gms.internal.ads.zzecb.zza((long) r9, (byte) r5)
            long r9 = r3 + r11
            int r5 = r2 >>> 6
            r5 = r5 & 63
            r5 = r5 | r15
            byte r5 = (byte) r5
            com.google.android.gms.internal.ads.zzecb.zza((long) r3, (byte) r5)
            long r3 = r9 + r11
            r2 = r2 & 63
            r2 = r2 | r15
            byte r2 = (byte) r2
            com.google.android.gms.internal.ads.zzecb.zza((long) r9, (byte) r2)
            r9 = r1
            r4 = r3
        L_0x0100:
            int r9 = r9 + 1
            r1 = r23
            r2 = r17
            r10 = 128(0x80, float:1.794E-43)
            goto L_0x0041
        L_0x010a:
            r1 = r9
        L_0x010b:
            com.google.android.gms.internal.ads.zzech r0 = new com.google.android.gms.internal.ads.zzech
            int r1 = r1 + -1
            r0.<init>(r1, r8)
            throw r0
        L_0x0113:
            if (r2 > r15) goto L_0x012b
            if (r15 > r1) goto L_0x012b
            int r1 = r9 + 1
            if (r1 == r8) goto L_0x0125
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r15, r0)
            if (r0 != 0) goto L_0x012b
        L_0x0125:
            com.google.android.gms.internal.ads.zzech r0 = new com.google.android.gms.internal.ads.zzech
            r0.<init>(r9, r8)
            throw r0
        L_0x012b:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r1 = 46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r14)
            r2.append(r15)
            r2.append(r13)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0148:
            r17 = r2
            long r4 = r4 - r17
            int r0 = (int) r4
            r1 = r23
            r1.position(r0)
            return
        L_0x0153:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            int r8 = r8 + -1
            char r0 = r0.charAt(r8)
            int r1 = r23.limit()
            r3 = 37
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r14)
            r4.append(r0)
            r4.append(r13)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            goto L_0x017b
        L_0x017a:
            throw r2
        L_0x017b:
            goto L_0x017a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeck.zzb(java.lang.CharSequence, java.nio.ByteBuffer):void");
    }

    private static int zza(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return zzece.zzgz(i);
        }
        if (i2 == 1) {
            return zzece.zzaq(i, zzecb.zza(bArr, j));
        }
        if (i2 == 2) {
            return zzece.zzj(i, zzecb.zza(bArr, j), zzecb.zza(bArr, j + 1));
        }
        throw new AssertionError();
    }
}
