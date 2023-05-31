package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzasg implements RewardItem {
    private final zzarr zzdox;

    public zzasg(zzarr zzarr) {
        this.zzdox = zzarr;
    }

    public final String getType() {
        zzarr zzarr = this.zzdox;
        if (zzarr == null) {
            return null;
        }
        try {
            return zzarr.getType();
        } catch (RemoteException e) {
            zzazh.zzd("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    public final int getAmount() {
        zzarr zzarr = this.zzdox;
        if (zzarr == null) {
            return 0;
        }
        try {
            return zzarr.getAmount();
        } catch (RemoteException e) {
            zzazh.zzd("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
