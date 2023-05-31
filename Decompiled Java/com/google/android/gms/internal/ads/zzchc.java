package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzchc {
    public static Set<zzbuv<zzbqt>> zza(zzchm zzchm, Executor executor) {
        return zzc(zzchm, executor);
    }

    public static Set<zzbuv<AppEventListener>> zzb(zzchm zzchm, Executor executor) {
        return zzc(zzchm, executor);
    }

    public static Set<zzbuv<zzbrn>> zzc(zzchm zzchm, Executor executor) {
        return zzc(zzchm, executor);
    }

    public static Set<zzbuv<zzbqm>> zzd(zzchm zzchm, Executor executor) {
        return zzc(zzchm, executor);
    }

    public static Set<zzbuv<zzbqh>> zze(zzchm zzchm, Executor executor) {
        return zzc(zzchm, executor);
    }

    public static Set<zzbuv<zzbqu>> zzf(zzchm zzchm, Executor executor) {
        return zzc(zzchm, executor);
    }

    public static Set<zzbuv<zztz>> zzg(zzchm zzchm, Executor executor) {
        return zzc(zzchm, executor);
    }

    public static Set<zzbuv<zzdil>> zzh(zzchm zzchm, Executor executor) {
        return zzc(zzchm, executor);
    }

    public static Set<zzbuv<zzbsn>> zzi(zzchm zzchm, Executor executor) {
        return zzc(zzchm, executor);
    }

    private static <T> Set<zzbuv<T>> zzc(T t, Executor executor) {
        if (zzabi.zzcuw.get().booleanValue()) {
            return Collections.singleton(new zzbuv(t, executor));
        }
        return Collections.emptySet();
    }
}
