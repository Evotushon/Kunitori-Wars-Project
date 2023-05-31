package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaqf extends zzb<zzaqo> {
    /* access modifiers changed from: protected */
    @VisibleForTesting
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }

    public zzaqf(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(zzars.zzac(context), looper, 8, baseConnectionCallbacks, baseOnConnectionFailedListener, (String) null);
    }

    public final zzaqo zzuc() throws DeadObjectException {
        return (zzaqo) super.getService();
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (queryLocalInterface instanceof zzaqo) {
            return (zzaqo) queryLocalInterface;
        }
        return new zzaqq(iBinder);
    }
}
