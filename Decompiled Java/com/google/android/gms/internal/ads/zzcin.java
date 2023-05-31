package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcin implements zzeej<zzdof<String>> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzdif> zzfgx;

    private zzcin(zzeew<zzdif> zzeew, zzeew<Context> zzeew2) {
        this.zzfgx = zzeew;
        this.zzelc = zzeew2;
    }

    public static zzcin zzai(zzeew<zzdif> zzeew, zzeew<Context> zzeew2) {
        return new zzcin(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return (zzdof) zzeep.zza(this.zzfgx.get().zzu(zzdig.WEBVIEW_COOKIE).zzc(new zzcij(this.zzelc.get())).zza(1, TimeUnit.SECONDS).zza(Exception.class, zzcii.zzfxq).zzata(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
