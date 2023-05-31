package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbvu extends zzbnf {
    private final WeakReference<zzbdv> zzflu;
    private final zzbui zzflv;
    private final zzbxb zzflw;
    private final zzbnz zzflx;
    private final zzdjh zzfly;
    private boolean zzflz = false;
    private final Context zzur;

    zzbvu(zzbne zzbne, Context context, @Nullable zzbdv zzbdv, zzbui zzbui, zzbxb zzbxb, zzbnz zzbnz, zzdjh zzdjh) {
        super(zzbne);
        this.zzur = context;
        this.zzflu = new WeakReference<>(zzbdv);
        this.zzflv = zzbui;
        this.zzflw = zzbxb;
        this.zzflx = zzbnz;
        this.zzfly = zzdjh;
    }

    public final void zzbi(boolean z) {
        this.zzflv.zzait();
        this.zzflw.zza(z, this.zzur);
        this.zzflz = true;
    }

    public final boolean isClosed() {
        return this.zzflx.isClosed();
    }

    public final boolean zzaja() {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcjg)).booleanValue()) {
            zzq.zzkv();
            if (zzawo.zzaw(this.zzur)) {
                zzawf.zzfa("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcjh)).booleanValue()) {
                    this.zzfly.zzgt(this.zzfdp.zzgqm.zzgqj.zzcac);
                }
                return false;
            }
        }
        if (!this.zzflz) {
            return true;
        }
        return false;
    }

    public final void finalize() throws Throwable {
        try {
            zzbdv zzbdv = (zzbdv) this.zzflu.get();
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcsd)).booleanValue()) {
                if (!this.zzflz && zzbdv != null) {
                    zzdoe zzdoe = zzazq.zzdxo;
                    zzbdv.getClass();
                    zzdoe.execute(zzbvx.zzh(zzbdv));
                }
            } else if (zzbdv != null) {
                zzbdv.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
