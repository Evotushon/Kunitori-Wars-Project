package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import com.google.firebase.messaging.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcib extends zzaha {
    private final /* synthetic */ zzcho zzfxe;
    private final /* synthetic */ Object zzfxh;
    private final /* synthetic */ String zzfxi;
    private final /* synthetic */ long zzfxj;
    private final /* synthetic */ zzazy zzfxk;

    zzcib(zzcho zzcho, Object obj, String str, long j, zzazy zzazy) {
        this.zzfxe = zzcho;
        this.zzfxh = obj;
        this.zzfxi = str;
        this.zzfxj = j;
        this.zzfxk = zzazy;
    }

    public final void onInitializationSucceeded() {
        synchronized (this.zzfxh) {
            this.zzfxe.zza(this.zzfxi, true, "", (int) (zzq.zzlc().elapsedRealtime() - this.zzfxj));
            this.zzfxe.zzfwt.zzgf(this.zzfxi);
            this.zzfxk.set(true);
        }
    }

    public final void onInitializationFailed(String str) {
        synchronized (this.zzfxh) {
            this.zzfxe.zza(this.zzfxi, false, str, (int) (zzq.zzlc().elapsedRealtime() - this.zzfxj));
            this.zzfxe.zzfwt.zzq(this.zzfxi, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.zzfxk.set(false);
        }
    }
}
