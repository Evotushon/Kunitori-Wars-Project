package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcnd implements zzbxb {
    private final zzazy zzbsd;

    zzcnd(zzazy zzazy) {
        this.zzbsd = zzazy;
    }

    public final void zza(boolean z, Context context) {
        zzazy zzazy = this.zzbsd;
        try {
            zzq.zzku();
            zzl.zza(context, (AdOverlayInfoParcel) zzazy.get(), true);
        } catch (Exception unused) {
        }
    }
}
