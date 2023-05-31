package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzapy extends zzauz {
    private final /* synthetic */ QueryInfoGenerationCallback zzdji;

    zzapy(zzapw zzapw, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.zzdji = queryInfoGenerationCallback;
    }

    public final void zzk(String str, String str2) throws RemoteException {
        QueryInfo queryInfo = new QueryInfo(new zzyf(str, (Bundle) null));
        zzvh.zzph().put(queryInfo, str2);
        this.zzdji.onSuccess(queryInfo);
    }

    public final void onError(String str) throws RemoteException {
        this.zzdji.onFailure(str);
    }

    public final void zza(String str, String str2, Bundle bundle) throws RemoteException {
        QueryInfo queryInfo = new QueryInfo(new zzyf(str, bundle));
        zzvh.zzph().put(queryInfo, str2);
        this.zzdji.onSuccess(queryInfo);
    }
}
