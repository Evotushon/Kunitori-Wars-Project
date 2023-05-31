package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zae extends zaa {
    private final BaseImplementation.ResultHolder<Status> mResultHolder;

    public zae(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.mResultHolder = resultHolder;
    }

    public final void zaj(int i) throws RemoteException {
        this.mResultHolder.setResult(new Status(i));
    }
}
