package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbs;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzfg extends zzfv {
    private static final Object zzzw = new Object();
    private static volatile Long zzzy;

    public zzfg(zzei zzei, String str, String str2, zzbs.zza.zzb zzb, int i, int i2) {
        super(zzei, str, str2, zzb, i, 22);
    }

    /* access modifiers changed from: protected */
    public final void zzcs() throws IllegalAccessException, InvocationTargetException {
        if (zzzy == null) {
            synchronized (zzzw) {
                if (zzzy == null) {
                    zzzy = (Long) this.zzaah.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.zzzx) {
            this.zzzx.zzav(zzzy.longValue());
        }
    }
}
