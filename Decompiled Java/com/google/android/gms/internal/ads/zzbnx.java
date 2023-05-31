package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbnx implements zzeej<String> {
    private final zzbnv zzfij;

    private zzbnx(zzbnv zzbnv) {
        this.zzfij = zzbnv;
    }

    public static zzbnx zze(zzbnv zzbnv) {
        return new zzbnx(zzbnv);
    }

    public static String zzf(zzbnv zzbnv) {
        return (String) zzeep.zza(zzbnv.zzaho(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzf(this.zzfij);
    }
}
