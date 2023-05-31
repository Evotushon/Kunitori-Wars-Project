package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbs;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzey extends zzfv {
    private static zzfy<String> zzzt = new zzfy<>();
    private final Context zzzr;

    public zzey(zzei zzei, String str, String str2, zzbs.zza.zzb zzb, int i, int i2, Context context) {
        super(zzei, str, str2, zzb, i, 29);
        this.zzzr = context;
    }

    /* access modifiers changed from: protected */
    public final void zzcs() throws IllegalAccessException, InvocationTargetException {
        this.zzzx.zzai("E");
        AtomicReference<String> zzaw = zzzt.zzaw(this.zzzr.getPackageName());
        if (zzaw.get() == null) {
            synchronized (zzaw) {
                if (zzaw.get() == null) {
                    zzaw.set((String) this.zzaah.invoke((Object) null, new Object[]{this.zzzr}));
                }
            }
        }
        String str = zzaw.get();
        synchronized (this.zzzx) {
            this.zzzx.zzai(zzci.zza(str.getBytes(), true));
        }
    }
}
