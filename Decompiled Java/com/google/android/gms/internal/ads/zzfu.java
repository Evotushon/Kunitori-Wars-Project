package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.internal.ads.zzbs;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzfu extends zzfv {
    private final View zzzp;

    public zzfu(zzei zzei, String str, String str2, zzbs.zza.zzb zzb, int i, int i2, View view) {
        super(zzei, str, str2, zzb, i, 57);
        this.zzzp = view;
    }

    /* access modifiers changed from: protected */
    public final void zzcs() throws IllegalAccessException, InvocationTargetException {
        if (this.zzzp != null) {
            Boolean bool = (Boolean) zzvh.zzpd().zzd(zzzx.zzcml);
            DisplayMetrics displayMetrics = this.zzuy.getContext().getResources().getDisplayMetrics();
            zzes zzes = new zzes((String) this.zzaah.invoke((Object) null, new Object[]{this.zzzp, displayMetrics, bool}));
            zzbs.zza.zzf.C0007zza zzau = zzbs.zza.zzf.zzau();
            zzau.zzdc(zzes.zzzj.longValue()).zzdd(zzes.zzzk.longValue()).zzde(zzes.zzzl.longValue());
            if (bool.booleanValue()) {
                zzau.zzdf(zzes.zzzm.longValue());
            }
            this.zzzx.zzb((zzbs.zza.zzf) ((zzdyz) zzau.zzbcx()));
        }
    }
}
