package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzig implements zzhp {
    private int zzafx = -1;
    private ByteBuffer zzajs = zzahl;
    private int zzakp = -1;
    private int[] zzakq;
    private boolean zzakr;
    private int[] zzaks;
    private ByteBuffer zzakt = zzahl;
    private boolean zzaku;

    public final int zzff() {
        return 2;
    }

    public final void zzb(int[] iArr) {
        this.zzakq = iArr;
    }

    public final boolean zzb(int i, int i2, int i3) throws zzho {
        boolean z = !Arrays.equals(this.zzakq, this.zzaks);
        this.zzaks = this.zzakq;
        if (this.zzaks == null) {
            this.zzakr = false;
            return z;
        } else if (i3 != 2) {
            throw new zzho(i, i2, i3);
        } else if (!z && this.zzakp == i && this.zzafx == i2) {
            return false;
        } else {
            this.zzakp = i;
            this.zzafx = i2;
            this.zzakr = i2 != this.zzaks.length;
            int i4 = 0;
            while (true) {
                int[] iArr = this.zzaks;
                if (i4 >= iArr.length) {
                    return true;
                }
                int i5 = iArr[i4];
                if (i5 < i2) {
                    this.zzakr = (i5 != i4) | this.zzakr;
                    i4++;
                } else {
                    throw new zzho(i, i2, i3);
                }
            }
        }
    }

    public final boolean isActive() {
        return this.zzakr;
    }

    public final int zzfe() {
        int[] iArr = this.zzaks;
        return iArr == null ? this.zzafx : iArr.length;
    }

    public final void zzi(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = (((limit - position) / (this.zzafx * 2)) * this.zzaks.length) << 1;
        if (this.zzakt.capacity() < length) {
            this.zzakt = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.zzakt.clear();
        }
        while (position < limit) {
            for (int i : this.zzaks) {
                this.zzakt.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.zzafx << 1;
        }
        byteBuffer.position(limit);
        this.zzakt.flip();
        this.zzajs = this.zzakt;
    }

    public final void zzfg() {
        this.zzaku = true;
    }

    public final ByteBuffer zzfh() {
        ByteBuffer byteBuffer = this.zzajs;
        this.zzajs = zzahl;
        return byteBuffer;
    }

    public final boolean zzez() {
        return this.zzaku && this.zzajs == zzahl;
    }

    public final void flush() {
        this.zzajs = zzahl;
        this.zzaku = false;
    }

    public final void reset() {
        flush();
        this.zzakt = zzahl;
        this.zzafx = -1;
        this.zzakp = -1;
        this.zzaks = null;
        this.zzakr = false;
    }
}
