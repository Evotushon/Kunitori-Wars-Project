package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdsx extends zzdyz<zzdsx, zza> implements zzeaj {
    private static volatile zzeau<zzdsx> zzdz;
    /* access modifiers changed from: private */
    public static final zzdsx zzhhe;
    private int zzhgg;
    private zzdxn zzhgh = zzdxn.zzhoe;

    private zzdsx() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdsx, zza> implements zzeaj {
        private zza() {
            super(zzdsx.zzhhe);
        }

        public final zza zzeg(int i) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdsx) this.zzhsu).setVersion(0);
            return this;
        }

        public final zza zzw(zzdxn zzdxn) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdsx) this.zzhsu).zzs(zzdxn);
            return this;
        }

        /* synthetic */ zza(zzdsw zzdsw) {
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

    public static zzdsx zzj(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzdsx) zzdyz.zza(zzhhe, zzdxn, zzdym);
    }

    public static zza zzawv() {
        return (zza) zzhhe.zzbcz();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdsw.zzdk[i - 1]) {
            case 1:
                return new zzdsx();
            case 2:
                return new zza((zzdsw) null);
            case 3:
                return zza((zzeah) zzhhe, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzhgg", "zzhgh"});
            case 4:
                return zzhhe;
            case 5:
                zzeau<zzdsx> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdsx.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhhe);
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
        zzdsx zzdsx = new zzdsx();
        zzhhe = zzdsx;
        zzdyz.zza(zzdsx.class, zzdsx);
    }
}
