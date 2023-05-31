package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbvk extends zzbtk<VideoController.VideoLifecycleCallbacks> {
    @GuardedBy("this")
    private boolean zzein;

    protected zzbvk(Set<zzbuv<VideoController.VideoLifecycleCallbacks>> set) {
        super(set);
    }

    public final void onVideoPause() {
        zza(zzbvn.zzfkj);
    }

    public final void onVideoEnd() {
        zza(zzbvm.zzfkj);
    }

    public final synchronized void onVideoStart() {
        zza(zzbvp.zzfkj);
        this.zzein = true;
    }

    public final synchronized void onVideoPlay() {
        if (!this.zzein) {
            zza(zzbvo.zzfkj);
            this.zzein = true;
        }
        zza(zzbvr.zzfkj);
    }
}
