package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public final class zzbo {

    /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
    public static final class zza extends zzdyz<zza, C0004zza> implements zzeaj {
        private static volatile zzeau<zza> zzdz;
        /* access modifiers changed from: private */
        public static final zza zzef;
        private int zzdl;
        private zzb zzed;
        private zzc zzee;

        private zza() {
        }

        /* renamed from: com.google.android.gms.internal.ads.zzbo$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
        public static final class C0004zza extends zzdyz.zza<zza, C0004zza> implements zzeaj {
            private C0004zza() {
                super(zza.zzef);
            }

            /* synthetic */ C0004zza(zzbn zzbn) {
                this();
            }
        }

        public final boolean zzx() {
            return (this.zzdl & 1) != 0;
        }

        public final zzb zzy() {
            zzb zzb = this.zzed;
            return zzb == null ? zzb.zzad() : zzb;
        }

        public final boolean zzz() {
            return (this.zzdl & 2) != 0;
        }

        public final zzc zzaa() {
            zzc zzc = this.zzee;
            return zzc == null ? zzc.zzai() : zzc;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbn.zzdk[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0004zza((zzbn) null);
                case 3:
                    return zza((zzeah) zzef, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{"zzdl", "zzed", "zzee"});
                case 4:
                    return zzef;
                case 5:
                    zzeau<zza> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zza.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzef);
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
            zzef = zza;
            zzdyz.zza(zza.class, zza);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
    public static final class zzb extends zzdyz<zzb, zza> implements zzeaj {
        private static volatile zzeau<zzb> zzdz;
        /* access modifiers changed from: private */
        public static final zzb zzeh;
        private int zzdl;
        private int zzeg = 2;

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzb, zza> implements zzeaj {
            private zza() {
                super(zzb.zzeh);
            }

            /* synthetic */ zza(zzbn zzbn) {
                this();
            }
        }

        public final zzbq zzac() {
            zzbq zze = zzbq.zze(this.zzeg);
            return zze == null ? zzbq.ENUM_SIGNAL_SOURCE_ADSHIELD : zze;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbn.zzdk[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((zzbn) null);
                case 3:
                    return zza((zzeah) zzeh, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b\f\u0000", new Object[]{"zzdl", "zzeg", zzbq.zzag()});
                case 4:
                    return zzeh;
                case 5:
                    zzeau<zzb> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzb.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzeh);
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

        public static zzb zzad() {
            return zzeh;
        }

        static {
            zzb zzb = new zzb();
            zzeh = zzb;
            zzdyz.zza(zzb.class, zzb);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
    public static final class zzc extends zzdyz<zzc, zza> implements zzeaj {
        private static volatile zzeau<zzc> zzdz;
        /* access modifiers changed from: private */
        public static final zzc zzev;
        private int zzdl;
        private String zzep = "";
        private String zzeq = "";
        private String zzer = "";
        private String zzes = "";
        private String zzet = "";
        private String zzeu = "";

        private zzc() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
        public static final class zza extends zzdyz.zza<zzc, zza> implements zzeaj {
            private zza() {
                super(zzc.zzev);
            }

            /* synthetic */ zza(zzbn zzbn) {
                this();
            }
        }

        public final String zzah() {
            return this.zzep;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbn.zzdk[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza((zzbn) null);
                case 3:
                    return zza((zzeah) zzev, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005", new Object[]{"zzdl", "zzep", "zzeq", "zzer", "zzes", "zzet", "zzeu"});
                case 4:
                    return zzev;
                case 5:
                    zzeau<zzc> zzeau = zzdz;
                    if (zzeau == null) {
                        synchronized (zzc.class) {
                            zzeau = zzdz;
                            if (zzeau == null) {
                                zzeau = new zzdyz.zzc<>(zzev);
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

        public static zzc zzai() {
            return zzev;
        }

        static {
            zzc zzc = new zzc();
            zzev = zzc;
            zzdyz.zza(zzc.class, zzc);
        }
    }
}
