package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zze;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcri implements zze {
    @GuardedBy("this")
    private zze zzgfa;

    public final synchronized void zza(zze zze) {
        this.zzgfa = zze;
    }

    public final synchronized void zzg(View view) {
        if (this.zzgfa != null) {
            this.zzgfa.zzg(view);
        }
    }

    public final synchronized void zzjw() {
        if (this.zzgfa != null) {
            this.zzgfa.zzjw();
        }
    }

    public final synchronized void zzjx() {
        if (this.zzgfa != null) {
            this.zzgfa.zzjx();
        }
    }
}
