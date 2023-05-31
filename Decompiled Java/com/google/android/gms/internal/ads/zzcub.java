package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcub implements zzeej<zzctz> {
    private final zzeew<Set<String>> zzgid;

    private zzcub(zzeew<Set<String>> zzeew) {
        this.zzgid = zzeew;
    }

    public static zzcub zzaj(zzeew<Set<String>> zzeew) {
        return new zzcub(zzeew);
    }

    public static zzctz zzd(Set<String> set) {
        return new zzctz(set);
    }

    public final /* synthetic */ Object get() {
        return zzd(this.zzgid.get());
    }
}
