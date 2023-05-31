package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class(creator = "AdRequestParcelCreator")
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzuh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuh> CREATOR = new zzuj();
    @SafeParcelable.Field(id = 3)
    public final Bundle extras;
    @SafeParcelable.Field(id = 1)
    public final int versionCode;
    @SafeParcelable.Field(id = 7)
    public final int zzabv;
    @SafeParcelable.Field(id = 20)
    public final int zzabw;
    @SafeParcelable.Field(id = 21)
    @Nullable
    public final String zzabx;
    @SafeParcelable.Field(id = 8)
    public final boolean zzbkp;
    @SafeParcelable.Field(id = 2)
    @Deprecated
    public final long zzccm;
    @SafeParcelable.Field(id = 4)
    @Deprecated
    public final int zzccn;
    @SafeParcelable.Field(id = 5)
    public final List<String> zzcco;
    @SafeParcelable.Field(id = 6)
    public final boolean zzccp;
    @SafeParcelable.Field(id = 9)
    public final String zzccq;
    @SafeParcelable.Field(id = 10)
    public final zzyy zzccr;
    @SafeParcelable.Field(id = 12)
    public final String zzccs;
    @SafeParcelable.Field(id = 13)
    public final Bundle zzcct;
    @SafeParcelable.Field(id = 14)
    public final Bundle zzccu;
    @SafeParcelable.Field(id = 15)
    public final List<String> zzccv;
    @SafeParcelable.Field(id = 16)
    public final String zzccw;
    @SafeParcelable.Field(id = 17)
    public final String zzccx;
    @SafeParcelable.Field(id = 18)
    @Deprecated
    public final boolean zzccy;
    @SafeParcelable.Field(id = 22)
    public final List<String> zzccz;
    @SafeParcelable.Field(id = 19)
    @Nullable
    public final zzub zzcda;
    @SafeParcelable.Field(id = 11)
    public final Location zzmk;

    @SafeParcelable.Constructor
    public zzuh(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) Bundle bundle, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) List<String> list, @SafeParcelable.Param(id = 6) boolean z, @SafeParcelable.Param(id = 7) int i3, @SafeParcelable.Param(id = 8) boolean z2, @SafeParcelable.Param(id = 9) String str, @SafeParcelable.Param(id = 10) zzyy zzyy, @SafeParcelable.Param(id = 11) Location location, @SafeParcelable.Param(id = 12) String str2, @SafeParcelable.Param(id = 13) Bundle bundle2, @SafeParcelable.Param(id = 14) Bundle bundle3, @SafeParcelable.Param(id = 15) List<String> list2, @SafeParcelable.Param(id = 16) String str3, @SafeParcelable.Param(id = 17) String str4, @SafeParcelable.Param(id = 18) boolean z3, @SafeParcelable.Param(id = 19) zzub zzub, @SafeParcelable.Param(id = 20) int i4, @SafeParcelable.Param(id = 21) @Nullable String str5, @SafeParcelable.Param(id = 22) List<String> list3) {
        this.versionCode = i;
        this.zzccm = j;
        this.extras = bundle == null ? new Bundle() : bundle;
        this.zzccn = i2;
        this.zzcco = list;
        this.zzccp = z;
        this.zzabv = i3;
        this.zzbkp = z2;
        this.zzccq = str;
        this.zzccr = zzyy;
        this.zzmk = location;
        this.zzccs = str2;
        this.zzcct = bundle2 == null ? new Bundle() : bundle2;
        this.zzccu = bundle3;
        this.zzccv = list2;
        this.zzccw = str3;
        this.zzccx = str4;
        this.zzccy = z3;
        this.zzcda = zzub;
        this.zzabw = i4;
        this.zzabx = str5;
        this.zzccz = list3 == null ? new ArrayList<>() : list3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeLong(parcel, 2, this.zzccm);
        SafeParcelWriter.writeBundle(parcel, 3, this.extras, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzccn);
        SafeParcelWriter.writeStringList(parcel, 5, this.zzcco, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzccp);
        SafeParcelWriter.writeInt(parcel, 7, this.zzabv);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzbkp);
        SafeParcelWriter.writeString(parcel, 9, this.zzccq, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzccr, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzmk, i, false);
        SafeParcelWriter.writeString(parcel, 12, this.zzccs, false);
        SafeParcelWriter.writeBundle(parcel, 13, this.zzcct, false);
        SafeParcelWriter.writeBundle(parcel, 14, this.zzccu, false);
        SafeParcelWriter.writeStringList(parcel, 15, this.zzccv, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzccw, false);
        SafeParcelWriter.writeString(parcel, 17, this.zzccx, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzccy);
        SafeParcelWriter.writeParcelable(parcel, 19, this.zzcda, i, false);
        SafeParcelWriter.writeInt(parcel, 20, this.zzabw);
        SafeParcelWriter.writeString(parcel, 21, this.zzabx, false);
        SafeParcelWriter.writeStringList(parcel, 22, this.zzccz, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzuh)) {
            return false;
        }
        zzuh zzuh = (zzuh) obj;
        if (this.versionCode != zzuh.versionCode || this.zzccm != zzuh.zzccm || !Objects.equal(this.extras, zzuh.extras) || this.zzccn != zzuh.zzccn || !Objects.equal(this.zzcco, zzuh.zzcco) || this.zzccp != zzuh.zzccp || this.zzabv != zzuh.zzabv || this.zzbkp != zzuh.zzbkp || !Objects.equal(this.zzccq, zzuh.zzccq) || !Objects.equal(this.zzccr, zzuh.zzccr) || !Objects.equal(this.zzmk, zzuh.zzmk) || !Objects.equal(this.zzccs, zzuh.zzccs) || !Objects.equal(this.zzcct, zzuh.zzcct) || !Objects.equal(this.zzccu, zzuh.zzccu) || !Objects.equal(this.zzccv, zzuh.zzccv) || !Objects.equal(this.zzccw, zzuh.zzccw) || !Objects.equal(this.zzccx, zzuh.zzccx) || this.zzccy != zzuh.zzccy || this.zzabw != zzuh.zzabw || !Objects.equal(this.zzabx, zzuh.zzabx) || !Objects.equal(this.zzccz, zzuh.zzccz)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.versionCode), Long.valueOf(this.zzccm), this.extras, Integer.valueOf(this.zzccn), this.zzcco, Boolean.valueOf(this.zzccp), Integer.valueOf(this.zzabv), Boolean.valueOf(this.zzbkp), this.zzccq, this.zzccr, this.zzmk, this.zzccs, this.zzcct, this.zzccu, this.zzccv, this.zzccw, this.zzccx, Boolean.valueOf(this.zzccy), Integer.valueOf(this.zzabw), this.zzabx, this.zzccz);
    }
}
