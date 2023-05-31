package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public final class zzbs {

    /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
    public static final class zza extends zzdyz<zza, zzb> implements zzeaj {
        private static volatile zzeau<zza> zzdz;
        /* access modifiers changed from: private */
        public static final zza zzhu;
        private int zzdl;
        private String zzdv = "";
        private String zzep = "";
        private String zzer = "";
        private String zzes = "D";
        private String zzet = "D";
        private int zzex;
        private int zzey;
        private String zzez = "";
        private long zzfa;
        private long zzfb;
        private long zzfc;
        private long zzfd;
        private long zzfe;
        private long zzff;
        private long zzfg;
        private long zzfh;
        private long zzfi;
        private long zzfj;
        private String zzfk = "";
        private long zzfl;
        private long zzfm;
        private long zzfn;
        private long zzfo;
        private long zzfp;
        private long zzfq;
        private long zzfr;
        private long zzfs;
        private long zzft;
        private String zzfu = "D";
        private String zzfv = "";
        private long zzfw;
        private long zzfx;
        private long zzfy;
        private long zzfz;
        private long zzga = -1;
        private long zzgb = -1;
        private zzb zzgc;
        private long zzgd = -1;
        private long zzge = -1;
        private long zzgf = -1;
        private long zzgg = -1;
        private long zzgh = -1;
        private long zzgi = -1;
        private long zzgj = -1;
        private int zzgk = 1000;
        private int zzgl = 1000;
        private long zzgm = -1;
        private long zzgn = -1;
        private long zzgo = -1;
        private long zzgp = -1;
        private long zzgq = -1;
        private int zzgr = 1000;
        private zze zzgs;
        private zzdzi<zze> zzgt = zzbdc();
        private zzf zzgu;
        private long zzgv = -1;
        private long zzgw = -1;
        private long zzgx = -1;
        private long zzgy = -1;
        private long zzgz = -1;
        private long zzha = -1;
        private long zzhb = -1;
        private long zzhc = -1;
        private String zzhd = "D";
        private long zzhe = -1;
        private int zzhf;
        private int zzhg;
        private int zzhh;
        private zze zzhi;
        private long zzhj = -1;
        private int zzhk = 1000;
        private int zzhl = 1000;
        private String zzhm = "D";
        private long zzhn;
        private String zzho = "";
        private int zzhp = 2;
        private boolean zzhq;
        private String zzhr = "";
        private long zzhs;
        private zzd zzht;

        /* renamed from: com.google.android.gms.internal.ads.zzbs$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
        public enum C0005zza implements zzdzb {
            DEBUGGER_STATE_UNSPECIFIED(0),
            DEBUGGER_STATE_NOT_INSTALLED(1),
            DEBUGGER_STATE_INSTALLED(2),
            DEBUGGER_STATE_ACTIVE(3),
            DEBUGGER_STATE_ENVVAR(4),
            DEBUGGER_STATE_MACHPORT(5),
            DEBUGGER_STATE_ENVVAR_MACHPORT(6);
            
            private static final zzdze<C0005zza> zzen = null;
            private final int value;

            public final int zzaf() {
                return this.value;
            }

            public static C0005zza zzg(int i) {
                switch (i) {
                    case 0:
                        return DEBUGGER_STATE_UNSPECIFIED;
                    case 1:
                        return DEBUGGER_STATE_NOT_INSTALLED;
                    case 2:
                        return DEBUGGER_STATE_INSTALLED;
                    case 3:
                        return DEBUGGER_STATE_ACTIVE;
                    case 4:
                        return DEBUGGER_STATE_ENVVAR;
                    case 5:
                        return DEBUGGER_STATE_MACHPORT;
                    case 6:
                        return DEBUGGER_STATE_ENVVAR_MACHPORT;
                    default:
                        return null;
                }
            }

            public static zzdzd zzag() {
                return zzbu.zzew;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            private C0005zza(int i) {
                this.value = i;
            }

            static {
                zzen = new zzbv();
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
        public enum zzc implements zzdzb {
            DEVICE_IDENTIFIER_NO_ID(0),
            DEVICE_IDENTIFIER_APP_SPECIFIC_ID(1),
            DEVICE_IDENTIFIER_GLOBAL_ID(2),
            DEVICE_IDENTIFIER_ADVERTISER_ID(3),
            DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED(4),
            DEVICE_IDENTIFIER_ANDROID_AD_ID(5),
            DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID(6);
            
            private static final zzdze<zzc> zzen = null;
            private final int value;

            public final int zzaf() {
                return this.value;
            }

            public static zzc zzh(int i) {
                switch (i) {
                    case 0:
                        return DEVICE_IDENTIFIER_NO_ID;
                    case 1:
                        return DEVICE_IDENTIFIER_APP_SPECIFIC_ID;
                    case 2:
                        return DEVICE_IDENTIFIER_GLOBAL_ID;
                    case 3:
                        return DEVICE_IDENTIFIER_ADVERTISER_ID;
                    case 4:
                        return DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED;
                    case 5:
                        return DEVICE_IDENTIFIER_ANDROID_AD_ID;
                    case 6:
                        return DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID;
                    default:
                        return null;
                }
            }

            public static zzdzd zzag() {
                return zzbx.zzew;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            private zzc(int i) {
                this.value = i;
            }

            static {
                zzen = new zzbw();
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
        public enum zzd implements zzdzb {
            ERROR_ENCODE_SIZE_FAIL(1),
            ERROR_UNKNOWN(3),
            ERROR_NO_SIGNALS(5),
            ERROR_ENCRYPTION(7),
            ERROR_MEMORY(9),
            ERROR_SIMULATOR(11),
            ERROR_SERVICE(13),
            ERROR_THREAD(15),
            PSN_WEB64_FAIL(2),
            PSN_DECRYPT_SIZE_FAIL(4),
            PSN_MD5_CHECK_FAIL(8),
            PSN_MD5_SIZE_FAIL(16),
            PSN_MD5_FAIL(32),
            PSN_DECODE_FAIL(64),
            PSN_SALT_FAIL(128),
            PSN_BITSLICER_FAIL(256),
            PSN_REQUEST_TYPE_FAIL(512),
            PSN_INVALID_ERROR_CODE(1024),
            PSN_TIMESTAMP_EXPIRED(2048),
            PSN_ENCODE_SIZE_FAIL(4096),
            PSN_BLANK_VALUE(8192),
            PSN_INITIALIZATION_FAIL(16384),
            PSN_GASS_CLIENT_FAIL(32768),
            PSN_SIGNALS_TIMEOUT(65536),
            PSN_TINK_FAIL(131072);
            
            private static final zzdze<zzd> zzen = null;
            private final int value;

            public final int zzaf() {
                return this.value;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            private zzd(int i) {
                this.value = i;
            }

            static {
                zzen = new zzby();
            }
        }

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
        public static final class zze extends zzdyz<zze, C0006zza> implements zzeaj {
            private static volatile zzeau<zze> zzdz;
            /* access modifiers changed from: private */
            public static final zze zzke;
            private int zzdl;
            private long zzfl = -1;
            private long zzfm = -1;
            private long zzjl = -1;
            private long zzjm = -1;
            private long zzjn = -1;
            private long zzjo = -1;
            private int zzjp = 1000;
            private long zzjq = -1;
            private long zzjr = -1;
            private long zzjs = -1;
            private int zzjt = 1000;
            private long zzju = -1;
            private long zzjv = -1;
            private long zzjw = -1;
            private long zzjx = -1;
            private long zzjy;
            private long zzjz;
            private long zzka = -1;
            private long zzkb = -1;
            private long zzkc = -1;
            private long zzkd = -1;

            private zze() {
            }

            /* renamed from: com.google.android.gms.internal.ads.zzbs$zza$zze$zza  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
            public static final class C0006zza extends zzdyz.zza<zze, C0006zza> implements zzeaj {
                private C0006zza() {
                    super(zze.zzke);
                }

                public final C0006zza zzcl(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzj(j);
                    return this;
                }

                public final C0006zza zzcm(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzk(j);
                    return this;
                }

                public final C0006zza zzcn(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzbs(j);
                    return this;
                }

                public final C0006zza zzco(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzbt(j);
                    return this;
                }

                public final C0006zza zzaw() {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzar();
                    return this;
                }

                public final C0006zza zzcp(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzbu(j);
                    return this;
                }

                public final C0006zza zzcq(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzbv(j);
                    return this;
                }

                public final C0006zza zzm(zzcd zzcd) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzk(zzcd);
                    return this;
                }

                public final C0006zza zzcr(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzbw(j);
                    return this;
                }

                public final C0006zza zzcs(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzbx(j);
                    return this;
                }

                public final C0006zza zzct(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzby(j);
                    return this;
                }

                public final C0006zza zzn(zzcd zzcd) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzl(zzcd);
                    return this;
                }

                public final C0006zza zzcu(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzbz(j);
                    return this;
                }

                public final C0006zza zzcv(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzca(j);
                    return this;
                }

                public final C0006zza zzcw(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzcb(j);
                    return this;
                }

                public final C0006zza zzcx(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzcc(j);
                    return this;
                }

                public final C0006zza zzcy(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzcd(j);
                    return this;
                }

                public final C0006zza zzcz(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzce(j);
                    return this;
                }

                public final C0006zza zzda(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzcf(j);
                    return this;
                }

                public final C0006zza zzdb(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zze) this.zzhsu).zzcg(j);
                    return this;
                }

                /* synthetic */ C0006zza(zzbt zzbt) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zzj(long j) {
                this.zzdl |= 1;
                this.zzfl = j;
            }

            /* access modifiers changed from: private */
            public final void zzk(long j) {
                this.zzdl |= 2;
                this.zzfm = j;
            }

            /* access modifiers changed from: private */
            public final void zzbs(long j) {
                this.zzdl |= 4;
                this.zzjl = j;
            }

            /* access modifiers changed from: private */
            public final void zzbt(long j) {
                this.zzdl |= 8;
                this.zzjm = j;
            }

            /* access modifiers changed from: private */
            public final void zzar() {
                this.zzdl &= -9;
                this.zzjm = -1;
            }

            /* access modifiers changed from: private */
            public final void zzbu(long j) {
                this.zzdl |= 16;
                this.zzjn = j;
            }

            /* access modifiers changed from: private */
            public final void zzbv(long j) {
                this.zzdl |= 32;
                this.zzjo = j;
            }

            /* access modifiers changed from: private */
            public final void zzk(zzcd zzcd) {
                this.zzjp = zzcd.zzaf();
                this.zzdl |= 64;
            }

            /* access modifiers changed from: private */
            public final void zzbw(long j) {
                this.zzdl |= 128;
                this.zzjq = j;
            }

            /* access modifiers changed from: private */
            public final void zzbx(long j) {
                this.zzdl |= 256;
                this.zzjr = j;
            }

            /* access modifiers changed from: private */
            public final void zzby(long j) {
                this.zzdl |= 512;
                this.zzjs = j;
            }

            /* access modifiers changed from: private */
            public final void zzl(zzcd zzcd) {
                this.zzjt = zzcd.zzaf();
                this.zzdl |= 1024;
            }

            /* access modifiers changed from: private */
            public final void zzbz(long j) {
                this.zzdl |= 2048;
                this.zzju = j;
            }

            /* access modifiers changed from: private */
            public final void zzca(long j) {
                this.zzdl |= 4096;
                this.zzjv = j;
            }

            /* access modifiers changed from: private */
            public final void zzcb(long j) {
                this.zzdl |= 8192;
                this.zzjw = j;
            }

            /* access modifiers changed from: private */
            public final void zzcc(long j) {
                this.zzdl |= 16384;
                this.zzjx = j;
            }

            /* access modifiers changed from: private */
            public final void zzcd(long j) {
                this.zzdl |= 32768;
                this.zzjy = j;
            }

            /* access modifiers changed from: private */
            public final void zzce(long j) {
                this.zzdl |= 65536;
                this.zzjz = j;
            }

            /* access modifiers changed from: private */
            public final void zzcf(long j) {
                this.zzdl |= 131072;
                this.zzka = j;
            }

            /* access modifiers changed from: private */
            public final void zzcg(long j) {
                this.zzdl |= 262144;
                this.zzkb = j;
            }

            public static C0006zza zzas() {
                return (C0006zza) zzke.zzbcz();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzbt.zzdk[i - 1]) {
                    case 1:
                        return new zze();
                    case 2:
                        return new C0006zza((zzbt) null);
                    case 3:
                        return zza((zzeah) zzke, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\f\u0006\b\u0002\u0007\t\u0002\b\n\u0002\t\u000b\f\n\f\u0002\u000b\r\u0002\f\u000e\u0002\r\u000f\u0002\u000e\u0010\u0002\u000f\u0011\u0002\u0010\u0012\u0002\u0011\u0013\u0002\u0012\u0014\u0002\u0013\u0015\u0002\u0014", new Object[]{"zzdl", "zzfl", "zzfm", "zzjl", "zzjm", "zzjn", "zzjo", "zzjp", zzcd.zzag(), "zzjq", "zzjr", "zzjs", "zzjt", zzcd.zzag(), "zzju", "zzjv", "zzjw", "zzjx", "zzjy", "zzjz", "zzka", "zzkb", "zzkc", "zzkd"});
                    case 4:
                        return zzke;
                    case 5:
                        zzeau<zze> zzeau = zzdz;
                        if (zzeau == null) {
                            synchronized (zze.class) {
                                zzeau = zzdz;
                                if (zzeau == null) {
                                    zzeau = new zzdyz.zzc<>(zzke);
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
                zzke = zze;
                zzdyz.zza(zze.class, zze);
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
        public static final class zzf extends zzdyz<zzf, C0007zza> implements zzeaj {
            private static volatile zzeau<zzf> zzdz;
            /* access modifiers changed from: private */
            public static final zzf zzkj;
            private int zzdl;
            private long zzgp = -1;
            private long zzgq = -1;
            private long zzkf = -1;
            private long zzkg = -1;
            private long zzkh = -1;
            private long zzki = -1;

            private zzf() {
            }

            /* renamed from: com.google.android.gms.internal.ads.zzbs$zza$zzf$zza  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
            public static final class C0007zza extends zzdyz.zza<zzf, C0007zza> implements zzeaj {
                private C0007zza() {
                    super(zzf.zzkj);
                }

                public final C0007zza zzdc(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zzf) this.zzhsu).zzch(j);
                    return this;
                }

                public final C0007zza zzdd(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zzf) this.zzhsu).zzci(j);
                    return this;
                }

                public final C0007zza zzde(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zzf) this.zzhsu).zzcj(j);
                    return this;
                }

                public final C0007zza zzdf(long j) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zzf) this.zzhsu).zzck(j);
                    return this;
                }

                /* synthetic */ C0007zza(zzbt zzbt) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zzch(long j) {
                this.zzdl |= 4;
                this.zzkf = j;
            }

            /* access modifiers changed from: private */
            public final void zzci(long j) {
                this.zzdl |= 8;
                this.zzkg = j;
            }

            /* access modifiers changed from: private */
            public final void zzcj(long j) {
                this.zzdl |= 16;
                this.zzkh = j;
            }

            /* access modifiers changed from: private */
            public final void zzck(long j) {
                this.zzdl |= 32;
                this.zzki = j;
            }

            public static C0007zza zzau() {
                return (C0007zza) zzkj.zzbcz();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzbt.zzdk[i - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new C0007zza((zzbt) null);
                    case 3:
                        return zza((zzeah) zzkj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005", new Object[]{"zzdl", "zzgp", "zzgq", "zzkf", "zzkg", "zzkh", "zzki"});
                    case 4:
                        return zzkj;
                    case 5:
                        zzeau<zzf> zzeau = zzdz;
                        if (zzeau == null) {
                            synchronized (zzf.class) {
                                zzeau = zzdz;
                                if (zzeau == null) {
                                    zzeau = new zzdyz.zzc<>(zzkj);
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
                zzkj = zzf;
                zzdyz.zza(zzf.class, zzf);
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
        public static final class zzb extends zzdyz.zza<zza, zzb> implements zzeaj {
            private zzb() {
                super(zza.zzhu);
            }

            public final zzb zzaf(String str) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzw(str);
                return this;
            }

            public final zzb zzag(String str) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzx(str);
                return this;
            }

            public final zzb zzal(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zze(j);
                return this;
            }

            public final zzb zzam(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzf(j);
                return this;
            }

            public final zzb zzan(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzg(j);
                return this;
            }

            public final zzb zzao(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzh(j);
                return this;
            }

            public final zzb zzap(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzi(j);
                return this;
            }

            public final zzb zzaq(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzj(j);
                return this;
            }

            public final zzb zzar(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzk(j);
                return this;
            }

            public final zzb zzas(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzl(j);
                return this;
            }

            public final zzb zzat(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzm(j);
                return this;
            }

            public final zzb zzau(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzn(j);
                return this;
            }

            public final zzb zzav(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzo(j);
                return this;
            }

            public final zzb zzaw(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzp(j);
                return this;
            }

            public final zzb zzah(String str) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzy(str);
                return this;
            }

            public final zzb zzai(String str) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzz(str);
                return this;
            }

            public final zzb zzax(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzq(j);
                return this;
            }

            public final zzb zzay(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzr(j);
                return this;
            }

            public final zzb zzaz(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzs(j);
                return this;
            }

            public final zzb zzaj(String str) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzaa(str);
                return this;
            }

            public final zzb zzba(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzt(j);
                return this;
            }

            @Deprecated
            public final zzb zzbb(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzu(j);
                return this;
            }

            public final zzb zzbc(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzv(j);
                return this;
            }

            public final zzb zzbd(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzw(j);
                return this;
            }

            public final zzb zzbe(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzx(j);
                return this;
            }

            public final zzb zzbf(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzy(j);
                return this;
            }

            public final zzb zzbg(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzz(j);
                return this;
            }

            public final zzb zzbh(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzaa(j);
                return this;
            }

            public final zzb zzbi(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzab(j);
                return this;
            }

            public final zzb zzak(String str) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzab(str);
                return this;
            }

            public final zzb zzal(String str) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzac(str);
                return this;
            }

            public final zzb zzf(zzcd zzcd) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zza(zzcd);
                return this;
            }

            public final zzb zzg(zzcd zzcd) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzb(zzcd);
                return this;
            }

            public final zzb zzbj(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzac(j);
                return this;
            }

            public final zzb zzbk(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzad(j);
                return this;
            }

            public final zzb zzbl(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzae(j);
                return this;
            }

            public final zzb zzh(zzcd zzcd) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzc(zzcd);
                return this;
            }

            public final zzb zzc(zze zze) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zza(zze);
                return this;
            }

            public final zzb zzd(zze zze) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzb(zze);
                return this;
            }

            public final zzb zzaq() {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzal();
                return this;
            }

            public final zzb zzb(zzf zzf) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zza(zzf);
                return this;
            }

            public final zzb zzbm(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzaf(j);
                return this;
            }

            public final zzb zzbn(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzag(j);
                return this;
            }

            public final zzb zzbo(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzah(j);
                return this;
            }

            public final zzb zzbp(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzai(j);
                return this;
            }

            public final zzb zzbq(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzaj(j);
                return this;
            }

            public final zzb zzam(String str) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzad(str);
                return this;
            }

            public final zzb zzi(zzcd zzcd) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzd(zzcd);
                return this;
            }

            public final zzb zzj(zzcd zzcd) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zze(zzcd);
                return this;
            }

            public final zzb zzan(String str) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzae(str);
                return this;
            }

            public final zzb zzb(zzc zzc) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zza(zzc);
                return this;
            }

            public final zzb zzb(boolean z) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zza(z);
                return this;
            }

            public final zzb zzbr(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzak(j);
                return this;
            }

            /* synthetic */ zzb(zzbt zzbt) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzw(String str) {
            str.getClass();
            this.zzdl |= 1;
            this.zzez = str;
        }

        /* access modifiers changed from: private */
        public final void zzx(String str) {
            str.getClass();
            this.zzdl |= 2;
            this.zzdv = str;
        }

        /* access modifiers changed from: private */
        public final void zze(long j) {
            this.zzdl |= 4;
            this.zzfa = j;
        }

        /* access modifiers changed from: private */
        public final void zzf(long j) {
            this.zzdl |= 16;
            this.zzfc = j;
        }

        /* access modifiers changed from: private */
        public final void zzg(long j) {
            this.zzdl |= 32;
            this.zzfd = j;
        }

        /* access modifiers changed from: private */
        public final void zzh(long j) {
            this.zzdl |= 1024;
            this.zzfi = j;
        }

        /* access modifiers changed from: private */
        public final void zzi(long j) {
            this.zzdl |= 2048;
            this.zzfj = j;
        }

        /* access modifiers changed from: private */
        public final void zzj(long j) {
            this.zzdl |= 8192;
            this.zzfl = j;
        }

        /* access modifiers changed from: private */
        public final void zzk(long j) {
            this.zzdl |= 16384;
            this.zzfm = j;
        }

        /* access modifiers changed from: private */
        public final void zzl(long j) {
            this.zzdl |= 32768;
            this.zzfn = j;
        }

        /* access modifiers changed from: private */
        public final void zzm(long j) {
            this.zzdl |= 65536;
            this.zzfo = j;
        }

        /* access modifiers changed from: private */
        public final void zzn(long j) {
            this.zzdl |= 524288;
            this.zzfr = j;
        }

        /* access modifiers changed from: private */
        public final void zzo(long j) {
            this.zzdl |= 1048576;
            this.zzfs = j;
        }

        /* access modifiers changed from: private */
        public final void zzp(long j) {
            this.zzdl |= 2097152;
            this.zzft = j;
        }

        public final boolean zzak() {
            return (this.zzdl & 4194304) != 0;
        }

        public final String zzah() {
            return this.zzep;
        }

        /* access modifiers changed from: private */
        public final void zzy(String str) {
            str.getClass();
            this.zzdl |= 4194304;
            this.zzep = str;
        }

        /* access modifiers changed from: private */
        public final void zzz(String str) {
            str.getClass();
            this.zzdl |= 16777216;
            this.zzfv = str;
        }

        /* access modifiers changed from: private */
        public final void zzq(long j) {
            this.zzdl |= 33554432;
            this.zzfw = j;
        }

        /* access modifiers changed from: private */
        public final void zzr(long j) {
            this.zzdl |= 67108864;
            this.zzfx = j;
        }

        /* access modifiers changed from: private */
        public final void zzs(long j) {
            this.zzdl |= 134217728;
            this.zzfy = j;
        }

        /* access modifiers changed from: private */
        public final void zzaa(String str) {
            str.getClass();
            this.zzdl |= 268435456;
            this.zzer = str;
        }

        /* access modifiers changed from: private */
        public final void zzt(long j) {
            this.zzdl |= 536870912;
            this.zzfz = j;
        }

        /* access modifiers changed from: private */
        public final void zzu(long j) {
            this.zzdl |= 1073741824;
            this.zzga = j;
        }

        /* access modifiers changed from: private */
        public final void zzv(long j) {
            this.zzdl |= Integer.MIN_VALUE;
            this.zzgb = j;
        }

        /* access modifiers changed from: private */
        public final void zzw(long j) {
            this.zzex |= 2;
            this.zzgd = j;
        }

        /* access modifiers changed from: private */
        public final void zzx(long j) {
            this.zzex |= 4;
            this.zzge = j;
        }

        /* access modifiers changed from: private */
        public final void zzy(long j) {
            this.zzex |= 8;
            this.zzgf = j;
        }

        /* access modifiers changed from: private */
        public final void zzz(long j) {
            this.zzex |= 16;
            this.zzgg = j;
        }

        /* access modifiers changed from: private */
        public final void zzaa(long j) {
            this.zzex |= 32;
            this.zzgh = j;
        }

        /* access modifiers changed from: private */
        public final void zzab(long j) {
            this.zzex |= 64;
            this.zzgi = j;
        }

        /* access modifiers changed from: private */
        public final void zzab(String str) {
            str.getClass();
            this.zzex |= 128;
            this.zzes = str;
        }

        /* access modifiers changed from: private */
        public final void zzac(String str) {
            str.getClass();
            this.zzex |= 256;
            this.zzet = str;
        }

        /* access modifiers changed from: private */
        public final void zza(zzcd zzcd) {
            this.zzgk = zzcd.zzaf();
            this.zzex |= 1024;
        }

        /* access modifiers changed from: private */
        public final void zzb(zzcd zzcd) {
            this.zzgl = zzcd.zzaf();
            this.zzex |= 2048;
        }

        /* access modifiers changed from: private */
        public final void zzac(long j) {
            this.zzex |= 4096;
            this.zzgm = j;
        }

        /* access modifiers changed from: private */
        public final void zzad(long j) {
            this.zzex |= 8192;
            this.zzgn = j;
        }

        /* access modifiers changed from: private */
        public final void zzae(long j) {
            this.zzex |= 16384;
            this.zzgo = j;
        }

        /* access modifiers changed from: private */
        public final void zzc(zzcd zzcd) {
            this.zzgr = zzcd.zzaf();
            this.zzex |= 131072;
        }

        /* access modifiers changed from: private */
        public final void zza(zze zze2) {
            zze2.getClass();
            this.zzgs = zze2;
            this.zzex |= 262144;
        }

        /* access modifiers changed from: private */
        public final void zzb(zze zze2) {
            zze2.getClass();
            if (!this.zzgt.zzbam()) {
                this.zzgt = zzdyz.zza(this.zzgt);
            }
            this.zzgt.add(zze2);
        }

        /* access modifiers changed from: private */
        public final void zzal() {
            this.zzgt = zzbdc();
        }

        /* access modifiers changed from: private */
        public final void zza(zzf zzf2) {
            zzf2.getClass();
            this.zzgu = zzf2;
            this.zzex |= 524288;
        }

        /* access modifiers changed from: private */
        public final void zzaf(long j) {
            this.zzex |= 2097152;
            this.zzgw = j;
        }

        /* access modifiers changed from: private */
        public final void zzag(long j) {
            this.zzex |= 4194304;
            this.zzgx = j;
        }

        /* access modifiers changed from: private */
        public final void zzah(long j) {
            this.zzex |= 8388608;
            this.zzgy = j;
        }

        /* access modifiers changed from: private */
        public final void zzai(long j) {
            this.zzex |= 67108864;
            this.zzhb = j;
        }

        /* access modifiers changed from: private */
        public final void zzaj(long j) {
            this.zzex |= 134217728;
            this.zzhc = j;
        }

        /* access modifiers changed from: private */
        public final void zzad(String str) {
            str.getClass();
            this.zzex |= 268435456;
            this.zzhd = str;
        }

        /* access modifiers changed from: private */
        public final void zzd(zzcd zzcd) {
            this.zzhk = zzcd.zzaf();
            this.zzey |= 8;
        }

        /* access modifiers changed from: private */
        public final void zze(zzcd zzcd) {
            this.zzhl = zzcd.zzaf();
            this.zzey |= 16;
        }

        /* access modifiers changed from: private */
        public final void zzae(String str) {
            str.getClass();
            this.zzey |= 128;
            this.zzho = str;
        }

        /* access modifiers changed from: private */
        public final void zza(zzc zzc2) {
            this.zzhp = zzc2.zzaf();
            this.zzey |= 256;
        }

        /* access modifiers changed from: private */
        public final void zza(boolean z) {
            this.zzey |= 512;
            this.zzhq = z;
        }

        /* access modifiers changed from: private */
        public final void zzak(long j) {
            this.zzey |= 2048;
            this.zzhs = j;
        }

        public final boolean zzam() {
            return (this.zzey & 4096) != 0;
        }

        public final zzd zzan() {
            zzd zzd2 = this.zzht;
            return zzd2 == null ? zzd.zzbg() : zzd2;
        }

        public static zza zza(byte[] bArr, zzdym zzdym) throws zzdzh {
            return (zza) zzdyz.zza(zzhu, bArr, zzdym);
        }

        public static zzb zzao() {
            return (zzb) zzhu.zzbcz();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbt.zzdk[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zzb((zzbt) null);
                case 3:
                    return zza((zzeah) zzhu, "\u0001N\u0000\u0003\u0001ÉN\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\u0002\u0007\t\u0002\b\n\u0002\t\u000b\u0002\n\f\u0002\u000b\r\b\f\u000e\u0002\r\u000f\u0002\u000e\u0010\u0002\u000f\u0011\u0002\u0010\u0012\u0002\u0011\u0013\u0002\u0012\u0014\u0002\u0013\u0015\u0002F\u0016\u0002\u0014\u0017\u0002\u0015\u0018\bG\u0019\u0002K\u001a\fH\u001b\b\u0016\u001c\u0007I\u001d\b\u0018\u001e\bJ\u001f\u0002\u0019 \u0002\u001a!\u0002\u001b\"\b\u001c#\u0002\u001d$\u0002\u001e%\u0002\u001f&\t '\u0002!(\u0002\")\u0002#*\u0002$+\u001b,\u0002%-\u0002&.\b'/\b(0\f*1\f+2\t23\u0002,4\u0002-5\u0002.6\u0002/7\u000208\f19\t3:\u00024;\u00025<\u00026=\u00027>\u0002:?\u0002;@\u0002=A\f>B\f?C\b<D\f@E\tAF\u0002BG\u00028H\u00029I\fCJ\u0002)K\b\u0017L\fDM\bEÉ\tL", new Object[]{"zzdl", "zzex", "zzey", "zzez", "zzdv", "zzfa", "zzfb", "zzfc", "zzfd", "zzfe", "zzff", "zzfg", "zzfh", "zzfi", "zzfj", "zzfk", "zzfl", "zzfm", "zzfn", "zzfo", "zzfp", "zzfq", "zzfr", "zzhn", "zzfs", "zzft", "zzho", "zzhs", "zzhp", zzc.zzag(), "zzep", "zzhq", "zzfv", "zzhr", "zzfw", "zzfx", "zzfy", "zzer", "zzfz", "zzga", "zzgb", "zzgc", "zzgd", "zzge", "zzgf", "zzgg", "zzgt", zze.class, "zzgh", "zzgi", "zzes", "zzet", "zzgk", zzcd.zzag(), "zzgl", zzcd.zzag(), "zzgs", "zzgm", "zzgn", "zzgo", "zzgp", "zzgq", "zzgr", zzcd.zzag(), "zzgu", "zzgv", "zzgw", "zzgx", "zzgy", "zzhb", "zzhc", "zzhe", "zzhf", zzbz.zzag(), "zzhg", zzce.zzag(), "zzhd", "zzhh", C0005zza.zzag(), "zzhi", "zzhj", "zzgz", "zzha", "zzhk", zzcd.zzag(), "zzgj", "zzfu", "zzhl", zzcd.zzag(), "zzhm", "zzht"});
                case 4:
                    return zzhu;
                case 5:
                    zzeau<zza> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zza.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzhu);
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
            zzhu = zza;
            zzdyz.zza(zza.class, zza);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
    public static final class zzb extends zzdyz<zzb, zza> implements zzeaj {
        private static volatile zzeau<zzb> zzdz;
        /* access modifiers changed from: private */
        public static final zzb zzkp;
        private int zzdl;
        private long zzkk;
        private int zzkl;
        private boolean zzkm;
        private zzdzg zzkn = zzbdb();
        private long zzko;

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzb, zza> implements zzeaj {
            private zza() {
                super(zzb.zzkp);
            }

            /* synthetic */ zza(zzbt zzbt) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbt.zzdk[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((zzbt) null);
                case 3:
                    return zza((zzeah) zzkp, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u0004\u0001\u0003\u0007\u0002\u0004\u0016\u0005\u0003\u0003", new Object[]{"zzdl", "zzkk", "zzkl", "zzkm", "zzkn", "zzko"});
                case 4:
                    return zzkp;
                case 5:
                    zzeau<zzb> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzb.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzkp);
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
            zzkp = zzb;
            zzdyz.zza(zzb.class, zzb);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
    public static final class zzd extends zzdyz<zzd, zza> implements zzeaj {
        private static volatile zzeau<zzd> zzdz;
        /* access modifiers changed from: private */
        public static final zzd zzln;
        private int zzdl;
        private long zzkk;
        private String zzll = "";
        private zzdxn zzlm = zzdxn.zzhoe;

        private zzd() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzd, zza> implements zzeaj {
            private zza() {
                super(zzd.zzln);
            }

            /* synthetic */ zza(zzbt zzbt) {
                this();
            }
        }

        public final boolean zzbe() {
            return (this.zzdl & 1) != 0;
        }

        public final long zzbf() {
            return this.zzkk;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbt.zzdk[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza((zzbt) null);
                case 3:
                    return zza((zzeah) zzln, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0002\u0000\u0003\b\u0001\u0004\n\u0002", new Object[]{"zzdl", "zzkk", "zzll", "zzlm"});
                case 4:
                    return zzln;
                case 5:
                    zzeau<zzd> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzd.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzln);
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

        public static zzd zzbg() {
            return zzln;
        }

        static {
            zzd zzd = new zzd();
            zzln = zzd;
            zzdyz.zza(zzd.class, zzd);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
    public static final class zze extends zzdyz<zze, zza> implements zzeaj {
        private static volatile zzeau<zze> zzdz;
        /* access modifiers changed from: private */
        public static final zze zzlo;
        private int zzdl;
        private String zzeu = "";

        private zze() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
        public static final class zza extends zzdyz.zza<zze, zza> implements zzeaj {
            private zza() {
                super(zze.zzlo);
            }

            /* synthetic */ zza(zzbt zzbt) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbt.zzdk[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza((zzbt) null);
                case 3:
                    return zza((zzeah) zzlo, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"zzdl", "zzeu"});
                case 4:
                    return zzlo;
                case 5:
                    zzeau<zze> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zze.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzlo);
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
            zzlo = zze;
            zzdyz.zza(zze.class, zze);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
    public static final class zzc extends zzdyz<zzc, zza> implements zzeaj {
        private static volatile zzeau<zzc> zzdz;
        /* access modifiers changed from: private */
        public static final zzc zzku;
        private int zzdl;
        private zzdxn zzkq = zzdxn.zzhoe;
        private zzdxn zzkr = zzdxn.zzhoe;
        private zzdxn zzks = zzdxn.zzhoe;
        private zzdxn zzkt = zzdxn.zzhoe;

        private zzc() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzc, zza> implements zzeaj {
            private zza() {
                super(zzc.zzku);
            }

            public final zza zze(zzdxn zzdxn) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzc) this.zzhsu).zza(zzdxn);
                return this;
            }

            public final zza zzf(zzdxn zzdxn) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzc) this.zzhsu).zzb(zzdxn);
                return this;
            }

            public final zza zzg(zzdxn zzdxn) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzc) this.zzhsu).zzc(zzdxn);
                return this;
            }

            public final zza zzh(zzdxn zzdxn) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzc) this.zzhsu).zzd(zzdxn);
                return this;
            }

            /* synthetic */ zza(zzbt zzbt) {
                this();
            }
        }

        public final zzdxn zzay() {
            return this.zzkq;
        }

        /* access modifiers changed from: private */
        public final void zza(zzdxn zzdxn) {
            zzdxn.getClass();
            this.zzdl |= 1;
            this.zzkq = zzdxn;
        }

        public final zzdxn zzaz() {
            return this.zzkr;
        }

        /* access modifiers changed from: private */
        public final void zzb(zzdxn zzdxn) {
            zzdxn.getClass();
            this.zzdl |= 2;
            this.zzkr = zzdxn;
        }

        public final zzdxn zzba() {
            return this.zzks;
        }

        /* access modifiers changed from: private */
        public final void zzc(zzdxn zzdxn) {
            zzdxn.getClass();
            this.zzdl |= 4;
            this.zzks = zzdxn;
        }

        public final zzdxn zzbb() {
            return this.zzkt;
        }

        /* access modifiers changed from: private */
        public final void zzd(zzdxn zzdxn) {
            zzdxn.getClass();
            this.zzdl |= 8;
            this.zzkt = zzdxn;
        }

        public static zzc zzb(byte[] bArr, zzdym zzdym) throws zzdzh {
            return (zzc) zzdyz.zza(zzku, bArr, zzdym);
        }

        public static zza zzbc() {
            return (zza) zzku.zzbcz();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbt.zzdk[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza((zzbt) null);
                case 3:
                    return zza((zzeah) zzku, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0000\u0002\n\u0001\u0003\n\u0002\u0004\n\u0003", new Object[]{"zzdl", "zzkq", "zzkr", "zzks", "zzkt"});
                case 4:
                    return zzku;
                case 5:
                    zzeau<zzc> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzc.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzku);
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
            zzku = zzc;
            zzdyz.zza(zzc.class, zzc);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
    public static final class zzf extends zzdyz<zzf, zza> implements zzeaj {
        private static volatile zzeau<zzf> zzdz;
        /* access modifiers changed from: private */
        public static final zzf zzlq;
        private int zzdl;
        private int zzhf = 1;
        private int zzhg = 1;
        private zzdxn zzkr = zzdxn.zzhoe;
        private zzdzi<zzdxn> zzlp = zzbdc();

        private zzf() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzf, zza> implements zzeaj {
            private zza() {
                super(zzf.zzlq);
            }

            public final zza zzi(zzdxn zzdxn) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzf) this.zzhsu).zzk(zzdxn);
                return this;
            }

            public final zza zzj(zzdxn zzdxn) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzf) this.zzhsu).zzb(zzdxn);
                return this;
            }

            public final zza zza(zzbz zzbz) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzf) this.zzhsu).zzb(zzbz);
                return this;
            }

            /* synthetic */ zza(zzbt zzbt) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzk(zzdxn zzdxn) {
            zzdxn.getClass();
            if (!this.zzlp.zzbam()) {
                this.zzlp = zzdyz.zza(this.zzlp);
            }
            this.zzlp.add(zzdxn);
        }

        /* access modifiers changed from: private */
        public final void zzb(zzdxn zzdxn) {
            zzdxn.getClass();
            this.zzdl |= 1;
            this.zzkr = zzdxn;
        }

        /* access modifiers changed from: private */
        public final void zzb(zzbz zzbz) {
            this.zzhf = zzbz.zzaf();
            this.zzdl |= 4;
        }

        public static zza zzbj() {
            return (zza) zzlq.zzbcz();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbt.zzdk[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza((zzbt) null);
                case 3:
                    return zza((zzeah) zzlq, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002\n\u0000\u0003\f\u0001\u0004\f\u0002", new Object[]{"zzdl", "zzlp", "zzkr", "zzhg", zzce.zzag(), "zzhf", zzbz.zzag()});
                case 4:
                    return zzlq;
                case 5:
                    zzeau<zzf> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzf.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzlq);
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
            zzlq = zzf;
            zzdyz.zza(zzf.class, zzf);
        }
    }
}
