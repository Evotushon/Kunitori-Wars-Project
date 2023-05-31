package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcik implements zzeej<zzdof<String>> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzdq> zzfed;
    private final zzeew<zzdoe> zzfxr;

    private zzcik(zzeew<zzdq> zzeew, zzeew<Context> zzeew2, zzeew<zzdoe> zzeew3) {
        this.zzfed = zzeew;
        this.zzelc = zzeew2;
        this.zzfxr = zzeew3;
    }

    public static zzcik zzn(zzeew<zzdq> zzeew, zzeew<Context> zzeew2, zzeew<zzdoe> zzeew3) {
        return new zzcik(zzeew, zzeew2, zzeew3);
    }

    public final /* synthetic */ Object get() {
        return (zzdof) zzeep.zza(this.zzfxr.get().zzd(new zzcil(this.zzfed.get(), this.zzelc.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
