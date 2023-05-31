package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzazp implements ThreadFactory {
    private final /* synthetic */ String zzdxj;
    private final AtomicInteger zzyi = new AtomicInteger(1);

    zzazp(String str) {
        this.zzdxj = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.zzdxj;
        int andIncrement = this.zzyi.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
