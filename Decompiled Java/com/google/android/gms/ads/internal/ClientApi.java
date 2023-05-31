package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.ads.internal.overlay.zzs;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzacv;
import com.google.android.gms.internal.ads.zzacy;
import com.google.android.gms.internal.ads.zzalk;
import com.google.android.gms.internal.ads.zzapb;
import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzary;
import com.google.android.gms.internal.ads.zzast;
import com.google.android.gms.internal.ads.zzazo;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcsb;
import com.google.android.gms.internal.ads.zzcsd;
import com.google.android.gms.internal.ads.zzcsi;
import com.google.android.gms.internal.ads.zzuk;
import com.google.android.gms.internal.ads.zzvq;
import com.google.android.gms.internal.ads.zzvx;
import com.google.android.gms.internal.ads.zzwj;
import com.google.android.gms.internal.ads.zzwn;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class ClientApi extends zzwj {
    public final zzwn zzc(IObjectWrapper iObjectWrapper) {
        return null;
    }

    public final zzapq zzd(IObjectWrapper iObjectWrapper) {
        return null;
    }

    public final zzvx zza(IObjectWrapper iObjectWrapper, zzuk zzuk, String str, zzalk zzalk, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzcsd(zzbgk.zza(context, zzalk, i), context, zzuk, str);
    }

    public final zzvx zzb(IObjectWrapper iObjectWrapper, zzuk zzuk, String str, zzalk zzalk, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzcsi(zzbgk.zza(context, zzalk, i), context, zzuk, str);
    }

    public final zzvq zza(IObjectWrapper iObjectWrapper, String str, zzalk zzalk, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzcsb(zzbgk.zza(context, zzalk, i), context, str);
    }

    public final zzacv zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzbzt((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 20089000);
    }

    public final zzary zza(IObjectWrapper iObjectWrapper, zzalk zzalk, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return zzbgk.zza(context, zzalk, i).zzacs().zzbx(context).zzaew().zzafb();
    }

    public final zzapb zzb(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zzc = AdOverlayInfoParcel.zzc(activity.getIntent());
        if (zzc == null) {
            return new zzt(activity);
        }
        int i = zzc.zzdiy;
        if (i == 1) {
            return new zzq(activity);
        }
        if (i == 2) {
            return new zzz(activity);
        }
        if (i == 3) {
            return new zzy(activity);
        }
        if (i != 4) {
            return new zzt(activity);
        }
        return new zzs(activity, zzc);
    }

    public final zzwn zza(IObjectWrapper iObjectWrapper, int i) {
        return zzbgk.zze((Context) ObjectWrapper.unwrap(iObjectWrapper), i).zzacl();
    }

    public final zzvx zza(IObjectWrapper iObjectWrapper, zzuk zzuk, String str, int i) {
        return new zzl((Context) ObjectWrapper.unwrap(iObjectWrapper), zzuk, str, new zzazo(20089000, i, true, false));
    }

    public final zzacy zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzbzq((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    public final zzast zzb(IObjectWrapper iObjectWrapper, String str, zzalk zzalk, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return zzbgk.zza(context, zzalk, i).zzacs().zzbx(context).zzfs(str).zzaew().zzafc();
    }

    public final zzvx zzc(IObjectWrapper iObjectWrapper, zzuk zzuk, String str, zzalk zzalk, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return zzbgk.zza(context, zzalk, i).zzaco().zzfr(str).zzbw(context).zzaei().zzaem();
    }
}
