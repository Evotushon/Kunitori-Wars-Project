package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdvb extends zzdyz<zzdvb, zza> implements zzeaj {
    private static volatile zzeau<zzdvb> zzdz;
    /* access modifiers changed from: private */
    public static final zzdvb zzhkz;
    private int zzhgg;
    private zzdxn zzhgh = zzdxn.zzhoe;

    private zzdvb() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdvb, zza> implements zzeaj {
        private zza() {
            super(zzdvb.zzhkz);
        }

        public final zza zzex(int i) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdvb) this.zzhsu).setVersion(0);
            return this;
        }

        public final zza zzag(zzdxn zzdxn) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdvb) this.zzhsu).zzs(zzdxn);
            return this;
        }

        /* synthetic */ zza(zzdvc zzdvc) {
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

    public static zzdvb zzw(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzdvb) zzdyz.zza(zzhkz, zzdxn, zzdym);
    }

    public static zza zzazw() {
        return (zza) zzhkz.zzbcz();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdvc.zzdk[i - 1]) {
            case 1:
                return new zzdvb();
            case 2:
                return new zza((zzdvc) null);
            case 3:
                return zza((zzeah) zzhkz, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzhgg", "zzhgh"});
            case 4:
                return zzhkz;
            case 5:
                zzeau<zzdvb> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdvb.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhkz);
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
        zzdvb zzdvb = new zzdvb();
        zzhkz = zzdvb;
        zzdyz.zza(zzdvb.class, zzdvb);
    }
}
