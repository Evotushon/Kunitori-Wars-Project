package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzcpq extends zzcqs {
    private zzbvf zzgdk;
    private zzbql zzgdl;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcpq(zzbqg zzbqg, zzbqp zzbqp, zzbrc zzbrc, zzbrm zzbrm, zzbql zzbql, zzbsy zzbsy, zzbvk zzbvk, zzbrv zzbrv, zzbvf zzbvf, zzbsu zzbsu) {
        super(zzbqg, zzbqp, zzbrc, zzbrm, zzbsy, zzbrv, zzbvk, zzbsu);
        this.zzgdk = zzbvf;
        this.zzgdl = zzbql;
    }

    public final void zzb(Bundle bundle) throws RemoteException {
    }

    public final void zzsx() {
        this.zzgdk.zzrx();
    }

    public final void zzco(int i) throws RemoteException {
        this.zzgdl.zzco(i);
    }

    public final void zzsy() throws RemoteException {
        this.zzgdk.zzry();
    }

    public final void zza(zzass zzass) throws RemoteException {
        this.zzgdk.zza(new zzasq(zzass.getType(), zzass.getAmount()));
    }

    public final void zzb(zzasq zzasq) {
        this.zzgdk.zza(zzasq);
    }

    public final void onVideoEnd() {
        this.zzgdk.zzry();
    }
}
