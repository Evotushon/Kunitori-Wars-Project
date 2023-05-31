package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzatp extends zzasr {
    private final String type;
    private final int zzdot;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzatp(@Nullable zzasq zzasq) {
        this(zzasq != null ? zzasq.type : "", zzasq != null ? zzasq.zzdot : 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzatp(@Nullable RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    public zzatp(String str, int i) {
        this.type = str;
        this.zzdot = i;
    }

    public final String getType() throws RemoteException {
        return this.type;
    }

    public final int getAmount() throws RemoteException {
        return this.zzdot;
    }
}
