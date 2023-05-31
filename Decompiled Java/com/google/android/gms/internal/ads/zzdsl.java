package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdsl extends zzdyz<zzdsl, zza> implements zzeaj {
    private static volatile zzeau<zzdsl> zzdz;
    /* access modifiers changed from: private */
    public static final zzdsl zzhgw;
    private int zzhgg;
    private zzdxn zzhgh = zzdxn.zzhoe;
    private zzdsp zzhgv;

    private zzdsl() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdsl, zza> implements zzeaj {
        private zza() {
            super(zzdsl.zzhgw);
        }

        public final zza zzee(int i) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdsl) this.zzhsu).setVersion(0);
            return this;
        }

        public final zza zzc(zzdsp zzdsp) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdsl) this.zzhsu).zzb(zzdsp);
            return this;
        }

        public final zza zzu(zzdxn zzdxn) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdsl) this.zzhsu).zzs(zzdxn);
            return this;
        }

        /* synthetic */ zza(zzdsk zzdsk) {
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

    public final zzdsp zzawg() {
        zzdsp zzdsp = this.zzhgv;
        return zzdsp == null ? zzdsp.zzawn() : zzdsp;
    }

    /* access modifiers changed from: private */
    public final void zzb(zzdsp zzdsp) {
        zzdsp.getClass();
        this.zzhgv = zzdsp;
    }

    public final zzdxn zzavr() {
        return this.zzhgh;
    }

    /* access modifiers changed from: private */
    public final void zzs(zzdxn zzdxn) {
        zzdxn.getClass();
        this.zzhgh = zzdxn;
    }

    public static zzdsl zzf(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzdsl) zzdyz.zza(zzhgw, zzdxn, zzdym);
    }

    public static zza zzawh() {
        return (zza) zzhgw.zzbcz();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdsk.zzdk[i - 1]) {
            case 1:
                return new zzdsl();
            case 2:
                return new zza((zzdsk) null);
            case 3:
                return zza((zzeah) zzhgw, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhgg", "zzhgv", "zzhgh"});
            case 4:
                return zzhgw;
            case 5:
                zzeau<zzdsl> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdsl.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhgw);
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

    public static zzdsl zzawi() {
        return zzhgw;
    }

    static {
        zzdsl zzdsl = new zzdsl();
        zzhgw = zzdsl;
        zzdyz.zza(zzdsl.class, zzdsl);
    }
}
