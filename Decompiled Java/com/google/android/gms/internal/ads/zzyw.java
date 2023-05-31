package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "RequestConfigurationParcelCreator")
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzyw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyw> CREATOR = new zzyz();
    @SafeParcelable.Field(id = 1)
    private final int zzabv;
    @SafeParcelable.Field(id = 2)
    private final int zzabw;

    @SafeParcelable.Constructor
    public zzyw(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2) {
        this.zzabv = i;
        this.zzabw = i2;
    }

    public zzyw(RequestConfiguration requestConfiguration) {
        this.zzabv = requestConfiguration.getTagForChildDirectedTreatment();
        this.zzabw = requestConfiguration.getTagForUnderAgeOfConsent();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzabv);
        SafeParcelWriter.writeInt(parcel, 2, this.zzabw);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
