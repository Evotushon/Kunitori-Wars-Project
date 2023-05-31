package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(19)
@TargetApi(19)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzkv extends zzgj {
    private static final byte[] zzaxw = zzop.zzbp("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private zzgz zzagi;
    private ByteBuffer[] zzajq;
    private final zzkx zzaxx;
    private final zziz<zzjb> zzaxy;
    private final boolean zzaxz;
    private final zziv zzaya;
    private final zziv zzayb;
    private final zzhb zzayc;
    private final List<Long> zzayd;
    private final MediaCodec.BufferInfo zzaye;
    private zzix<zzjb> zzayf;
    private zzix<zzjb> zzayg;
    private MediaCodec zzayh;
    private zzkw zzayi;
    private boolean zzayj;
    private boolean zzayk;
    private boolean zzayl;
    private boolean zzaym;
    private boolean zzayn;
    private boolean zzayo;
    private boolean zzayp;
    private boolean zzayq;
    private boolean zzayr;
    private ByteBuffer[] zzays;
    private long zzayt;
    private int zzayu;
    private int zzayv;
    private boolean zzayw;
    private boolean zzayx;
    private int zzayy;
    private int zzayz;
    private boolean zzaza;
    private boolean zzazb;
    private boolean zzazc;
    private boolean zzazd;
    private boolean zzaze;
    private boolean zzazf;
    protected zzis zzazg;

    public zzkv(int i, zzkx zzkx, zziz<zzjb> zziz, boolean z) {
        super(i);
        zzob.checkState(zzop.SDK_INT >= 16);
        this.zzaxx = (zzkx) zzob.checkNotNull(zzkx);
        this.zzaxy = zziz;
        this.zzaxz = z;
        this.zzaya = new zziv(0);
        this.zzayb = new zziv(0);
        this.zzayc = new zzhb();
        this.zzayd = new ArrayList();
        this.zzaye = new MediaCodec.BufferInfo();
        this.zzayy = 0;
        this.zzayz = 0;
    }

    /* access modifiers changed from: protected */
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzgk {
    }

    /* access modifiers changed from: protected */
    public void onStarted() {
    }

    /* access modifiers changed from: protected */
    public void onStopped() {
    }

    /* access modifiers changed from: protected */
    public abstract int zza(zzkx zzkx, zzgz zzgz) throws zzld;

    /* access modifiers changed from: protected */
    public void zza(zziv zziv) {
    }

    /* access modifiers changed from: protected */
    public abstract void zza(zzkw zzkw, MediaCodec mediaCodec, zzgz zzgz, MediaCrypto mediaCrypto) throws zzld;

    /* access modifiers changed from: protected */
    public abstract boolean zza(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzgk;

    /* access modifiers changed from: protected */
    public boolean zza(MediaCodec mediaCodec, boolean z, zzgz zzgz, zzgz zzgz2) {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean zza(zzkw zzkw) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void zzc(String str, long j, long j2) {
    }

    public final int zzeb() {
        return 4;
    }

    /* access modifiers changed from: protected */
    public void zzfz() throws zzgk {
    }

    public final int zza(zzgz zzgz) throws zzgk {
        try {
            return zza(this.zzaxx, zzgz);
        } catch (zzld e) {
            throw zzgk.zza(e, getIndex());
        }
    }

    /* access modifiers changed from: protected */
    public zzkw zza(zzkx zzkx, zzgz zzgz, boolean z) throws zzld {
        return zzkx.zzb(zzgz.zzafn, z);
    }

    /* access modifiers changed from: protected */
    public final void zzgz() throws zzgk {
        zzgz zzgz;
        if (this.zzayh == null && (zzgz = this.zzagi) != null) {
            this.zzayf = this.zzayg;
            String str = zzgz.zzafn;
            zzix<zzjb> zzix = this.zzayf;
            if (zzix != null) {
                int state = zzix.getState();
                if (state == 0) {
                    throw zzgk.zza(this.zzayf.zzgl(), getIndex());
                } else if (state == 3 || state == 4) {
                    zzjb zzgk = this.zzayf.zzgk();
                    throw new NoSuchMethodError();
                }
            } else {
                if (this.zzayi == null) {
                    try {
                        this.zzayi = zza(this.zzaxx, this.zzagi, false);
                        zzkw zzkw = this.zzayi;
                    } catch (zzld e) {
                        zza(new zzky(this.zzagi, (Throwable) e, false, -49998));
                    }
                    if (this.zzayi == null) {
                        zza(new zzky(this.zzagi, (Throwable) null, false, -49999));
                    }
                }
                if (zza(this.zzayi)) {
                    String str2 = this.zzayi.name;
                    this.zzayj = zzop.SDK_INT < 21 && this.zzagi.zzafp.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
                    this.zzayk = zzop.SDK_INT < 18 || (zzop.SDK_INT == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (zzop.SDK_INT == 19 && zzop.MODEL.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
                    this.zzayl = zzop.SDK_INT < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2)) && ("flounder".equals(zzop.DEVICE) || "flounder_lte".equals(zzop.DEVICE) || "grouper".equals(zzop.DEVICE) || "tilapia".equals(zzop.DEVICE));
                    this.zzaym = zzop.SDK_INT <= 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
                    this.zzayn = (zzop.SDK_INT <= 23 && "OMX.google.vorbis.decoder".equals(str2)) || (zzop.SDK_INT <= 19 && "hb2000".equals(zzop.DEVICE) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2)));
                    this.zzayo = zzop.SDK_INT == 21 && "OMX.google.aac.decoder".equals(str2);
                    this.zzayp = zzop.SDK_INT <= 18 && this.zzagi.zzafx == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String valueOf = String.valueOf(str2);
                        zzoq.beginSection(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                        this.zzayh = MediaCodec.createByCodecName(str2);
                        zzoq.endSection();
                        zzoq.beginSection("configureCodec");
                        zza(this.zzayi, this.zzayh, this.zzagi, (MediaCrypto) null);
                        zzoq.endSection();
                        zzoq.beginSection("startCodec");
                        this.zzayh.start();
                        zzoq.endSection();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        zzc(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        this.zzays = this.zzayh.getInputBuffers();
                        this.zzajq = this.zzayh.getOutputBuffers();
                    } catch (Exception e2) {
                        zza(new zzky(this.zzagi, (Throwable) e2, false, str2));
                    }
                    this.zzayt = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                    this.zzayu = -1;
                    this.zzayv = -1;
                    this.zzazf = true;
                    this.zzazg.zzamj++;
                }
            }
        }
    }

    private final void zza(zzky zzky) throws zzgk {
        throw zzgk.zza(zzky, getIndex());
    }

    /* access modifiers changed from: protected */
    public final MediaCodec zzha() {
        return this.zzayh;
    }

    /* access modifiers changed from: protected */
    public final zzkw zzhb() {
        return this.zzayi;
    }

    /* access modifiers changed from: protected */
    public void zze(boolean z) throws zzgk {
        this.zzazg = new zzis();
    }

    /* access modifiers changed from: protected */
    public void zza(long j, boolean z) throws zzgk {
        this.zzazc = false;
        this.zzazd = false;
        if (this.zzayh != null) {
            this.zzayt = -9223372036854775807L;
            this.zzayu = -1;
            this.zzayv = -1;
            this.zzazf = true;
            this.zzaze = false;
            this.zzayw = false;
            this.zzayd.clear();
            this.zzayq = false;
            this.zzayr = false;
            if (this.zzayk || (this.zzayn && this.zzazb)) {
                zzhc();
                zzgz();
            } else if (this.zzayz != 0) {
                zzhc();
                zzgz();
            } else {
                this.zzayh.flush();
                this.zzaza = false;
            }
            if (this.zzayx && this.zzagi != null) {
                this.zzayy = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void zzec() {
        this.zzagi = null;
        try {
            zzhc();
            try {
                if (this.zzayf != null) {
                    this.zzaxy.zza(this.zzayf);
                }
                try {
                    if (!(this.zzayg == null || this.zzayg == this.zzayf)) {
                        this.zzaxy.zza(this.zzayg);
                    }
                } finally {
                    this.zzayf = null;
                    this.zzayg = null;
                }
            } catch (Throwable th) {
                if (!(this.zzayg == null || this.zzayg == this.zzayf)) {
                    this.zzaxy.zza(this.zzayg);
                }
                throw th;
            } finally {
                this.zzayf = null;
                this.zzayg = null;
            }
        } catch (Throwable th2) {
            try {
                if (!(this.zzayg == null || this.zzayg == this.zzayf)) {
                    this.zzaxy.zza(this.zzayg);
                }
                throw th2;
            } finally {
                this.zzayf = null;
                this.zzayg = null;
            }
        } finally {
        }
    }

    /* access modifiers changed from: protected */
    public void zzhc() {
        this.zzayt = -9223372036854775807L;
        this.zzayu = -1;
        this.zzayv = -1;
        this.zzaze = false;
        this.zzayw = false;
        this.zzayd.clear();
        this.zzays = null;
        this.zzajq = null;
        this.zzayi = null;
        this.zzayx = false;
        this.zzaza = false;
        this.zzayj = false;
        this.zzayk = false;
        this.zzayl = false;
        this.zzaym = false;
        this.zzayn = false;
        this.zzayp = false;
        this.zzayq = false;
        this.zzayr = false;
        this.zzazb = false;
        this.zzayy = 0;
        this.zzayz = 0;
        this.zzaya.zzcs = null;
        if (this.zzayh != null) {
            this.zzazg.zzamk++;
            try {
                this.zzayh.stop();
                try {
                    this.zzayh.release();
                    this.zzayh = null;
                    zzix<zzjb> zzix = this.zzayf;
                    if (zzix != null && this.zzayg != zzix) {
                        try {
                            this.zzaxy.zza(zzix);
                        } finally {
                            this.zzayf = null;
                        }
                    }
                } catch (Throwable th) {
                    this.zzayh = null;
                    zzix<zzjb> zzix2 = this.zzayf;
                    if (!(zzix2 == null || this.zzayg == zzix2)) {
                        this.zzaxy.zza(zzix2);
                    }
                    throw th;
                } finally {
                    this.zzayf = null;
                }
            } catch (Throwable th2) {
                this.zzayh = null;
                zzix<zzjb> zzix3 = this.zzayf;
                if (!(zzix3 == null || this.zzayg == zzix3)) {
                    try {
                        this.zzaxy.zza(zzix3);
                    } finally {
                        this.zzayf = null;
                    }
                }
                throw th2;
            } finally {
            }
        }
    }

    public final void zzb(long j, long j2) throws zzgk {
        if (this.zzazd) {
            zzfz();
            return;
        }
        if (this.zzagi == null) {
            this.zzayb.clear();
            int zza = zza(this.zzayc, this.zzayb, true);
            if (zza == -5) {
                zzd(this.zzayc.zzagi);
            } else if (zza == -4) {
                zzob.checkState(this.zzayb.zzgd());
                this.zzazc = true;
                zzhe();
                return;
            } else {
                return;
            }
        }
        zzgz();
        if (this.zzayh != null) {
            zzoq.beginSection("drainAndFeed");
            do {
            } while (zzd(j, j2));
            do {
            } while (zzhd());
            zzoq.endSection();
        } else {
            zzdn(j);
            this.zzayb.clear();
            int zza2 = zza(this.zzayc, this.zzayb, false);
            if (zza2 == -5) {
                zzd(this.zzayc.zzagi);
            } else if (zza2 == -4) {
                zzob.checkState(this.zzayb.zzgd());
                this.zzazc = true;
                zzhe();
            }
        }
        this.zzazg.zzgi();
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x014b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzhd() throws com.google.android.gms.internal.ads.zzgk {
        /*
            r14 = this;
            android.media.MediaCodec r0 = r14.zzayh
            r1 = 0
            if (r0 == 0) goto L_0x01d6
            int r2 = r14.zzayz
            r3 = 2
            if (r2 == r3) goto L_0x01d6
            boolean r2 = r14.zzazc
            if (r2 == 0) goto L_0x0010
            goto L_0x01d6
        L_0x0010:
            int r2 = r14.zzayu
            if (r2 >= 0) goto L_0x002c
            r4 = 0
            int r0 = r0.dequeueInputBuffer(r4)
            r14.zzayu = r0
            int r0 = r14.zzayu
            if (r0 >= 0) goto L_0x0021
            return r1
        L_0x0021:
            com.google.android.gms.internal.ads.zziv r2 = r14.zzaya
            java.nio.ByteBuffer[] r4 = r14.zzays
            r0 = r4[r0]
            r2.zzcs = r0
            r2.clear()
        L_0x002c:
            int r0 = r14.zzayz
            r2 = -1
            r4 = 1
            if (r0 != r4) goto L_0x0049
            boolean r0 = r14.zzaym
            if (r0 != 0) goto L_0x0046
            r14.zzazb = r4
            android.media.MediaCodec r5 = r14.zzayh
            int r6 = r14.zzayu
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r14.zzayu = r2
        L_0x0046:
            r14.zzayz = r3
            return r1
        L_0x0049:
            boolean r0 = r14.zzayq
            if (r0 == 0) goto L_0x006b
            r14.zzayq = r1
            com.google.android.gms.internal.ads.zziv r0 = r14.zzaya
            java.nio.ByteBuffer r0 = r0.zzcs
            byte[] r1 = zzaxw
            r0.put(r1)
            android.media.MediaCodec r5 = r14.zzayh
            int r6 = r14.zzayu
            r7 = 0
            byte[] r0 = zzaxw
            int r8 = r0.length
            r9 = 0
            r11 = 0
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r14.zzayu = r2
            r14.zzaza = r4
            return r4
        L_0x006b:
            boolean r0 = r14.zzaze
            if (r0 == 0) goto L_0x0072
            r0 = -4
            r5 = 0
            goto L_0x00aa
        L_0x0072:
            int r0 = r14.zzayy
            if (r0 != r4) goto L_0x0097
            r0 = 0
        L_0x0077:
            com.google.android.gms.internal.ads.zzgz r5 = r14.zzagi
            java.util.List<byte[]> r5 = r5.zzafp
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x0095
            com.google.android.gms.internal.ads.zzgz r5 = r14.zzagi
            java.util.List<byte[]> r5 = r5.zzafp
            java.lang.Object r5 = r5.get(r0)
            byte[] r5 = (byte[]) r5
            com.google.android.gms.internal.ads.zziv r6 = r14.zzaya
            java.nio.ByteBuffer r6 = r6.zzcs
            r6.put(r5)
            int r0 = r0 + 1
            goto L_0x0077
        L_0x0095:
            r14.zzayy = r3
        L_0x0097:
            com.google.android.gms.internal.ads.zziv r0 = r14.zzaya
            java.nio.ByteBuffer r0 = r0.zzcs
            int r0 = r0.position()
            com.google.android.gms.internal.ads.zzhb r5 = r14.zzayc
            com.google.android.gms.internal.ads.zziv r6 = r14.zzaya
            int r5 = r14.zza((com.google.android.gms.internal.ads.zzhb) r5, (com.google.android.gms.internal.ads.zziv) r6, (boolean) r1)
            r13 = r5
            r5 = r0
            r0 = r13
        L_0x00aa:
            r6 = -3
            if (r0 != r6) goto L_0x00ae
            return r1
        L_0x00ae:
            r6 = -5
            if (r0 != r6) goto L_0x00c4
            int r0 = r14.zzayy
            if (r0 != r3) goto L_0x00bc
            com.google.android.gms.internal.ads.zziv r0 = r14.zzaya
            r0.clear()
            r14.zzayy = r4
        L_0x00bc:
            com.google.android.gms.internal.ads.zzhb r0 = r14.zzayc
            com.google.android.gms.internal.ads.zzgz r0 = r0.zzagi
            r14.zzd(r0)
            return r4
        L_0x00c4:
            com.google.android.gms.internal.ads.zziv r0 = r14.zzaya
            boolean r0 = r0.zzgd()
            if (r0 == 0) goto L_0x0100
            int r0 = r14.zzayy
            if (r0 != r3) goto L_0x00d7
            com.google.android.gms.internal.ads.zziv r0 = r14.zzaya
            r0.clear()
            r14.zzayy = r4
        L_0x00d7:
            r14.zzazc = r4
            boolean r0 = r14.zzaza
            if (r0 != 0) goto L_0x00e1
            r14.zzhe()
            return r1
        L_0x00e1:
            boolean r0 = r14.zzaym     // Catch:{ CryptoException -> 0x00f6 }
            if (r0 != 0) goto L_0x00f5
            r14.zzazb = r4     // Catch:{ CryptoException -> 0x00f6 }
            android.media.MediaCodec r5 = r14.zzayh     // Catch:{ CryptoException -> 0x00f6 }
            int r6 = r14.zzayu     // Catch:{ CryptoException -> 0x00f6 }
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x00f6 }
            r14.zzayu = r2     // Catch:{ CryptoException -> 0x00f6 }
        L_0x00f5:
            return r1
        L_0x00f6:
            r0 = move-exception
            int r1 = r14.getIndex()
            com.google.android.gms.internal.ads.zzgk r0 = com.google.android.gms.internal.ads.zzgk.zza(r0, r1)
            throw r0
        L_0x0100:
            boolean r0 = r14.zzazf
            if (r0 == 0) goto L_0x0118
            com.google.android.gms.internal.ads.zziv r0 = r14.zzaya
            boolean r0 = r0.zzge()
            if (r0 != 0) goto L_0x0118
            com.google.android.gms.internal.ads.zziv r0 = r14.zzaya
            r0.clear()
            int r0 = r14.zzayy
            if (r0 != r3) goto L_0x0117
            r14.zzayy = r4
        L_0x0117:
            return r4
        L_0x0118:
            r14.zzazf = r1
            com.google.android.gms.internal.ads.zziv r0 = r14.zzaya
            boolean r0 = r0.zzgj()
            com.google.android.gms.internal.ads.zzix<com.google.android.gms.internal.ads.zzjb> r3 = r14.zzayf
            if (r3 == 0) goto L_0x0144
            int r3 = r3.getState()
            if (r3 == 0) goto L_0x0135
            r6 = 4
            if (r3 == r6) goto L_0x0144
            if (r0 != 0) goto L_0x0133
            boolean r3 = r14.zzaxz
            if (r3 != 0) goto L_0x0144
        L_0x0133:
            r3 = 1
            goto L_0x0145
        L_0x0135:
            com.google.android.gms.internal.ads.zzix<com.google.android.gms.internal.ads.zzjb> r0 = r14.zzayf
            com.google.android.gms.internal.ads.zzja r0 = r0.zzgl()
            int r1 = r14.getIndex()
            com.google.android.gms.internal.ads.zzgk r0 = com.google.android.gms.internal.ads.zzgk.zza(r0, r1)
            throw r0
        L_0x0144:
            r3 = 0
        L_0x0145:
            r14.zzaze = r3
            boolean r3 = r14.zzaze
            if (r3 == 0) goto L_0x014c
            return r1
        L_0x014c:
            boolean r3 = r14.zzayj
            if (r3 == 0) goto L_0x0166
            if (r0 != 0) goto L_0x0166
            com.google.android.gms.internal.ads.zziv r3 = r14.zzaya
            java.nio.ByteBuffer r3 = r3.zzcs
            com.google.android.gms.internal.ads.zzoh.zzk(r3)
            com.google.android.gms.internal.ads.zziv r3 = r14.zzaya
            java.nio.ByteBuffer r3 = r3.zzcs
            int r3 = r3.position()
            if (r3 != 0) goto L_0x0164
            return r4
        L_0x0164:
            r14.zzayj = r1
        L_0x0166:
            com.google.android.gms.internal.ads.zziv r3 = r14.zzaya     // Catch:{ CryptoException -> 0x01cc }
            long r10 = r3.zzamu     // Catch:{ CryptoException -> 0x01cc }
            com.google.android.gms.internal.ads.zziv r3 = r14.zzaya     // Catch:{ CryptoException -> 0x01cc }
            boolean r3 = r3.zzgc()     // Catch:{ CryptoException -> 0x01cc }
            if (r3 == 0) goto L_0x017b
            java.util.List<java.lang.Long> r3 = r14.zzayd     // Catch:{ CryptoException -> 0x01cc }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ CryptoException -> 0x01cc }
            r3.add(r6)     // Catch:{ CryptoException -> 0x01cc }
        L_0x017b:
            com.google.android.gms.internal.ads.zziv r3 = r14.zzaya     // Catch:{ CryptoException -> 0x01cc }
            java.nio.ByteBuffer r3 = r3.zzcs     // Catch:{ CryptoException -> 0x01cc }
            r3.flip()     // Catch:{ CryptoException -> 0x01cc }
            com.google.android.gms.internal.ads.zziv r3 = r14.zzaya     // Catch:{ CryptoException -> 0x01cc }
            r14.zza((com.google.android.gms.internal.ads.zziv) r3)     // Catch:{ CryptoException -> 0x01cc }
            if (r0 == 0) goto L_0x01ad
            com.google.android.gms.internal.ads.zziv r0 = r14.zzaya     // Catch:{ CryptoException -> 0x01cc }
            com.google.android.gms.internal.ads.zzir r0 = r0.zzamt     // Catch:{ CryptoException -> 0x01cc }
            android.media.MediaCodec$CryptoInfo r9 = r0.zzgh()     // Catch:{ CryptoException -> 0x01cc }
            if (r5 != 0) goto L_0x0194
            goto L_0x01a3
        L_0x0194:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01cc }
            if (r0 != 0) goto L_0x019c
            int[] r0 = new int[r4]     // Catch:{ CryptoException -> 0x01cc }
            r9.numBytesOfClearData = r0     // Catch:{ CryptoException -> 0x01cc }
        L_0x019c:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01cc }
            r3 = r0[r1]     // Catch:{ CryptoException -> 0x01cc }
            int r3 = r3 + r5
            r0[r1] = r3     // Catch:{ CryptoException -> 0x01cc }
        L_0x01a3:
            android.media.MediaCodec r6 = r14.zzayh     // Catch:{ CryptoException -> 0x01cc }
            int r7 = r14.zzayu     // Catch:{ CryptoException -> 0x01cc }
            r8 = 0
            r12 = 0
            r6.queueSecureInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01cc }
            goto L_0x01be
        L_0x01ad:
            android.media.MediaCodec r6 = r14.zzayh     // Catch:{ CryptoException -> 0x01cc }
            int r7 = r14.zzayu     // Catch:{ CryptoException -> 0x01cc }
            r8 = 0
            com.google.android.gms.internal.ads.zziv r0 = r14.zzaya     // Catch:{ CryptoException -> 0x01cc }
            java.nio.ByteBuffer r0 = r0.zzcs     // Catch:{ CryptoException -> 0x01cc }
            int r9 = r0.limit()     // Catch:{ CryptoException -> 0x01cc }
            r12 = 0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01cc }
        L_0x01be:
            r14.zzayu = r2     // Catch:{ CryptoException -> 0x01cc }
            r14.zzaza = r4     // Catch:{ CryptoException -> 0x01cc }
            r14.zzayy = r1     // Catch:{ CryptoException -> 0x01cc }
            com.google.android.gms.internal.ads.zzis r0 = r14.zzazg     // Catch:{ CryptoException -> 0x01cc }
            int r1 = r0.zzaml     // Catch:{ CryptoException -> 0x01cc }
            int r1 = r1 + r4
            r0.zzaml = r1     // Catch:{ CryptoException -> 0x01cc }
            return r4
        L_0x01cc:
            r0 = move-exception
            int r1 = r14.getIndex()
            com.google.android.gms.internal.ads.zzgk r0 = com.google.android.gms.internal.ads.zzgk.zza(r0, r1)
            throw r0
        L_0x01d6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkv.zzhd():boolean");
    }

    /* access modifiers changed from: protected */
    public void zzd(zzgz zzgz) throws zzgk {
        zziu zziu;
        MediaCodec mediaCodec;
        zzgz zzgz2 = this.zzagi;
        this.zzagi = zzgz;
        zziu zziu2 = this.zzagi.zzafq;
        if (zzgz2 == null) {
            zziu = null;
        } else {
            zziu = zzgz2.zzafq;
        }
        boolean zza = zzop.zza(zziu2, zziu);
        boolean z = true;
        if (!zza) {
            if (this.zzagi.zzafq != null) {
                zziz<zzjb> zziz = this.zzaxy;
                if (zziz != null) {
                    this.zzayg = zziz.zza(Looper.myLooper(), this.zzagi.zzafq);
                    zzix<zzjb> zzix = this.zzayg;
                    if (zzix == this.zzayf) {
                        this.zzaxy.zza(zzix);
                    }
                } else {
                    throw zzgk.zza(new IllegalStateException("Media requires a DrmSessionManager"), getIndex());
                }
            } else {
                this.zzayg = null;
            }
        }
        if (this.zzayg == this.zzayf && (mediaCodec = this.zzayh) != null && zza(mediaCodec, this.zzayi.zzazh, zzgz2, this.zzagi)) {
            this.zzayx = true;
            this.zzayy = 1;
            if (!(this.zzayl && this.zzagi.width == zzgz2.width && this.zzagi.height == zzgz2.height)) {
                z = false;
            }
            this.zzayq = z;
        } else if (this.zzaza) {
            this.zzayz = 1;
        } else {
            zzhc();
            zzgz();
        }
    }

    public boolean zzez() {
        return this.zzazd;
    }

    public boolean isReady() {
        if (this.zzagi == null || this.zzaze) {
            return false;
        }
        if (zzee() || this.zzayv >= 0) {
            return true;
        }
        return this.zzayt != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzayt;
    }

    private final boolean zzd(long j, long j2) throws zzgk {
        boolean z;
        boolean z2;
        if (this.zzayv < 0) {
            if (!this.zzayo || !this.zzazb) {
                this.zzayv = this.zzayh.dequeueOutputBuffer(this.zzaye, 0);
            } else {
                try {
                    this.zzayv = this.zzayh.dequeueOutputBuffer(this.zzaye, 0);
                } catch (IllegalStateException unused) {
                    zzhe();
                    if (this.zzazd) {
                        zzhc();
                    }
                    return false;
                }
            }
            int i = this.zzayv;
            if (i >= 0) {
                if (this.zzayr) {
                    this.zzayr = false;
                    this.zzayh.releaseOutputBuffer(i, false);
                    this.zzayv = -1;
                    return true;
                } else if ((this.zzaye.flags & 4) != 0) {
                    zzhe();
                    this.zzayv = -1;
                    return false;
                } else {
                    ByteBuffer byteBuffer = this.zzajq[this.zzayv];
                    if (byteBuffer != null) {
                        byteBuffer.position(this.zzaye.offset);
                        byteBuffer.limit(this.zzaye.offset + this.zzaye.size);
                    }
                    long j3 = this.zzaye.presentationTimeUs;
                    int size = this.zzayd.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            z2 = false;
                            break;
                        } else if (this.zzayd.get(i2).longValue() == j3) {
                            this.zzayd.remove(i2);
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    this.zzayw = z2;
                }
            } else if (i == -2) {
                MediaFormat outputFormat = this.zzayh.getOutputFormat();
                if (this.zzayl && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.zzayr = true;
                } else {
                    if (this.zzayp) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    onOutputFormatChanged(this.zzayh, outputFormat);
                }
                return true;
            } else if (i == -3) {
                this.zzajq = this.zzayh.getOutputBuffers();
                return true;
            } else {
                if (this.zzaym && (this.zzazc || this.zzayz == 2)) {
                    zzhe();
                }
                return false;
            }
        }
        if (!this.zzayo || !this.zzazb) {
            MediaCodec mediaCodec = this.zzayh;
            ByteBuffer[] byteBufferArr = this.zzajq;
            int i3 = this.zzayv;
            z = zza(j, j2, mediaCodec, byteBufferArr[i3], i3, this.zzaye.flags, this.zzaye.presentationTimeUs, this.zzayw);
        } else {
            try {
                z = zza(j, j2, this.zzayh, this.zzajq[this.zzayv], this.zzayv, this.zzaye.flags, this.zzaye.presentationTimeUs, this.zzayw);
            } catch (IllegalStateException unused2) {
                zzhe();
                if (this.zzazd) {
                    zzhc();
                }
                return false;
            }
        }
        if (!z) {
            return false;
        }
        long j4 = this.zzaye.presentationTimeUs;
        this.zzayv = -1;
        return true;
    }

    private final void zzhe() throws zzgk {
        if (this.zzayz == 2) {
            zzhc();
            zzgz();
            return;
        }
        this.zzazd = true;
        zzfz();
    }
}
