package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaym {
    private Map<Integer, Bitmap> zzdvx = new ConcurrentHashMap();
    private AtomicInteger zzdvy = new AtomicInteger(0);

    public final Bitmap zza(Integer num) {
        return this.zzdvx.get(num);
    }
}
