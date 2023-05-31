package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbs;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzfc extends zzfv {
    private static volatile Long zzzv;
    private static final Object zzzw = new Object();

    public zzfc(zzei zzei, String str, String str2, zzbs.zza.zzb zzb, int i, int i2) {
        super(zzei, str, str2, zzb, i, 44);
    }

    /* access modifiers changed from: protected */
    public final void zzcs() throws IllegalAccessException, InvocationTargetException {
        if (zzzv == null) {
            synchronized (zzzw) {
                if (zzzv == null) {
                    zzzv = (Long) this.zzaah.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.zzzx) {
            this.zzzx.zzbh(zzzv.longValue());
        }
    }
}
