package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInRequestCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zaj();
    @SafeParcelable.VersionField(id = 1)
    private final int zalk;
    @SafeParcelable.Field(getter = "getResolveAccountRequest", id = 2)
    private final ResolveAccountRequest zatd;

    @SafeParcelable.Constructor
    zak(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ResolveAccountRequest resolveAccountRequest) {
        this.zalk = i;
        this.zatd = resolveAccountRequest;
    }

    public zak(ResolveAccountRequest resolveAccountRequest) {
        this(1, resolveAccountRequest);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zalk);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zatd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
