package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcgc implements zzdil {
    private zzsn zzfvb;
    private Map<zzdig, zzcge> zzfvj;

    zzcgc(zzsn zzsn, Map<zzdig, zzcge> map) {
        this.zzfvj = map;
        this.zzfvb = zzsn;
    }

    public final void zza(zzdig zzdig, String str) {
    }

    public final void zzb(zzdig zzdig, String str) {
        if (this.zzfvj.containsKey(zzdig)) {
            this.zzfvb.zza(this.zzfvj.get(zzdig).zzfvm);
        }
    }

    public final void zza(zzdig zzdig, String str, Throwable th) {
        if (this.zzfvj.containsKey(zzdig)) {
            this.zzfvb.zza(this.zzfvj.get(zzdig).zzfvo);
        }
    }

    public final void zzc(zzdig zzdig, String str) {
        if (this.zzfvj.containsKey(zzdig)) {
            this.zzfvb.zza(this.zzfvj.get(zzdig).zzfvn);
        }
    }
}
