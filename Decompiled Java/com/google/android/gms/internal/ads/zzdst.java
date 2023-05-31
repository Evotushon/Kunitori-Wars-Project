package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdst extends zzdyz<zzdst, zza> implements zzeaj {
    private static volatile zzeau<zzdst> zzdz;
    /* access modifiers changed from: private */
    public static final zzdst zzhhc;
    private int zzhgl;
    private zzdsu zzhha;

    private zzdst() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdst, zza> implements zzeaj {
        private zza() {
            super(zzdst.zzhhc);
        }

        /* synthetic */ zza(zzdss zzdss) {
            this();
        }
    }

    public final zzdsu zzawp() {
        zzdsu zzdsu = this.zzhha;
        return zzdsu == null ? zzdsu.zzawt() : zzdsu;
    }

    public final int getKeySize() {
        return this.zzhgl;
    }

    public static zzdst zzi(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzdst) zzdyz.zza(zzhhc, zzdxn, zzdym);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdss.zzdk[i - 1]) {
            case 1:
                return new zzdst();
            case 2:
                return new zza((zzdss) null);
            case 3:
                return zza((zzeah) zzhhc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzhha", "zzhgl"});
            case 4:
                return zzhhc;
            case 5:
                zzeau<zzdst> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdst.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhhc);
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

    static {
        zzdst zzdst = new zzdst();
        zzhhc = zzdst;
        zzdyz.zza(zzdst.class, zzdst);
    }
}
