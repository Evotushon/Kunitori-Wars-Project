package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AdapterStatusParcelCreator")
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzagz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzagz> CREATOR = new zzagy();
    @SafeParcelable.Field(id = 4)
    public final String description;
    @SafeParcelable.Field(id = 1)
    public final String zzczf;
    @SafeParcelable.Field(id = 2)
    public final boolean zzczg;
    @SafeParcelable.Field(id = 3)
    public final int zzczh;

    @SafeParcelable.Constructor
    public zzagz(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) String str2) {
        this.zzczf = str;
        this.zzczg = z;
        this.zzczh = i;
        this.description = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzczf, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzczg);
        SafeParcelWriter.writeInt(parcel, 3, this.zzczh);
        SafeParcelWriter.writeString(parcel, 4, this.description, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
