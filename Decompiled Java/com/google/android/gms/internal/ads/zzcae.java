package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcae implements zzafz {
    private final zzcad zzfrg;

    zzcae(zzcad zzcad) {
        this.zzfrg = zzcad;
    }

    public final void zza(Object obj, Map map) {
        zzbdv zzbdv = (zzbdv) obj;
        zzbdv.zzaaf().zza((zzbfh) new zzcaj(this.zzfrg, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            zzbdv.loadData(str, "text/html", Constants.ENCODING);
        } else {
            zzbdv.loadDataWithBaseURL(str2, str, "text/html", Constants.ENCODING, (String) null);
        }
    }
}
