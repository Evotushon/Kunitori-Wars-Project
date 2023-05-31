package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;

@SafeParcelable.Class(creator = "SignalConfigurationParcelCreator")
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzavh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzavh> CREATOR = new zzavk();
    @SafeParcelable.Field(id = 2)
    public final String zzbmg;
    @SafeParcelable.Field(id = 1)
    @Deprecated
    public final String zzbri;
    @SafeParcelable.Field(id = 3)
    @Deprecated
    public final zzuk zzdqz;
    @SafeParcelable.Field(id = 4)
    public final zzuh zzdra;

    @SafeParcelable.Constructor
    public zzavh(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) zzuk zzuk, @SafeParcelable.Param(id = 4) zzuh zzuh) {
        this.zzbri = str;
        this.zzbmg = str2;
        this.zzdqz = zzuk;
        this.zzdra = zzuh;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzbri, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzbmg, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzdqz, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzdra, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
