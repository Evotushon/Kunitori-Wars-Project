package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "MediationConfigurationParcelCreator")
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzahj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzahj> CREATOR = new zzahi();
    @SafeParcelable.Field(id = 2)
    public final Bundle extras;
    @SafeParcelable.Field(id = 1)
    public final String zzczk;

    @SafeParcelable.Constructor
    public zzahj(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Bundle bundle) {
        this.zzczk = str;
        this.extras = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzczk, false);
        SafeParcelWriter.writeBundle(parcel, 2, this.extras, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
