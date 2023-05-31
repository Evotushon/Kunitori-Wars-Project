package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdtq extends zzdyz<zzdtq, zza> implements zzeaj {
    private static volatile zzeau<zzdtq> zzdz;
    /* access modifiers changed from: private */
    public static final zzdtq zzhie;
    private int zzhib;
    private int zzhic;
    private zzdxn zzhid = zzdxn.zzhoe;

    private zzdtq() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdtq, zza> implements zzeaj {
        private zza() {
            super(zzdtq.zzhie);
        }

        /* synthetic */ zza(zzdtr zzdtr) {
            this();
        }
    }

    public final zzdtt zzaxt() {
        zzdtt zzel = zzdtt.zzel(this.zzhib);
        return zzel == null ? zzdtt.UNRECOGNIZED : zzel;
    }

    public final zzdtv zzaxu() {
        zzdtv zzem = zzdtv.zzem(this.zzhic);
        return zzem == null ? zzdtv.UNRECOGNIZED : zzem;
    }

    public final zzdxn zzaxv() {
        return this.zzhid;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdtr.zzdk[i - 1]) {
            case 1:
                return new zzdtq();
            case 2:
                return new zza((zzdtr) null);
            case 3:
                return zza((zzeah) zzhie, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzhib", "zzhic", "zzhid"});
            case 4:
                return zzhie;
            case 5:
                zzeau<zzdtq> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdtq.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhie);
                            zzdz = zzeau;
                        }
                    }
                }
                return zzeau;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static zzdtq zzaxw() {
        return zzhie;
    }

    static {
        zzdtq zzdtq = new zzdtq();
        zzhie = zzdtq;
        zzdyz.zza(zzdtq.class, zzdtq);
    }
}
