package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import java.util.Arrays;

@TargetApi(21)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzhm {
    private static final zzhm zzahc = new zzhm(new int[]{2}, 2);
    private final int[] zzahd;
    private final int zzahe = 2;

    private zzhm(int[] iArr, int i) {
        this.zzahd = Arrays.copyOf(iArr, iArr.length);
        Arrays.sort(this.zzahd);
    }

    public final boolean zzq(int i) {
        return Arrays.binarySearch(this.zzahd, i) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhm)) {
            return false;
        }
        zzhm zzhm = (zzhm) obj;
        return Arrays.equals(this.zzahd, zzhm.zzahd) && this.zzahe == zzhm.zzahe;
    }

    public final int hashCode() {
        return this.zzahe + (Arrays.hashCode(this.zzahd) * 31);
    }

    public final String toString() {
        int i = this.zzahe;
        String arrays = Arrays.toString(this.zzahd);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
