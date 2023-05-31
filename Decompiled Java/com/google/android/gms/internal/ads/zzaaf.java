package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaaf {
    public static boolean zza(@Nullable zzaak zzaak, @Nullable zzaai zzaai, String... strArr) {
        if (zzaak == null || zzaai == null || !zzaak.zzcsx || zzaai == null) {
            return false;
        }
        return zzaak.zza(zzaai, zzq.zzlc().elapsedRealtime(), strArr);
    }

    @Nullable
    public static zzaai zzb(@Nullable zzaak zzaak) {
        if (zzaak == null) {
            return null;
        }
        return zzaak.zzex(zzq.zzlc().elapsedRealtime());
    }
}
