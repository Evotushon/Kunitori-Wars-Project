package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "IconAdOptionsParcelCreator")
@SafeParcelable.Reserved({1})
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzxp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxp> CREATOR = new zzxo();
    @SafeParcelable.Field(id = 2)
    private final int zzcer;

    @SafeParcelable.Constructor
    public zzxp(@SafeParcelable.Param(id = 2) int i) {
        this.zzcer = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzcer);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
