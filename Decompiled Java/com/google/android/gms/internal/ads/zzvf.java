package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzvf extends zzve<zzary> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzalk zzcdv;
    private final /* synthetic */ zzus zzcdw;

    zzvf(zzus zzus, Context context, zzalk zzalk) {
        this.zzcdw = zzus;
        this.val$context = context;
        this.zzcdv = zzalk;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zzou() {
        zzus.zza(this.val$context, "rewarded_video");
        return new zzys();
    }

    public final /* synthetic */ Object zzov() throws RemoteException {
        return this.zzcdw.zzcdp.zza(this.val$context, this.zzcdv);
    }

    public final /* synthetic */ Object zza(zzwg zzwg) throws RemoteException {
        return zzwg.zza(ObjectWrapper.wrap(this.val$context), this.zzcdv, 20089000);
    }
}
