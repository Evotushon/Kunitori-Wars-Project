package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@SafeParcelable.Class(creator = "NonagonRequestParcelCreator")
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaqx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaqx> CREATOR = new zzara();
    @SafeParcelable.Field(id = 3)
    public final ApplicationInfo applicationInfo;
    @SafeParcelable.Field(id = 4)
    public final String packageName;
    @SafeParcelable.Field(id = 2)
    public final zzazo zzdjo;
    @SafeParcelable.Field(id = 6)
    @Nullable
    public final PackageInfo zzdju;
    @SafeParcelable.Field(id = 5)
    public final List<String> zzdke;
    @SafeParcelable.Field(id = 7)
    public final String zzdko;
    @SafeParcelable.Field(id = 1)
    public final Bundle zzdmz;
    @SafeParcelable.Field(id = 8)
    public final boolean zzdna;
    @SafeParcelable.Field(id = 9)
    public final String zzdnb;
    @SafeParcelable.Field(id = 10)
    @Nullable
    public zzdgg zzdnc;
    @SafeParcelable.Field(id = 11)
    @Nullable
    public String zzdnd;

    @SafeParcelable.Constructor
    public zzaqx(@SafeParcelable.Param(id = 1) Bundle bundle, @SafeParcelable.Param(id = 2) zzazo zzazo, @SafeParcelable.Param(id = 3) ApplicationInfo applicationInfo2, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) List<String> list, @SafeParcelable.Param(id = 6) @Nullable PackageInfo packageInfo, @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) String str3, @SafeParcelable.Param(id = 10) zzdgg zzdgg, @SafeParcelable.Param(id = 11) String str4) {
        this.zzdmz = bundle;
        this.zzdjo = zzazo;
        this.packageName = str;
        this.applicationInfo = applicationInfo2;
        this.zzdke = list;
        this.zzdju = packageInfo;
        this.zzdko = str2;
        this.zzdna = z;
        this.zzdnb = str3;
        this.zzdnc = zzdgg;
        this.zzdnd = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zzdmz, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdjo, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.applicationInfo, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.packageName, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zzdke, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzdju, i, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzdko, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzdna);
        SafeParcelWriter.writeString(parcel, 9, this.zzdnb, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzdnc, i, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzdnd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
