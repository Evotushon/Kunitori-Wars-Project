package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbs;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzen implements Runnable {
    private final /* synthetic */ zzei zzyg;
    private final /* synthetic */ int zzyj;
    private final /* synthetic */ boolean zzyk;

    zzen(zzei zzei, int i, boolean z) {
        this.zzyg = zzei;
        this.zzyj = i;
        this.zzyk = z;
    }

    public final void run() {
        zzbs.zza zzb = this.zzyg.zzb(this.zzyj, this.zzyk);
        zzbs.zza unused = this.zzyg.zzxv = zzb;
        if (zzei.zza(this.zzyj, zzb)) {
            this.zzyg.zza(this.zzyj + 1, this.zzyk);
        }
    }
}
