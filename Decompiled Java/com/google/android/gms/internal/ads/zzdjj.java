package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public final class zzdjj extends zzdyz<zzdjj, zzb> implements zzeaj {
    private static volatile zzeau<zzdjj> zzdz;
    private static final zzdzf<Integer, zza> zzgxe = new zzdji();
    /* access modifiers changed from: private */
    public static final zzdjj zzgxi;
    private int zzdl;
    private zzdzg zzgxd = zzbdb();
    private String zzgxf = "";
    private String zzgxg = "";
    private String zzgxh = "";

    /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
    public enum zza implements zzdzb {
        BLOCKED_REASON_UNKNOWN(1),
        BLOCKED_REASON_BACKGROUND(2);
        
        private static final zzdze<zza> zzen = null;
        private final int value;

        public final int zzaf() {
            return this.value;
        }

        public static zza zzdp(int i) {
            if (i == 1) {
                return BLOCKED_REASON_UNKNOWN;
            }
            if (i != 2) {
                return null;
            }
            return BLOCKED_REASON_BACKGROUND;
        }

        public static zzdzd zzag() {
            return zzdjl.zzew;
        }

        public final String toString() {
            return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        private zza(int i) {
            this.value = i;
        }

        static {
            zzen = new zzdjm();
        }
    }

    private zzdjj() {
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
    public static final class zzb extends zzdyz.zza<zzdjj, zzb> implements zzeaj {
        private zzb() {
            super(zzdjj.zzgxi);
        }

        public final zzb zzb(zza zza) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdjj) this.zzhsu).zza(zza);
            return this;
        }

        public final zzb zzgv(String str) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdjj) this.zzhsu).zzgu(str);
            return this;
        }

        /* synthetic */ zzb(zzdji zzdji) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public final void zza(zza zza2) {
        zza2.getClass();
        if (!this.zzgxd.zzbam()) {
            this.zzgxd = zzdyz.zza(this.zzgxd);
        }
        this.zzgxd.zzgl(zza2.zzaf());
    }

    /* access modifiers changed from: private */
    public final void zzgu(String str) {
        str.getClass();
        this.zzdl |= 1;
        this.zzgxf = str;
    }

    public static zzb zzatg() {
        return (zzb) zzgxi.zzbcz();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdjk.zzdk[i - 1]) {
            case 1:
                return new zzdjj();
            case 2:
                return new zzb((zzdji) null);
            case 3:
                return zza((zzeah) zzgxi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002\b\u0000\u0003\b\u0001\u0004\b\u0002", new Object[]{"zzdl", "zzgxd", zza.zzag(), "zzgxf", "zzgxg", "zzgxh"});
            case 4:
                return zzgxi;
            case 5:
                zzeau<zzdjj> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdjj.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzgxi);
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
        zzdjj zzdjj = new zzdjj();
        zzgxi = zzdjj;
        zzdyz.zza(zzdjj.class, zzdjj);
    }
}
