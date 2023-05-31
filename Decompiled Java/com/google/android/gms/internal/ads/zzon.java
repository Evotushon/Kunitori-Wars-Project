package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzon implements zzof {
    private boolean started;
    private zzhf zzadp = zzhf.zzagj;
    private long zzbha;
    private long zzbhb;

    public final void start() {
        if (!this.started) {
            this.zzbhb = SystemClock.elapsedRealtime();
            this.started = true;
        }
    }

    public final void stop() {
        if (this.started) {
            zzel(zzfx());
            this.started = false;
        }
    }

    public final void zzel(long j) {
        this.zzbha = j;
        if (this.started) {
            this.zzbhb = SystemClock.elapsedRealtime();
        }
    }

    public final void zza(zzof zzof) {
        zzel(zzof.zzfx());
        this.zzadp = zzof.zzfn();
    }

    public final long zzfx() {
        long j;
        long j2 = this.zzbha;
        if (!this.started) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzbhb;
        if (this.zzadp.zzagk == 1.0f) {
            j = zzgl.zzdp(elapsedRealtime);
        } else {
            j = this.zzadp.zzdu(elapsedRealtime);
        }
        return j2 + j;
    }

    public final zzhf zzb(zzhf zzhf) {
        if (this.started) {
            zzel(zzfx());
        }
        this.zzadp = zzhf;
        return zzhf;
    }

    public final zzhf zzfn() {
        return this.zzadp;
    }
}
