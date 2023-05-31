package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "NativeAdOptionsParcelCreator")
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzach extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzach> CREATOR = new zzacg();
    @SafeParcelable.Field(id = 1)
    public final int versionCode;
    @SafeParcelable.Field(id = 3)
    public final int zzbke;
    @SafeParcelable.Field(id = 8)
    public final int zzbkf;
    @SafeParcelable.Field(id = 4)
    public final boolean zzbkg;
    @SafeParcelable.Field(id = 5)
    public final int zzbkh;
    @SafeParcelable.Field(id = 7)
    public final boolean zzbkj;
    @SafeParcelable.Field(id = 2)
    public final boolean zzcws;
    @SafeParcelable.Field(id = 6)
    @Nullable
    public final zzzc zzcwt;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzach(NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzzc(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzjp(), nativeAdOptions.getMediaAspectRatio());
    }

    @SafeParcelable.Constructor
    public zzach(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) boolean z2, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 6) zzzc zzzc, @SafeParcelable.Param(id = 7) boolean z3, @SafeParcelable.Param(id = 8) int i4) {
        this.versionCode = i;
        this.zzcws = z;
        this.zzbke = i2;
        this.zzbkg = z2;
        this.zzbkh = i3;
        this.zzcwt = zzzc;
        this.zzbkj = z3;
        this.zzbkf = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzcws);
        SafeParcelWriter.writeInt(parcel, 3, this.zzbke);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzbkg);
        SafeParcelWriter.writeInt(parcel, 5, this.zzbkh);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzcwt, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzbkj);
        SafeParcelWriter.writeInt(parcel, 8, this.zzbkf);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
