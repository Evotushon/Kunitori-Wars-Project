package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "RecordConsentByConsentResultResponseCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zag extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zag> CREATOR = new zai();
    @SafeParcelable.Field(getter = "getGrantedScopes", id = 1)
    private final List<String> zasz;
    @SafeParcelable.Field(getter = "getToken", id = 2)
    @Nullable
    private final String zata;

    @SafeParcelable.Constructor
    public zag(@SafeParcelable.Param(id = 1) List<String> list, @SafeParcelable.Param(id = 2) @Nullable String str) {
        this.zasz = list;
        this.zata = str;
    }

    public final Status getStatus() {
        if (this.zata != null) {
            return Status.RESULT_SUCCESS;
        }
        return Status.RESULT_CANCELED;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, this.zasz, false);
        SafeParcelWriter.writeString(parcel, 2, this.zata, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
