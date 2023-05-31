package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzc;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzced {
    private final zzaub zzblc;
    private final zzdq zzehb;
    private final Executor zzfeo;
    /* access modifiers changed from: private */
    public final zzbrc zzfil;
    private final zzbrv zzfmd;
    private final zzbqg zzfng;
    private final zzbkb zzfnh;
    private final zzbuu zzfnj;
    private final zzbrq zzfts;
    private final zzbsy zzftt;
    private final zzc zzfuj;
    private final zzbqw zzfuk;
    /* access modifiers changed from: private */
    public final zzbsq zzful;

    public zzced(zzbqg zzbqg, zzbrc zzbrc, zzbrq zzbrq, zzbrv zzbrv, zzbsy zzbsy, Executor executor, zzbuu zzbuu, zzbkb zzbkb, zzc zzc, zzbqw zzbqw, @Nullable zzaub zzaub, zzdq zzdq, zzbsq zzbsq) {
        this.zzfng = zzbqg;
        this.zzfil = zzbrc;
        this.zzfts = zzbrq;
        this.zzfmd = zzbrv;
        this.zzftt = zzbsy;
        this.zzfeo = executor;
        this.zzfnj = zzbuu;
        this.zzfnh = zzbkb;
        this.zzfuj = zzc;
        this.zzfuk = zzbqw;
        this.zzblc = zzaub;
        this.zzehb = zzdq;
        this.zzful = zzbsq;
    }

    public final void zzb(zzbdv zzbdv, boolean z) {
        zzdg zzcb;
        zzbdv.zzaaf().zza(new zzcec(this), this.zzfts, this.zzfmd, new zzcef(this), new zzcee(this), z, (zzafy) null, this.zzfuj, new zzcen(this), this.zzblc);
        zzbdv.setOnTouchListener(new zzceh(this));
        zzbdv.setOnClickListener(new zzceg(this));
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzclw)).booleanValue() && (zzcb = this.zzehb.zzcb()) != null) {
            zzcb.zzb(zzbdv.getView());
        }
        this.zzfnj.zza(zzbdv, this.zzfeo);
        this.zzfnj.zza(new zzcej(zzbdv), this.zzfeo);
        this.zzfnj.zzq(zzbdv.getView());
        zzbdv.zza("/trackActiveViewUnit", (zzafz<? super zzbdv>) new zzcei(this, zzbdv));
        this.zzfnh.zzo(zzbdv);
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcjo)).booleanValue()) {
            zzbqw zzbqw = this.zzfuk;
            zzbdv.getClass();
            zzbqw.zza(zzcel.zzn(zzbdv), this.zzfeo);
        }
    }

    public static zzdof<?> zza(zzbdv zzbdv, String str, String str2) {
        zzazy zzazy = new zzazy();
        zzbdv.zzaaf().zza((zzbfh) new zzcek(zzazy));
        zzbdv.zzb(str, str2, (String) null);
        return zzazy;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbdv zzbdv, zzbdv zzbdv2, Map map) {
        this.zzfnh.zzf(zzbdv);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzad(View view) {
        this.zzfuj.recordClick();
        zzaub zzaub = this.zzblc;
        if (zzaub != null) {
            zzaub.zzur();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean zza(View view, MotionEvent motionEvent) {
        this.zzfuj.recordClick();
        zzaub zzaub = this.zzblc;
        if (zzaub == null) {
            return false;
        }
        zzaub.zzur();
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzame() {
        this.zzfil.onAdLeftApplication();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(String str, String str2) {
        this.zzftt.onAppEvent(str, str2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzamf() {
        this.zzfng.onAdClicked();
    }
}
