package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zae extends zac<Void> {
    private final zabv zacs;

    public zae(zabv zabv, TaskCompletionSource<Void> taskCompletionSource) {
        super(3, taskCompletionSource);
        this.zacs = zabv;
    }

    public final /* bridge */ /* synthetic */ void zaa(@NonNull zaab zaab, boolean z) {
    }

    public final void zab(GoogleApiManager.zaa<?> zaa) throws RemoteException {
        this.zacs.zake.registerListener(zaa.zaz(), this.zacr);
        if (this.zacs.zake.getListenerKey() != null) {
            zaa.zabi().put(this.zacs.zake.getListenerKey(), this.zacs);
        }
    }

    @Nullable
    public final Feature[] zac(GoogleApiManager.zaa<?> zaa) {
        return this.zacs.zake.getRequiredFeatures();
    }

    public final boolean zad(GoogleApiManager.zaa<?> zaa) {
        return this.zacs.zake.shouldAutoResolveMissingFeatures();
    }

    public final /* bridge */ /* synthetic */ void zaa(@NonNull Exception exc) {
        super.zaa(exc);
    }

    public final /* bridge */ /* synthetic */ void zaa(@NonNull Status status) {
        super.zaa(status);
    }
}
