package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzjx {
    public int height;
    public int number;
    public int type;
    public int width;
    public zziu zzafq;
    public int zzafu;
    public byte[] zzafv;
    public int zzafx;
    public int zzafy;
    /* access modifiers changed from: private */
    public String zzage;
    public String zzapv;
    public int zzapw;
    public boolean zzapx;
    public byte[] zzapy;
    public zzjq zzapz;
    public byte[] zzaqa;
    public int zzaqb;
    public int zzaqc;
    public int zzaqd;
    public boolean zzaqe;
    public int zzaqf;
    public int zzaqg;
    public int zzaqh;
    public int zzaqi;
    public int zzaqj;
    public float zzaqk;
    public float zzaql;
    public float zzaqm;
    public float zzaqn;
    public float zzaqo;
    public float zzaqp;
    public float zzaqq;
    public float zzaqr;
    public float zzaqs;
    public float zzaqt;
    public int zzaqu;
    public long zzaqv;
    public long zzaqw;
    public boolean zzaqx;
    public boolean zzaqy;
    public zzjn zzaqz;
    public int zzara;

    private zzjx() {
        this.width = -1;
        this.height = -1;
        this.zzaqb = -1;
        this.zzaqc = -1;
        this.zzaqd = 0;
        this.zzafv = null;
        this.zzafu = -1;
        this.zzaqe = false;
        this.zzaqf = -1;
        this.zzaqg = -1;
        this.zzaqh = -1;
        this.zzaqi = 1000;
        this.zzaqj = 200;
        this.zzaqk = -1.0f;
        this.zzaql = -1.0f;
        this.zzaqm = -1.0f;
        this.zzaqn = -1.0f;
        this.zzaqo = -1.0f;
        this.zzaqp = -1.0f;
        this.zzaqq = -1.0f;
        this.zzaqr = -1.0f;
        this.zzaqs = -1.0f;
        this.zzaqt = -1.0f;
        this.zzafx = 1;
        this.zzaqu = -1;
        this.zzafy = 8000;
        this.zzaqv = 0;
        this.zzaqw = 0;
        this.zzaqy = true;
        this.zzage = "eng";
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0243, code lost:
        r15 = r2;
        r1 = null;
        r18 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02ea, code lost:
        r15 = r1;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0303, code lost:
        r15 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0304, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0305, code lost:
        r18 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0307, code lost:
        r21 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0309, code lost:
        r2 = r0.zzaqy | false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x030e, code lost:
        if (r0.zzaqx == false) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0310, code lost:
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0312, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0313, code lost:
        r2 = r2 | r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0318, code lost:
        if (com.google.android.gms.internal.ads.zzoi.zzbi(r15) == false) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x031a, code lost:
        r1 = com.google.android.gms.internal.ads.zzgz.zza(java.lang.Integer.toString(r31), r15, (java.lang.String) null, -1, r18, r0.zzafx, r0.zzafy, r21, r1, r0.zzafq, r2 ? 1 : 0, r0.zzage);
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0341, code lost:
        if (com.google.android.gms.internal.ads.zzoi.zzbj(r15) == false) goto L_0x0466;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0345, code lost:
        if (r0.zzaqd != 0) goto L_0x0357;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0347, code lost:
        r2 = r0.zzaqb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0349, code lost:
        if (r2 != -1) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x034b, code lost:
        r2 = r0.width;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x034d, code lost:
        r0.zzaqb = r2;
        r2 = r0.zzaqc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0351, code lost:
        if (r2 != -1) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0353, code lost:
        r2 = r0.height;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0355, code lost:
        r0.zzaqc = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0357, code lost:
        r2 = r0.zzaqb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x035b, code lost:
        if (r2 == -1) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x035d, code lost:
        r4 = r0.zzaqc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x035f, code lost:
        if (r4 == -1) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0361, code lost:
        r24 = ((float) (r0.height * r2)) / ((float) (r0.width * r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x036f, code lost:
        r24 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0373, code lost:
        if (r0.zzaqe == false) goto L_0x043c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0379, code lost:
        if (r0.zzaqk == -1.0f) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x037f, code lost:
        if (r0.zzaql == -1.0f) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0385, code lost:
        if (r0.zzaqm == -1.0f) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x038b, code lost:
        if (r0.zzaqn == -1.0f) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0391, code lost:
        if (r0.zzaqo == -1.0f) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0397, code lost:
        if (r0.zzaqp == -1.0f) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x039d, code lost:
        if (r0.zzaqq == -1.0f) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03a3, code lost:
        if (r0.zzaqr == -1.0f) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03a9, code lost:
        if (r0.zzaqs == -1.0f) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03af, code lost:
        if (r0.zzaqt != -1.0f) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03b2, code lost:
        r13 = new byte[25];
        r2 = java.nio.ByteBuffer.wrap(r13);
        r2.put((byte) 0);
        r2.putShort((short) ((int) ((r0.zzaqk * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) ((r0.zzaql * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) ((r0.zzaqm * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) ((r0.zzaqn * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) ((r0.zzaqo * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) ((r0.zzaqp * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) ((r0.zzaqq * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) ((r0.zzaqr * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) (r0.zzaqs + 0.5f)));
        r2.putShort((short) ((int) (r0.zzaqt + 0.5f)));
        r2.putShort((short) r0.zzaqi);
        r2.putShort((short) r0.zzaqj);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x042e, code lost:
        r27 = new com.google.android.gms.internal.ads.zzou(r0.zzaqf, r0.zzaqh, r0.zzaqg, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x043c, code lost:
        r27 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x043e, code lost:
        r1 = com.google.android.gms.internal.ads.zzgz.zza(java.lang.Integer.toString(r31), r15, (java.lang.String) null, -1, r18, r0.width, r0.height, -1.0f, r1, -1, r24, r0.zzafv, r0.zzafu, r27, r0.zzafq);
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x046c, code lost:
        if ("application/x-subrip".equals(r15) == false) goto L_0x0485;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x046e, code lost:
        r1 = com.google.android.gms.internal.ads.zzgz.zza(java.lang.Integer.toString(r31), r15, (java.lang.String) null, -1, r2 ? 1 : 0, r0.zzage, r0.zzafq);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x048b, code lost:
        if ("application/vobsub".equals(r15) != false) goto L_0x04a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0493, code lost:
        if ("application/pgs".equals(r15) != false) goto L_0x04a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x049b, code lost:
        if ("application/dvbsubs".equals(r15) == false) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04a5, code lost:
        throw new com.google.android.gms.internal.ads.zzhc("Unexpected MIME type.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04a6, code lost:
        r1 = com.google.android.gms.internal.ads.zzgz.zza(java.lang.Integer.toString(r31), r15, (java.lang.String) null, -1, r1, r0.zzage, r0.zzafq);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04bc, code lost:
        r0.zzaqz = r30.zzc(r0.number, r7);
        r0.zzaqz.zze(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04cb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c5, code lost:
        r15 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01c8, code lost:
        r21 = r1;
        r15 = "audio/raw";
        r1 = null;
        r18 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzji r30, int r31) throws com.google.android.gms.internal.ads.zzhc {
        /*
            r29 = this;
            r0 = r29
            java.lang.String r1 = r0.zzapv
            int r2 = r1.hashCode()
            r3 = 8
            r4 = 1
            r5 = 2
            r6 = 0
            r7 = 3
            r8 = -1
            switch(r2) {
                case -2095576542: goto L_0x0149;
                case -2095575984: goto L_0x013f;
                case -1985379776: goto L_0x0134;
                case -1784763192: goto L_0x0129;
                case -1730367663: goto L_0x011e;
                case -1482641358: goto L_0x0113;
                case -1482641357: goto L_0x0108;
                case -1373388978: goto L_0x00fd;
                case -933872740: goto L_0x00f2;
                case -538363189: goto L_0x00e7;
                case -538363109: goto L_0x00dc;
                case -425012669: goto L_0x00d0;
                case -356037306: goto L_0x00c4;
                case 62923557: goto L_0x00b8;
                case 62923603: goto L_0x00ac;
                case 62927045: goto L_0x00a0;
                case 82338133: goto L_0x0095;
                case 82338134: goto L_0x008a;
                case 99146302: goto L_0x007e;
                case 444813526: goto L_0x0072;
                case 542569478: goto L_0x0066;
                case 725957860: goto L_0x005a;
                case 855502857: goto L_0x004f;
                case 1422270023: goto L_0x0043;
                case 1809237540: goto L_0x0038;
                case 1950749482: goto L_0x002c;
                case 1950789798: goto L_0x0020;
                case 1951062397: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0153
        L_0x0014:
            java.lang.String r2 = "A_OPUS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 11
            goto L_0x0154
        L_0x0020:
            java.lang.String r2 = "A_FLAC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 21
            goto L_0x0154
        L_0x002c:
            java.lang.String r2 = "A_EAC3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 16
            goto L_0x0154
        L_0x0038:
            java.lang.String r2 = "V_MPEG2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 2
            goto L_0x0154
        L_0x0043:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 24
            goto L_0x0154
        L_0x004f:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 7
            goto L_0x0154
        L_0x005a:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 23
            goto L_0x0154
        L_0x0066:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 19
            goto L_0x0154
        L_0x0072:
            java.lang.String r2 = "V_THEORA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 9
            goto L_0x0154
        L_0x007e:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 26
            goto L_0x0154
        L_0x008a:
            java.lang.String r2 = "V_VP9"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 1
            goto L_0x0154
        L_0x0095:
            java.lang.String r2 = "V_VP8"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 0
            goto L_0x0154
        L_0x00a0:
            java.lang.String r2 = "A_DTS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 18
            goto L_0x0154
        L_0x00ac:
            java.lang.String r2 = "A_AC3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 15
            goto L_0x0154
        L_0x00b8:
            java.lang.String r2 = "A_AAC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 12
            goto L_0x0154
        L_0x00c4:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 20
            goto L_0x0154
        L_0x00d0:
            java.lang.String r2 = "S_VOBSUB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 25
            goto L_0x0154
        L_0x00dc:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 6
            goto L_0x0154
        L_0x00e7:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 4
            goto L_0x0154
        L_0x00f2:
            java.lang.String r2 = "S_DVBSUB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 27
            goto L_0x0154
        L_0x00fd:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 8
            goto L_0x0154
        L_0x0108:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 14
            goto L_0x0154
        L_0x0113:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 13
            goto L_0x0154
        L_0x011e:
            java.lang.String r2 = "A_VORBIS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 10
            goto L_0x0154
        L_0x0129:
            java.lang.String r2 = "A_TRUEHD"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 17
            goto L_0x0154
        L_0x0134:
            java.lang.String r2 = "A_MS/ACM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 22
            goto L_0x0154
        L_0x013f:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 3
            goto L_0x0154
        L_0x0149:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 5
            goto L_0x0154
        L_0x0153:
            r1 = -1
        L_0x0154:
            java.lang.String r2 = "audio/raw"
            r9 = 4096(0x1000, float:5.74E-42)
            java.lang.String r10 = "video/x-unknown"
            java.lang.String r11 = "audio/x-unknown"
            java.lang.String r12 = "MatroskaExtractor"
            r13 = 0
            switch(r1) {
                case 0: goto L_0x0301;
                case 1: goto L_0x02fe;
                case 2: goto L_0x02fb;
                case 3: goto L_0x02ed;
                case 4: goto L_0x02ed;
                case 5: goto L_0x02ed;
                case 6: goto L_0x02d7;
                case 7: goto L_0x02c3;
                case 8: goto L_0x02ac;
                case 9: goto L_0x02aa;
                case 10: goto L_0x029a;
                case 11: goto L_0x0254;
                case 12: goto L_0x0249;
                case 13: goto L_0x0241;
                case 14: goto L_0x023e;
                case 15: goto L_0x023a;
                case 16: goto L_0x0236;
                case 17: goto L_0x0232;
                case 18: goto L_0x022e;
                case 19: goto L_0x022e;
                case 20: goto L_0x022a;
                case 21: goto L_0x0221;
                case 22: goto L_0x01d0;
                case 23: goto L_0x0199;
                case 24: goto L_0x0195;
                case 25: goto L_0x018b;
                case 26: goto L_0x0187;
                case 27: goto L_0x016a;
                default: goto L_0x0162;
            }
        L_0x0162:
            com.google.android.gms.internal.ads.zzhc r1 = new com.google.android.gms.internal.ads.zzhc
            java.lang.String r2 = "Unrecognized codec identifier."
            r1.<init>(r2)
            throw r1
        L_0x016a:
            r1 = 4
            byte[] r1 = new byte[r1]
            byte[] r2 = r0.zzaqa
            byte r3 = r2[r6]
            r1[r6] = r3
            byte r3 = r2[r4]
            r1[r4] = r3
            byte r3 = r2[r5]
            r1[r5] = r3
            byte r2 = r2[r7]
            r1[r7] = r2
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r2 = "application/dvbsubs"
            goto L_0x0251
        L_0x0187:
            java.lang.String r2 = "application/pgs"
            goto L_0x0303
        L_0x018b:
            byte[] r1 = r0.zzaqa
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r2 = "application/vobsub"
            goto L_0x0251
        L_0x0195:
            java.lang.String r2 = "application/x-subrip"
            goto L_0x0303
        L_0x0199:
            int r1 = r0.zzaqu
            int r1 = com.google.android.gms.internal.ads.zzop.zzbk(r1)
            if (r1 != 0) goto L_0x01c8
            int r1 = r0.zzaqu
            int r2 = r11.length()
            int r2 = r2 + 60
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unsupported PCM bit depth: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = ". Setting mimeType to "
            r3.append(r1)
            r3.append(r11)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r12, r1)
        L_0x01c5:
            r15 = r11
            goto L_0x0304
        L_0x01c8:
            r21 = r1
            r15 = r2
            r1 = r13
            r18 = -1
            goto L_0x0309
        L_0x01d0:
            com.google.android.gms.internal.ads.zzom r1 = new com.google.android.gms.internal.ads.zzom
            byte[] r3 = r0.zzaqa
            r1.<init>((byte[]) r3)
            boolean r1 = zzb(r1)
            if (r1 == 0) goto L_0x020a
            int r1 = r0.zzaqu
            int r1 = com.google.android.gms.internal.ads.zzop.zzbk(r1)
            if (r1 != 0) goto L_0x01c8
            int r1 = r0.zzaqu
            int r2 = r11.length()
            int r2 = r2 + 60
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unsupported PCM bit depth: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = ". Setting mimeType to "
            r3.append(r1)
            r3.append(r11)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r12, r1)
            goto L_0x01c5
        L_0x020a:
            java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
            int r2 = r11.length()
            if (r2 == 0) goto L_0x0217
            java.lang.String r1 = r1.concat(r11)
            goto L_0x021d
        L_0x0217:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x021d:
            android.util.Log.w(r12, r1)
            goto L_0x01c5
        L_0x0221:
            byte[] r1 = r0.zzaqa
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r2 = "audio/x-flac"
            goto L_0x0251
        L_0x022a:
            java.lang.String r2 = "audio/vnd.dts.hd"
            goto L_0x0303
        L_0x022e:
            java.lang.String r2 = "audio/vnd.dts"
            goto L_0x0303
        L_0x0232:
            java.lang.String r2 = "audio/true-hd"
            goto L_0x0303
        L_0x0236:
            java.lang.String r2 = "audio/eac3"
            goto L_0x0303
        L_0x023a:
            java.lang.String r2 = "audio/ac3"
            goto L_0x0303
        L_0x023e:
            java.lang.String r2 = "audio/mpeg"
            goto L_0x0243
        L_0x0241:
            java.lang.String r2 = "audio/mpeg-L2"
        L_0x0243:
            r15 = r2
            r1 = r13
            r18 = 4096(0x1000, float:5.74E-42)
            goto L_0x0307
        L_0x0249:
            byte[] r1 = r0.zzaqa
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r2 = "audio/mp4a-latm"
        L_0x0251:
            r15 = r2
            goto L_0x0305
        L_0x0254:
            r1 = 5760(0x1680, float:8.071E-42)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r7)
            byte[] r9 = r0.zzaqa
            r2.add(r9)
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.allocate(r3)
            java.nio.ByteOrder r10 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r9 = r9.order(r10)
            long r10 = r0.zzaqv
            java.nio.ByteBuffer r9 = r9.putLong(r10)
            byte[] r9 = r9.array()
            r2.add(r9)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            java.nio.ByteOrder r9 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r3 = r3.order(r9)
            long r9 = r0.zzaqw
            java.nio.ByteBuffer r3 = r3.putLong(r9)
            byte[] r3 = r3.array()
            r2.add(r3)
            java.lang.String r3 = "audio/opus"
            r1 = r2
            r15 = r3
            r18 = 5760(0x1680, float:8.071E-42)
            goto L_0x0307
        L_0x029a:
            r1 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = r0.zzaqa
            java.util.List r2 = zzd(r2)
            java.lang.String r3 = "audio/vorbis"
            r1 = r2
            r15 = r3
            r18 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0307
        L_0x02aa:
            r15 = r10
            goto L_0x0304
        L_0x02ac:
            com.google.android.gms.internal.ads.zzom r1 = new com.google.android.gms.internal.ads.zzom
            byte[] r2 = r0.zzaqa
            r1.<init>((byte[]) r2)
            java.util.List r1 = zza(r1)
            if (r1 == 0) goto L_0x02bc
            java.lang.String r2 = "video/wvc1"
            goto L_0x0251
        L_0x02bc:
            java.lang.String r2 = "Unsupported FourCC. Setting mimeType to video/x-unknown"
            android.util.Log.w(r12, r2)
            r15 = r10
            goto L_0x0305
        L_0x02c3:
            com.google.android.gms.internal.ads.zzom r1 = new com.google.android.gms.internal.ads.zzom
            byte[] r2 = r0.zzaqa
            r1.<init>((byte[]) r2)
            com.google.android.gms.internal.ads.zzox r1 = com.google.android.gms.internal.ads.zzox.zzh(r1)
            java.util.List<byte[]> r2 = r1.zzafp
            int r1 = r1.zzara
            r0.zzara = r1
            java.lang.String r1 = "video/hevc"
            goto L_0x02ea
        L_0x02d7:
            com.google.android.gms.internal.ads.zzom r1 = new com.google.android.gms.internal.ads.zzom
            byte[] r2 = r0.zzaqa
            r1.<init>((byte[]) r2)
            com.google.android.gms.internal.ads.zzor r1 = com.google.android.gms.internal.ads.zzor.zzf(r1)
            java.util.List<byte[]> r2 = r1.zzafp
            int r1 = r1.zzara
            r0.zzara = r1
            java.lang.String r1 = "video/avc"
        L_0x02ea:
            r15 = r1
            r1 = r2
            goto L_0x0305
        L_0x02ed:
            byte[] r1 = r0.zzaqa
            if (r1 != 0) goto L_0x02f3
            r1 = r13
            goto L_0x02f7
        L_0x02f3:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x02f7:
            java.lang.String r2 = "video/mp4v-es"
            goto L_0x0251
        L_0x02fb:
            java.lang.String r2 = "video/mpeg2"
            goto L_0x0303
        L_0x02fe:
            java.lang.String r2 = "video/x-vnd.on2.vp9"
            goto L_0x0303
        L_0x0301:
            java.lang.String r2 = "video/x-vnd.on2.vp8"
        L_0x0303:
            r15 = r2
        L_0x0304:
            r1 = r13
        L_0x0305:
            r18 = -1
        L_0x0307:
            r21 = -1
        L_0x0309:
            boolean r2 = r0.zzaqy
            r2 = r2 | r6
            boolean r3 = r0.zzaqx
            if (r3 == 0) goto L_0x0312
            r3 = 2
            goto L_0x0313
        L_0x0312:
            r3 = 0
        L_0x0313:
            r2 = r2 | r3
            boolean r3 = com.google.android.gms.internal.ads.zzoi.zzbi(r15)
            if (r3 == 0) goto L_0x033d
            java.lang.String r14 = java.lang.Integer.toString(r31)
            r16 = 0
            r17 = -1
            int r3 = r0.zzafx
            int r5 = r0.zzafy
            com.google.android.gms.internal.ads.zziu r6 = r0.zzafq
            java.lang.String r7 = r0.zzage
            r19 = r3
            r20 = r5
            r22 = r1
            r23 = r6
            r24 = r2
            r25 = r7
            com.google.android.gms.internal.ads.zzgz r1 = com.google.android.gms.internal.ads.zzgz.zza(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r7 = 1
            goto L_0x04bc
        L_0x033d:
            boolean r3 = com.google.android.gms.internal.ads.zzoi.zzbj(r15)
            if (r3 == 0) goto L_0x0466
            int r2 = r0.zzaqd
            if (r2 != 0) goto L_0x0357
            int r2 = r0.zzaqb
            if (r2 != r8) goto L_0x034d
            int r2 = r0.width
        L_0x034d:
            r0.zzaqb = r2
            int r2 = r0.zzaqc
            if (r2 != r8) goto L_0x0355
            int r2 = r0.height
        L_0x0355:
            r0.zzaqc = r2
        L_0x0357:
            int r2 = r0.zzaqb
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == r8) goto L_0x036f
            int r4 = r0.zzaqc
            if (r4 == r8) goto L_0x036f
            int r7 = r0.height
            int r7 = r7 * r2
            float r2 = (float) r7
            int r7 = r0.width
            int r7 = r7 * r4
            float r4 = (float) r7
            float r2 = r2 / r4
            r24 = r2
            goto L_0x0371
        L_0x036f:
            r24 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0371:
            boolean r2 = r0.zzaqe
            if (r2 == 0) goto L_0x043c
            float r2 = r0.zzaqk
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x042e
            float r2 = r0.zzaql
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x042e
            float r2 = r0.zzaqm
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x042e
            float r2 = r0.zzaqn
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x042e
            float r2 = r0.zzaqo
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x042e
            float r2 = r0.zzaqp
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x042e
            float r2 = r0.zzaqq
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x042e
            float r2 = r0.zzaqr
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x042e
            float r2 = r0.zzaqs
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x042e
            float r2 = r0.zzaqt
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x03b2
            goto L_0x042e
        L_0x03b2:
            r2 = 25
            byte[] r13 = new byte[r2]
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r13)
            r2.put(r6)
            float r3 = r0.zzaqk
            r4 = 1195593728(0x47435000, float:50000.0)
            float r3 = r3 * r4
            r6 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r6
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r0.zzaql
            float r3 = r3 * r4
            float r3 = r3 + r6
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r0.zzaqm
            float r3 = r3 * r4
            float r3 = r3 + r6
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r0.zzaqn
            float r3 = r3 * r4
            float r3 = r3 + r6
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r0.zzaqo
            float r3 = r3 * r4
            float r3 = r3 + r6
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r0.zzaqp
            float r3 = r3 * r4
            float r3 = r3 + r6
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r0.zzaqq
            float r3 = r3 * r4
            float r3 = r3 + r6
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r0.zzaqr
            float r3 = r3 * r4
            float r3 = r3 + r6
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r0.zzaqs
            float r3 = r3 + r6
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r0.zzaqt
            float r3 = r3 + r6
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            int r3 = r0.zzaqi
            short r3 = (short) r3
            r2.putShort(r3)
            int r3 = r0.zzaqj
            short r3 = (short) r3
            r2.putShort(r3)
        L_0x042e:
            com.google.android.gms.internal.ads.zzou r2 = new com.google.android.gms.internal.ads.zzou
            int r3 = r0.zzaqf
            int r4 = r0.zzaqh
            int r6 = r0.zzaqg
            r2.<init>(r3, r4, r6, r13)
            r27 = r2
            goto L_0x043e
        L_0x043c:
            r27 = r13
        L_0x043e:
            java.lang.String r14 = java.lang.Integer.toString(r31)
            r16 = 0
            r17 = -1
            int r2 = r0.width
            int r3 = r0.height
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
            r23 = -1
            byte[] r4 = r0.zzafv
            int r6 = r0.zzafu
            com.google.android.gms.internal.ads.zziu r7 = r0.zzafq
            r19 = r2
            r20 = r3
            r22 = r1
            r25 = r4
            r26 = r6
            r28 = r7
            com.google.android.gms.internal.ads.zzgz r1 = com.google.android.gms.internal.ads.zzgz.zza(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r7 = 2
            goto L_0x04bc
        L_0x0466:
            java.lang.String r3 = "application/x-subrip"
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x0485
            java.lang.String r14 = java.lang.Integer.toString(r31)
            r16 = 0
            r17 = -1
            java.lang.String r1 = r0.zzage
            com.google.android.gms.internal.ads.zziu r3 = r0.zzafq
            r18 = r2
            r19 = r1
            r20 = r3
            com.google.android.gms.internal.ads.zzgz r1 = com.google.android.gms.internal.ads.zzgz.zza((java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16, (int) r17, (int) r18, (java.lang.String) r19, (com.google.android.gms.internal.ads.zziu) r20)
            goto L_0x04bc
        L_0x0485:
            java.lang.String r2 = "application/vobsub"
            boolean r2 = r2.equals(r15)
            if (r2 != 0) goto L_0x04a6
            java.lang.String r2 = "application/pgs"
            boolean r2 = r2.equals(r15)
            if (r2 != 0) goto L_0x04a6
            java.lang.String r2 = "application/dvbsubs"
            boolean r2 = r2.equals(r15)
            if (r2 == 0) goto L_0x049e
            goto L_0x04a6
        L_0x049e:
            com.google.android.gms.internal.ads.zzhc r1 = new com.google.android.gms.internal.ads.zzhc
            java.lang.String r2 = "Unexpected MIME type."
            r1.<init>(r2)
            throw r1
        L_0x04a6:
            java.lang.String r14 = java.lang.Integer.toString(r31)
            r16 = 0
            r17 = -1
            java.lang.String r2 = r0.zzage
            com.google.android.gms.internal.ads.zziu r3 = r0.zzafq
            r18 = r1
            r19 = r2
            r20 = r3
            com.google.android.gms.internal.ads.zzgz r1 = com.google.android.gms.internal.ads.zzgz.zza((java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16, (int) r17, (java.util.List<byte[]>) r18, (java.lang.String) r19, (com.google.android.gms.internal.ads.zziu) r20)
        L_0x04bc:
            int r2 = r0.number
            r3 = r30
            com.google.android.gms.internal.ads.zzjn r2 = r3.zzc(r2, r7)
            r0.zzaqz = r2
            com.google.android.gms.internal.ads.zzjn r2 = r0.zzaqz
            r2.zze(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjx.zza(com.google.android.gms.internal.ads.zzji, int):void");
    }

    private static List<byte[]> zza(zzom zzom) throws zzhc {
        try {
            zzom.zzbi(16);
            if (zzom.zzja() != 826496599) {
                return null;
            }
            byte[] bArr = zzom.data;
            for (int position = zzom.getPosition() + 20; position < bArr.length - 4; position++) {
                if (bArr[position] == 0 && bArr[position + 1] == 0 && bArr[position + 2] == 1 && bArr[position + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, position, bArr.length));
                }
            }
            throw new zzhc("Failed to find FourCC VC1 initialization data");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzhc("Error parsing FourCC VC1 codec private");
        }
    }

    private static List<byte[]> zzd(byte[] bArr) throws zzhc {
        try {
            if (bArr[0] == 2) {
                int i = 1;
                int i2 = 0;
                while (bArr[i] == -1) {
                    i2 += 255;
                    i++;
                }
                int i3 = i + 1;
                int i4 = i2 + bArr[i];
                int i5 = 0;
                while (bArr[i3] == -1) {
                    i5 += 255;
                    i3++;
                }
                int i6 = i3 + 1;
                int i7 = i5 + bArr[i3];
                if (bArr[i6] == 1) {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(bArr, i6, bArr2, 0, i4);
                    int i8 = i6 + i4;
                    if (bArr[i8] == 3) {
                        int i9 = i8 + i7;
                        if (bArr[i9] == 5) {
                            byte[] bArr3 = new byte[(bArr.length - i9)];
                            System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new zzhc("Error parsing vorbis codec private");
                    }
                    throw new zzhc("Error parsing vorbis codec private");
                }
                throw new zzhc("Error parsing vorbis codec private");
            }
            throw new zzhc("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzhc("Error parsing vorbis codec private");
        }
    }

    private static boolean zzb(zzom zzom) throws zzhc {
        try {
            int zziy = zzom.zziy();
            if (zziy == 1) {
                return true;
            }
            if (zziy == 65534) {
                zzom.zzbh(24);
                return zzom.readLong() == zzjw.zzanx.getMostSignificantBits() && zzom.readLong() == zzjw.zzanx.getLeastSignificantBits();
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzhc("Error parsing MS/ACM codec private");
        }
    }

    /* synthetic */ zzjx(zzjv zzjv) {
        this();
    }
}
