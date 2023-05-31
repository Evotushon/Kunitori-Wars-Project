package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdum extends zzdyz<zzdum, zzb> implements zzeaj {
    private static volatile zzeau<zzdum> zzdz;
    /* access modifiers changed from: private */
    public static final zzdum zzhjy;
    private int zzhjw;
    private zzdzi<zza> zzhjx = zzbdc();

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz<zza, C0008zza> implements zzeaj {
        private static volatile zzeau<zza> zzdz;
        /* access modifiers changed from: private */
        public static final zza zzhkc;
        private int zzhjp;
        private zzduc zzhjz;
        private int zzhka;
        private int zzhkb;

        private zza() {
        }

        /* renamed from: com.google.android.gms.internal.ads.zzdum$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class C0008zza extends zzdyz.zza<zza, C0008zza> implements zzeaj {
            private C0008zza() {
                super(zza.zzhkc);
            }

            /* synthetic */ C0008zza(zzdul zzdul) {
                this();
            }
        }

        public final boolean zzayy() {
            return this.zzhjz != null;
        }

        public final zzduc zzayz() {
            zzduc zzduc = this.zzhjz;
            return zzduc == null ? zzduc.zzayl() : zzduc;
        }

        public final zzdug zzavi() {
            zzdug zzep = zzdug.zzep(this.zzhka);
            return zzep == null ? zzdug.UNRECOGNIZED : zzep;
        }

        public final int zzaza() {
            return this.zzhkb;
        }

        public final zzduy zzavj() {
            zzduy zzew = zzduy.zzew(this.zzhjp);
            return zzew == null ? zzduy.UNRECOGNIZED : zzew;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzdul.zzdk[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0008zza((zzdul) null);
                case 3:
                    return zza((zzeah) zzhkc, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzhjz", "zzhka", "zzhkb", "zzhjp"});
                case 4:
                    return zzhkc;
                case 5:
                    zzeau<zza> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zza.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzhkc);
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
            zza zza = new zza();
            zzhkc = zza;
            zzdyz.zza(zza.class, zza);
        }
    }

    private zzdum() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzb extends zzdyz.zza<zzdum, zzb> implements zzeaj {
        private zzb() {
            super(zzdum.zzhjy);
        }

        /* synthetic */ zzb(zzdul zzdul) {
            this();
        }
    }

    public final int zzayu() {
        return this.zzhjw;
    }

    public final List<zza> zzayv() {
        return this.zzhjx;
    }

    public final int zzayw() {
        return this.zzhjx.size();
    }

    public static zzdum zzc(byte[] bArr, zzdym zzdym) throws zzdzh {
        return (zzdum) zzdyz.zza(zzhjy, bArr, zzdym);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdul.zzdk[i - 1]) {
            case 1:
                return new zzdum();
            case 2:
                return new zzb((zzdul) null);
            case 3:
                return zza((zzeah) zzhjy, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzhjw", "zzhjx", zza.class});
            case 4:
                return zzhjy;
            case 5:
                zzeau<zzdum> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdum.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhjy);
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
        zzdum zzdum = new zzdum();
        zzhjy = zzdum;
        zzdyz.zza(zzdum.class, zzdum);
    }
}
