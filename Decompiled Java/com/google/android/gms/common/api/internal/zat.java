package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zat implements zabr {
    private final /* synthetic */ zas zaei;

    private zat(zas zas) {
        this.zaei = zas;
    }

    public final void zab(@Nullable Bundle bundle) {
        this.zaei.zaet.lock();
        try {
            ConnectionResult unused = this.zaei.zaer = ConnectionResult.RESULT_SUCCESS;
            this.zaei.zav();
        } finally {
            this.zaei.zaet.unlock();
        }
    }

    public final void zac(@NonNull ConnectionResult connectionResult) {
        this.zaei.zaet.lock();
        try {
            ConnectionResult unused = this.zaei.zaer = connectionResult;
            this.zaei.zav();
        } finally {
            this.zaei.zaet.unlock();
        }
    }

    public final void zab(int i, boolean z) {
        this.zaei.zaet.lock();
        try {
            if (this.zaei.zaes) {
                boolean unused = this.zaei.zaes = false;
                this.zaei.zaa(i, z);
                return;
            }
            boolean unused2 = this.zaei.zaes = true;
            this.zaei.zaek.onConnectionSuspended(i);
            this.zaei.zaet.unlock();
        } finally {
            this.zaei.zaet.unlock();
        }
    }

    /* synthetic */ zat(zas zas, zar zar) {
        this(zas);
    }
}
