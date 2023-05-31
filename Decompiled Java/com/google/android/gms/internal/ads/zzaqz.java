package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "StringParcelCreator")
@SafeParcelable.Reserved({1})
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaqz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaqz> CREATOR = new zzarc();
    @SafeParcelable.Field(id = 2)
    String zzdne;

    @SafeParcelable.Constructor
    public zzaqz(@SafeParcelable.Param(id = 2) String str) {
        this.zzdne = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzdne, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
