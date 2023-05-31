package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzlh implements Parcelable {
    public static final Parcelable.Creator<zzlh> CREATOR = new zzlg();
    private final zza[] zzazx;

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public interface zza extends Parcelable {
    }

    public zzlh(List<? extends zza> list) {
        this.zzazx = new zza[list.size()];
        list.toArray(this.zzazx);
    }

    public final int describeContents() {
        return 0;
    }

    zzlh(Parcel parcel) {
        this.zzazx = new zza[parcel.readInt()];
        int i = 0;
        while (true) {
            zza[] zzaArr = this.zzazx;
            if (i < zzaArr.length) {
                zzaArr[i] = (zza) parcel.readParcelable(zza.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public final int length() {
        return this.zzazx.length;
    }

    public final zza zzas(int i) {
        return this.zzazx[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzazx, ((zzlh) obj).zzazx);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzazx);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzazx.length);
        for (zza writeParcelable : this.zzazx) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
