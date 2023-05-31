package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzq;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbjm implements zzbjj {
    private final Context zzur;

    public zzbjm(Context context) {
        this.zzur = context;
    }

    public final void zzk(Map<String, String> map) {
        CookieManager zzbg;
        String str = map.get("cookie");
        if (!TextUtils.isEmpty(str) && (zzbg = zzq.zzkx().zzbg(this.zzur)) != null) {
            zzbg.setCookie("googleads.g.doubleclick.net", str);
        }
    }
}
