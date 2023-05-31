package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzyb extends zzahf {
    private final OnInitializationCompleteListener zzcfu;
    private final /* synthetic */ zzxu zzcfv;

    private zzyb(zzxu zzxu, OnInitializationCompleteListener onInitializationCompleteListener) {
        this.zzcfv = zzxu;
        this.zzcfu = onInitializationCompleteListener;
    }

    public final void zzd(List<zzagz> list) throws RemoteException {
        this.zzcfu.onInitializationComplete(zzxu.zzc(list));
    }

    /* synthetic */ zzyb(zzxu zzxu, OnInitializationCompleteListener onInitializationCompleteListener, zzxy zzxy) {
        this(zzxu, onInitializationCompleteListener);
    }
}
