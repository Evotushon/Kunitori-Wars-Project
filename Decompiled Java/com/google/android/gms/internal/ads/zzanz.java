package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzanz extends zzant {
    /* access modifiers changed from: private */
    public MediationRewardedAd zzdep;
    private final RtbAdapter zzdfp;
    /* access modifiers changed from: private */
    public MediationInterstitialAd zzdfq;
    private String zzdfr = "";

    public zzanz(RtbAdapter rtbAdapter) {
        this.zzdfp = rtbAdapter;
    }

    public final void zza(String[] strArr, Bundle[] bundleArr) {
    }

    public final void zzy(IObjectWrapper iObjectWrapper) {
    }

    public final void zza(String str, String str2, zzuh zzuh, IObjectWrapper iObjectWrapper, zzane zzane, zzalq zzalq, zzuk zzuk) throws RemoteException {
        zzuh zzuh2 = zzuh;
        zzuk zzuk2 = zzuk;
        try {
            zzany zzany = new zzany(this, zzane, zzalq);
            RtbAdapter rtbAdapter = this.zzdfp;
            Bundle zzdq = zzdq(str2);
            Bundle zzd = zzd(zzuh2);
            boolean zzc = zzc(zzuh);
            Location location = zzuh2.zzmk;
            int i = zzuh2.zzabv;
            int i2 = zzuh2.zzabw;
            String zza = zza(str2, zzuh);
            AdSize zza2 = zzb.zza(zzuk2.width, zzuk2.height, zzuk2.zzabk);
            String str3 = this.zzdfr;
            MediationBannerAdConfiguration mediationBannerAdConfiguration = r5;
            MediationBannerAdConfiguration mediationBannerAdConfiguration2 = new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdq, zzd, zzc, location, i, i2, zza, zza2, str3);
            rtbAdapter.loadBannerAd(mediationBannerAdConfiguration, zzany);
        } catch (Throwable th) {
            zzazh.zzc("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    public final void zza(String str, String str2, zzuh zzuh, IObjectWrapper iObjectWrapper, zzanj zzanj, zzalq zzalq) throws RemoteException {
        zzuh zzuh2 = zzuh;
        try {
            this.zzdfp.loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdq(str2), zzd(zzuh2), zzc(zzuh), zzuh2.zzmk, zzuh2.zzabv, zzuh2.zzabw, zza(str2, zzuh), this.zzdfr), new zzaob(this, zzanj, zzalq));
        } catch (Throwable th) {
            zzazh.zzc("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    public final void zza(String str, String str2, zzuh zzuh, IObjectWrapper iObjectWrapper, zzanp zzanp, zzalq zzalq) throws RemoteException {
        zzuh zzuh2 = zzuh;
        try {
            this.zzdfp.loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdq(str2), zzd(zzuh2), zzc(zzuh), zzuh2.zzmk, zzuh2.zzabv, zzuh2.zzabw, zza(str2, zzuh), this.zzdfr), new zzaoa(this, zzanp, zzalq));
        } catch (Throwable th) {
            zzazh.zzc("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    public final void zza(String str, String str2, zzuh zzuh, IObjectWrapper iObjectWrapper, zzank zzank, zzalq zzalq) throws RemoteException {
        zzuh zzuh2 = zzuh;
        try {
            this.zzdfp.loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdq(str2), zzd(zzuh2), zzc(zzuh), zzuh2.zzmk, zzuh2.zzabv, zzuh2.zzabw, zza(str2, zzuh), this.zzdfr), new zzaod(this, zzank, zzalq));
        } catch (Throwable th) {
            zzazh.zzc("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    public final boolean zzz(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.zzdfq;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzazh.zzc("", th);
            return true;
        }
    }

    public final boolean zzaa(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.zzdep;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzazh.zzc("", th);
            return true;
        }
    }

    public final zzxj getVideoController() {
        RtbAdapter rtbAdapter = this.zzdfp;
        if (!(rtbAdapter instanceof zza)) {
            return null;
        }
        try {
            return ((zza) rtbAdapter).getVideoController();
        } catch (Throwable th) {
            zzazh.zzc("", th);
            return null;
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzuk zzuk, zzanv zzanv) throws RemoteException {
        AdFormat adFormat;
        try {
            zzaoc zzaoc = new zzaoc(this, zzanv);
            RtbAdapter rtbAdapter = this.zzdfp;
            char c = 65535;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c = 3;
                        break;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c = 2;
                        break;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                adFormat = AdFormat.BANNER;
            } else if (c == 1) {
                adFormat = AdFormat.INTERSTITIAL;
            } else if (c == 2) {
                adFormat = AdFormat.REWARDED;
            } else if (c == 3) {
                adFormat = AdFormat.NATIVE;
            } else {
                throw new IllegalArgumentException("Internal Error");
            }
            MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediationConfiguration);
            rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList, bundle, zzb.zza(zzuk.width, zzuk.height, zzuk.zzabk)), zzaoc);
        } catch (Throwable th) {
            zzazh.zzc("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    public final zzaoe zzth() throws RemoteException {
        return zzaoe.zza(this.zzdfp.getVersionInfo());
    }

    public final zzaoe zzti() throws RemoteException {
        return zzaoe.zza(this.zzdfp.getSDKVersionInfo());
    }

    public final void zzdn(String str) {
        this.zzdfr = str;
    }

    private static Bundle zzdq(String str) throws RemoteException {
        String valueOf = String.valueOf(str);
        zzazh.zzfa(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            zzazh.zzc("", e);
            throw new RemoteException();
        }
    }

    private static boolean zzc(zzuh zzuh) {
        if (zzuh.zzccp) {
            return true;
        }
        zzvh.zzoz();
        return zzayx.zzxi();
    }

    @Nullable
    private static String zza(String str, zzuh zzuh) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzuh.zzabx;
        }
    }

    private final Bundle zzd(zzuh zzuh) {
        Bundle bundle;
        if (zzuh.zzcct == null || (bundle = zzuh.zzcct.getBundle(this.zzdfp.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }
}
