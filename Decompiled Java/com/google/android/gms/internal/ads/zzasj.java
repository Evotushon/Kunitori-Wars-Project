package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzasj implements RewardedVideoAd {
    private final Object lock = new Object();
    @NonNull
    private final zzary zzdoy;
    private final zzasi zzdoz = new zzasi((RewardedVideoAdListener) null);
    private String zzdpa;
    private String zzdpb;
    private final Context zzur;

    public zzasj(Context context, @Nullable zzary zzary) {
        this.zzdoy = zzary == null ? new zzys() : zzary;
        this.zzur = context.getApplicationContext();
    }

    private final void zza(String str, zzxr zzxr) {
        synchronized (this.lock) {
            if (this.zzdoy != null) {
                try {
                    this.zzdoy.zza(zzui.zza(this.zzur, zzxr, str));
                } catch (RemoteException e) {
                    zzazh.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void loadAd(String str, AdRequest adRequest) {
        zza(str, adRequest.zzdl());
    }

    public final void loadAd(String str, PublisherAdRequest publisherAdRequest) {
        zza(str, publisherAdRequest.zzdl());
    }

    public final void show() {
        synchronized (this.lock) {
            if (this.zzdoy != null) {
                try {
                    this.zzdoy.show();
                } catch (RemoteException e) {
                    zzazh.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        synchronized (this.lock) {
            this.zzdoz.setRewardedVideoAdListener(rewardedVideoAdListener);
            if (this.zzdoy != null) {
                try {
                    this.zzdoy.zza((zzasb) this.zzdoz);
                } catch (RemoteException e) {
                    zzazh.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        synchronized (this.lock) {
            if (this.zzdoy != null) {
                try {
                    this.zzdoy.zza((zzwa) new zzue(adMetadataListener));
                } catch (RemoteException e) {
                    zzazh.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final Bundle getAdMetadata() {
        synchronized (this.lock) {
            if (this.zzdoy != null) {
                try {
                    Bundle adMetadata = this.zzdoy.getAdMetadata();
                    return adMetadata;
                } catch (RemoteException e) {
                    zzazh.zze("#007 Could not call remote method.", e);
                }
            }
            Bundle bundle = new Bundle();
            return bundle;
        }
    }

    public final void setUserId(String str) {
        synchronized (this.lock) {
            this.zzdpa = str;
            if (this.zzdoy != null) {
                try {
                    this.zzdoy.setUserId(str);
                } catch (RemoteException e) {
                    zzazh.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final boolean isLoaded() {
        synchronized (this.lock) {
            if (this.zzdoy == null) {
                return false;
            }
            try {
                boolean isLoaded = this.zzdoy.isLoaded();
                return isLoaded;
            } catch (RemoteException e) {
                zzazh.zze("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    public final void pause() {
        pause((Context) null);
    }

    public final void pause(Context context) {
        synchronized (this.lock) {
            if (this.zzdoy != null) {
                try {
                    this.zzdoy.zzj(ObjectWrapper.wrap(context));
                } catch (RemoteException e) {
                    zzazh.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void resume() {
        resume((Context) null);
    }

    public final void resume(Context context) {
        synchronized (this.lock) {
            if (this.zzdoy != null) {
                try {
                    this.zzdoy.zzk(ObjectWrapper.wrap(context));
                } catch (RemoteException e) {
                    zzazh.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void destroy() {
        destroy((Context) null);
    }

    public final void destroy(Context context) {
        synchronized (this.lock) {
            this.zzdoz.setRewardedVideoAdListener((RewardedVideoAdListener) null);
            if (this.zzdoy != null) {
                try {
                    this.zzdoy.zzl(ObjectWrapper.wrap(context));
                } catch (RemoteException e) {
                    zzazh.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final RewardedVideoAdListener getRewardedVideoAdListener() {
        RewardedVideoAdListener rewardedVideoAdListener;
        synchronized (this.lock) {
            rewardedVideoAdListener = this.zzdoz.getRewardedVideoAdListener();
        }
        return rewardedVideoAdListener;
    }

    public final String getUserId() {
        String str;
        synchronized (this.lock) {
            str = this.zzdpa;
        }
        return str;
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.zzdoy != null) {
                return this.zzdoy.getMediationAdapterClassName();
            }
            return null;
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void setImmersiveMode(boolean z) {
        synchronized (this.lock) {
            if (this.zzdoy != null) {
                try {
                    this.zzdoy.setImmersiveMode(z);
                } catch (RemoteException e) {
                    zzazh.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void setCustomData(String str) {
        synchronized (this.lock) {
            if (this.zzdoy != null) {
                try {
                    this.zzdoy.setCustomData(str);
                    this.zzdpb = str;
                } catch (RemoteException e) {
                    zzazh.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final String getCustomData() {
        String str;
        synchronized (this.lock) {
            str = this.zzdpb;
        }
        return str;
    }

    public final ResponseInfo getResponseInfo() {
        zzxe zzxe = null;
        try {
            if (this.zzdoy != null) {
                zzxe = this.zzdoy.zzkg();
            }
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(zzxe);
    }
}
