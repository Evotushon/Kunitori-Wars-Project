package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zad;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public abstract class zaf extends zaa implements zac {
    public zaf() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                zaa((ConnectionResult) zad.zaa(parcel, ConnectionResult.CREATOR), (zab) zad.zaa(parcel, zab.CREATOR));
                break;
            case 4:
                zag((Status) zad.zaa(parcel, Status.CREATOR));
                break;
            case 6:
                zah((Status) zad.zaa(parcel, Status.CREATOR));
                break;
            case 7:
                zaa((Status) zad.zaa(parcel, Status.CREATOR), (GoogleSignInAccount) zad.zaa(parcel, GoogleSignInAccount.CREATOR));
                break;
            case 8:
                zab((zam) zad.zaa(parcel, zam.CREATOR));
                break;
            case 9:
                zaa((zag) zad.zaa(parcel, zag.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
