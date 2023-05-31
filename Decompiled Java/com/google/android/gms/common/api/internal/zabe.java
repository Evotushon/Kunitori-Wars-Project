package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zap;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zabe extends zap {
    private final /* synthetic */ zabc zahy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zabe(zabc zabc, Looper looper) {
        super(looper);
        this.zahy = zabc;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((zabf) message.obj).zac(this.zahy);
        } else if (i != 2) {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i2);
            Log.w("GACStateManager", sb.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
