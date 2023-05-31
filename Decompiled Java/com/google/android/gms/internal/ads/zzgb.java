package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public final class zzgb extends zzdyz<zzgb, zza> implements zzeaj {
    /* access modifiers changed from: private */
    public static final zzgb zzaax;
    private static volatile zzeau<zzgb> zzdz;
    private String zzaas = "";
    private String zzaat = "";
    private long zzaau;
    private long zzaav;
    private long zzaaw;
    private int zzdl;

    private zzgb() {
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzgb, zza> implements zzeaj {
        private zza() {
            super(zzgb.zzaax);
        }

        public final zza zzaz(String str) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzgb) this.zzhsu).zzax(str);
            return this;
        }

        public final zza zzba(String str) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzgb) this.zzhsu).zzay(str);
            return this;
        }

        public final zza zzdj(long j) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzgb) this.zzhsu).zzdg(j);
            return this;
        }

        public final zza zzdk(long j) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzgb) this.zzhsu).zzdh(j);
            return this;
        }

        public final zza zzdl(long j) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzgb) this.zzhsu).zzdi(j);
            return this;
        }

        /* synthetic */ zza(zzga zzga) {
            this();
        }
    }

    public final String zzdc() {
        return this.zzaas;
    }

    /* access modifiers changed from: private */
    public final void zzax(String str) {
        str.getClass();
        this.zzdl |= 1;
        this.zzaas = str;
    }

    public final String zzdd() {
        return this.zzaat;
    }

    /* access modifiers changed from: private */
    public final void zzay(String str) {
        str.getClass();
        this.zzdl |= 2;
        this.zzaat = str;
    }

    public final long zzde() {
        return this.zzaau;
    }

    /* access modifiers changed from: private */
    public final void zzdg(long j) {
        this.zzdl |= 4;
        this.zzaau = j;
    }

    public final long zzdf() {
        return this.zzaav;
    }

    /* access modifiers changed from: private */
    public final void zzdh(long j) {
        this.zzdl |= 8;
        this.zzaav = j;
    }

    public final long zzdg() {
        return this.zzaaw;
    }

    /* access modifiers changed from: private */
    public final void zzdi(long j) {
        this.zzdl |= 16;
        this.zzaaw = j;
    }

    public static zzgb zzl(zzdxn zzdxn) throws zzdzh {
        return (zzgb) zzdyz.zza(zzaax, zzdxn);
    }

    public static zza zzdh() {
        return (zza) zzaax.zzbcz();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzga.zzdk[i - 1]) {
            case 1:
                return new zzgb();
            case 2:
                return new zza((zzga) null);
            case 3:
                return zza((zzeah) zzaax, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0003\u0002\u0004\u0003\u0003\u0005\u0003\u0004", new Object[]{"zzdl", "zzaas", "zzaat", "zzaau", "zzaav", "zzaaw"});
            case 4:
                return zzaax;
            case 5:
                zzeau<zzgb> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzgb.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzaax);
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

    public static zzgb zzdi() {
        return zzaax;
    }

    static {
        zzgb zzgb = new zzgb();
        zzaax = zzgb;
        zzdyz.zza(zzgb.class, zzgb);
    }
}
