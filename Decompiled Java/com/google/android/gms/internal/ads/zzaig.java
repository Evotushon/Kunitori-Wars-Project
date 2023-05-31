package com.google.android.gms.internal.ads;

import android.webkit.JavascriptInterface;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzaig {
    private final zzain zzczv;

    private zzaig(zzain zzain) {
        this.zzczv = zzain;
    }

    @JavascriptInterface
    public final void notify(@Nullable String str) {
        this.zzczv.zzdd(str);
    }
}
