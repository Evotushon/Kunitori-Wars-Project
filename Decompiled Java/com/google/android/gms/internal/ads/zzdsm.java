package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdsm extends zzdyz<zzdsm, zza> implements zzeaj {
    private static volatile zzeau<zzdsm> zzdz;
    /* access modifiers changed from: private */
    public static final zzdsm zzhgx;
    private int zzhgl;
    private zzdsp zzhgv;

    private zzdsm() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdsm, zza> implements zzeaj {
        private zza() {
            super(zzdsm.zzhgx);
        }

        /* synthetic */ zza(zzdsn zzdsn) {
            this();
        }
    }

    public final zzdsp zzawg() {
        zzdsp zzdsp = this.zzhgv;
        return zzdsp == null ? zzdsp.zzawn() : zzdsp;
    }

    public final int getKeySize() {
        return this.zzhgl;
    }

    public static zzdsm zzg(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzdsm) zzdyz.zza(zzhgx, zzdxn, zzdym);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdsn.zzdk[i - 1]) {
            case 1:
                return new zzdsm();
            case 2:
                return new zza((zzdsn) null);
            case 3:
                return zza((zzeah) zzhgx, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzhgv", "zzhgl"});
            case 4:
                return zzhgx;
            case 5:
                zzeau<zzdsm> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdsm.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhgx);
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

    public static zzdsm zzawk() {
        return zzhgx;
    }

    static {
        zzdsm zzdsm = new zzdsm();
        zzhgx = zzdsm;
        zzdyz.zza(zzdsm.class, zzdsm);
    }
}
