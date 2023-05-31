package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ExceptionParcelCreator")
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaxp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaxp> CREATOR = new zzaxr();
    @SafeParcelable.Field(id = 2)
    public final int errorCode;
    @SafeParcelable.Field(id = 1)
    public final String zzdux;

    @Nullable
    public static zzaxp zza(Throwable th, int i) {
        return new zzaxp(th.getMessage(), i);
    }

    @SafeParcelable.Constructor
    zzaxp(@SafeParcelable.Param(id = 1) @Nullable String str, @SafeParcelable.Param(id = 2) int i) {
        this.zzdux = str == null ? "" : str;
        this.errorCode = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzdux, false);
        SafeParcelWriter.writeInt(parcel, 2, this.errorCode);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
