package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzqo implements ValueCallback<String> {
    private final /* synthetic */ zzql zzbqm;

    zzqo(zzql zzql) {
        this.zzbqm = zzql;
    }

    public final /* synthetic */ void onReceiveValue(Object obj) {
        this.zzbqm.zzbqi.zza(this.zzbqm.zzbqf, this.zzbqm.zzbqg, (String) obj, this.zzbqm.zzbqh);
    }
}
