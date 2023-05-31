package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbeb implements zzp {
    private zzp zzdit;
    private zzbdv zzege;

    public zzbeb(zzbdv zzbdv, zzp zzp) {
        this.zzege = zzbdv;
        this.zzdit = zzp;
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void zztk() {
        this.zzdit.zztk();
        this.zzege.zztw();
    }

    public final void zztj() {
        this.zzdit.zztj();
        this.zzege.zzzy();
    }
}
