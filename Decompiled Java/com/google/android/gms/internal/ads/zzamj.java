package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzamj implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {
    private final /* synthetic */ zzalq zzdet;
    private final /* synthetic */ Adapter zzdeu;
    private final /* synthetic */ zzamg zzdev;

    zzamj(zzamg zzamg, zzalq zzalq, Adapter adapter) {
        this.zzdev = zzamg;
        this.zzdet = zzalq;
        this.zzdeu = adapter;
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final MediationRewardedAdCallback onSuccess(MediationRewardedAd mediationRewardedAd) {
        try {
            MediationRewardedAd unused = this.zzdev.zzdep = mediationRewardedAd;
            this.zzdet.onAdLoaded();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
        return new zzatq(this.zzdet);
    }

    public final void onFailure(String str) {
        try {
            String canonicalName = this.zzdeu.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(str).length());
            sb.append(canonicalName);
            sb.append("failed to loaded medation ad: ");
            sb.append(str);
            zzazh.zzeb(sb.toString());
            this.zzdet.onAdFailedToLoad(0);
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }
}
