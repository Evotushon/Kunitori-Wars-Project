package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzayo extends zzawb {
    private final String url;
    private final zzazl zzdwb;

    public zzayo(Context context, String str, String str2) {
        this(str2, zzq.zzkv().zzr(context, str));
    }

    private zzayo(String str, String str2) {
        this.zzdwb = new zzazl(str2);
        this.url = str;
    }

    public final void zztz() {
        this.zzdwb.zzeo(this.url);
    }
}
