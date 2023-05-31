package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzaob implements MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> {
    private final /* synthetic */ zzalq zzdfo;
    private final /* synthetic */ zzanz zzdft;
    private final /* synthetic */ zzanj zzdfu;

    zzaob(zzanz zzanz, zzanj zzanj, zzalq zzalq) {
        this.zzdft = zzanz;
        this.zzdfu = zzanj;
        this.zzdfo = zzalq;
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final MediationInterstitialAdCallback onSuccess(MediationInterstitialAd mediationInterstitialAd) {
        if (mediationInterstitialAd == null) {
            zzazh.zzfa("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zzdfu.zzdm("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzazh.zzc("", e);
                return null;
            }
        } else {
            try {
                MediationInterstitialAd unused = this.zzdft.zzdfq = mediationInterstitialAd;
                this.zzdfu.zztg();
            } catch (RemoteException e2) {
                zzazh.zzc("", e2);
            }
            return new zzaof(this.zzdfo);
        }
    }

    public final void onFailure(String str) {
        try {
            this.zzdfu.zzdm(str);
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }
}
