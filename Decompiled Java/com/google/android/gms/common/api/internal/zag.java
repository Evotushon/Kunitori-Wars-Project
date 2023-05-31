package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zag extends zac<Boolean> {
    private final ListenerHolder.ListenerKey<?> zacu;

    public zag(ListenerHolder.ListenerKey<?> listenerKey, TaskCompletionSource<Boolean> taskCompletionSource) {
        super(4, taskCompletionSource);
        this.zacu = listenerKey;
    }

    public final /* bridge */ /* synthetic */ void zaa(@NonNull zaab zaab, boolean z) {
    }

    public final void zab(GoogleApiManager.zaa<?> zaa) throws RemoteException {
        zabv remove = zaa.zabi().remove(this.zacu);
        if (remove != null) {
            remove.zakf.unregisterListener(zaa.zaz(), this.zacr);
            remove.zake.clearListener();
            return;
        }
        this.zacr.trySetResult(false);
    }

    @Nullable
    public final Feature[] zac(GoogleApiManager.zaa<?> zaa) {
        zabv zabv = zaa.zabi().get(this.zacu);
        if (zabv == null) {
            return null;
        }
        return zabv.zake.getRequiredFeatures();
    }

    public final boolean zad(GoogleApiManager.zaa<?> zaa) {
        zabv zabv = zaa.zabi().get(this.zacu);
        return zabv != null && zabv.zake.shouldAutoResolveMissingFeatures();
    }

    public final /* bridge */ /* synthetic */ void zaa(@NonNull Exception exc) {
        super.zaa(exc);
    }

    public final /* bridge */ /* synthetic */ void zaa(@NonNull Status status) {
        super.zaa(status);
    }
}
