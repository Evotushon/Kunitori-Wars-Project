package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "RewardedVideoAdRequestParcelCreator")
@SafeParcelable.Reserved({1})
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzash extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzash> CREATOR = new zzask();
    @SafeParcelable.Field(id = 3)
    public final String zzbri;
    @SafeParcelable.Field(id = 2)
    public final zzuh zzdjt;

    @SafeParcelable.Constructor
    public zzash(@SafeParcelable.Param(id = 2) zzuh zzuh, @SafeParcelable.Param(id = 3) String str) {
        this.zzdjt = zzuh;
        this.zzbri = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdjt, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzbri, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
