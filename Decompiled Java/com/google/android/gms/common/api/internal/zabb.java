package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zap;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zabb extends zap {
    private final /* synthetic */ zaau zahn;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zabb(zaau zaau, Looper looper) {
        super(looper);
        this.zahn = zaau;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.zahn.zaat();
        } else if (i != 2) {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i2);
            Log.w("GoogleApiClientImpl", sb.toString());
        } else {
            this.zahn.resume();
        }
    }
}
