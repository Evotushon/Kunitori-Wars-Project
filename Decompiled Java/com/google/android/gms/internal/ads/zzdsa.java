package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdsa extends zzdyz<zzdsa, zza> implements zzeaj {
    private static volatile zzeau<zzdsa> zzdz;
    /* access modifiers changed from: private */
    public static final zzdsa zzhgj;
    private int zzhgg;
    private zzdxn zzhgh = zzdxn.zzhoe;
    private zzdse zzhgi;

    private zzdsa() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdsa, zza> implements zzeaj {
        private zza() {
            super(zzdsa.zzhgj);
        }

        public final zza zzec(int i) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdsa) this.zzhsu).setVersion(0);
            return this;
        }

        public final zza zzt(zzdxn zzdxn) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdsa) this.zzhsu).zzs(zzdxn);
            return this;
        }

        public final zza zzd(zzdse zzdse) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdsa) this.zzhsu).zzc(zzdse);
            return this;
        }

        /* synthetic */ zza(zzdsb zzdsb) {
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

    public final zzdxn zzavr() {
        return this.zzhgh;
    }

    /* access modifiers changed from: private */
    public final void zzs(zzdxn zzdxn) {
        zzdxn.getClass();
        this.zzhgh = zzdxn;
    }

    public final zzdse zzavs() {
        zzdse zzdse = this.zzhgi;
        return zzdse == null ? zzdse.zzavx() : zzdse;
    }

    /* access modifiers changed from: private */
    public final void zzc(zzdse zzdse) {
        zzdse.getClass();
        this.zzhgi = zzdse;
    }

    public static zzdsa zzb(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzdsa) zzdyz.zza(zzhgj, zzdxn, zzdym);
    }

    public static zza zzavt() {
        return (zza) zzhgj.zzbcz();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdsb.zzdk[i - 1]) {
            case 1:
                return new zzdsa();
            case 2:
                return new zza((zzdsb) null);
            case 3:
                return zza((zzeah) zzhgj, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzhgg", "zzhgh", "zzhgi"});
            case 4:
                return zzhgj;
            case 5:
                zzeau<zzdsa> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdsa.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhgj);
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
        zzdsa zzdsa = new zzdsa();
        zzhgj = zzdsa;
        zzdyz.zza(zzdsa.class, zzdsa);
    }
}
