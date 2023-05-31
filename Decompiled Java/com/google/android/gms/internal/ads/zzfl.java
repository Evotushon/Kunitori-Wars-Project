package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbs;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzfl extends zzfv {
    private List<Long> zzaab = null;

    public zzfl(zzei zzei, String str, String str2, zzbs.zza.zzb zzb, int i, int i2) {
        super(zzei, str, str2, zzb, i, 31);
    }

    /* access modifiers changed from: protected */
    public final void zzcs() throws IllegalAccessException, InvocationTargetException {
        this.zzzx.zzax(-1);
        this.zzzx.zzay(-1);
        if (this.zzaab == null) {
            this.zzaab = (List) this.zzaah.invoke((Object) null, new Object[]{this.zzuy.getContext()});
        }
        List<Long> list = this.zzaab;
        if (list != null && list.size() == 2) {
            synchronized (this.zzzx) {
                this.zzzx.zzax(this.zzaab.get(0).longValue());
                this.zzzx.zzay(this.zzaab.get(1).longValue());
            }
        }
    }
}
