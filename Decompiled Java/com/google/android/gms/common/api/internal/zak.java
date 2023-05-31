package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zak {
    private final int zadi;
    private final ConnectionResult zadj;

    zak(ConnectionResult connectionResult, int i) {
        Preconditions.checkNotNull(connectionResult);
        this.zadj = connectionResult;
        this.zadi = i;
    }

    /* access modifiers changed from: package-private */
    public final int zao() {
        return this.zadi;
    }

    /* access modifiers changed from: package-private */
    public final ConnectionResult getConnectionResult() {
        return this.zadj;
    }
}
