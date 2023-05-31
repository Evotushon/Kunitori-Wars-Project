package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbdk extends zzbda {
    public zzbdk(zzbbm zzbbm) {
        super(zzbbm);
    }

    public final void abort() {
    }

    public final boolean zzfj(String str) {
        zzbbm zzbbm = (zzbbm) this.zzeem.get();
        if (zzbbm != null) {
            zzbbm.zza(zzfk(str), (zzbda) this);
        }
        zzawf.zzfa("VideoStreamNoopCache is doing nothing.");
        zza(str, zzfk(str), "noop", "Noop cache is a noop.");
        return false;
    }
}
