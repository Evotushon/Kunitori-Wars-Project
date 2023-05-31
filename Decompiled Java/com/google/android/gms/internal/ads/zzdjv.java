package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GassRequestParcelCreator")
/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public final class zzdjv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdjv> CREATOR = new zzdju();
    @SafeParcelable.Field(id = 2)
    private final String packageName;
    @SafeParcelable.VersionField(id = 1)
    private final int versionCode;
    @SafeParcelable.Field(id = 3)
    private final String zzgxu;

    @SafeParcelable.Constructor
    zzdjv(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2) {
        this.versionCode = i;
        this.packageName = str;
        this.zzgxu = str2;
    }

    public zzdjv(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeString(parcel, 2, this.packageName, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzgxu, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
