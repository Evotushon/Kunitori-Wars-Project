package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.zzbs;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzfe extends zzfv {
    public zzfe(zzei zzei, String str, String str2, zzbs.zza.zzb zzb, int i, int i2) {
        super(zzei, str, str2, zzb, i, 24);
    }

    public final Void zzcu() throws Exception {
        if (this.zzuy.isInitialized()) {
            return super.call();
        }
        if (!this.zzuy.zzcg()) {
            return null;
        }
        zzcv();
        return null;
    }

    /* access modifiers changed from: protected */
    public final void zzcs() throws IllegalAccessException, InvocationTargetException {
        if (this.zzuy.zzcg()) {
            zzcv();
            return;
        }
        synchronized (this.zzzx) {
            this.zzzx.zzan((String) this.zzaah.invoke((Object) null, new Object[]{this.zzuy.getContext()}));
        }
    }

    private final void zzcv() {
        AdvertisingIdClient zzco = this.zzuy.zzco();
        if (zzco != null) {
            try {
                AdvertisingIdClient.Info info = zzco.getInfo();
                String zzau = zzep.zzau(info.getId());
                if (zzau != null) {
                    synchronized (this.zzzx) {
                        this.zzzx.zzan(zzau);
                        this.zzzx.zzb(info.isLimitAdTrackingEnabled());
                        this.zzzx.zzb(zzbs.zza.zzc.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    public final /* synthetic */ Object call() throws Exception {
        return call();
    }
}
