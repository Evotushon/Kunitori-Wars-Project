package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcwy implements zzeej<zzcww> {
    private final zzeew<zzdoe> zzfev;
    private final zzeew<Bundle> zzgjp;

    private zzcwy(zzeew<zzdoe> zzeew, zzeew<Bundle> zzeew2) {
        this.zzfev = zzeew;
        this.zzgjp = zzeew2;
    }

    public static zzcwy zzax(zzeew<zzdoe> zzeew, zzeew<Bundle> zzeew2) {
        return new zzcwy(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzcww(this.zzfev.get(), this.zzgjp.get());
    }
}
