package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbxf implements zzeej<zzbxc> {
    private final zzeew<zzbqp> zzfml;
    private final zzeew<zzdei> zzfmm;

    private zzbxf(zzeew<zzbqp> zzeew, zzeew<zzdei> zzeew2) {
        this.zzfml = zzeew;
        this.zzfmm = zzeew2;
    }

    public static zzbxf zzp(zzeew<zzbqp> zzeew, zzeew<zzdei> zzeew2) {
        return new zzbxf(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzbxc(this.zzfml.get(), this.zzfmm.get());
    }
}
