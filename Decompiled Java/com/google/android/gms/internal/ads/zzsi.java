package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzsi extends zzazy<InputStream> {
    private final /* synthetic */ zzsf zzbsc;

    zzsi(zzsf zzsf) {
        this.zzbsc = zzsf;
    }

    public final boolean cancel(boolean z) {
        this.zzbsc.disconnect();
        return super.cancel(z);
    }
}
