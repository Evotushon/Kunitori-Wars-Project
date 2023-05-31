package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzyc extends zzwx {
    private final String description;
    private final String zzcfw;

    public zzyc(String str, String str2) {
        this.description = str;
        this.zzcfw = str2;
    }

    public final String getDescription() throws RemoteException {
        return this.description;
    }

    public final String zzpm() throws RemoteException {
        return this.zzcfw;
    }
}
