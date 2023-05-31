package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzamo<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends zzalo {
    private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> zzdfd;
    private final NETWORK_EXTRAS zzdfe;

    public zzamo(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter, NETWORK_EXTRAS network_extras) {
        this.zzdfd = mediationAdapter;
        this.zzdfe = network_extras;
    }

    public final zzxj getVideoController() {
        return null;
    }

    public final boolean isInitialized() {
        return true;
    }

    public final void setImmersiveMode(boolean z) {
    }

    public final void showVideo() {
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzahb zzahb, List<zzahj> list) throws RemoteException {
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzasm zzasm, List<String> list) {
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzuh zzuh, String str, zzasm zzasm, String str2) throws RemoteException {
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzuh zzuh, String str, String str2, zzalq zzalq, zzach zzach, List<String> list) {
    }

    public final void zza(zzuh zzuh, String str) {
    }

    public final void zza(zzuh zzuh, String str, String str2) {
    }

    public final void zzb(IObjectWrapper iObjectWrapper, zzuh zzuh, String str, zzalq zzalq) throws RemoteException {
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final zzalx zzsq() {
        return null;
    }

    public final zzaly zzsr() {
        return null;
    }

    public final boolean zzsu() {
        return false;
    }

    public final zzadn zzsv() {
        return null;
    }

    public final zzamd zzsw() {
        return null;
    }

    public final void zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final IObjectWrapper zzsp() throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdfd;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzazh.zzfa(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return ObjectWrapper.wrap(((MediationBannerAdapter) mediationAdapter).getBannerView());
        } catch (Throwable th) {
            zzazh.zzc("", th);
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzuk zzuk, zzuh zzuh, String str, zzalq zzalq) throws RemoteException {
        zza(iObjectWrapper, zzuk, zzuh, str, (String) null, zzalq);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzuk zzuk, zzuh zzuh, String str, String str2, zzalq zzalq) throws RemoteException {
        AdSize adSize;
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdfd;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzazh.zzfa(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        zzazh.zzeb("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.zzdfd;
            zzamr zzamr = new zzamr(zzalq);
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
            MediationServerParameters zzdl = zzdl(str);
            int i = 0;
            AdSize[] adSizeArr = {AdSize.SMART_BANNER, AdSize.BANNER, AdSize.IAB_MRECT, AdSize.IAB_BANNER, AdSize.IAB_LEADERBOARD, AdSize.IAB_WIDE_SKYSCRAPER};
            while (true) {
                if (i < 6) {
                    if (adSizeArr[i].getWidth() == zzuk.width && adSizeArr[i].getHeight() == zzuk.height) {
                        adSize = adSizeArr[i];
                        break;
                    }
                    i++;
                } else {
                    adSize = new AdSize(zzb.zza(zzuk.width, zzuk.height, zzuk.zzabk));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(zzamr, activity, zzdl, adSize, zzand.zza(zzuh, zzc(zzuh)), this.zzdfe);
        } catch (Throwable th) {
            zzazh.zzc("", th);
            throw new RemoteException();
        }
    }

    public final Bundle zzss() {
        return new Bundle();
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzuh zzuh, String str, zzalq zzalq) throws RemoteException {
        zza(iObjectWrapper, zzuh, str, (String) null, zzalq);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzuh zzuh, String str, String str2, zzalq zzalq) throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdfd;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzazh.zzfa(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzazh.zzeb("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzdfd).requestInterstitialAd(new zzamr(zzalq), (Activity) ObjectWrapper.unwrap(iObjectWrapper), zzdl(str), zzand.zza(zzuh, zzc(zzuh)), this.zzdfe);
        } catch (Throwable th) {
            zzazh.zzc("", th);
            throw new RemoteException();
        }
    }

    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    public final void showInterstitial() throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdfd;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzazh.zzfa(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzazh.zzeb("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzdfd).showInterstitial();
        } catch (Throwable th) {
            zzazh.zzc("", th);
            throw new RemoteException();
        }
    }

    public final Bundle zzst() {
        return new Bundle();
    }

    public final void destroy() throws RemoteException {
        try {
            this.zzdfd.destroy();
        } catch (Throwable th) {
            zzazh.zzc("", th);
            throw new RemoteException();
        }
    }

    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    public final void resume() throws RemoteException {
        throw new RemoteException();
    }

    private final SERVER_PARAMETERS zzdl(String str) throws RemoteException {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (Throwable th) {
                zzazh.zzc("", th);
                throw new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class<SERVER_PARAMETERS> serverParametersType = this.zzdfd.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS server_parameters = (MediationServerParameters) serverParametersType.newInstance();
        server_parameters.load(hashMap);
        return server_parameters;
    }

    private static boolean zzc(zzuh zzuh) {
        if (zzuh.zzccp) {
            return true;
        }
        zzvh.zzoz();
        return zzayx.zzxi();
    }
}
