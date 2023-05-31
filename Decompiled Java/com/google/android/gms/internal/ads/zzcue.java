package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcue implements zzcyb<Bundle> {
    private final zzur zzgif;

    public zzcue(zzur zzur) {
        this.zzgif = zzur;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzur zzur = this.zzgif;
        if (zzur == null) {
            return;
        }
        if (zzur.orientation == 1) {
            bundle.putString("avo", "p");
        } else if (this.zzgif.orientation == 2) {
            bundle.putString("avo", "l");
        }
    }
}
