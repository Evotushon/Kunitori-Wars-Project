package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzq;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcij implements Callable {
    private final Context zzcgz;

    zzcij(Context context) {
        this.zzcgz = context;
    }

    public final Object call() {
        CookieManager zzbg = zzq.zzkx().zzbg(this.zzcgz);
        return zzbg != null ? zzbg.getCookie("googleads.g.doubleclick.net") : "";
    }
}
