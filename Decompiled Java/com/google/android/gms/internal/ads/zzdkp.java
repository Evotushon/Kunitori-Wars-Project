package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CallSuper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class zzdkp extends Handler {
    private static zzdko zzgyo;

    public zzdkp() {
    }

    public zzdkp(Looper looper) {
        super(looper);
    }

    public zzdkp(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }

    public final void dispatchMessage(Message message) {
        zzb(message);
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void zzb(Message message) {
        super.dispatchMessage(message);
    }
}
