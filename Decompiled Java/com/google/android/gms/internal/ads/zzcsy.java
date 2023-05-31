package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcsy implements zzdnu<zzctj> {
    private final /* synthetic */ zzava zzggz;
    private final /* synthetic */ zzcsz zzgha;

    zzcsy(zzcsz zzcsz, zzava zzava) {
        this.zzgha = zzcsz;
        this.zzggz = zzava;
    }

    public final void zzb(Throwable th) {
        try {
            this.zzggz.onError("Internal error.");
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }

    public final /* synthetic */ void onSuccess(@Nullable Object obj) {
        zzctj zzctj = (zzctj) obj;
        try {
            zzabt.zzqz();
            if (zzctj == null) {
                this.zzggz.zzk((String) null, (String) null);
            } else {
                this.zzggz.zzk(zzctj.zzghm, zzctj.zzghn);
            }
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }
}
