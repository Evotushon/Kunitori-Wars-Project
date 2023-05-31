package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzbvz {
    @Nullable
    private final zzbdv zzdae;
    private final zzbxb zzfmb;

    public zzbvz(zzbxb zzbxb) {
        this(zzbxb, (zzbdv) null);
    }

    public zzbvz(zzbxb zzbxb, @Nullable zzbdv zzbdv) {
        this.zzfmb = zzbxb;
        this.zzdae = zzbdv;
    }

    public final zzbxb zzajc() {
        return this.zzfmb;
    }

    @Nullable
    public final zzbdv zzagc() {
        return this.zzdae;
    }

    @Nullable
    public final View zzajd() {
        zzbdv zzbdv = this.zzdae;
        if (zzbdv != null) {
            return zzbdv.getWebView();
        }
        return null;
    }

    @Nullable
    public final View zzaje() {
        zzbdv zzbdv = this.zzdae;
        if (zzbdv == null) {
            return null;
        }
        return zzbdv.getWebView();
    }

    public Set<zzbuv<zzbqh>> zza(zzbxc zzbxc) {
        return Collections.singleton(zzbuv.zzb(zzbxc, zzazq.zzdxp));
    }

    public final zzbuv<zzbsr> zzb(Executor executor) {
        return new zzbuv<>(new zzbwb(this.zzdae), executor);
    }
}
