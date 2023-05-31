package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdsu extends zzdyz<zzdsu, zza> implements zzeaj {
    private static volatile zzeau<zzdsu> zzdz;
    /* access modifiers changed from: private */
    public static final zzdsu zzhhd;
    private int zzhgy;

    private zzdsu() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdsu, zza> implements zzeaj {
        private zza() {
            super(zzdsu.zzhhd);
        }

        /* synthetic */ zza(zzdsv zzdsv) {
            this();
        }
    }

    public final int zzawm() {
        return this.zzhgy;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdsv.zzdk[i - 1]) {
            case 1:
                return new zzdsu();
            case 2:
                return new zza((zzdsv) null);
            case 3:
                return zza((zzeah) zzhhd, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhgy"});
            case 4:
                return zzhhd;
            case 5:
                zzeau<zzdsu> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdsu.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhhd);
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

    public static zzdsu zzawt() {
        return zzhhd;
    }

    static {
        zzdsu zzdsu = new zzdsu();
        zzhhd = zzdsu;
        zzdyz.zza(zzdsu.class, zzdsu);
    }
}
