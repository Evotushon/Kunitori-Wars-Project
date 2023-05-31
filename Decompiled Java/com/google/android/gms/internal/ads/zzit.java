package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

@TargetApi(24)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzit {
    private final MediaCodec.CryptoInfo zzamh;
    private final MediaCodec.CryptoInfo.Pattern zzamq;

    private zzit(MediaCodec.CryptoInfo cryptoInfo) {
        this.zzamh = cryptoInfo;
        this.zzamq = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* access modifiers changed from: private */
    public final void set(int i, int i2) {
        this.zzamq.set(i, i2);
        this.zzamh.setPattern(this.zzamq);
    }
}
