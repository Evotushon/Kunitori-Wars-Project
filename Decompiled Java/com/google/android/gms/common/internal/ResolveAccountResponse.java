package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ResolveAccountResponseCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountResponse> CREATOR = new zan();
    @SafeParcelable.VersionField(id = 1)
    private final int versionCode;
    @SafeParcelable.Field(id = 2)
    private IBinder zapp;
    @SafeParcelable.Field(getter = "getConnectionResult", id = 3)
    private ConnectionResult zapq;
    @SafeParcelable.Field(getter = "getSaveDefaultAccount", id = 4)
    private boolean zapr;
    @SafeParcelable.Field(getter = "isFromCrossClientAuth", id = 5)
    private boolean zaps;

    @SafeParcelable.Constructor
    ResolveAccountResponse(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) ConnectionResult connectionResult, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2) {
        this.versionCode = i;
        this.zapp = iBinder;
        this.zapq = connectionResult;
        this.zapr = z;
        this.zaps = z2;
    }

    public ResolveAccountResponse(ConnectionResult connectionResult) {
        this(1, (IBinder) null, connectionResult, false, false);
    }

    public ResolveAccountResponse(int i) {
        this(new ConnectionResult(i, (PendingIntent) null));
    }

    public IAccountAccessor getAccountAccessor() {
        return IAccountAccessor.Stub.asInterface(this.zapp);
    }

    public ResolveAccountResponse setAccountAccessor(IAccountAccessor iAccountAccessor) {
        this.zapp = iAccountAccessor == null ? null : iAccountAccessor.asBinder();
        return this;
    }

    public ConnectionResult getConnectionResult() {
        return this.zapq;
    }

    public boolean getSaveDefaultAccount() {
        return this.zapr;
    }

    public ResolveAccountResponse setSaveDefaultAccount(boolean z) {
        this.zapr = z;
        return this;
    }

    public boolean isFromCrossClientAuth() {
        return this.zaps;
    }

    public ResolveAccountResponse setIsFromCrossClientAuth(boolean z) {
        this.zaps = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zapp, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getConnectionResult(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, getSaveDefaultAccount());
        SafeParcelWriter.writeBoolean(parcel, 5, isFromCrossClientAuth());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.zapq.equals(resolveAccountResponse.zapq) && getAccountAccessor().equals(resolveAccountResponse.getAccountAccessor());
    }
}
