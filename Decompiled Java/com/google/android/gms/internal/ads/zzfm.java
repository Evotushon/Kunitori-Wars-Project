package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbs;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzfm extends zzfv {
    public zzfm(zzei zzei, String str, String str2, zzbs.zza.zzb zzb, int i, int i2) {
        super(zzei, str, str2, zzb, i, 73);
    }

    /* access modifiers changed from: protected */
    public final void zzcs() throws IllegalAccessException, InvocationTargetException {
        try {
            this.zzzx.zzi(((Boolean) this.zzaah.invoke((Object) null, new Object[]{this.zzuy.getContext()})).booleanValue() ? zzcd.ENUM_TRUE : zzcd.ENUM_FALSE);
        } catch (InvocationTargetException unused) {
            this.zzzx.zzi(zzcd.ENUM_FAILURE);
        }
    }
}
