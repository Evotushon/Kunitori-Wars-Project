package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbxa implements zzp, zzbrn {
    private final zzazo zzblu;
    @Nullable
    private final zzbdv zzdae;
    private final zzdei zzfhg;
    @Nullable
    @VisibleForTesting
    private IObjectWrapper zzfhh;
    private final int zzfmh;
    private final Context zzur;

    public zzbxa(Context context, @Nullable zzbdv zzbdv, zzdei zzdei, zzazo zzazo, int i) {
        this.zzur = context;
        this.zzdae = zzbdv;
        this.zzfhg = zzdei;
        this.zzblu = zzazo;
        this.zzfmh = i;
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void onAdLoaded() {
        int i = this.zzfmh;
        if ((i == 7 || i == 3) && this.zzfhg.zzdmn && this.zzdae != null && zzq.zzlk().zzq(this.zzur)) {
            int i2 = this.zzblu.zzdxf;
            int i3 = this.zzblu.zzdxg;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i2);
            sb.append(".");
            sb.append(i3);
            this.zzfhh = zzq.zzlk().zza(sb.toString(), this.zzdae.getWebView(), "", "javascript", this.zzfhg.zzgqa.optInt("media_type", -1) == 0 ? null : "javascript");
            if (this.zzfhh != null && this.zzdae.getView() != null) {
                zzq.zzlk().zza(this.zzfhh, this.zzdae.getView());
                this.zzdae.zzap(this.zzfhh);
                zzq.zzlk().zzab(this.zzfhh);
            }
        }
    }

    public final void zztj() {
        this.zzfhh = null;
    }

    public final void zztk() {
        zzbdv zzbdv;
        if (this.zzfhh != null && (zzbdv = this.zzdae) != null) {
            zzbdv.zza("onSdkImpression", (Map<String, ?>) new HashMap());
        }
    }
}
