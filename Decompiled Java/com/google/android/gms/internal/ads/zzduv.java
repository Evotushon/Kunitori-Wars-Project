package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzduv extends zzdyz<zzduv, zza> implements zzeaj {
    private static volatile zzeau<zzduv> zzdz;
    /* access modifiers changed from: private */
    public static final zzduv zzhko;
    private String zzhkm = "";
    private zzdui zzhkn;

    private zzduv() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzduv, zza> implements zzeaj {
        private zza() {
            super(zzduv.zzhko);
        }

        /* synthetic */ zza(zzduw zzduw) {
            this();
        }
    }

    public final String zzazp() {
        return this.zzhkm;
    }

    public final zzdui zzazq() {
        zzdui zzdui = this.zzhkn;
        return zzdui == null ? zzdui.zzayn() : zzdui;
    }

    public static zzduv zzv(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzduv) zzdyz.zza(zzhko, zzdxn, zzdym);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzduw.zzdk[i - 1]) {
            case 1:
                return new zzduv();
            case 2:
                return new zza((zzduw) null);
            case 3:
                return zza((zzeah) zzhko, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzhkm", "zzhkn"});
            case 4:
                return zzhko;
            case 5:
                zzeau<zzduv> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzduv.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhko);
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

    public static zzduv zzazr() {
        return zzhko;
    }

    static {
        zzduv zzduv = new zzduv();
        zzhko = zzduv;
        zzdyz.zza(zzduv.class, zzduv);
    }
}
