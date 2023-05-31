package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbjo implements zzbqt {
    private final zzdfb zzfdo;

    public zzbjo(zzdfb zzdfb) {
        this.zzfdo = zzdfb;
    }

    public final void zzby(@Nullable Context context) {
        try {
            this.zzfdo.pause();
        } catch (zzdfa e) {
            zzawf.zzd("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    public final void zzbz(@Nullable Context context) {
        try {
            this.zzfdo.resume();
            if (context != null) {
                this.zzfdo.onContextChanged(context);
            }
        } catch (zzdfa e) {
            zzawf.zzd("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    public final void zzca(@Nullable Context context) {
        try {
            this.zzfdo.destroy();
        } catch (zzdfa e) {
            zzawf.zzd("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }
}
