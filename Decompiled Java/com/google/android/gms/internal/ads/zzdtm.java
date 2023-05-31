package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdtm extends zzdyz<zzdtm, zza> implements zzeaj {
    private static volatile zzeau<zzdtm> zzdz;
    /* access modifiers changed from: private */
    public static final zzdtm zzhhx;
    private int zzhgg;
    private zzdxn zzhgh = zzdxn.zzhoe;
    private zzdtp zzhhw;

    private zzdtm() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdtm, zza> implements zzeaj {
        private zza() {
            super(zzdtm.zzhhx);
        }

        public final zza zzej(int i) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdtm) this.zzhsu).setVersion(0);
            return this;
        }

        public final zza zzb(zzdtp zzdtp) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdtm) this.zzhsu).zza(zzdtp);
            return this;
        }

        public final zza zzy(zzdxn zzdxn) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdtm) this.zzhsu).zzs(zzdxn);
            return this;
        }

        /* synthetic */ zza(zzdtn zzdtn) {
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

    public final zzdtp zzaxl() {
        zzdtp zzdtp = this.zzhhw;
        return zzdtp == null ? zzdtp.zzaxr() : zzdtp;
    }

    /* access modifiers changed from: private */
    public final void zza(zzdtp zzdtp) {
        zzdtp.getClass();
        this.zzhhw = zzdtp;
    }

    public final zzdxn zzavr() {
        return this.zzhgh;
    }

    /* access modifiers changed from: private */
    public final void zzs(zzdxn zzdxn) {
        zzdxn.getClass();
        this.zzhgh = zzdxn;
    }

    public static zzdtm zzo(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzdtm) zzdyz.zza(zzhhx, zzdxn, zzdym);
    }

    public static zza zzaxm() {
        return (zza) zzhhx.zzbcz();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdtn.zzdk[i - 1]) {
            case 1:
                return new zzdtm();
            case 2:
                return new zza((zzdtn) null);
            case 3:
                return zza((zzeah) zzhhx, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhgg", "zzhhw", "zzhgh"});
            case 4:
                return zzhhx;
            case 5:
                zzeau<zzdtm> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdtm.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhhx);
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
        zzdtm zzdtm = new zzdtm();
        zzhhx = zzdtm;
        zzdyz.zza(zzdtm.class, zzdtm);
    }
}
