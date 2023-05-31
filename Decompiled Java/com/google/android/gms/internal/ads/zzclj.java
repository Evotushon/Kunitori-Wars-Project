package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzclj implements zzeej<zzcle> {
    private final zzeew<zzclc> zzetx;
    private final zzeew<zzdoe> zzgaa;

    private zzclj(zzeew<zzclc> zzeew, zzeew<zzdoe> zzeew2) {
        this.zzetx = zzeew;
        this.zzgaa = zzeew2;
    }

    public static zzclj zzao(zzeew<zzclc> zzeew, zzeew<zzdoe> zzeew2) {
        return new zzclj(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzcle(this.zzetx.get(), this.zzgaa.get());
    }
}
