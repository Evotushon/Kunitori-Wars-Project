package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcqj extends zzasl {
    private final /* synthetic */ zzbrv zzgdx;
    private final /* synthetic */ zzbqg zzgdy;
    private final /* synthetic */ zzbrc zzgdz;
    private final /* synthetic */ zzbvf zzgea;

    zzcqj(zzcqf zzcqf, zzbrv zzbrv, zzbqg zzbqg, zzbrc zzbrc, zzbvf zzbvf) {
        this.zzgdx = zzbrv;
        this.zzgdy = zzbqg;
        this.zzgdz = zzbrc;
        this.zzgea = zzbvf;
    }

    public final void zzaf(IObjectWrapper iObjectWrapper) {
    }

    public final void zzag(IObjectWrapper iObjectWrapper) {
    }

    public final void zzb(Bundle bundle) {
    }

    public final void zzd(IObjectWrapper iObjectWrapper, int i) {
    }

    public final void zze(IObjectWrapper iObjectWrapper, int i) {
    }

    public final void zzah(IObjectWrapper iObjectWrapper) {
        this.zzgdx.zztk();
    }

    public final void zzaj(IObjectWrapper iObjectWrapper) {
        this.zzgdx.zztj();
    }

    public final void zzak(IObjectWrapper iObjectWrapper) {
        this.zzgdy.onAdClicked();
    }

    public final void zzal(IObjectWrapper iObjectWrapper) {
        this.zzgdz.onAdLeftApplication();
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzasq zzasq) {
        this.zzgea.zza(zzasq);
    }

    public final void zzai(IObjectWrapper iObjectWrapper) {
        this.zzgea.zzrx();
    }

    public final void zzam(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zzgdz.onRewardedVideoCompleted();
    }
}
