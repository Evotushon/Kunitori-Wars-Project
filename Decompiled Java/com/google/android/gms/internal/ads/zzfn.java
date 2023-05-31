package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbs;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzfn extends zzfv {
    private final StackTraceElement[] zzaac;

    public zzfn(zzei zzei, String str, String str2, zzbs.zza.zzb zzb, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzei, str, str2, zzb, i, 45);
        this.zzaac = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    public final void zzcs() throws IllegalAccessException, InvocationTargetException {
        zzcd zzcd;
        if (this.zzaac != null) {
            zzeg zzeg = new zzeg((String) this.zzaah.invoke((Object) null, new Object[]{this.zzaac}));
            synchronized (this.zzzx) {
                this.zzzx.zzbi(zzeg.zzxl.longValue());
                if (zzeg.zzxm.booleanValue()) {
                    zzbs.zza.zzb zzb = this.zzzx;
                    if (zzeg.zzxn.booleanValue()) {
                        zzcd = zzcd.ENUM_FALSE;
                    } else {
                        zzcd = zzcd.ENUM_TRUE;
                    }
                    zzb.zzh(zzcd);
                } else {
                    this.zzzx.zzh(zzcd.ENUM_FAILURE);
                }
            }
        }
    }
}
