package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MuteThisAdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzwv extends zzwt {
    private final MuteThisAdListener zzcep;

    public zzwv(MuteThisAdListener muteThisAdListener) {
        this.zzcep = muteThisAdListener;
    }

    public final void onAdMuted() {
        this.zzcep.onAdMuted();
    }
}
