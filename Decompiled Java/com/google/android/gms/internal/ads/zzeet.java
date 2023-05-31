package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzeet<T> implements zzeew<T> {
    private static final Object zzigi = new Object();
    private volatile Object zzdwc = zzigi;
    private volatile zzeew<T> zzigj;

    private zzeet(zzeew<T> zzeew) {
        this.zzigj = zzeew;
    }

    public final T get() {
        T t = this.zzdwc;
        if (t != zzigi) {
            return t;
        }
        zzeew<T> zzeew = this.zzigj;
        if (zzeew == null) {
            return this.zzdwc;
        }
        T t2 = zzeew.get();
        this.zzdwc = t2;
        this.zzigj = null;
        return t2;
    }

    public static <P extends zzeew<T>, T> zzeew<T> zzaq(P p) {
        return ((p instanceof zzeet) || (p instanceof zzeek)) ? p : new zzeet((zzeew) zzeep.checkNotNull(p));
    }
}
