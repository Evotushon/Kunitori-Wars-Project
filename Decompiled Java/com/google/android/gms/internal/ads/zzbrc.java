package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbrc extends zzbtk<zzbqh> {
    public zzbrc(Set<zzbuv<zzbqh>> set) {
        super(set);
    }

    public final void onAdClosed() {
        zza(zzbrb.zzfkj);
    }

    public final void onAdLeftApplication() {
        zza(zzbre.zzfkj);
    }

    public final void onAdOpened() {
        zza(zzbrd.zzfkj);
    }

    public final void onRewardedVideoStarted() {
        zza(zzbrg.zzfkj);
    }

    public final void zzb(zzarr zzarr, String str, String str2) {
        zza(new zzbrf(zzarr, str, str2));
    }

    public final void onRewardedVideoCompleted() {
        zza(zzbri.zzfkj);
    }
}
