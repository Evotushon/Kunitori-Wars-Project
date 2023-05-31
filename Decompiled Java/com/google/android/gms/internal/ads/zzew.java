package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.internal.ads.zzbs;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzew extends zzfv {
    private final Activity zzzo;
    private final View zzzp;

    public zzew(zzei zzei, String str, String str2, zzbs.zza.zzb zzb, int i, int i2, View view, Activity activity) {
        super(zzei, str, str2, zzb, i, 62);
        this.zzzp = view;
        this.zzzo = activity;
    }

    /* access modifiers changed from: protected */
    public final void zzcs() throws IllegalAccessException, InvocationTargetException {
        if (this.zzzp != null) {
            boolean booleanValue = ((Boolean) zzvh.zzpd().zzd(zzzx.zzclv)).booleanValue();
            Object[] objArr = (Object[]) this.zzaah.invoke((Object) null, new Object[]{this.zzzp, this.zzzo, Boolean.valueOf(booleanValue)});
            synchronized (this.zzzx) {
                this.zzzx.zzbp(((Long) objArr[0]).longValue());
                this.zzzx.zzbq(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.zzzx.zzam((String) objArr[2]);
                }
            }
        }
    }
}
