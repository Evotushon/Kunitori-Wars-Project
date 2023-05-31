package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbmn implements zzeej<Boolean> {
    private final zzeew<zzdeu> zzfgu;

    public zzbmn(zzeew<zzdeu> zzeew) {
        this.zzfgu = zzeew;
    }

    public final /* synthetic */ Object get() {
        boolean z;
        if (this.zzfgu.get().zzaqx() != null) {
            z = ((Boolean) zzvh.zzpd().zzd(zzzx.zzcki)).booleanValue();
        } else {
            z = ((Boolean) zzvh.zzpd().zzd(zzzx.zzcpv)).booleanValue();
        }
        return Boolean.valueOf(z);
    }
}
