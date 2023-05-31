package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzhz {
    private static boolean zzaia = false;
    private static boolean zzaib = false;
    private int streamType;
    private zzhf zzadp;
    private int zzafy;
    private final zzhm zzaic = null;
    private final zzig zzaid;
    private final zzip zzaie;
    private final zzhp[] zzaif;
    private final zzif zzaig;
    /* access modifiers changed from: private */
    public final ConditionVariable zzaih;
    private final long[] zzaii;
    private final zzib zzaij;
    private final LinkedList<zzie> zzaik;
    private AudioTrack zzail;
    private int zzaim;
    private int zzain;
    private int zzaio;
    private boolean zzaip;
    private int zzaiq;
    private long zzair;
    private zzhf zzais;
    private long zzait;
    private long zzaiu;
    private ByteBuffer zzaiv;
    private int zzaiw;
    private int zzaix;
    private int zzaiy;
    private long zzaiz;
    private long zzaja;
    private boolean zzajb;
    private long zzajc;
    private Method zzajd;
    private int zzaje;
    private long zzajf;
    private long zzajg;
    private int zzajh;
    private long zzaji;
    private long zzajj;
    private int zzajk;
    private int zzajl;
    private long zzajm;
    private long zzajn;
    private long zzajo;
    private zzhp[] zzajp;
    private ByteBuffer[] zzajq;
    private ByteBuffer zzajr;
    private ByteBuffer zzajs;
    private byte[] zzajt;
    private int zzaju;
    private int zzajv;
    private boolean zzajw;
    private boolean zzajx;
    private int zzajy;
    private boolean zzajz;
    private boolean zzaka;
    private long zzakb;
    private float zzcy;

    public zzhz(zzhm zzhm, zzhp[] zzhpArr, zzif zzif) {
        this.zzaig = zzif;
        this.zzaih = new ConditionVariable(true);
        if (zzop.SDK_INT >= 18) {
            try {
                this.zzajd = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzop.SDK_INT >= 19) {
            this.zzaij = new zzia();
        } else {
            this.zzaij = new zzib((zzhy) null);
        }
        this.zzaid = new zzig();
        this.zzaie = new zzip();
        this.zzaif = new zzhp[(zzhpArr.length + 3)];
        this.zzaif[0] = new zzin();
        zzhp[] zzhpArr2 = this.zzaif;
        zzhpArr2[1] = this.zzaid;
        System.arraycopy(zzhpArr, 0, zzhpArr2, 2, zzhpArr.length);
        this.zzaif[zzhpArr.length + 2] = this.zzaie;
        this.zzaii = new long[10];
        this.zzcy = 1.0f;
        this.zzajl = 0;
        this.streamType = 3;
        this.zzajy = 0;
        this.zzadp = zzhf.zzagj;
        this.zzajv = -1;
        this.zzajp = new zzhp[0];
        this.zzajq = new ByteBuffer[0];
        this.zzaik = new LinkedList<>();
    }

    public final boolean zzbb(String str) {
        zzhm zzhm = this.zzaic;
        return zzhm != null && zzhm.zzq(zzbc(str));
    }

    public final long zzj(boolean z) {
        long j;
        long j2;
        long j3;
        long j4;
        if (!(isInitialized() && this.zzajl != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.zzail.getPlayState() == 3) {
            long zzfx = this.zzaij.zzfx();
            if (zzfx != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.zzaja >= 30000) {
                    long[] jArr = this.zzaii;
                    int i = this.zzaix;
                    jArr[i] = zzfx - nanoTime;
                    this.zzaix = (i + 1) % 10;
                    int i2 = this.zzaiy;
                    if (i2 < 10) {
                        this.zzaiy = i2 + 1;
                    }
                    this.zzaja = nanoTime;
                    this.zzaiz = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.zzaiy;
                        if (i3 >= i4) {
                            break;
                        }
                        this.zzaiz += this.zzaii[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!zzfs() && nanoTime - this.zzajc >= 500000) {
                    this.zzajb = this.zzaij.zzft();
                    if (this.zzajb) {
                        long zzfu = this.zzaij.zzfu() / 1000;
                        long zzfv = this.zzaij.zzfv();
                        if (zzfu < this.zzajn) {
                            this.zzajb = false;
                        } else if (Math.abs(zzfu - nanoTime) > 5000000) {
                            StringBuilder sb = new StringBuilder(136);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(zzfv);
                            sb.append(", ");
                            sb.append(zzfu);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(zzfx);
                            Log.w("AudioTrack", sb.toString());
                            this.zzajb = false;
                        } else if (Math.abs(zzdw(zzfv) - zzfx) > 5000000) {
                            StringBuilder sb2 = new StringBuilder(138);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(zzfv);
                            sb2.append(", ");
                            sb2.append(zzfu);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(zzfx);
                            Log.w("AudioTrack", sb2.toString());
                            this.zzajb = false;
                        }
                    }
                    Method method = this.zzajd;
                    if (method != null && !this.zzaip) {
                        try {
                            this.zzajo = (((long) ((Integer) method.invoke(this.zzail, (Object[]) null)).intValue()) * 1000) - this.zzair;
                            this.zzajo = Math.max(this.zzajo, 0);
                            if (this.zzajo > 5000000) {
                                long j5 = this.zzajo;
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(j5);
                                Log.w("AudioTrack", sb3.toString());
                                this.zzajo = 0;
                            }
                        } catch (Exception unused) {
                            this.zzajd = null;
                        }
                    }
                    this.zzajc = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.zzajb) {
            j = zzdw(this.zzaij.zzfv() + zzdx(nanoTime2 - (this.zzaij.zzfu() / 1000)));
        } else {
            if (this.zzaiy == 0) {
                j = this.zzaij.zzfx();
            } else {
                j = nanoTime2 + this.zzaiz;
            }
            if (!z) {
                j -= this.zzajo;
            }
        }
        long j6 = this.zzajm;
        while (!this.zzaik.isEmpty() && j >= this.zzaik.getFirst().zzaes) {
            zzie remove = this.zzaik.remove();
            this.zzadp = remove.zzadp;
            this.zzaiu = remove.zzaes;
            this.zzait = remove.zzako - this.zzajm;
        }
        if (this.zzadp.zzagk == 1.0f) {
            j2 = (j + this.zzait) - this.zzaiu;
        } else {
            if (!this.zzaik.isEmpty() || this.zzaie.zzgg() < 1024) {
                j3 = this.zzait;
                double d = (double) this.zzadp.zzagk;
                double d2 = (double) (j - this.zzaiu);
                Double.isNaN(d);
                Double.isNaN(d2);
                j4 = (long) (d * d2);
            } else {
                j3 = this.zzait;
                j4 = zzop.zza(j - this.zzaiu, this.zzaie.zzgf(), this.zzaie.zzgg());
            }
            j2 = j4 + j3;
        }
        return j6 + j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.lang.String r8, int r9, int r10, int r11, int r12, int[] r13) throws com.google.android.gms.internal.ads.zzid {
        /*
            r7 = this;
            java.lang.String r12 = "audio/raw"
            boolean r12 = r12.equals(r8)
            r0 = 1
            r12 = r12 ^ r0
            if (r12 == 0) goto L_0x000f
            int r8 = zzbc(r8)
            goto L_0x0010
        L_0x000f:
            r8 = r11
        L_0x0010:
            r1 = 0
            if (r12 != 0) goto L_0x004f
            int r11 = com.google.android.gms.internal.ads.zzop.zzg(r11, r9)
            r7.zzaje = r11
            com.google.android.gms.internal.ads.zzig r11 = r7.zzaid
            r11.zzb(r13)
            com.google.android.gms.internal.ads.zzhp[] r11 = r7.zzaif
            int r13 = r11.length
            r3 = r8
            r2 = r9
            r8 = 0
            r9 = 0
        L_0x0025:
            if (r8 >= r13) goto L_0x0046
            r4 = r11[r8]
            boolean r5 = r4.zzb(r10, r2, r3)     // Catch:{ zzho -> 0x003f }
            r9 = r9 | r5
            boolean r5 = r4.isActive()
            if (r5 == 0) goto L_0x003c
            int r2 = r4.zzfe()
            int r3 = r4.zzff()
        L_0x003c:
            int r8 = r8 + 1
            goto L_0x0025
        L_0x003f:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzid r9 = new com.google.android.gms.internal.ads.zzid
            r9.<init>((java.lang.Throwable) r8)
            throw r9
        L_0x0046:
            if (r9 == 0) goto L_0x004b
            r7.zzfi()
        L_0x004b:
            r11 = r9
            r9 = r2
            r8 = r3
            goto L_0x0050
        L_0x004f:
            r11 = 0
        L_0x0050:
            r13 = 252(0xfc, float:3.53E-43)
            r2 = 12
            switch(r9) {
                case 1: goto L_0x0085;
                case 2: goto L_0x0082;
                case 3: goto L_0x007f;
                case 4: goto L_0x007c;
                case 5: goto L_0x0079;
                case 6: goto L_0x0076;
                case 7: goto L_0x0073;
                case 8: goto L_0x0070;
                default: goto L_0x0057;
            }
        L_0x0057:
            com.google.android.gms.internal.ads.zzid r8 = new com.google.android.gms.internal.ads.zzid
            r10 = 38
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            java.lang.String r10 = "Unsupported channel count: "
            r11.append(r10)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r8.<init>((java.lang.String) r9)
            throw r8
        L_0x0070:
            int r3 = com.google.android.gms.internal.ads.zzgl.CHANNEL_OUT_7POINT1_SURROUND
            goto L_0x0086
        L_0x0073:
            r3 = 1276(0x4fc, float:1.788E-42)
            goto L_0x0086
        L_0x0076:
            r3 = 252(0xfc, float:3.53E-43)
            goto L_0x0086
        L_0x0079:
            r3 = 220(0xdc, float:3.08E-43)
            goto L_0x0086
        L_0x007c:
            r3 = 204(0xcc, float:2.86E-43)
            goto L_0x0086
        L_0x007f:
            r3 = 28
            goto L_0x0086
        L_0x0082:
            r3 = 12
            goto L_0x0086
        L_0x0085:
            r3 = 4
        L_0x0086:
            int r4 = com.google.android.gms.internal.ads.zzop.SDK_INT
            r5 = 23
            r6 = 5
            if (r4 > r5) goto L_0x00ad
            java.lang.String r4 = com.google.android.gms.internal.ads.zzop.DEVICE
            java.lang.String r5 = "foster"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00ad
            java.lang.String r4 = com.google.android.gms.internal.ads.zzop.MANUFACTURER
            java.lang.String r5 = "NVIDIA"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00ad
            r4 = 3
            if (r9 == r4) goto L_0x00ae
            if (r9 == r6) goto L_0x00ae
            r13 = 7
            if (r9 == r13) goto L_0x00aa
            goto L_0x00ad
        L_0x00aa:
            int r13 = com.google.android.gms.internal.ads.zzgl.CHANNEL_OUT_7POINT1_SURROUND
            goto L_0x00ae
        L_0x00ad:
            r13 = r3
        L_0x00ae:
            int r3 = com.google.android.gms.internal.ads.zzop.SDK_INT
            r4 = 25
            if (r3 > r4) goto L_0x00c4
            java.lang.String r3 = com.google.android.gms.internal.ads.zzop.DEVICE
            java.lang.String r4 = "fugu"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00c4
            if (r12 == 0) goto L_0x00c4
            if (r9 != r0) goto L_0x00c4
            r13 = 12
        L_0x00c4:
            if (r11 != 0) goto L_0x00d9
            boolean r11 = r7.isInitialized()
            if (r11 == 0) goto L_0x00d9
            int r11 = r7.zzain
            if (r11 != r8) goto L_0x00d9
            int r11 = r7.zzafy
            if (r11 != r10) goto L_0x00d9
            int r11 = r7.zzaim
            if (r11 != r13) goto L_0x00d9
            return
        L_0x00d9:
            r7.reset()
            r7.zzain = r8
            r7.zzaip = r12
            r7.zzafy = r10
            r7.zzaim = r13
            r11 = 2
            if (r12 == 0) goto L_0x00e8
            goto L_0x00e9
        L_0x00e8:
            r8 = 2
        L_0x00e9:
            r7.zzaio = r8
            int r8 = com.google.android.gms.internal.ads.zzop.zzg(r11, r9)
            r7.zzajh = r8
            if (r12 == 0) goto L_0x0102
            int r8 = r7.zzaio
            if (r8 == r6) goto L_0x00ff
            r9 = 6
            if (r8 != r9) goto L_0x00fb
            goto L_0x00ff
        L_0x00fb:
            r8 = 49152(0xc000, float:6.8877E-41)
            goto L_0x0138
        L_0x00ff:
            r8 = 20480(0x5000, float:2.8699E-41)
            goto L_0x0138
        L_0x0102:
            int r8 = r7.zzaio
            int r8 = android.media.AudioTrack.getMinBufferSize(r10, r13, r8)
            r9 = -2
            if (r8 == r9) goto L_0x010c
            goto L_0x010d
        L_0x010c:
            r0 = 0
        L_0x010d:
            com.google.android.gms.internal.ads.zzob.checkState(r0)
            int r9 = r8 << 2
            r10 = 250000(0x3d090, double:1.235164E-318)
            long r10 = r7.zzdx(r10)
            int r11 = (int) r10
            int r10 = r7.zzajh
            int r10 = r10 * r11
            long r0 = (long) r8
            r2 = 750000(0xb71b0, double:3.70549E-318)
            long r2 = r7.zzdx(r2)
            int r8 = r7.zzajh
            long r4 = (long) r8
            long r2 = r2 * r4
            long r0 = java.lang.Math.max(r0, r2)
            int r8 = (int) r0
            if (r9 >= r10) goto L_0x0134
            r8 = r10
            goto L_0x0138
        L_0x0134:
            if (r9 <= r8) goto L_0x0137
            goto L_0x0138
        L_0x0137:
            r8 = r9
        L_0x0138:
            r7.zzaiq = r8
            if (r12 == 0) goto L_0x0142
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x014c
        L_0x0142:
            int r8 = r7.zzaiq
            int r9 = r7.zzajh
            int r8 = r8 / r9
            long r8 = (long) r8
            long r8 = r7.zzdw(r8)
        L_0x014c:
            r7.zzair = r8
            com.google.android.gms.internal.ads.zzhf r8 = r7.zzadp
            r7.zzb(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhz.zza(java.lang.String, int, int, int, int, int[]):void");
    }

    private final void zzfi() {
        ArrayList arrayList = new ArrayList();
        for (zzhp zzhp : this.zzaif) {
            if (zzhp.isActive()) {
                arrayList.add(zzhp);
            } else {
                zzhp.flush();
            }
        }
        int size = arrayList.size();
        this.zzajp = (zzhp[]) arrayList.toArray(new zzhp[size]);
        this.zzajq = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            zzhp zzhp2 = this.zzajp[i];
            zzhp2.flush();
            this.zzajq[i] = zzhp2.zzfh();
        }
    }

    public final void play() {
        this.zzajx = true;
        if (isInitialized()) {
            this.zzajn = System.nanoTime() / 1000;
            this.zzail.play();
        }
    }

    public final void zzfj() {
        if (this.zzajl == 1) {
            this.zzajl = 2;
        }
    }

    public final boolean zza(ByteBuffer byteBuffer, long j) throws zzic, zzih {
        int i;
        int i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        ByteBuffer byteBuffer3 = this.zzajr;
        zzob.checkArgument(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (!isInitialized()) {
            this.zzaih.block();
            if (this.zzajz) {
                this.zzail = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.zzaim).setEncoding(this.zzaio).setSampleRate(this.zzafy).build(), this.zzaiq, 1, this.zzajy);
            } else {
                int i3 = this.zzajy;
                if (i3 == 0) {
                    this.zzail = new AudioTrack(this.streamType, this.zzafy, this.zzaim, this.zzaio, this.zzaiq, 1);
                } else {
                    this.zzail = new AudioTrack(this.streamType, this.zzafy, this.zzaim, this.zzaio, this.zzaiq, 1, i3);
                }
            }
            int state = this.zzail.getState();
            if (state == 1) {
                int audioSessionId = this.zzail.getAudioSessionId();
                if (this.zzajy != audioSessionId) {
                    this.zzajy = audioSessionId;
                    this.zzaig.zzs(audioSessionId);
                }
                this.zzaij.zza(this.zzail, zzfs());
                zzfp();
                this.zzaka = false;
                if (this.zzajx) {
                    play();
                }
            } else {
                try {
                    this.zzail.release();
                } catch (Exception unused) {
                } finally {
                    this.zzail = null;
                }
                throw new zzic(state, this.zzafy, this.zzaim, this.zzaiq);
            }
        }
        if (zzfs()) {
            if (this.zzail.getPlayState() == 2) {
                this.zzaka = false;
                return false;
            } else if (this.zzail.getPlayState() == 1 && this.zzaij.zzfw() != 0) {
                return false;
            }
        }
        boolean z = this.zzaka;
        this.zzaka = zzfm();
        if (z && !this.zzaka && this.zzail.getPlayState() != 1) {
            this.zzaig.zzc(this.zzaiq, zzgl.zzdo(this.zzair), SystemClock.elapsedRealtime() - this.zzakb);
        }
        if (this.zzajr == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.zzaip && this.zzajk == 0) {
                int i4 = this.zzaio;
                if (i4 == 7 || i4 == 8) {
                    i2 = zzij.zzj(byteBuffer);
                } else if (i4 == 5) {
                    i2 = zzhn.zzfd();
                } else if (i4 == 6) {
                    i2 = zzhn.zzh(byteBuffer);
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unexpected audio encoding: ");
                    sb.append(i4);
                    throw new IllegalStateException(sb.toString());
                }
                this.zzajk = i2;
            }
            if (this.zzais != null) {
                if (!zzfl()) {
                    return false;
                }
                LinkedList<zzie> linkedList = this.zzaik;
                zzie zzie = r11;
                zzie zzie2 = new zzie(this.zzais, Math.max(0, j2), zzdw(zzfq()), (zzhy) null);
                linkedList.add(zzie);
                this.zzais = null;
                zzfi();
            }
            if (this.zzajl == 0) {
                this.zzajm = Math.max(0, j2);
                this.zzajl = 1;
            } else {
                long zzdw = this.zzajm + zzdw(this.zzaip ? this.zzajg : this.zzajf / ((long) this.zzaje));
                if (this.zzajl != 1 || Math.abs(zzdw - j2) <= 200000) {
                    i = 2;
                } else {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(zzdw);
                    sb2.append(", got ");
                    sb2.append(j2);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    i = 2;
                    this.zzajl = 2;
                }
                if (this.zzajl == i) {
                    this.zzajm += j2 - zzdw;
                    this.zzajl = 1;
                    this.zzaig.zzef();
                }
            }
            if (this.zzaip) {
                this.zzajg += (long) this.zzajk;
            } else {
                this.zzajf += (long) byteBuffer.remaining();
            }
            this.zzajr = byteBuffer2;
        }
        if (this.zzaip) {
            zzb(this.zzajr, j2);
        } else {
            zzdv(j2);
        }
        if (this.zzajr.hasRemaining()) {
            return false;
        }
        this.zzajr = null;
        return true;
    }

    private final void zzdv(long j) throws zzih {
        ByteBuffer byteBuffer;
        int length = this.zzajp.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.zzajq[i - 1];
            } else {
                byteBuffer = this.zzajr;
                if (byteBuffer == null) {
                    byteBuffer = zzhp.zzahl;
                }
            }
            if (i == length) {
                zzb(byteBuffer, j);
            } else {
                zzhp zzhp = this.zzajp[i];
                zzhp.zzi(byteBuffer);
                ByteBuffer zzfh = zzhp.zzfh();
                this.zzajq[i] = zzfh;
                if (zzfh.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d9, code lost:
        if (r11 < r10) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzb(java.nio.ByteBuffer r9, long r10) throws com.google.android.gms.internal.ads.zzih {
        /*
            r8 = this;
            boolean r0 = r9.hasRemaining()
            r1 = 1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.nio.ByteBuffer r0 = r8.zzajs
            r2 = 21
            r3 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 != r9) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            com.google.android.gms.internal.ads.zzob.checkArgument(r0)
            goto L_0x003b
        L_0x0018:
            r8.zzajs = r9
            int r0 = com.google.android.gms.internal.ads.zzop.SDK_INT
            if (r0 >= r2) goto L_0x003b
            int r0 = r9.remaining()
            byte[] r4 = r8.zzajt
            if (r4 == 0) goto L_0x0029
            int r4 = r4.length
            if (r4 >= r0) goto L_0x002d
        L_0x0029:
            byte[] r4 = new byte[r0]
            r8.zzajt = r4
        L_0x002d:
            int r4 = r9.position()
            byte[] r5 = r8.zzajt
            r9.get(r5, r3, r0)
            r9.position(r4)
            r8.zzaju = r3
        L_0x003b:
            int r0 = r9.remaining()
            int r4 = com.google.android.gms.internal.ads.zzop.SDK_INT
            if (r4 >= r2) goto L_0x0079
            long r10 = r8.zzaji
            com.google.android.gms.internal.ads.zzib r2 = r8.zzaij
            long r4 = r2.zzfw()
            int r2 = r8.zzajh
            long r6 = (long) r2
            long r4 = r4 * r6
            long r10 = r10 - r4
            int r11 = (int) r10
            int r10 = r8.zzaiq
            int r10 = r10 - r11
            if (r10 <= 0) goto L_0x0076
            int r10 = java.lang.Math.min(r0, r10)
            android.media.AudioTrack r11 = r8.zzail
            byte[] r2 = r8.zzajt
            int r4 = r8.zzaju
            int r10 = r11.write(r2, r4, r10)
            if (r10 <= 0) goto L_0x00f2
            int r11 = r8.zzaju
            int r11 = r11 + r10
            r8.zzaju = r11
            int r11 = r9.position()
            int r11 = r11 + r10
            r9.position(r11)
            goto L_0x00f2
        L_0x0076:
            r10 = 0
            goto L_0x00f2
        L_0x0079:
            boolean r2 = r8.zzajz
            if (r2 == 0) goto L_0x00ec
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0088
            r2 = 1
            goto L_0x0089
        L_0x0088:
            r2 = 0
        L_0x0089:
            com.google.android.gms.internal.ads.zzob.checkState(r2)
            android.media.AudioTrack r2 = r8.zzail
            java.nio.ByteBuffer r4 = r8.zzaiv
            if (r4 != 0) goto L_0x00a9
            r4 = 16
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r8.zzaiv = r4
            java.nio.ByteBuffer r4 = r8.zzaiv
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r4.order(r5)
            java.nio.ByteBuffer r4 = r8.zzaiv
            r5 = 1431633921(0x55550001, float:1.46372496E13)
            r4.putInt(r5)
        L_0x00a9:
            int r4 = r8.zzaiw
            if (r4 != 0) goto L_0x00c5
            java.nio.ByteBuffer r4 = r8.zzaiv
            r5 = 4
            r4.putInt(r5, r0)
            java.nio.ByteBuffer r4 = r8.zzaiv
            r5 = 8
            r6 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r6
            r4.putLong(r5, r10)
            java.nio.ByteBuffer r10 = r8.zzaiv
            r10.position(r3)
            r8.zzaiw = r0
        L_0x00c5:
            java.nio.ByteBuffer r10 = r8.zzaiv
            int r10 = r10.remaining()
            if (r10 <= 0) goto L_0x00dc
            java.nio.ByteBuffer r11 = r8.zzaiv
            int r11 = r2.write(r11, r10, r1)
            if (r11 >= 0) goto L_0x00d9
            r8.zzaiw = r3
            r10 = r11
            goto L_0x00f2
        L_0x00d9:
            if (r11 >= r10) goto L_0x00dc
            goto L_0x0076
        L_0x00dc:
            int r9 = r2.write(r9, r0, r1)
            if (r9 >= 0) goto L_0x00e5
            r8.zzaiw = r3
            goto L_0x00ea
        L_0x00e5:
            int r10 = r8.zzaiw
            int r10 = r10 - r9
            r8.zzaiw = r10
        L_0x00ea:
            r10 = r9
            goto L_0x00f2
        L_0x00ec:
            android.media.AudioTrack r10 = r8.zzail
            int r10 = r10.write(r9, r0, r1)
        L_0x00f2:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r8.zzakb = r4
            if (r10 < 0) goto L_0x0117
            boolean r9 = r8.zzaip
            if (r9 != 0) goto L_0x0104
            long r4 = r8.zzaji
            long r6 = (long) r10
            long r4 = r4 + r6
            r8.zzaji = r4
        L_0x0104:
            if (r10 != r0) goto L_0x0116
            boolean r9 = r8.zzaip
            if (r9 == 0) goto L_0x0112
            long r9 = r8.zzajj
            int r11 = r8.zzajk
            long r2 = (long) r11
            long r9 = r9 + r2
            r8.zzajj = r9
        L_0x0112:
            r9 = 0
            r8.zzajs = r9
            return r1
        L_0x0116:
            return r3
        L_0x0117:
            com.google.android.gms.internal.ads.zzih r9 = new com.google.android.gms.internal.ads.zzih
            r9.<init>(r10)
            goto L_0x011e
        L_0x011d:
            throw r9
        L_0x011e:
            goto L_0x011d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhz.zzb(java.nio.ByteBuffer, long):boolean");
    }

    public final void zzfk() throws zzih {
        if (!this.zzajw && isInitialized() && zzfl()) {
            this.zzaij.zzdy(zzfq());
            this.zzaiw = 0;
            this.zzajw = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzfl() throws com.google.android.gms.internal.ads.zzih {
        /*
            r9 = this;
            int r0 = r9.zzajv
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.zzaip
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.zzhp[] r0 = r9.zzajp
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r9.zzajv = r0
        L_0x0012:
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r9.zzajv
            com.google.android.gms.internal.ads.zzhp[] r5 = r9.zzajp
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0038
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.zzfg()
        L_0x0028:
            r9.zzdv(r7)
            boolean r0 = r4.zzez()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.zzajv
            int r0 = r0 + r2
            r9.zzajv = r0
            goto L_0x0012
        L_0x0038:
            java.nio.ByteBuffer r0 = r9.zzajs
            if (r0 == 0) goto L_0x0044
            r9.zzb(r0, r7)
            java.nio.ByteBuffer r0 = r9.zzajs
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            r9.zzajv = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhz.zzfl():boolean");
    }

    public final boolean zzez() {
        if (isInitialized()) {
            return this.zzajw && !zzfm();
        }
        return true;
    }

    public final boolean zzfm() {
        if (isInitialized()) {
            if (zzfq() <= this.zzaij.zzfw()) {
                if (zzfs() && this.zzail.getPlayState() == 2 && this.zzail.getPlaybackHeadPosition() == 0) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final zzhf zzb(zzhf zzhf) {
        if (this.zzaip) {
            this.zzadp = zzhf.zzagj;
            return this.zzadp;
        }
        zzhf zzhf2 = new zzhf(this.zzaie.zzb(zzhf.zzagk), this.zzaie.zzc(zzhf.zzagl));
        zzhf zzhf3 = this.zzais;
        if (zzhf3 == null) {
            if (!this.zzaik.isEmpty()) {
                zzhf3 = this.zzaik.getLast().zzadp;
            } else {
                zzhf3 = this.zzadp;
            }
        }
        if (!zzhf2.equals(zzhf3)) {
            if (isInitialized()) {
                this.zzais = zzhf2;
            } else {
                this.zzadp = zzhf2;
            }
        }
        return this.zzadp;
    }

    public final zzhf zzfn() {
        return this.zzadp;
    }

    public final void setStreamType(int i) {
        if (this.streamType != i) {
            this.streamType = i;
            if (!this.zzajz) {
                reset();
                this.zzajy = 0;
            }
        }
    }

    public final void zzt(int i) {
        zzob.checkState(zzop.SDK_INT >= 21);
        if (!this.zzajz || this.zzajy != i) {
            this.zzajz = true;
            this.zzajy = i;
            reset();
        }
    }

    public final void zzfo() {
        if (this.zzajz) {
            this.zzajz = false;
            this.zzajy = 0;
            reset();
        }
    }

    public final void setVolume(float f) {
        if (this.zzcy != f) {
            this.zzcy = f;
            zzfp();
        }
    }

    private final void zzfp() {
        if (!isInitialized()) {
            return;
        }
        if (zzop.SDK_INT >= 21) {
            this.zzail.setVolume(this.zzcy);
            return;
        }
        AudioTrack audioTrack = this.zzail;
        float f = this.zzcy;
        audioTrack.setStereoVolume(f, f);
    }

    public final void pause() {
        this.zzajx = false;
        if (isInitialized()) {
            zzfr();
            this.zzaij.pause();
        }
    }

    public final void reset() {
        if (isInitialized()) {
            this.zzajf = 0;
            this.zzajg = 0;
            this.zzaji = 0;
            this.zzajj = 0;
            this.zzajk = 0;
            zzhf zzhf = this.zzais;
            if (zzhf != null) {
                this.zzadp = zzhf;
                this.zzais = null;
            } else if (!this.zzaik.isEmpty()) {
                this.zzadp = this.zzaik.getLast().zzadp;
            }
            this.zzaik.clear();
            this.zzait = 0;
            this.zzaiu = 0;
            this.zzajr = null;
            this.zzajs = null;
            int i = 0;
            while (true) {
                zzhp[] zzhpArr = this.zzajp;
                if (i >= zzhpArr.length) {
                    break;
                }
                zzhp zzhp = zzhpArr[i];
                zzhp.flush();
                this.zzajq[i] = zzhp.zzfh();
                i++;
            }
            this.zzajw = false;
            this.zzajv = -1;
            this.zzaiv = null;
            this.zzaiw = 0;
            this.zzajl = 0;
            this.zzajo = 0;
            zzfr();
            if (this.zzail.getPlayState() == 3) {
                this.zzail.pause();
            }
            AudioTrack audioTrack = this.zzail;
            this.zzail = null;
            this.zzaij.zza((AudioTrack) null, false);
            this.zzaih.close();
            new zzhy(this, audioTrack).start();
        }
    }

    public final void release() {
        reset();
        for (zzhp reset : this.zzaif) {
            reset.reset();
        }
        this.zzajy = 0;
        this.zzajx = false;
    }

    private final boolean isInitialized() {
        return this.zzail != null;
    }

    private final long zzdw(long j) {
        return (j * 1000000) / ((long) this.zzafy);
    }

    private final long zzdx(long j) {
        return (j * ((long) this.zzafy)) / 1000000;
    }

    private final long zzfq() {
        return this.zzaip ? this.zzajj : this.zzaji / ((long) this.zzajh);
    }

    private final void zzfr() {
        this.zzaiz = 0;
        this.zzaiy = 0;
        this.zzaix = 0;
        this.zzaja = 0;
        this.zzajb = false;
        this.zzajc = 0;
    }

    private final boolean zzfs() {
        if (zzop.SDK_INT >= 23) {
            return false;
        }
        int i = this.zzaio;
        return i == 5 || i == 6;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzbc(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1095064472: goto L_0x002a;
                case 187078296: goto L_0x0020;
                case 1504578661: goto L_0x0016;
                case 1505942594: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0034
        L_0x000c:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 3
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "audio/eac3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "audio/ac3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 2
            goto L_0x0035
        L_0x0034:
            r5 = -1
        L_0x0035:
            if (r5 == 0) goto L_0x0045
            if (r5 == r4) goto L_0x0043
            if (r5 == r3) goto L_0x0041
            if (r5 == r2) goto L_0x003e
            return r1
        L_0x003e:
            r5 = 8
            return r5
        L_0x0041:
            r5 = 7
            return r5
        L_0x0043:
            r5 = 6
            return r5
        L_0x0045:
            r5 = 5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhz.zzbc(java.lang.String):int");
    }
}
