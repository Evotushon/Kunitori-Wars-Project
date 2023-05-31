package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zznp {
    public final int flags;
    public final Uri uri;
    public final long zzana;
    public final byte[] zzbet;
    public final long zzbeu;
    public final String zzcc;
    public final long zzce;

    public zznp(Uri uri2) {
        this(uri2, 0);
    }

    private zznp(Uri uri2, int i) {
        this(uri2, 0, -1, (String) null, 0);
    }

    public zznp(Uri uri2, long j, long j2, String str) {
        this(uri2, j, j, j2, str, 0);
    }

    private zznp(Uri uri2, long j, long j2, String str, int i) {
        this(uri2, 0, 0, -1, (String) null, 0);
    }

    private zznp(Uri uri2, long j, long j2, long j3, String str, int i) {
        this(uri2, (byte[]) null, j, j2, j3, str, i);
    }

    public zznp(Uri uri2, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        zzob.checkArgument(j >= 0);
        zzob.checkArgument(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        zzob.checkArgument(z);
        this.uri = uri2;
        this.zzbet = bArr;
        this.zzbeu = j;
        this.zzana = j2;
        this.zzce = j3;
        this.zzcc = str;
        this.flags = i;
    }

    public final boolean zzba(int i) {
        return (this.flags & 1) == 1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.uri);
        String arrays = Arrays.toString(this.zzbet);
        long j = this.zzbeu;
        long j2 = this.zzana;
        long j3 = this.zzce;
        String str = this.zzcc;
        int i = this.flags;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 93 + String.valueOf(arrays).length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(arrays);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }
}
