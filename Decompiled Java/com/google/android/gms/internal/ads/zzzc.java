package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "VideoOptionsParcelCreator")
@SafeParcelable.Reserved({1})
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzzc> CREATOR = new zzzf();
    @SafeParcelable.Field(id = 2)
    public final boolean zzacd;
    @SafeParcelable.Field(id = 3)
    public final boolean zzace;
    @SafeParcelable.Field(id = 4)
    public final boolean zzacf;

    public zzzc(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }

    @SafeParcelable.Constructor
    public zzzc(@SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) boolean z3) {
        this.zzacd = z;
        this.zzace = z2;
        this.zzacf = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzacd);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzace);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzacf);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
