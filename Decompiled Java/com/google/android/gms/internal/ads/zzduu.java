package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzduu extends zzdyz<zzduu, zza> implements zzeaj {
    private static volatile zzeau<zzduu> zzdz;
    /* access modifiers changed from: private */
    public static final zzduu zzhkl;
    private int zzhgg;
    private zzduv zzhkk;

    private zzduu() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzduu, zza> implements zzeaj {
        private zza() {
            super(zzduu.zzhkl);
        }

        public final zza zzev(int i) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzduu) this.zzhsu).setVersion(0);
            return this;
        }

        public final zza zzb(zzduv zzduv) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzduu) this.zzhsu).zza(zzduv);
            return this;
        }

        /* synthetic */ zza(zzdut zzdut) {
            this();
        }
    }

    public final int getVersion() {
        return this.zzhgg;
    }

    /* access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzhgg = i;
    }

    public final zzduv zzazm() {
        zzduv zzduv = this.zzhkk;
        return zzduv == null ? zzduv.zzazr() : zzduv;
    }

    /* access modifiers changed from: private */
    public final void zza(zzduv zzduv) {
        zzduv.getClass();
        this.zzhkk = zzduv;
    }

    public static zzduu zzu(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzduu) zzdyz.zza(zzhkl, zzdxn, zzdym);
    }

    public static zza zzazn() {
        return (zza) zzhkl.zzbcz();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdut.zzdk[i - 1]) {
            case 1:
                return new zzduu();
            case 2:
                return new zza((zzdut) null);
            case 3:
                return zza((zzeah) zzhkl, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhgg", "zzhkk"});
            case 4:
                return zzhkl;
            case 5:
                zzeau<zzduu> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzduu.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhkl);
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
        zzduu zzduu = new zzduu();
        zzhkl = zzduu;
        zzdyz.zza(zzduu.class, zzduu);
    }
}
