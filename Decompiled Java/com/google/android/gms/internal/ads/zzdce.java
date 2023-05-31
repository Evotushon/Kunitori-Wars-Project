package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdce {
    public static <T> void zza(AtomicReference<T> atomicReference, zzdcd<T> zzdcd) {
        T t = atomicReference.get();
        if (t != null) {
            try {
                zzdcd.zzr(t);
            } catch (RemoteException e) {
                zzawf.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
