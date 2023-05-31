package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzsp;
import com.google.android.gms.internal.ads.zzsz;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcfp implements zzbqm, zzbqu, zzbrn, zzbsn, zzbth, zztz {
    private final zzsn zzfvb;
    @GuardedBy("this")
    private boolean zzfvc = false;
    @GuardedBy("this")
    private boolean zzfvd = false;

    public zzcfp(zzsn zzsn, @Nullable zzdcu zzdcu) {
        this.zzfvb = zzsn;
        zzsn.zza(zzsp.zza.C0019zza.AD_REQUEST);
        if (zzdcu != null) {
            zzsn.zza(zzsp.zza.C0019zza.REQUEST_IS_PREFETCH);
        }
    }

    public final void zzd(zzaqx zzaqx) {
    }

    public final void zzb(zzdeq zzdeq) {
        this.zzfvb.zza((zzsq) new zzcfo(zzdeq));
    }

    public final void onAdLoaded() {
        this.zzfvb.zza(zzsp.zza.C0019zza.AD_LOADED);
    }

    public final void onAdFailedToLoad(int i) {
        switch (i) {
            case 1:
                this.zzfvb.zza(zzsp.zza.C0019zza.AD_FAILED_TO_LOAD_INVALID_REQUEST);
                return;
            case 2:
                this.zzfvb.zza(zzsp.zza.C0019zza.AD_FAILED_TO_LOAD_NETWORK_ERROR);
                return;
            case 3:
                this.zzfvb.zza(zzsp.zza.C0019zza.AD_FAILED_TO_LOAD_NO_FILL);
                return;
            case 4:
                this.zzfvb.zza(zzsp.zza.C0019zza.AD_FAILED_TO_LOAD_TIMEOUT);
                return;
            case 5:
                this.zzfvb.zza(zzsp.zza.C0019zza.AD_FAILED_TO_LOAD_CANCELLED);
                return;
            case 6:
                this.zzfvb.zza(zzsp.zza.C0019zza.AD_FAILED_TO_LOAD_NO_ERROR);
                return;
            case 7:
                this.zzfvb.zza(zzsp.zza.C0019zza.AD_FAILED_TO_LOAD_NOT_FOUND);
                return;
            default:
                this.zzfvb.zza(zzsp.zza.C0019zza.AD_FAILED_TO_LOAD);
                return;
        }
    }

    public final synchronized void onAdImpression() {
        this.zzfvb.zza(zzsp.zza.C0019zza.AD_IMPRESSION);
    }

    public final synchronized void onAdClicked() {
        if (!this.zzfvd) {
            this.zzfvb.zza(zzsp.zza.C0019zza.AD_FIRST_CLICK);
            this.zzfvd = true;
            return;
        }
        this.zzfvb.zza(zzsp.zza.C0019zza.AD_SUBSEQUENT_CLICK);
    }

    public final void zza(zzsz.zza zza) {
        this.zzfvb.zza((zzsq) new zzcfr(zza));
        this.zzfvb.zza(zzsp.zza.C0019zza.REQUEST_LOADED_FROM_CACHE);
    }

    public final void zzb(zzsz.zza zza) {
        this.zzfvb.zza((zzsq) new zzcfq(zza));
        this.zzfvb.zza(zzsp.zza.C0019zza.REQUEST_SAVED_TO_CACHE);
    }

    public final void zzc(zzsz.zza zza) {
        this.zzfvb.zza((zzsq) new zzcft(zza));
        this.zzfvb.zza(zzsp.zza.C0019zza.REQUEST_PREFETCH_INTERCEPTED);
    }

    public final void zzbg(boolean z) {
        zzsp.zza.C0019zza zza;
        zzsn zzsn = this.zzfvb;
        if (z) {
            zza = zzsp.zza.C0019zza.REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED;
        } else {
            zza = zzsp.zza.C0019zza.REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED;
        }
        zzsn.zza(zza);
    }

    public final void zzbh(boolean z) {
        zzsp.zza.C0019zza zza;
        zzsn zzsn = this.zzfvb;
        if (z) {
            zza = zzsp.zza.C0019zza.NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED;
        } else {
            zza = zzsp.zza.C0019zza.NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED;
        }
        zzsn.zza(zza);
    }

    public final void zzaig() {
        this.zzfvb.zza(zzsp.zza.C0019zza.REQUEST_FAILED_TO_LOAD_FROM_CACHE);
    }
}
