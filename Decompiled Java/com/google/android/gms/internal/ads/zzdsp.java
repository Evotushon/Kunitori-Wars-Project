package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdsp extends zzdyz<zzdsp, zza> implements zzeaj {
    private static volatile zzeau<zzdsp> zzdz;
    /* access modifiers changed from: private */
    public static final zzdsp zzhgz;
    private int zzhgy;

    private zzdsp() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdsp, zza> implements zzeaj {
        private zza() {
            super(zzdsp.zzhgz);
        }

        /* synthetic */ zza(zzdso zzdso) {
            this();
        }
    }

    public final int zzawm() {
        return this.zzhgy;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdso.zzdk[i - 1]) {
            case 1:
                return new zzdsp();
            case 2:
                return new zza((zzdso) null);
            case 3:
                return zza((zzeah) zzhgz, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhgy"});
            case 4:
                return zzhgz;
            case 5:
                zzeau<zzdsp> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdsp.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhgz);
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

    public static zzdsp zzawn() {
        return zzhgz;
    }

    static {
        zzdsp zzdsp = new zzdsp();
        zzhgz = zzdsp;
        zzdyz.zza(zzdsp.class, zzdsp);
    }
}
