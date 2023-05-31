package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AdDataParcelCreator")
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzub extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzub> CREATOR = new zzua();
    @SafeParcelable.Field(id = 1)
    public final String zzcci;
    @SafeParcelable.Field(id = 2)
    public final String zzccj;

    @SafeParcelable.Constructor
    public zzub(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        this.zzcci = str;
        this.zzccj = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzcci, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzccj, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
