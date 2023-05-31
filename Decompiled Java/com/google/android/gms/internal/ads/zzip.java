package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzip implements zzhp {
    private int zzafx = -1;
    private float zzagk = 1.0f;
    private float zzagl = 1.0f;
    private ByteBuffer zzajs = zzahl;
    private int zzakp = -1;
    private ByteBuffer zzakt = zzahl;
    private boolean zzaku;
    private zzim zzamb;
    private ShortBuffer zzamc = this.zzakt.asShortBuffer();
    private long zzamd;
    private long zzame;

    public final int zzff() {
        return 2;
    }

    public final float zzb(float f) {
        this.zzagk = zzop.zza(f, 0.1f, 8.0f);
        return this.zzagk;
    }

    public final float zzc(float f) {
        this.zzagl = zzop.zza(f, 0.1f, 8.0f);
        return f;
    }

    public final long zzgf() {
        return this.zzamd;
    }

    public final long zzgg() {
        return this.zzame;
    }

    public final boolean zzb(int i, int i2, int i3) throws zzho {
        if (i3 != 2) {
            throw new zzho(i, i2, i3);
        } else if (this.zzakp == i && this.zzafx == i2) {
            return false;
        } else {
            this.zzakp = i;
            this.zzafx = i2;
            return true;
        }
    }

    public final boolean isActive() {
        return Math.abs(this.zzagk - 1.0f) >= 0.01f || Math.abs(this.zzagl - 1.0f) >= 0.01f;
    }

    public final int zzfe() {
        return this.zzafx;
    }

    public final void zzi(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzamd += (long) remaining;
            this.zzamb.zza(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int zzga = (this.zzamb.zzga() * this.zzafx) << 1;
        if (zzga > 0) {
            if (this.zzakt.capacity() < zzga) {
                this.zzakt = ByteBuffer.allocateDirect(zzga).order(ByteOrder.nativeOrder());
                this.zzamc = this.zzakt.asShortBuffer();
            } else {
                this.zzakt.clear();
                this.zzamc.clear();
            }
            this.zzamb.zzb(this.zzamc);
            this.zzame += (long) zzga;
            this.zzakt.limit(zzga);
            this.zzajs = this.zzakt;
        }
    }

    public final void zzfg() {
        this.zzamb.zzfg();
        this.zzaku = true;
    }

    public final ByteBuffer zzfh() {
        ByteBuffer byteBuffer = this.zzajs;
        this.zzajs = zzahl;
        return byteBuffer;
    }

    public final boolean zzez() {
        if (!this.zzaku) {
            return false;
        }
        zzim zzim = this.zzamb;
        return zzim == null || zzim.zzga() == 0;
    }

    public final void flush() {
        this.zzamb = new zzim(this.zzakp, this.zzafx);
        this.zzamb.setSpeed(this.zzagk);
        this.zzamb.zza(this.zzagl);
        this.zzajs = zzahl;
        this.zzamd = 0;
        this.zzame = 0;
        this.zzaku = false;
    }

    public final void reset() {
        this.zzamb = null;
        this.zzakt = zzahl;
        this.zzamc = this.zzakt.asShortBuffer();
        this.zzajs = zzahl;
        this.zzafx = -1;
        this.zzakp = -1;
        this.zzamd = 0;
        this.zzame = 0;
        this.zzaku = false;
    }
}
