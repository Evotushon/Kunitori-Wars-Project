package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzeem<T> implements zzeed<T>, zzeej<T> {
    private static final zzeem<Object> zzigl = new zzeem<>((Object) null);
    private final T zzdwc;

    public static <T> zzeej<T> zzbe(T t) {
        return new zzeem(zzeep.zza(t, "instance cannot be null"));
    }

    public static <T> zzeej<T> zzbf(T t) {
        if (t == null) {
            return zzigl;
        }
        return new zzeem(t);
    }

    private zzeem(T t) {
        this.zzdwc = t;
    }

    public final T get() {
        return this.zzdwc;
    }
}
