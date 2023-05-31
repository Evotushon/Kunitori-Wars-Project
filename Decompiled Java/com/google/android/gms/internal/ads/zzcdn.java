package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcdn extends zzbnf {
    private final zzass zzdpd;
    private final WeakReference<zzbdv> zzflu;
    private final zzbui zzflv;
    private final zzbnz zzflx;
    private final zzdjh zzfly;
    private final zzbxb zzfmb;
    private boolean zzftd = false;
    private final zzbrq zzfts;
    private final zzbql zzfuc;
    private final Context zzur;

    zzcdn(zzbne zzbne, Context context, @Nullable zzbdv zzbdv, zzbxb zzbxb, zzbui zzbui, zzbql zzbql, zzbrq zzbrq, zzbnz zzbnz, zzdei zzdei, zzdjh zzdjh) {
        super(zzbne);
        this.zzur = context;
        this.zzfmb = zzbxb;
        this.zzflu = new WeakReference<>(zzbdv);
        this.zzflv = zzbui;
        this.zzfuc = zzbql;
        this.zzfts = zzbrq;
        this.zzflx = zzbnz;
        this.zzfly = zzdjh;
        this.zzdpd = new zzatp(zzdei.zzdmd);
    }

    public final void zzb(boolean z, @Nullable Activity activity) {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcjg)).booleanValue()) {
            zzq.zzkv();
            if (zzawo.zzaw(this.zzur)) {
                zzawf.zzfa("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzfuc.zzco(3);
                if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcjh)).booleanValue()) {
                    this.zzfly.zzgt(this.zzfdp.zzgqm.zzgqj.zzcac);
                    return;
                }
                return;
            }
        }
        if (this.zzftd) {
            zzawf.zzfa("The rewarded ad have been showed.");
            this.zzfuc.zzco(1);
            return;
        }
        this.zzftd = true;
        this.zzflv.zzait();
        Context context = activity;
        if (activity == null) {
            context = this.zzur;
        }
        this.zzfmb.zza(z, context);
    }

    public final boolean zzaly() {
        return this.zzftd;
    }

    public final zzass zzqc() {
        return this.zzdpd;
    }

    public final boolean isClosed() {
        return this.zzflx.isClosed();
    }

    public final boolean zzqd() {
        zzbdv zzbdv = (zzbdv) this.zzflu.get();
        return zzbdv != null && !zzbdv.zzaau();
    }

    public final Bundle getAdMetadata() {
        return this.zzfts.getAdMetadata();
    }

    public final void finalize() throws Throwable {
        try {
            zzbdv zzbdv = (zzbdv) this.zzflu.get();
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcsd)).booleanValue()) {
                if (!this.zzftd && zzbdv != null) {
                    zzdoe zzdoe = zzazq.zzdxo;
                    zzbdv.getClass();
                    zzdoe.execute(zzcdm.zzh(zzbdv));
                }
            } else if (zzbdv != null) {
                zzbdv.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
