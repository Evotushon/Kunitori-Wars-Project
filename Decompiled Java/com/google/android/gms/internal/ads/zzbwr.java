package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbwr implements zzp {
    private final zzbrv zzfmd;
    private final zzbur zzfme;

    public zzbwr(zzbrv zzbrv, zzbur zzbur) {
        this.zzfmd = zzbrv;
        this.zzfme = zzbur;
    }

    public final void zztj() {
        this.zzfmd.zztj();
        this.zzfme.onHide();
    }

    public final void onPause() {
        this.zzfmd.onPause();
    }

    public final void onResume() {
        this.zzfmd.onResume();
    }

    public final void zztk() {
        this.zzfmd.zztk();
        this.zzfme.zzaiv();
    }
}
