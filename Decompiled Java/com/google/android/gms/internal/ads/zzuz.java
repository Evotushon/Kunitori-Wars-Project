package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzuz extends zzve<zzvx> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzcdu;
    private final /* synthetic */ zzus zzcdw;
    private final /* synthetic */ zzuk zzcdx;

    zzuz(zzus zzus, Context context, zzuk zzuk, String str) {
        this.zzcdw = zzus;
        this.val$context = context;
        this.zzcdx = zzuk;
        this.zzcdu = str;
    }

    public final /* synthetic */ Object zzou() {
        zzus.zza(this.val$context, FirebaseAnalytics.Event.SEARCH);
        return new zzyk();
    }

    public final /* synthetic */ Object zzov() throws RemoteException {
        return this.zzcdw.zzcdl.zza(this.val$context, this.zzcdx, this.zzcdu, (zzalk) null, 3);
    }

    public final /* synthetic */ Object zza(zzwg zzwg) throws RemoteException {
        return zzwg.zza(ObjectWrapper.wrap(this.val$context), this.zzcdx, this.zzcdu, 20089000);
    }
}
