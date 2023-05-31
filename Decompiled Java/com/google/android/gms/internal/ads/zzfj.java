package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbs;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzfj extends zzfv {
    public zzfj(zzei zzei, String str, String str2, zzbs.zza.zzb zzb, int i, int i2) {
        super(zzei, str, str2, zzb, i, 3);
    }

    /* access modifiers changed from: protected */
    public final void zzcs() throws IllegalAccessException, InvocationTargetException {
        boolean booleanValue = ((Boolean) zzvh.zzpd().zzd(zzzx.zzcly)).booleanValue();
        zzdu zzdu = new zzdu((String) this.zzaah.invoke((Object) null, new Object[]{this.zzuy.getContext(), Boolean.valueOf(booleanValue)}));
        synchronized (this.zzzx) {
            this.zzzx.zzal(zzdu.zzxb);
            this.zzzx.zzbn(zzdu.zzxc);
        }
    }
}
