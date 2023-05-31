package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzamg extends zzalo {
    private final Object zzdel;
    private zzaml zzdem;
    private zzasm zzden;
    private IObjectWrapper zzdeo;
    /* access modifiers changed from: private */
    public MediationRewardedAd zzdep;

    public zzamg(@NonNull MediationAdapter mediationAdapter) {
        this.zzdel = mediationAdapter;
    }

    public zzamg(@NonNull Adapter adapter) {
        this.zzdel = adapter;
    }

    public final IObjectWrapper zzsp() throws RemoteException {
        Object obj = this.zzdel;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                zzazh.zzc("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdel.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzazh.zzfa(sb.toString());
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzuk zzuk, zzuh zzuh, String str, zzalq zzalq) throws RemoteException {
        zza(iObjectWrapper, zzuk, zzuh, str, (String) null, zzalq);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzuk zzuk, zzuh zzuh, String str, String str2, zzalq zzalq) throws RemoteException {
        Date date;
        AdSize zza;
        zzuk zzuk2 = zzuk;
        zzuh zzuh2 = zzuh;
        String str3 = str;
        if (this.zzdel instanceof MediationBannerAdapter) {
            zzazh.zzeb("Requesting banner ad from adapter.");
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.zzdel;
                Bundle bundle = null;
                HashSet hashSet = zzuh2.zzcco != null ? new HashSet(zzuh2.zzcco) : null;
                if (zzuh2.zzccm == -1) {
                    date = null;
                } else {
                    date = new Date(zzuh2.zzccm);
                }
                zzamh zzamh = new zzamh(date, zzuh2.zzccn, hashSet, zzuh2.zzmk, zzc(zzuh), zzuh2.zzabv, zzuh2.zzccy, zzuh2.zzabw, zza(str3, zzuh2));
                if (zzuh2.zzcct != null) {
                    bundle = zzuh2.zzcct.getBundle(mediationBannerAdapter.getClass().getName());
                }
                Bundle bundle2 = bundle;
                if (zzuk2.zzcdj) {
                    zza = zzb.zza(zzuk2.width, zzuk2.height);
                } else {
                    zza = zzb.zza(zzuk2.width, zzuk2.height, zzuk2.zzabk);
                }
                mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzaml(zzalq), zza(str3, zzuh2, str2), zza, zzamh, bundle2);
            } catch (Throwable th) {
                zzazh.zzc("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdel.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzazh.zzfa(sb.toString());
            throw new RemoteException();
        }
    }

    public final Bundle zzss() {
        Object obj = this.zzdel;
        if (obj instanceof zzbgj) {
            return ((zzbgj) obj).zzss();
        }
        String canonicalName = zzbgj.class.getCanonicalName();
        String canonicalName2 = this.zzdel.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzazh.zzfa(sb.toString());
        return new Bundle();
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzuh zzuh, String str, zzalq zzalq) throws RemoteException {
        zza(iObjectWrapper, zzuh, str, (String) null, zzalq);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzuh zzuh, String str, String str2, zzalq zzalq) throws RemoteException {
        Date date;
        zzuh zzuh2 = zzuh;
        String str3 = str;
        if (this.zzdel instanceof MediationInterstitialAdapter) {
            zzazh.zzeb("Requesting interstitial ad from adapter.");
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.zzdel;
                Bundle bundle = null;
                HashSet hashSet = zzuh2.zzcco != null ? new HashSet(zzuh2.zzcco) : null;
                if (zzuh2.zzccm == -1) {
                    date = null;
                } else {
                    date = new Date(zzuh2.zzccm);
                }
                zzamh zzamh = new zzamh(date, zzuh2.zzccn, hashSet, zzuh2.zzmk, zzc(zzuh), zzuh2.zzabv, zzuh2.zzccy, zzuh2.zzabw, zza(str3, zzuh2));
                if (zzuh2.zzcct != null) {
                    bundle = zzuh2.zzcct.getBundle(mediationInterstitialAdapter.getClass().getName());
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzaml(zzalq), zza(str3, zzuh2, str2), zzamh, bundle);
            } catch (Throwable th) {
                zzazh.zzc("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdel.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzazh.zzfa(sb.toString());
            throw new RemoteException();
        }
    }

    public final Bundle getInterstitialAdapterInfo() {
        Object obj = this.zzdel;
        if (obj instanceof zzbgl) {
            return ((zzbgl) obj).getInterstitialAdapterInfo();
        }
        String canonicalName = zzbgl.class.getCanonicalName();
        String canonicalName2 = this.zzdel.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzazh.zzfa(sb.toString());
        return new Bundle();
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzuh zzuh, String str, String str2, zzalq zzalq, zzach zzach, List<String> list) throws RemoteException {
        Date date;
        zzuh zzuh2 = zzuh;
        String str3 = str;
        Object obj = this.zzdel;
        if (obj instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                Bundle bundle = null;
                HashSet hashSet = zzuh2.zzcco != null ? new HashSet(zzuh2.zzcco) : null;
                if (zzuh2.zzccm == -1) {
                    date = null;
                } else {
                    date = new Date(zzuh2.zzccm);
                }
                zzamp zzamp = new zzamp(date, zzuh2.zzccn, hashSet, zzuh2.zzmk, zzc(zzuh), zzuh2.zzabv, zzach, list, zzuh2.zzccy, zzuh2.zzabw, zza(str3, zzuh2));
                if (zzuh2.zzcct != null) {
                    bundle = zzuh2.zzcct.getBundle(mediationNativeAdapter.getClass().getName());
                }
                this.zzdem = new zzaml(zzalq);
                mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzdem, zza(str3, zzuh2, str2), zzamp, bundle);
            } catch (Throwable th) {
                zzazh.zzc("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdel.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzazh.zzfa(sb.toString());
            throw new RemoteException();
        }
    }

    public final Bundle zzst() {
        return new Bundle();
    }

    public final zzalx zzsq() {
        NativeAdMapper zztb = this.zzdem.zztb();
        if (zztb instanceof NativeAppInstallAdMapper) {
            return new zzamn((NativeAppInstallAdMapper) zztb);
        }
        return null;
    }

    public final zzamd zzsw() {
        UnifiedNativeAdMapper zztc = this.zzdem.zztc();
        if (zztc != null) {
            return new zzanf(zztc);
        }
        return null;
    }

    public final zzaly zzsr() {
        NativeAdMapper zztb = this.zzdem.zztb();
        if (zztb instanceof NativeContentAdMapper) {
            return new zzamm((NativeContentAdMapper) zztb);
        }
        return null;
    }

    public final zzadn zzsv() {
        NativeCustomTemplateAd zztd = this.zzdem.zztd();
        if (zztd instanceof zzado) {
            return ((zzado) zztd).zzrs();
        }
        return null;
    }

    public final boolean zzsu() {
        return this.zzdel instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzuh zzuh, String str, zzasm zzasm, String str2) throws RemoteException {
        Bundle bundle;
        zzamh zzamh;
        Date date;
        zzuh zzuh2 = zzuh;
        zzasm zzasm2 = zzasm;
        String str3 = str2;
        Object obj = this.zzdel;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzazh.zzeb("Initialize rewarded video adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.zzdel;
                Bundle zza = zza(str3, zzuh2, (String) null);
                if (zzuh2 != null) {
                    HashSet hashSet = zzuh2.zzcco != null ? new HashSet(zzuh2.zzcco) : null;
                    if (zzuh2.zzccm == -1) {
                        date = null;
                    } else {
                        date = new Date(zzuh2.zzccm);
                    }
                    zzamh zzamh2 = new zzamh(date, zzuh2.zzccn, hashSet, zzuh2.zzmk, zzc(zzuh), zzuh2.zzabv, zzuh2.zzccy, zzuh2.zzabw, zza(str3, zzuh2));
                    bundle = zzuh2.zzcct != null ? zzuh2.zzcct.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                    zzamh = zzamh2;
                } else {
                    zzamh = null;
                    bundle = null;
                }
                mediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzamh, str, new zzasn(zzasm2), zza, bundle);
            } catch (Throwable th) {
                zzazh.zzc("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            this.zzdeo = iObjectWrapper;
            this.zzden = zzasm2;
            zzasm2.zzaf(ObjectWrapper.wrap(obj));
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zzdel.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzazh.zzfa(sb.toString());
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzasm zzasm, List<String> list) throws RemoteException {
        if (this.zzdel instanceof InitializableMediationRewardedVideoAdAdapter) {
            zzazh.zzeb("Initialize rewarded video adapter.");
            try {
                InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.zzdel;
                ArrayList arrayList = new ArrayList();
                for (String zza : list) {
                    arrayList.add(zza(zza, (zzuh) null, (String) null));
                }
                initializableMediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzasn(zzasm), arrayList);
            } catch (Throwable th) {
                zzazh.zzd("Could not initialize rewarded video adapter.", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = InitializableMediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdel.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzazh.zzfa(sb.toString());
            throw new RemoteException();
        }
    }

    public final void zza(zzuh zzuh, String str) throws RemoteException {
        zza(zzuh, str, (String) null);
    }

    public final void zza(zzuh zzuh, String str, String str2) throws RemoteException {
        Date date;
        zzuh zzuh2 = zzuh;
        String str3 = str;
        Object obj = this.zzdel;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzazh.zzeb("Requesting rewarded video ad from adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.zzdel;
                Bundle bundle = null;
                HashSet hashSet = zzuh2.zzcco != null ? new HashSet(zzuh2.zzcco) : null;
                if (zzuh2.zzccm == -1) {
                    date = null;
                } else {
                    date = new Date(zzuh2.zzccm);
                }
                zzamh zzamh = new zzamh(date, zzuh2.zzccn, hashSet, zzuh2.zzmk, zzc(zzuh), zzuh2.zzabv, zzuh2.zzccy, zzuh2.zzabw, zza(str3, zzuh2));
                if (zzuh2.zzcct != null) {
                    bundle = zzuh2.zzcct.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
                }
                mediationRewardedVideoAdAdapter.loadAd(zzamh, zza(str3, zzuh2, str2), bundle);
            } catch (Throwable th) {
                zzazh.zzc("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            zzb(this.zzdeo, zzuh2, str3, new zzamk((Adapter) obj, this.zzden));
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zzdel.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzazh.zzfa(sb.toString());
            throw new RemoteException();
        }
    }

    public final void showVideo() throws RemoteException {
        Object obj = this.zzdel;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzazh.zzeb("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter) this.zzdel).showVideo();
            } catch (Throwable th) {
                zzazh.zzc("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.zzdep;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(this.zzdeo));
            } else {
                zzazh.zzey("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zzdel.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzazh.zzfa(sb.toString());
            throw new RemoteException();
        }
    }

    public final boolean isInitialized() throws RemoteException {
        Object obj = this.zzdel;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzazh.zzeb("Check if adapter is initialized.");
            try {
                return ((MediationRewardedVideoAdAdapter) this.zzdel).isInitialized();
            } catch (Throwable th) {
                zzazh.zzc("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            return this.zzden != null;
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zzdel.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzazh.zzfa(sb.toString());
            throw new RemoteException();
        }
    }

    public final void zzb(IObjectWrapper iObjectWrapper, zzuh zzuh, String str, zzalq zzalq) throws RemoteException {
        Bundle bundle;
        zzuh zzuh2 = zzuh;
        String str2 = str;
        if (this.zzdel instanceof Adapter) {
            zzazh.zzeb("Requesting rewarded ad from adapter.");
            try {
                Adapter adapter = (Adapter) this.zzdel;
                zzamj zzamj = new zzamj(this, zzalq, adapter);
                Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
                Bundle zza = zza(str2, zzuh2, (String) null);
                if (zzuh2.zzcct == null || (bundle = zzuh2.zzcct.getBundle(this.zzdel.getClass().getName())) == null) {
                    bundle = new Bundle();
                }
                boolean zzc = zzc(zzuh);
                Location location = zzuh2.zzmk;
                int i = zzuh2.zzabv;
                int i2 = zzuh2.zzabw;
                String zza2 = zza(str2, zzuh2);
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration = r5;
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration2 = new MediationRewardedAdConfiguration(context, "", zza, bundle, zzc, location, i, i2, zza2, "");
                adapter.loadRewardedAd(mediationRewardedAdConfiguration, zzamj);
            } catch (Exception e) {
                zzazh.zzc("", e);
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zzdel.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzazh.zzfa(sb.toString());
            throw new RemoteException();
        }
    }

    public final void zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzdel instanceof Adapter) {
            zzazh.zzeb("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.zzdep;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            } else {
                zzazh.zzey("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zzdel.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzazh.zzfa(sb.toString());
            throw new RemoteException();
        }
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
        Object obj = this.zzdel;
        if (!(obj instanceof OnImmersiveModeUpdatedListener)) {
            String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
            String canonicalName2 = this.zzdel.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzazh.zzeb(sb.toString());
            return;
        }
        try {
            ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            zzazh.zzc("", th);
        }
    }

    public final zzxj getVideoController() {
        Object obj = this.zzdel;
        if (!(obj instanceof zza)) {
            return null;
        }
        try {
            return ((zza) obj).getVideoController();
        } catch (Throwable th) {
            zzazh.zzc("", th);
            return null;
        }
    }

    public final void showInterstitial() throws RemoteException {
        if (this.zzdel instanceof MediationInterstitialAdapter) {
            zzazh.zzeb("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.zzdel).showInterstitial();
            } catch (Throwable th) {
                zzazh.zzc("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdel.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzazh.zzfa(sb.toString());
            throw new RemoteException();
        }
    }

    public final void destroy() throws RemoteException {
        Object obj = this.zzdel;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                zzazh.zzc("", th);
                throw new RemoteException();
            }
        }
    }

    public final void pause() throws RemoteException {
        Object obj = this.zzdel;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                zzazh.zzc("", th);
                throw new RemoteException();
            }
        }
    }

    public final void resume() throws RemoteException {
        Object obj = this.zzdel;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                zzazh.zzc("", th);
                throw new RemoteException();
            }
        }
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Object obj = this.zzdel;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzahb zzahb, List<zzahj> list) throws RemoteException {
        AdFormat adFormat;
        if (this.zzdel instanceof Adapter) {
            zzami zzami = new zzami(this, zzahb);
            ArrayList arrayList = new ArrayList();
            for (zzahj next : list) {
                String str = next.zzczk;
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
                    throw new RemoteException();
                }
                arrayList.add(new MediationConfiguration(adFormat, next.extras));
            }
            ((Adapter) this.zzdel).initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzami, arrayList);
            return;
        }
        throw new RemoteException();
    }

    private final Bundle zza(String str, zzuh zzuh, String str2) throws RemoteException {
        Bundle bundle;
        String valueOf = String.valueOf(str);
        zzazh.zzeb(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle2 = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                bundle = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            } else {
                bundle = bundle2;
            }
            if (this.zzdel instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzuh != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzuh.zzabv);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzazh.zzc("", th);
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
}
