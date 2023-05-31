package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcgj implements zzeej<zzcgg> {
    private final zzeew<zzcgx> zzelu;
    private final zzeew<zzcgq> zzerf;

    private zzcgj(zzeew<zzcgq> zzeew, zzeew<zzcgx> zzeew2) {
        this.zzerf = zzeew;
        this.zzelu = zzeew2;
    }

    public static zzcgj zzab(zzeew<zzcgq> zzeew, zzeew<zzcgx> zzeew2) {
        return new zzcgj(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzcgg(this.zzerf.get(), this.zzelu.get());
    }
}
