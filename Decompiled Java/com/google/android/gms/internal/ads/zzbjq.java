package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbjq implements zzbqh, zzbqu, zzbrn, zztz {
    @Nullable
    private final View view;
    private final zzdeq zzfdp;
    private final zzdei zzfdq;
    private final zzdis zzfdr;
    private final zzdq zzfds;
    @GuardedBy("this")
    private boolean zzfdt;
    @GuardedBy("this")
    private boolean zzfdu;
    private final Context zzur;

    public zzbjq(Context context, zzdeq zzdeq, zzdei zzdei, zzdis zzdis, @Nullable View view2, zzdq zzdq) {
        this.zzur = context;
        this.zzfdp = zzdeq;
        this.zzfdq = zzdei;
        this.zzfdr = zzdis;
        this.zzfds = zzdq;
        this.view = view2;
    }

    public final void onAdClosed() {
    }

    public final void onAdLeftApplication() {
    }

    public final void onAdOpened() {
    }

    public final synchronized void onAdLoaded() {
        if (this.zzfdt) {
            ArrayList arrayList = new ArrayList(this.zzfdq.zzddq);
            arrayList.addAll(this.zzfdq.zzgpm);
            this.zzfdr.zza(this.zzfdp, this.zzfdq, true, (String) null, arrayList);
        } else {
            this.zzfdr.zza(this.zzfdp, this.zzfdq, this.zzfdq.zzgpo);
            this.zzfdr.zza(this.zzfdp, this.zzfdq, this.zzfdq.zzgpm);
        }
        this.zzfdt = true;
    }

    public final void onAdClicked() {
        zzdis zzdis = this.zzfdr;
        zzdeq zzdeq = this.zzfdp;
        zzdei zzdei = this.zzfdq;
        zzdis.zza(zzdeq, zzdei, zzdei.zzddp);
    }

    public final synchronized void onAdImpression() {
        if (!this.zzfdu) {
            String str = null;
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcmo)).booleanValue()) {
                str = this.zzfds.zzcb().zza(this.zzur, this.view, (Activity) null);
            }
            this.zzfdr.zza(this.zzfdp, this.zzfdq, false, str, this.zzfdq.zzddq);
            this.zzfdu = true;
        }
    }

    public final void zzb(zzarr zzarr, String str, String str2) {
        zzdis zzdis = this.zzfdr;
        zzdeq zzdeq = this.zzfdp;
        zzdei zzdei = this.zzfdq;
        zzdis.zza(zzdeq, zzdei, zzdei.zzdmf, zzarr);
    }

    public final void onRewardedVideoStarted() {
        zzdis zzdis = this.zzfdr;
        zzdeq zzdeq = this.zzfdp;
        zzdei zzdei = this.zzfdq;
        zzdis.zza(zzdeq, zzdei, zzdei.zzdme);
    }

    public final void onRewardedVideoCompleted() {
        zzdis zzdis = this.zzfdr;
        zzdeq zzdeq = this.zzfdp;
        zzdei zzdei = this.zzfdq;
        zzdis.zza(zzdeq, zzdei, zzdei.zzgpn);
    }
}
