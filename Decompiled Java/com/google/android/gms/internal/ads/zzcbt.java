package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzc;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcbt {
    private final Executor zzfeo;
    private final zzdeu zzfir;
    private final zzceb zzfrh;
    private final Context zzur;

    public zzcbt(Context context, zzdeu zzdeu, Executor executor, zzceb zzceb) {
        this.zzur = context;
        this.zzfir = zzdeu;
        this.zzfeo = executor;
        this.zzfrh = zzceb;
    }

    public final zzdof<zzbdv> zzn(JSONObject jSONObject) {
        return zzdnt.zzb(zzdnt.zzb(zzdnt.zzaj(null), new zzcbu(this), this.zzfeo), new zzcbs(this, jSONObject), this.zzfeo);
    }

    public final zzdof<zzbdv> zzo(String str, String str2) {
        return zzdnt.zzb(zzdnt.zzaj(null), new zzcbv(this, str, str2), this.zzfeo);
    }

    private final void zzk(zzbdv zzbdv) {
        zzbdv.zza("/video", (zzafz<? super zzbdv>) zzafi.zzcyh);
        zzbdv.zza("/videoMeta", (zzafz<? super zzbdv>) zzafi.zzcyi);
        zzbdv.zza("/precache", (zzafz<? super zzbdv>) new zzbdf());
        zzbdv.zza("/delayPageLoaded", (zzafz<? super zzbdv>) zzafi.zzcyl);
        zzbdv.zza("/instrument", (zzafz<? super zzbdv>) zzafi.zzcyj);
        zzbdv.zza("/log", (zzafz<? super zzbdv>) zzafi.zzcyc);
        zzbdv.zza("/videoClicked", (zzafz<? super zzbdv>) zzafi.zzcyd);
        zzbdv.zzaaf().zzbb(true);
        zzbdv.zza("/click", (zzafz<? super zzbdv>) zzafi.zzcxy);
        if (this.zzfir.zzdlk != null) {
            zzbdv.zzaaf().zzbc(true);
            zzbdv.zza("/open", (zzafz<? super zzbdv>) new zzagd((zzc) null, (zzaom) null));
            return;
        }
        zzbdv.zzaaf().zzbc(false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zzq(Object obj) throws Exception {
        zzbdv zza = this.zzfrh.zza(zzuk.zzh(this.zzur), false);
        zzazv zzl = zzazv.zzl(zza);
        zzk(zza);
        zza.zzaaf().zza((zzbfk) new zzcbx(zzl));
        zza.loadUrl((String) zzvh.zzpd().zzd(zzzx.zzcmv));
        return zzl;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zza(String str, String str2, Object obj) throws Exception {
        zzbdv zza = this.zzfrh.zza(zzuk.zzh(this.zzur), false);
        zzazv zzl = zzazv.zzl(zza);
        zzk(zza);
        if (this.zzfir.zzdlk != null) {
            zza.zza(zzbfl.zzabx());
        } else {
            zza.zza(zzbfl.zzabw());
        }
        zza.zzaaf().zza((zzbfh) new zzcbw(this, zza, zzl));
        zza.zzb(str, str2, (String) null);
        return zzl;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbdv zzbdv, zzazv zzazv, boolean z) {
        if (z) {
            if (!(this.zzfir.zzgqp == null || zzbdv.zzyq() == null)) {
                zzbdv.zzyq().zzb(this.zzfir.zzgqp);
            }
            zzazv.zzxs();
            return;
        }
        zzazv.setException(new zzcpe("Instream video Web View failed to load.", 0));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zza(JSONObject jSONObject, zzbdv zzbdv) throws Exception {
        zzazv zzl = zzazv.zzl(zzbdv);
        if (this.zzfir.zzdlk != null) {
            zzbdv.zza(zzbfl.zzabx());
        } else {
            zzbdv.zza(zzbfl.zzabw());
        }
        zzbdv.zzaaf().zza((zzbfh) new zzcbz(this, zzbdv, zzl));
        zzbdv.zzb("google.afma.nativeAds.renderVideo", jSONObject);
        return zzl;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzbdv zzbdv, zzazv zzazv, boolean z) {
        if (!(this.zzfir.zzgqp == null || zzbdv.zzyq() == null)) {
            zzbdv.zzyq().zzb(this.zzfir.zzgqp);
        }
        zzazv.zzxs();
    }
}
