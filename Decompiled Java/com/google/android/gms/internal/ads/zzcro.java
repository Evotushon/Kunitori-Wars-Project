package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcro {
    private final zzcnk zzfws;
    private final ConcurrentHashMap<String, zzanq> zzgfd = new ConcurrentHashMap<>();

    public zzcro(zzcnk zzcnk) {
        this.zzfws = zzcnk;
    }

    public final void zzgj(String str) {
        try {
            this.zzgfd.put(str, this.zzfws.zzdh(str));
        } catch (RemoteException e) {
            zzawf.zzc("Couldn't create RTB adapter : ", e);
        }
    }

    @CheckForNull
    public final zzanq zzgk(String str) {
        if (this.zzgfd.containsKey(str)) {
            return this.zzgfd.get(str);
        }
        return null;
    }
}
