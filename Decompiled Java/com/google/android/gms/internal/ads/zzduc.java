package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzduc extends zzdyz<zzduc, zza> implements zzeaj {
    private static volatile zzeau<zzduc> zzdz;
    /* access modifiers changed from: private */
    public static final zzduc zzhjb;
    private String zzhiy = "";
    private zzdxn zzhiz = zzdxn.zzhoe;
    private int zzhja;

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public enum zzb implements zzdzb {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        private static final zzdze<zzb> zzen = null;
        private final int value;

        public final int zzaf() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static zzb zzeo(int i) {
            if (i == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i == 1) {
                return SYMMETRIC;
            }
            if (i == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i != 4) {
                return null;
            }
            return REMOTE;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(getClass().getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb.append(" number=");
                sb.append(zzaf());
            }
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }

        private zzb(int i) {
            this.value = i;
        }

        static {
            zzen = new zzdue();
        }
    }

    private zzduc() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzduc, zza> implements zzeaj {
        private zza() {
            super(zzduc.zzhjb);
        }

        public final zza zzhe(String str) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzduc) this.zzhsu).zzhd(str);
            return this;
        }

        public final zza zzaf(zzdxn zzdxn) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzduc) this.zzhsu).zzae(zzdxn);
            return this;
        }

        public final zza zzb(zzb zzb) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzduc) this.zzhsu).zza(zzb);
            return this;
        }

        /* synthetic */ zza(zzdud zzdud) {
            this();
        }
    }

    public final String zzayh() {
        return this.zzhiy;
    }

    /* access modifiers changed from: private */
    public final void zzhd(String str) {
        str.getClass();
        this.zzhiy = str;
    }

    public final zzdxn zzayi() {
        return this.zzhiz;
    }

    /* access modifiers changed from: private */
    public final void zzae(zzdxn zzdxn) {
        zzdxn.getClass();
        this.zzhiz = zzdxn;
    }

    public final zzb zzayj() {
        zzb zzeo = zzb.zzeo(this.zzhja);
        return zzeo == null ? zzb.UNRECOGNIZED : zzeo;
    }

    /* access modifiers changed from: private */
    public final void zza(zzb zzb2) {
        this.zzhja = zzb2.zzaf();
    }

    public static zza zzayk() {
        return (zza) zzhjb.zzbcz();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdud.zzdk[i - 1]) {
            case 1:
                return new zzduc();
            case 2:
                return new zza((zzdud) null);
            case 3:
                return zza((zzeah) zzhjb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzhiy", "zzhiz", "zzhja"});
            case 4:
                return zzhjb;
            case 5:
                zzeau<zzduc> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzduc.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhjb);
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

    public static zzduc zzayl() {
        return zzhjb;
    }

    static {
        zzduc zzduc = new zzduc();
        zzhjb = zzduc;
        zzdyz.zza(zzduc.class, zzduc);
    }
}
