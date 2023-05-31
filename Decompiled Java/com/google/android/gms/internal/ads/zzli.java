package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzli extends zzlo {
    public static final Parcelable.Creator<zzli> CREATOR = new zzlk();
    private final String description;
    private final String mimeType;
    private final int zzazy;
    private final byte[] zzazz;

    public zzli(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.mimeType = str;
        this.description = null;
        this.zzazy = 3;
        this.zzazz = bArr;
    }

    zzli(Parcel parcel) {
        super("APIC");
        this.mimeType = parcel.readString();
        this.description = parcel.readString();
        this.zzazy = parcel.readInt();
        this.zzazz = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzli zzli = (zzli) obj;
            return this.zzazy == zzli.zzazy && zzop.zza(this.mimeType, zzli.mimeType) && zzop.zza(this.description, zzli.description) && Arrays.equals(this.zzazz, zzli.zzazz);
        }
    }

    public final int hashCode() {
        int i = (this.zzazy + 527) * 31;
        String str = this.mimeType;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.zzazz);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mimeType);
        parcel.writeString(this.description);
        parcel.writeInt(this.zzazy);
        parcel.writeByteArray(this.zzazz);
    }
}
