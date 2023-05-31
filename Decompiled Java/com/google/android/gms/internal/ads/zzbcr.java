package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbcr implements zzbdi {
    public final zzbda zza(zzbbm zzbbm, int i, String str, zzbbj zzbbj) {
        if (i <= 0) {
            return new zzbdh(zzbbm);
        }
        int zzzt = zzbcf.zzzt();
        if (zzzt < zzbbj.zzear) {
            return new zzbdl(zzbbm, zzbbj);
        }
        if (zzzt < zzbbj.zzeal) {
            return new zzbdm(zzbbm, zzbbj);
        }
        return new zzbdk(zzbbm);
    }
}
