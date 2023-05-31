package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbnz implements zzp {
    private final zzbrc zzfil;
    private AtomicBoolean zzfim = new AtomicBoolean(false);

    public zzbnz(zzbrc zzbrc) {
        this.zzfil = zzbrc;
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void zztj() {
        this.zzfim.set(true);
        this.zzfil.onAdClosed();
    }

    public final void zztk() {
        this.zzfil.onAdOpened();
    }

    public final boolean isClosed() {
        return this.zzfim.get();
    }
}
