package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzhy extends Thread {
    private final /* synthetic */ AudioTrack zzahy;
    private final /* synthetic */ zzhz zzahz;

    zzhy(zzhz zzhz, AudioTrack audioTrack) {
        this.zzahz = zzhz;
        this.zzahy = audioTrack;
    }

    public final void run() {
        try {
            this.zzahy.flush();
            this.zzahy.release();
        } finally {
            this.zzahz.zzaih.open();
        }
    }
}
