package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdlf<T> extends zzdla<T> {
    private final T zzczy;

    zzdlf(T t) {
        this.zzczy = t;
    }

    public final T zzats() {
        return this.zzczy;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof zzdlf) {
            return this.zzczy.equals(((zzdlf) obj).zzczy);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzczy.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzczy);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
