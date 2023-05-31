package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzazt implements zzdnu<Object> {
    private final /* synthetic */ String zzdxs;

    zzazt(String str) {
        this.zzdxs = str;
    }

    public final void onSuccess(@Nullable Object obj) {
    }

    public final void zzb(Throwable th) {
        zzq.zzkz().zza(th, this.zzdxs);
    }
}
