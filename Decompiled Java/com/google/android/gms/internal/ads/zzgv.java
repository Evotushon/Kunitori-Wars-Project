package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzgv {
    public final int index;
    private final zzhe[] zzacx;
    private final zzni zzacy;
    private final zzhh[] zzadu;
    private final zzhd zzadv;
    private final zzme zzaec;
    public int zzaeq;
    public long zzaer;
    public final zzmc zzaeu;
    public final Object zzaev;
    public final zzmn[] zzaew;
    private final boolean[] zzaex;
    public final long zzaey;
    public boolean zzaez;
    public boolean zzafa;
    public boolean zzafb;
    public zzgv zzafc;
    public zznk zzafd;
    private zznk zzafe;

    public zzgv(zzhe[] zzheArr, zzhh[] zzhhArr, long j, zzni zzni, zzhd zzhd, zzme zzme, Object obj, int i, int i2, boolean z, long j2) {
        this.zzacx = zzheArr;
        this.zzadu = zzhhArr;
        this.zzaey = j;
        this.zzacy = zzni;
        this.zzadv = zzhd;
        this.zzaec = zzme;
        this.zzaev = zzob.checkNotNull(obj);
        this.index = i;
        this.zzaeq = i2;
        this.zzaez = z;
        this.zzaer = j2;
        this.zzaew = new zzmn[zzheArr.length];
        this.zzaex = new boolean[zzheArr.length];
        this.zzaeu = zzme.zza(i2, zzhd.zzey());
    }

    public final long zzer() {
        return this.zzaey - this.zzaer;
    }

    public final void zzc(int i, boolean z) {
        this.zzaeq = i;
        this.zzaez = z;
    }

    public final boolean zzes() {
        if (this.zzafa) {
            return !this.zzafb || this.zzaeu.zzho() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzet() throws com.google.android.gms.internal.ads.zzgk {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzni r0 = r6.zzacy
            com.google.android.gms.internal.ads.zzhh[] r1 = r6.zzadu
            com.google.android.gms.internal.ads.zzmc r2 = r6.zzaeu
            com.google.android.gms.internal.ads.zzmu r2 = r2.zzhm()
            com.google.android.gms.internal.ads.zznk r0 = r0.zza(r1, r2)
            com.google.android.gms.internal.ads.zznk r1 = r6.zzafe
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            r1 = 0
            goto L_0x0028
        L_0x0016:
            r4 = 0
        L_0x0017:
            com.google.android.gms.internal.ads.zznf r5 = r0.zzbeo
            int r5 = r5.length
            if (r4 >= r5) goto L_0x0027
            boolean r5 = r0.zza(r1, r4)
            if (r5 != 0) goto L_0x0024
            goto L_0x0014
        L_0x0024:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x0027:
            r1 = 1
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            return r3
        L_0x002b:
            r6.zzafd = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgv.zzet():boolean");
    }

    public final long zzb(long j, boolean z) {
        return zza(j, false, new boolean[this.zzacx.length]);
    }

    public final long zza(long j, boolean z, boolean[] zArr) {
        zznf zznf = this.zzafd.zzbeo;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zznf.length) {
                break;
            }
            boolean[] zArr2 = this.zzaex;
            if (z || !this.zzafd.zza(this.zzafe, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long zza = this.zzaeu.zza(zznf.zzij(), this.zzaex, this.zzaew, zArr, j);
        this.zzafe = this.zzafd;
        this.zzafb = false;
        int i2 = 0;
        while (true) {
            zzmn[] zzmnArr = this.zzaew;
            if (i2 < zzmnArr.length) {
                if (zzmnArr[i2] != null) {
                    zzob.checkState(zznf.zzay(i2) != null);
                    this.zzafb = true;
                } else {
                    zzob.checkState(zznf.zzay(i2) == null);
                }
                i2++;
            } else {
                this.zzadv.zza(this.zzacx, this.zzafd.zzben, zznf);
                return zza;
            }
        }
    }

    public final void release() {
        try {
            this.zzaec.zzb(this.zzaeu);
        } catch (RuntimeException e) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e);
        }
    }
}
