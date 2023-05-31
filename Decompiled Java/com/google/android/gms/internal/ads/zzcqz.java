package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zze;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcqz implements zze {
    private final zzbuz zzfgf;
    private final zzbqp zzfnf;
    private final zzbqg zzfng;
    private final zzbkb zzfnh;
    private final zzbuu zzfnj;
    private AtomicBoolean zzgep = new AtomicBoolean(false);

    zzcqz(zzbqg zzbqg, zzbqp zzbqp, zzbuz zzbuz, zzbuu zzbuu, zzbkb zzbkb) {
        this.zzfng = zzbqg;
        this.zzfnf = zzbqp;
        this.zzfgf = zzbuz;
        this.zzfnj = zzbuu;
        this.zzfnh = zzbkb;
    }

    public final synchronized void zzg(View view) {
        if (this.zzgep.compareAndSet(false, true)) {
            this.zzfnh.onAdImpression();
            this.zzfnj.zzq(view);
        }
    }

    public final void zzjw() {
        if (this.zzgep.get()) {
            this.zzfng.onAdClicked();
        }
    }

    public final void zzjx() {
        if (this.zzgep.get()) {
            this.zzfnf.onAdImpression();
            this.zzfgf.zzaix();
        }
    }
}
