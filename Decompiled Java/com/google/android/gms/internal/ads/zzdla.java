package com.google.android.gms.internal.ads;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzdla<T> implements Serializable {
    @NullableDecl
    public abstract T zzats();

    public static <T> zzdla<T> zzac(@NullableDecl T t) {
        if (t == null) {
            return zzdkt.zzgyp;
        }
        return new zzdlf(t);
    }

    zzdla() {
    }
}
