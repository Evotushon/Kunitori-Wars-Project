package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzazw implements zzdnu<Object> {
    private final /* synthetic */ String zzdxs;

    zzazw(String str) {
        this.zzdxs = str;
    }

    public final void onSuccess(@Nullable Object obj) {
    }

    public final void zzb(Throwable th) {
        zzq.zzkz().zzb(th, this.zzdxs);
    }
}
