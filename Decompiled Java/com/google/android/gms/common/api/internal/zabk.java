package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zabk implements BaseGmsClient.SignOutCallbacks {
    final /* synthetic */ GoogleApiManager.zaa zajc;

    zabk(GoogleApiManager.zaa zaa) {
        this.zajc = zaa;
    }

    public final void onSignOutComplete() {
        GoogleApiManager.this.handler.post(new zabm(this));
    }
}
