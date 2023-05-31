package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzux extends zzve<zzapb> {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ zzus zzcdw;

    zzux(zzus zzus, Activity activity) {
        this.zzcdw = zzus;
        this.val$activity = activity;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zzou() {
        zzus.zza(this.val$activity, "ad_overlay");
        return null;
    }

    public final /* synthetic */ Object zzov() throws RemoteException {
        return this.zzcdw.zzcdr.zzc(this.val$activity);
    }

    public final /* synthetic */ Object zza(zzwg zzwg) throws RemoteException {
        return zzwg.zzb(ObjectWrapper.wrap(this.val$activity));
    }
}
