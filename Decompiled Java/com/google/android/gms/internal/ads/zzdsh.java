package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdsh extends zzdyz<zzdsh, zza> implements zzeaj {
    private static volatile zzeau<zzdsh> zzdz;
    /* access modifiers changed from: private */
    public static final zzdsh zzhgr;
    private int zzhgg;
    private zzdsl zzhgp;
    private zzdtx zzhgq;

    private zzdsh() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdsh, zza> implements zzeaj {
        private zza() {
            super(zzdsh.zzhgr);
        }

        public final zza zzed(int i) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdsh) this.zzhsu).setVersion(i);
            return this;
        }

        public final zza zzb(zzdsl zzdsl) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdsh) this.zzhsu).zza(zzdsl);
            return this;
        }

        public final zza zzb(zzdtx zzdtx) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdsh) this.zzhsu).zza(zzdtx);
            return this;
        }

        /* synthetic */ zza(zzdsg zzdsg) {
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

    public final zzdsl zzavz() {
        zzdsl zzdsl = this.zzhgp;
        return zzdsl == null ? zzdsl.zzawi() : zzdsl;
    }

    /* access modifiers changed from: private */
    public final void zza(zzdsl zzdsl) {
        zzdsl.getClass();
        this.zzhgp = zzdsl;
    }

    public final zzdtx zzawa() {
        zzdtx zzdtx = this.zzhgq;
        return zzdtx == null ? zzdtx.zzaya() : zzdtx;
    }

    /* access modifiers changed from: private */
    public final void zza(zzdtx zzdtx) {
        zzdtx.getClass();
        this.zzhgq = zzdtx;
    }

    public static zzdsh zzd(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzdsh) zzdyz.zza(zzhgr, zzdxn, zzdym);
    }

    public static zza zzawb() {
        return (zza) zzhgr.zzbcz();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdsg.zzdk[i - 1]) {
            case 1:
                return new zzdsh();
            case 2:
                return new zza((zzdsg) null);
            case 3:
                return zza((zzeah) zzhgr, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzhgg", "zzhgp", "zzhgq"});
            case 4:
                return zzhgr;
            case 5:
                zzeau<zzdsh> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdsh.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhgr);
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
        zzdsh zzdsh = new zzdsh();
        zzhgr = zzdsh;
        zzdyz.zza(zzdsh.class, zzdsh);
    }
}
