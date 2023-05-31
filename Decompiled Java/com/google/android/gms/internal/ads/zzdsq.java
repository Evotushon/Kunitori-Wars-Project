package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdsq extends zzdyz<zzdsq, zza> implements zzeaj {
    private static volatile zzeau<zzdsq> zzdz;
    /* access modifiers changed from: private */
    public static final zzdsq zzhhb;
    private int zzhgg;
    private zzdxn zzhgh = zzdxn.zzhoe;
    private zzdsu zzhha;

    private zzdsq() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdsq, zza> implements zzeaj {
        private zza() {
            super(zzdsq.zzhhb);
        }

        public final zza zzef(int i) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdsq) this.zzhsu).setVersion(0);
            return this;
        }

        public final zza zzb(zzdsu zzdsu) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdsq) this.zzhsu).zza(zzdsu);
            return this;
        }

        public final zza zzv(zzdxn zzdxn) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdsq) this.zzhsu).zzs(zzdxn);
            return this;
        }

        /* synthetic */ zza(zzdsr zzdsr) {
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

    public final zzdsu zzawp() {
        zzdsu zzdsu = this.zzhha;
        return zzdsu == null ? zzdsu.zzawt() : zzdsu;
    }

    /* access modifiers changed from: private */
    public final void zza(zzdsu zzdsu) {
        zzdsu.getClass();
        this.zzhha = zzdsu;
    }

    public final zzdxn zzavr() {
        return this.zzhgh;
    }

    /* access modifiers changed from: private */
    public final void zzs(zzdxn zzdxn) {
        zzdxn.getClass();
        this.zzhgh = zzdxn;
    }

    public static zzdsq zzh(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzdsq) zzdyz.zza(zzhhb, zzdxn, zzdym);
    }

    public static zza zzawq() {
        return (zza) zzhhb.zzbcz();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdsr.zzdk[i - 1]) {
            case 1:
                return new zzdsq();
            case 2:
                return new zza((zzdsr) null);
            case 3:
                return zza((zzeah) zzhhb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhgg", "zzhha", "zzhgh"});
            case 4:
                return zzhhb;
            case 5:
                zzeau<zzdsq> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdsq.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhhb);
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
        zzdsq zzdsq = new zzdsq();
        zzhhb = zzdsq;
        zzdyz.zza(zzdsq.class, zzdsq);
    }
}
