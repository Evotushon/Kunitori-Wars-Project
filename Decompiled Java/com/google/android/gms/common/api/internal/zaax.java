package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.GmsClientEventManager;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zaax implements GmsClientEventManager.GmsClientEventState {
    private final /* synthetic */ zaau zahn;

    zaax(zaau zaau) {
        this.zahn = zaau;
    }

    public final Bundle getConnectionHint() {
        return null;
    }

    public final boolean isConnected() {
        return this.zahn.isConnected();
    }
}
