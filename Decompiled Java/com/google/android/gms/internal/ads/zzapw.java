package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzapw {
    @Nullable
    private final zzxr zzabh;
    private final AdFormat zzdjh;
    private final Context zzur;

    public zzapw(Context context, AdFormat adFormat, @Nullable zzxr zzxr) {
        this.zzur = context;
        this.zzdjh = adFormat;
        this.zzabh = zzxr;
    }

    public final void zza(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzuh zzuh;
        zzavb zzt = zzt(this.zzur);
        if (zzt == null) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
            return;
        }
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zzur);
        zzxr zzxr = this.zzabh;
        if (zzxr == null) {
            zzuh = new zzug().zzop();
        } else {
            zzuh = zzui.zza(this.zzur, zzxr);
        }
        try {
            zzt.zza(wrap, new zzavh((String) null, this.zzdjh.name(), (zzuk) null, zzuh), new zzapy(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }

    @Nullable
    private static zzavb zzt(Context context) {
        try {
            return ((zzavg) zzazk.zza(context, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", zzapv.zzbun)).zzf(ObjectWrapper.wrap(context), 20089000);
        } catch (RemoteException | zzazm | NullPointerException unused) {
            return null;
        }
    }
}
