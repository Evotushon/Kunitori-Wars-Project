package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzeeh<T> implements zzeej<T> {
    private zzeew<T> zzigh;

    public final T get() {
        zzeew<T> zzeew = this.zzigh;
        if (zzeew != null) {
            return zzeew.get();
        }
        throw new IllegalStateException();
    }

    public static <T> void zzbd(zzeew<T> zzeew, zzeew<T> zzeew2) {
        zzeep.checkNotNull(zzeew2);
        zzeeh zzeeh = (zzeeh) zzeew;
        if (zzeeh.zzigh == null) {
            zzeeh.zzigh = zzeew2;
            return;
        }
        throw new IllegalStateException();
    }
}
