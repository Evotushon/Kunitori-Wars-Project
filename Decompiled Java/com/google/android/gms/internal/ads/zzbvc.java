package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbvc implements zzeej<zzbvd> {
    private final zzeew<zzdis> zzeuf;
    private final zzeew<zzdei> zzfeb;

    private zzbvc(zzeew<zzdei> zzeew, zzeew<zzdis> zzeew2) {
        this.zzfeb = zzeew;
        this.zzeuf = zzeew2;
    }

    public static zzbvc zzn(zzeew<zzdei> zzeew, zzeew<zzdis> zzeew2) {
        return new zzbvc(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzbvd(this.zzfeb.get(), this.zzeuf.get());
    }
}
