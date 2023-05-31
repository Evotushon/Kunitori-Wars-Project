package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzsz {

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz<zza, zzb> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zza zzbux;
        private static volatile zzeau<zza> zzdz;
        private zzdzi<C0020zza> zzbuw = zzbdc();

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public enum zzc implements zzdzb {
            UNSPECIFIED(0),
            IN_MEMORY(1);
            
            private static final zzdze<zzc> zzen = null;
            private final int value;

            public final int zzaf() {
                return this.value;
            }

            public static zzc zzbs(int i) {
                if (i == 0) {
                    return UNSPECIFIED;
                }
                if (i != 1) {
                    return null;
                }
                return IN_MEMORY;
            }

            public static zzdzd zzag() {
                return zztb.zzew;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            private zzc(int i) {
                this.value = i;
            }

            static {
                zzen = new zzta();
            }
        }

        private zza() {
        }

        /* renamed from: com.google.android.gms.internal.ads.zzsz$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class C0020zza extends zzdyz<C0020zza, C0021zza> implements zzeaj {
            /* access modifiers changed from: private */
            public static final C0020zza zzbuv;
            private static volatile zzeau<C0020zza> zzdz;
            private int zzbus;
            private zzd zzbut;
            private zze zzbuu;
            private int zzdl;

            private C0020zza() {
            }

            /* renamed from: com.google.android.gms.internal.ads.zzsz$zza$zza$zza  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
            public static final class C0021zza extends zzdyz.zza<C0020zza, C0021zza> implements zzeaj {
                private C0021zza() {
                    super(C0020zza.zzbuv);
                }

                public final C0021zza zzb(zzc zzc) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((C0020zza) this.zzhsu).zza(zzc);
                    return this;
                }

                public final C0021zza zza(zzd.C0022zza zza) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((C0020zza) this.zzhsu).zza((zzd) ((zzdyz) zza.zzbcx()));
                    return this;
                }

                public final C0021zza zza(zze.C0023zza zza) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((C0020zza) this.zzhsu).zza((zze) ((zzdyz) zza.zzbcx()));
                    return this;
                }

                /* synthetic */ C0021zza(zzsy zzsy) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zza(zzc zzc) {
                this.zzbus = zzc.zzaf();
                this.zzdl |= 1;
            }

            /* access modifiers changed from: private */
            public final void zza(zzd zzd) {
                zzd.getClass();
                this.zzbut = zzd;
                this.zzdl |= 2;
            }

            /* access modifiers changed from: private */
            public final void zza(zze zze) {
                zze.getClass();
                this.zzbuu = zze;
                this.zzdl |= 4;
            }

            public static C0021zza zznc() {
                return (C0021zza) zzbuv.zzbcz();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzsy.zzdk[i - 1]) {
                    case 1:
                        return new C0020zza();
                    case 2:
                        return new C0021zza((zzsy) null);
                    case 3:
                        return zza((zzeah) zzbuv, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzdl", "zzbus", zzc.zzag(), "zzbut", "zzbuu"});
                    case 4:
                        return zzbuv;
                    case 5:
                        zzeau<C0020zza> zzeau = zzdz;
                        if (zzeau == null) {
                            synchronized (C0020zza.class) {
                                zzeau = zzdz;
                                if (zzeau == null) {
                                    zzeau = new zzdyz.zzc<>(zzbuv);
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
                C0020zza zza = new C0020zza();
                zzbuv = zza;
                zzdyz.zza(C0020zza.class, zza);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zzd extends zzdyz<zzd, C0022zza> implements zzeaj {
            /* access modifiers changed from: private */
            public static final zzd zzbvd;
            private static volatile zzeau<zzd> zzdz;
            private boolean zzbvb;
            private int zzbvc;
            private int zzdl;

            private zzd() {
            }

            /* renamed from: com.google.android.gms.internal.ads.zzsz$zza$zzd$zza  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
            public static final class C0022zza extends zzdyz.zza<zzd, C0022zza> implements zzeaj {
                private C0022zza() {
                    super(zzd.zzbvd);
                }

                public final C0022zza zzt(boolean z) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zzd) this.zzhsu).zzq(z);
                    return this;
                }

                public final C0022zza zzbu(int i) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zzd) this.zzhsu).zzbt(i);
                    return this;
                }

                /* synthetic */ C0022zza(zzsy zzsy) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zzq(boolean z) {
                this.zzdl |= 1;
                this.zzbvb = z;
            }

            /* access modifiers changed from: private */
            public final void zzbt(int i) {
                this.zzdl |= 2;
                this.zzbvc = i;
            }

            public static C0022zza zzng() {
                return (C0022zza) zzbvd.zzbcz();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzsy.zzdk[i - 1]) {
                    case 1:
                        return new zzd();
                    case 2:
                        return new C0022zza((zzsy) null);
                    case 3:
                        return zza((zzeah) zzbvd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u000b\u0001", new Object[]{"zzdl", "zzbvb", "zzbvc"});
                    case 4:
                        return zzbvd;
                    case 5:
                        zzeau<zzd> zzeau = zzdz;
                        if (zzeau == null) {
                            synchronized (zzd.class) {
                                zzeau = zzdz;
                                if (zzeau == null) {
                                    zzeau = new zzdyz.zzc<>(zzbvd);
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
                zzd zzd = new zzd();
                zzbvd = zzd;
                zzdyz.zza(zzd.class, zzd);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zze extends zzdyz<zze, C0023zza> implements zzeaj {
            /* access modifiers changed from: private */
            public static final zze zzbvg;
            private static volatile zzeau<zze> zzdz;
            private int zzbvc;
            private boolean zzbve;
            private boolean zzbvf;
            private int zzdl;

            private zze() {
            }

            /* renamed from: com.google.android.gms.internal.ads.zzsz$zza$zze$zza  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
            public static final class C0023zza extends zzdyz.zza<zze, C0023zza> implements zzeaj {
                private C0023zza() {
                    super(zze.zzbvg);
                }

                public final C0023zza zzu(boolean z) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzr(z);
                    return this;
                }

                public final C0023zza zzv(boolean z) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzs(z);
                    return this;
                }

                public final C0023zza zzbv(int i) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzbt(i);
                    return this;
                }

                /* synthetic */ C0023zza(zzsy zzsy) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zzr(boolean z) {
                this.zzdl |= 1;
                this.zzbve = z;
            }

            /* access modifiers changed from: private */
            public final void zzs(boolean z) {
                this.zzdl |= 2;
                this.zzbvf = z;
            }

            /* access modifiers changed from: private */
            public final void zzbt(int i) {
                this.zzdl |= 4;
                this.zzbvc = i;
            }

            public static C0023zza zzni() {
                return (C0023zza) zzbvg.zzbcz();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzsy.zzdk[i - 1]) {
                    case 1:
                        return new zze();
                    case 2:
                        return new C0023zza((zzsy) null);
                    case 3:
                        return zza((zzeah) zzbvg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u000b\u0002", new Object[]{"zzdl", "zzbve", "zzbvf", "zzbvc"});
                    case 4:
                        return zzbvg;
                    case 5:
                        zzeau<zze> zzeau = zzdz;
                        if (zzeau == null) {
                            synchronized (zze.class) {
                                zzeau = zzdz;
                                if (zzeau == null) {
                                    zzeau = new zzdyz.zzc<>(zzbvg);
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
                zze zze = new zze();
                zzbvg = zze;
                zzdyz.zza(zze.class, zze);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zzb extends zzdyz.zza<zza, zzb> implements zzeaj {
            private zzb() {
                super(zza.zzbux);
            }

            public final zzb zza(C0020zza.C0021zza zza) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zza((C0020zza) ((zzdyz) zza.zzbcx()));
                return this;
            }

            /* synthetic */ zzb(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(C0020zza zza) {
            zza.getClass();
            if (!this.zzbuw.zzbam()) {
                this.zzbuw = zzdyz.zza(this.zzbuw);
            }
            this.zzbuw.add(zza);
        }

        public static zzb zzne() {
            return (zzb) zzbux.zzbcz();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zzb((zzsy) null);
                case 3:
                    return zza((zzeah) zzbux, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbuw", C0020zza.class});
                case 4:
                    return zzbux;
                case 5:
                    zzeau<zza> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zza.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbux);
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
            zzbux = zza;
            zzdyz.zza(zza.class, zza);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzb extends zzdyz<zzb, C0024zzb> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zzb zzbvj;
        private static volatile zzeau<zzb> zzdz;
        private int zzbvh;
        private zzm zzbvi;
        private int zzdl;

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public enum zza implements zzdzb {
            AD_FORMAT_TYPE_UNSPECIFIED(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE_EXPRESS(3),
            NATIVE_CONTENT(4),
            NATIVE_APP_INSTALL(5),
            NATIVE_CUSTOM_TEMPLATE(6),
            DFP_BANNER(7),
            DFP_INTERSTITIAL(8),
            REWARD_BASED_VIDEO_AD(9),
            BANNER_SEARCH_ADS(10);
            
            private static final zzdze<zza> zzen = null;
            private final int value;

            public final int zzaf() {
                return this.value;
            }

            public static zza zzbw(int i) {
                switch (i) {
                    case 0:
                        return AD_FORMAT_TYPE_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return INTERSTITIAL;
                    case 3:
                        return NATIVE_EXPRESS;
                    case 4:
                        return NATIVE_CONTENT;
                    case 5:
                        return NATIVE_APP_INSTALL;
                    case 6:
                        return NATIVE_CUSTOM_TEMPLATE;
                    case 7:
                        return DFP_BANNER;
                    case 8:
                        return DFP_INTERSTITIAL;
                    case 9:
                        return REWARD_BASED_VIDEO_AD;
                    case 10:
                        return BANNER_SEARCH_ADS;
                    default:
                        return null;
                }
            }

            public static zzdzd zzag() {
                return zztd.zzew;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            private zza(int i) {
                this.value = i;
            }

            static {
                zzen = new zztc();
            }
        }

        private zzb() {
        }

        /* renamed from: com.google.android.gms.internal.ads.zzsz$zzb$zzb  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class C0024zzb extends zzdyz.zza<zzb, C0024zzb> implements zzeaj {
            private C0024zzb() {
                super(zzb.zzbvj);
            }

            /* synthetic */ C0024zzb(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new C0024zzb((zzsy) null);
                case 3:
                    return zza((zzeah) zzbvj, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"zzdl", "zzbvh", zza.zzag(), "zzbvi"});
                case 4:
                    return zzbvj;
                case 5:
                    zzeau<zzb> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzb.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbvj);
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
            zzb zzb = new zzb();
            zzbvj = zzb;
            zzdyz.zza(zzb.class, zzb);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzc extends zzdyz<zzc, zza> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zzc zzbvz;
        private static volatile zzeau<zzc> zzdz;
        private String zzbvw = "";
        private zzdzi<zzb> zzbvx = zzbdc();
        private int zzbvy;
        private int zzdl;

        private zzc() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzc, zza> implements zzeaj {
            private zza() {
                super(zzc.zzbvz);
            }

            /* synthetic */ zza(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza((zzsy) null);
                case 3:
                    return zza((zzeah) zzbvz, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b\u0003\f\u0001", new Object[]{"zzdl", "zzbvw", "zzbvx", zzb.class, "zzbvy", zztf.zzag()});
                case 4:
                    return zzbvz;
                case 5:
                    zzeau<zzc> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzc.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbvz);
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
            zzc zzc = new zzc();
            zzbvz = zzc;
            zzdyz.zza(zzc.class, zzc);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzd extends zzdyz<zzd, zza> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zzd zzbwg;
        private static volatile zzeau<zzd> zzdz;
        private int zzbwa;
        private zzo zzbwb;
        private zzo zzbwc;
        private zzo zzbwd;
        private zzdzi<zzo> zzbwe = zzbdc();
        private int zzbwf;
        private int zzdl;

        private zzd() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzd, zza> implements zzeaj {
            private zza() {
                super(zzd.zzbwg);
            }

            /* synthetic */ zza(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza((zzsy) null);
                case 3:
                    return zza((zzeah) zzbwg, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0004\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\u001b\u0006\u0004\u0004", new Object[]{"zzdl", "zzbwa", "zzbwb", "zzbwc", "zzbwd", "zzbwe", zzo.class, "zzbwf"});
                case 4:
                    return zzbwg;
                case 5:
                    zzeau<zzd> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzd.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbwg);
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
            zzd zzd = new zzd();
            zzbwg = zzd;
            zzdyz.zza(zzd.class, zzd);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zze extends zzdyz<zze, zza> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zze zzbwp;
        private static volatile zzeau<zze> zzdz;
        private String zzbwl = "";
        private int zzbwm;
        private zzdzg zzbwn = zzbdb();
        private zzo zzbwo;
        private int zzdl;

        private zze() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zza extends zzdyz.zza<zze, zza> implements zzeaj {
            private zza() {
                super(zze.zzbwp);
            }

            /* synthetic */ zza(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza((zzsy) null);
                case 3:
                    return zza((zzeah) zzbwp, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\b\u0000\u0002\f\u0001\u0003\u0016\u0004\t\u0002", new Object[]{"zzdl", "zzbwl", "zzbwm", zztf.zzag(), "zzbwn", "zzbwo"});
                case 4:
                    return zzbwp;
                case 5:
                    zzeau<zze> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zze.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbwp);
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
            zze zze = new zze();
            zzbwp = zze;
            zzdyz.zza(zze.class, zze);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzf extends zzdyz<zzf, zza> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zzf zzbwr;
        private static volatile zzeau<zzf> zzdz;
        private zzdzg zzbwn = zzbdb();
        private int zzbwq;
        private int zzdl;

        private zzf() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzf, zza> implements zzeaj {
            private zza() {
                super(zzf.zzbwr);
            }

            /* synthetic */ zza(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza((zzsy) null);
                case 3:
                    return zza((zzeah) zzbwr, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u0016", new Object[]{"zzdl", "zzbwq", zztf.zzag(), "zzbwn"});
                case 4:
                    return zzbwr;
                case 5:
                    zzeau<zzf> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzf.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbwr);
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
            zzf zzf = new zzf();
            zzbwr = zzf;
            zzdyz.zza(zzf.class, zzf);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzg extends zzdyz<zzg, zza> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zzg zzbwu;
        private static volatile zzeau<zzg> zzdz;
        private zzo zzbwo;
        private int zzbwq;
        private zze zzbws;
        private zzdzi<zzn> zzbwt = zzbdc();
        private int zzdl;

        private zzg() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzg, zza> implements zzeaj {
            private zza() {
                super(zzg.zzbwu);
            }

            /* synthetic */ zza(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza((zzsy) null);
                case 3:
                    return zza((zzeah) zzbwu, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b\u0003\f\u0001\u0004\t\u0002", new Object[]{"zzdl", "zzbws", "zzbwt", zzn.class, "zzbwq", zztf.zzag(), "zzbwo"});
                case 4:
                    return zzbwu;
                case 5:
                    zzeau<zzg> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzg.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbwu);
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
            zzg zzg = new zzg();
            zzbwu = zzg;
            zzdyz.zza(zzg.class, zzg);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzi extends zzdyz<zzi, zza> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zzi zzbxi;
        private static volatile zzeau<zzi> zzdz;
        private int zzbxg;
        private zzo zzbxh;
        private int zzdl;

        private zzi() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzi, zza> implements zzeaj {
            private zza() {
                super(zzi.zzbxi);
            }

            /* synthetic */ zza(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza((zzsy) null);
                case 3:
                    return zza((zzeah) zzbxi, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"zzdl", "zzbxg", zztf.zzag(), "zzbxh"});
                case 4:
                    return zzbxi;
                case 5:
                    zzeau<zzi> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzi.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbxi);
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
            zzi zzi = new zzi();
            zzbxi = zzi;
            zzdyz.zza(zzi.class, zzi);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzj extends zzdyz<zzj, zzb> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zzj zzbxo;
        private static volatile zzeau<zzj> zzdz;
        private zzdzi<zza> zzbuw = zzbdc();
        private int zzbxj;
        private int zzbxk;
        private long zzbxl;
        private String zzbxm = "";
        private long zzbxn;
        private int zzdl;
        private String zzdm = "";

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public enum zzc implements zzdzb {
            UNSPECIFIED(0),
            CONNECTING(1),
            CONNECTED(2),
            DISCONNECTING(3),
            DISCONNECTED(4),
            SUSPENDED(5);
            
            private static final zzdze<zzc> zzen = null;
            private final int value;

            public final int zzaf() {
                return this.value;
            }

            public static zzc zzcg(int i) {
                if (i == 0) {
                    return UNSPECIFIED;
                }
                if (i == 1) {
                    return CONNECTING;
                }
                if (i == 2) {
                    return CONNECTED;
                }
                if (i == 3) {
                    return DISCONNECTING;
                }
                if (i == 4) {
                    return DISCONNECTED;
                }
                if (i != 5) {
                    return null;
                }
                return SUSPENDED;
            }

            public static zzdzd zzag() {
                return zztn.zzew;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            private zzc(int i) {
                this.value = i;
            }

            static {
                zzen = new zztm();
            }
        }

        private zzj() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zza extends zzdyz<zza, C0025zza> implements zzeaj {
            private static final zzdzf<Integer, zzb.zza> zzbxu = new zztl();
            /* access modifiers changed from: private */
            public static final zza zzbyc;
            private static volatile zzeau<zza> zzdz;
            private long zzbxp;
            private int zzbxq;
            private long zzbxr;
            private long zzbxs;
            private zzdzg zzbxt = zzbdb();
            private zzh zzbxv;
            private int zzbxw;
            private int zzbxx;
            private int zzbxy;
            private int zzbxz;
            private int zzbya;
            private int zzbyb;
            private int zzdl;

            private zza() {
            }

            /* renamed from: com.google.android.gms.internal.ads.zzsz$zzj$zza$zza  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
            public static final class C0025zza extends zzdyz.zza<zza, C0025zza> implements zzeaj {
                private C0025zza() {
                    super(zza.zzbyc);
                }

                public final C0025zza zzeu(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zza) this.zzhsu).setTimestamp(j);
                    return this;
                }

                public final C0025zza zzf(zztf zztf) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zza) this.zzhsu).zza(zztf);
                    return this;
                }

                public final C0025zza zzev(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zza) this.zzhsu).zzeq(j);
                    return this;
                }

                public final C0025zza zzew(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zza) this.zzhsu).zzer(j);
                    return this;
                }

                public final C0025zza zzd(Iterable<? extends zzb.zza> iterable) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zza) this.zzhsu).zzb(iterable);
                    return this;
                }

                public final C0025zza zzb(zzh zzh) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zza) this.zzhsu).zza(zzh);
                    return this;
                }

                public final C0025zza zzg(zztf zztf) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zza) this.zzhsu).zzb(zztf);
                    return this;
                }

                public final C0025zza zzh(zztf zztf) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zza) this.zzhsu).zzc(zztf);
                    return this;
                }

                public final C0025zza zzi(zztf zztf) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zza) this.zzhsu).zzd(zztf);
                    return this;
                }

                public final C0025zza zzcf(int i) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zza) this.zzhsu).zzcc(i);
                    return this;
                }

                public final C0025zza zzj(zztf zztf) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zza) this.zzhsu).zze(zztf);
                    return this;
                }

                public final C0025zza zzb(zzc zzc) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zza) this.zzhsu).zza(zzc);
                    return this;
                }

                /* synthetic */ C0025zza(zzsy zzsy) {
                    this();
                }
            }

            public final long getTimestamp() {
                return this.zzbxp;
            }

            /* access modifiers changed from: private */
            public final void setTimestamp(long j) {
                this.zzdl |= 1;
                this.zzbxp = j;
            }

            public final zztf zznv() {
                zztf zzbx = zztf.zzbx(this.zzbxq);
                return zzbx == null ? zztf.ENUM_FALSE : zzbx;
            }

            /* access modifiers changed from: private */
            public final void zza(zztf zztf) {
                this.zzbxq = zztf.zzaf();
                this.zzdl |= 2;
            }

            /* access modifiers changed from: private */
            public final void zzeq(long j) {
                this.zzdl |= 4;
                this.zzbxr = j;
            }

            /* access modifiers changed from: private */
            public final void zzer(long j) {
                this.zzdl |= 8;
                this.zzbxs = j;
            }

            /* access modifiers changed from: private */
            public final void zzb(Iterable<? extends zzb.zza> iterable) {
                if (!this.zzbxt.zzbam()) {
                    this.zzbxt = zzdyz.zza(this.zzbxt);
                }
                for (zzb.zza zzaf : iterable) {
                    this.zzbxt.zzgl(zzaf.zzaf());
                }
            }

            /* access modifiers changed from: private */
            public final void zza(zzh zzh) {
                zzh.getClass();
                this.zzbxv = zzh;
                this.zzdl |= 16;
            }

            /* access modifiers changed from: private */
            public final void zzb(zztf zztf) {
                this.zzbxw = zztf.zzaf();
                this.zzdl |= 32;
            }

            /* access modifiers changed from: private */
            public final void zzc(zztf zztf) {
                this.zzbxx = zztf.zzaf();
                this.zzdl |= 64;
            }

            /* access modifiers changed from: private */
            public final void zzd(zztf zztf) {
                this.zzbxy = zztf.zzaf();
                this.zzdl |= 128;
            }

            /* access modifiers changed from: private */
            public final void zzcc(int i) {
                this.zzdl |= 256;
                this.zzbxz = i;
            }

            /* access modifiers changed from: private */
            public final void zze(zztf zztf) {
                this.zzbya = zztf.zzaf();
                this.zzdl |= 512;
            }

            /* access modifiers changed from: private */
            public final void zza(zzc zzc) {
                this.zzbyb = zzc.zzaf();
                this.zzdl |= 1024;
            }

            public static zza zzg(byte[] bArr) throws zzdzh {
                return (zza) zzdyz.zza(zzbyc, bArr);
            }

            public static C0025zza zznw() {
                return (C0025zza) zzbyc.zzbcz();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzsy.zzdk[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C0025zza((zzsy) null);
                    case 3:
                        return zza((zzeah) zzbyc, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001\u0002\u0000\u0002\f\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u001e\u0006\t\u0004\u0007\f\u0005\b\f\u0006\t\f\u0007\n\u0004\b\u000b\f\t\f\f\n", new Object[]{"zzdl", "zzbxp", "zzbxq", zztf.zzag(), "zzbxr", "zzbxs", "zzbxt", zzb.zza.zzag(), "zzbxv", "zzbxw", zztf.zzag(), "zzbxx", zztf.zzag(), "zzbxy", zztf.zzag(), "zzbxz", "zzbya", zztf.zzag(), "zzbyb", zzc.zzag()});
                    case 4:
                        return zzbyc;
                    case 5:
                        zzeau<zza> zzeau = zzdz;
                        if (zzeau == null) {
                            synchronized (zza.class) {
                                zzeau = zzdz;
                                if (zzeau == null) {
                                    zzeau = new zzdyz.zzc<>(zzbyc);
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
                zzbyc = zza;
                zzdyz.zza(zza.class, zza);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zzb extends zzdyz.zza<zzj, zzb> implements zzeaj {
            private zzb() {
                super(zzj.zzbxo);
            }

            public final zzb zzc(Iterable<? extends zza> iterable) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzj) this.zzhsu).zza(iterable);
                return this;
            }

            public final zzb zzcd(int i) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzj) this.zzhsu).zzca(i);
                return this;
            }

            public final zzb zzce(int i) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzj) this.zzhsu).zzcb(i);
                return this;
            }

            public final zzb zzes(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzj) this.zzhsu).zzeo(j);
                return this;
            }

            public final zzb zzcb(String str) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzj) this.zzhsu).zzn(str);
                return this;
            }

            public final zzb zzcc(String str) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzj) this.zzhsu).zzca(str);
                return this;
            }

            public final zzb zzet(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzj) this.zzhsu).zzep(j);
                return this;
            }

            /* synthetic */ zzb(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(Iterable<? extends zza> iterable) {
            if (!this.zzbuw.zzbam()) {
                this.zzbuw = zzdyz.zza(this.zzbuw);
            }
            zzdxd.zza(iterable, this.zzbuw);
        }

        /* access modifiers changed from: private */
        public final void zzca(int i) {
            this.zzdl |= 1;
            this.zzbxj = i;
        }

        /* access modifiers changed from: private */
        public final void zzcb(int i) {
            this.zzdl |= 2;
            this.zzbxk = i;
        }

        /* access modifiers changed from: private */
        public final void zzeo(long j) {
            this.zzdl |= 4;
            this.zzbxl = j;
        }

        /* access modifiers changed from: private */
        public final void zzn(String str) {
            str.getClass();
            this.zzdl |= 8;
            this.zzdm = str;
        }

        /* access modifiers changed from: private */
        public final void zzca(String str) {
            str.getClass();
            this.zzdl |= 16;
            this.zzbxm = str;
        }

        /* access modifiers changed from: private */
        public final void zzep(long j) {
            this.zzdl |= 32;
            this.zzbxn = j;
        }

        public static zzb zznt() {
            return (zzb) zzbxo.zzbcz();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zzb((zzsy) null);
                case 3:
                    return zza((zzeah) zzbxo, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002\u0004\u0000\u0003\u0004\u0001\u0004\u0002\u0002\u0005\b\u0003\u0006\b\u0004\u0007\u0002\u0005", new Object[]{"zzdl", "zzbuw", zza.class, "zzbxj", "zzbxk", "zzbxl", "zzdm", "zzbxm", "zzbxn"});
                case 4:
                    return zzbxo;
                case 5:
                    zzeau<zzj> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzj.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbxo);
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
            zzj zzj = new zzj();
            zzbxo = zzj;
            zzdyz.zza(zzj.class, zzj);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzk extends zzdyz<zzk, zza> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zzk zzbyv;
        private static volatile zzeau<zzk> zzdz;
        private int zzbyk = 1000;
        private int zzbyl = 1000;
        private int zzbym;
        private int zzbyn;
        private int zzbyo;
        private int zzbyp;
        private int zzbyq;
        private int zzbyr;
        private int zzbys;
        private int zzbyt;
        private zzl zzbyu;
        private int zzdl;

        private zzk() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzk, zza> implements zzeaj {
            private zza() {
                super(zzk.zzbyv);
            }

            /* synthetic */ zza(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza((zzsy) null);
                case 3:
                    return zza((zzeah) zzbyv, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0004\u0007\t\u0004\b\n\u0004\t\u000b\t\n", new Object[]{"zzdl", "zzbyk", zztf.zzag(), "zzbyl", zztf.zzag(), "zzbym", "zzbyn", "zzbyo", "zzbyp", "zzbyq", "zzbyr", "zzbys", "zzbyt", "zzbyu"});
                case 4:
                    return zzbyv;
                case 5:
                    zzeau<zzk> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzk.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbyv);
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
            zzk zzk = new zzk();
            zzbyv = zzk;
            zzdyz.zza(zzk.class, zzk);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzl extends zzdyz<zzl, zza> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zzl zzbyy;
        private static volatile zzeau<zzl> zzdz;
        private int zzbyw;
        private int zzbyx;
        private int zzdl;

        private zzl() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzl, zza> implements zzeaj {
            private zza() {
                super(zzl.zzbyy);
            }

            /* synthetic */ zza(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zza((zzsy) null);
                case 3:
                    return zza((zzeah) zzbyy, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzdl", "zzbyw", "zzbyx"});
                case 4:
                    return zzbyy;
                case 5:
                    zzeau<zzl> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzl.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbyy);
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
            zzl zzl = new zzl();
            zzbyy = zzl;
            zzdyz.zza(zzl.class, zzl);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzm extends zzdyz<zzm, zza> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zzm zzbzb;
        private static volatile zzeau<zzm> zzdz;
        private int zzbyz;
        private int zzbza;
        private int zzdl;

        private zzm() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzm, zza> implements zzeaj {
            private zza() {
                super(zzm.zzbzb);
            }

            /* synthetic */ zza(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zza((zzsy) null);
                case 3:
                    return zza((zzeah) zzbzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzdl", "zzbyz", "zzbza"});
                case 4:
                    return zzbzb;
                case 5:
                    zzeau<zzm> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzm.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbzb);
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
            zzm zzm = new zzm();
            zzbzb = zzm;
            zzdyz.zza(zzm.class, zzm);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzn extends zzdyz<zzn, zza> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zzn zzbzc;
        private static volatile zzeau<zzn> zzdz;
        private String zzbwl = "";
        private int zzbwm;
        private zzo zzbwo;
        private int zzdl;

        private zzn() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzn, zza> implements zzeaj {
            private zza() {
                super(zzn.zzbzc);
            }

            /* synthetic */ zza(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza((zzsy) null);
                case 3:
                    return zza((zzeah) zzbzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0003\t\u0002", new Object[]{"zzdl", "zzbwl", "zzbwm", zztf.zzag(), "zzbwo"});
                case 4:
                    return zzbzc;
                case 5:
                    zzeau<zzn> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzn.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbzc);
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
            zzn zzn = new zzn();
            zzbzc = zzn;
            zzdyz.zza(zzn.class, zzn);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzo extends zzdyz<zzo, zza> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zzo zzbzf;
        private static volatile zzeau<zzo> zzdz;
        private int zzbzd;
        private int zzbze;
        private int zzdl;

        private zzo() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzo, zza> implements zzeaj {
            private zza() {
                super(zzo.zzbzf);
            }

            /* synthetic */ zza(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zzo();
                case 2:
                    return new zza((zzsy) null);
                case 3:
                    return zza((zzeah) zzbzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzdl", "zzbzd", "zzbze"});
                case 4:
                    return zzbzf;
                case 5:
                    zzeau<zzo> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzo.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbzf);
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
            zzo zzo = new zzo();
            zzbzf = zzo;
            zzdyz.zza(zzo.class, zzo);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzp extends zzdyz<zzp, zza> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zzp zzbzi;
        private static volatile zzeau<zzp> zzdz;
        private int zzbwq = 1000;
        private zzq zzbzg;
        private zzo zzbzh;
        private int zzdl;

        private zzp() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzp, zza> implements zzeaj {
            private zza() {
                super(zzp.zzbzi);
            }

            /* synthetic */ zza(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zzp();
                case 2:
                    return new zza((zzsy) null);
                case 3:
                    return zza((zzeah) zzbzi, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzdl", "zzbwq", zztf.zzag(), "zzbzg", "zzbzh"});
                case 4:
                    return zzbzi;
                case 5:
                    zzeau<zzp> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzp.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbzi);
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
            zzp zzp = new zzp();
            zzbzi = zzp;
            zzdyz.zza(zzp.class, zzp);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzq extends zzdyz<zzq, zzb> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zzq zzbzk;
        private static volatile zzeau<zzq> zzdz;
        private int zzbzj;
        private int zzdl;

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public enum zza implements zzdzb {
            VIDEO_ERROR_CODE_UNSPECIFIED(0),
            OPENGL_RENDERING_FAILED(1),
            CACHE_LOAD_FAILED(2),
            ANDROID_TARGET_API_TOO_LOW(3);
            
            private static final zzdze<zza> zzen = null;
            private final int value;

            public final int zzaf() {
                return this.value;
            }

            public static zza zzch(int i) {
                if (i == 0) {
                    return VIDEO_ERROR_CODE_UNSPECIFIED;
                }
                if (i == 1) {
                    return OPENGL_RENDERING_FAILED;
                }
                if (i == 2) {
                    return CACHE_LOAD_FAILED;
                }
                if (i != 3) {
                    return null;
                }
                return ANDROID_TARGET_API_TOO_LOW;
            }

            public static zzdzd zzag() {
                return zzto.zzew;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            private zza(int i) {
                this.value = i;
            }

            static {
                zzen = new zztp();
            }
        }

        private zzq() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zzb extends zzdyz.zza<zzq, zzb> implements zzeaj {
            private zzb() {
                super(zzq.zzbzk);
            }

            /* synthetic */ zzb(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zzq();
                case 2:
                    return new zzb((zzsy) null);
                case 3:
                    return zza((zzeah) zzbzk, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"zzdl", "zzbzj", zza.zzag()});
                case 4:
                    return zzbzk;
                case 5:
                    zzeau<zzq> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzq.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbzk);
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
            zzq zzq = new zzq();
            zzbzk = zzq;
            zzdyz.zza(zzq.class, zzq);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzr extends zzdyz<zzr, zza> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zzr zzbzt;
        private static volatile zzeau<zzr> zzdz;
        private int zzbwq = 1000;
        private zzq zzbzg;
        private int zzbzq;
        private int zzbzr;
        private int zzbzs;
        private int zzdl;

        private zzr() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzr, zza> implements zzeaj {
            private zza() {
                super(zzr.zzbzt);
            }

            /* synthetic */ zza(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zzr();
                case 2:
                    return new zza((zzsy) null);
                case 3:
                    return zza((zzeah) zzbzt, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004", new Object[]{"zzdl", "zzbwq", zztf.zzag(), "zzbzg", "zzbzq", "zzbzr", "zzbzs"});
                case 4:
                    return zzbzt;
                case 5:
                    zzeau<zzr> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzr.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbzt);
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
            zzr zzr = new zzr();
            zzbzt = zzr;
            zzdyz.zza(zzr.class, zzr);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzs extends zzdyz<zzs, zza> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zzs zzbzu;
        private static volatile zzeau<zzs> zzdz;
        private int zzbwq = 1000;
        private zzq zzbzg;
        private zzo zzbzh;
        private int zzdl;

        private zzs() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzs, zza> implements zzeaj {
            private zza() {
                super(zzs.zzbzu);
            }

            /* synthetic */ zza(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zzs();
                case 2:
                    return new zza((zzsy) null);
                case 3:
                    return zza((zzeah) zzbzu, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzdl", "zzbwq", zztf.zzag(), "zzbzg", "zzbzh"});
                case 4:
                    return zzbzu;
                case 5:
                    zzeau<zzs> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzs.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbzu);
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
            zzs zzs = new zzs();
            zzbzu = zzs;
            zzdyz.zza(zzs.class, zzs);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzt extends zzdyz<zzt, zza> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zzt zzbzw;
        private static volatile zzeau<zzt> zzdz;
        private int zzbwq = 1000;
        private zzq zzbzg;
        private int zzbzq;
        private int zzbzr;
        private int zzbzs;
        private long zzbzv;
        private int zzdl;

        private zzt() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzt, zza> implements zzeaj {
            private zza() {
                super(zzt.zzbzw);
            }

            /* synthetic */ zza(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zzt();
                case 2:
                    return new zza((zzsy) null);
                case 3:
                    return zza((zzeah) zzbzw, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0003\u0005", new Object[]{"zzdl", "zzbwq", zztf.zzag(), "zzbzg", "zzbzq", "zzbzr", "zzbzs", "zzbzv"});
                case 4:
                    return zzbzw;
                case 5:
                    zzeau<zzt> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzt.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbzw);
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
            zzt zzt = new zzt();
            zzbzw = zzt;
            zzdyz.zza(zzt.class, zzt);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzu extends zzdyz<zzu, zza> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zzu zzbzx;
        private static volatile zzeau<zzu> zzdz;
        private int zzbwq = 1000;
        private zzq zzbzg;
        private zzo zzbzh;
        private int zzdl;

        private zzu() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzu, zza> implements zzeaj {
            private zza() {
                super(zzu.zzbzx);
            }

            /* synthetic */ zza(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zzu();
                case 2:
                    return new zza((zzsy) null);
                case 3:
                    return zza((zzeah) zzbzx, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzdl", "zzbwq", zztf.zzag(), "zzbzg", "zzbzh"});
                case 4:
                    return zzbzx;
                case 5:
                    zzeau<zzu> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzu.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbzx);
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
            zzu zzu = new zzu();
            zzbzx = zzu;
            zzdyz.zza(zzu.class, zzu);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzv extends zzdyz<zzv, zza> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zzv zzbzy;
        private static volatile zzeau<zzv> zzdz;
        private int zzbwq = 1000;
        private zzq zzbzg;
        private int zzdl;

        private zzv() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzv, zza> implements zzeaj {
            private zza() {
                super(zzv.zzbzy);
            }

            /* synthetic */ zza(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zzv();
                case 2:
                    return new zza((zzsy) null);
                case 3:
                    return zza((zzeah) zzbzy, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"zzdl", "zzbwq", zztf.zzag(), "zzbzg"});
                case 4:
                    return zzbzy;
                case 5:
                    zzeau<zzv> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzv.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbzy);
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
            zzv zzv = new zzv();
            zzbzy = zzv;
            zzdyz.zza(zzv.class, zzv);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzw extends zzdyz<zzw, zza> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zzw zzcab;
        private static volatile zzeau<zzw> zzdz;
        private boolean zzbzz;
        private int zzcaa;
        private int zzdl;

        private zzw() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzw, zza> implements zzeaj {
            private zza() {
                super(zzw.zzcab);
            }

            public final boolean zzok() {
                return ((zzw) this.zzhsu).zzok();
            }

            public final zza zzw(boolean z) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzw) this.zzhsu).zzx(z);
                return this;
            }

            public final zza zzci(int i) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzw) this.zzhsu).zzcj(i);
                return this;
            }

            /* synthetic */ zza(zzsy zzsy) {
                this();
            }
        }

        public final boolean zzok() {
            return this.zzbzz;
        }

        /* access modifiers changed from: private */
        public final void zzx(boolean z) {
            this.zzdl |= 1;
            this.zzbzz = z;
        }

        /* access modifiers changed from: private */
        public final void zzcj(int i) {
            this.zzdl |= 2;
            this.zzcaa = i;
        }

        public static zza zzol() {
            return (zza) zzcab.zzbcz();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zzw();
                case 2:
                    return new zza((zzsy) null);
                case 3:
                    return zza((zzeah) zzcab, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0004\u0001", new Object[]{"zzdl", "zzbzz", "zzcaa"});
                case 4:
                    return zzcab;
                case 5:
                    zzeau<zzw> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzw.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzcab);
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
            zzw zzw = new zzw();
            zzcab = zzw;
            zzdyz.zza(zzw.class, zzw);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzh extends zzdyz<zzh, zzb> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zzh zzbww;
        private static volatile zzeau<zzh> zzdz;
        private int zzbvh;
        private int zzbwv;
        private int zzdl;

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public enum zza implements zzdzb {
            CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
            TWO_G(1),
            THREE_G(2),
            LTE(4);
            
            private static final zzdze<zza> zzen = null;
            private final int value;

            public final int zzaf() {
                return this.value;
            }

            public static zza zzby(int i) {
                if (i == 0) {
                    return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                }
                if (i == 1) {
                    return TWO_G;
                }
                if (i == 2) {
                    return THREE_G;
                }
                if (i != 4) {
                    return null;
                }
                return LTE;
            }

            public static zzdzd zzag() {
                return zzth.zzew;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            private zza(int i) {
                this.value = i;
            }

            static {
                zzen = new zzti();
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public enum zzc implements zzdzb {
            NETWORKTYPE_UNSPECIFIED(0),
            CELL(1),
            WIFI(2);
            
            private static final zzdze<zzc> zzen = null;
            private final int value;

            public final int zzaf() {
                return this.value;
            }

            public static zzc zzbz(int i) {
                if (i == 0) {
                    return NETWORKTYPE_UNSPECIFIED;
                }
                if (i == 1) {
                    return CELL;
                }
                if (i != 2) {
                    return null;
                }
                return WIFI;
            }

            public static zzdzd zzag() {
                return zztk.zzew;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            private zzc(int i) {
                this.value = i;
            }

            static {
                zzen = new zztj();
            }
        }

        private zzh() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zzb extends zzdyz.zza<zzh, zzb> implements zzeaj {
            private zzb() {
                super(zzh.zzbww);
            }

            public final zzb zzb(zzc zzc) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzh) this.zzhsu).zza(zzc);
                return this;
            }

            public final zzb zzb(zza zza) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzh) this.zzhsu).zza(zza);
                return this;
            }

            /* synthetic */ zzb(zzsy zzsy) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzc zzc2) {
            this.zzbvh = zzc2.zzaf();
            this.zzdl |= 1;
        }

        /* access modifiers changed from: private */
        public final void zza(zza zza2) {
            this.zzbwv = zza2.zzaf();
            this.zzdl |= 2;
        }

        public static zzb zznq() {
            return (zzb) zzbww.zzbcz();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzsy.zzdk[i - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zzb((zzsy) null);
                case 3:
                    return zza((zzeah) zzbww, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"zzdl", "zzbvh", zzc.zzag(), "zzbwv", zza.zzag()});
                case 4:
                    return zzbww;
                case 5:
                    zzeau<zzh> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzh.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzbww);
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
            zzh zzh = new zzh();
            zzbww = zzh;
            zzdyz.zza(zzh.class, zzh);
        }
    }
}
