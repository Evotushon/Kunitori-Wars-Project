package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzawd {
    public static void zzap(Context context) {
        if (zzazb.zzbr(context) && !zzazb.zzxq()) {
            zzdof<?> zzvw = new zzawg(context).zzvw();
            zzawf.zzez("Updating ad debug logging enablement.");
            zzazu.zza(zzvw, "AdDebugLogUpdater.updateEnablement");
        }
    }
}
