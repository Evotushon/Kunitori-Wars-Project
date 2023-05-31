package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzduq extends zzdyz<zzduq, zza> implements zzeaj {
    private static volatile zzeau<zzduq> zzdz;
    /* access modifiers changed from: private */
    public static final zzduq zzhkh;
    private int zzhgg;
    private zzdur zzhkg;

    private zzduq() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzduq, zza> implements zzeaj {
        private zza() {
            super(zzduq.zzhkh);
        }

        public final zza zzeu(int i) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzduq) this.zzhsu).setVersion(0);
            return this;
        }

        public final zza zzb(zzdur zzdur) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzduq) this.zzhsu).zza(zzdur);
            return this;
        }

        /* synthetic */ zza(zzdup zzdup) {
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

    public final zzdur zzazg() {
        zzdur zzdur = this.zzhkg;
        return zzdur == null ? zzdur.zzazk() : zzdur;
    }

    /* access modifiers changed from: private */
    public final void zza(zzdur zzdur) {
        zzdur.getClass();
        this.zzhkg = zzdur;
    }

    public static zzduq zzs(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzduq) zzdyz.zza(zzhkh, zzdxn, zzdym);
    }

    public static zza zzazh() {
        return (zza) zzhkh.zzbcz();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdup.zzdk[i - 1]) {
            case 1:
                return new zzduq();
            case 2:
                return new zza((zzdup) null);
            case 3:
                return zza((zzeah) zzhkh, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhgg", "zzhkg"});
            case 4:
                return zzhkh;
            case 5:
                zzeau<zzduq> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzduq.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhkh);
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
        zzduq zzduq = new zzduq();
        zzhkh = zzduq;
        zzdyz.zza(zzduq.class, zzduq);
    }
}
