package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@SafeParcelable.Class(creator = "AutoClickProtectionConfigurationParcelCreator")
@SafeParcelable.Reserved({1})
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaqm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaqm> CREATOR = new zzaql();
    @SafeParcelable.Field(id = 2)
    public final boolean zzdms;
    @SafeParcelable.Field(id = 3)
    @Nullable
    public final List<String> zzdmt;

    public zzaqm() {
        this(false, Collections.emptyList());
    }

    @SafeParcelable.Constructor
    public zzaqm(@SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) List<String> list) {
        this.zzdms = z;
        this.zzdmt = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzdms);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzdmt, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
