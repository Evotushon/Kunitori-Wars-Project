package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzlh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzkd {
    private static final int zzaui = zzop.zzbo("meta");
    private static final int zzauw = zzop.zzbo("vide");
    private static final int zzaux = zzop.zzbo("soun");
    private static final int zzauy = zzop.zzbo("text");
    private static final int zzauz = zzop.zzbo("sbtl");
    private static final int zzava = zzop.zzbo("subt");
    private static final int zzavb = zzop.zzbo("clcp");
    private static final int zzavc = zzop.zzbo("cenc");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v10, resolved type: byte[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a3, code lost:
        if (r14 == 0) goto L_0x0093;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzkr zza(com.google.android.gms.internal.ads.zzkb r43, com.google.android.gms.internal.ads.zzke r44, long r45, com.google.android.gms.internal.ads.zziu r47, boolean r48) throws com.google.android.gms.internal.ads.zzhc {
        /*
            r0 = r43
            int r1 = com.google.android.gms.internal.ads.zzkc.zzasl
            com.google.android.gms.internal.ads.zzkb r1 = r0.zzam(r1)
            int r2 = com.google.android.gms.internal.ads.zzkc.zzasz
            com.google.android.gms.internal.ads.zzke r2 = r1.zzal(r2)
            com.google.android.gms.internal.ads.zzom r2 = r2.zzavd
            r3 = 16
            r2.zzbh(r3)
            int r2 = r2.readInt()
            int r4 = zzaux
            r5 = 4
            r6 = 3
            r8 = -1
            if (r2 != r4) goto L_0x0022
            r12 = 1
            goto L_0x0042
        L_0x0022:
            int r4 = zzauw
            if (r2 != r4) goto L_0x0028
            r12 = 2
            goto L_0x0042
        L_0x0028:
            int r4 = zzauy
            if (r2 == r4) goto L_0x0041
            int r4 = zzauz
            if (r2 == r4) goto L_0x0041
            int r4 = zzava
            if (r2 == r4) goto L_0x0041
            int r4 = zzavb
            if (r2 != r4) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            int r4 = zzaui
            if (r2 != r4) goto L_0x003f
            r12 = 4
            goto L_0x0042
        L_0x003f:
            r12 = -1
            goto L_0x0042
        L_0x0041:
            r12 = 3
        L_0x0042:
            r2 = 0
            if (r12 != r8) goto L_0x0046
            return r2
        L_0x0046:
            int r4 = com.google.android.gms.internal.ads.zzkc.zzasv
            com.google.android.gms.internal.ads.zzke r4 = r0.zzal(r4)
            com.google.android.gms.internal.ads.zzom r4 = r4.zzavd
            r10 = 8
            r4.zzbh(r10)
            int r11 = r4.readInt()
            int r11 = com.google.android.gms.internal.ads.zzkc.zzan(r11)
            if (r11 != 0) goto L_0x0060
            r13 = 8
            goto L_0x0062
        L_0x0060:
            r13 = 16
        L_0x0062:
            r4.zzbi(r13)
            int r13 = r4.readInt()
            r4.zzbi(r5)
            int r14 = r4.getPosition()
            if (r11 != 0) goto L_0x0074
            r15 = 4
            goto L_0x0076
        L_0x0074:
            r15 = 8
        L_0x0076:
            r9 = 0
        L_0x0077:
            if (r9 >= r15) goto L_0x0086
            byte[] r7 = r4.data
            int r16 = r14 + r9
            byte r7 = r7[r16]
            if (r7 == r8) goto L_0x0083
            r7 = 0
            goto L_0x0087
        L_0x0083:
            int r9 = r9 + 1
            goto L_0x0077
        L_0x0086:
            r7 = 1
        L_0x0087:
            r16 = 0
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 == 0) goto L_0x0096
            r4.zzbi(r15)
        L_0x0093:
            r14 = r18
            goto L_0x00a6
        L_0x0096:
            if (r11 != 0) goto L_0x009d
            long r14 = r4.zziz()
            goto L_0x00a1
        L_0x009d:
            long r14 = r4.zzjd()
        L_0x00a1:
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 != 0) goto L_0x00a6
            goto L_0x0093
        L_0x00a6:
            r4.zzbi(r3)
            int r7 = r4.readInt()
            int r9 = r4.readInt()
            r4.zzbi(r5)
            int r11 = r4.readInt()
            int r4 = r4.readInt()
            r5 = -65536(0xffffffffffff0000, float:NaN)
            if (r7 != 0) goto L_0x00cb
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r9 != r3) goto L_0x00cb
            if (r11 != r5) goto L_0x00cb
            if (r4 != 0) goto L_0x00cb
            r7 = 90
            goto L_0x00e4
        L_0x00cb:
            if (r7 != 0) goto L_0x00d8
            if (r9 != r5) goto L_0x00d8
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r11 != r3) goto L_0x00d8
            if (r4 != 0) goto L_0x00d8
            r7 = 270(0x10e, float:3.78E-43)
            goto L_0x00e4
        L_0x00d8:
            if (r7 != r5) goto L_0x00e3
            if (r9 != 0) goto L_0x00e3
            if (r11 != 0) goto L_0x00e3
            if (r4 != r5) goto L_0x00e3
            r7 = 180(0xb4, float:2.52E-43)
            goto L_0x00e4
        L_0x00e3:
            r7 = 0
        L_0x00e4:
            com.google.android.gms.internal.ads.zzkj r3 = new com.google.android.gms.internal.ads.zzkj
            r3.<init>(r13, r14, r7)
            long r22 = r3.zzcw
            r4 = r44
            com.google.android.gms.internal.ads.zzom r4 = r4.zzavd
            r4.zzbh(r10)
            int r5 = r4.readInt()
            int r5 = com.google.android.gms.internal.ads.zzkc.zzan(r5)
            if (r5 != 0) goto L_0x0101
            r5 = 8
            goto L_0x0103
        L_0x0101:
            r5 = 16
        L_0x0103:
            r4.zzbi(r5)
            long r4 = r4.zziz()
            int r7 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            if (r7 != 0) goto L_0x010f
            goto L_0x011a
        L_0x010f:
            r24 = 1000000(0xf4240, double:4.940656E-318)
            r26 = r4
            long r13 = com.google.android.gms.internal.ads.zzop.zza((long) r22, (long) r24, (long) r26)
            r18 = r13
        L_0x011a:
            int r7 = com.google.android.gms.internal.ads.zzkc.zzasm
            com.google.android.gms.internal.ads.zzkb r7 = r1.zzam(r7)
            int r9 = com.google.android.gms.internal.ads.zzkc.zzasn
            com.google.android.gms.internal.ads.zzkb r7 = r7.zzam(r9)
            int r9 = com.google.android.gms.internal.ads.zzkc.zzasy
            com.google.android.gms.internal.ads.zzke r1 = r1.zzal(r9)
            com.google.android.gms.internal.ads.zzom r1 = r1.zzavd
            r1.zzbh(r10)
            int r9 = r1.readInt()
            int r9 = com.google.android.gms.internal.ads.zzkc.zzan(r9)
            if (r9 != 0) goto L_0x013e
            r11 = 8
            goto L_0x0140
        L_0x013e:
            r11 = 16
        L_0x0140:
            r1.zzbi(r11)
            long r13 = r1.zziz()
            if (r9 != 0) goto L_0x014b
            r9 = 4
            goto L_0x014d
        L_0x014b:
            r9 = 8
        L_0x014d:
            r1.zzbi(r9)
            int r1 = r1.readUnsignedShort()
            int r9 = r1 >> 10
            r9 = r9 & 31
            int r9 = r9 + 96
            char r9 = (char) r9
            int r11 = r1 >> 5
            r11 = r11 & 31
            int r11 = r11 + 96
            char r11 = (char) r11
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r6)
            r15.append(r9)
            r15.append(r11)
            r15.append(r1)
            java.lang.String r1 = r15.toString()
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            android.util.Pair r1 = android.util.Pair.create(r9, r1)
            int r9 = com.google.android.gms.internal.ads.zzkc.zzata
            com.google.android.gms.internal.ads.zzke r7 = r7.zzal(r9)
            com.google.android.gms.internal.ads.zzom r7 = r7.zzavd
            int r9 = r3.id
            int r11 = r3.zzafs
            java.lang.Object r13 = r1.second
            java.lang.String r13 = (java.lang.String) r13
            r14 = 12
            r7.zzbh(r14)
            int r14 = r7.readInt()
            com.google.android.gms.internal.ads.zzki r15 = new com.google.android.gms.internal.ads.zzki
            r15.<init>(r14)
            r6 = 0
        L_0x01a4:
            if (r6 >= r14) goto L_0x0678
            int r10 = r7.getPosition()
            int r2 = r7.readInt()
            if (r2 <= 0) goto L_0x01b4
            r44 = r14
            r8 = 1
            goto L_0x01b7
        L_0x01b4:
            r44 = r14
            r8 = 0
        L_0x01b7:
            java.lang.String r14 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.zzob.checkArgument(r8, r14)
            int r8 = r7.readInt()
            r37 = r4
            int r4 = com.google.android.gms.internal.ads.zzkc.zzari
            if (r8 == r4) goto L_0x04c9
            int r4 = com.google.android.gms.internal.ads.zzkc.zzarj
            if (r8 == r4) goto L_0x04c9
            int r4 = com.google.android.gms.internal.ads.zzkc.zzatg
            if (r8 == r4) goto L_0x04c9
            int r4 = com.google.android.gms.internal.ads.zzkc.zzats
            if (r8 == r4) goto L_0x04c9
            int r4 = com.google.android.gms.internal.ads.zzkc.zzark
            if (r8 == r4) goto L_0x04c9
            int r4 = com.google.android.gms.internal.ads.zzkc.zzarl
            if (r8 == r4) goto L_0x04c9
            int r4 = com.google.android.gms.internal.ads.zzkc.zzarm
            if (r8 == r4) goto L_0x04c9
            int r4 = com.google.android.gms.internal.ads.zzkc.zzaur
            if (r8 == r4) goto L_0x04c9
            int r4 = com.google.android.gms.internal.ads.zzkc.zzaus
            if (r8 != r4) goto L_0x01e8
            goto L_0x04c9
        L_0x01e8:
            int r4 = com.google.android.gms.internal.ads.zzkc.zzarp
            if (r8 == r4) goto L_0x02ba
            int r4 = com.google.android.gms.internal.ads.zzkc.zzath
            if (r8 == r4) goto L_0x02ba
            int r4 = com.google.android.gms.internal.ads.zzkc.zzaru
            if (r8 == r4) goto L_0x02ba
            int r4 = com.google.android.gms.internal.ads.zzkc.zzarw
            if (r8 == r4) goto L_0x02ba
            int r4 = com.google.android.gms.internal.ads.zzkc.zzary
            if (r8 == r4) goto L_0x02ba
            int r4 = com.google.android.gms.internal.ads.zzkc.zzasb
            if (r8 == r4) goto L_0x02ba
            int r4 = com.google.android.gms.internal.ads.zzkc.zzarz
            if (r8 == r4) goto L_0x02ba
            int r4 = com.google.android.gms.internal.ads.zzkc.zzasa
            if (r8 == r4) goto L_0x02ba
            int r4 = com.google.android.gms.internal.ads.zzkc.zzauf
            if (r8 == r4) goto L_0x02ba
            int r4 = com.google.android.gms.internal.ads.zzkc.zzaug
            if (r8 == r4) goto L_0x02ba
            int r4 = com.google.android.gms.internal.ads.zzkc.zzars
            if (r8 == r4) goto L_0x02ba
            int r4 = com.google.android.gms.internal.ads.zzkc.zzart
            if (r8 == r4) goto L_0x02ba
            int r4 = com.google.android.gms.internal.ads.zzkc.zzarq
            if (r8 == r4) goto L_0x02ba
            int r4 = com.google.android.gms.internal.ads.zzkc.zzauv
            if (r8 != r4) goto L_0x0222
            goto L_0x02ba
        L_0x0222:
            int r4 = com.google.android.gms.internal.ads.zzkc.zzatq
            if (r8 == r4) goto L_0x024b
            int r4 = com.google.android.gms.internal.ads.zzkc.zzaub
            if (r8 == r4) goto L_0x024b
            int r4 = com.google.android.gms.internal.ads.zzkc.zzauc
            if (r8 == r4) goto L_0x024b
            int r4 = com.google.android.gms.internal.ads.zzkc.zzaud
            if (r8 == r4) goto L_0x024b
            int r4 = com.google.android.gms.internal.ads.zzkc.zzaue
            if (r8 != r4) goto L_0x0237
            goto L_0x024b
        L_0x0237:
            int r4 = com.google.android.gms.internal.ads.zzkc.zzauu
            if (r8 != r4) goto L_0x02fa
            java.lang.String r4 = java.lang.Integer.toString(r9)
            java.lang.String r5 = "application/x-camera-motion"
            r8 = -1
            r14 = 0
            com.google.android.gms.internal.ads.zzgz r4 = com.google.android.gms.internal.ads.zzgz.zza(r4, r5, r14, r8, r14)
            r15.zzagi = r4
            goto L_0x02fa
        L_0x024b:
            int r4 = r10 + 8
            r5 = 8
            int r4 = r4 + r5
            r7.zzbh(r4)
            r22 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = com.google.android.gms.internal.ads.zzkc.zzatq
            if (r8 != r4) goto L_0x0265
            java.lang.String r4 = "application/ttml+xml"
        L_0x025e:
            r30 = r22
            r32 = 0
            r23 = r4
            goto L_0x029d
        L_0x0265:
            int r4 = com.google.android.gms.internal.ads.zzkc.zzaub
            if (r8 != r4) goto L_0x027f
            int r4 = r2 + -8
            int r4 = r4 - r5
            byte[] r5 = new byte[r4]
            r8 = 0
            r7.zze(r5, r8, r4)
            java.util.List r4 = java.util.Collections.singletonList(r5)
            java.lang.String r5 = "application/x-quicktime-tx3g"
            r32 = r4
            r30 = r22
            r23 = r5
            goto L_0x029d
        L_0x027f:
            int r4 = com.google.android.gms.internal.ads.zzkc.zzauc
            if (r8 != r4) goto L_0x0286
            java.lang.String r4 = "application/x-mp4-vtt"
            goto L_0x025e
        L_0x0286:
            int r4 = com.google.android.gms.internal.ads.zzkc.zzaud
            if (r8 != r4) goto L_0x0293
            java.lang.String r4 = "application/ttml+xml"
            r23 = r4
            r30 = r16
            r32 = 0
            goto L_0x029d
        L_0x0293:
            int r4 = com.google.android.gms.internal.ads.zzkc.zzaue
            if (r8 != r4) goto L_0x02b4
            r4 = 1
            r15.zzavo = r4
            java.lang.String r4 = "application/x-mp4-cea-608"
            goto L_0x025e
        L_0x029d:
            java.lang.String r22 = java.lang.Integer.toString(r9)
            r24 = 0
            r25 = -1
            r26 = 0
            r28 = -1
            r29 = 0
            r27 = r13
            com.google.android.gms.internal.ads.zzgz r4 = com.google.android.gms.internal.ads.zzgz.zza(r22, r23, r24, r25, r26, r27, r28, r29, r30, r32)
            r15.zzagi = r4
            goto L_0x02fa
        L_0x02b4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x02ba:
            int r4 = r10 + 8
            r5 = 8
            int r4 = r4 + r5
            r7.zzbh(r4)
            if (r48 == 0) goto L_0x02cd
            int r4 = r7.readUnsignedShort()
            r5 = 6
            r7.zzbi(r5)
            goto L_0x02d3
        L_0x02cd:
            r4 = 8
            r7.zzbi(r4)
            r4 = 0
        L_0x02d3:
            if (r4 == 0) goto L_0x0305
            r5 = 1
            if (r4 != r5) goto L_0x02d9
            goto L_0x0305
        L_0x02d9:
            r5 = 2
            if (r4 != r5) goto L_0x02fa
            r4 = 16
            r7.zzbi(r4)
            long r4 = r7.readLong()
            double r4 = java.lang.Double.longBitsToDouble(r4)
            long r4 = java.lang.Math.round(r4)
            int r5 = (int) r4
            int r4 = r7.zzjc()
            r22 = r4
            r4 = 20
            r7.zzbi(r4)
            goto L_0x031f
        L_0x02fa:
            r40 = r1
            r41 = r3
            r42 = r11
            r39 = r12
        L_0x0302:
            r1 = 3
            goto L_0x065e
        L_0x0305:
            int r5 = r7.readUnsignedShort()
            r22 = r5
            r5 = 6
            r7.zzbi(r5)
            int r5 = r7.zzjb()
            r23 = r5
            r5 = 1
            if (r4 != r5) goto L_0x031d
            r4 = 16
            r7.zzbi(r4)
        L_0x031d:
            r5 = r23
        L_0x031f:
            int r4 = r7.getPosition()
            r23 = r5
            int r5 = com.google.android.gms.internal.ads.zzkc.zzath
            if (r8 != r5) goto L_0x0330
            int r8 = zza((com.google.android.gms.internal.ads.zzom) r7, (int) r10, (int) r2, (com.google.android.gms.internal.ads.zzki) r15, (int) r6)
            r7.zzbh(r4)
        L_0x0330:
            int r5 = com.google.android.gms.internal.ads.zzkc.zzaru
            if (r8 != r5) goto L_0x0337
            java.lang.String r5 = "audio/ac3"
            goto L_0x0381
        L_0x0337:
            int r5 = com.google.android.gms.internal.ads.zzkc.zzarw
            if (r8 != r5) goto L_0x033e
            java.lang.String r5 = "audio/eac3"
            goto L_0x0381
        L_0x033e:
            int r5 = com.google.android.gms.internal.ads.zzkc.zzary
            if (r8 != r5) goto L_0x0345
            java.lang.String r5 = "audio/vnd.dts"
            goto L_0x0381
        L_0x0345:
            int r5 = com.google.android.gms.internal.ads.zzkc.zzarz
            if (r8 == r5) goto L_0x037f
            int r5 = com.google.android.gms.internal.ads.zzkc.zzasa
            if (r8 != r5) goto L_0x034e
            goto L_0x037f
        L_0x034e:
            int r5 = com.google.android.gms.internal.ads.zzkc.zzasb
            if (r8 != r5) goto L_0x0355
            java.lang.String r5 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x0381
        L_0x0355:
            int r5 = com.google.android.gms.internal.ads.zzkc.zzauf
            if (r8 != r5) goto L_0x035c
            java.lang.String r5 = "audio/3gpp"
            goto L_0x0381
        L_0x035c:
            int r5 = com.google.android.gms.internal.ads.zzkc.zzaug
            if (r8 != r5) goto L_0x0363
            java.lang.String r5 = "audio/amr-wb"
            goto L_0x0381
        L_0x0363:
            int r5 = com.google.android.gms.internal.ads.zzkc.zzars
            if (r8 == r5) goto L_0x037c
            int r5 = com.google.android.gms.internal.ads.zzkc.zzart
            if (r8 != r5) goto L_0x036c
            goto L_0x037c
        L_0x036c:
            int r5 = com.google.android.gms.internal.ads.zzkc.zzarq
            if (r8 != r5) goto L_0x0373
            java.lang.String r5 = "audio/mpeg"
            goto L_0x0381
        L_0x0373:
            int r5 = com.google.android.gms.internal.ads.zzkc.zzauv
            if (r8 != r5) goto L_0x037a
            java.lang.String r5 = "audio/alac"
            goto L_0x0381
        L_0x037a:
            r5 = 0
            goto L_0x0381
        L_0x037c:
            java.lang.String r5 = "audio/raw"
            goto L_0x0381
        L_0x037f:
            java.lang.String r5 = "audio/vnd.dts.hd"
        L_0x0381:
            r8 = r4
            r39 = r12
            r4 = r22
            r33 = r23
            r34 = 0
        L_0x038a:
            int r12 = r8 - r10
            if (r12 >= r2) goto L_0x0486
            r7.zzbh(r8)
            int r12 = r7.readInt()
            if (r12 <= 0) goto L_0x039b
            r40 = r1
            r1 = 1
            goto L_0x039e
        L_0x039b:
            r40 = r1
            r1 = 0
        L_0x039e:
            com.google.android.gms.internal.ads.zzob.checkArgument(r1, r14)
            int r1 = r7.readInt()
            r41 = r3
            int r3 = com.google.android.gms.internal.ads.zzkc.zzasq
            if (r1 == r3) goto L_0x0414
            if (r48 == 0) goto L_0x03b2
            int r3 = com.google.android.gms.internal.ads.zzkc.zzarr
            if (r1 != r3) goto L_0x03b2
            goto L_0x0414
        L_0x03b2:
            int r3 = com.google.android.gms.internal.ads.zzkc.zzarv
            if (r1 != r3) goto L_0x03c8
            int r1 = r8 + 8
            r7.zzbh(r1)
            java.lang.String r1 = java.lang.Integer.toString(r9)
            r3 = 0
            com.google.android.gms.internal.ads.zzgz r1 = com.google.android.gms.internal.ads.zzhn.zza(r7, r1, r13, r3)
            r15.zzagi = r1
        L_0x03c6:
            r3 = 0
            goto L_0x040f
        L_0x03c8:
            int r3 = com.google.android.gms.internal.ads.zzkc.zzarx
            if (r1 != r3) goto L_0x03dd
            int r1 = r8 + 8
            r7.zzbh(r1)
            java.lang.String r1 = java.lang.Integer.toString(r9)
            r3 = 0
            com.google.android.gms.internal.ads.zzgz r1 = com.google.android.gms.internal.ads.zzhn.zzb(r7, r1, r13, r3)
            r15.zzagi = r1
            goto L_0x03c6
        L_0x03dd:
            int r3 = com.google.android.gms.internal.ads.zzkc.zzasc
            if (r1 != r3) goto L_0x0400
            java.lang.String r22 = java.lang.Integer.toString(r9)
            r24 = 0
            r25 = -1
            r26 = -1
            r29 = 0
            r30 = 0
            r31 = 0
            r23 = r5
            r27 = r4
            r28 = r33
            r32 = r13
            com.google.android.gms.internal.ads.zzgz r1 = com.google.android.gms.internal.ads.zzgz.zza(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r15.zzagi = r1
            goto L_0x03c6
        L_0x0400:
            int r3 = com.google.android.gms.internal.ads.zzkc.zzauv
            if (r1 != r3) goto L_0x03c6
            byte[] r1 = new byte[r12]
            r7.zzbh(r8)
            r3 = 0
            r7.zze(r1, r3, r12)
            r34 = r1
        L_0x040f:
            r42 = r11
            r0 = -1
            goto L_0x047b
        L_0x0414:
            int r3 = com.google.android.gms.internal.ads.zzkc.zzasq
            if (r1 != r3) goto L_0x041d
            r1 = r8
            r42 = r11
        L_0x041b:
            r0 = -1
            goto L_0x0449
        L_0x041d:
            int r1 = r7.getPosition()
        L_0x0421:
            int r3 = r1 - r8
            if (r3 >= r12) goto L_0x0445
            r7.zzbh(r1)
            int r3 = r7.readInt()
            if (r3 <= 0) goto L_0x0430
            r0 = 1
            goto L_0x0431
        L_0x0430:
            r0 = 0
        L_0x0431:
            com.google.android.gms.internal.ads.zzob.checkArgument(r0, r14)
            int r0 = r7.readInt()
            r42 = r11
            int r11 = com.google.android.gms.internal.ads.zzkc.zzasq
            if (r0 != r11) goto L_0x043f
            goto L_0x041b
        L_0x043f:
            int r1 = r1 + r3
            r0 = r43
            r11 = r42
            goto L_0x0421
        L_0x0445:
            r42 = r11
            r0 = -1
            r1 = -1
        L_0x0449:
            if (r1 == r0) goto L_0x047b
            android.util.Pair r1 = zzb(r7, r1)
            java.lang.Object r3 = r1.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.second
            r34 = r1
            byte[] r34 = (byte[]) r34
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x047a
            android.util.Pair r1 = com.google.android.gms.internal.ads.zzoe.zze(r34)
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5 = r3
            r33 = r4
            r4 = r1
            goto L_0x047b
        L_0x047a:
            r5 = r3
        L_0x047b:
            int r8 = r8 + r12
            r0 = r43
            r1 = r40
            r3 = r41
            r11 = r42
            goto L_0x038a
        L_0x0486:
            r40 = r1
            r41 = r3
            r42 = r11
            r0 = -1
            com.google.android.gms.internal.ads.zzgz r1 = r15.zzagi
            if (r1 != 0) goto L_0x0302
            if (r5 == 0) goto L_0x0302
            java.lang.String r1 = "audio/raw"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x049e
            r29 = 2
            goto L_0x04a0
        L_0x049e:
            r29 = -1
        L_0x04a0:
            java.lang.String r22 = java.lang.Integer.toString(r9)
            r24 = 0
            r25 = -1
            r26 = -1
            if (r34 != 0) goto L_0x04af
            r30 = 0
            goto L_0x04b5
        L_0x04af:
            java.util.List r1 = java.util.Collections.singletonList(r34)
            r30 = r1
        L_0x04b5:
            r31 = 0
            r32 = 0
            r23 = r5
            r27 = r4
            r28 = r33
            r33 = r13
            com.google.android.gms.internal.ads.zzgz r1 = com.google.android.gms.internal.ads.zzgz.zza(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r15.zzagi = r1
            goto L_0x0302
        L_0x04c9:
            r40 = r1
            r41 = r3
            r42 = r11
            r39 = r12
            r0 = -1
            int r1 = r10 + 8
            r3 = 8
            int r1 = r1 + r3
            r7.zzbh(r1)
            r1 = 16
            r7.zzbi(r1)
            int r27 = r7.readUnsignedShort()
            int r28 = r7.readUnsignedShort()
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 50
            r7.zzbi(r4)
            int r4 = r7.getPosition()
            int r5 = com.google.android.gms.internal.ads.zzkc.zzatg
            if (r8 != r5) goto L_0x04fd
            int r8 = zza((com.google.android.gms.internal.ads.zzom) r7, (int) r10, (int) r2, (com.google.android.gms.internal.ads.zzki) r15, (int) r6)
            r7.zzbh(r4)
        L_0x04fd:
            r3 = 0
            r23 = 0
            r30 = 0
            r32 = 1065353216(0x3f800000, float:1.0)
            r33 = 0
            r34 = -1
        L_0x0508:
            int r5 = r4 - r10
            if (r5 >= r2) goto L_0x0643
            r7.zzbh(r4)
            int r5 = r7.getPosition()
            int r11 = r7.readInt()
            if (r11 != 0) goto L_0x0520
            int r12 = r7.getPosition()
            int r12 = r12 - r10
            if (r12 == r2) goto L_0x0643
        L_0x0520:
            if (r11 <= 0) goto L_0x0524
            r12 = 1
            goto L_0x0525
        L_0x0524:
            r12 = 0
        L_0x0525:
            com.google.android.gms.internal.ads.zzob.checkArgument(r12, r14)
            int r12 = r7.readInt()
            int r0 = com.google.android.gms.internal.ads.zzkc.zzaso
            if (r12 != r0) goto L_0x0550
            if (r23 != 0) goto L_0x0534
            r0 = 1
            goto L_0x0535
        L_0x0534:
            r0 = 0
        L_0x0535:
            com.google.android.gms.internal.ads.zzob.checkState(r0)
            int r5 = r5 + 8
            r7.zzbh(r5)
            com.google.android.gms.internal.ads.zzor r0 = com.google.android.gms.internal.ads.zzor.zzf(r7)
            java.util.List<byte[]> r5 = r0.zzafp
            int r12 = r0.zzara
            r15.zzara = r12
            if (r3 != 0) goto L_0x054d
            float r0 = r0.zzbgt
            r32 = r0
        L_0x054d:
            java.lang.String r0 = "video/avc"
            goto L_0x056d
        L_0x0550:
            int r0 = com.google.android.gms.internal.ads.zzkc.zzasp
            if (r12 != r0) goto L_0x0574
            if (r23 != 0) goto L_0x0558
            r0 = 1
            goto L_0x0559
        L_0x0558:
            r0 = 0
        L_0x0559:
            com.google.android.gms.internal.ads.zzob.checkState(r0)
            int r5 = r5 + 8
            r7.zzbh(r5)
            com.google.android.gms.internal.ads.zzox r0 = com.google.android.gms.internal.ads.zzox.zzh(r7)
            java.util.List<byte[]> r5 = r0.zzafp
            int r0 = r0.zzara
            r15.zzara = r0
            java.lang.String r0 = "video/hevc"
        L_0x056d:
            r23 = r0
            r30 = r5
        L_0x0571:
            r1 = 3
            goto L_0x063d
        L_0x0574:
            int r0 = com.google.android.gms.internal.ads.zzkc.zzaut
            if (r12 != r0) goto L_0x058a
            if (r23 != 0) goto L_0x057c
            r0 = 1
            goto L_0x057d
        L_0x057c:
            r0 = 0
        L_0x057d:
            com.google.android.gms.internal.ads.zzob.checkState(r0)
            int r0 = com.google.android.gms.internal.ads.zzkc.zzaur
            if (r8 != r0) goto L_0x0587
            java.lang.String r0 = "video/x-vnd.on2.vp8"
            goto L_0x0598
        L_0x0587:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            goto L_0x0598
        L_0x058a:
            int r0 = com.google.android.gms.internal.ads.zzkc.zzarn
            if (r12 != r0) goto L_0x059b
            if (r23 != 0) goto L_0x0592
            r0 = 1
            goto L_0x0593
        L_0x0592:
            r0 = 0
        L_0x0593:
            com.google.android.gms.internal.ads.zzob.checkState(r0)
            java.lang.String r0 = "video/3gpp"
        L_0x0598:
            r23 = r0
            goto L_0x0571
        L_0x059b:
            int r0 = com.google.android.gms.internal.ads.zzkc.zzasq
            if (r12 != r0) goto L_0x05bc
            if (r23 != 0) goto L_0x05a3
            r0 = 1
            goto L_0x05a4
        L_0x05a3:
            r0 = 0
        L_0x05a4:
            com.google.android.gms.internal.ads.zzob.checkState(r0)
            android.util.Pair r0 = zzb(r7, r5)
            java.lang.Object r5 = r0.first
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.second
            byte[] r0 = (byte[]) r0
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r30 = r0
            r23 = r5
            goto L_0x0571
        L_0x05bc:
            int r0 = com.google.android.gms.internal.ads.zzkc.zzatp
            if (r12 != r0) goto L_0x05d5
            int r5 = r5 + 8
            r7.zzbh(r5)
            int r0 = r7.zzjc()
            int r3 = r7.zzjc()
            float r0 = (float) r0
            float r3 = (float) r3
            float r32 = r0 / r3
            r1 = 3
            r3 = 1
            goto L_0x063d
        L_0x05d5:
            int r0 = com.google.android.gms.internal.ads.zzkc.zzaup
            if (r12 != r0) goto L_0x0607
            int r0 = r5 + 8
        L_0x05db:
            int r12 = r0 - r5
            if (r12 >= r11) goto L_0x05fe
            r7.zzbh(r0)
            int r12 = r7.readInt()
            int r1 = r7.readInt()
            r22 = r3
            int r3 = com.google.android.gms.internal.ads.zzkc.zzauq
            if (r1 != r3) goto L_0x05f8
            byte[] r1 = r7.data
            int r12 = r12 + r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r0, r12)
            goto L_0x0601
        L_0x05f8:
            int r0 = r0 + r12
            r3 = r22
            r1 = 16
            goto L_0x05db
        L_0x05fe:
            r22 = r3
            r0 = 0
        L_0x0601:
            r33 = r0
            r3 = r22
            goto L_0x0571
        L_0x0607:
            r22 = r3
            int r0 = com.google.android.gms.internal.ads.zzkc.zzauo
            if (r12 != r0) goto L_0x063a
            int r0 = r7.readUnsignedByte()
            r1 = 3
            r7.zzbi(r1)
            if (r0 != 0) goto L_0x063b
            int r0 = r7.readUnsignedByte()
            if (r0 == 0) goto L_0x0635
            r3 = 1
            if (r0 == r3) goto L_0x0630
            r3 = 2
            if (r0 == r3) goto L_0x062b
            if (r0 == r1) goto L_0x0626
            goto L_0x063b
        L_0x0626:
            r3 = r22
            r34 = 3
            goto L_0x063d
        L_0x062b:
            r3 = r22
            r34 = 2
            goto L_0x063d
        L_0x0630:
            r3 = r22
            r34 = 1
            goto L_0x063d
        L_0x0635:
            r3 = r22
            r34 = 0
            goto L_0x063d
        L_0x063a:
            r1 = 3
        L_0x063b:
            r3 = r22
        L_0x063d:
            int r4 = r4 + r11
            r0 = -1
            r1 = 16
            goto L_0x0508
        L_0x0643:
            r1 = 3
            if (r23 == 0) goto L_0x065e
            java.lang.String r22 = java.lang.Integer.toString(r9)
            r24 = 0
            r25 = -1
            r26 = -1
            r29 = -1082130432(0xffffffffbf800000, float:-1.0)
            r35 = 0
            r36 = 0
            r31 = r42
            com.google.android.gms.internal.ads.zzgz r0 = com.google.android.gms.internal.ads.zzgz.zza(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r15.zzagi = r0
        L_0x065e:
            int r10 = r10 + r2
            r7.zzbh(r10)
            int r6 = r6 + 1
            r0 = r43
            r14 = r44
            r4 = r37
            r12 = r39
            r1 = r40
            r3 = r41
            r11 = r42
            r2 = 0
            r8 = -1
            r10 = 8
            goto L_0x01a4
        L_0x0678:
            r40 = r1
            r41 = r3
            r37 = r4
            r39 = r12
            int r0 = com.google.android.gms.internal.ads.zzkc.zzasw
            r1 = r43
            com.google.android.gms.internal.ads.zzkb r0 = r1.zzam(r0)
            if (r0 == 0) goto L_0x06e5
            int r1 = com.google.android.gms.internal.ads.zzkc.zzasx
            com.google.android.gms.internal.ads.zzke r0 = r0.zzal(r1)
            if (r0 != 0) goto L_0x0693
            goto L_0x06e5
        L_0x0693:
            com.google.android.gms.internal.ads.zzom r0 = r0.zzavd
            r1 = 8
            r0.zzbh(r1)
            int r1 = r0.readInt()
            int r1 = com.google.android.gms.internal.ads.zzkc.zzan(r1)
            int r2 = r0.zzjc()
            long[] r3 = new long[r2]
            long[] r4 = new long[r2]
            r5 = 0
        L_0x06ab:
            if (r5 >= r2) goto L_0x06de
            r6 = 1
            if (r1 != r6) goto L_0x06b5
            long r7 = r0.zzjd()
            goto L_0x06b9
        L_0x06b5:
            long r7 = r0.zziz()
        L_0x06b9:
            r3[r5] = r7
            if (r1 != r6) goto L_0x06c2
            long r7 = r0.readLong()
            goto L_0x06c7
        L_0x06c2:
            int r7 = r0.readInt()
            long r7 = (long) r7
        L_0x06c7:
            r4[r5] = r7
            short r7 = r0.readShort()
            if (r7 != r6) goto L_0x06d6
            r7 = 2
            r0.zzbi(r7)
            int r5 = r5 + 1
            goto L_0x06ab
        L_0x06d6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x06de:
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
            r1 = r0
            r0 = 0
            goto L_0x06ea
        L_0x06e5:
            r0 = 0
            android.util.Pair r1 = android.util.Pair.create(r0, r0)
        L_0x06ea:
            com.google.android.gms.internal.ads.zzgz r2 = r15.zzagi
            if (r2 != 0) goto L_0x06ef
            return r0
        L_0x06ef:
            com.google.android.gms.internal.ads.zzkr r0 = new com.google.android.gms.internal.ads.zzkr
            int r11 = r41.id
            r2 = r40
            java.lang.Object r2 = r2.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r13 = r2.longValue()
            com.google.android.gms.internal.ads.zzgz r2 = r15.zzagi
            int r3 = r15.zzavo
            com.google.android.gms.internal.ads.zzku[] r4 = r15.zzavn
            int r5 = r15.zzara
            java.lang.Object r6 = r1.first
            r23 = r6
            long[] r23 = (long[]) r23
            java.lang.Object r1 = r1.second
            r24 = r1
            long[] r24 = (long[]) r24
            r10 = r0
            r12 = r39
            r15 = r37
            r17 = r18
            r19 = r2
            r20 = r3
            r21 = r4
            r22 = r5
            r10.<init>(r11, r12, r13, r15, r17, r19, r20, r21, r22, r23, r24)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkd.zza(com.google.android.gms.internal.ads.zzkb, com.google.android.gms.internal.ads.zzke, long, com.google.android.gms.internal.ads.zziu, boolean):com.google.android.gms.internal.ads.zzkr");
    }

    public static zzkt zza(zzkr zzkr, zzkb zzkb, zzjk zzjk) throws zzhc {
        zzkf zzkf;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        boolean z2;
        int[] iArr3;
        int i5;
        long[] jArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int i6;
        int i7;
        zzkr zzkr2 = zzkr;
        zzkb zzkb2 = zzkb;
        zzjk zzjk2 = zzjk;
        zzke zzal = zzkb2.zzal(zzkc.zzatx);
        if (zzal != null) {
            zzkf = new zzkh(zzal);
        } else {
            zzke zzal2 = zzkb2.zzal(zzkc.zzaty);
            if (zzal2 != null) {
                zzkf = new zzkk(zzal2);
            } else {
                throw new zzhc("Track has no sample table size information");
            }
        }
        int zzgu = zzkf.zzgu();
        if (zzgu == 0) {
            return new zzkt(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        zzke zzal3 = zzkb2.zzal(zzkc.zzatz);
        if (zzal3 == null) {
            zzal3 = zzkb2.zzal(zzkc.zzaua);
            z = true;
        } else {
            z = false;
        }
        zzom zzom = zzal3.zzavd;
        zzom zzom2 = zzkb2.zzal(zzkc.zzatw).zzavd;
        zzom zzom3 = zzkb2.zzal(zzkc.zzatt).zzavd;
        zzke zzal4 = zzkb2.zzal(zzkc.zzatu);
        zzom zzom4 = zzal4 != null ? zzal4.zzavd : null;
        zzke zzal5 = zzkb2.zzal(zzkc.zzatv);
        zzom zzom5 = zzal5 != null ? zzal5.zzavd : null;
        zzkg zzkg = new zzkg(zzom2, zzom, z);
        zzom3.zzbh(12);
        int zzjc = zzom3.zzjc() - 1;
        int zzjc2 = zzom3.zzjc();
        int zzjc3 = zzom3.zzjc();
        if (zzom5 != null) {
            zzom5.zzbh(12);
            i = zzom5.zzjc();
        } else {
            i = 0;
        }
        int i8 = -1;
        if (zzom4 != null) {
            zzom4.zzbh(12);
            i2 = zzom4.zzjc();
            if (i2 > 0) {
                i8 = zzom4.zzjc() - 1;
            } else {
                zzom4 = null;
            }
        } else {
            i2 = 0;
        }
        long j2 = 0;
        if (!(zzkf.zzgw() && "audio/raw".equals(zzkr2.zzagi.zzafn) && zzjc == 0 && i == 0 && i2 == 0)) {
            jArr2 = new long[zzgu];
            iArr = new int[zzgu];
            jArr = new long[zzgu];
            int i9 = i2;
            iArr2 = new int[zzgu];
            int i10 = i9;
            zzom zzom6 = zzom3;
            int i11 = zzjc3;
            int i12 = i;
            int i13 = i8;
            long j3 = 0;
            long j4 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = zzjc2;
            int i19 = zzjc;
            int i20 = 0;
            while (i20 < zzgu) {
                long j5 = j3;
                int i21 = i14;
                while (i21 == 0) {
                    zzob.checkState(zzkg.zzgx());
                    j5 = zzkg.zzavf;
                    i21 = zzkg.zzave;
                    i19 = i19;
                    i11 = i11;
                }
                int i22 = i19;
                int i23 = i11;
                if (zzom5 != null) {
                    while (i17 == 0 && i12 > 0) {
                        i17 = zzom5.zzjc();
                        i16 = zzom5.readInt();
                        i12--;
                    }
                    i17--;
                }
                int i24 = i16;
                jArr2[i20] = j5;
                iArr[i20] = zzkf.zzgv();
                if (iArr[i20] > i15) {
                    i6 = zzgu;
                    i15 = iArr[i20];
                } else {
                    i6 = zzgu;
                }
                zzkf zzkf2 = zzkf;
                jArr[i20] = j4 + ((long) i24);
                iArr2[i20] = zzom4 == null ? 1 : 0;
                if (i20 == i13) {
                    iArr2[i20] = 1;
                    i10--;
                    if (i10 > 0) {
                        i13 = zzom4.zzjc() - 1;
                    }
                }
                int i25 = i10;
                int i26 = i13;
                int i27 = i23;
                j4 += (long) i27;
                i18--;
                if (i18 != 0 || i22 <= 0) {
                    i7 = i22;
                } else {
                    i7 = i22 - 1;
                    i18 = zzom6.zzjc();
                    i27 = zzom6.zzjc();
                }
                int i28 = i7;
                i20++;
                i13 = i26;
                zzgu = i6;
                i14 = i21 - 1;
                i16 = i24;
                i19 = i28;
                j3 = j5 + ((long) iArr[i20]);
                zzkf zzkf3 = zzkf2;
                i11 = i27;
                i10 = i25;
                zzkf = zzkf3;
            }
            i4 = zzgu;
            int i29 = i19;
            zzob.checkArgument(i17 == 0);
            while (i12 > 0) {
                zzob.checkArgument(zzom5.zzjc() == 0);
                zzom5.readInt();
                i12--;
            }
            if (i10 == 0 && i18 == 0 && i14 == 0 && i29 == 0) {
                zzkr2 = zzkr;
            } else {
                int i30 = i10;
                zzkr2 = zzkr;
                int i31 = zzkr2.id;
                StringBuilder sb = new StringBuilder(215);
                sb.append("Inconsistent stbl box for track ");
                sb.append(i31);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i30);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i18);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i14);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i29);
                Log.w("AtomParsers", sb.toString());
            }
            j = j4;
            i3 = i15;
        } else {
            i4 = zzgu;
            zzkf zzkf4 = zzkf;
            long[] jArr4 = new long[zzkg.length];
            int[] iArr7 = new int[zzkg.length];
            while (zzkg.zzgx()) {
                jArr4[zzkg.index] = zzkg.zzavf;
                iArr7[zzkg.index] = zzkg.zzave;
            }
            int zzgv = zzkf4.zzgv();
            long j6 = (long) zzjc3;
            int i32 = 8192 / zzgv;
            int i33 = 0;
            for (int zzf : iArr7) {
                i33 += zzop.zzf(zzf, i32);
            }
            long[] jArr5 = new long[i33];
            int[] iArr8 = new int[i33];
            long[] jArr6 = new long[i33];
            int[] iArr9 = new int[i33];
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            int i37 = 0;
            while (i34 < iArr7.length) {
                int i38 = iArr7[i34];
                long j7 = jArr4[i34];
                int i39 = i35;
                int i40 = i37;
                while (i38 > 0) {
                    int min = Math.min(i32, i38);
                    jArr5[i36] = j7;
                    iArr8[i36] = zzgv * min;
                    i40 = Math.max(i40, iArr8[i36]);
                    jArr6[i36] = ((long) i39) * j6;
                    iArr9[i36] = 1;
                    j7 += (long) iArr8[i36];
                    i39 += min;
                    i38 -= min;
                    i36++;
                    jArr4 = jArr4;
                    iArr7 = iArr7;
                }
                long[] jArr7 = jArr4;
                int[] iArr10 = iArr7;
                i34++;
                i37 = i40;
                i35 = i39;
            }
            zzkl zzkl = new zzkl(jArr5, iArr8, i37, jArr6, iArr9);
            jArr2 = zzkl.zzanf;
            iArr = zzkl.zzane;
            int i41 = zzkl.zzavs;
            jArr = zzkl.zzavt;
            iArr2 = zzkl.zzavu;
            i3 = i41;
            j = 0;
        }
        if (zzkr2.zzaxp == null || zzjk.zzgq()) {
            zzop.zza(jArr, 1000000, zzkr2.zzcv);
            return new zzkt(jArr2, iArr, i3, jArr, iArr2);
        }
        if (zzkr2.zzaxp.length == 1 && zzkr2.type == 1 && jArr.length >= 2) {
            long j8 = zzkr2.zzaxq[0];
            long zza = zzop.zza(zzkr2.zzaxp[0], zzkr2.zzcv, zzkr2.zzaxm) + j8;
            if (jArr[0] <= j8 && j8 < jArr[1] && jArr[jArr.length - 1] < zza && zza <= j) {
                long j9 = j - zza;
                long zza2 = zzop.zza(j8 - jArr[0], (long) zzkr2.zzagi.zzafy, zzkr2.zzcv);
                long zza3 = zzop.zza(j9, (long) zzkr2.zzagi.zzafy, zzkr2.zzcv);
                if (!(zza2 == 0 && zza3 == 0) && zza2 <= 2147483647L && zza3 <= 2147483647L) {
                    int i42 = (int) zza2;
                    zzjk zzjk3 = zzjk;
                    zzjk3.zzaga = i42;
                    zzjk3.zzagb = (int) zza3;
                    zzop.zza(jArr, 1000000, zzkr2.zzcv);
                    return new zzkt(jArr2, iArr, i3, jArr, iArr2);
                }
            }
        }
        if (zzkr2.zzaxp.length == 1) {
            char c = 0;
            if (zzkr2.zzaxp[0] == 0) {
                int i43 = 0;
                while (i43 < jArr.length) {
                    jArr[i43] = zzop.zza(jArr[i43] - zzkr2.zzaxq[c], 1000000, zzkr2.zzcv);
                    i43++;
                    c = 0;
                }
                return new zzkt(jArr2, iArr, i3, jArr, iArr2);
            }
        }
        boolean z3 = zzkr2.type == 1;
        int i44 = 0;
        boolean z4 = false;
        int i45 = 0;
        int i46 = 0;
        while (i44 < zzkr2.zzaxp.length) {
            long j10 = zzkr2.zzaxq[i44];
            if (j10 != -1) {
                iArr6 = iArr;
                long zza4 = zzop.zza(zzkr2.zzaxp[i44], zzkr2.zzcv, zzkr2.zzaxm);
                int zzb = zzop.zzb(jArr, j10, true, true);
                int zzb2 = zzop.zzb(jArr, j10 + zza4, z3, false);
                i45 += zzb2 - zzb;
                z4 |= i46 != zzb;
                i46 = zzb2;
            } else {
                iArr6 = iArr;
            }
            i44++;
            iArr = iArr6;
        }
        int[] iArr11 = iArr;
        boolean z5 = (i45 != i4) | z4;
        long[] jArr8 = z5 ? new long[i45] : jArr2;
        int[] iArr12 = z5 ? new int[i45] : iArr11;
        if (z5) {
            i3 = 0;
        }
        int[] iArr13 = z5 ? new int[i45] : iArr2;
        long[] jArr9 = new long[i45];
        int i47 = i3;
        int i48 = 0;
        int i49 = 0;
        while (i48 < zzkr2.zzaxp.length) {
            long j11 = zzkr2.zzaxq[i48];
            long j12 = zzkr2.zzaxp[i48];
            if (j11 != -1) {
                long j13 = zzkr2.zzcv;
                int[] iArr14 = iArr13;
                i5 = i48;
                int zzb3 = zzop.zzb(jArr, j11, true, true);
                int zzb4 = zzop.zzb(jArr, zzop.zza(j12, j13, zzkr2.zzaxm) + j11, z3, false);
                if (z5) {
                    int i50 = zzb4 - zzb3;
                    System.arraycopy(jArr2, zzb3, jArr8, i49, i50);
                    iArr4 = iArr11;
                    System.arraycopy(iArr4, zzb3, iArr12, i49, i50);
                    z2 = z3;
                    iArr5 = iArr14;
                    System.arraycopy(iArr2, zzb3, iArr5, i49, i50);
                } else {
                    iArr4 = iArr11;
                    z2 = z3;
                    iArr5 = iArr14;
                }
                int i51 = i47;
                while (zzb3 < zzb4) {
                    long[] jArr10 = jArr2;
                    int[] iArr15 = iArr2;
                    long j14 = j11;
                    jArr9[i49] = zzop.zza(j2, 1000000, zzkr2.zzaxm) + zzop.zza(jArr[zzb3] - j11, 1000000, zzkr2.zzcv);
                    if (z5 && iArr12[i49] > i51) {
                        i51 = iArr4[zzb3];
                    }
                    i49++;
                    zzb3++;
                    jArr2 = jArr10;
                    j11 = j14;
                    iArr2 = iArr15;
                }
                jArr3 = jArr2;
                iArr3 = iArr2;
                i47 = i51;
            } else {
                iArr4 = iArr11;
                z2 = z3;
                jArr3 = jArr2;
                iArr3 = iArr2;
                iArr5 = iArr13;
                i5 = i48;
            }
            j2 += j12;
            i48 = i5 + 1;
            iArr13 = iArr5;
            jArr2 = jArr3;
            iArr2 = iArr3;
            z3 = z2;
            iArr11 = iArr4;
        }
        int[] iArr16 = iArr13;
        boolean z6 = false;
        for (int i52 = 0; i52 < iArr16.length && !z6; i52++) {
            z6 |= (iArr16[i52] & 1) != 0;
        }
        if (z6) {
            return new zzkt(jArr8, iArr12, i47, jArr9, iArr16);
        }
        throw new zzhc("The edited sample sequence does not contain a sync sample.");
    }

    public static zzlh zza(zzke zzke, boolean z) {
        if (z) {
            return null;
        }
        zzom zzom = zzke.zzavd;
        zzom.zzbh(8);
        while (zzom.zzix() >= 8) {
            int position = zzom.getPosition();
            int readInt = zzom.readInt();
            if (zzom.readInt() == zzkc.zzaui) {
                zzom.zzbh(position);
                int i = position + readInt;
                zzom.zzbi(12);
                while (true) {
                    if (zzom.getPosition() >= i) {
                        break;
                    }
                    int position2 = zzom.getPosition();
                    int readInt2 = zzom.readInt();
                    if (zzom.readInt() == zzkc.zzauj) {
                        zzom.zzbh(position2);
                        int i2 = position2 + readInt2;
                        zzom.zzbi(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzom.getPosition() < i2) {
                            zzlh.zza zzd = zzko.zzd(zzom);
                            if (zzd != null) {
                                arrayList.add(zzd);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new zzlh((List<? extends zzlh.zza>) arrayList);
                        }
                    } else {
                        zzom.zzbi(readInt2 - 8);
                    }
                }
                return null;
            }
            zzom.zzbi(readInt - 8);
        }
        return null;
    }

    private static Pair<String, byte[]> zzb(zzom zzom, int i) {
        zzom.zzbh(i + 8 + 4);
        zzom.zzbi(1);
        zzc(zzom);
        zzom.zzbi(2);
        int readUnsignedByte = zzom.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            zzom.zzbi(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            zzom.zzbi(zzom.readUnsignedShort());
        }
        if ((readUnsignedByte & 32) != 0) {
            zzom.zzbi(2);
        }
        zzom.zzbi(1);
        zzc(zzom);
        int readUnsignedByte2 = zzom.readUnsignedByte();
        String str = null;
        if (readUnsignedByte2 == 32) {
            str = "video/mp4v-es";
        } else if (readUnsignedByte2 == 33) {
            str = "video/avc";
        } else if (readUnsignedByte2 != 35) {
            if (readUnsignedByte2 != 64) {
                if (readUnsignedByte2 == 107) {
                    return Pair.create("audio/mpeg", (Object) null);
                }
                if (readUnsignedByte2 == 165) {
                    str = "audio/ac3";
                } else if (readUnsignedByte2 != 166) {
                    switch (readUnsignedByte2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (readUnsignedByte2) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", (Object) null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", (Object) null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        zzom.zzbi(12);
        zzom.zzbi(1);
        int zzc = zzc(zzom);
        byte[] bArr = new byte[zzc];
        zzom.zze(bArr, 0, zzc);
        return Pair.create(str, bArr);
    }

    private static int zza(zzom zzom, int i, int i2, zzki zzki, int i3) {
        zzku zzku;
        zzom zzom2 = zzom;
        int position = zzom.getPosition();
        while (true) {
            boolean z = false;
            if (position - i >= i2) {
                return 0;
            }
            zzom.zzbh(position);
            int readInt = zzom.readInt();
            zzob.checkArgument(readInt > 0, "childAtomSize should be positive");
            if (zzom.readInt() == zzkc.zzatc) {
                int i4 = position + 8;
                Pair pair = null;
                Integer num = null;
                zzku zzku2 = null;
                boolean z2 = false;
                while (i4 - position < readInt) {
                    zzom.zzbh(i4);
                    int readInt2 = zzom.readInt();
                    int readInt3 = zzom.readInt();
                    if (readInt3 == zzkc.zzati) {
                        num = Integer.valueOf(zzom.readInt());
                    } else if (readInt3 == zzkc.zzatd) {
                        zzom.zzbi(4);
                        z2 = zzom.readInt() == zzavc;
                    } else if (readInt3 == zzkc.zzate) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= readInt2) {
                                zzku = null;
                                break;
                            }
                            zzom.zzbh(i5);
                            int readInt4 = zzom.readInt();
                            if (zzom.readInt() == zzkc.zzatf) {
                                zzom.zzbi(6);
                                boolean z3 = zzom.readUnsignedByte() == 1;
                                int readUnsignedByte = zzom.readUnsignedByte();
                                byte[] bArr = new byte[16];
                                zzom.zze(bArr, 0, 16);
                                zzku = new zzku(z3, readUnsignedByte, bArr);
                            } else {
                                i5 += readInt4;
                            }
                        }
                        zzku2 = zzku;
                    }
                    i4 += readInt2;
                }
                if (z2) {
                    zzob.checkArgument(num != null, "frma atom is mandatory");
                    if (zzku2 != null) {
                        z = true;
                    }
                    zzob.checkArgument(z, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, zzku2);
                }
                if (pair != null) {
                    zzki.zzavn[i3] = (zzku) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            zzki zzki2 = zzki;
            position += readInt;
        }
    }

    private static int zzc(zzom zzom) {
        int readUnsignedByte = zzom.readUnsignedByte();
        int i = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = zzom.readUnsignedByte();
            i = (i << 7) | (readUnsignedByte & 127);
        }
        return i;
    }
}
