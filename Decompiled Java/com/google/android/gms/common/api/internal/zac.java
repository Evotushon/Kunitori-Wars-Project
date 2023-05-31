package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
abstract class zac<T> extends zad {
    protected final TaskCompletionSource<T> zacr;

    public zac(int i, TaskCompletionSource<T> taskCompletionSource) {
        super(i);
        this.zacr = taskCompletionSource;
    }

    public void zaa(@NonNull zaab zaab, boolean z) {
    }

    /* access modifiers changed from: protected */
    public abstract void zab(GoogleApiManager.zaa<?> zaa) throws RemoteException;

    public void zaa(@NonNull Status status) {
        this.zacr.trySetException(new ApiException(status));
    }

    public void zaa(@NonNull Exception exc) {
        this.zacr.trySetException(exc);
    }

    public final void zaa(GoogleApiManager.zaa<?> zaa) throws DeadObjectException {
        try {
            zab(zaa);
        } catch (DeadObjectException e) {
            zaa(zab.zaa((RemoteException) e));
            throw e;
        } catch (RemoteException e2) {
            zaa(zab.zaa(e2));
        } catch (RuntimeException e3) {
            zaa((Exception) e3);
        }
    }
}
