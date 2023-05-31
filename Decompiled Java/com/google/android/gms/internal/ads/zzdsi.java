package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdsi extends zzdyz<zzdsi, zza> implements zzeaj {
    private static volatile zzeau<zzdsi> zzdz;
    /* access modifiers changed from: private */
    public static final zzdsi zzhgu;
    private zzdsm zzhgs;
    private zzdty zzhgt;

    private zzdsi() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdsi, zza> implements zzeaj {
        private zza() {
            super(zzdsi.zzhgu);
        }

        /* synthetic */ zza(zzdsj zzdsj) {
            this();
        }
    }

    public final zzdsm zzawd() {
        zzdsm zzdsm = this.zzhgs;
        return zzdsm == null ? zzdsm.zzawk() : zzdsm;
    }

    public final zzdty zzawe() {
        zzdty zzdty = this.zzhgt;
        return zzdty == null ? zzdty.zzayc() : zzdty;
    }

    public static zzdsi zze(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzdsi) zzdyz.zza(zzhgu, zzdxn, zzdym);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdsj.zzdk[i - 1]) {
            case 1:
                return new zzdsi();
            case 2:
                return new zza((zzdsj) null);
            case 3:
                return zza((zzeah) zzhgu, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzhgs", "zzhgt"});
            case 4:
                return zzhgu;
            case 5:
                zzeau<zzdsi> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdsi.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhgu);
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
        zzdsi zzdsi = new zzdsi();
        zzhgu = zzdsi;
        zzdyz.zza(zzdsi.class, zzdsi);
    }
}
