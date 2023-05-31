package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbs;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzfq extends zzfv {
    public zzfq(zzei zzei, String str, String str2, zzbs.zza.zzb zzb, int i, int i2) {
        super(zzei, str, str2, zzb, i, 51);
    }

    /* access modifiers changed from: protected */
    public final void zzcs() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.zzzx) {
            zzej zzej = new zzej((String) this.zzaah.invoke((Object) null, new Object[0]));
            this.zzzx.zzbj(zzej.zzye.longValue());
            this.zzzx.zzbk(zzej.zzyf.longValue());
        }
    }
}
