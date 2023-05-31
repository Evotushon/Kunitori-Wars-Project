package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbqb implements zzeej<zzbqc> {
    private final zzeew<zzdei> zzfhn;
    private final zzeew<String> zzfkd;

    private zzbqb(zzeew<zzdei> zzeew, zzeew<String> zzeew2) {
        this.zzfhn = zzeew;
        this.zzfkd = zzeew2;
    }

    public static zzbqb zzl(zzeew<zzdei> zzeew, zzeew<String> zzeew2) {
        return new zzbqb(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzbqc(this.zzfhn.get(), this.zzfkd.get());
    }
}
