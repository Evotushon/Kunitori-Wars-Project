package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzati {
    private final zzast zzdpe;
    private final Context zzyz;

    public zzati(Context context, String str) {
        this.zzyz = context.getApplicationContext();
        this.zzdpe = zzvh.zzpa().zzc(context, str, new zzall());
    }

    public final void zza(zzxr zzxr, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            this.zzdpe.zza(zzui.zza(this.zzyz, zzxr), (zzatb) new zzatl(rewardedAdLoadCallback));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final String getMediationAdapterClassName() {
        try {
            return this.zzdpe.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            return "";
        }
    }

    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            this.zzdpe.zza(new zzato(serverSideVerificationOptions));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zzdpe.zza((zzwy) new zzyu(onAdMetadataChangedListener));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final Bundle getAdMetadata() {
        try {
            return this.zzdpe.getAdMetadata();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            return new Bundle();
        }
    }

    public final boolean isLoaded() {
        try {
            return this.zzdpe.isLoaded();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final void show(Activity activity, RewardedAdCallback rewardedAdCallback) {
        try {
            this.zzdpe.zza((zzasy) new zzatk(rewardedAdCallback));
            this.zzdpe.zzh(ObjectWrapper.wrap(activity));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void show(Activity activity, RewardedAdCallback rewardedAdCallback, boolean z) {
        try {
            this.zzdpe.zza((zzasy) new zzatk(rewardedAdCallback));
            this.zzdpe.zza(ObjectWrapper.wrap(activity), z);
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    @Nullable
    public final RewardItem getRewardItem() {
        try {
            zzass zzqc = this.zzdpe.zzqc();
            if (zzqc == null) {
                return null;
            }
            return new zzath(zzqc);
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Nullable
    public final ResponseInfo getResponseInfo() {
        zzxe zzxe;
        try {
            zzxe = this.zzdpe.zzkg();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            zzxe = null;
        }
        return ResponseInfo.zza(zzxe);
    }

    public final void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        try {
            this.zzdpe.zza((zzxd) new zzyx(onPaidEventListener));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }
}
