package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbdj {
    private final ArrayList<zznr> zzeev = new ArrayList<>();
    private long zzeew;

    zzbdj() {
    }

    /* access modifiers changed from: package-private */
    public final long zzzv() {
        Iterator<zznr> it = this.zzeev.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> responseHeaders = it.next().getResponseHeaders();
            if (responseHeaders != null) {
                for (Map.Entry next : responseHeaders.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase((String) next.getKey())) {
                            this.zzeew = Math.max(this.zzeew, Long.parseLong((String) ((List) next.getValue()).get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.zzeew;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zznr zznr) {
        this.zzeev.add(zznr);
    }
}
