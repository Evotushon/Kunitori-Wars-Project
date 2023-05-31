package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;

@SafeParcelable.Class(creator = "ServerSideVerificationOptionsParcelCreator")
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzato extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzato> CREATOR = new zzatn();
    @SafeParcelable.Field(id = 1)
    public final String zzdpa;
    @SafeParcelable.Field(id = 2)
    public final String zzdpb;

    public zzato(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(serverSideVerificationOptions.getUserId(), serverSideVerificationOptions.getCustomData());
    }

    @SafeParcelable.Constructor
    public zzato(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        this.zzdpa = str;
        this.zzdpb = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzdpa, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzdpb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
