package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzva extends zzve<zzwn> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzus zzcdw;

    zzva(zzus zzus, Context context) {
        this.zzcdw = zzus;
        this.val$context = context;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zzou() {
        zzus.zza(this.val$context, "mobile_ads_settings");
        return new zzym();
    }

    public final /* synthetic */ Object zzov() throws RemoteException {
        return this.zzcdw.zzcdn.zzj(this.val$context);
    }

    public final /* synthetic */ Object zza(zzwg zzwg) throws RemoteException {
        return zzwg.zza(ObjectWrapper.wrap(this.val$context), 20089000);
    }
}
