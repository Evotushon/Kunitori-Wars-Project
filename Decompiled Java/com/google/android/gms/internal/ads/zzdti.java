package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdti extends zzdyz<zzdti, zza> implements zzeaj {
    private static volatile zzeau<zzdti> zzdz;
    /* access modifiers changed from: private */
    public static final zzdti zzhhr;
    private zzdtl zzhhq;

    private zzdti() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdti, zza> implements zzeaj {
        private zza() {
            super(zzdti.zzhhr);
        }

        /* synthetic */ zza(zzdtj zzdtj) {
            this();
        }
    }

    public final zzdtl zzaxe() {
        zzdtl zzdtl = this.zzhhq;
        return zzdtl == null ? zzdtl.zzaxj() : zzdtl;
    }

    public static zzdti zzn(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzdti) zzdyz.zza(zzhhr, zzdxn, zzdym);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdtj.zzdk[i - 1]) {
            case 1:
                return new zzdti();
            case 2:
                return new zza((zzdtj) null);
            case 3:
                return zza((zzeah) zzhhr, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzhhq"});
            case 4:
                return zzhhr;
            case 5:
                zzeau<zzdti> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdti.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhhr);
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
        zzdti zzdti = new zzdti();
        zzhhr = zzdti;
        zzdyz.zza(zzdti.class, zzdti);
    }
}
