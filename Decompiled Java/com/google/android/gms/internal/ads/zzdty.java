package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdty extends zzdyz<zzdty, zza> implements zzeaj {
    private static volatile zzeau<zzdty> zzdz;
    /* access modifiers changed from: private */
    public static final zzdty zzhiv;
    private int zzhgl;
    private zzdub zzhit;

    private zzdty() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdty, zza> implements zzeaj {
        private zza() {
            super(zzdty.zzhiv);
        }

        /* synthetic */ zza(zzdtz zzdtz) {
            this();
        }
    }

    public final zzdub zzaxy() {
        zzdub zzdub = this.zzhit;
        return zzdub == null ? zzdub.zzayf() : zzdub;
    }

    public final int getKeySize() {
        return this.zzhgl;
    }

    public static zzdty zzr(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzdty) zzdyz.zza(zzhiv, zzdxn, zzdym);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdtz.zzdk[i - 1]) {
            case 1:
                return new zzdty();
            case 2:
                return new zza((zzdtz) null);
            case 3:
                return zza((zzeah) zzhiv, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzhit", "zzhgl"});
            case 4:
                return zzhiv;
            case 5:
                zzeau<zzdty> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdty.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhiv);
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

    public static zzdty zzayc() {
        return zzhiv;
    }

    static {
        zzdty zzdty = new zzdty();
        zzhiv = zzdty;
        zzdyz.zza(zzdty.class, zzdty);
    }
}
