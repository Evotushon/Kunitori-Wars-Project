package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdui extends zzdyz<zzdui, zza> implements zzeaj {
    private static volatile zzeau<zzdui> zzdz;
    /* access modifiers changed from: private */
    public static final zzdui zzhjq;
    private String zzhiy = "";
    private zzdxn zzhiz = zzdxn.zzhoe;
    private int zzhjp;

    private zzdui() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdui, zza> implements zzeaj {
        private zza() {
            super(zzdui.zzhjq);
        }

        /* synthetic */ zza(zzduh zzduh) {
            this();
        }
    }

    public final String zzayh() {
        return this.zzhiy;
    }

    public final zzdxn zzayi() {
        return this.zzhiz;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzduh.zzdk[i - 1]) {
            case 1:
                return new zzdui();
            case 2:
                return new zza((zzduh) null);
            case 3:
                return zza((zzeah) zzhjq, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzhiy", "zzhiz", "zzhjp"});
            case 4:
                return zzhjq;
            case 5:
                zzeau<zzdui> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdui.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhjq);
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

    public static zzdui zzayn() {
        return zzhjq;
    }

    static {
        zzdui zzdui = new zzdui();
        zzhjq = zzdui;
        zzdyz.zza(zzdui.class, zzdui);
    }
}
