package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdtl extends zzdyz<zzdtl, zza> implements zzeaj {
    private static volatile zzeau<zzdtl> zzdz;
    /* access modifiers changed from: private */
    public static final zzdtl zzhhv;
    private zzdtq zzhhs;
    private zzdth zzhht;
    private int zzhhu;

    private zzdtl() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza extends zzdyz.zza<zzdtl, zza> implements zzeaj {
        private zza() {
            super(zzdtl.zzhhv);
        }

        /* synthetic */ zza(zzdtk zzdtk) {
            this();
        }
    }

    public final zzdtq zzaxg() {
        zzdtq zzdtq = this.zzhhs;
        return zzdtq == null ? zzdtq.zzaxw() : zzdtq;
    }

    public final zzdth zzaxh() {
        zzdth zzdth = this.zzhht;
        return zzdth == null ? zzdth.zzaxc() : zzdth;
    }

    public final zzdtf zzaxi() {
        zzdtf zzei = zzdtf.zzei(this.zzhhu);
        return zzei == null ? zzdtf.UNRECOGNIZED : zzei;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdtk.zzdk[i - 1]) {
            case 1:
                return new zzdtl();
            case 2:
                return new zza((zzdtk) null);
            case 3:
                return zza((zzeah) zzhhv, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzhhs", "zzhht", "zzhhu"});
            case 4:
                return zzhhv;
            case 5:
                zzeau<zzdtl> zzeau = zzdz;
                if (zzeau == null) {
                    synchronized (zzdtl.class) {
                        zzeau = zzdz;
                        if (zzeau == null) {
                            zzeau = new zzdyz.zzc<>(zzhhv);
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

    public static zzdtl zzaxj() {
        return zzhhv;
    }

    static {
        zzdtl zzdtl = new zzdtl();
        zzhhv = zzdtl;
        zzdyz.zza(zzdtl.class, zzdtl);
    }
}
