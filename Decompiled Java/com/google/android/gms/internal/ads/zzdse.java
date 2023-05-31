package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdse extends zzdyz<zzdse, zza> implements zzeaj {
    private static volatile zzeau<zzdse> zzdz;
    /* access modifiers changed from: private */
    public static final zzdse zzhgo;
    private int zzhgn;

    private zzdse() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdse, zza> implements zzeaj {
        private zza() {
            super(zzdse.zzhgo);
        }

        /* synthetic */ zza(zzdsf zzdsf) {
            this();
        }
    }

    public final int zzavw() {
        return this.zzhgn;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdsf.zzdk[i - 1]) {
            case 1:
                return new zzdse();
            case 2:
                return new zza((zzdsf) null);
            case 3:
                return zza((zzeah) zzhgo, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhgn"});
            case 4:
                return zzhgo;
            case 5:
                zzeau<zzdse> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdse.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhgo);
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

    public static zzdse zzavx() {
        return zzhgo;
    }

    static {
        zzdse zzdse = new zzdse();
        zzhgo = zzdse;
        zzdyz.zza(zzdse.class, zzdse);
    }
}
