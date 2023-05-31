package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbmz implements zzeej<zzbmw> {
    private final zzeew<zzdei> zzfeb;
    private final zzeew<zzbqp> zzfhp;
    private final zzeew<zzbrr> zzfhq;

    private zzbmz(zzeew<zzdei> zzeew, zzeew<zzbqp> zzeew2, zzeew<zzbrr> zzeew3) {
        this.zzfeb = zzeew;
        this.zzfhp = zzeew2;
        this.zzfhq = zzeew3;
    }

    public static zzbmz zzf(zzeew<zzdei> zzeew, zzeew<zzbqp> zzeew2, zzeew<zzbrr> zzeew3) {
        return new zzbmz(zzeew, zzeew2, zzeew3);
    }

    public final /* synthetic */ Object get() {
        return new zzbmw(this.zzfeb.get(), this.zzfhp.get(), this.zzfhq.get());
    }
}
