package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzc;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzccv {
    private final zzbee zzbms;
    private final zzazo zzdjo;
    private final zzdq zzehb;
    private final Executor zzfeo;
    private final zza zzfsj;
    /* access modifiers changed from: private */
    public final zzcda zzftj = new zzcda((zzccw) null);
    private final zzagf zzftk;
    private zzdof<zzbdv> zzftl;
    private final Context zzur;

    zzccv(zzcdf zzcdf) {
        this.zzur = zzcdf.zzur;
        this.zzfeo = zzcdf.zzfeo;
        this.zzehb = zzcdf.zzehb;
        this.zzdjo = zzcdf.zzdjo;
        this.zzfsj = zzcdf.zzfsj;
        this.zzbms = zzcdf.zzbms;
        this.zzftk = new zzagf();
    }

    public final synchronized void zzalx() {
        this.zzftl = zzdnt.zzb(zzbee.zza(this.zzur, this.zzdjo, (String) zzvh.zzpd().zzd(zzzx.zzcmt), this.zzehb, this.zzfsj), new zzccu(this), this.zzfeo);
        zzazu.zza(this.zzftl, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void destroy() {
        if (this.zzftl != null) {
            zzdnt.zza(this.zzftl, new zzccw(this), this.zzfeo);
            this.zzftl = null;
        }
    }

    public final synchronized zzdof<JSONObject> zzc(String str, JSONObject jSONObject) {
        if (this.zzftl == null) {
            return zzdnt.zzaj(null);
        }
        return zzdnt.zzb(this.zzftl, new zzccx(this, str, jSONObject), this.zzfeo);
    }

    public final synchronized void zza(String str, zzafz<Object> zzafz) {
        if (this.zzftl != null) {
            zzdnt.zza(this.zzftl, new zzccz(this, str, zzafz), this.zzfeo);
        }
    }

    public final synchronized void zzb(String str, zzafz<Object> zzafz) {
        if (this.zzftl != null) {
            zzdnt.zza(this.zzftl, new zzccy(this, str, zzafz), this.zzfeo);
        }
    }

    public final synchronized void zza(String str, Map<String, ?> map) {
        if (this.zzftl != null) {
            zzdnt.zza(this.zzftl, new zzcdb(this, str, map), this.zzfeo);
        }
    }

    public final <T> void zza(WeakReference<T> weakReference, String str, zzafz<T> zzafz) {
        zza(str, (zzafz<Object>) new zzcde(this, weakReference, str, zzafz, (zzccw) null));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zza(String str, JSONObject jSONObject, zzbdv zzbdv) throws Exception {
        return this.zzftk.zza(zzbdv, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbdv zzm(zzbdv zzbdv) {
        zzbdv.zza("/result", (zzafz<? super zzbdv>) this.zzftk);
        zzbfi zzaaf = zzbdv.zzaaf();
        zzcda zzcda = this.zzftj;
        zzaaf.zza((zztz) null, zzcda, zzcda, zzcda, zzcda, false, (zzafy) null, new zzc(this.zzur, (zzaub) null, (zzaqm) null), (zzaoz) null, (zzaub) null);
        return zzbdv;
    }
}
