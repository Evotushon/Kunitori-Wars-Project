package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;

@SafeParcelable.Class(creator = "InstreamAdConfigurationParcelCreator")
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzahl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzahl> CREATOR = new zzahk();
    @SafeParcelable.VersionField(id = 1000)
    public final int versionCode;
    @SafeParcelable.Field(id = 3)
    public final int zzbkf;
    @SafeParcelable.Field(id = 1)
    public final int zzczl;
    @SafeParcelable.Field(id = 2)
    public final String zzczm;

    public zzahl(zzahx zzahx) {
        this(2, 1, zzahx.zzsc(), zzahx.getMediaAspectRatio());
    }

    @SafeParcelable.Constructor
    public zzahl(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i3) {
        this.versionCode = i;
        this.zzczl = i2;
        this.zzczm = str;
        this.zzbkf = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzczl);
        SafeParcelWriter.writeString(parcel, 2, this.zzczm, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzbkf);
        SafeParcelWriter.writeInt(parcel, 1000, this.versionCode);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
