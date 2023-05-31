package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdsy extends zzdyz<zzdsy, zza> implements zzeaj {
    private static volatile zzeau<zzdsy> zzdz;
    /* access modifiers changed from: private */
    public static final zzdsy zzhhf;
    private int zzhgg;
    private int zzhgl;

    private zzdsy() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdsy, zza> implements zzeaj {
        private zza() {
            super(zzdsy.zzhhf);
        }

        /* synthetic */ zza(zzdsz zzdsz) {
            this();
        }
    }

    public final int getKeySize() {
        return this.zzhgl;
    }

    public static zzdsy zzk(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzdsy) zzdyz.zza(zzhhf, zzdxn, zzdym);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdsz.zzdk[i - 1]) {
            case 1:
                return new zzdsy();
            case 2:
                return new zza((zzdsz) null);
            case 3:
                return zza((zzeah) zzhhf, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzhgl", "zzhgg"});
            case 4:
                return zzhhf;
            case 5:
                zzeau<zzdsy> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdsy.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhhf);
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
        zzdsy zzdsy = new zzdsy();
        zzhhf = zzdsy;
        zzdyz.zza(zzdsy.class, zzdsy);
    }
}
