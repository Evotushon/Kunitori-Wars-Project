package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbyz {
    private Bundle extras;
    private zzacj zzcwu;
    private List<zzyc> zzcxj = Collections.emptyList();
    private List<?> zzejt;
    private double zzejw;
    private float zzeki;
    @Nullable
    private IObjectWrapper zzfhh;
    private int zzfpb;
    private zzxj zzfpc;
    private View zzfpd;
    private zzyc zzfpe;
    private zzbdv zzfpf;
    @Nullable
    private zzbdv zzfpg;
    private View zzfph;
    private IObjectWrapper zzfpi;
    private zzacr zzfpj;
    private zzacr zzfpk;
    private String zzfpl;
    private SimpleArrayMap<String, zzacd> zzfpm = new SimpleArrayMap<>();
    private SimpleArrayMap<String, String> zzfpn = new SimpleArrayMap<>();
    @Nullable
    private String zzfpo;

    public final synchronized void zzdj(int i) {
        this.zzfpb = i;
    }

    public final synchronized void zzb(zzxj zzxj) {
        this.zzfpc = zzxj;
    }

    public final synchronized void zza(zzacj zzacj) {
        this.zzcwu = zzacj;
    }

    public final synchronized void setImages(List<zzacd> list) {
        this.zzejt = list;
    }

    public final synchronized void zzg(List<zzyc> list) {
        this.zzcxj = list;
    }

    public final synchronized void zza(@Nullable zzyc zzyc) {
        this.zzfpe = zzyc;
    }

    public final synchronized void zzab(View view) {
        this.zzfph = view;
    }

    public final synchronized void setStarRating(double d) {
        this.zzejw = d;
    }

    public final synchronized void zza(zzacr zzacr) {
        this.zzfpj = zzacr;
    }

    public final synchronized void zzb(zzacr zzacr) {
        this.zzfpk = zzacr;
    }

    public final synchronized void zzfx(String str) {
        this.zzfpl = str;
    }

    public final synchronized void zzi(zzbdv zzbdv) {
        this.zzfpf = zzbdv;
    }

    public final synchronized void zzj(zzbdv zzbdv) {
        this.zzfpg = zzbdv;
    }

    public final synchronized void zzas(IObjectWrapper iObjectWrapper) {
        this.zzfhh = iObjectWrapper;
    }

    public final synchronized void zzn(String str, String str2) {
        if (str2 == null) {
            this.zzfpn.remove(str);
        } else {
            this.zzfpn.put(str, str2);
        }
    }

    public final synchronized void zza(String str, zzacd zzacd) {
        if (zzacd == null) {
            this.zzfpm.remove(str);
        } else {
            this.zzfpm.put(str, zzacd);
        }
    }

    private final synchronized void setMediaContentAspectRatio(float f) {
        this.zzeki = f;
    }

    public final synchronized void zzfy(@Nullable String str) {
        this.zzfpo = str;
    }

    private final synchronized String zzfz(String str) {
        return this.zzfpn.get(str);
    }

    public final synchronized int zzake() {
        return this.zzfpb;
    }

    public final synchronized zzxj getVideoController() {
        return this.zzfpc;
    }

    public final synchronized zzacj zzrl() {
        return this.zzcwu;
    }

    public final synchronized View zzakf() {
        return this.zzfpd;
    }

    public final synchronized String getHeadline() {
        return zzfz("headline");
    }

    public final synchronized List<?> getImages() {
        return this.zzejt;
    }

    @Nullable
    public final zzacr zzakg() {
        List<?> list = this.zzejt;
        if (!(list == null || list.size() == 0)) {
            Object obj = this.zzejt.get(0);
            if (obj instanceof IBinder) {
                return zzacq.zzo((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized List<zzyc> getMuteThisAdReasons() {
        return this.zzcxj;
    }

    @Nullable
    public final synchronized zzyc zzakh() {
        return this.zzfpe;
    }

    public final synchronized String getBody() {
        return zzfz("body");
    }

    public final synchronized Bundle getExtras() {
        if (this.extras == null) {
            this.extras = new Bundle();
        }
        return this.extras;
    }

    public final synchronized String getCallToAction() {
        return zzfz("call_to_action");
    }

    public final synchronized View zzaki() {
        return this.zzfph;
    }

    public final synchronized IObjectWrapper zzrm() {
        return this.zzfpi;
    }

    public final synchronized String getStore() {
        return zzfz("store");
    }

    public final synchronized String getPrice() {
        return zzfz(FirebaseAnalytics.Param.PRICE);
    }

    public final synchronized double getStarRating() {
        return this.zzejw;
    }

    public final synchronized zzacr zzrk() {
        return this.zzfpj;
    }

    public final synchronized String getAdvertiser() {
        return zzfz("advertiser");
    }

    public final synchronized zzacr zzrn() {
        return this.zzfpk;
    }

    public final synchronized String getCustomTemplateId() {
        return this.zzfpl;
    }

    public final synchronized zzbdv zzakj() {
        return this.zzfpf;
    }

    @Nullable
    public final synchronized zzbdv zzakk() {
        return this.zzfpg;
    }

    @Nullable
    public final synchronized IObjectWrapper zzakl() {
        return this.zzfhh;
    }

    public final synchronized SimpleArrayMap<String, zzacd> zzakm() {
        return this.zzfpm;
    }

    public final synchronized float getMediaContentAspectRatio() {
        return this.zzeki;
    }

    @Nullable
    public final synchronized String zzakn() {
        return this.zzfpo;
    }

    public final synchronized SimpleArrayMap<String, String> zzako() {
        return this.zzfpn;
    }

    public final synchronized void destroy() {
        if (this.zzfpf != null) {
            this.zzfpf.destroy();
            this.zzfpf = null;
        }
        if (this.zzfpg != null) {
            this.zzfpg.destroy();
            this.zzfpg = null;
        }
        this.zzfhh = null;
        this.zzfpm.clear();
        this.zzfpn.clear();
        this.zzfpc = null;
        this.zzcwu = null;
        this.zzfpd = null;
        this.zzejt = null;
        this.extras = null;
        this.zzfph = null;
        this.zzfpi = null;
        this.zzfpj = null;
        this.zzfpk = null;
        this.zzfpl = null;
    }

    public static zzbyz zza(zzaly zzaly) {
        try {
            zzbyw zza = zza(zzaly.getVideoController(), (zzamd) null);
            zzacj zzrl = zzaly.zzrl();
            String headline = zzaly.getHeadline();
            List<?> images = zzaly.getImages();
            String body = zzaly.getBody();
            Bundle extras2 = zzaly.getExtras();
            String callToAction = zzaly.getCallToAction();
            IObjectWrapper zzrm = zzaly.zzrm();
            String advertiser = zzaly.getAdvertiser();
            zzacr zzrn = zzaly.zzrn();
            zzbyz zzbyz = new zzbyz();
            zzbyz.zzfpb = 1;
            zzbyz.zzfpc = zza;
            zzbyz.zzcwu = zzrl;
            zzbyz.zzfpd = (View) zzat(zzaly.zzsz());
            zzbyz.zzn("headline", headline);
            zzbyz.zzejt = images;
            zzbyz.zzn("body", body);
            zzbyz.extras = extras2;
            zzbyz.zzn("call_to_action", callToAction);
            zzbyz.zzfph = (View) zzat(zzaly.zzta());
            zzbyz.zzfpi = zzrm;
            zzbyz.zzn("advertiser", advertiser);
            zzbyz.zzfpk = zzrn;
            return zzbyz;
        } catch (RemoteException e) {
            zzawf.zzd("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzbyz zza(zzalx zzalx) {
        try {
            zzbyw zza = zza(zzalx.getVideoController(), (zzamd) null);
            zzacj zzrl = zzalx.zzrl();
            String headline = zzalx.getHeadline();
            List<?> images = zzalx.getImages();
            String body = zzalx.getBody();
            Bundle extras2 = zzalx.getExtras();
            String callToAction = zzalx.getCallToAction();
            IObjectWrapper zzrm = zzalx.zzrm();
            String store = zzalx.getStore();
            String price = zzalx.getPrice();
            double starRating = zzalx.getStarRating();
            zzacr zzrk = zzalx.zzrk();
            zzbyz zzbyz = new zzbyz();
            zzbyz.zzfpb = 2;
            zzbyz.zzfpc = zza;
            zzbyz.zzcwu = zzrl;
            zzbyz.zzfpd = (View) zzat(zzalx.zzsz());
            zzbyz.zzn("headline", headline);
            zzbyz.zzejt = images;
            zzbyz.zzn("body", body);
            zzbyz.extras = extras2;
            zzbyz.zzn("call_to_action", callToAction);
            zzbyz.zzfph = (View) zzat(zzalx.zzta());
            zzbyz.zzfpi = zzrm;
            zzbyz.zzn("store", store);
            zzbyz.zzn(FirebaseAnalytics.Param.PRICE, price);
            zzbyz.zzejw = starRating;
            zzbyz.zzfpj = zzrk;
            return zzbyz;
        } catch (RemoteException e) {
            zzawf.zzd("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzbyz zzb(zzamd zzamd) {
        try {
            return zza(zza(zzamd.getVideoController(), zzamd), zzamd.zzrl(), (View) zzat(zzamd.zzsz()), zzamd.getHeadline(), zzamd.getImages(), zzamd.getBody(), zzamd.getExtras(), zzamd.getCallToAction(), (View) zzat(zzamd.zzta()), zzamd.zzrm(), zzamd.getStore(), zzamd.getPrice(), zzamd.getStarRating(), zzamd.zzrk(), zzamd.getAdvertiser(), zzamd.getMediaContentAspectRatio());
        } catch (RemoteException e) {
            zzawf.zzd("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public static zzbyz zzb(zzalx zzalx) {
        try {
            return zza(zza(zzalx.getVideoController(), (zzamd) null), zzalx.zzrl(), (View) zzat(zzalx.zzsz()), zzalx.getHeadline(), zzalx.getImages(), zzalx.getBody(), zzalx.getExtras(), zzalx.getCallToAction(), (View) zzat(zzalx.zzta()), zzalx.zzrm(), zzalx.getStore(), zzalx.getPrice(), zzalx.getStarRating(), zzalx.zzrk(), (String) null, 0.0f);
        } catch (RemoteException e) {
            zzawf.zzd("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzbyz zzb(zzaly zzaly) {
        try {
            return zza(zza(zzaly.getVideoController(), (zzamd) null), zzaly.zzrl(), (View) zzat(zzaly.zzsz()), zzaly.getHeadline(), zzaly.getImages(), zzaly.getBody(), zzaly.getExtras(), zzaly.getCallToAction(), (View) zzat(zzaly.zzta()), zzaly.zzrm(), (String) null, (String) null, -1.0d, zzaly.zzrn(), zzaly.getAdvertiser(), 0.0f);
        } catch (RemoteException e) {
            zzawf.zzd("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzbyz zza(zzxj zzxj, zzacj zzacj, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzacr zzacr, String str6, float f) {
        zzbyz zzbyz = new zzbyz();
        zzbyz.zzfpb = 6;
        zzbyz.zzfpc = zzxj;
        zzbyz.zzcwu = zzacj;
        zzbyz.zzfpd = view;
        String str7 = str;
        zzbyz.zzn("headline", str);
        zzbyz.zzejt = list;
        String str8 = str2;
        zzbyz.zzn("body", str2);
        zzbyz.extras = bundle;
        String str9 = str3;
        zzbyz.zzn("call_to_action", str3);
        zzbyz.zzfph = view2;
        zzbyz.zzfpi = iObjectWrapper;
        String str10 = str4;
        zzbyz.zzn("store", str4);
        String str11 = str5;
        zzbyz.zzn(FirebaseAnalytics.Param.PRICE, str5);
        zzbyz.zzejw = d;
        zzbyz.zzfpj = zzacr;
        zzbyz.zzn("advertiser", str6);
        zzbyz.setMediaContentAspectRatio(f);
        return zzbyz;
    }

    private static <T> T zzat(@Nullable IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    private static zzbyw zza(zzxj zzxj, @Nullable zzamd zzamd) {
        if (zzxj == null) {
            return null;
        }
        return new zzbyw(zzxj, zzamd);
    }
}
