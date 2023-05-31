package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public final class zzbm {

    /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
    public static final class zza extends zzdyz<zza, C0002zza> implements zzeaj {
        /* access modifiers changed from: private */
        public static final zza zzdy;
        private static volatile zzeau<zza> zzdz;
        private int zzdl;
        private String zzdm = "";
        private long zzdn;
        private String zzdo = "";
        private String zzdp = "";
        private String zzdq = "";
        private long zzdr;
        private long zzds;
        private String zzdt = "";
        private long zzdu;
        private String zzdv = "";
        private String zzdw = "";
        private zzdzi<zzb> zzdx = zzbdc();

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
        public static final class zzb extends zzdyz<zzb, C0003zza> implements zzeaj {
            private static volatile zzeau<zzb> zzdz;
            /* access modifiers changed from: private */
            public static final zzb zzec;
            private int zzdl;
            private String zzea = "";
            private String zzeb = "";

            private zzb() {
            }

            /* renamed from: com.google.android.gms.internal.ads.zzbm$zza$zzb$zza  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
            public static final class C0003zza extends zzdyz.zza<zzb, C0003zza> implements zzeaj {
                private C0003zza() {
                    super(zzb.zzec);
                }

                public final C0003zza zzs(String str) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zzb) this.zzhsu).zzu(str);
                    return this;
                }

                public final C0003zza zzt(String str) {
                    if (this.zzhsv) {
                        zzbct();
                        this.zzhsv = false;
                    }
                    ((zzb) this.zzhsu).zzv(str);
                    return this;
                }

                /* synthetic */ C0003zza(zzbl zzbl) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zzu(String str) {
                str.getClass();
                this.zzdl |= 1;
                this.zzea = str;
            }

            /* access modifiers changed from: private */
            public final void zzv(String str) {
                str.getClass();
                this.zzdl |= 2;
                this.zzeb = str;
            }

            public static C0003zza zzv() {
                return (C0003zza) zzec.zzbcz();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzbl.zzdk[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new C0003zza((zzbl) null);
                    case 3:
                        return zza((zzeah) zzec, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"zzdl", "zzea", "zzeb"});
                    case 4:
                        return zzec;
                    case 5:
                        zzeau<zzb> zzeau = zzdz;
                        if (zzeau == null) {
                            synchronized (zzb.class) {
                                zzeau = zzdz;
                                if (zzeau == null) {
                                    zzeau = new zzdyz.zzc<>(zzec);
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
                zzec = zzb;
                zzdyz.zza(zzb.class, zzb);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.zzbm$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
        public static final class C0002zza extends zzdyz.zza<zza, C0002zza> implements zzeaj {
            private C0002zza() {
                super(zza.zzdy);
            }

            public final C0002zza zzi(String str) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzn(str);
                return this;
            }

            public final C0002zza zzc(long j) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzd(j);
                return this;
            }

            public final C0002zza zzj(String str) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzo(str);
                return this;
            }

            public final C0002zza zzk(String str) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzp(str);
                return this;
            }

            public final C0002zza zzl(String str) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzq(str);
                return this;
            }

            public final C0002zza zzm(String str) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zzr(str);
                return this;
            }

            public final C0002zza zza(zzb.C0003zza zza) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zza) this.zzhsu).zza((zzb) ((zzdyz) zza.zzbcx()));
                return this;
            }

            /* synthetic */ C0002zza(zzbl zzbl) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzn(String str) {
            str.getClass();
            this.zzdl |= 1;
            this.zzdm = str;
        }

        /* access modifiers changed from: private */
        public final void zzd(long j) {
            this.zzdl |= 2;
            this.zzdn = j;
        }

        /* access modifiers changed from: private */
        public final void zzo(String str) {
            str.getClass();
            this.zzdl |= 4;
            this.zzdo = str;
        }

        /* access modifiers changed from: private */
        public final void zzp(String str) {
            str.getClass();
            this.zzdl |= 8;
            this.zzdp = str;
        }

        /* access modifiers changed from: private */
        public final void zzq(String str) {
            str.getClass();
            this.zzdl |= 16;
            this.zzdq = str;
        }

        /* access modifiers changed from: private */
        public final void zzr(String str) {
            str.getClass();
            this.zzdl |= 1024;
            this.zzdw = str;
        }

        /* access modifiers changed from: private */
        public final void zza(zzb zzb2) {
            zzb2.getClass();
            if (!this.zzdx.zzbam()) {
                this.zzdx = zzdyz.zza(this.zzdx);
            }
            this.zzdx.add(zzb2);
        }

        public static C0002zza zzt() {
            return (C0002zza) zzdy.zzbcz();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbl.zzdk[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0002zza((zzbl) null);
                case 3:
                    return zza((zzeah) zzdy, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\b\u0007\t\u0002\b\n\b\t\u000b\b\n\f\u001b", new Object[]{"zzdl", "zzdm", "zzdn", "zzdo", "zzdp", "zzdq", "zzdr", "zzds", "zzdt", "zzdu", "zzdv", "zzdw", "zzdx", zzb.class});
                case 4:
                    return zzdy;
                case 5:
                    zzeau<zza> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zza.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzdy);
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
            zzdy = zza;
            zzdyz.zza(zza.class, zza);
        }
    }
}
