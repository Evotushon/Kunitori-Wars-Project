package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zznl implements zzno {
    private final byte[] data;
    private Uri uri;
    private int zzber;
    private int zzbes;

    public zznl(byte[] bArr) {
        zzob.checkNotNull(bArr);
        zzob.checkArgument(bArr.length > 0);
        this.data = bArr;
    }

    public final long zza(zznp zznp) throws IOException {
        this.uri = zznp.uri;
        this.zzber = (int) zznp.zzana;
        this.zzbes = (int) (zznp.zzce == -1 ? ((long) this.data.length) - zznp.zzana : zznp.zzce);
        int i = this.zzbes;
        if (i > 0 && this.zzber + i <= this.data.length) {
            return (long) i;
        }
        int i2 = this.zzber;
        long j = zznp.zzce;
        int length = this.data.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i2);
        sb.append(", ");
        sb.append(j);
        sb.append("], length: ");
        sb.append(length);
        throw new IOException(sb.toString());
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzbes;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.data, this.zzber, bArr, i, min);
        this.zzber += min;
        this.zzbes -= min;
        return min;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final void close() throws IOException {
        this.uri = null;
    }
}
