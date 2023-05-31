package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzjd implements zzjf {
    private static final byte[] zzamx = new byte[4096];
    private final zzno zzamy;
    private final long zzamz;
    private long zzana;
    private byte[] zzanb = new byte[65536];
    private int zzanc;
    private int zzand;

    public zzjd(zzno zzno, long j, long j2) {
        this.zzamy = zzno;
        this.zzana = j;
        this.zzamz = j2;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int zzb = zzb(bArr, i, i2);
        if (zzb == 0) {
            zzb = zza(bArr, i, i2, 0, true);
        }
        zzag(zzb);
        return zzb;
    }

    public final boolean zza(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int zzb = zzb(bArr, i, i2);
        while (zzb < i2 && zzb != -1) {
            zzb = zza(bArr, i, i2, zzb, z);
        }
        zzag(zzb);
        return zzb != -1;
    }

    public final void readFully(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        zza(bArr, i, i2, false);
    }

    public final int zzab(int i) throws IOException, InterruptedException {
        int zzae = zzae(i);
        if (zzae == 0) {
            byte[] bArr = zzamx;
            zzae = zza(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        zzag(zzae);
        return zzae;
    }

    public final void zzac(int i) throws IOException, InterruptedException {
        int zzae = zzae(i);
        while (zzae < i && zzae != -1) {
            byte[] bArr = zzamx;
            zzae = zza(bArr, -zzae, Math.min(i, bArr.length + zzae), zzae, false);
        }
        zzag(zzae);
    }

    public final void zza(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        if (zzd(i2, false)) {
            System.arraycopy(this.zzanb, this.zzanc - i2, bArr, i, i2);
        }
    }

    private final boolean zzd(int i, boolean z) throws IOException, InterruptedException {
        int i2 = this.zzanc + i;
        byte[] bArr = this.zzanb;
        if (i2 > bArr.length) {
            this.zzanb = Arrays.copyOf(this.zzanb, zzop.zzd(bArr.length << 1, 65536 + i2, i2 + 524288));
        }
        int min = Math.min(this.zzand - this.zzanc, i);
        while (min < i) {
            min = zza(this.zzanb, this.zzanc, i, min, false);
            if (min == -1) {
                return false;
            }
        }
        this.zzanc += i;
        this.zzand = Math.max(this.zzand, this.zzanc);
        return true;
    }

    public final void zzad(int i) throws IOException, InterruptedException {
        zzd(i, false);
    }

    public final void zzgm() {
        this.zzanc = 0;
    }

    public final long getPosition() {
        return this.zzana;
    }

    public final long getLength() {
        return this.zzamz;
    }

    private final int zzae(int i) {
        int min = Math.min(this.zzand, i);
        zzaf(min);
        return min;
    }

    private final int zzb(byte[] bArr, int i, int i2) {
        int i3 = this.zzand;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.zzanb, 0, bArr, i, min);
        zzaf(min);
        return min;
    }

    private final void zzaf(int i) {
        this.zzand -= i;
        this.zzanc = 0;
        byte[] bArr = this.zzanb;
        int i2 = this.zzand;
        if (i2 < bArr.length - 524288) {
            bArr = new byte[(i2 + 65536)];
        }
        System.arraycopy(this.zzanb, i, bArr, 0, this.zzand);
        this.zzanb = bArr;
    }

    private final int zza(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int read = this.zzamy.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    private final void zzag(int i) {
        if (i != -1) {
            this.zzana += (long) i;
        }
    }
}
