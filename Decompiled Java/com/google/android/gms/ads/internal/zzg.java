package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "InterstitialAdParameterParcelCreator")
@SafeParcelable.Reserved({1})
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzj();
    @SafeParcelable.Field(id = 2)
    public final boolean zzblg;
    @SafeParcelable.Field(id = 3)
    public final boolean zzblh;
    @SafeParcelable.Field(id = 4)
    private final String zzbli;
    @SafeParcelable.Field(id = 5)
    public final boolean zzblj;
    @SafeParcelable.Field(id = 6)
    public final float zzblk;
    @SafeParcelable.Field(id = 7)
    public final int zzbll;
    @SafeParcelable.Field(id = 8)
    public final boolean zzblm;
    @SafeParcelable.Field(id = 9)
    public final boolean zzbln;
    @SafeParcelable.Field(id = 10)
    public final boolean zzblo;

    public zzg(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(false, z2, (String) null, false, 0.0f, -1, z4, z5, z6);
    }

    @SafeParcelable.Constructor
    zzg(@SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) boolean z3, @SafeParcelable.Param(id = 6) float f, @SafeParcelable.Param(id = 7) int i, @SafeParcelable.Param(id = 8) boolean z4, @SafeParcelable.Param(id = 9) boolean z5, @SafeParcelable.Param(id = 10) boolean z6) {
        this.zzblg = z;
        this.zzblh = z2;
        this.zzbli = str;
        this.zzblj = z3;
        this.zzblk = f;
        this.zzbll = i;
        this.zzblm = z4;
        this.zzbln = z5;
        this.zzblo = z6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzblg);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzblh);
        SafeParcelWriter.writeString(parcel, 4, this.zzbli, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzblj);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzblk);
        SafeParcelWriter.writeInt(parcel, 7, this.zzbll);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzblm);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzbln);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzblo);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
