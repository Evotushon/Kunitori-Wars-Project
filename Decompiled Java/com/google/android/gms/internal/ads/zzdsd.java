package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdsd extends zzdyz<zzdsd, zza> implements zzeaj {
    private static volatile zzeau<zzdsd> zzdz;
    /* access modifiers changed from: private */
    public static final zzdsd zzhgm;
    private zzdse zzhgi;
    private int zzhgl;

    private zzdsd() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdsd, zza> implements zzeaj {
        private zza() {
            super(zzdsd.zzhgm);
        }

        /* synthetic */ zza(zzdsc zzdsc) {
            this();
        }
    }

    public final int getKeySize() {
        return this.zzhgl;
    }

    public final zzdse zzavs() {
        zzdse zzdse = this.zzhgi;
        return zzdse == null ? zzdse.zzavx() : zzdse;
    }

    public static zzdsd zzc(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzdsd) zzdyz.zza(zzhgm, zzdxn, zzdym);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdsc.zzdk[i - 1]) {
            case 1:
                return new zzdsd();
            case 2:
                return new zza((zzdsc) null);
            case 3:
                return zza((zzeah) zzhgm, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhgl", "zzhgi"});
            case 4:
                return zzhgm;
            case 5:
                zzeau<zzdsd> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdsd.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhgm);
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
        zzdsd zzdsd = new zzdsd();
        zzhgm = zzdsd;
        zzdyz.zza(zzdsd.class, zzdsd);
    }
}
