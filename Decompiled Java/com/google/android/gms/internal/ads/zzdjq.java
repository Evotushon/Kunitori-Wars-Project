package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GassEventParcelCreator")
/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public final class zzdjq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdjq> CREATOR = new zzdjt();
    @SafeParcelable.VersionField(id = 1)
    private final int versionCode;
    @SafeParcelable.Field(id = 2)
    private final byte[] zzgxt;

    @SafeParcelable.Constructor
    zzdjq(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.versionCode = i;
        this.zzgxt = bArr;
    }

    public zzdjq(byte[] bArr) {
        this(1, bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzgxt, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
