package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzos implements ThreadFactory {
    private final /* synthetic */ String zzbhh;

    zzos(String str) {
        this.zzbhh = str;
    }

    public final Thread newThread(@NonNull Runnable runnable) {
        return new Thread(runnable, this.zzbhh);
    }
}
