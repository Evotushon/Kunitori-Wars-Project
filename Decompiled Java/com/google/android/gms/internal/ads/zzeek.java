package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzeek<T> implements zzeed<T>, zzeew<T> {
    private static final Object zzigi = new Object();
    private volatile Object zzdwc = zzigi;
    private volatile zzeew<T> zzigj;

    private zzeek(zzeew<T> zzeew) {
        this.zzigj = zzeew;
    }

    public final T get() {
        T t = this.zzdwc;
        if (t == zzigi) {
            synchronized (this) {
                t = this.zzdwc;
                if (t == zzigi) {
                    t = this.zzigj.get();
                    T t2 = this.zzdwc;
                    if (t2 != zzigi && !(t2 instanceof zzeeq)) {
                        if (t2 != t) {
                            String valueOf = String.valueOf(t2);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.zzdwc = t;
                    this.zzigj = null;
                }
            }
        }
        return t;
    }

    public static <P extends zzeew<T>, T> zzeew<T> zzaq(P p) {
        zzeep.checkNotNull(p);
        if (p instanceof zzeek) {
            return p;
        }
        return new zzeek(p);
    }

    public static <P extends zzeew<T>, T> zzeed<T> zzar(P p) {
        if (p instanceof zzeed) {
            return (zzeed) p;
        }
        return new zzeek((zzeew) zzeep.checkNotNull(p));
    }
}
