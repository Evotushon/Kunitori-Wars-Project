package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "GetServiceRequestCreator")
@SafeParcelable.Reserved({9})
/* compiled from: com.google.android.gms:play-services-basement@@17.2.1 */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzd();
    @SafeParcelable.VersionField(id = 1)
    private final int version;
    @SafeParcelable.Field(id = 4)
    String zzak;
    @SafeParcelable.Field(defaultValue = "0", id = 13)
    private int zzdn;
    @SafeParcelable.Field(id = 2)
    private final int zzds;
    @SafeParcelable.Field(id = 3)
    private int zzdt;
    @SafeParcelable.Field(id = 5)
    IBinder zzdu;
    @SafeParcelable.Field(id = 6)
    Scope[] zzdv;
    @SafeParcelable.Field(id = 7)
    Bundle zzdw;
    @SafeParcelable.Field(id = 8)
    Account zzdx;
    @SafeParcelable.Field(id = 10)
    Feature[] zzdy;
    @SafeParcelable.Field(id = 11)
    Feature[] zzdz;
    @SafeParcelable.Field(id = 12)
    private boolean zzea;

    public GetServiceRequest(int i) {
        this.version = 4;
        this.zzdt = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        this.zzds = i;
        this.zzea = true;
    }

    @SafeParcelable.Constructor
    GetServiceRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) Scope[] scopeArr, @SafeParcelable.Param(id = 7) Bundle bundle, @SafeParcelable.Param(id = 8) Account account, @SafeParcelable.Param(id = 10) Feature[] featureArr, @SafeParcelable.Param(id = 11) Feature[] featureArr2, @SafeParcelable.Param(id = 12) boolean z, @SafeParcelable.Param(id = 13) int i4) {
        this.version = i;
        this.zzds = i2;
        this.zzdt = i3;
        if ("com.google.android.gms".equals(str)) {
            this.zzak = "com.google.android.gms";
        } else {
            this.zzak = str;
        }
        if (i < 2) {
            this.zzdx = iBinder != null ? AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder)) : null;
        } else {
            this.zzdu = iBinder;
            this.zzdx = account;
        }
        this.zzdv = scopeArr;
        this.zzdw = bundle;
        this.zzdy = featureArr;
        this.zzdz = featureArr2;
        this.zzea = z;
        this.zzdn = i4;
    }

    @KeepForSdk
    public Bundle getExtraArgs() {
        return this.zzdw;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.version);
        SafeParcelWriter.writeInt(parcel, 2, this.zzds);
        SafeParcelWriter.writeInt(parcel, 3, this.zzdt);
        SafeParcelWriter.writeString(parcel, 4, this.zzak, false);
        SafeParcelWriter.writeIBinder(parcel, 5, this.zzdu, false);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.zzdv, i, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.zzdw, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzdx, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 10, this.zzdy, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 11, this.zzdz, i, false);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzea);
        SafeParcelWriter.writeInt(parcel, 13, this.zzdn);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
