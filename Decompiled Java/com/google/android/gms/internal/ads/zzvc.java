package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzvc extends zzve<zzacy> {
    private final /* synthetic */ zzus zzcdw;
    private final /* synthetic */ View zzcdy;
    private final /* synthetic */ HashMap zzcdz;
    private final /* synthetic */ HashMap zzcea;

    zzvc(zzus zzus, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzcdw = zzus;
        this.zzcdy = view;
        this.zzcdz = hashMap;
        this.zzcea = hashMap2;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zzou() {
        zzus.zza(this.zzcdy.getContext(), "native_ad_view_holder_delegate");
        return new zzyr();
    }

    public final /* synthetic */ Object zzov() throws RemoteException {
        return this.zzcdw.zzcds.zzb(this.zzcdy, this.zzcdz, this.zzcea);
    }

    public final /* synthetic */ Object zza(zzwg zzwg) throws RemoteException {
        return zzwg.zza(ObjectWrapper.wrap(this.zzcdy), ObjectWrapper.wrap(this.zzcdz), ObjectWrapper.wrap(this.zzcea));
    }
}
