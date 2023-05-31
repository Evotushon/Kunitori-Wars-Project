package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzede {

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz<zza, C0009zza> implements zzeaj {
        private static volatile zzeau<zza> zzdz;
        /* access modifiers changed from: private */
        public static final zza zziau;
        private int zzdl;
        private int zzian;
        private zzb zziao;
        private zzdxn zziap = zzdxn.zzhoe;
        private zzdxn zziaq = zzdxn.zzhoe;
        private boolean zziar;
        private boolean zzias;
        private byte zziat = 2;

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zzb extends zzdyz<zzb, C0010zza> implements zzeaj {
            private static volatile zzeau<zzb> zzdz;
            /* access modifiers changed from: private */
            public static final zzb zziaz;
            private int zzdl;
            private String zziav = "";
            private String zziaw = "";
            private String zziax = "";
            private int zziay;

            private zzb() {
            }

            /* renamed from: com.google.android.gms.internal.ads.zzede$zza$zzb$zza  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
            public static final class C0010zza extends zzdyz.zza<zzb, C0010zza> implements zzeaj {
                private C0010zza() {
                    super(zzb.zziaz);
                }

                /* synthetic */ C0010zza(zzedd zzedd) {
                    this();
                }
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzedd.zzdk[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new C0010zza((zzedd) null);
                    case 3:
                        return zza((zzeah) zziaz, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0004\u0003", new Object[]{"zzdl", "zziav", "zziaw", "zziax", "zziay"});
                    case 4:
                        return zziaz;
                    case 5:
                        zzeau<zzb> zzeau = zzdz;
                        if (zzeau == null) {
                            synchronized (zzb.class) {
                                zzeau = zzdz;
                                if (zzeau == null) {
                                    zzeau = new zzdyz.zzc<>(zziaz);
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
                zziaz = zzb;
                zzdyz.zza(zzb.class, zzb);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public enum zzc implements zzdzb {
            SAFE(0),
            DANGEROUS(1),
            UNKNOWN(2),
            POTENTIALLY_UNWANTED(3),
            DANGEROUS_HOST(4);
            
            private static final zzdze<zzc> zzen = null;
            private final int value;

            public final int zzaf() {
                return this.value;
            }

            public static zzc zzhe(int i) {
                if (i == 0) {
                    return SAFE;
                }
                if (i == 1) {
                    return DANGEROUS;
                }
                if (i == 2) {
                    return UNKNOWN;
                }
                if (i == 3) {
                    return POTENTIALLY_UNWANTED;
                }
                if (i != 4) {
                    return null;
                }
                return DANGEROUS_HOST;
            }

            public static zzdzd zzag() {
                return zzedg.zzew;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            private zzc(int i) {
                this.value = i;
            }

            static {
                zzen = new zzedf();
            }
        }

        private zza() {
        }

        /* renamed from: com.google.android.gms.internal.ads.zzede$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class C0009zza extends zzdyz.zza<zza, C0009zza> implements zzeaj {
            private C0009zza() {
                super(zza.zziau);
            }

            /* synthetic */ C0009zza(zzedd zzedd) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            int i2 = 0;
            switch (zzedd.zzdk[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0009zza((zzedd) null);
                case 3:
                    return zza((zzeah) zziau, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001Ԍ\u0000\u0002\t\u0001\u0003\n\u0002\u0004\n\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"zzdl", "zzian", zzc.zzag(), "zziao", "zziap", "zziaq", "zziar", "zzias"});
                case 4:
                    return zziau;
                case 5:
                    zzeau<zza> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zza.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zziau);
                                zzdz = zzeau;
                            }
                        }
                    }
                    return zzeau;
                case 6:
                    return Byte.valueOf(this.zziat);
                case 7:
                    if (obj != null) {
                        i2 = 1;
                    }
                    this.zziat = (byte) i2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zza zza = new zza();
            zziau = zza;
            zzdyz.zza(zza.class, zza);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzb extends zzdyz<zzb, C0012zzb> implements zzeaj {
        private static volatile zzeau<zzb> zzdz;
        /* access modifiers changed from: private */
        public static final zzb zzibv;
        private int zzbvh;
        private int zzdl;
        private zzdxn zziap = zzdxn.zzhoe;
        private byte zziat = 2;
        private String zziaw = "";
        private int zzibg;
        private String zzibh = "";
        private String zzibi = "";
        private zza zzibj;
        private zzdzi<zzh> zzibk = zzbdc();
        private String zzibl = "";
        private zzf zzibm;
        private boolean zzibn;
        private zzdzi<String> zzibo = zzdyz.zzbdc();
        private String zzibp = "";
        private boolean zzibq;
        private boolean zzibr;
        private zzi zzibs;
        private zzdzi<String> zzibt = zzdyz.zzbdc();
        private zzdzi<String> zzibu = zzdyz.zzbdc();

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zzd extends zzdyz<zzd, C0014zzb> implements zzeaj {
            private static volatile zzeau<zzd> zzdz;
            /* access modifiers changed from: private */
            public static final zzd zzicf;
            private int zzdl;
            private byte zziat = 2;
            private zza zzica;
            private zzdzi<zzc> zzicb = zzbdc();
            private zzdxn zzicc = zzdxn.zzhoe;
            private zzdxn zzicd = zzdxn.zzhoe;
            private int zzice;

            /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
            public static final class zza extends zzdyz<zza, C0013zza> implements zzeaj {
                private static volatile zzeau<zza> zzdz;
                /* access modifiers changed from: private */
                public static final zza zzicj;
                private int zzdl;
                private zzdxn zzicg = zzdxn.zzhoe;
                private zzdxn zzich = zzdxn.zzhoe;
                private zzdxn zzici = zzdxn.zzhoe;

                private zza() {
                }

                /* renamed from: com.google.android.gms.internal.ads.zzede$zzb$zzd$zza$zza  reason: collision with other inner class name */
                /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
                public static final class C0013zza extends zzdyz.zza<zza, C0013zza> implements zzeaj {
                    private C0013zza() {
                        super(zza.zzicj);
                    }

                    /* synthetic */ C0013zza(zzedd zzedd) {
                        this();
                    }
                }

                /* access modifiers changed from: protected */
                public final Object zza(int i, Object obj, Object obj2) {
                    switch (zzedd.zzdk[i - 1]) {
                        case 1:
                            return new zza();
                        case 2:
                            return new C0013zza((zzedd) null);
                        case 3:
                            return zza((zzeah) zzicj, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0000\u0002\n\u0001\u0003\n\u0002", new Object[]{"zzdl", "zzicg", "zzich", "zzici"});
                        case 4:
                            return zzicj;
                        case 5:
                            zzeau<zza> zzeau = zzdz;
                            if (zzeau == null) {
                                synchronized (zza.class) {
                                    zzeau = zzdz;
                                    if (zzeau == null) {
                                        zzeau = new zzdyz.zzc<>(zzicj);
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
                    zzicj = zza;
                    zzdyz.zza(zza.class, zza);
                }
            }

            private zzd() {
            }

            /* renamed from: com.google.android.gms.internal.ads.zzede$zzb$zzd$zzb  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
            public static final class C0014zzb extends zzdyz.zza<zzd, C0014zzb> implements zzeaj {
                private C0014zzb() {
                    super(zzd.zzicf);
                }

                /* synthetic */ C0014zzb(zzedd zzedd) {
                    this();
                }
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                int i2 = 0;
                switch (zzedd.zzdk[i - 1]) {
                    case 1:
                        return new zzd();
                    case 2:
                        return new C0014zzb((zzedd) null);
                    case 3:
                        return zza((zzeah) zzicf, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\t\u0000\u0002Л\u0003\n\u0001\u0004\n\u0002\u0005\u0004\u0003", new Object[]{"zzdl", "zzica", "zzicb", zzc.class, "zzicc", "zzicd", "zzice"});
                    case 4:
                        return zzicf;
                    case 5:
                        zzeau<zzd> zzeau = zzdz;
                        if (zzeau == null) {
                            synchronized (zzd.class) {
                                zzeau = zzdz;
                                if (zzeau == null) {
                                    zzeau = new zzdyz.zzc<>(zzicf);
                                    zzdz = zzeau;
                                }
                            }
                        }
                        return zzeau;
                    case 6:
                        return Byte.valueOf(this.zziat);
                    case 7:
                        if (obj != null) {
                            i2 = 1;
                        }
                        this.zziat = (byte) i2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzd zzd = new zzd();
                zzicf = zzd;
                zzdyz.zza(zzd.class, zzd);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zze extends zzdyz<zze, C0016zzb> implements zzeaj {
            private static volatile zzeau<zze> zzdz;
            /* access modifiers changed from: private */
            public static final zze zzicm;
            private int zzdl;
            private byte zziat = 2;
            private zzdzi<zzc> zzicb = zzbdc();
            private zzdxn zzicc = zzdxn.zzhoe;
            private zzdxn zzicd = zzdxn.zzhoe;
            private int zzice;
            private zza zzick;
            private zzdxn zzicl = zzdxn.zzhoe;

            /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
            public static final class zza extends zzdyz<zza, C0015zza> implements zzeaj {
                private static volatile zzeau<zza> zzdz;
                /* access modifiers changed from: private */
                public static final zza zzicp;
                private int zzdl;
                private zzdxn zzici = zzdxn.zzhoe;
                private int zzicn;
                private zzdxn zzico = zzdxn.zzhoe;

                private zza() {
                }

                /* renamed from: com.google.android.gms.internal.ads.zzede$zzb$zze$zza$zza  reason: collision with other inner class name */
                /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
                public static final class C0015zza extends zzdyz.zza<zza, C0015zza> implements zzeaj {
                    private C0015zza() {
                        super(zza.zzicp);
                    }

                    /* synthetic */ C0015zza(zzedd zzedd) {
                        this();
                    }
                }

                /* access modifiers changed from: protected */
                public final Object zza(int i, Object obj, Object obj2) {
                    switch (zzedd.zzdk[i - 1]) {
                        case 1:
                            return new zza();
                        case 2:
                            return new C0015zza((zzedd) null);
                        case 3:
                            return zza((zzeah) zzicp, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\n\u0001\u0003\n\u0002", new Object[]{"zzdl", "zzicn", "zzico", "zzici"});
                        case 4:
                            return zzicp;
                        case 5:
                            zzeau<zza> zzeau = zzdz;
                            if (zzeau == null) {
                                synchronized (zza.class) {
                                    zzeau = zzdz;
                                    if (zzeau == null) {
                                        zzeau = new zzdyz.zzc<>(zzicp);
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
                    zzicp = zza;
                    zzdyz.zza(zza.class, zza);
                }
            }

            private zze() {
            }

            /* renamed from: com.google.android.gms.internal.ads.zzede$zzb$zze$zzb  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
            public static final class C0016zzb extends zzdyz.zza<zze, C0016zzb> implements zzeaj {
                private C0016zzb() {
                    super(zze.zzicm);
                }

                /* synthetic */ C0016zzb(zzedd zzedd) {
                    this();
                }
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                int i2 = 0;
                switch (zzedd.zzdk[i - 1]) {
                    case 1:
                        return new zze();
                    case 2:
                        return new C0016zzb((zzedd) null);
                    case 3:
                        return zza((zzeah) zzicm, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\t\u0000\u0002Л\u0003\n\u0001\u0004\n\u0002\u0005\u0004\u0003\u0006\n\u0004", new Object[]{"zzdl", "zzick", "zzicb", zzc.class, "zzicc", "zzicd", "zzice", "zzicl"});
                    case 4:
                        return zzicm;
                    case 5:
                        zzeau<zze> zzeau = zzdz;
                        if (zzeau == null) {
                            synchronized (zze.class) {
                                zzeau = zzdz;
                                if (zzeau == null) {
                                    zzeau = new zzdyz.zzc<>(zzicm);
                                    zzdz = zzeau;
                                }
                            }
                        }
                        return zzeau;
                    case 6:
                        return Byte.valueOf(this.zziat);
                    case 7:
                        if (obj != null) {
                            i2 = 1;
                        }
                        this.zziat = (byte) i2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zze zze = new zze();
                zzicm = zze;
                zzdyz.zza(zze.class, zze);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zzf extends zzdyz<zzf, C0017zzb> implements zzeaj {
            private static volatile zzeau<zzf> zzdz;
            /* access modifiers changed from: private */
            public static final zzf zzics;
            private int zzbvh;
            private int zzdl;
            private String zzicq = "";
            private zzdxn zzicr = zzdxn.zzhoe;

            /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
            public enum zza implements zzdzb {
                TYPE_UNKNOWN(0),
                TYPE_CREATIVE(1);
                
                private static final zzdze<zza> zzen = null;
                private final int value;

                public final int zzaf() {
                    return this.value;
                }

                public static zza zzhf(int i) {
                    if (i == 0) {
                        return TYPE_UNKNOWN;
                    }
                    if (i != 1) {
                        return null;
                    }
                    return TYPE_CREATIVE;
                }

                public static zzdzd zzag() {
                    return zzedh.zzew;
                }

                public final String toString() {
                    return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
                }

                private zza(int i) {
                    this.value = i;
                }

                static {
                    zzen = new zzedi();
                }
            }

            private zzf() {
            }

            /* renamed from: com.google.android.gms.internal.ads.zzede$zzb$zzf$zzb  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
            public static final class C0017zzb extends zzdyz.zza<zzf, C0017zzb> implements zzeaj {
                private C0017zzb() {
                    super(zzf.zzics);
                }

                /* synthetic */ C0017zzb(zzedd zzedd) {
                    this();
                }
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzedd.zzdk[i - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new C0017zzb((zzedd) null);
                    case 3:
                        return zza((zzeah) zzics, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\n\u0002", new Object[]{"zzdl", "zzbvh", zza.zzag(), "zzicq", "zzicr"});
                    case 4:
                        return zzics;
                    case 5:
                        zzeau<zzf> zzeau = zzdz;
                        if (zzeau == null) {
                            synchronized (zzf.class) {
                                zzeau = zzdz;
                                if (zzeau == null) {
                                    zzeau = new zzdyz.zzc<>(zzics);
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
                zzics = zzf;
                zzdyz.zza(zzf.class, zzf);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public enum zzg implements zzdzb {
            UNKNOWN(0),
            URL_PHISHING(1),
            URL_MALWARE(2),
            URL_UNWANTED(3),
            CLIENT_SIDE_PHISHING_URL(4),
            CLIENT_SIDE_MALWARE_URL(5),
            DANGEROUS_DOWNLOAD_RECOVERY(6),
            DANGEROUS_DOWNLOAD_WARNING(7),
            OCTAGON_AD(8),
            OCTAGON_AD_SB_MATCH(9);
            
            private static final zzdze<zzg> zzen = null;
            private final int value;

            public final int zzaf() {
                return this.value;
            }

            public static zzg zzhg(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return URL_PHISHING;
                    case 2:
                        return URL_MALWARE;
                    case 3:
                        return URL_UNWANTED;
                    case 4:
                        return CLIENT_SIDE_PHISHING_URL;
                    case 5:
                        return CLIENT_SIDE_MALWARE_URL;
                    case 6:
                        return DANGEROUS_DOWNLOAD_RECOVERY;
                    case 7:
                        return DANGEROUS_DOWNLOAD_WARNING;
                    case 8:
                        return OCTAGON_AD;
                    case 9:
                        return OCTAGON_AD_SB_MATCH;
                    default:
                        return null;
                }
            }

            public static zzdzd zzag() {
                return zzedk.zzew;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            private zzg(int i) {
                this.value = i;
            }

            static {
                zzen = new zzedj();
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zzh extends zzdyz<zzh, C0018zzb> implements zzeaj {
            private static volatile zzeau<zzh> zzdz;
            /* access modifiers changed from: private */
            public static final zzh zzidp;
            private int zzdl;
            private byte zziat = 2;
            private String zziaw = "";
            private int zzidh;
            private zzd zzidi;
            private zze zzidj;
            private int zzidk;
            private zzdzg zzidl = zzbdb();
            private String zzidm = "";
            private int zzidn;
            private zzdzi<String> zzido = zzdyz.zzbdc();

            /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
            public enum zza implements zzdzb {
                AD_RESOURCE_UNKNOWN(0),
                AD_RESOURCE_CREATIVE(1),
                AD_RESOURCE_POST_CLICK(2),
                AD_RESOURCE_AUTO_CLICK_DESTINATION(3);
                
                private static final zzdze<zza> zzen = null;
                private final int value;

                public final int zzaf() {
                    return this.value;
                }

                public static zza zzhh(int i) {
                    if (i == 0) {
                        return AD_RESOURCE_UNKNOWN;
                    }
                    if (i == 1) {
                        return AD_RESOURCE_CREATIVE;
                    }
                    if (i == 2) {
                        return AD_RESOURCE_POST_CLICK;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return AD_RESOURCE_AUTO_CLICK_DESTINATION;
                }

                public static zzdzd zzag() {
                    return zzedm.zzew;
                }

                public final String toString() {
                    return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
                }

                private zza(int i) {
                    this.value = i;
                }

                static {
                    zzen = new zzedl();
                }
            }

            private zzh() {
            }

            /* renamed from: com.google.android.gms.internal.ads.zzede$zzb$zzh$zzb  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
            public static final class C0018zzb extends zzdyz.zza<zzh, C0018zzb> implements zzeaj {
                private C0018zzb() {
                    super(zzh.zzidp);
                }

                /* synthetic */ C0018zzb(zzedd zzedd) {
                    this();
                }
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                int i2 = 0;
                switch (zzedd.zzdk[i - 1]) {
                    case 1:
                        return new zzh();
                    case 2:
                        return new C0018zzb((zzedd) null);
                    case 3:
                        return zza((zzeah) zzidp, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001Ԅ\u0000\u0002\b\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005\u0004\u0004\u0006\u0016\u0007\b\u0005\b\f\u0006\t\u001a", new Object[]{"zzdl", "zzidh", "zziaw", "zzidi", "zzidj", "zzidk", "zzidl", "zzidm", "zzidn", zza.zzag(), "zzido"});
                    case 4:
                        return zzidp;
                    case 5:
                        zzeau<zzh> zzeau = zzdz;
                        if (zzeau == null) {
                            synchronized (zzh.class) {
                                zzeau = zzdz;
                                if (zzeau == null) {
                                    zzeau = new zzdyz.zzc<>(zzidp);
                                    zzdz = zzeau;
                                }
                            }
                        }
                        return zzeau;
                    case 6:
                        return Byte.valueOf(this.zziat);
                    case 7:
                        if (obj != null) {
                            i2 = 1;
                        }
                        this.zziat = (byte) i2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzh zzh = new zzh();
                zzidp = zzh;
                zzdyz.zza(zzh.class, zzh);
            }
        }

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zza extends zzdyz<zza, C0011zza> implements zzeaj {
            private static volatile zzeau<zza> zzdz;
            /* access modifiers changed from: private */
            public static final zza zzibx;
            private int zzdl;
            private String zzibw = "";

            private zza() {
            }

            /* renamed from: com.google.android.gms.internal.ads.zzede$zzb$zza$zza  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
            public static final class C0011zza extends zzdyz.zza<zza, C0011zza> implements zzeaj {
                private C0011zza() {
                    super(zza.zzibx);
                }

                public final C0011zza zzhp(String str) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zza) this.zzhsu).zzho(str);
                    return this;
                }

                /* synthetic */ C0011zza(zzedd zzedd) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zzho(String str) {
                str.getClass();
                this.zzdl |= 1;
                this.zzibw = str;
            }

            public static C0011zza zzbfv() {
                return (C0011zza) zzibx.zzbcz();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzedd.zzdk[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C0011zza((zzedd) null);
                    case 3:
                        return zza((zzeah) zzibx, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"zzdl", "zzibw"});
                    case 4:
                        return zzibx;
                    case 5:
                        zzeau<zza> zzeau = zzdz;
                        if (zzeau == null) {
                            synchronized (zza.class) {
                                zzeau = zzdz;
                                if (zzeau == null) {
                                    zzeau = new zzdyz.zzc<>(zzibx);
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
                zzibx = zza;
                zzdyz.zza(zza.class, zza);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.zzede$zzb$zzb  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class C0012zzb extends zzdyz.zza<zzb, C0012zzb> implements zzeaj {
            private C0012zzb() {
                super(zzb.zzibv);
            }

            /* synthetic */ C0012zzb(zzedd zzedd) {
                this();
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zzc extends zzdyz<zzc, zza> implements zzeaj {
            private static volatile zzeau<zzc> zzdz;
            /* access modifiers changed from: private */
            public static final zzc zzibz;
            private int zzdl;
            private zzdxn zzhiz = zzdxn.zzhoe;
            private byte zziat = 2;
            private zzdxn zziby = zzdxn.zzhoe;

            private zzc() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
            public static final class zza extends zzdyz.zza<zzc, zza> implements zzeaj {
                private zza() {
                    super(zzc.zzibz);
                }

                public final zza zzao(zzdxn zzdxn) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zzc) this.zzhsu).zzan(zzdxn);
                    return this;
                }

                public final zza zzap(zzdxn zzdxn) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zzc) this.zzhsu).zzae(zzdxn);
                    return this;
                }

                /* synthetic */ zza(zzedd zzedd) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zzan(zzdxn zzdxn) {
                zzdxn.getClass();
                this.zzdl |= 1;
                this.zziby = zzdxn;
            }

            /* access modifiers changed from: private */
            public final void zzae(zzdxn zzdxn) {
                zzdxn.getClass();
                this.zzdl |= 2;
                this.zzhiz = zzdxn;
            }

            public static zza zzbfx() {
                return (zza) zzibz.zzbcz();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                int i2 = 0;
                switch (zzedd.zzdk[i - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new zza((zzedd) null);
                    case 3:
                        return zza((zzeah) zzibz, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001Ԋ\u0000\u0002\n\u0001", new Object[]{"zzdl", "zziby", "zzhiz"});
                    case 4:
                        return zzibz;
                    case 5:
                        zzeau<zzc> zzeau = zzdz;
                        if (zzeau == null) {
                            synchronized (zzc.class) {
                                zzeau = zzdz;
                                if (zzeau == null) {
                                    zzeau = new zzdyz.zzc<>(zzibz);
                                    zzdz = zzeau;
                                }
                            }
                        }
                        return zzeau;
                    case 6:
                        return Byte.valueOf(this.zziat);
                    case 7:
                        if (obj != null) {
                            i2 = 1;
                        }
                        this.zziat = (byte) i2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzc zzc = new zzc();
                zzibz = zzc;
                zzdyz.zza(zzc.class, zzc);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zzi extends zzdyz<zzi, zza> implements zzeaj {
            private static volatile zzeau<zzi> zzdz;
            /* access modifiers changed from: private */
            public static final zzi zzidy;
            private int zzdl;
            private String zzidv = "";
            private long zzidw;
            private boolean zzidx;

            private zzi() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
            public static final class zza extends zzdyz.zza<zzi, zza> implements zzeaj {
                private zza() {
                    super(zzi.zzidy);
                }

                public final zza zzhq(String str) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zzi) this.zzhsu).zzhr(str);
                    return this;
                }

                public final zza zzfu(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zzi) this.zzhsu).zzfv(j);
                    return this;
                }

                public final zza zzbt(boolean z) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zzi) this.zzhsu).zzbu(z);
                    return this;
                }

                /* synthetic */ zza(zzedd zzedd) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zzhr(String str) {
                str.getClass();
                this.zzdl |= 1;
                this.zzidv = str;
            }

            /* access modifiers changed from: private */
            public final void zzfv(long j) {
                this.zzdl |= 2;
                this.zzidw = j;
            }

            /* access modifiers changed from: private */
            public final void zzbu(boolean z) {
                this.zzdl |= 4;
                this.zzidx = z;
            }

            public static zza zzbgf() {
                return (zza) zzidy.zzbcz();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzedd.zzdk[i - 1]) {
                    case 1:
                        return new zzi();
                    case 2:
                        return new zza((zzedd) null);
                    case 3:
                        return zza((zzeah) zzidy, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\u0007\u0002", new Object[]{"zzdl", "zzidv", "zzidw", "zzidx"});
                    case 4:
                        return zzidy;
                    case 5:
                        zzeau<zzi> zzeau = zzdz;
                        if (zzeau == null) {
                            synchronized (zzi.class) {
                                zzeau = zzdz;
                                if (zzeau == null) {
                                    zzeau = new zzdyz.zzc<>(zzidy);
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
                zzidy = zzi;
                zzdyz.zza(zzi.class, zzi);
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            int i2 = 0;
            switch (zzedd.zzdk[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new C0012zzb((zzedd) null);
                case 3:
                    return zza((zzeah) zzibv, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001\b\u0002\u0002\b\u0003\u0003\b\u0004\u0004Л\u0005\u0007\b\u0006\u001a\u0007\b\t\b\u0007\n\t\u0007\u000b\n\f\u0000\u000b\f\u0001\f\t\u0005\r\b\u0006\u000e\t\u0007\u000f\n\f\u0011\t\r\u0014\u001a\u0015\u001a", new Object[]{"zzdl", "zziaw", "zzibh", "zzibi", "zzibk", zzh.class, "zzibn", "zzibo", "zzibp", "zzibq", "zzibr", "zzbvh", zzg.zzag(), "zzibg", zza.zzc.zzag(), "zzibj", "zzibl", "zzibm", "zziap", "zzibs", "zzibt", "zzibu"});
                case 4:
                    return zzibv;
                case 5:
                    zzeau<zzb> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzb.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzibv);
                                zzdz = zzeau;
                            }
                        }
                    }
                    return zzeau;
                case 6:
                    return Byte.valueOf(this.zziat);
                case 7:
                    if (obj != null) {
                        i2 = 1;
                    }
                    this.zziat = (byte) i2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzb zzb = new zzb();
            zzibv = zzb;
            zzdyz.zza(zzb.class, zzb);
        }
    }
}
