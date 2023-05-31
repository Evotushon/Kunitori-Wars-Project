package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbs;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzfb extends zzfv {
    private long startTime;

    public zzfb(zzei zzei, String str, String str2, zzbs.zza.zzb zzb, long j, int i, int i2) {
        super(zzei, str, str2, zzb, i, 25);
        this.startTime = j;
    }

    /* access modifiers changed from: protected */
    public final void zzcs() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzaah.invoke((Object) null, new Object[0])).longValue();
        synchronized (this.zzzx) {
            this.zzzx.zzbr(longValue);
            if (this.startTime != 0) {
                this.zzzx.zzat(longValue - this.startTime);
                this.zzzx.zzaw(this.startTime);
            }
        }
    }
}
