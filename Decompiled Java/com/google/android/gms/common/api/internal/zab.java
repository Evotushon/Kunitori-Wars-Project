package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.util.PlatformVersion;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public abstract class zab {
    public final int type;

    public zab(int i) {
        this.type = i;
    }

    public abstract void zaa(@NonNull Status status);

    public abstract void zaa(GoogleApiManager.zaa<?> zaa) throws DeadObjectException;

    public abstract void zaa(@NonNull zaab zaab, boolean z);

    public abstract void zaa(@NonNull Exception exc);

    /* access modifiers changed from: private */
    public static Status zaa(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (PlatformVersion.isAtLeastIceCreamSandwichMR1() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }
}
