package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzxu {
    private static final Object lock = new Object();
    @GuardedBy("lock")
    private static zzxu zzcfk;
    private zzwn zzcfl;
    private RewardedVideoAd zzcfm;
    @NonNull
    private RequestConfiguration zzcfn = new RequestConfiguration.Builder().build();
    private InitializationStatus zzcfo;

    private zzxu() {
    }

    public static zzxu zzpy() {
        zzxu zzxu;
        synchronized (lock) {
            if (zzcfk == null) {
                zzcfk = new zzxu();
            }
            zzxu = zzcfk;
        }
        return zzxu;
    }

    public final void zza(Context context, String str, zzyd zzyd, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (lock) {
            if (this.zzcfl == null) {
                if (context != null) {
                    try {
                        zzalc.zzso().zzc(context, str);
                        this.zzcfl = (zzwn) new zzva(zzvh.zzpa(), context).zzd(context, false);
                        if (onInitializationCompleteListener != null) {
                            this.zzcfl.zza((zzahc) new zzyb(this, onInitializationCompleteListener, (zzxy) null));
                        }
                        this.zzcfl.zza((zzalk) new zzall());
                        this.zzcfl.initialize();
                        this.zzcfl.zza(str, ObjectWrapper.wrap(new zzxx(this, context)));
                        if (!(this.zzcfn.getTagForChildDirectedTreatment() == -1 && this.zzcfn.getTagForUnderAgeOfConsent() == -1)) {
                            zza(this.zzcfn);
                        }
                        zzzx.initialize(context);
                        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcpj)).booleanValue() && !zzpz()) {
                            zzazh.zzey("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
                            this.zzcfo = new zzxz(this);
                            if (onInitializationCompleteListener != null) {
                                zzayx.zzyy.post(new zzxw(this, onInitializationCompleteListener));
                            }
                        }
                    } catch (RemoteException e) {
                        zzazh.zzd("MobileAdsSettingManager initialization failed", e);
                    }
                } else {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
            }
        }
    }

    public final RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        synchronized (lock) {
            if (this.zzcfm != null) {
                RewardedVideoAd rewardedVideoAd = this.zzcfm;
                return rewardedVideoAd;
            }
            this.zzcfm = new zzasj(context, (zzary) new zzvf(zzvh.zzpa(), context, new zzall()).zzd(context, false));
            RewardedVideoAd rewardedVideoAd2 = this.zzcfm;
            return rewardedVideoAd2;
        }
    }

    public final void setAppVolume(float f) {
        boolean z = true;
        Preconditions.checkArgument(0.0f <= f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        if (this.zzcfl == null) {
            z = false;
        }
        Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
        try {
            this.zzcfl.setAppVolume(f);
        } catch (RemoteException e) {
            zzazh.zzc("Unable to set app volume.", e);
        }
    }

    public final float zzpj() {
        zzwn zzwn = this.zzcfl;
        if (zzwn == null) {
            return 1.0f;
        }
        try {
            return zzwn.zzpj();
        } catch (RemoteException e) {
            zzazh.zzc("Unable to get app volume.", e);
            return 1.0f;
        }
    }

    public final void setAppMuted(boolean z) {
        Preconditions.checkState(this.zzcfl != null, "MobileAds.initialize() must be called prior to setting app muted state.");
        try {
            this.zzcfl.setAppMuted(z);
        } catch (RemoteException e) {
            zzazh.zzc("Unable to set app mute state.", e);
        }
    }

    public final boolean zzpk() {
        zzwn zzwn = this.zzcfl;
        if (zzwn == null) {
            return false;
        }
        try {
            return zzwn.zzpk();
        } catch (RemoteException e) {
            zzazh.zzc("Unable to get app mute state.", e);
            return false;
        }
    }

    public final void openDebugMenu(Context context, String str) {
        Preconditions.checkState(this.zzcfl != null, "MobileAds.initialize() must be called prior to opening debug menu.");
        try {
            this.zzcfl.zzb(ObjectWrapper.wrap(context), str);
        } catch (RemoteException e) {
            zzazh.zzc("Unable to open debug menu.", e);
        }
    }

    public final String getVersionString() {
        Preconditions.checkState(this.zzcfl != null, "MobileAds.initialize() must be called prior to getting version string.");
        try {
            return this.zzcfl.getVersionString();
        } catch (RemoteException e) {
            zzazh.zzc("Unable to get version string.", e);
            return "";
        }
    }

    public final void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        try {
            this.zzcfl.zzcf(cls.getCanonicalName());
        } catch (RemoteException e) {
            zzazh.zzc("Unable to register RtbAdapter", e);
        }
    }

    public final InitializationStatus getInitializationStatus() {
        Preconditions.checkState(this.zzcfl != null, "MobileAds.initialize() must be called prior to getting initialization status.");
        try {
            if (this.zzcfo != null) {
                return this.zzcfo;
            }
            return zzc(this.zzcfl.zzpl());
        } catch (RemoteException unused) {
            zzazh.zzey("Unable to get Initialization status.");
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static InitializationStatus zzc(List<zzagz> list) {
        HashMap hashMap = new HashMap();
        for (zzagz next : list) {
            hashMap.put(next.zzczf, new zzahh(next.zzczg ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, next.description, next.zzczh));
        }
        return new zzahg(hashMap);
    }

    @NonNull
    public final RequestConfiguration getRequestConfiguration() {
        return this.zzcfn;
    }

    public final void setRequestConfiguration(@NonNull RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        RequestConfiguration requestConfiguration2 = this.zzcfn;
        this.zzcfn = requestConfiguration;
        if (this.zzcfl != null) {
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                zza(requestConfiguration);
            }
        }
    }

    private final void zza(@NonNull RequestConfiguration requestConfiguration) {
        try {
            this.zzcfl.zza(new zzyw(requestConfiguration));
        } catch (RemoteException e) {
            zzazh.zzc("Unable to set request configuration parcel.", e);
        }
    }

    private final boolean zzpz() throws RemoteException {
        try {
            return this.zzcfl.getVersionString().endsWith("0");
        } catch (RemoteException unused) {
            zzazh.zzey("Unable to get version string.");
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(OnInitializationCompleteListener onInitializationCompleteListener) {
        onInitializationCompleteListener.onInitializationComplete(this.zzcfo);
    }
}
