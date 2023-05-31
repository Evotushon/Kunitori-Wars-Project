package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GoogleApiAvailabilityCache;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zaan extends zaas {
    final /* synthetic */ zaai zago;
    private final Map<Api.Client, zaak> zagr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zaan(zaai zaai, Map<Api.Client, zaak> map) {
        super(zaai, (zaal) null);
        this.zago = zaai;
        this.zagr = map;
    }

    @GuardedBy("mLock")
    @WorkerThread
    public final void zaak() {
        GoogleApiAvailabilityCache googleApiAvailabilityCache = new GoogleApiAvailabilityCache(this.zago.zafc);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Api.Client next : this.zagr.keySet()) {
            if (!next.requiresGooglePlayServices() || this.zagr.get(next).zaeg) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList3 = arrayList;
            int size = arrayList3.size();
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                i = googleApiAvailabilityCache.getClientAvailability(this.zago.mContext, (Api.Client) obj);
                if (i != 0) {
                    break;
                }
            }
        } else {
            ArrayList arrayList4 = arrayList2;
            int size2 = arrayList4.size();
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                i = googleApiAvailabilityCache.getClientAvailability(this.zago.mContext, (Api.Client) obj2);
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            this.zago.zafy.zaa((zabf) new zaam(this, this.zago, new ConnectionResult(i, (PendingIntent) null)));
            return;
        }
        if (this.zago.zagh && this.zago.zagf != null) {
            this.zago.zagf.connect();
        }
        for (Api.Client next2 : this.zagr.keySet()) {
            BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = this.zagr.get(next2);
            if (!next2.requiresGooglePlayServices() || googleApiAvailabilityCache.getClientAvailability(this.zago.mContext, next2) == 0) {
                next2.connect(connectionProgressReportCallbacks);
            } else {
                this.zago.zafy.zaa((zabf) new zaap(this, this.zago, connectionProgressReportCallbacks));
            }
        }
    }
}
