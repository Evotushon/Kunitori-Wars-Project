package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import androidx.annotation.NonNull;

@TargetApi(23)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzpb implements MediaCodec.OnFrameRenderedListener {
    private final /* synthetic */ zzpa zzbiw;

    private zzpb(zzpa zzpa, MediaCodec mediaCodec) {
        this.zzbiw = zzpa;
        mediaCodec.setOnFrameRenderedListener(this, new zzdkp());
    }

    public final void onFrameRendered(@NonNull MediaCodec mediaCodec, long j, long j2) {
        if (this == this.zzbiw.zzbit) {
            this.zzbiw.zzjg();
        }
    }
}
