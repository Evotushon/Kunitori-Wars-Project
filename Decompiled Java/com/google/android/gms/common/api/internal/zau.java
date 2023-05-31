package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zau implements zabr {
    private final /* synthetic */ zas zaei;

    private zau(zas zas) {
        this.zaei = zas;
    }

    public final void zab(@Nullable Bundle bundle) {
        this.zaei.zaet.lock();
        try {
            this.zaei.zaa(bundle);
            ConnectionResult unused = this.zaei.zaeq = ConnectionResult.RESULT_SUCCESS;
            this.zaei.zav();
        } finally {
            this.zaei.zaet.unlock();
        }
    }

    public final void zac(@NonNull ConnectionResult connectionResult) {
        this.zaei.zaet.lock();
        try {
            ConnectionResult unused = this.zaei.zaeq = connectionResult;
            this.zaei.zav();
        } finally {
            this.zaei.zaet.unlock();
        }
    }

    public final void zab(int i, boolean z) {
        this.zaei.zaet.lock();
        try {
            if (!this.zaei.zaes && this.zaei.zaer != null) {
                if (this.zaei.zaer.isSuccess()) {
                    boolean unused = this.zaei.zaes = true;
                    this.zaei.zael.onConnectionSuspended(i);
                    this.zaei.zaet.unlock();
                    return;
                }
            }
            boolean unused2 = this.zaei.zaes = false;
            this.zaei.zaa(i, z);
        } finally {
            this.zaei.zaet.unlock();
        }
    }

    /* synthetic */ zau(zas zas, zar zar) {
        this(zas);
    }
}
