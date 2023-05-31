package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzq;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaox extends zzaow implements zzafz<zzbdv> {
    private float density;
    private int maxHeight = -1;
    private int maxWidth = -1;
    private int rotation;
    private final WindowManager zzbnu;
    private final zzbdv zzdae;
    private final zzze zzdhi;
    private int zzdhj = -1;
    private int zzdhk = -1;
    private int zzdhl = -1;
    private int zzdhm = -1;
    private final Context zzur;
    private DisplayMetrics zzwi;

    public zzaox(zzbdv zzbdv, Context context, zzze zzze) {
        super(zzbdv);
        this.zzdae = zzbdv;
        this.zzur = context;
        this.zzdhi = zzze;
        this.zzbnu = (WindowManager) context.getSystemService("window");
    }

    public final void zzj(int i, int i2) {
        int i3 = 0;
        if (this.zzur instanceof Activity) {
            i3 = zzq.zzkv().zzf((Activity) this.zzur)[0];
        }
        if (this.zzdae.zzaad() == null || !this.zzdae.zzaad().zzaby()) {
            int width = this.zzdae.getWidth();
            int height = this.zzdae.getHeight();
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcij)).booleanValue()) {
                if (width == 0 && this.zzdae.zzaad() != null) {
                    width = this.zzdae.zzaad().widthPixels;
                }
                if (height == 0 && this.zzdae.zzaad() != null) {
                    height = this.zzdae.zzaad().heightPixels;
                }
            }
            this.zzdhl = zzvh.zzoz().zzc(this.zzur, width);
            this.zzdhm = zzvh.zzoz().zzc(this.zzur, height);
        }
        zzb(i, i2 - i3, this.zzdhl, this.zzdhm);
        this.zzdae.zzaaf().zzi(i, i2);
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbdv zzbdv = (zzbdv) obj;
        this.zzwi = new DisplayMetrics();
        Display defaultDisplay = this.zzbnu.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zzwi);
        this.density = this.zzwi.density;
        this.rotation = defaultDisplay.getRotation();
        zzvh.zzoz();
        DisplayMetrics displayMetrics = this.zzwi;
        this.zzdhj = zzayx.zzb(displayMetrics, displayMetrics.widthPixels);
        zzvh.zzoz();
        DisplayMetrics displayMetrics2 = this.zzwi;
        this.zzdhk = zzayx.zzb(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzys = this.zzdae.zzys();
        if (zzys == null || zzys.getWindow() == null) {
            this.maxWidth = this.zzdhj;
            this.maxHeight = this.zzdhk;
        } else {
            zzq.zzkv();
            int[] zzd = zzawo.zzd(zzys);
            zzvh.zzoz();
            this.maxWidth = zzayx.zzb(this.zzwi, zzd[0]);
            zzvh.zzoz();
            this.maxHeight = zzayx.zzb(this.zzwi, zzd[1]);
        }
        if (this.zzdae.zzaad().zzaby()) {
            this.zzdhl = this.zzdhj;
            this.zzdhm = this.zzdhk;
        } else {
            this.zzdae.measure(0, 0);
        }
        zza(this.zzdhj, this.zzdhk, this.maxWidth, this.maxHeight, this.density, this.rotation);
        this.zzdae.zza("onDeviceFeaturesReceived", new zzaos(new zzaou().zzae(this.zzdhi.zzqe()).zzad(this.zzdhi.zzqf()).zzaf(this.zzdhi.zzqh()).zzag(this.zzdhi.zzqg()).zzah(true)).zztm());
        int[] iArr = new int[2];
        this.zzdae.getLocationOnScreen(iArr);
        zzj(zzvh.zzoz().zzc(this.zzur, iArr[0]), zzvh.zzoz().zzc(this.zzur, iArr[1]));
        if (zzawf.isLoggable(2)) {
            zzawf.zzez("Dispatching Ready Event.");
        }
        zzdu(this.zzdae.zzyw().zzbmj);
    }
}
