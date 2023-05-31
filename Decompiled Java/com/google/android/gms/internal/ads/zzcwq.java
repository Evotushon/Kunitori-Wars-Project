package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcwq implements zzeej<zzcwo> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzdoe> zzght;
    private final zzeew<Set<String>> zzgid;

    private zzcwq(zzeew<zzdoe> zzeew, zzeew<Context> zzeew2, zzeew<Set<String>> zzeew3) {
        this.zzght = zzeew;
        this.zzelc = zzeew2;
        this.zzgid = zzeew3;
    }

    public static zzcwq zzp(zzeew<zzdoe> zzeew, zzeew<Context> zzeew2, zzeew<Set<String>> zzeew3) {
        return new zzcwq(zzeew, zzeew2, zzeew3);
    }

    public final /* synthetic */ Object get() {
        return new zzcwo(this.zzght.get(), this.zzelc.get(), this.zzgid.get());
    }
}
