package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzebe extends InputStream {
    private int mark;
    private final /* synthetic */ zzeba zzhwe;
    private zzebb zzhwo;
    private zzdxy zzhwp;
    private int zzhwq;
    private int zzhwr;
    private int zzhws;

    public zzebe(zzeba zzeba) {
        this.zzhwe = zzeba;
        initialize();
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException();
        } else if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else {
            int zzl = zzl(bArr, i, i2);
            if (zzl == 0) {
                return -1;
            }
            return zzl;
        }
    }

    public final long skip(long j) {
        if (j >= 0) {
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return (long) zzl((byte[]) null, 0, (int) j);
        }
        throw new IndexOutOfBoundsException();
    }

    private final int zzl(byte[] bArr, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        while (i4 > 0) {
            zzbeq();
            if (this.zzhwp == null) {
                break;
            }
            int min = Math.min(this.zzhwq - this.zzhwr, i4);
            if (bArr != null) {
                this.zzhwp.zza(bArr, this.zzhwr, i3, min);
                i3 += min;
            }
            this.zzhwr += min;
            i4 -= min;
        }
        return i2 - i4;
    }

    public final int read() throws IOException {
        zzbeq();
        zzdxy zzdxy = this.zzhwp;
        if (zzdxy == null) {
            return -1;
        }
        int i = this.zzhwr;
        this.zzhwr = i + 1;
        return zzdxy.zzfe(i) & 255;
    }

    public final int available() throws IOException {
        return this.zzhwe.size() - (this.zzhws + this.zzhwr);
    }

    public final void mark(int i) {
        this.mark = this.zzhws + this.zzhwr;
    }

    public final synchronized void reset() {
        initialize();
        zzl((byte[]) null, 0, this.mark);
    }

    private final void initialize() {
        this.zzhwo = new zzebb(this.zzhwe, (zzeaz) null);
        this.zzhwp = (zzdxy) this.zzhwo.next();
        this.zzhwq = this.zzhwp.size();
        this.zzhwr = 0;
        this.zzhws = 0;
    }

    private final void zzbeq() {
        int i;
        if (this.zzhwp != null && this.zzhwr == (i = this.zzhwq)) {
            this.zzhws += i;
            this.zzhwr = 0;
            if (this.zzhwo.hasNext()) {
                this.zzhwp = (zzdxy) this.zzhwo.next();
                this.zzhwq = this.zzhwp.size();
                return;
            }
            this.zzhwp = null;
            this.zzhwq = 0;
        }
    }
}
