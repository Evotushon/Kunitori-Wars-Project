package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zznk {
    public final zzmu zzben;
    public final zznf zzbeo;
    public final Object zzbep;
    public final zzhg[] zzbeq;

    public zznk(zzmu zzmu, zznf zznf, Object obj, zzhg[] zzhgArr) {
        this.zzben = zzmu;
        this.zzbeo = zznf;
        this.zzbep = obj;
        this.zzbeq = zzhgArr;
    }

    public final boolean zza(zznk zznk, int i) {
        if (zznk != null && zzop.zza(this.zzbeo.zzay(i), zznk.zzbeo.zzay(i)) && zzop.zza(this.zzbeq[i], zznk.zzbeq[i])) {
            return true;
        }
        return false;
    }
}
