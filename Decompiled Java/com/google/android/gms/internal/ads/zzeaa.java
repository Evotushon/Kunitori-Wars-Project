package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzeaa implements zzeai {
    private zzeai[] zzhux;

    zzeaa(zzeai... zzeaiArr) {
        this.zzhux = zzeaiArr;
    }

    public final boolean zzc(Class<?> cls) {
        for (zzeai zzc : this.zzhux) {
            if (zzc.zzc(cls)) {
                return true;
            }
        }
        return false;
    }

    public final zzeaf zzd(Class<?> cls) {
        for (zzeai zzeai : this.zzhux) {
            if (zzeai.zzc(cls)) {
                return zzeai.zzd(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
