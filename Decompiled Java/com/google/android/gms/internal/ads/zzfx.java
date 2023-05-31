package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public final class zzfx extends zzdyz<zzfx, zza> implements zzeaj {
    /* access modifiers changed from: private */
    public static final zzfx zzaaq;
    private static volatile zzeau<zzfx> zzdz;
    private zzgb zzaan;
    private zzdxn zzaao = zzdxn.zzhoe;
    private zzdxn zzaap = zzdxn.zzhoe;
    private int zzdl;

    private zzfx() {
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzfx, zza> implements zzeaj {
        private zza() {
            super(zzfx.zzaaq);
        }

        /* synthetic */ zza(zzfz zzfz) {
            this();
        }
    }

    public final zzgb zzcy() {
        zzgb zzgb = this.zzaan;
        return zzgb == null ? zzgb.zzdi() : zzgb;
    }

    public final zzdxn zzcz() {
        return this.zzaao;
    }

    public final zzdxn zzda() {
        return this.zzaap;
    }

    public static zzfx zza(zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return (zzfx) zzdyz.zza(zzaaq, zzdxn, zzdym);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzfz.zzdk[i - 1]) {
            case 1:
                return new zzfx();
            case 2:
                return new zza((zzfz) null);
            case 3:
                return zza((zzeah) zzaaq, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\n\u0001\u0003\n\u0002", new Object[]{"zzdl", "zzaan", "zzaao", "zzaap"});
            case 4:
                return zzaaq;
            case 5:
                zzeau<zzfx> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzfx.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzaaq);
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
        zzfx zzfx = new zzfx();
        zzaaq = zzfx;
        zzdyz.zza(zzfx.class, zzfx);
    }
}
