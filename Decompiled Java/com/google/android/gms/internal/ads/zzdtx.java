package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdtx extends zzdyz<zzdtx, zza> implements zzeaj {
    private static volatile zzeau<zzdtx> zzdz;
    /* access modifiers changed from: private */
    public static final zzdtx zzhiu;
    private int zzhgg;
    private zzdxn zzhgh = zzdxn.zzhoe;
    private zzdub zzhit;

    private zzdtx() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdtx, zza> implements zzeaj {
        private zza() {
            super(zzdtx.zzhiu);
        }

        public final zza zzen(int i) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdtx) this.zzhsu).setVersion(0);
            return this;
        }

        public final zza zzd(zzdub zzdub) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdtx) this.zzhsu).zzc(zzdub);
            return this;
        }

        public final zza zzad(zzdxn zzdxn) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdtx) this.zzhsu).zzs(zzdxn);
            return this;
        }

        /* synthetic */ zza(zzdtw zzdtw) {
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

    public final zzdub zzaxy() {
        zzdub zzdub = this.zzhit;
        return zzdub == null ? zzdub.zzayf() : zzdub;
    }

    /* access modifiers changed from: private */
    public final void zzc(zzdub zzdub) {
        zzdub.getClass();
        this.zzhit = zzdub;
    }

    public final zzdxn zzavr() {
        return this.zzhgh;
    }

    /* access modifiers changed from: private */
    public final void zzs(zzdxn zzdxn) {
        zzdxn.getClass();
        this.zzhgh = zzdxn;
    }

    public static zzdtx zzq(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzdtx) zzdyz.zza(zzhiu, zzdxn, zzdym);
    }

    public static zza zzaxz() {
        return (zza) zzhiu.zzbcz();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdtw.zzdk[i - 1]) {
            case 1:
                return new zzdtx();
            case 2:
                return new zza((zzdtw) null);
            case 3:
                return zza((zzeah) zzhiu, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhgg", "zzhit", "zzhgh"});
            case 4:
                return zzhiu;
            case 5:
                zzeau<zzdtx> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdtx.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhiu);
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

    public static zzdtx zzaya() {
        return zzhiu;
    }

    static {
        zzdtx zzdtx = new zzdtx();
        zzhiu = zzdtx;
        zzdyz.zza(zzdtx.class, zzdtx);
    }
}
