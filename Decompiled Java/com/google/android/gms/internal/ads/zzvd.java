package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzvd extends zzve<zzacv> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzus zzcdw;
    private final /* synthetic */ FrameLayout zzceb;
    private final /* synthetic */ FrameLayout zzcec;

    zzvd(zzus zzus, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zzcdw = zzus;
        this.zzceb = frameLayout;
        this.zzcec = frameLayout2;
        this.val$context = context;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zzou() {
        zzus.zza(this.val$context, "native_ad_view_delegate");
        return new zzyo();
    }

    public final /* synthetic */ Object zzov() throws RemoteException {
        return this.zzcdw.zzcdo.zzb(this.val$context, this.zzceb, this.zzcec);
    }

    public final /* synthetic */ Object zza(zzwg zzwg) throws RemoteException {
        return zzwg.zza(ObjectWrapper.wrap(this.zzceb), ObjectWrapper.wrap(this.zzcec));
    }
}
