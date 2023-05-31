package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzany implements MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> {
    private final /* synthetic */ zzane zzdfn;
    private final /* synthetic */ zzalq zzdfo;

    zzany(zzanz zzanz, zzane zzane, zzalq zzalq) {
        this.zzdfn = zzane;
        this.zzdfo = zzalq;
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final MediationBannerAdCallback onSuccess(MediationBannerAd mediationBannerAd) {
        if (mediationBannerAd == null) {
            zzazh.zzfa("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zzdfn.zzdm("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzazh.zzc("", e);
                return null;
            }
        } else {
            try {
                this.zzdfn.zzx(ObjectWrapper.wrap(mediationBannerAd.getView()));
            } catch (RemoteException e2) {
                zzazh.zzc("", e2);
            }
            return new zzaof(this.zzdfo);
        }
    }

    public final void onFailure(String str) {
        try {
            this.zzdfn.zzdm(str);
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }
}
