package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcsc implements zzdnu<zzblg> {
    private final /* synthetic */ zzbmc zzgfs;
    private final /* synthetic */ zzcsd zzgft;

    zzcsc(zzcsd zzcsd, zzbmc zzbmc) {
        this.zzgft = zzcsd;
        this.zzgfs = zzbmc;
    }

    public final void zzb(Throwable th) {
        synchronized (this.zzgft) {
            zzdof unused = this.zzgft.zzgga = null;
            this.zzgfs.zzady().onAdFailedToLoad(zzcid.zzd(th));
            this.zzgft.zzgfy.zzdg(60);
            zzdfc.zzc(th, "BannerAdManagerShim.onFailure");
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzblg zzblg = (zzblg) obj;
        synchronized (this.zzgft) {
            zzdof unused = this.zzgft.zzgga = null;
            if (this.zzgft.zzgfn != null) {
                this.zzgft.zzgfn.destroy();
            }
            zzblg unused2 = this.zzgft.zzgfn = zzblg;
            this.zzgft.zzfgb.removeAllViews();
            if (zzblg.zzagm() != null) {
                ViewParent parent = zzblg.zzagm().getParent();
                if (parent instanceof ViewGroup) {
                    String mediationAdapterClassName = this.zzgft.getMediationAdapterClassName();
                    StringBuilder sb = new StringBuilder(String.valueOf(mediationAdapterClassName).length() + 78);
                    sb.append("Banner view provided from ");
                    sb.append(mediationAdapterClassName);
                    sb.append(" already has a parent view. Removing its old parent.");
                    zzawf.zzfa(sb.toString());
                    ((ViewGroup) parent).removeView(zzblg.zzagm());
                }
            }
            this.zzgft.zzfgb.addView(zzblg.zzagm());
            zzblg.zzags();
            this.zzgft.zzgfy.zzdg(zzblg.zzagr());
        }
    }
}
