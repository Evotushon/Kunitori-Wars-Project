package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzvb extends zzve<zzvq> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzcdu;
    private final /* synthetic */ zzalk zzcdv;
    private final /* synthetic */ zzus zzcdw;

    zzvb(zzus zzus, Context context, String str, zzalk zzalk) {
        this.zzcdw = zzus;
        this.val$context = context;
        this.zzcdu = str;
        this.zzcdv = zzalk;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zzou() {
        zzus.zza(this.val$context, "native_ad");
        return new zzyg();
    }

    public final /* synthetic */ Object zzov() throws RemoteException {
        return this.zzcdw.zzcdm.zza(this.val$context, this.zzcdu, this.zzcdv);
    }

    public final /* synthetic */ Object zza(zzwg zzwg) throws RemoteException {
        return zzwg.zza(ObjectWrapper.wrap(this.val$context), this.zzcdu, this.zzcdv, 20089000);
    }
}
