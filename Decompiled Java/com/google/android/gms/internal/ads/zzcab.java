package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcab implements zzafz {
    private final zzbzy zzfre;
    private final zzaem zzfrf;

    zzcab(zzbzy zzbzy, zzaem zzaem) {
        this.zzfre = zzbzy;
        this.zzfrf = zzaem;
    }

    public final void zza(Object obj, Map map) {
        zzbzy zzbzy = this.zzfre;
        zzaem zzaem = this.zzfrf;
        try {
            zzbzy.zzfrc = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            zzawf.zzey("Failed to call parse unconfirmedClickTimestamp.");
        }
        zzbzy.zzfrb = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (zzaem == null) {
            zzawf.zzeb("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            zzaem.onUnconfirmedClickReceived(str);
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }
}
