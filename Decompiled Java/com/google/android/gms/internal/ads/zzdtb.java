package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdtb extends zzdyz<zzdtb, zza> implements zzeaj {
    private static volatile zzeau<zzdtb> zzdz;
    /* access modifiers changed from: private */
    public static final zzdtb zzhhg;
    private int zzhgg;
    private zzdxn zzhgh = zzdxn.zzhoe;

    private zzdtb() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdtb, zza> implements zzeaj {
        private zza() {
            super(zzdtb.zzhhg);
        }

        public final zza zzeh(int i) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdtb) this.zzhsu).setVersion(0);
            return this;
        }

        public final zza zzx(zzdxn zzdxn) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdtb) this.zzhsu).zzs(zzdxn);
            return this;
        }

        /* synthetic */ zza(zzdta zzdta) {
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

    public static zzdtb zzl(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzdtb) zzdyz.zza(zzhhg, zzdxn, zzdym);
    }

    public static zza zzawy() {
        return (zza) zzhhg.zzbcz();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdta.zzdk[i - 1]) {
            case 1:
                return new zzdtb();
            case 2:
                return new zza((zzdta) null);
            case 3:
                return zza((zzeah) zzhhg, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzhgg", "zzhgh"});
            case 4:
                return zzhhg;
            case 5:
                zzeau<zzdtb> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdtb.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhhg);
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
        zzdtb zzdtb = new zzdtb();
        zzhhg = zzdtb;
        zzdyz.zza(zzdtb.class, zzdtb);
    }
}
