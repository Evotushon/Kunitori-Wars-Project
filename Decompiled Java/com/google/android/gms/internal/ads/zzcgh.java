package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcgh implements zzeej<zzcgc> {
    private final zzeew<zzsn> zzfve;
    private final zzeew<Map<zzdig, zzcge>> zzfvr;

    private zzcgh(zzeew<zzsn> zzeew, zzeew<Map<zzdig, zzcge>> zzeew2) {
        this.zzfve = zzeew;
        this.zzfvr = zzeew2;
    }

    public static zzcgh zzaa(zzeew<zzsn> zzeew, zzeew<Map<zzdig, zzcge>> zzeew2) {
        return new zzcgh(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzcgc(this.zzfve.get(), this.zzfvr.get());
    }
}
