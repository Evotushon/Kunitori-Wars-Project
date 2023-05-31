package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdve extends zzdyz<zzdve, zza> implements zzeaj {
    private static volatile zzeau<zzdve> zzdz;
    /* access modifiers changed from: private */
    public static final zzdve zzhla;

    private zzdve() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdve, zza> implements zzeaj {
        private zza() {
            super(zzdve.zzhla);
        }

        /* synthetic */ zza(zzdvd zzdvd) {
            this();
        }
    }

    public static zzdve zzx(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzdve) zzdyz.zza(zzhla, zzdxn, zzdym);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdvd.zzdk[i - 1]) {
            case 1:
                return new zzdve();
            case 2:
                return new zza((zzdvd) null);
            case 3:
                return zza((zzeah) zzhla, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzhla;
            case 5:
                zzeau<zzdve> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdve.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhla);
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
        zzdve zzdve = new zzdve();
        zzhla = zzdve;
        zzdyz.zza(zzdve.class, zzdve);
    }
}
