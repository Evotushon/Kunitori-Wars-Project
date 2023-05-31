package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbs;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzfo extends zzfv {
    private final boolean zzaad;

    public zzfo(zzei zzei, String str, String str2, zzbs.zza.zzb zzb, int i, int i2) {
        super(zzei, str, str2, zzb, i, 61);
        this.zzaad = zzei.zzcj();
    }

    /* access modifiers changed from: protected */
    public final void zzcs() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzaah.invoke((Object) null, new Object[]{this.zzuy.getContext(), Boolean.valueOf(this.zzaad)})).longValue();
        synchronized (this.zzzx) {
            this.zzzx.zzbo(longValue);
        }
    }
}
