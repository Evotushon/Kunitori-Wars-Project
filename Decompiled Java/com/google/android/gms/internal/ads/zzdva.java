package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;
import java.util.List;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdva extends zzdyz<zzdva, zza> implements zzeaj {
    private static volatile zzeau<zzdva> zzdz;
    /* access modifiers changed from: private */
    public static final zzdva zzhky;
    private String zzhkw = "";
    private zzdzi<zzduj> zzhkx = zzbdc();

    private zzdva() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdva, zza> implements zzeaj {
        private zza() {
            super(zzdva.zzhky);
        }

        /* synthetic */ zza(zzduz zzduz) {
            this();
        }
    }

    public final List<zzduj> zzazt() {
        return this.zzhkx;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzduz.zzdk[i - 1]) {
            case 1:
                return new zzdva();
            case 2:
                return new zza((zzduz) null);
            case 3:
                return zza((zzeah) zzhky, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzhkw", "zzhkx", zzduj.class});
            case 4:
                return zzhky;
            case 5:
                zzeau<zzdva> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdva.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhky);
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

    public static zzdva zzazu() {
        return zzhky;
    }

    static {
        zzdva zzdva = new zzdva();
        zzhky = zzdva;
        zzdyz.zza(zzdva.class, zzdva);
    }
}
