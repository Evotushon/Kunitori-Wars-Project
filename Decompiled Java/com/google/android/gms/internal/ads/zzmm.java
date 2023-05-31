package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzmm implements zzjn {
    private final zzom zzaod = new zzom(32);
    private final zznm zzbaf;
    private final int zzbcu;
    private final zzmk zzbcv = new zzmk();
    private final zzmj zzbcw = new zzmj();
    private final AtomicInteger zzbcx = new AtomicInteger();
    private zzml zzbcy;
    private zzml zzbcz;
    private zzgz zzbda;
    private boolean zzbdb;
    private zzgz zzbdc;
    private long zzbdd;
    private int zzbde;
    private zzmo zzbdf;

    public zzmm(zznm zznm) {
        this.zzbaf = zznm;
        this.zzbcu = zznm.zzil();
        int i = this.zzbcu;
        this.zzbde = i;
        this.zzbcy = new zzml(0, i);
        this.zzbcz = this.zzbcy;
    }

    public final void zzk(boolean z) {
        int andSet = this.zzbcx.getAndSet(z ? 0 : 2);
        zzhy();
        this.zzbcv.zzhz();
        if (andSet == 2) {
            this.zzbda = null;
        }
    }

    public final int zzia() {
        return this.zzbcv.zzia();
    }

    public final void disable() {
        if (this.zzbcx.getAndSet(2) == 0) {
            zzhy();
        }
    }

    public final boolean zzib() {
        return this.zzbcv.zzib();
    }

    public final zzgz zzic() {
        return this.zzbcv.zzic();
    }

    public final long zzhs() {
        return this.zzbcv.zzhs();
    }

    public final void zzif() {
        long zzid = this.zzbcv.zzid();
        if (zzid != -1) {
            zzej(zzid);
        }
    }

    public final boolean zze(long j, boolean z) {
        long zzd = this.zzbcv.zzd(j, z);
        if (zzd == -1) {
            return false;
        }
        zzej(zzd);
        return true;
    }

    public final int zza(zzhb zzhb, zziv zziv, boolean z, boolean z2, long j) {
        int i;
        zziv zziv2 = zziv;
        int zza = this.zzbcv.zza(zzhb, zziv, z, z2, this.zzbda, this.zzbcw);
        if (zza == -5) {
            this.zzbda = zzhb.zzagi;
            return -5;
        } else if (zza == -4) {
            if (!zziv.zzgd()) {
                if (zziv2.zzamu < j) {
                    zziv2.zzw(Integer.MIN_VALUE);
                }
                if (zziv.zzgj()) {
                    zzmj zzmj = this.zzbcw;
                    long j2 = zzmj.zzavf;
                    this.zzaod.reset(1);
                    zza(j2, this.zzaod.data, 1);
                    long j3 = j2 + 1;
                    byte b = this.zzaod.data[0];
                    boolean z3 = (b & 128) != 0;
                    byte b2 = b & Byte.MAX_VALUE;
                    if (zziv2.zzamt.iv == null) {
                        zziv2.zzamt.iv = new byte[16];
                    }
                    zza(j3, zziv2.zzamt.iv, (int) b2);
                    long j4 = j3 + ((long) b2);
                    if (z3) {
                        this.zzaod.reset(2);
                        zza(j4, this.zzaod.data, 2);
                        j4 += 2;
                        i = this.zzaod.readUnsignedShort();
                    } else {
                        i = 1;
                    }
                    int[] iArr = zziv2.zzamt.numBytesOfClearData;
                    if (iArr == null || iArr.length < i) {
                        iArr = new int[i];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = zziv2.zzamt.numBytesOfEncryptedData;
                    if (iArr3 == null || iArr3.length < i) {
                        iArr3 = new int[i];
                    }
                    int[] iArr4 = iArr3;
                    if (z3) {
                        int i2 = i * 6;
                        this.zzaod.reset(i2);
                        zza(j4, this.zzaod.data, i2);
                        j4 += (long) i2;
                        this.zzaod.zzbh(0);
                        for (int i3 = 0; i3 < i; i3++) {
                            iArr2[i3] = this.zzaod.readUnsignedShort();
                            iArr4[i3] = this.zzaod.zzjc();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = zzmj.size - ((int) (j4 - zzmj.zzavf));
                    }
                    zzjq zzjq = zzmj.zzapz;
                    zziv2.zzamt.set(i, iArr2, iArr4, zzjq.zzans, zziv2.zzamt.iv, zzjq.zzanr);
                    int i4 = (int) (j4 - zzmj.zzavf);
                    zzmj.zzavf += (long) i4;
                    zzmj.size -= i4;
                }
                zziv2.zzz(this.zzbcw.size);
                long j5 = this.zzbcw.zzavf;
                ByteBuffer byteBuffer = zziv2.zzcs;
                int i5 = this.zzbcw.size;
                zzej(j5);
                while (i5 > 0) {
                    int i6 = (int) (j5 - this.zzbcy.zzbcq);
                    int min = Math.min(i5, this.zzbcu - i6);
                    zznj zznj = this.zzbcy.zzbcs;
                    byteBuffer.put(zznj.data, zznj.zzaz(i6), min);
                    j5 += (long) min;
                    i5 -= min;
                    if (j5 == this.zzbcy.zzare) {
                        this.zzbaf.zza(zznj);
                        this.zzbcy = this.zzbcy.zzie();
                    }
                }
                zzej(this.zzbcw.zzbcd);
            }
            return -4;
        } else if (zza == -3) {
            return -3;
        } else {
            throw new IllegalStateException();
        }
    }

    private final void zza(long j, byte[] bArr, int i) {
        zzej(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.zzbcy.zzbcq);
            int min = Math.min(i - i2, this.zzbcu - i3);
            zznj zznj = this.zzbcy.zzbcs;
            System.arraycopy(zznj.data, zznj.zzaz(i3), bArr, i2, min);
            j += (long) min;
            i2 += min;
            if (j == this.zzbcy.zzare) {
                this.zzbaf.zza(zznj);
                this.zzbcy = this.zzbcy.zzie();
            }
        }
    }

    private final void zzej(long j) {
        while (j >= this.zzbcy.zzare) {
            this.zzbaf.zza(this.zzbcy.zzbcs);
            this.zzbcy = this.zzbcy.zzie();
        }
    }

    public final void zza(zzmo zzmo) {
        this.zzbdf = zzmo;
    }

    public final void zze(zzgz zzgz) {
        zzgz zzgz2 = zzgz == null ? null : zzgz;
        boolean zzg = this.zzbcv.zzg(zzgz2);
        this.zzbdc = zzgz;
        this.zzbdb = false;
        zzmo zzmo = this.zzbdf;
        if (zzmo != null && zzg) {
            zzmo.zzf(zzgz2);
        }
    }

    public final int zza(zzjf zzjf, int i, boolean z) throws IOException, InterruptedException {
        if (!zzig()) {
            int zzab = zzjf.zzab(i);
            if (zzab != -1) {
                return zzab;
            }
            throw new EOFException();
        }
        try {
            int zzau = zzau(i);
            zznj zznj = this.zzbcz.zzbcs;
            int read = zzjf.read(zznj.data, zznj.zzaz(this.zzbde), zzau);
            if (read != -1) {
                this.zzbde += read;
                this.zzbdd += (long) read;
                return read;
            }
            throw new EOFException();
        } finally {
            zzih();
        }
    }

    public final void zza(zzom zzom, int i) {
        if (!zzig()) {
            zzom.zzbi(i);
            return;
        }
        while (i > 0) {
            int zzau = zzau(i);
            zznj zznj = this.zzbcz.zzbcs;
            zzom.zze(zznj.data, zznj.zzaz(this.zzbde), zzau);
            this.zzbde += zzau;
            this.zzbdd += (long) zzau;
            i -= zzau;
        }
        zzih();
    }

    public final void zza(long j, int i, int i2, int i3, zzjq zzjq) {
        if (!zzig()) {
            long j2 = j;
            this.zzbcv.zzei(j);
            return;
        }
        long j3 = j;
        try {
            this.zzbcv.zza(j, i, this.zzbdd - ((long) i2), i2, zzjq);
        } finally {
            zzih();
        }
    }

    private final boolean zzig() {
        return this.zzbcx.compareAndSet(0, 1);
    }

    private final void zzih() {
        if (!this.zzbcx.compareAndSet(1, 0)) {
            zzhy();
        }
    }

    private final void zzhy() {
        this.zzbcv.zzhy();
        zzml zzml = this.zzbcy;
        if (zzml.zzbcr) {
            zznj[] zznjArr = new zznj[((this.zzbcz.zzbcr ? 1 : 0) + (((int) (this.zzbcz.zzbcq - zzml.zzbcq)) / this.zzbcu))];
            for (int i = 0; i < zznjArr.length; i++) {
                zznjArr[i] = zzml.zzbcs;
                zzml = zzml.zzie();
            }
            this.zzbaf.zza(zznjArr);
        }
        this.zzbcy = new zzml(0, this.zzbcu);
        this.zzbcz = this.zzbcy;
        this.zzbdd = 0;
        this.zzbde = this.zzbcu;
        this.zzbaf.zzn();
    }

    private final int zzau(int i) {
        if (this.zzbde == this.zzbcu) {
            this.zzbde = 0;
            if (this.zzbcz.zzbcr) {
                this.zzbcz = this.zzbcz.zzbct;
            }
            zzml zzml = this.zzbcz;
            zznj zzik = this.zzbaf.zzik();
            zzml zzml2 = new zzml(this.zzbcz.zzare, this.zzbcu);
            zzml.zzbcs = zzik;
            zzml.zzbct = zzml2;
            zzml.zzbcr = true;
        }
        return Math.min(i, this.zzbcu - this.zzbde);
    }
}
