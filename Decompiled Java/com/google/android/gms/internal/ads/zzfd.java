package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbs;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzfd implements Callable {
    private final zzei zzuy;
    private final zzbs.zza.zzb zzzx;

    public zzfd(zzei zzei, zzbs.zza.zzb zzb) {
        this.zzuy = zzei;
        this.zzzx = zzb;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzcu */
    public final Void call() throws Exception {
        if (this.zzuy.zzcl() != null) {
            this.zzuy.zzcl().get();
        }
        zzbs.zza zzck = this.zzuy.zzck();
        if (zzck == null) {
            return null;
        }
        try {
            synchronized (this.zzzx) {
                zzbs.zza.zzb zzb = this.zzzx;
                byte[] byteArray = zzck.toByteArray();
                zzb.zza(byteArray, 0, byteArray.length, zzdym.zzbch());
            }
            return null;
        } catch (zzdzh unused) {
            return null;
        }
    }
}
