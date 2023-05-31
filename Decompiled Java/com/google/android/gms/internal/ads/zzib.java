package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
class zzib {
    private int zzafy;
    protected AudioTrack zzail;
    private boolean zzakg;
    private long zzakh;
    private long zzaki;
    private long zzakj;
    private long zzakk;
    private long zzakl;
    private long zzakm;

    private zzib() {
    }

    public boolean zzft() {
        return false;
    }

    public void zza(AudioTrack audioTrack, boolean z) {
        this.zzail = audioTrack;
        this.zzakg = z;
        this.zzakk = -9223372036854775807L;
        this.zzakh = 0;
        this.zzaki = 0;
        this.zzakj = 0;
        if (audioTrack != null) {
            this.zzafy = audioTrack.getSampleRate();
        }
    }

    public final void zzdy(long j) {
        this.zzakl = zzfw();
        this.zzakk = SystemClock.elapsedRealtime() * 1000;
        this.zzakm = j;
        this.zzail.stop();
    }

    public final void pause() {
        if (this.zzakk == -9223372036854775807L) {
            this.zzail.pause();
        }
    }

    public final long zzfw() {
        if (this.zzakk != -9223372036854775807L) {
            return Math.min(this.zzakm, this.zzakl + ((((SystemClock.elapsedRealtime() * 1000) - this.zzakk) * ((long) this.zzafy)) / 1000000));
        }
        int playState = this.zzail.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) this.zzail.getPlaybackHeadPosition());
        if (this.zzakg) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.zzakj = this.zzakh;
            }
            playbackHeadPosition += this.zzakj;
        }
        if (this.zzakh > playbackHeadPosition) {
            this.zzaki++;
        }
        this.zzakh = playbackHeadPosition;
        return playbackHeadPosition + (this.zzaki << 32);
    }

    public final long zzfx() {
        return (zzfw() * 1000000) / ((long) this.zzafy);
    }

    public long zzfu() {
        throw new UnsupportedOperationException();
    }

    public long zzfv() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ zzib(zzhy zzhy) {
        this();
    }
}
