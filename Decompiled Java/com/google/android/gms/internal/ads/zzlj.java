package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzlj extends zzlo {
    public static final Parcelable.Creator<zzlj> CREATOR = new zzlm();
    public final String description;
    public final String text;
    private final String zzage;

    public zzlj(String str, String str2, String str3) {
        super("COMM");
        this.zzage = str;
        this.description = str2;
        this.text = str3;
    }

    zzlj(Parcel parcel) {
        super("COMM");
        this.zzage = parcel.readString();
        this.description = parcel.readString();
        this.text = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzlj zzlj = (zzlj) obj;
            return zzop.zza(this.description, zzlj.description) && zzop.zza(this.zzage, zzlj.zzage) && zzop.zza(this.text, zzlj.text);
        }
    }

    public final int hashCode() {
        String str = this.zzage;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.text;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzafi);
        parcel.writeString(this.zzage);
        parcel.writeString(this.text);
    }
}
