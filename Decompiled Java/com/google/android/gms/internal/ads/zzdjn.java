package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdjj;
import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public final class zzdjn extends zzdyz<zzdjn, zza> implements zzeaj {
    private static volatile zzeau<zzdjn> zzdz;
    /* access modifiers changed from: private */
    public static final zzdjn zzgxp;
    private int zzdl;
    private String zzdm = "";
    private int zzgxm;
    private String zzgxn = "";
    private zzdjj zzgxo;

    /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
    public enum zzb implements zzdzb {
        EVENT_TYPE_UNKNOWN(0),
        BLOCKED_IMPRESSION(1);
        
        private static final zzdze<zzb> zzen = null;
        private final int value;

        public final int zzaf() {
            return this.value;
        }

        public static zzb zzdq(int i) {
            if (i == 0) {
                return EVENT_TYPE_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return BLOCKED_IMPRESSION;
        }

        public static zzdzd zzag() {
            return zzdjr.zzew;
        }

        public final String toString() {
            return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        private zzb(int i) {
            this.value = i;
        }

        static {
            zzen = new zzdjp();
        }
    }

    private zzdjn() {
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdjn, zza> implements zzeaj {
        private zza() {
            super(zzdjn.zzgxp);
        }

        public final zza zzb(zzb zzb) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdjn) this.zzhsu).zza(zzb);
            return this;
        }

        public final zza zzgw(String str) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdjn) this.zzhsu).zzn(str);
            return this;
        }

        public final zza zza(zzdjj.zzb zzb) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdjn) this.zzhsu).zza((zzdjj) ((zzdyz) zzb.zzbcx()));
            return this;
        }

        /* synthetic */ zza(zzdjo zzdjo) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public final void zza(zzb zzb2) {
        this.zzgxm = zzb2.zzaf();
        this.zzdl |= 1;
    }

    /* access modifiers changed from: private */
    public final void zzn(String str) {
        str.getClass();
        this.zzdl |= 2;
        this.zzdm = str;
    }

    /* access modifiers changed from: private */
    public final void zza(zzdjj zzdjj) {
        zzdjj.getClass();
        this.zzgxo = zzdjj;
        this.zzdl |= 8;
    }

    public static zza zzati() {
        return (zza) zzgxp.zzbcz();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdjo.zzdk[i - 1]) {
            case 1:
                return new zzdjn();
            case 2:
                return new zza((zzdjo) null);
            case 3:
                return zza((zzeah) zzgxp, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\b\u0002\u0004\t\u0003", new Object[]{"zzdl", "zzgxm", zzb.zzag(), "zzdm", "zzgxn", "zzgxo"});
            case 4:
                return zzgxp;
            case 5:
                zzeau<zzdjn> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdjn.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzgxp);
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
        zzdjn zzdjn = new zzdjn();
        zzgxp = zzdjn;
        zzdyz.zza(zzdjn.class, zzdjn);
    }
}
