package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzns implements zznm {
    private final boolean zzbfm;
    private final int zzbfn;
    private final byte[] zzbfo;
    private final zznj[] zzbfp;
    private int zzbfq;
    private int zzbfr;
    private int zzbfs;
    private zznj[] zzbft;

    public zzns(boolean z, int i) {
        this(true, 65536, 0);
    }

    private zzns(boolean z, int i, int i2) {
        zzob.checkArgument(true);
        zzob.checkArgument(true);
        this.zzbfm = true;
        this.zzbfn = 65536;
        this.zzbfs = 0;
        this.zzbft = new zznj[100];
        this.zzbfo = null;
        this.zzbfp = new zznj[1];
    }

    public final synchronized void reset() {
        if (this.zzbfm) {
            zzbb(0);
        }
    }

    public final synchronized void zzbb(int i) {
        boolean z = i < this.zzbfq;
        this.zzbfq = i;
        if (z) {
            zzn();
        }
    }

    public final synchronized zznj zzik() {
        zznj zznj;
        this.zzbfr++;
        if (this.zzbfs > 0) {
            zznj[] zznjArr = this.zzbft;
            int i = this.zzbfs - 1;
            this.zzbfs = i;
            zznj = zznjArr[i];
            this.zzbft[this.zzbfs] = null;
        } else {
            zznj = new zznj(new byte[this.zzbfn], 0);
        }
        return zznj;
    }

    public final synchronized void zza(zznj zznj) {
        this.zzbfp[0] = zznj;
        zza(this.zzbfp);
    }

    public final synchronized void zza(zznj[] zznjArr) {
        boolean z;
        if (this.zzbfs + zznjArr.length >= this.zzbft.length) {
            this.zzbft = (zznj[]) Arrays.copyOf(this.zzbft, Math.max(this.zzbft.length << 1, this.zzbfs + zznjArr.length));
        }
        for (zznj zznj : zznjArr) {
            if (zznj.data != null) {
                if (zznj.data.length != this.zzbfn) {
                    z = false;
                    zzob.checkArgument(z);
                    zznj[] zznjArr2 = this.zzbft;
                    int i = this.zzbfs;
                    this.zzbfs = i + 1;
                    zznjArr2[i] = zznj;
                }
            }
            z = true;
            zzob.checkArgument(z);
            zznj[] zznjArr22 = this.zzbft;
            int i2 = this.zzbfs;
            this.zzbfs = i2 + 1;
            zznjArr22[i2] = zznj;
        }
        this.zzbfr -= zznjArr.length;
        notifyAll();
    }

    public final synchronized void zzn() {
        int max = Math.max(0, zzop.zzf(this.zzbfq, this.zzbfn) - this.zzbfr);
        if (max < this.zzbfs) {
            Arrays.fill(this.zzbft, max, this.zzbfs, (Object) null);
            this.zzbfs = max;
        }
    }

    public final synchronized int zzio() {
        return this.zzbfr * this.zzbfn;
    }

    public final int zzil() {
        return this.zzbfn;
    }
}
