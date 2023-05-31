package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzou implements Parcelable {
    public static final Parcelable.Creator<zzou> CREATOR = new zzot();
    private int zzagg;
    public final int zzaqf;
    public final int zzaqg;
    public final int zzaqh;
    public final byte[] zzbhi;

    public zzou(int i, int i2, int i3, byte[] bArr) {
        this.zzaqf = i;
        this.zzaqh = i2;
        this.zzaqg = i3;
        this.zzbhi = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    zzou(Parcel parcel) {
        this.zzaqf = parcel.readInt();
        this.zzaqh = parcel.readInt();
        this.zzaqg = parcel.readInt();
        this.zzbhi = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzou zzou = (zzou) obj;
            return this.zzaqf == zzou.zzaqf && this.zzaqh == zzou.zzaqh && this.zzaqg == zzou.zzaqg && Arrays.equals(this.zzbhi, zzou.zzbhi);
        }
    }

    public final String toString() {
        int i = this.zzaqf;
        int i2 = this.zzaqh;
        int i3 = this.zzaqg;
        boolean z = this.zzbhi != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        if (this.zzagg == 0) {
            this.zzagg = ((((((this.zzaqf + 527) * 31) + this.zzaqh) * 31) + this.zzaqg) * 31) + Arrays.hashCode(this.zzbhi);
        }
        return this.zzagg;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzaqf);
        parcel.writeInt(this.zzaqh);
        parcel.writeInt(this.zzaqg);
        parcel.writeInt(this.zzbhi != null ? 1 : 0);
        byte[] bArr = this.zzbhi;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
