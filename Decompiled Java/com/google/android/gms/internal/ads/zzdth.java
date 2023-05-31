package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdth extends zzdyz<zzdth, zza> implements zzeaj {
    private static volatile zzeau<zzdth> zzdz;
    /* access modifiers changed from: private */
    public static final zzdth zzhhp;
    private zzdui zzhho;

    private zzdth() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdth, zza> implements zzeaj {
        private zza() {
            super(zzdth.zzhhp);
        }

        /* synthetic */ zza(zzdtg zzdtg) {
            this();
        }
    }

    public final zzdui zzaxb() {
        zzdui zzdui = this.zzhho;
        return zzdui == null ? zzdui.zzayn() : zzdui;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdtg.zzdk[i - 1]) {
            case 1:
                return new zzdth();
            case 2:
                return new zza((zzdtg) null);
            case 3:
                return zza((zzeah) zzhhp, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzhho"});
            case 4:
                return zzhhp;
            case 5:
                zzeau<zzdth> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdth.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhhp);
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

    public static zzdth zzaxc() {
        return zzhhp;
    }

    static {
        zzdth zzdth = new zzdth();
        zzhhp = zzdth;
        zzdyz.zza(zzdth.class, zzdth);
    }
}
