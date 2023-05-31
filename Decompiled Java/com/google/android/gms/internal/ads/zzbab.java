package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzbab<T> {
    private final zzazy<T> zzdxv = new zzazy<>();
    /* access modifiers changed from: private */
    public final AtomicInteger zzdxw = new AtomicInteger(0);

    public zzbab() {
        zzdnt.zza(this.zzdxv, new zzbae(this), zzazq.zzdxp);
    }

    @Deprecated
    public final void zza(zzbac<T> zzbac, zzbaa zzbaa) {
        zzdnt.zza(this.zzdxv, new zzbad(this, zzbac, zzbaa), zzazq.zzdxp);
    }

    @Deprecated
    public final void zzm(T t) {
        this.zzdxv.set(t);
    }

    @Deprecated
    public final void reject() {
        this.zzdxv.setException(new Exception());
    }

    @Deprecated
    public final int getStatus() {
        return this.zzdxw.get();
    }
}
