package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcsk {
    /* access modifiers changed from: private */
    @GuardedBy("this")
    @Nullable
    public zzxe zzaca;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    public boolean zzadk = false;
    private final String zzbri;
    private final zzcso<zzbnf> zzggj;

    public zzcsk(zzcso<zzbnf> zzcso, String str) {
        this.zzggj = zzcso;
        this.zzbri = str;
    }

    public final synchronized boolean isLoading() throws RemoteException {
        return this.zzggj.isLoading();
    }

    public final synchronized void zza(zzuh zzuh, int i) throws RemoteException {
        this.zzaca = null;
        this.zzadk = this.zzggj.zza(zzuh, this.zzbri, new zzcst(i), new zzcsn(this));
    }

    public final synchronized String getMediationAdapterClassName() {
        try {
            if (this.zzaca == null) {
                return null;
            }
            return this.zzaca.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzawf.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final synchronized String zzkf() {
        try {
            if (this.zzaca == null) {
                return null;
            }
            return this.zzaca.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzawf.zze("#007 Could not call remote method.", e);
            return null;
        }
    }
}
