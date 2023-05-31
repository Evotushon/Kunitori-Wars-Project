package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcak implements zzbqu {
    private final zzbyz zzfne;
    private final zzbzd zzfof;

    public zzcak(zzbyz zzbyz, zzbzd zzbzd) {
        this.zzfne = zzbyz;
        this.zzfof = zzbzd;
    }

    public final void onAdImpression() {
        if (this.zzfne.zzakl() != null) {
            zzbdv zzakk = this.zzfne.zzakk();
            zzbdv zzakj = this.zzfne.zzakj();
            if (zzakk == null) {
                zzakk = zzakj != null ? zzakj : null;
            }
            if (this.zzfof.zzaka() && zzakk != null) {
                zzakk.zza("onSdkImpression", (Map<String, ?>) new ArrayMap());
            }
        }
    }
}
