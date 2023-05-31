package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzpa extends zzkv {
    private static final int[] zzbhs = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private int zzago;
    private boolean zzajz;
    private final zzpe zzbht;
    private final zzpf zzbhu;
    private final long zzbhv;
    private final int zzbhw;
    private final boolean zzbhx;
    private final long[] zzbhy;
    private zzgz[] zzbhz;
    private zzpc zzbia;
    private Surface zzbib;
    private Surface zzbic;
    private int zzbid;
    private boolean zzbie;
    private long zzbif;
    private long zzbig;
    private int zzbih;
    private int zzbii;
    private int zzbij;
    private float zzbik;
    private int zzbil;
    private int zzbim;
    private int zzbin;
    private float zzbio;
    private int zzbip;
    private int zzbiq;
    private int zzbir;
    private float zzbis;
    zzpb zzbit;
    private long zzbiu;
    private int zzbiv;
    private final Context zzur;

    public zzpa(Context context, zzkx zzkx, long j, zzdkp zzdkp, zzpg zzpg, int i) {
        this(context, zzkx, 0, (zziz<zzjb>) null, false, zzdkp, zzpg, -1);
    }

    private static boolean zzem(long j) {
        return j < -30000;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzpa(Context context, zzkx zzkx, long j, zziz<zzjb> zziz, boolean z, zzdkp zzdkp, zzpg zzpg, int i) {
        super(2, zzkx, (zziz<zzjb>) null, false);
        boolean z2 = false;
        this.zzbhv = 0;
        this.zzbhw = -1;
        this.zzur = context.getApplicationContext();
        this.zzbht = new zzpe(context);
        this.zzbhu = new zzpf(zzdkp, zzpg);
        if (zzop.SDK_INT <= 22 && "foster".equals(zzop.DEVICE) && "NVIDIA".equals(zzop.MANUFACTURER)) {
            z2 = true;
        }
        this.zzbhx = z2;
        this.zzbhy = new long[10];
        this.zzbiu = -9223372036854775807L;
        this.zzbif = -9223372036854775807L;
        this.zzbil = -1;
        this.zzbim = -1;
        this.zzbio = -1.0f;
        this.zzbik = -1.0f;
        this.zzbid = 1;
        zzjh();
    }

    /* access modifiers changed from: protected */
    public final int zza(zzkx zzkx, zzgz zzgz) throws zzld {
        boolean z;
        String str = zzgz.zzafn;
        int i = 0;
        if (!zzoi.zzbj(str)) {
            return 0;
        }
        zziu zziu = zzgz.zzafq;
        if (zziu != null) {
            z = false;
            for (int i2 = 0; i2 < zziu.zzams; i2++) {
                z |= zziu.zzy(i2).zzamw;
            }
        } else {
            z = false;
        }
        zzkw zzb = zzkx.zzb(str, z);
        if (zzb == null) {
            return 1;
        }
        boolean zzbf = zzb.zzbf(zzgz.zzafk);
        if (zzbf && zzgz.width > 0 && zzgz.height > 0) {
            if (zzop.SDK_INT >= 21) {
                zzbf = zzb.zza(zzgz.width, zzgz.height, (double) zzgz.zzafr);
            } else {
                zzbf = zzgz.width * zzgz.height <= zzkz.zzhh();
                if (!zzbf) {
                    int i3 = zzgz.width;
                    int i4 = zzgz.height;
                    String str2 = zzop.zzbhc;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                    sb.append("FalseCheck [legacyFrameSize, ");
                    sb.append(i3);
                    sb.append("x");
                    sb.append(i4);
                    sb.append("] [");
                    sb.append(str2);
                    sb.append("]");
                    Log.d("MediaCodecVideoRenderer", sb.toString());
                }
            }
        }
        int i5 = zzb.zzazh ? 8 : 4;
        if (zzb.zzajz) {
            i = 16;
        }
        return (zzbf ? 3 : 2) | i5 | i;
    }

    /* access modifiers changed from: protected */
    public final void zze(boolean z) throws zzgk {
        super.zze(z);
        this.zzago = zzed().zzago;
        this.zzajz = this.zzago != 0;
        this.zzbhu.zza(this.zzazg);
        this.zzbht.enable();
    }

    /* access modifiers changed from: protected */
    public final void zza(zzgz[] zzgzArr, long j) throws zzgk {
        this.zzbhz = zzgzArr;
        if (this.zzbiu == -9223372036854775807L) {
            this.zzbiu = j;
        } else {
            int i = this.zzbiv;
            long[] jArr = this.zzbhy;
            if (i == jArr.length) {
                long j2 = jArr[i - 1];
                StringBuilder sb = new StringBuilder(65);
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(j2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
            } else {
                this.zzbiv = i + 1;
            }
            this.zzbhy[this.zzbiv - 1] = j;
        }
        super.zza(zzgzArr, j);
    }

    /* access modifiers changed from: protected */
    public final void zza(long j, boolean z) throws zzgk {
        super.zza(j, z);
        zzjf();
        this.zzbii = 0;
        int i = this.zzbiv;
        if (i != 0) {
            this.zzbiu = this.zzbhy[i - 1];
            this.zzbiv = 0;
        }
        if (z) {
            zzje();
        } else {
            this.zzbif = -9223372036854775807L;
        }
    }

    public final boolean isReady() {
        Surface surface;
        if (super.isReady() && (this.zzbie || (((surface = this.zzbic) != null && this.zzbib == surface) || zzha() == null))) {
            this.zzbif = -9223372036854775807L;
            return true;
        } else if (this.zzbif == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.zzbif) {
                return true;
            }
            this.zzbif = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onStarted() {
        super.onStarted();
        this.zzbih = 0;
        this.zzbig = SystemClock.elapsedRealtime();
        this.zzbif = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    public final void onStopped() {
        zzjk();
        super.onStopped();
    }

    /* access modifiers changed from: protected */
    public final void zzec() {
        this.zzbil = -1;
        this.zzbim = -1;
        this.zzbio = -1.0f;
        this.zzbik = -1.0f;
        this.zzbiu = -9223372036854775807L;
        this.zzbiv = 0;
        zzjh();
        zzjf();
        this.zzbht.disable();
        this.zzbit = null;
        this.zzajz = false;
        try {
            super.zzec();
        } finally {
            this.zzazg.zzgi();
            this.zzbhu.zzb(this.zzazg);
        }
    }

    public final void zza(int i, Object obj) throws zzgk {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.zzbic;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    zzkw zzhb = zzhb();
                    if (zzhb != null && zzn(zzhb.zzazi)) {
                        this.zzbic = zzow.zzc(this.zzur, zzhb.zzazi);
                        surface = this.zzbic;
                    }
                }
            }
            if (this.zzbib != surface) {
                this.zzbib = surface;
                int state = getState();
                if (state == 1 || state == 2) {
                    MediaCodec zzha = zzha();
                    if (zzop.SDK_INT < 23 || zzha == null || surface == null) {
                        zzhc();
                        zzgz();
                    } else {
                        zzha.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.zzbic) {
                    zzjh();
                    zzjf();
                    return;
                }
                zzjj();
                zzjf();
                if (state == 2) {
                    zzje();
                }
            } else if (surface != null && surface != this.zzbic) {
                zzjj();
                if (this.zzbie) {
                    this.zzbhu.zza(this.zzbib);
                }
            }
        } else if (i == 4) {
            this.zzbid = ((Integer) obj).intValue();
            MediaCodec zzha2 = zzha();
            if (zzha2 != null) {
                zzha2.setVideoScalingMode(this.zzbid);
            }
        } else {
            super.zza(i, obj);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zza(zzkw zzkw) {
        return this.zzbib != null || zzn(zzkw.zzazi);
    }

    /* access modifiers changed from: protected */
    public final void zza(zzkw zzkw, MediaCodec mediaCodec, zzgz zzgz, MediaCrypto mediaCrypto) throws zzld {
        zzpc zzpc;
        int i;
        Point point;
        float f;
        zzkw zzkw2 = zzkw;
        MediaCodec mediaCodec2 = mediaCodec;
        zzgz zzgz2 = zzgz;
        zzgz[] zzgzArr = this.zzbhz;
        int i2 = zzgz2.width;
        int i3 = zzgz2.height;
        int zzi = zzi(zzgz);
        if (zzgzArr.length == 1) {
            zzpc = new zzpc(i2, i3, zzi);
        } else {
            int i4 = i3;
            int i5 = zzi;
            boolean z = false;
            int i6 = i2;
            for (zzgz zzgz3 : zzgzArr) {
                if (zza(zzkw2.zzazh, zzgz2, zzgz3)) {
                    z |= zzgz3.width == -1 || zzgz3.height == -1;
                    i6 = Math.max(i6, zzgz3.width);
                    int max = Math.max(i4, zzgz3.height);
                    i5 = Math.max(i5, zzi(zzgz3));
                    i4 = max;
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i6);
                sb.append("x");
                sb.append(i4);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                boolean z2 = zzgz2.height > zzgz2.width;
                int i7 = z2 ? zzgz2.height : zzgz2.width;
                int i8 = z2 ? zzgz2.width : zzgz2.height;
                float f2 = ((float) i8) / ((float) i7);
                int[] iArr = zzbhs;
                int length = iArr.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        break;
                    }
                    int i10 = length;
                    int i11 = iArr[i9];
                    int[] iArr2 = iArr;
                    int i12 = (int) (((float) i11) * f2);
                    if (i11 <= i7 || i12 <= i8) {
                        break;
                    }
                    int i13 = i7;
                    int i14 = i8;
                    if (zzop.SDK_INT >= 21) {
                        int i15 = z2 ? i12 : i11;
                        if (z2) {
                            i12 = i11;
                        }
                        Point zzd = zzkw2.zzd(i15, i12);
                        i = i5;
                        f = f2;
                        if (zzkw2.zza(zzd.x, zzd.y, (double) zzgz2.zzafr)) {
                            point = zzd;
                            break;
                        }
                    } else {
                        i = i5;
                        f = f2;
                        int zzf = zzop.zzf(i11, 16) << 4;
                        int zzf2 = zzop.zzf(i12, 16) << 4;
                        if (zzf * zzf2 <= zzkz.zzhh()) {
                            int i16 = z2 ? zzf2 : zzf;
                            if (z2) {
                                zzf2 = zzf;
                            }
                            point = new Point(i16, zzf2);
                        }
                    }
                    i9++;
                    length = i10;
                    iArr = iArr2;
                    i7 = i13;
                    i8 = i14;
                    i5 = i;
                    f2 = f;
                }
                i = i5;
                point = null;
                if (point != null) {
                    i6 = Math.max(i6, point.x);
                    i4 = Math.max(i4, point.y);
                    i5 = Math.max(i, zza(zzgz2.zzafn, i6, i4));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i6);
                    sb2.append("x");
                    sb2.append(i4);
                    Log.w("MediaCodecVideoRenderer", sb2.toString());
                } else {
                    i5 = i;
                }
            }
            zzpc = new zzpc(i6, i4, i5);
        }
        this.zzbia = zzpc;
        zzpc zzpc2 = this.zzbia;
        boolean z3 = this.zzbhx;
        int i17 = this.zzago;
        MediaFormat zzev = zzgz.zzev();
        zzev.setInteger("max-width", zzpc2.width);
        zzev.setInteger("max-height", zzpc2.height);
        if (zzpc2.zzbix != -1) {
            zzev.setInteger("max-input-size", zzpc2.zzbix);
        }
        if (z3) {
            zzev.setInteger("auto-frc", 0);
        }
        if (i17 != 0) {
            zzev.setFeatureEnabled("tunneled-playback", true);
            zzev.setInteger("audio-session-id", i17);
        }
        if (this.zzbib == null) {
            zzob.checkState(zzn(zzkw2.zzazi));
            if (this.zzbic == null) {
                this.zzbic = zzow.zzc(this.zzur, zzkw2.zzazi);
            }
            this.zzbib = this.zzbic;
        }
        mediaCodec2.configure(zzev, this.zzbib, (MediaCrypto) null, 0);
        if (zzop.SDK_INT >= 23 && this.zzajz) {
            this.zzbit = new zzpb(this, mediaCodec2);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzhc() {
        try {
            super.zzhc();
        } finally {
            Surface surface = this.zzbic;
            if (surface != null) {
                if (this.zzbib == surface) {
                    this.zzbib = null;
                }
                this.zzbic.release();
                this.zzbic = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzc(String str, long j, long j2) {
        this.zzbhu.zza(str, j, j2);
    }

    /* access modifiers changed from: protected */
    public final void zzd(zzgz zzgz) throws zzgk {
        super.zzd(zzgz);
        this.zzbhu.zzb(zzgz);
        this.zzbik = zzgz.zzaft == -1.0f ? 1.0f : zzgz.zzaft;
        this.zzbij = zzj(zzgz);
    }

    /* access modifiers changed from: protected */
    public final void zza(zziv zziv) {
        if (zzop.SDK_INT < 23 && this.zzajz) {
            zzjg();
        }
    }

    /* access modifiers changed from: protected */
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.zzbil = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.zzbim = i2;
        this.zzbio = this.zzbik;
        if (zzop.SDK_INT >= 21) {
            int i3 = this.zzbij;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.zzbil;
                this.zzbil = this.zzbim;
                this.zzbim = i4;
                this.zzbio = 1.0f / this.zzbio;
            }
        } else {
            this.zzbin = this.zzbij;
        }
        mediaCodec.setVideoScalingMode(this.zzbid);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(MediaCodec mediaCodec, boolean z, zzgz zzgz, zzgz zzgz2) {
        return zza(z, zzgz, zzgz2) && zzgz2.width <= this.zzbia.width && zzgz2.height <= this.zzbia.height && zzgz2.zzafo <= this.zzbia.zzbix;
    }

    /* access modifiers changed from: protected */
    public final boolean zza(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j4 = j3;
        while (true) {
            int i4 = this.zzbiv;
            if (i4 == 0) {
                break;
            }
            long[] jArr = this.zzbhy;
            if (j4 < jArr[0]) {
                break;
            }
            this.zzbiu = jArr[0];
            this.zzbiv = i4 - 1;
            System.arraycopy(jArr, 1, jArr, 0, this.zzbiv);
        }
        long j5 = j4 - this.zzbiu;
        if (z) {
            zza(mediaCodec2, i3, j5);
            return true;
        }
        long j6 = j4 - j;
        if (this.zzbib == this.zzbic) {
            if (!zzem(j6)) {
                return false;
            }
            zza(mediaCodec2, i3, j5);
            return true;
        } else if (!this.zzbie) {
            if (zzop.SDK_INT >= 21) {
                zza(mediaCodec, i, j5, System.nanoTime());
            } else {
                zzb(mediaCodec2, i3, j5);
            }
            return true;
        } else if (getState() != 2) {
            return false;
        } else {
            long elapsedRealtime = j6 - ((SystemClock.elapsedRealtime() * 1000) - j2);
            long nanoTime = System.nanoTime();
            long zzf = this.zzbht.zzf(j4, (elapsedRealtime * 1000) + nanoTime);
            long j7 = (zzf - nanoTime) / 1000;
            if (zzem(j7)) {
                zzoq.beginSection("dropVideoBuffer");
                mediaCodec2.releaseOutputBuffer(i3, false);
                zzoq.endSection();
                this.zzazg.zzamo++;
                this.zzbih++;
                this.zzbii++;
                this.zzazg.zzamp = Math.max(this.zzbii, this.zzazg.zzamp);
                if (this.zzbih == this.zzbhw) {
                    zzjk();
                }
                return true;
            }
            if (zzop.SDK_INT >= 21) {
                if (j7 < 50000) {
                    zza(mediaCodec, i, j5, zzf);
                    return true;
                }
            } else if (j7 < 30000) {
                if (j7 > 11000) {
                    try {
                        Thread.sleep((j7 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                zzb(mediaCodec2, i3, j5);
                return true;
            }
            return false;
        }
    }

    private final void zza(MediaCodec mediaCodec, int i, long j) {
        zzoq.beginSection("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        zzoq.endSection();
        this.zzazg.zzamn++;
    }

    private final void zzb(MediaCodec mediaCodec, int i, long j) {
        zzji();
        zzoq.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        zzoq.endSection();
        this.zzazg.zzamm++;
        this.zzbii = 0;
        zzjg();
    }

    @TargetApi(21)
    private final void zza(MediaCodec mediaCodec, int i, long j, long j2) {
        zzji();
        zzoq.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        zzoq.endSection();
        this.zzazg.zzamm++;
        this.zzbii = 0;
        zzjg();
    }

    private final boolean zzn(boolean z) {
        if (zzop.SDK_INT < 23 || this.zzajz) {
            return false;
        }
        return !z || zzow.zzd(this.zzur);
    }

    private final void zzje() {
        this.zzbif = this.zzbhv > 0 ? SystemClock.elapsedRealtime() + this.zzbhv : -9223372036854775807L;
    }

    private final void zzjf() {
        MediaCodec zzha;
        this.zzbie = false;
        if (zzop.SDK_INT >= 23 && this.zzajz && (zzha = zzha()) != null) {
            this.zzbit = new zzpb(this, zzha);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzjg() {
        if (!this.zzbie) {
            this.zzbie = true;
            this.zzbhu.zza(this.zzbib);
        }
    }

    private final void zzjh() {
        this.zzbip = -1;
        this.zzbiq = -1;
        this.zzbis = -1.0f;
        this.zzbir = -1;
    }

    private final void zzji() {
        if (this.zzbip != this.zzbil || this.zzbiq != this.zzbim || this.zzbir != this.zzbin || this.zzbis != this.zzbio) {
            this.zzbhu.zza(this.zzbil, this.zzbim, this.zzbin, this.zzbio);
            this.zzbip = this.zzbil;
            this.zzbiq = this.zzbim;
            this.zzbir = this.zzbin;
            this.zzbis = this.zzbio;
        }
    }

    private final void zzjj() {
        if (this.zzbip != -1 || this.zzbiq != -1) {
            this.zzbhu.zza(this.zzbil, this.zzbim, this.zzbin, this.zzbio);
        }
    }

    private final void zzjk() {
        if (this.zzbih > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzbhu.zze(this.zzbih, elapsedRealtime - this.zzbig);
            this.zzbih = 0;
            this.zzbig = elapsedRealtime;
        }
    }

    private static int zzi(zzgz zzgz) {
        if (zzgz.zzafo != -1) {
            return zzgz.zzafo;
        }
        return zza(zzgz.zzafn, zzgz.width, zzgz.height);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zza(java.lang.String r7, int r8, int r9) {
        /*
            r0 = -1
            if (r8 == r0) goto L_0x0086
            if (r9 != r0) goto L_0x0007
            goto L_0x0086
        L_0x0007:
            int r1 = r7.hashCode()
            r2 = 5
            r3 = 1
            r4 = 3
            r5 = 4
            r6 = 2
            switch(r1) {
                case -1664118616: goto L_0x0046;
                case -1662541442: goto L_0x003c;
                case 1187890754: goto L_0x0032;
                case 1331836730: goto L_0x0028;
                case 1599127256: goto L_0x001e;
                case 1599127257: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0050
        L_0x0014:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 5
            goto L_0x0051
        L_0x001e:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 3
            goto L_0x0051
        L_0x0028:
            java.lang.String r1 = "video/avc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 2
            goto L_0x0051
        L_0x0032:
            java.lang.String r1 = "video/mp4v-es"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 1
            goto L_0x0051
        L_0x003c:
            java.lang.String r1 = "video/hevc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 4
            goto L_0x0051
        L_0x0046:
            java.lang.String r1 = "video/3gpp"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 0
            goto L_0x0051
        L_0x0050:
            r7 = -1
        L_0x0051:
            if (r7 == 0) goto L_0x007d
            if (r7 == r3) goto L_0x007d
            if (r7 == r6) goto L_0x0061
            if (r7 == r4) goto L_0x007d
            if (r7 == r5) goto L_0x005e
            if (r7 == r2) goto L_0x005e
            return r0
        L_0x005e:
            int r8 = r8 * r9
            goto L_0x0080
        L_0x0061:
            java.lang.String r7 = com.google.android.gms.internal.ads.zzop.MODEL
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x006c
            return r0
        L_0x006c:
            r7 = 16
            int r8 = com.google.android.gms.internal.ads.zzop.zzf(r8, r7)
            int r7 = com.google.android.gms.internal.ads.zzop.zzf(r9, r7)
            int r8 = r8 * r7
            int r7 = r8 << 4
            int r8 = r7 << 4
            goto L_0x007f
        L_0x007d:
            int r8 = r8 * r9
        L_0x007f:
            r5 = 2
        L_0x0080:
            int r8 = r8 * 3
            int r5 = r5 * 2
            int r8 = r8 / r5
            return r8
        L_0x0086:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpa.zza(java.lang.String, int, int):int");
    }

    private static boolean zza(boolean z, zzgz zzgz, zzgz zzgz2) {
        if (!zzgz.zzafn.equals(zzgz2.zzafn) || zzj(zzgz) != zzj(zzgz2)) {
            return false;
        }
        if (!z) {
            return zzgz.width == zzgz2.width && zzgz.height == zzgz2.height;
        }
        return true;
    }

    private static int zzj(zzgz zzgz) {
        if (zzgz.zzafs == -1) {
            return 0;
        }
        return zzgz.zzafs;
    }
}
