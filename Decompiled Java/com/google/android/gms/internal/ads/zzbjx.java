package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbjx implements zzafz<Object> {
    final /* synthetic */ zzbjs zzfef;

    zzbjx(zzbjs zzbjs) {
        this.zzfef = zzbjs;
    }

    public final void zza(Object obj, Map<String, String> map) {
        if (this.zzfef.zzl(map)) {
            this.zzfef.executor.execute(new zzbjw(this));
        }
    }
}
