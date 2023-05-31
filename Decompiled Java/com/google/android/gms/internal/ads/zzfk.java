package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbs;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzfk extends zzfv {
    private static volatile String zzaaa;
    private static final Object zzzw = new Object();

    public zzfk(zzei zzei, String str, String str2, zzbs.zza.zzb zzb, int i, int i2) {
        super(zzei, str, str2, zzb, i, 1);
    }

    /* access modifiers changed from: protected */
    public final void zzcs() throws IllegalAccessException, InvocationTargetException {
        this.zzzx.zzaf("E");
        if (zzaaa == null) {
            synchronized (zzzw) {
                if (zzaaa == null) {
                    zzaaa = (String) this.zzaah.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.zzzx) {
            this.zzzx.zzaf(zzaaa);
        }
    }
}
