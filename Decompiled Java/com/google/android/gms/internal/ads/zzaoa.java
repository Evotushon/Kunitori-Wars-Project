package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzaoa implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {
    private final /* synthetic */ zzalq zzdfo;
    private final /* synthetic */ zzanp zzdfs;
    private final /* synthetic */ zzanz zzdft;

    zzaoa(zzanz zzanz, zzanp zzanp, zzalq zzalq) {
        this.zzdft = zzanz;
        this.zzdfs = zzanp;
        this.zzdfo = zzalq;
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final MediationRewardedAdCallback onSuccess(MediationRewardedAd mediationRewardedAd) {
        if (mediationRewardedAd == null) {
            zzazh.zzfa("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zzdfs.zzdm("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzazh.zzc("", e);
                return null;
            }
        } else {
            try {
                MediationRewardedAd unused = this.zzdft.zzdep = mediationRewardedAd;
                this.zzdfs.zztg();
            } catch (RemoteException e2) {
                zzazh.zzc("", e2);
            }
            return new zzaof(this.zzdfo);
        }
    }

    public final void onFailure(String str) {
        try {
            this.zzdfs.zzdm(str);
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }
}
