package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzrn extends AppOpenAd {
    private final zzrg zzbrg;

    public zzrn(zzrg zzrg) {
        this.zzbrg = zzrg;
    }

    /* access modifiers changed from: protected */
    public final zzvx zzdr() {
        try {
            return this.zzbrg.zzdr();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void zza(zzrm zzrm) {
        try {
            this.zzbrg.zza(zzrm);
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }
}
