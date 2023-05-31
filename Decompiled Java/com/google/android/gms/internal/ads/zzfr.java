package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbs;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzfr extends zzfv {
    public zzfr(zzei zzei, String str, String str2, zzbs.zza.zzb zzb, int i, int i2) {
        super(zzei, str, str2, zzb, i, 48);
    }

    /* access modifiers changed from: protected */
    public final void zzcs() throws IllegalAccessException, InvocationTargetException {
        this.zzzx.zzf(zzcd.ENUM_FAILURE);
        boolean booleanValue = ((Boolean) this.zzaah.invoke((Object) null, new Object[]{this.zzuy.getContext()})).booleanValue();
        synchronized (this.zzzx) {
            if (booleanValue) {
                this.zzzx.zzf(zzcd.ENUM_TRUE);
            } else {
                this.zzzx.zzf(zzcd.ENUM_FALSE);
            }
        }
    }
}
