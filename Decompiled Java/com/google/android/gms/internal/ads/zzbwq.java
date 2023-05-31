package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbwq implements zzeej<zzbwr> {
    private final zzeew<zzbrv> zzepf;
    private final zzeew<zzbur> zzfbh;

    private zzbwq(zzeew<zzbrv> zzeew, zzeew<zzbur> zzeew2) {
        this.zzepf = zzeew;
        this.zzfbh = zzeew2;
    }

    public static zzbwq zzo(zzeew<zzbrv> zzeew, zzeew<zzbur> zzeew2) {
        return new zzbwq(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzbwr(this.zzepf.get(), this.zzfbh.get());
    }
}
