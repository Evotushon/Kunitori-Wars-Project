package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdub extends zzdyz<zzdub, zza> implements zzeaj {
    private static volatile zzeau<zzdub> zzdz;
    /* access modifiers changed from: private */
    public static final zzdub zzhix;
    private int zzhgn;
    private int zzhiw;

    private zzdub() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdub, zza> implements zzeaj {
        private zza() {
            super(zzdub.zzhix);
        }

        /* synthetic */ zza(zzdua zzdua) {
            this();
        }
    }

    public final zzdtv zzaye() {
        zzdtv zzem = zzdtv.zzem(this.zzhiw);
        return zzem == null ? zzdtv.UNRECOGNIZED : zzem;
    }

    public final int zzavw() {
        return this.zzhgn;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdua.zzdk[i - 1]) {
            case 1:
                return new zzdub();
            case 2:
                return new zza((zzdua) null);
            case 3:
                return zza((zzeah) zzhix, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzhiw", "zzhgn"});
            case 4:
                return zzhix;
            case 5:
                zzeau<zzdub> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdub.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhix);
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

    public static zzdub zzayf() {
        return zzhix;
    }

    static {
        zzdub zzdub = new zzdub();
        zzhix = zzdub;
        zzdyz.zza(zzdub.class, zzdub);
    }
}
