package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaga implements zzafz<zzbdv> {
    private static final Map<String, Integer> zzcys = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final zzc zzcyp;
    private final zzaom zzcyq;
    private final zzaoz zzcyr;

    public zzaga(zzc zzc, zzaom zzaom, zzaoz zzaoz) {
        this.zzcyp = zzc;
        this.zzcyq = zzaom;
        this.zzcyr = zzaoz;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzc zzc;
        zzbdv zzbdv = (zzbdv) obj;
        int intValue = zzcys.get((String) map.get("a")).intValue();
        if (intValue != 5 && intValue != 7 && (zzc = this.zzcyp) != null && !zzc.zzjv()) {
            this.zzcyp.zzbr((String) null);
        } else if (intValue == 1) {
            this.zzcyq.zzg(map);
        } else if (intValue == 3) {
            new zzaor(zzbdv, map).execute();
        } else if (intValue == 4) {
            new zzaol(zzbdv, map).execute();
        } else if (intValue == 5) {
            new zzaoo(zzbdv, map).execute();
        } else if (intValue == 6) {
            this.zzcyq.zzac(true);
        } else if (intValue != 7) {
            zzawf.zzez("Unknown MRAID command called.");
        } else {
            this.zzcyr.zzto();
        }
    }
}
