package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbcq implements zzno {
    private Uri uri;
    private final zzno zzedy;
    private final long zzedz;
    private final zzno zzeea;
    private long zzeeb;

    zzbcq(zzno zzno, int i, zzno zzno2) {
        this.zzedy = zzno;
        this.zzedz = (long) i;
        this.zzeea = zzno2;
    }

    public final long zza(zznp zznp) throws IOException {
        zznp zznp2;
        zznp zznp3;
        long j;
        zznp zznp4 = zznp;
        this.uri = zznp4.uri;
        if (zznp4.zzana >= this.zzedz) {
            zznp2 = null;
        } else {
            long j2 = zznp4.zzana;
            if (zznp4.zzce != -1) {
                j = Math.min(zznp4.zzce, this.zzedz - j2);
            } else {
                j = this.zzedz - j2;
            }
            zznp2 = new zznp(zznp4.uri, j2, j, (String) null);
        }
        if (zznp4.zzce == -1 || zznp4.zzana + zznp4.zzce > this.zzedz) {
            zznp3 = new zznp(zznp4.uri, Math.max(this.zzedz, zznp4.zzana), zznp4.zzce != -1 ? Math.min(zznp4.zzce, (zznp4.zzana + zznp4.zzce) - this.zzedz) : -1, (String) null);
        } else {
            zznp3 = null;
        }
        long j3 = 0;
        long zza = zznp2 != null ? this.zzedy.zza(zznp2) : 0;
        if (zznp3 != null) {
            j3 = this.zzeea.zza(zznp3);
        }
        this.zzeeb = zznp4.zzana;
        if (zza == -1 || j3 == -1) {
            return -1;
        }
        return zza + j3;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzeeb;
        long j2 = this.zzedz;
        if (j < j2) {
            i3 = this.zzedy.read(bArr, i, (int) Math.min((long) i2, j2 - j));
            this.zzeeb += (long) i3;
        } else {
            i3 = 0;
        }
        if (this.zzeeb < this.zzedz) {
            return i3;
        }
        int read = this.zzeea.read(bArr, i + i3, i2 - i3);
        int i4 = i3 + read;
        this.zzeeb += (long) read;
        return i4;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final void close() throws IOException {
        this.zzedy.close();
        this.zzeea.close();
    }
}
