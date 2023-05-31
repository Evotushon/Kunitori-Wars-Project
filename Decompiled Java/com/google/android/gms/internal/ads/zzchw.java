package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzchw implements Runnable {
    private final zzcho zzfwv;
    private final zzazy zzfwx;

    zzchw(zzcho zzcho, zzazy zzazy) {
        this.zzfwv = zzcho;
        this.zzfwx = zzazy;
    }

    public final void run() {
        zzazy zzazy = this.zzfwx;
        String zzvq = zzq.zzkz().zzvk().zzwf().zzvq();
        if (!TextUtils.isEmpty(zzvq)) {
            zzazy.set(zzvq);
        } else {
            zzazy.setException(new Exception());
        }
    }
}
