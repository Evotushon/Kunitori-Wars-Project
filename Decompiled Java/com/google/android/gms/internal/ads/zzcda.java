package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.overlay.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcda implements zzp, zzv, zzafe, zzafg, zztz {
    private zztz zzcch;
    private zzafe zzcxu;
    private zzafg zzcxv;
    private zzp zzdit;
    private zzv zzdix;

    private zzcda() {
    }

    public final synchronized void onAdClicked() {
        if (this.zzcch != null) {
            this.zzcch.onAdClicked();
        }
    }

    public final synchronized void zztj() {
        if (this.zzdit != null) {
            this.zzdit.zztj();
        }
    }

    public final synchronized void onPause() {
        if (this.zzdit != null) {
            this.zzdit.onPause();
        }
    }

    public final synchronized void onResume() {
        if (this.zzdit != null) {
            this.zzdit.onResume();
        }
    }

    public final synchronized void zztk() {
        if (this.zzdit != null) {
            this.zzdit.zztk();
        }
    }

    public final synchronized void zzub() {
        if (this.zzdix != null) {
            this.zzdix.zzub();
        }
    }

    public final synchronized void zza(String str, Bundle bundle) {
        if (this.zzcxu != null) {
            this.zzcxu.zza(str, bundle);
        }
    }

    public final synchronized void onAppEvent(String str, @Nullable String str2) {
        if (this.zzcxv != null) {
            this.zzcxv.onAppEvent(str, str2);
        }
    }

    /* access modifiers changed from: private */
    public final synchronized void zza(zztz zztz, zzafe zzafe, zzp zzp, zzafg zzafg, zzv zzv) {
        this.zzcch = zztz;
        this.zzcxu = zzafe;
        this.zzdit = zzp;
        this.zzcxv = zzafg;
        this.zzdix = zzv;
    }

    /* synthetic */ zzcda(zzccw zzccw) {
        this();
    }
}
