package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzqx {
    final long value;
    final int zzbqp;
    final String zzbqw;

    zzqx(long j, String str, int i) {
        this.value = j;
        this.zzbqw = str;
        this.zzbqp = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof zzqx)) {
            zzqx zzqx = (zzqx) obj;
            if (zzqx.value == this.value && zzqx.zzbqp == this.zzbqp) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.value;
    }
}
