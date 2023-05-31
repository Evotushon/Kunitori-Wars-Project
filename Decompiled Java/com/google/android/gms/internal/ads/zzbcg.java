package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbcg implements zzhd {
    private int zzbfq;
    private final zzns zzedo;
    private long zzedp;
    private long zzedq;
    private long zzedr;
    private long zzeds;
    private boolean zzedt;

    zzbcg() {
        this(15000, 30000, 2500, 5000);
    }

    private zzbcg(int i, int i2, long j, long j2) {
        this.zzedo = new zzns(true, 65536);
        this.zzedp = 15000000;
        this.zzedq = 30000000;
        this.zzedr = 2500000;
        this.zzeds = 5000000;
    }

    public final void zzew() {
        zzk(false);
    }

    public final void zza(zzhe[] zzheArr, zzmu zzmu, zznf zznf) {
        this.zzbfq = 0;
        for (int i = 0; i < zzheArr.length; i++) {
            if (zznf.zzay(i) != null) {
                this.zzbfq += zzop.zzbl(zzheArr[i].getTrackType());
            }
        }
        this.zzedo.zzbb(this.zzbfq);
    }

    public final void onStopped() {
        zzk(true);
    }

    public final void zzex() {
        zzk(true);
    }

    public final zznm zzey() {
        return this.zzedo;
    }

    public final synchronized boolean zzc(long j, boolean z) {
        boolean z2;
        long j2 = z ? this.zzeds : this.zzedr;
        if (j2 <= 0 || j >= j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    public final synchronized boolean zzdt(long j) {
        char c;
        boolean z = false;
        if (j > this.zzedq) {
            c = 0;
        } else {
            c = j < this.zzedp ? (char) 2 : 1;
        }
        boolean z2 = this.zzedo.zzio() >= this.zzbfq;
        if (c == 2 || (c == 1 && this.zzedt && !z2)) {
            z = true;
        }
        this.zzedt = z;
        return this.zzedt;
    }

    public final synchronized void zzdc(int i) {
        this.zzedp = ((long) i) * 1000;
    }

    public final synchronized void zzdd(int i) {
        this.zzedq = ((long) i) * 1000;
    }

    public final synchronized void zzcx(int i) {
        this.zzedr = ((long) i) * 1000;
    }

    public final synchronized void zzcy(int i) {
        this.zzeds = ((long) i) * 1000;
    }

    @VisibleForTesting
    private final void zzk(boolean z) {
        this.zzbfq = 0;
        this.zzedt = false;
        if (z) {
            this.zzedo.reset();
        }
    }
}
