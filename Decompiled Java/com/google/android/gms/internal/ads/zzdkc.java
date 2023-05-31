package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ProgramRequestCreator")
/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public final class zzdkc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdkc> CREATOR = new zzdkf();
    @SafeParcelable.VersionField(id = 1)
    private final int versionCode;
    @SafeParcelable.Field(id = 3)
    private final String zzgwx;
    @SafeParcelable.Field(id = 4)
    private final String zzgwy;
    @SafeParcelable.Field(id = 2)
    private final int zzgwz;

    @SafeParcelable.Constructor
    zzdkc(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2) {
        this.versionCode = i;
        this.zzgwz = i2;
        this.zzgwx = str;
        this.zzgwy = str2;
    }

    public zzdkc(int i, String str, String str2) {
        this(1, i, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeInt(parcel, 2, this.zzgwz);
        SafeParcelWriter.writeString(parcel, 3, this.zzgwx, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzgwy, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
