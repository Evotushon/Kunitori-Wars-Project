package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

@TargetApi(21)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzle implements zzlc {
    private final int zzazv;
    private MediaCodecInfo[] zzazw;

    public zzle(boolean z) {
        this.zzazv = z ? 1 : 0;
    }

    public final boolean zzhi() {
        return true;
    }

    public final int getCodecCount() {
        zzhj();
        return this.zzazw.length;
    }

    public final MediaCodecInfo getCodecInfoAt(int i) {
        zzhj();
        return this.zzazw[i];
    }

    public final boolean zza(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private final void zzhj() {
        if (this.zzazw == null) {
            this.zzazw = new MediaCodecList(this.zzazv).getCodecInfos();
        }
    }
}
