package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzceq implements zzbqt {
    @Nullable
    private final zzbdv zzdae;

    zzceq(@Nullable zzbdv zzbdv) {
        this.zzdae = !((Boolean) zzvh.zzpd().zzd(zzzx.zzcjo)).booleanValue() ? null : zzbdv;
    }

    public final void zzby(@Nullable Context context) {
        zzbdv zzbdv = this.zzdae;
        if (zzbdv != null) {
            zzbdv.onPause();
        }
    }

    public final void zzbz(@Nullable Context context) {
        zzbdv zzbdv = this.zzdae;
        if (zzbdv != null) {
            zzbdv.onResume();
        }
    }

    public final void zzca(@Nullable Context context) {
        zzbdv zzbdv = this.zzdae;
        if (zzbdv != null) {
            zzbdv.destroy();
        }
    }
}
