package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zaco {
    public static final Status zalc = new Status(8, "The connection to Google Play services was lost");
    private static final BasePendingResult<?>[] zald = new BasePendingResult[0];
    private final Map<Api.AnyClientKey<?>, Api.Client> zahd;
    @VisibleForTesting
    final Set<BasePendingResult<?>> zale = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private final zacs zalf = new zacr(this);

    public zaco(Map<Api.AnyClientKey<?>, Api.Client> map) {
        this.zahd = map;
    }

    /* access modifiers changed from: package-private */
    public final void zab(BasePendingResult<? extends Result> basePendingResult) {
        this.zale.add(basePendingResult);
        basePendingResult.zaa(this.zalf);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.common.api.ResultCallback, com.google.android.gms.common.api.internal.zacs, com.google.android.gms.common.api.internal.zacr, com.google.android.gms.common.api.zad] */
    public final void release() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.zale.toArray(zald)) {
            ? r5 = 0;
            basePendingResult.zaa((zacs) r5);
            if (basePendingResult.zal() != null) {
                basePendingResult.setResultCallback(r5);
                IBinder serviceBrokerBinder = this.zahd.get(((BaseImplementation.ApiMethodImpl) basePendingResult).getClientKey()).getServiceBrokerBinder();
                if (basePendingResult.isReady()) {
                    basePendingResult.zaa((zacs) new zacq(basePendingResult, r5, serviceBrokerBinder, r5));
                } else if (serviceBrokerBinder == null || !serviceBrokerBinder.isBinderAlive()) {
                    basePendingResult.zaa((zacs) r5);
                    basePendingResult.cancel();
                    r5.remove(basePendingResult.zal().intValue());
                } else {
                    zacq zacq = new zacq(basePendingResult, r5, serviceBrokerBinder, r5);
                    basePendingResult.zaa((zacs) zacq);
                    try {
                        serviceBrokerBinder.linkToDeath(zacq, 0);
                    } catch (RemoteException unused) {
                        basePendingResult.cancel();
                        r5.remove(basePendingResult.zal().intValue());
                    }
                }
                this.zale.remove(basePendingResult);
            } else if (basePendingResult.zar()) {
                this.zale.remove(basePendingResult);
            }
        }
    }

    public final void zabv() {
        for (BasePendingResult zab : (BasePendingResult[]) this.zale.toArray(zald)) {
            zab.zab(zalc);
        }
    }
}
