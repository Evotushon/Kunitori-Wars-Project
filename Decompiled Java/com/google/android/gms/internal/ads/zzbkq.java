package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbkq {
    private final View view;
    private final zzbdv zzdae;
    private final zzdeh zzffr;
    private final int zzffs;
    private final boolean zzfft;

    public zzbkq(View view2, @Nullable zzbdv zzbdv, zzdeh zzdeh, int i, boolean z) {
        this.view = view2;
        this.zzdae = zzbdv;
        this.zzffr = zzdeh;
        this.zzffs = i;
        this.zzfft = z;
    }

    @Nullable
    public final zzbdv zzagc() {
        return this.zzdae;
    }

    public final View zzagd() {
        return this.view;
    }

    public final zzdeh zzage() {
        return this.zzffr;
    }

    public final int zzagf() {
        return this.zzffs;
    }

    public final boolean zzagg() {
        return this.zzfft;
    }
}
