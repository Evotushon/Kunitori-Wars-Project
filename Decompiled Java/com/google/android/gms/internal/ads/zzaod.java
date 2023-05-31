package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzaod implements MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> {
    private final /* synthetic */ zzalq zzdfo;
    private final /* synthetic */ zzank zzdfw;

    zzaod(zzanz zzanz, zzank zzank, zzalq zzalq) {
        this.zzdfw = zzank;
        this.zzdfo = zzalq;
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final MediationNativeAdCallback onSuccess(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        if (unifiedNativeAdMapper == null) {
            zzazh.zzfa("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zzdfw.zzdm("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzazh.zzc("", e);
                return null;
            }
        } else {
            try {
                this.zzdfw.zza(new zzanf(unifiedNativeAdMapper));
            } catch (RemoteException e2) {
                zzazh.zzc("", e2);
            }
            return new zzaof(this.zzdfo);
        }
    }

    public final void onFailure(String str) {
        try {
            this.zzdfw.zzdm(str);
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }
}
