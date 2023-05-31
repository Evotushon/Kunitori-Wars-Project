package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzduj extends zzdyz<zzduj, zza> implements zzeaj {
    private static volatile zzeau<zzduj> zzdz;
    /* access modifiers changed from: private */
    public static final zzduj zzhjv;
    private String zzhiy = "";
    private String zzhjr = "";
    private int zzhjs;
    private boolean zzhjt;
    private String zzhju = "";

    private zzduj() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzduj, zza> implements zzeaj {
        private zza() {
            super(zzduj.zzhjv);
        }

        /* synthetic */ zza(zzduk zzduk) {
            this();
        }
    }

    public final String zzayp() {
        return this.zzhjr;
    }

    public final String zzayh() {
        return this.zzhiy;
    }

    public final int zzayq() {
        return this.zzhjs;
    }

    public final boolean zzayr() {
        return this.zzhjt;
    }

    public final String zzays() {
        return this.zzhju;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzduk.zzdk[i - 1]) {
            case 1:
                return new zzduj();
            case 2:
                return new zza((zzduk) null);
            case 3:
                return zza((zzeah) zzhjv, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzhjr", "zzhiy", "zzhjs", "zzhjt", "zzhju"});
            case 4:
                return zzhjv;
            case 5:
                zzeau<zzduj> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzduj.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhjv);
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
        zzduj zzduj = new zzduj();
        zzhjv = zzduj;
        zzdyz.zza(zzduj.class, zzduj);
    }
}
