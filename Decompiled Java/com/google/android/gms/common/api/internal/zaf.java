package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.api.internal.GoogleApiManager;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zaf<A extends BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient>> extends zab {
    private final A zact;

    public zaf(int i, A a) {
        super(i);
        this.zact = a;
    }

    public final void zaa(GoogleApiManager.zaa<?> zaa) throws DeadObjectException {
        try {
            this.zact.run(zaa.zaz());
        } catch (RuntimeException e) {
            zaa((Exception) e);
        }
    }

    public final void zaa(@NonNull Status status) {
        this.zact.setFailedResult(status);
    }

    public final void zaa(@NonNull Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.zact.setFailedResult(new Status(10, sb.toString()));
    }

    public final void zaa(@NonNull zaab zaab, boolean z) {
        zaab.zaa((BasePendingResult<? extends Result>) this.zact, z);
    }
}
