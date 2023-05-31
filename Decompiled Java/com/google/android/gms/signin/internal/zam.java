package com.google.android.gms.signin.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInResponseCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new zal();
    @SafeParcelable.VersionField(id = 1)
    private final int versionCode;
    @SafeParcelable.Field(getter = "getConnectionResult", id = 2)
    private final ConnectionResult zapq;
    @SafeParcelable.Field(getter = "getResolveAccountResponse", id = 3)
    @Nullable
    private final ResolveAccountResponse zate;

    @SafeParcelable.Constructor
    zam(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ConnectionResult connectionResult, @SafeParcelable.Param(id = 3) @Nullable ResolveAccountResponse resolveAccountResponse) {
        this.versionCode = i;
        this.zapq = connectionResult;
        this.zate = resolveAccountResponse;
    }

    public zam(int i) {
        this(new ConnectionResult(8, (PendingIntent) null), (ResolveAccountResponse) null);
    }

    private zam(ConnectionResult connectionResult, @Nullable ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, (ResolveAccountResponse) null);
    }

    public final ConnectionResult getConnectionResult() {
        return this.zapq;
    }

    @Nullable
    public final ResolveAccountResponse zacv() {
        return this.zate;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zapq, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zate, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
