package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzia extends zzib {
    private final AudioTimestamp zzakc = new AudioTimestamp();
    private long zzakd;
    private long zzake;
    private long zzakf;

    public zzia() {
        super((zzhy) null);
    }

    public final void zza(AudioTrack audioTrack, boolean z) {
        super.zza(audioTrack, z);
        this.zzakd = 0;
        this.zzake = 0;
        this.zzakf = 0;
    }

    public final boolean zzft() {
        boolean timestamp = this.zzail.getTimestamp(this.zzakc);
        if (timestamp) {
            long j = this.zzakc.framePosition;
            if (this.zzake > j) {
                this.zzakd++;
            }
            this.zzake = j;
            this.zzakf = j + (this.zzakd << 32);
        }
        return timestamp;
    }

    public final long zzfu() {
        return this.zzakc.nanoTime;
    }

    public final long zzfv() {
        return this.zzakf;
    }
}
