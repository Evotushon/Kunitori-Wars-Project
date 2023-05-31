package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzchz implements zzdnu<String> {
    final /* synthetic */ zzcho zzfxe;

    zzchz(zzcho zzcho) {
        this.zzfxe = zzcho;
    }

    public final void zzb(Throwable th) {
        synchronized (this) {
            boolean unused = this.zzfxe.zzfwo = true;
            this.zzfxe.zza("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (zzq.zzlc().elapsedRealtime() - this.zzfxe.zzfwp));
            this.zzfxe.zzfwq.setException(new Exception());
        }
    }

    public final /* synthetic */ void onSuccess(@Nullable Object obj) {
        String str = (String) obj;
        synchronized (this) {
            boolean unused = this.zzfxe.zzfwo = true;
            this.zzfxe.zza("com.google.android.gms.ads.MobileAds", true, "", (int) (zzq.zzlc().elapsedRealtime() - this.zzfxe.zzfwp));
            this.zzfxe.executor.execute(new zzchy(this, str));
        }
    }
}
