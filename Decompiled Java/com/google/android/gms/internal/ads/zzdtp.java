package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdtp extends zzdyz<zzdtp, zza> implements zzeaj {
    private static volatile zzeau<zzdtp> zzdz;
    /* access modifiers changed from: private */
    public static final zzdtp zzhia;
    private int zzhgg;
    private zzdtl zzhhq;
    private zzdxn zzhhy = zzdxn.zzhoe;
    private zzdxn zzhhz = zzdxn.zzhoe;

    private zzdtp() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdtp, zza> implements zzeaj {
        private zza() {
            super(zzdtp.zzhia);
        }

        public final zza zzek(int i) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdtp) this.zzhsu).setVersion(0);
            return this;
        }

        public final zza zzc(zzdtl zzdtl) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdtp) this.zzhsu).zzb(zzdtl);
            return this;
        }

        public final zza zzab(zzdxn zzdxn) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdtp) this.zzhsu).zzz(zzdxn);
            return this;
        }

        public final zza zzac(zzdxn zzdxn) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdtp) this.zzhsu).zzaa(zzdxn);
            return this;
        }

        /* synthetic */ zza(zzdto zzdto) {
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

    public final zzdtl zzaxe() {
        zzdtl zzdtl = this.zzhhq;
        return zzdtl == null ? zzdtl.zzaxj() : zzdtl;
    }

    /* access modifiers changed from: private */
    public final void zzb(zzdtl zzdtl) {
        zzdtl.getClass();
        this.zzhhq = zzdtl;
    }

    public final zzdxn zzaxo() {
        return this.zzhhy;
    }

    /* access modifiers changed from: private */
    public final void zzz(zzdxn zzdxn) {
        zzdxn.getClass();
        this.zzhhy = zzdxn;
    }

    public final zzdxn zzaxp() {
        return this.zzhhz;
    }

    /* access modifiers changed from: private */
    public final void zzaa(zzdxn zzdxn) {
        zzdxn.getClass();
        this.zzhhz = zzdxn;
    }

    public static zzdtp zzp(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzdtp) zzdyz.zza(zzhia, zzdxn, zzdym);
    }

    public static zza zzaxq() {
        return (zza) zzhia.zzbcz();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdto.zzdk[i - 1]) {
            case 1:
                return new zzdtp();
            case 2:
                return new zza((zzdto) null);
            case 3:
                return zza((zzeah) zzhia, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzhgg", "zzhhq", "zzhhy", "zzhhz"});
            case 4:
                return zzhia;
            case 5:
                zzeau<zzdtp> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdtp.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhia);
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

    public static zzdtp zzaxr() {
        return zzhia;
    }

    static {
        zzdtp zzdtp = new zzdtp();
        zzhia = zzdtp;
        zzdyz.zza(zzdtp.class, zzdtp);
    }
}
