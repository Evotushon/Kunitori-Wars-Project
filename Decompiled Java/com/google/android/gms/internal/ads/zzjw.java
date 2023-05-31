package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zziu;
import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzjw implements zzjg {
    private static final zzjh zzanu = new zzjv();
    private static final byte[] zzanv = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzanw = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */
    public static final UUID zzanx = new UUID(72057594037932032L, -9223371306706625679L);
    private long zzagy;
    private final zzjz zzanm;
    private final zzju zzany;
    private final SparseArray<zzjx> zzanz;
    private final boolean zzaoa;
    private final zzom zzaob;
    private final zzom zzaoc;
    private final zzom zzaod;
    private final zzom zzaoe;
    private final zzom zzaof;
    private final zzom zzaog;
    private final zzom zzaoh;
    private final zzom zzaoi;
    private final zzom zzaoj;
    private ByteBuffer zzaok;
    private long zzaol;
    private long zzaom;
    private long zzaon;
    private long zzaoo;
    private zzjx zzaop;
    private boolean zzaoq;
    private int zzaor;
    private long zzaos;
    private boolean zzaot;
    private long zzaou;
    private long zzaov;
    private long zzaow;
    private zzog zzaox;
    private zzog zzaoy;
    private boolean zzaoz;
    private int zzapa;
    private long zzapb;
    private long zzapc;
    private int zzapd;
    private int zzape;
    private int[] zzapf;
    private int zzapg;
    private int zzaph;
    private int zzapi;
    private int zzapj;
    private boolean zzapk;
    private boolean zzapl;
    private boolean zzapm;
    private boolean zzapn;
    private byte zzapo;
    private int zzapp;
    private int zzapq;
    private int zzapr;
    private boolean zzaps;
    private boolean zzapt;
    private zzji zzapu;

    public zzjw() {
        this(0);
    }

    static int zzah(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /*17026*/:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    static boolean zzai(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    public final void release() {
    }

    private zzjw(int i) {
        this(new zzjp(), 0);
    }

    private zzjw(zzju zzju, int i) {
        this.zzaom = -1;
        this.zzaon = -9223372036854775807L;
        this.zzaoo = -9223372036854775807L;
        this.zzagy = -9223372036854775807L;
        this.zzaou = -1;
        this.zzaov = -1;
        this.zzaow = -9223372036854775807L;
        this.zzany = zzju;
        this.zzany.zza(new zzjy(this, (zzjv) null));
        this.zzaoa = true;
        this.zzanm = new zzjz();
        this.zzanz = new SparseArray<>();
        this.zzaod = new zzom(4);
        this.zzaoe = new zzom(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzaof = new zzom(4);
        this.zzaob = new zzom(zzoh.zzbgi);
        this.zzaoc = new zzom(4);
        this.zzaog = new zzom();
        this.zzaoh = new zzom();
        this.zzaoi = new zzom(8);
        this.zzaoj = new zzom();
    }

    public final boolean zza(zzjf zzjf) throws IOException, InterruptedException {
        return new zzka().zza(zzjf);
    }

    public final void zza(zzji zzji) {
        this.zzapu = zzji;
    }

    public final void zzc(long j, long j2) {
        this.zzaow = -9223372036854775807L;
        this.zzapa = 0;
        this.zzany.reset();
        this.zzanm.reset();
        zzgr();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0039 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0005 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzjf r9, com.google.android.gms.internal.ads.zzjm r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.zzaps = r0
            r1 = 1
            r2 = 1
        L_0x0005:
            if (r2 == 0) goto L_0x003a
            boolean r3 = r8.zzaps
            if (r3 != 0) goto L_0x003a
            com.google.android.gms.internal.ads.zzju r2 = r8.zzany
            boolean r2 = r2.zzb(r9)
            if (r2 == 0) goto L_0x0005
            long r3 = r9.getPosition()
            boolean r5 = r8.zzaot
            if (r5 == 0) goto L_0x0025
            r8.zzaov = r3
            long r3 = r8.zzaou
            r10.zzana = r3
            r8.zzaot = r0
        L_0x0023:
            r3 = 1
            goto L_0x0037
        L_0x0025:
            boolean r3 = r8.zzaoq
            if (r3 == 0) goto L_0x0036
            long r3 = r8.zzaov
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0036
            r10.zzana = r3
            r8.zzaov = r5
            goto L_0x0023
        L_0x0036:
            r3 = 0
        L_0x0037:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003a:
            if (r2 == 0) goto L_0x003d
            return r0
        L_0x003d:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjw.zza(com.google.android.gms.internal.ads.zzjf, com.google.android.gms.internal.ads.zzjm):int");
    }

    /* access modifiers changed from: package-private */
    public final void zzd(int i, long j, long j2) throws zzhc {
        if (i == 160) {
            this.zzapt = false;
        } else if (i == 174) {
            this.zzaop = new zzjx((zzjv) null);
        } else if (i == 187) {
            this.zzaoz = false;
        } else if (i == 19899) {
            this.zzaor = -1;
            this.zzaos = -1;
        } else if (i == 20533) {
            this.zzaop.zzapx = true;
        } else if (i == 21968) {
            this.zzaop.zzaqe = true;
        } else if (i == 25152) {
        } else {
            if (i == 408125543) {
                long j3 = this.zzaom;
                if (j3 == -1 || j3 == j) {
                    this.zzaom = j;
                    this.zzaol = j2;
                    return;
                }
                throw new zzhc("Multiple Segment elements not supported");
            } else if (i == 475249515) {
                this.zzaox = new zzog();
                this.zzaoy = new zzog();
            } else if (i != 524531317 || this.zzaoq) {
            } else {
                if (!this.zzaoa || this.zzaou == -1) {
                    this.zzapu.zza(new zzjo(this.zzagy));
                    this.zzaoq = true;
                    return;
                }
                this.zzaot = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzaj(int i) throws zzhc {
        zzjl zzjl;
        zzog zzog;
        zzog zzog2;
        int i2;
        int i3 = 0;
        if (i != 160) {
            if (i == 174) {
                String str = this.zzaop.zzapv;
                if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                    i3 = 1;
                }
                if (i3 != 0) {
                    zzjx zzjx = this.zzaop;
                    zzjx.zza(this.zzapu, zzjx.number);
                    this.zzanz.put(this.zzaop.number, this.zzaop);
                }
                this.zzaop = null;
            } else if (i == 19899) {
                int i4 = this.zzaor;
                if (i4 != -1) {
                    long j = this.zzaos;
                    if (j != -1) {
                        if (i4 == 475249515) {
                            this.zzaou = j;
                            return;
                        }
                        return;
                    }
                }
                throw new zzhc("Mandatory element SeekID or SeekPosition not found");
            } else if (i != 25152) {
                if (i != 28032) {
                    if (i == 357149030) {
                        if (this.zzaon == -9223372036854775807L) {
                            this.zzaon = 1000000;
                        }
                        long j2 = this.zzaoo;
                        if (j2 != -9223372036854775807L) {
                            this.zzagy = zzea(j2);
                        }
                    } else if (i != 374648427) {
                        if (i == 475249515 && !this.zzaoq) {
                            zzji zzji = this.zzapu;
                            if (this.zzaom == -1 || this.zzagy == -9223372036854775807L || (zzog = this.zzaox) == null || zzog.size() == 0 || (zzog2 = this.zzaoy) == null || zzog2.size() != this.zzaox.size()) {
                                this.zzaox = null;
                                this.zzaoy = null;
                                zzjl = new zzjo(this.zzagy);
                            } else {
                                int size = this.zzaox.size();
                                int[] iArr = new int[size];
                                long[] jArr = new long[size];
                                long[] jArr2 = new long[size];
                                long[] jArr3 = new long[size];
                                for (int i5 = 0; i5 < size; i5++) {
                                    jArr3[i5] = this.zzaox.get(i5);
                                    jArr[i5] = this.zzaom + this.zzaoy.get(i5);
                                }
                                while (true) {
                                    i2 = size - 1;
                                    if (i3 >= i2) {
                                        break;
                                    }
                                    int i6 = i3 + 1;
                                    iArr[i3] = (int) (jArr[i6] - jArr[i3]);
                                    jArr2[i3] = jArr3[i6] - jArr3[i3];
                                    i3 = i6;
                                }
                                iArr[i2] = (int) ((this.zzaom + this.zzaol) - jArr[i2]);
                                jArr2[i2] = this.zzagy - jArr3[i2];
                                this.zzaox = null;
                                this.zzaoy = null;
                                zzjl = new zzje(iArr, jArr, jArr2, jArr3);
                            }
                            zzji.zza(zzjl);
                            this.zzaoq = true;
                        }
                    } else if (this.zzanz.size() != 0) {
                        this.zzapu.zzgp();
                    } else {
                        throw new zzhc("No valid tracks were found");
                    }
                } else if (this.zzaop.zzapx && this.zzaop.zzapy != null) {
                    throw new zzhc("Combining encryption and compression is not supported");
                }
            } else if (!this.zzaop.zzapx) {
            } else {
                if (this.zzaop.zzapz != null) {
                    this.zzaop.zzafq = new zziu(new zziu.zza(zzgl.zzacq, "video/webm", this.zzaop.zzapz.zzans));
                    return;
                }
                throw new zzhc("Encrypted Track found but ContentEncKeyID was not found");
            }
        } else if (this.zzapa == 2) {
            if (!this.zzapt) {
                this.zzapi |= 1;
            }
            zza(this.zzanz.get(this.zzapg), this.zzapb);
            this.zzapa = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc(int i, long j) throws zzhc {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        this.zzaop.type = (int) j;
                        return;
                    case 136:
                        zzjx zzjx = this.zzaop;
                        if (j == 1) {
                            z = true;
                        }
                        zzjx.zzaqx = z;
                        return;
                    case 155:
                        this.zzapc = zzea(j);
                        return;
                    case 159:
                        this.zzaop.zzafx = (int) j;
                        return;
                    case 176:
                        this.zzaop.width = (int) j;
                        return;
                    case 179:
                        this.zzaox.add(zzea(j));
                        return;
                    case 186:
                        this.zzaop.height = (int) j;
                        return;
                    case 215:
                        this.zzaop.number = (int) j;
                        return;
                    case 231:
                        this.zzaow = zzea(j);
                        return;
                    case 241:
                        if (!this.zzaoz) {
                            this.zzaoy.add(j);
                            this.zzaoz = true;
                            return;
                        }
                        return;
                    case 251:
                        this.zzapt = true;
                        return;
                    case 16980:
                        if (j != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j);
                            sb.append(" not supported");
                            throw new zzhc(sb.toString());
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j);
                            sb2.append(" not supported");
                            throw new zzhc(sb2.toString());
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j);
                            sb3.append(" not supported");
                            throw new zzhc(sb3.toString());
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j);
                            sb4.append(" not supported");
                            throw new zzhc(sb4.toString());
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j);
                            sb5.append(" not supported");
                            throw new zzhc(sb5.toString());
                        }
                        return;
                    case 21420:
                        this.zzaos = j + this.zzaom;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.zzaop.zzafu = 0;
                            return;
                        } else if (i2 == 1) {
                            this.zzaop.zzafu = 2;
                            return;
                        } else if (i2 == 3) {
                            this.zzaop.zzafu = 1;
                            return;
                        } else if (i2 == 15) {
                            this.zzaop.zzafu = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.zzaop.zzaqb = (int) j;
                        return;
                    case 21682:
                        this.zzaop.zzaqd = (int) j;
                        return;
                    case 21690:
                        this.zzaop.zzaqc = (int) j;
                        return;
                    case 21930:
                        zzjx zzjx2 = this.zzaop;
                        if (j == 1) {
                            z = true;
                        }
                        zzjx2.zzaqy = z;
                        return;
                    case 22186:
                        this.zzaop.zzaqv = j;
                        return;
                    case 22203:
                        this.zzaop.zzaqw = j;
                        return;
                    case 25188:
                        this.zzaop.zzaqu = (int) j;
                        return;
                    case 2352003:
                        this.zzaop.zzapw = (int) j;
                        return;
                    case 2807729:
                        this.zzaon = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                int i3 = (int) j;
                                if (i3 == 1) {
                                    this.zzaop.zzaqh = 2;
                                    return;
                                } else if (i3 == 2) {
                                    this.zzaop.zzaqh = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i4 = (int) j;
                                if (i4 != 1) {
                                    if (i4 == 16) {
                                        this.zzaop.zzaqg = 6;
                                        return;
                                    } else if (i4 == 18) {
                                        this.zzaop.zzaqg = 7;
                                        return;
                                    } else if (!(i4 == 6 || i4 == 7)) {
                                        return;
                                    }
                                }
                                this.zzaop.zzaqg = 3;
                                return;
                            case 21947:
                                zzjx zzjx3 = this.zzaop;
                                zzjx3.zzaqe = true;
                                int i5 = (int) j;
                                if (i5 == 1) {
                                    zzjx3.zzaqf = 1;
                                    return;
                                } else if (i5 == 9) {
                                    zzjx3.zzaqf = 6;
                                    return;
                                } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                    this.zzaop.zzaqf = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.zzaop.zzaqi = (int) j;
                                return;
                            case 21949:
                                this.zzaop.zzaqj = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                StringBuilder sb6 = new StringBuilder(55);
                sb6.append("ContentEncodingScope ");
                sb6.append(j);
                sb6.append(" not supported");
                throw new zzhc(sb6.toString());
            }
        } else if (j != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j);
            sb7.append(" not supported");
            throw new zzhc(sb7.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(int i, double d) {
        if (i == 181) {
            this.zzaop.zzafy = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.zzaop.zzaqk = (float) d;
                    return;
                case 21970:
                    this.zzaop.zzaql = (float) d;
                    return;
                case 21971:
                    this.zzaop.zzaqm = (float) d;
                    return;
                case 21972:
                    this.zzaop.zzaqn = (float) d;
                    return;
                case 21973:
                    this.zzaop.zzaqo = (float) d;
                    return;
                case 21974:
                    this.zzaop.zzaqp = (float) d;
                    return;
                case 21975:
                    this.zzaop.zzaqq = (float) d;
                    return;
                case 21976:
                    this.zzaop.zzaqr = (float) d;
                    return;
                case 21977:
                    this.zzaop.zzaqs = (float) d;
                    return;
                case 21978:
                    this.zzaop.zzaqt = (float) d;
                    return;
                default:
                    return;
            }
        } else {
            this.zzaoo = (long) d;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(int i, String str) throws zzhc {
        if (i == 134) {
            this.zzaop.zzapv = str;
        } else if (i != 17026) {
            if (i == 2274716) {
                String unused = this.zzaop.zzage = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new zzhc(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01fe, code lost:
        throw new com.google.android.gms.internal.ads.zzhc("EBML lacing sample size out of range.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(int r20, int r21, com.google.android.gms.internal.ads.zzjf r22) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = 161(0xa1, float:2.26E-43)
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 4
            r7 = 0
            r8 = 1
            if (r1 == r4) goto L_0x0091
            if (r1 == r5) goto L_0x0091
            r4 = 16981(0x4255, float:2.3795E-41)
            if (r1 == r4) goto L_0x0085
            r4 = 18402(0x47e2, float:2.5787E-41)
            if (r1 == r4) goto L_0x0076
            r4 = 21419(0x53ab, float:3.0014E-41)
            if (r1 == r4) goto L_0x0058
            r4 = 25506(0x63a2, float:3.5742E-41)
            if (r1 == r4) goto L_0x004c
            r4 = 30322(0x7672, float:4.249E-41)
            if (r1 != r4) goto L_0x0033
            com.google.android.gms.internal.ads.zzjx r1 = r0.zzaop
            byte[] r4 = new byte[r2]
            r1.zzafv = r4
            byte[] r1 = r1.zzafv
            r3.readFully(r1, r7, r2)
            return
        L_0x0033:
            com.google.android.gms.internal.ads.zzhc r2 = new com.google.android.gms.internal.ads.zzhc
            r3 = 26
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Unexpected id: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1)
            throw r2
        L_0x004c:
            com.google.android.gms.internal.ads.zzjx r1 = r0.zzaop
            byte[] r4 = new byte[r2]
            r1.zzaqa = r4
            byte[] r1 = r1.zzaqa
            r3.readFully(r1, r7, r2)
            return
        L_0x0058:
            com.google.android.gms.internal.ads.zzom r1 = r0.zzaof
            byte[] r1 = r1.data
            java.util.Arrays.fill(r1, r7)
            com.google.android.gms.internal.ads.zzom r1 = r0.zzaof
            byte[] r1 = r1.data
            int r6 = r6 - r2
            r3.readFully(r1, r6, r2)
            com.google.android.gms.internal.ads.zzom r1 = r0.zzaof
            r1.zzbh(r7)
            com.google.android.gms.internal.ads.zzom r1 = r0.zzaof
            long r1 = r1.zziz()
            int r2 = (int) r1
            r0.zzaor = r2
            return
        L_0x0076:
            byte[] r1 = new byte[r2]
            r3.readFully(r1, r7, r2)
            com.google.android.gms.internal.ads.zzjx r2 = r0.zzaop
            com.google.android.gms.internal.ads.zzjq r3 = new com.google.android.gms.internal.ads.zzjq
            r3.<init>(r8, r1)
            r2.zzapz = r3
            return
        L_0x0085:
            com.google.android.gms.internal.ads.zzjx r1 = r0.zzaop
            byte[] r4 = new byte[r2]
            r1.zzapy = r4
            byte[] r1 = r1.zzapy
            r3.readFully(r1, r7, r2)
            return
        L_0x0091:
            int r4 = r0.zzapa
            r9 = 8
            if (r4 != 0) goto L_0x00b6
            com.google.android.gms.internal.ads.zzjz r4 = r0.zzanm
            long r10 = r4.zza(r3, r7, r8, r9)
            int r4 = (int) r10
            r0.zzapg = r4
            com.google.android.gms.internal.ads.zzjz r4 = r0.zzanm
            int r4 = r4.zzgt()
            r0.zzaph = r4
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zzapc = r10
            r0.zzapa = r8
            com.google.android.gms.internal.ads.zzom r4 = r0.zzaod
            r4.reset()
        L_0x00b6:
            android.util.SparseArray<com.google.android.gms.internal.ads.zzjx> r4 = r0.zzanz
            int r10 = r0.zzapg
            java.lang.Object r4 = r4.get(r10)
            com.google.android.gms.internal.ads.zzjx r4 = (com.google.android.gms.internal.ads.zzjx) r4
            if (r4 != 0) goto L_0x00cc
            int r1 = r0.zzaph
            int r1 = r2 - r1
            r3.zzac(r1)
            r0.zzapa = r7
            return
        L_0x00cc:
            int r10 = r0.zzapa
            if (r10 != r8) goto L_0x0285
            r10 = 3
            r0.zzb(r3, r10)
            com.google.android.gms.internal.ads.zzom r11 = r0.zzaod
            byte[] r11 = r11.data
            r12 = 2
            byte r11 = r11[r12]
            r11 = r11 & 6
            int r11 = r11 >> r8
            r13 = 255(0xff, float:3.57E-43)
            if (r11 != 0) goto L_0x00f6
            r0.zzape = r8
            int[] r6 = r0.zzapf
            int[] r6 = zza((int[]) r6, (int) r8)
            r0.zzapf = r6
            int[] r6 = r0.zzapf
            int r11 = r0.zzaph
            int r2 = r2 - r11
            int r2 = r2 - r10
            r6[r7] = r2
            goto L_0x0212
        L_0x00f6:
            if (r1 != r5) goto L_0x027d
            r0.zzb(r3, r6)
            com.google.android.gms.internal.ads.zzom r14 = r0.zzaod
            byte[] r14 = r14.data
            byte r14 = r14[r10]
            r14 = r14 & r13
            int r14 = r14 + r8
            r0.zzape = r14
            int[] r14 = r0.zzapf
            int r15 = r0.zzape
            int[] r14 = zza((int[]) r14, (int) r15)
            r0.zzapf = r14
            if (r11 != r12) goto L_0x011f
            int r10 = r0.zzaph
            int r2 = r2 - r10
            int r2 = r2 - r6
            int r6 = r0.zzape
            int r2 = r2 / r6
            int[] r10 = r0.zzapf
            java.util.Arrays.fill(r10, r7, r6, r2)
            goto L_0x0212
        L_0x011f:
            if (r11 != r8) goto L_0x0157
            r6 = 0
            r10 = 4
            r11 = 0
        L_0x0124:
            int r14 = r0.zzape
            int r15 = r14 + -1
            if (r6 >= r15) goto L_0x014b
            int[] r14 = r0.zzapf
            r14[r6] = r7
        L_0x012e:
            int r10 = r10 + r8
            r0.zzb(r3, r10)
            com.google.android.gms.internal.ads.zzom r14 = r0.zzaod
            byte[] r14 = r14.data
            int r15 = r10 + -1
            byte r14 = r14[r15]
            r14 = r14 & r13
            int[] r15 = r0.zzapf
            r16 = r15[r6]
            int r16 = r16 + r14
            r15[r6] = r16
            if (r14 == r13) goto L_0x012e
            r14 = r15[r6]
            int r11 = r11 + r14
            int r6 = r6 + 1
            goto L_0x0124
        L_0x014b:
            int[] r6 = r0.zzapf
            int r14 = r14 - r8
            int r15 = r0.zzaph
            int r2 = r2 - r15
            int r2 = r2 - r10
            int r2 = r2 - r11
            r6[r14] = r2
            goto L_0x0212
        L_0x0157:
            if (r11 != r10) goto L_0x0264
            r6 = 0
            r10 = 4
            r11 = 0
        L_0x015c:
            int r14 = r0.zzape
            int r15 = r14 + -1
            if (r6 >= r15) goto L_0x0207
            int[] r14 = r0.zzapf
            r14[r6] = r7
            int r10 = r10 + 1
            r0.zzb(r3, r10)
            com.google.android.gms.internal.ads.zzom r14 = r0.zzaod
            byte[] r14 = r14.data
            int r15 = r10 + -1
            byte r14 = r14[r15]
            if (r14 == 0) goto L_0x01ff
            r16 = 0
            r14 = 0
        L_0x0178:
            if (r14 >= r9) goto L_0x01ca
            int r18 = 7 - r14
            int r18 = r8 << r18
            com.google.android.gms.internal.ads.zzom r5 = r0.zzaod
            byte[] r5 = r5.data
            byte r5 = r5[r15]
            r5 = r5 & r18
            if (r5 == 0) goto L_0x01c0
            int r10 = r10 + r14
            r0.zzb(r3, r10)
            com.google.android.gms.internal.ads.zzom r5 = r0.zzaod
            byte[] r5 = r5.data
            int r16 = r15 + 1
            byte r5 = r5[r15]
            r5 = r5 & r13
            r15 = r18 ^ -1
            r5 = r5 & r15
            long r7 = (long) r5
            r5 = r16
        L_0x019b:
            r16 = r7
            if (r5 >= r10) goto L_0x01b2
            long r7 = r16 << r9
            com.google.android.gms.internal.ads.zzom r15 = r0.zzaod
            byte[] r15 = r15.data
            int r16 = r5 + 1
            byte r5 = r15[r5]
            r5 = r5 & r13
            long r12 = (long) r5
            long r7 = r7 | r12
            r5 = r16
            r12 = 2
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x019b
        L_0x01b2:
            if (r6 <= 0) goto L_0x01ca
            int r14 = r14 * 7
            int r14 = r14 + 6
            r7 = 1
            long r12 = r7 << r14
            long r12 = r12 - r7
            long r16 = r16 - r12
            goto L_0x01ca
        L_0x01c0:
            int r14 = r14 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r7 = 0
            r8 = 1
            r12 = 2
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x0178
        L_0x01ca:
            r7 = r16
            r12 = -2147483648(0xffffffff80000000, double:NaN)
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 < 0) goto L_0x01f7
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 > 0) goto L_0x01f7
            int r5 = (int) r7
            int[] r7 = r0.zzapf
            if (r6 != 0) goto L_0x01e0
            goto L_0x01e5
        L_0x01e0:
            int r8 = r6 + -1
            r8 = r7[r8]
            int r5 = r5 + r8
        L_0x01e5:
            r7[r6] = r5
            int[] r5 = r0.zzapf
            r5 = r5[r6]
            int r11 = r11 + r5
            int r6 = r6 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r7 = 0
            r8 = 1
            r12 = 2
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x015c
        L_0x01f7:
            com.google.android.gms.internal.ads.zzhc r1 = new com.google.android.gms.internal.ads.zzhc
            java.lang.String r2 = "EBML lacing sample size out of range."
            r1.<init>(r2)
            throw r1
        L_0x01ff:
            com.google.android.gms.internal.ads.zzhc r1 = new com.google.android.gms.internal.ads.zzhc
            java.lang.String r2 = "No valid varint length mask found"
            r1.<init>(r2)
            throw r1
        L_0x0207:
            int[] r5 = r0.zzapf
            r6 = 1
            int r14 = r14 - r6
            int r6 = r0.zzaph
            int r2 = r2 - r6
            int r2 = r2 - r10
            int r2 = r2 - r11
            r5[r14] = r2
        L_0x0212:
            com.google.android.gms.internal.ads.zzom r2 = r0.zzaod
            byte[] r2 = r2.data
            r5 = 0
            byte r2 = r2[r5]
            int r2 = r2 << r9
            com.google.android.gms.internal.ads.zzom r5 = r0.zzaod
            byte[] r5 = r5.data
            r6 = 1
            byte r5 = r5[r6]
            r6 = 255(0xff, float:3.57E-43)
            r5 = r5 & r6
            r2 = r2 | r5
            long r5 = r0.zzaow
            long r7 = (long) r2
            long r7 = r0.zzea(r7)
            long r5 = r5 + r7
            r0.zzapb = r5
            com.google.android.gms.internal.ads.zzom r2 = r0.zzaod
            byte[] r2 = r2.data
            r5 = 2
            byte r2 = r2[r5]
            r2 = r2 & r9
            if (r2 != r9) goto L_0x023b
            r2 = 1
            goto L_0x023c
        L_0x023b:
            r2 = 0
        L_0x023c:
            int r6 = r4.type
            if (r6 == r5) goto L_0x0252
            r6 = 163(0xa3, float:2.28E-43)
            if (r1 != r6) goto L_0x0250
            com.google.android.gms.internal.ads.zzom r6 = r0.zzaod
            byte[] r6 = r6.data
            byte r6 = r6[r5]
            r5 = 128(0x80, float:1.794E-43)
            r6 = r6 & r5
            if (r6 != r5) goto L_0x0250
            goto L_0x0252
        L_0x0250:
            r5 = 0
            goto L_0x0253
        L_0x0252:
            r5 = 1
        L_0x0253:
            if (r2 == 0) goto L_0x0258
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0259
        L_0x0258:
            r7 = 0
        L_0x0259:
            r2 = r5 | r7
            r0.zzapi = r2
            r2 = 2
            r0.zzapa = r2
            r2 = 0
            r0.zzapd = r2
            goto L_0x0285
        L_0x0264:
            com.google.android.gms.internal.ads.zzhc r1 = new com.google.android.gms.internal.ads.zzhc
            r2 = 36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected lacing value: "
            r3.append(r2)
            r3.append(r11)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x027d:
            com.google.android.gms.internal.ads.zzhc r1 = new com.google.android.gms.internal.ads.zzhc
            java.lang.String r2 = "Lacing only supported in SimpleBlocks."
            r1.<init>(r2)
            throw r1
        L_0x0285:
            r2 = 163(0xa3, float:2.28E-43)
            if (r1 != r2) goto L_0x02b0
        L_0x0289:
            int r1 = r0.zzapd
            int r2 = r0.zzape
            if (r1 >= r2) goto L_0x02ac
            int[] r2 = r0.zzapf
            r1 = r2[r1]
            r0.zza((com.google.android.gms.internal.ads.zzjf) r3, (com.google.android.gms.internal.ads.zzjx) r4, (int) r1)
            long r1 = r0.zzapb
            int r5 = r0.zzapd
            int r6 = r4.zzapw
            int r5 = r5 * r6
            int r5 = r5 / 1000
            long r5 = (long) r5
            long r1 = r1 + r5
            r0.zza((com.google.android.gms.internal.ads.zzjx) r4, (long) r1)
            int r1 = r0.zzapd
            r2 = 1
            int r1 = r1 + r2
            r0.zzapd = r1
            goto L_0x0289
        L_0x02ac:
            r1 = 0
            r0.zzapa = r1
            return
        L_0x02b0:
            r1 = 0
            int[] r2 = r0.zzapf
            r1 = r2[r1]
            r0.zza((com.google.android.gms.internal.ads.zzjf) r3, (com.google.android.gms.internal.ads.zzjx) r4, (int) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjw.zza(int, int, com.google.android.gms.internal.ads.zzjf):void");
    }

    private final void zza(zzjx zzjx, long j) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(zzjx.zzapv)) {
            byte[] bArr2 = this.zzaoh.data;
            long j2 = this.zzapc;
            if (j2 == -9223372036854775807L) {
                bArr = zzanw;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (((long) i) * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - ((long) (60000000 * i2));
                int i3 = (int) (j4 / 1000000);
                bArr = zzop.zzbn(String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - ((long) (1000000 * i3))) / 1000))}));
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            zzjn zzjn = zzjx.zzaqz;
            zzom zzom = this.zzaoh;
            zzjn.zza(zzom, zzom.limit());
            this.zzapr += this.zzaoh.limit();
        }
        zzjx.zzaqz.zza(j, this.zzapi, this.zzapr, 0, zzjx.zzapz);
        this.zzaps = true;
        zzgr();
    }

    private final void zzgr() {
        this.zzapj = 0;
        this.zzapr = 0;
        this.zzapq = 0;
        this.zzapk = false;
        this.zzapl = false;
        this.zzapn = false;
        this.zzapp = 0;
        this.zzapo = 0;
        this.zzapm = false;
        this.zzaog.reset();
    }

    private final void zzb(zzjf zzjf, int i) throws IOException, InterruptedException {
        if (this.zzaod.limit() < i) {
            if (this.zzaod.capacity() < i) {
                zzom zzom = this.zzaod;
                zzom.zzb(Arrays.copyOf(zzom.data, Math.max(this.zzaod.data.length << 1, i)), this.zzaod.limit());
            }
            zzjf.readFully(this.zzaod.data, this.zzaod.limit(), i - this.zzaod.limit());
            this.zzaod.zzbg(i);
        }
    }

    private final void zza(zzjf zzjf, zzjx zzjx, int i) throws IOException, InterruptedException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzjx.zzapv)) {
            int length = zzanv.length + i;
            if (this.zzaoh.capacity() < length) {
                this.zzaoh.data = Arrays.copyOf(zzanv, length + i);
            }
            zzjf.readFully(this.zzaoh.data, zzanv.length, i);
            this.zzaoh.zzbh(0);
            this.zzaoh.zzbg(length);
            return;
        }
        zzjn zzjn = zzjx.zzaqz;
        if (!this.zzapk) {
            if (zzjx.zzapx) {
                this.zzapi &= -1073741825;
                int i3 = 128;
                if (!this.zzapl) {
                    zzjf.readFully(this.zzaod.data, 0, 1);
                    this.zzapj++;
                    if ((this.zzaod.data[0] & 128) != 128) {
                        this.zzapo = this.zzaod.data[0];
                        this.zzapl = true;
                    } else {
                        throw new zzhc("Extension bit is set in signal byte");
                    }
                }
                byte b = this.zzapo;
                if ((b & 1) == 1) {
                    boolean z = (b & 2) == 2;
                    this.zzapi |= 1073741824;
                    if (!this.zzapm) {
                        zzjf.readFully(this.zzaoi.data, 0, 8);
                        this.zzapj += 8;
                        this.zzapm = true;
                        byte[] bArr = this.zzaod.data;
                        if (!z) {
                            i3 = 0;
                        }
                        bArr[0] = (byte) (i3 | 8);
                        this.zzaod.zzbh(0);
                        zzjn.zza(this.zzaod, 1);
                        this.zzapr++;
                        this.zzaoi.zzbh(0);
                        zzjn.zza(this.zzaoi, 8);
                        this.zzapr += 8;
                    }
                    if (z) {
                        if (!this.zzapn) {
                            zzjf.readFully(this.zzaod.data, 0, 1);
                            this.zzapj++;
                            this.zzaod.zzbh(0);
                            this.zzapp = this.zzaod.readUnsignedByte();
                            this.zzapn = true;
                        }
                        int i4 = this.zzapp << 2;
                        this.zzaod.reset(i4);
                        zzjf.readFully(this.zzaod.data, 0, i4);
                        this.zzapj += i4;
                        short s = (short) ((this.zzapp / 2) + 1);
                        int i5 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.zzaok;
                        if (byteBuffer == null || byteBuffer.capacity() < i5) {
                            this.zzaok = ByteBuffer.allocate(i5);
                        }
                        this.zzaok.position(0);
                        this.zzaok.putShort(s);
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            i2 = this.zzapp;
                            if (i6 >= i2) {
                                break;
                            }
                            int zzjc = this.zzaod.zzjc();
                            if (i6 % 2 == 0) {
                                this.zzaok.putShort((short) (zzjc - i7));
                            } else {
                                this.zzaok.putInt(zzjc - i7);
                            }
                            i6++;
                            i7 = zzjc;
                        }
                        int i8 = (i - this.zzapj) - i7;
                        if (i2 % 2 == 1) {
                            this.zzaok.putInt(i8);
                        } else {
                            this.zzaok.putShort((short) i8);
                            this.zzaok.putInt(0);
                        }
                        this.zzaoj.zzb(this.zzaok.array(), i5);
                        zzjn.zza(this.zzaoj, i5);
                        this.zzapr += i5;
                    }
                }
            } else if (zzjx.zzapy != null) {
                this.zzaog.zzb(zzjx.zzapy, zzjx.zzapy.length);
            }
            this.zzapk = true;
        }
        int limit = i + this.zzaog.limit();
        if (!"V_MPEG4/ISO/AVC".equals(zzjx.zzapv) && !"V_MPEGH/ISO/HEVC".equals(zzjx.zzapv)) {
            while (true) {
                int i9 = this.zzapj;
                if (i9 >= limit) {
                    break;
                }
                zza(zzjf, zzjn, limit - i9);
            }
        } else {
            byte[] bArr2 = this.zzaoc.data;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i10 = zzjx.zzara;
            int i11 = 4 - zzjx.zzara;
            while (this.zzapj < limit) {
                int i12 = this.zzapq;
                if (i12 == 0) {
                    int min = Math.min(i10, this.zzaog.zzix());
                    zzjf.readFully(bArr2, i11 + min, i10 - min);
                    if (min > 0) {
                        this.zzaog.zze(bArr2, i11, min);
                    }
                    this.zzapj += i10;
                    this.zzaoc.zzbh(0);
                    this.zzapq = this.zzaoc.zzjc();
                    this.zzaob.zzbh(0);
                    zzjn.zza(this.zzaob, 4);
                    this.zzapr += 4;
                } else {
                    this.zzapq = i12 - zza(zzjf, zzjn, i12);
                }
            }
        }
        if ("A_VORBIS".equals(zzjx.zzapv)) {
            this.zzaoe.zzbh(0);
            zzjn.zza(this.zzaoe, 4);
            this.zzapr += 4;
        }
    }

    private final int zza(zzjf zzjf, zzjn zzjn, int i) throws IOException, InterruptedException {
        int i2;
        int zzix = this.zzaog.zzix();
        if (zzix > 0) {
            i2 = Math.min(i, zzix);
            zzjn.zza(this.zzaog, i2);
        } else {
            i2 = zzjn.zza(zzjf, i, false);
        }
        this.zzapj += i2;
        this.zzapr += i2;
        return i2;
    }

    private final long zzea(long j) throws zzhc {
        long j2 = this.zzaon;
        if (j2 != -9223372036854775807L) {
            return zzop.zza(j, j2, 1000);
        }
        throw new zzhc("Can't scale timecode prior to timecodeScale being set.");
    }

    private static int[] zza(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length << 1, i)];
    }
}
