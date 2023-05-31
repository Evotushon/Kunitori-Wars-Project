package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AuthAccountResultCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zab extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zab> CREATOR = new zaa();
    @SafeParcelable.VersionField(id = 1)
    private final int versionCode;
    @SafeParcelable.Field(getter = "getConnectionResultCode", id = 2)
    private int zasx;
    @SafeParcelable.Field(getter = "getRawAuthResolutionIntent", id = 3)
    @Nullable
    private Intent zasy;

    @SafeParcelable.Constructor
    zab(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) @Nullable Intent intent) {
        this.versionCode = i;
        this.zasx = i2;
        this.zasy = intent;
    }

    public zab() {
        this(0, (Intent) null);
    }

    private zab(int i, @Nullable Intent intent) {
        this(2, 0, (Intent) null);
    }

    public final Status getStatus() {
        if (this.zasx == 0) {
            return Status.RESULT_SUCCESS;
        }
        return Status.RESULT_CANCELED;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeInt(parcel, 2, this.zasx);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zasy, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
