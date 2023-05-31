package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbtj implements Runnable {
    private final Object zzdcl;
    private final zzbtm zzfkv;

    zzbtj(zzbtm zzbtm, Object obj) {
        this.zzfkv = zzbtm;
        this.zzdcl = obj;
    }

    public final void run() {
        try {
            this.zzfkv.zzp(this.zzdcl);
        } catch (Throwable th) {
            zzq.zzkz().zzb(th, "EventEmitter.notify");
            zzawf.zza("Event emitter exception.", th);
        }
    }
}
