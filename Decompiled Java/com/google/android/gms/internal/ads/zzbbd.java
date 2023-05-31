package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbbd {
    private final long zzdzy = TimeUnit.MILLISECONDS.toNanos(((Long) zzvh.zzpd().zzd(zzzx.zzchw)).longValue());
    private long zzdzz;
    private boolean zzeaa = true;

    zzbbd() {
    }

    public final void zzxz() {
        this.zzeaa = true;
    }

    public final void zza(SurfaceTexture surfaceTexture, zzbau zzbau) {
        if (zzbau != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.zzeaa || Math.abs(timestamp - this.zzdzz) >= this.zzdzy) {
                this.zzeaa = false;
                this.zzdzz = timestamp;
                zzawo.zzdtx.post(new zzbbg(this, zzbau));
            }
        }
    }
}
