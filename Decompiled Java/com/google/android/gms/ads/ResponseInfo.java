package com.google.android.gms.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzxe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class ResponseInfo {
    private final zzxe zzaca;

    private ResponseInfo(zzxe zzxe) {
        this.zzaca = zzxe;
    }

    @Nullable
    public final String getMediationAdapterClassName() {
        try {
            return this.zzaca.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzazh.zzc("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    @Nullable
    public final String getResponseId() {
        try {
            return this.zzaca.getResponseId();
        } catch (RemoteException e) {
            zzazh.zzc("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    @Nullable
    public static ResponseInfo zza(@Nullable zzxe zzxe) {
        if (zzxe != null) {
            return new ResponseInfo(zzxe);
        }
        return null;
    }
}
