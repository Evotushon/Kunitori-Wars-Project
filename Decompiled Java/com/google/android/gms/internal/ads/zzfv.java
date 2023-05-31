package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbs;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzfv implements Callable {
    private final String TAG = getClass().getSimpleName();
    private final String className;
    private final String zzaaf;
    protected Method zzaah;
    private final int zzaak;
    private final int zzaal;
    protected final zzei zzuy;
    protected final zzbs.zza.zzb zzzx;

    public zzfv(zzei zzei, String str, String str2, zzbs.zza.zzb zzb, int i, int i2) {
        this.zzuy = zzei;
        this.className = str;
        this.zzaaf = str2;
        this.zzzx = zzb;
        this.zzaak = i;
        this.zzaal = i2;
    }

    /* access modifiers changed from: protected */
    public abstract void zzcs() throws IllegalAccessException, InvocationTargetException;

    /* renamed from: zzcu */
    public Void call() throws Exception {
        try {
            long nanoTime = System.nanoTime();
            this.zzaah = this.zzuy.zza(this.className, this.zzaaf);
            if (this.zzaah == null) {
                return null;
            }
            zzcs();
            zzde zzch = this.zzuy.zzch();
            if (!(zzch == null || this.zzaak == Integer.MIN_VALUE)) {
                zzch.zza(this.zzaal, this.zzaak, (System.nanoTime() - nanoTime) / 1000);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
