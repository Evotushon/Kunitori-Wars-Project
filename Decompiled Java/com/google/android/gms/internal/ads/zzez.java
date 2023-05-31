package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbs;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzez extends zzfv {
    public zzez(zzei zzei, String str, String str2, zzbs.zza.zzb zzb, int i, int i2) {
        super(zzei, str, str2, zzb, i, 5);
    }

    /* access modifiers changed from: protected */
    public final void zzcs() throws IllegalAccessException, InvocationTargetException {
        this.zzzx.zzam(-1);
        this.zzzx.zzan(-1);
        int[] iArr = (int[]) this.zzaah.invoke((Object) null, new Object[]{this.zzuy.getContext()});
        synchronized (this.zzzx) {
            this.zzzx.zzam((long) iArr[0]);
            this.zzzx.zzan((long) iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.zzzx.zzbm((long) iArr[2]);
            }
        }
    }
}
