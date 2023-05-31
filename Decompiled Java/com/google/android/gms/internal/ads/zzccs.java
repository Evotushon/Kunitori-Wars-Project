package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzccs implements zzafz<Object> {
    private final zzeed<zzccp> zzfok;
    private final zzccv zzfqy;
    @Nullable
    private final zzadx zzfth;

    public zzccs(zzbzg zzbzg, zzbyz zzbyz, zzccv zzccv, zzeed<zzccp> zzeed) {
        this.zzfth = zzbzg.zzgb(zzbyz.getCustomTemplateId());
        this.zzfqy = zzccv;
        this.zzfok = zzeed;
    }

    public final void zzalw() {
        if (this.zzfth != null) {
            this.zzfqy.zza("/nativeAdCustomClick", (zzafz<Object>) this);
        }
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.zzfth.zza(this.zzfok.get(), str);
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            zzawf.zzd(sb.toString(), e);
        }
    }
}
