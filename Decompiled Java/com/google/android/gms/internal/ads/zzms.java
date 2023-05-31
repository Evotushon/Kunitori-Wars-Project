package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzms extends zzhj {
    private static final Object zzbdg = new Object();
    private final boolean zzagt;
    private final boolean zzagu;
    private final long zzbdh;
    private final long zzbdi;
    private final long zzbdj;
    private final long zzbdk;

    public zzms(long j, boolean z) {
        this(j, j, 0, 0, z, false);
    }

    public final int zzfa() {
        return 1;
    }

    public final int zzfb() {
        return 1;
    }

    private zzms(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.zzbdh = j;
        this.zzbdi = j2;
        this.zzbdj = 0;
        this.zzbdk = 0;
        this.zzagt = z;
        this.zzagu = false;
    }

    public final zzhk zza(int i, zzhk zzhk, boolean z, long j) {
        zzob.zzc(i, 0, 1);
        boolean z2 = this.zzagt;
        long j2 = this.zzbdi;
        zzhk.zzagq = null;
        zzhk.zzagr = -9223372036854775807L;
        zzhk.zzags = -9223372036854775807L;
        zzhk.zzagt = z2;
        zzhk.zzagu = false;
        zzhk.zzagx = 0;
        zzhk.zzagy = j2;
        zzhk.zzagv = 0;
        zzhk.zzagw = 0;
        zzhk.zzagz = 0;
        return zzhk;
    }

    public final zzhl zza(int i, zzhl zzhl, boolean z) {
        zzob.zzc(i, 0, 1);
        Object obj = z ? zzbdg : null;
        return zzhl.zza(obj, obj, 0, this.zzbdh, 0, false);
    }

    public final int zzc(Object obj) {
        return zzbdg.equals(obj) ? 0 : -1;
    }
}
