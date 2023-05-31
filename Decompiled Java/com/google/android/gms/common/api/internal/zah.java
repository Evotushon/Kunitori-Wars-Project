package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zah<ResultT> extends zad {
    private final TaskCompletionSource<ResultT> zacr;
    private final TaskApiCall<Api.AnyClient, ResultT> zacv;
    private final StatusExceptionMapper zacw;

    public zah(int i, TaskApiCall<Api.AnyClient, ResultT> taskApiCall, TaskCompletionSource<ResultT> taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        super(i);
        this.zacr = taskCompletionSource;
        this.zacv = taskApiCall;
        this.zacw = statusExceptionMapper;
        if (i == 2 && taskApiCall.shouldAutoResolveMissingFeatures()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void zaa(GoogleApiManager.zaa<?> zaa) throws DeadObjectException {
        try {
            this.zacv.doExecute(zaa.zaz(), this.zacr);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            zaa(zab.zaa(e2));
        } catch (RuntimeException e3) {
            zaa((Exception) e3);
        }
    }

    public final void zaa(@NonNull Status status) {
        this.zacr.trySetException(this.zacw.getException(status));
    }

    public final void zaa(@NonNull Exception exc) {
        this.zacr.trySetException(exc);
    }

    public final void zaa(@NonNull zaab zaab, boolean z) {
        zaab.zaa(this.zacr, z);
    }

    @Nullable
    public final Feature[] zac(GoogleApiManager.zaa<?> zaa) {
        return this.zacv.zabr();
    }

    public final boolean zad(GoogleApiManager.zaa<?> zaa) {
        return this.zacv.shouldAutoResolveMissingFeatures();
    }
}
