package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzgt extends zzdkp {
    private final /* synthetic */ zzgq zzaep;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgt(zzgq zzgq, Looper looper) {
        super(looper);
        this.zzaep = zzgq;
    }

    public final void handleMessage(Message message) {
        this.zzaep.zza(message);
    }
}
