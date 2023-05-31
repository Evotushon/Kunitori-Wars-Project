package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdur extends zzdyz<zzdur, zza> implements zzeaj {
    private static volatile zzeau<zzdur> zzdz;
    /* access modifiers changed from: private */
    public static final zzdur zzhkj;
    private String zzhki = "";

    private zzdur() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdur, zza> implements zzeaj {
        private zza() {
            super(zzdur.zzhkj);
        }

        /* synthetic */ zza(zzdus zzdus) {
            this();
        }
    }

    public final String zzazj() {
        return this.zzhki;
    }

    public static zzdur zzt(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzdur) zzdyz.zza(zzhkj, zzdxn, zzdym);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdus.zzdk[i - 1]) {
            case 1:
                return new zzdur();
            case 2:
                return new zza((zzdus) null);
            case 3:
                return zza((zzeah) zzhkj, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzhki"});
            case 4:
                return zzhkj;
            case 5:
                zzeau<zzdur> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdur.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhkj);
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

    public static zzdur zzazk() {
        return zzhkj;
    }

    static {
        zzdur zzdur = new zzdur();
        zzhkj = zzdur;
        zzdyz.zza(zzdur.class, zzdur);
    }
}
