package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzath implements RewardItem {
    private final zzass zzdpd;

    public zzath(zzass zzass) {
        this.zzdpd = zzass;
    }

    public final String getType() {
        zzass zzass = this.zzdpd;
        if (zzass == null) {
            return null;
        }
        try {
            return zzass.getType();
        } catch (RemoteException e) {
            zzazh.zzd("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    public final int getAmount() {
        zzass zzass = this.zzdpd;
        if (zzass == null) {
            return 0;
        }
        try {
            return zzass.getAmount();
        } catch (RemoteException e) {
            zzazh.zzd("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
