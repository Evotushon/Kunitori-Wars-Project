package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzlf implements zzlc {
    private zzlf() {
    }

    public final boolean zzhi() {
        return false;
    }

    public final int getCodecCount() {
        return MediaCodecList.getCodecCount();
    }

    public final MediaCodecInfo getCodecInfoAt(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public final boolean zza(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}
