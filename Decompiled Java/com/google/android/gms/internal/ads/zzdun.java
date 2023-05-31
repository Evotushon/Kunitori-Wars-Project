package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdun extends zzdyz<zzdun, zza> implements zzeaj {
    private static volatile zzeau<zzdun> zzdz;
    /* access modifiers changed from: private */
    public static final zzdun zzhke;
    private int zzhjw;
    private zzdzi<zzb> zzhkd = zzbdc();

    private zzdun() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zzb extends zzdyz<zzb, zza> implements zzeaj {
        private static volatile zzeau<zzb> zzdz;
        /* access modifiers changed from: private */
        public static final zzb zzhkf;
        private String zzhiy = "";
        private int zzhjp;
        private int zzhka;
        private int zzhkb;

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzb, zza> implements zzeaj {
            private zza() {
                super(zzb.zzhkf);
            }

            public final zza zzhf(String str) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzb) this.zzhsu).zzhd(str);
                return this;
            }

            public final zza zza(zzdug zzdug) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzb) this.zzhsu).zzb(zzdug);
                return this;
            }

            public final zza zzes(int i) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzb) this.zzhsu).zzet(i);
                return this;
            }

            public final zza zza(zzduy zzduy) {
                if (this.zzhsv) {
                    zzbct();
                    this.zzhsv = false;
                }
                ((zzb) this.zzhsu).zzb(zzduy);
                return this;
            }

            /* synthetic */ zza(zzduo zzduo) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzhd(String str) {
            str.getClass();
            this.zzhiy = str;
        }

        /* access modifiers changed from: private */
        public final void zzb(zzdug zzdug) {
            this.zzhka = zzdug.zzaf();
        }

        /* access modifiers changed from: private */
        public final void zzet(int i) {
            this.zzhkb = i;
        }

        /* access modifiers changed from: private */
        public final void zzb(zzduy zzduy) {
            this.zzhjp = zzduy.zzaf();
        }

        public static zza zzaze() {
            return (zza) zzhkf.zzbcz();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzduo.zzdk[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((zzduo) null);
                case 3:
                    return zza((zzeah) zzhkf, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzhiy", "zzhka", "zzhkb", "zzhjp"});
                case 4:
                    return zzhkf;
                case 5:
                    zzeau<zzb> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzb.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzhkf);
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
            zzhkf = zzb;
            zzdyz.zza(zzb.class, zzb);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdun, zza> implements zzeaj {
        private zza() {
            super(zzdun.zzhke);
        }

        public final zza zzer(int i) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdun) this.zzhsu).zzeq(i);
            return this;
        }

        public final zza zzb(zzb zzb) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            ((zzdun) this.zzhsu).zza(zzb);
            return this;
        }

        /* synthetic */ zza(zzduo zzduo) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public final void zzeq(int i) {
        this.zzhjw = i;
    }

    /* access modifiers changed from: private */
    public final void zza(zzb zzb2) {
        zzb2.getClass();
        if (!this.zzhkd.zzbam()) {
            this.zzhkd = zzdyz.zza(this.zzhkd);
        }
        this.zzhkd.add(zzb2);
    }

    public static zza zzazc() {
        return (zza) zzhke.zzbcz();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzduo.zzdk[i - 1]) {
            case 1:
                return new zzdun();
            case 2:
                return new zza((zzduo) null);
            case 3:
                return zza((zzeah) zzhke, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzhjw", "zzhkd", zzb.class});
            case 4:
                return zzhke;
            case 5:
                zzeau<zzdun> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdun.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhke);
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
        zzdun zzdun = new zzdun();
        zzhke = zzdun;
        zzdyz.zza(zzdun.class, zzdun);
    }
}
