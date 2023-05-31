package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzln extends zzlo {
    public static final Parcelable.Creator<zzln> CREATOR = new zzlq();
    private final String description;
    private final String value;

    public zzln(String str, String str2, String str3) {
        super(str);
        this.description = null;
        this.value = str3;
    }

    zzln(Parcel parcel) {
        super(parcel.readString());
        this.description = parcel.readString();
        this.value = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzln zzln = (zzln) obj;
            return this.zzafi.equals(zzln.zzafi) && zzop.zza(this.description, zzln.description) && zzop.zza(this.value, zzln.value);
        }
    }

    public final int hashCode() {
        int hashCode = (this.zzafi.hashCode() + 527) * 31;
        String str = this.description;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.value;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzafi);
        parcel.writeString(this.description);
        parcel.writeString(this.value);
    }
}
