package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzwz implements MuteThisAdReason {
    private final String description;
    private zzwu zzceq;

    public zzwz(zzwu zzwu) {
        String str;
        this.zzceq = zzwu;
        try {
            str = zzwu.getDescription();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            str = null;
        }
        this.description = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final zzwu zzpn() {
        return this.zzceq;
    }

    public final String toString() {
        return this.description;
    }
}
