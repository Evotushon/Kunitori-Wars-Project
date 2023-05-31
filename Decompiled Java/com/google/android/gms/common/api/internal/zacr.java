package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zacr implements zacs {
    private final /* synthetic */ zaco zalj;

    zacr(zaco zaco) {
        this.zalj = zaco;
    }

    public final void zac(BasePendingResult<?> basePendingResult) {
        this.zalj.zale.remove(basePendingResult);
        basePendingResult.zal();
    }
}
