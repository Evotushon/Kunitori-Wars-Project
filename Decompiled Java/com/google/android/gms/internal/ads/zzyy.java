package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SearchAdRequestParcelCreator")
@SafeParcelable.Reserved({1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14})
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzyy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyy> CREATOR = new zzzb();
    @SafeParcelable.Field(id = 15)
    public final String zzbme;

    public zzyy(SearchAdRequest searchAdRequest) {
        this.zzbme = searchAdRequest.getQuery();
    }

    @SafeParcelable.Constructor
    zzyy(@SafeParcelable.Param(id = 15) String str) {
        this.zzbme = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 15, this.zzbme, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
