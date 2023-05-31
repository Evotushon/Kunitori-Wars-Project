package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzii extends zzkv implements zzof {
    private int zzafx;
    private int zzafz;
    /* access modifiers changed from: private */
    public final zzhq zzakv;
    private final zzhz zzakw;
    private boolean zzakx;
    private boolean zzaky;
    private MediaFormat zzakz;
    private long zzala;
    /* access modifiers changed from: private */
    public boolean zzalb;

    public zzii(zzkx zzkx) {
        this(zzkx, (zziz<zzjb>) null, true);
    }

    protected static void zzb(int i, long j, long j2) {
    }

    protected static void zzfy() {
    }

    protected static void zzs(int i) {
    }

    public final zzof zzdv() {
        return this;
    }

    private zzii(zzkx zzkx, zziz<zzjb> zziz, boolean z) {
        this(zzkx, (zziz<zzjb>) null, true, (zzdkp) null, (zzhr) null);
    }

    private zzii(zzkx zzkx, zziz<zzjb> zziz, boolean z, zzdkp zzdkp, zzhr zzhr) {
        this(zzkx, (zziz<zzjb>) null, true, (zzdkp) null, (zzhr) null, (zzhm) null, new zzhp[0]);
    }

    private zzii(zzkx zzkx, zziz<zzjb> zziz, boolean z, zzdkp zzdkp, zzhr zzhr, zzhm zzhm, zzhp... zzhpArr) {
        super(1, zzkx, zziz, z);
        this.zzakw = new zzhz((zzhm) null, zzhpArr, new zzik(this));
        this.zzakv = new zzhq((zzdkp) null, (zzhr) null);
    }

    /* access modifiers changed from: protected */
    public final int zza(zzkx zzkx, zzgz zzgz) throws zzld {
        String str = zzgz.zzafn;
        if (!zzoi.zzbi(str)) {
            return 0;
        }
        int i = zzop.SDK_INT >= 21 ? 16 : 0;
        int i2 = 3;
        if (zzbd(str) && zzkx.zzhg() != null) {
            return i | 4 | 3;
        }
        zzkw zzb = zzkx.zzb(str, false);
        boolean z = true;
        if (zzb == null) {
            return 1;
        }
        if (zzop.SDK_INT >= 21 && ((zzgz.zzafy != -1 && !zzb.zzaq(zzgz.zzafy)) || (zzgz.zzafx != -1 && !zzb.zzar(zzgz.zzafx)))) {
            z = false;
        }
        if (!z) {
            i2 = 2;
        }
        return i | 4 | i2;
    }

    /* access modifiers changed from: protected */
    public final zzkw zza(zzkx zzkx, zzgz zzgz, boolean z) throws zzld {
        zzkw zzhg;
        if (!zzbd(zzgz.zzafn) || (zzhg = zzkx.zzhg()) == null) {
            this.zzakx = false;
            return super.zza(zzkx, zzgz, z);
        }
        this.zzakx = true;
        return zzhg;
    }

    private final boolean zzbd(String str) {
        return this.zzakw.zzbb(str);
    }

    /* access modifiers changed from: protected */
    public final void zza(zzkw zzkw, MediaCodec mediaCodec, zzgz zzgz, MediaCrypto mediaCrypto) {
        this.zzaky = zzop.SDK_INT < 24 && "OMX.SEC.aac.dec".equals(zzkw.name) && "samsung".equals(zzop.MANUFACTURER) && (zzop.DEVICE.startsWith("zeroflte") || zzop.DEVICE.startsWith("herolte") || zzop.DEVICE.startsWith("heroqlte"));
        if (this.zzakx) {
            this.zzakz = zzgz.zzev();
            this.zzakz.setString("mime", "audio/raw");
            mediaCodec.configure(this.zzakz, (Surface) null, (MediaCrypto) null, 0);
            this.zzakz.setString("mime", zzgz.zzafn);
            return;
        }
        mediaCodec.configure(zzgz.zzev(), (Surface) null, (MediaCrypto) null, 0);
        this.zzakz = null;
    }

    /* access modifiers changed from: protected */
    public final void zzc(String str, long j, long j2) {
        this.zzakv.zza(str, j, j2);
    }

    /* access modifiers changed from: protected */
    public final void zzd(zzgz zzgz) throws zzgk {
        super.zzd(zzgz);
        this.zzakv.zzb(zzgz);
        this.zzafz = "audio/raw".equals(zzgz.zzafn) ? zzgz.zzafz : 2;
        this.zzafx = zzgz.zzafx;
    }

    /* access modifiers changed from: protected */
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzgk {
        int[] iArr;
        int i;
        boolean z = this.zzakz != null;
        String string = z ? this.zzakz.getString("mime") : "audio/raw";
        if (z) {
            mediaFormat = this.zzakz;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.zzaky || integer != 6 || (i = this.zzafx) >= 6) {
            iArr = null;
        } else {
            iArr = new int[i];
            for (int i2 = 0; i2 < this.zzafx; i2++) {
                iArr[i2] = i2;
            }
        }
        try {
            this.zzakw.zza(string, integer, integer2, this.zzafz, 0, iArr);
        } catch (zzid e) {
            throw zzgk.zza(e, getIndex());
        }
    }

    /* access modifiers changed from: protected */
    public final void zze(boolean z) throws zzgk {
        super.zze(z);
        this.zzakv.zza(this.zzazg);
        int i = zzed().zzago;
        if (i != 0) {
            this.zzakw.zzt(i);
        } else {
            this.zzakw.zzfo();
        }
    }

    /* access modifiers changed from: protected */
    public final void zza(long j, boolean z) throws zzgk {
        super.zza(j, z);
        this.zzakw.reset();
        this.zzala = j;
        this.zzalb = true;
    }

    /* access modifiers changed from: protected */
    public final void onStarted() {
        super.onStarted();
        this.zzakw.play();
    }

    /* access modifiers changed from: protected */
    public final void onStopped() {
        this.zzakw.pause();
        super.onStopped();
    }

    /* access modifiers changed from: protected */
    public final void zzec() {
        try {
            this.zzakw.release();
            try {
                super.zzec();
            } finally {
                this.zzazg.zzgi();
                this.zzakv.zzb(this.zzazg);
            }
        } catch (Throwable th) {
            super.zzec();
            throw th;
        } finally {
            this.zzazg.zzgi();
            this.zzakv.zzb(this.zzazg);
        }
    }

    public final boolean zzez() {
        return super.zzez() && this.zzakw.zzez();
    }

    public final boolean isReady() {
        return this.zzakw.zzfm() || super.isReady();
    }

    public final long zzfx() {
        long zzj = this.zzakw.zzj(zzez());
        if (zzj != Long.MIN_VALUE) {
            if (!this.zzalb) {
                zzj = Math.max(this.zzala, zzj);
            }
            this.zzala = zzj;
            this.zzalb = false;
        }
        return this.zzala;
    }

    public final zzhf zzb(zzhf zzhf) {
        return this.zzakw.zzb(zzhf);
    }

    public final zzhf zzfn() {
        return this.zzakw.zzfn();
    }

    /* access modifiers changed from: protected */
    public final boolean zza(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzgk {
        if (this.zzakx && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.zzazg.zzamn++;
            this.zzakw.zzfj();
            return true;
        } else {
            try {
                if (!this.zzakw.zza(byteBuffer, j3)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.zzazg.zzamm++;
                return true;
            } catch (zzic | zzih e) {
                throw zzgk.zza(e, getIndex());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzfz() throws zzgk {
        try {
            this.zzakw.zzfk();
        } catch (zzih e) {
            throw zzgk.zza(e, getIndex());
        }
    }

    public final void zza(int i, Object obj) throws zzgk {
        if (i == 2) {
            this.zzakw.setVolume(((Float) obj).floatValue());
        } else if (i != 3) {
            super.zza(i, obj);
        } else {
            this.zzakw.setStreamType(((Integer) obj).intValue());
        }
    }
}
