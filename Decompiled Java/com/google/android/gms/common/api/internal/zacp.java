package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zap;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zacp extends zap {
    private final /* synthetic */ zacn zaku;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zacp(zacn zacn, Looper looper) {
        super(looper);
        this.zaku = zacn;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            PendingResult pendingResult = (PendingResult) message.obj;
            synchronized (this.zaku.zads) {
                if (pendingResult == null) {
                    this.zaku.zakw.zad(new Status(13, "Transform returned null"));
                } else if (pendingResult instanceof zacc) {
                    this.zaku.zakw.zad(((zacc) pendingResult).getStatus());
                } else {
                    this.zaku.zakw.zaa(pendingResult);
                }
            }
        } else if (i != 1) {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(70);
            sb.append("TransformationResultHandler received unknown message type: ");
            sb.append(i2);
            Log.e("TransformedResultImpl", sb.toString());
        } else {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            String valueOf = String.valueOf(runtimeException.getMessage());
            Log.e("TransformedResultImpl", valueOf.length() != 0 ? "Runtime exception on the transformation worker thread: ".concat(valueOf) : new String("Runtime exception on the transformation worker thread: "));
            throw runtimeException;
        }
    }
}
