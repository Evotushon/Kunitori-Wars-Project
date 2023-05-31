package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbs;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzfp extends zzfv {
    private final zzer zzvp;
    private long zzzi;

    public zzfp(zzei zzei, String str, String str2, zzbs.zza.zzb zzb, int i, int i2, zzer zzer) {
        super(zzei, str, str2, zzb, i, 53);
        this.zzvp = zzer;
        if (zzer != null) {
            this.zzzi = zzer.zzcq();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzcs() throws IllegalAccessException, InvocationTargetException {
        if (this.zzvp != null) {
            this.zzzx.zzbl(((Long) this.zzaah.invoke((Object) null, new Object[]{Long.valueOf(this.zzzi)})).longValue());
        }
    }
}
