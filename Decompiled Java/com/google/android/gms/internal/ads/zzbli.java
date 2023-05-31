package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbli extends zzblg {
    private final View view;
    @Nullable
    private final zzbdv zzdae;
    private final Executor zzfeo;
    private final zzdeh zzffr;
    private final zzbnc zzfgd;
    private final zzbzg zzfge;
    private final zzbuz zzfgf;
    private final zzeed<zzcrz> zzfgg;
    private zzuk zzfgh;
    private final Context zzur;

    zzbli(zzbne zzbne, Context context, zzdeh zzdeh, View view2, @Nullable zzbdv zzbdv, zzbnc zzbnc, zzbzg zzbzg, zzbuz zzbuz, zzeed<zzcrz> zzeed, Executor executor) {
        super(zzbne);
        this.zzur = context;
        this.view = view2;
        this.zzdae = zzbdv;
        this.zzffr = zzdeh;
        this.zzfgd = zzbnc;
        this.zzfge = zzbzg;
        this.zzfgf = zzbuz;
        this.zzfgg = zzeed;
        this.zzfeo = executor;
    }

    public final View zzagm() {
        return this.view;
    }

    public final void zza(ViewGroup viewGroup, zzuk zzuk) {
        zzbdv zzbdv;
        if (viewGroup != null && (zzbdv = this.zzdae) != null) {
            zzbdv.zza(zzbfl.zzb(zzuk));
            viewGroup.setMinimumHeight(zzuk.heightPixels);
            viewGroup.setMinimumWidth(zzuk.widthPixels);
            this.zzfgh = zzuk;
        }
    }

    public final zzxj getVideoController() {
        try {
            return this.zzfgd.getVideoController();
        } catch (zzdfa unused) {
            return null;
        }
    }

    public final zzdeh zzagl() {
        boolean z;
        zzuk zzuk = this.zzfgh;
        if (zzuk != null) {
            return zzdex.zze(zzuk);
        }
        if (this.zzfhg.zzgqc) {
            Iterator<String> it = this.zzfhg.zzgpk.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                String next = it.next();
                if (next != null && next.contains("FirstParty")) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return new zzdeh(this.view.getWidth(), this.view.getHeight(), false);
            }
        }
        return zzdex.zza(this.zzfhg.zzgpp, this.zzffr);
    }

    public final int zzagr() {
        return this.zzfdp.zzgqm.zzgqj.zzgqf;
    }

    public final void zzkd() {
        this.zzfgf.zzaix();
    }

    public final void zzags() {
        this.zzfeo.execute(new zzbll(this));
        super.zzags();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzagt() {
        if (this.zzfge.zzakw() != null) {
            try {
                this.zzfge.zzakw().zza(this.zzfgg.get(), ObjectWrapper.wrap(this.zzur));
            } catch (RemoteException e) {
                zzawf.zzc("RemoteException when notifyAdLoad is called", e);
            }
        }
    }
}
