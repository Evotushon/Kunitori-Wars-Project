package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaan extends zzaao {
    private final zze zzcte;
    @Nullable
    private final String zzctf;
    private final String zzctg;

    public zzaan(zze zze, @Nullable String str, String str2) {
        this.zzcte = zze;
        this.zzctf = str;
        this.zzctg = str2;
    }

    public final String zzqx() {
        return this.zzctf;
    }

    public final String getContent() {
        return this.zzctg;
    }

    public final void zzn(@Nullable IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper != null) {
            this.zzcte.zzg((View) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public final void recordClick() {
        this.zzcte.zzjw();
    }

    public final void recordImpression() {
        this.zzcte.zzjx();
    }
}
