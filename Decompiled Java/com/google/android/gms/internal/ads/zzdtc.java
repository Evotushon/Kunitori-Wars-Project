package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdtc extends zzdyz<zzdtc, zza> implements zzeaj {
    private static volatile zzeau<zzdtc> zzdz;
    /* access modifiers changed from: private */
    public static final zzdtc zzhhh;

    private zzdtc() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdtc, zza> implements zzeaj {
        private zza() {
            super(zzdtc.zzhhh);
        }

        /* synthetic */ zza(zzdtd zzdtd) {
            this();
        }
    }

    public static zzdtc zzm(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzdtc) zzdyz.zza(zzhhh, zzdxn, zzdym);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdtd.zzdk[i - 1]) {
            case 1:
                return new zzdtc();
            case 2:
                return new zza((zzdtd) null);
            case 3:
                return zza((zzeah) zzhhh, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzhhh;
            case 5:
                zzeau<zzdtc> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdtc.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhhh);
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
        zzdtc zzdtc = new zzdtc();
        zzhhh = zzdtc;
        zzdyz.zza(zzdtc.class, zzdtc);
    }
}
