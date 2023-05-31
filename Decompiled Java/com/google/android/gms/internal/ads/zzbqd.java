package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbqd implements zzeej<zzaub> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzdei> zzffh;
    private final zzbqe zzfkg;
    private final zzeew<zzazo> zzfkh;
    private final zzeew<zzaud> zzfki;

    private zzbqd(zzbqe zzbqe, zzeew<Context> zzeew, zzeew<zzazo> zzeew2, zzeew<zzdei> zzeew3, zzeew<zzaud> zzeew4) {
        this.zzfkg = zzbqe;
        this.zzelc = zzeew;
        this.zzfkh = zzeew2;
        this.zzffh = zzeew3;
        this.zzfki = zzeew4;
    }

    public static zzbqd zza(zzbqe zzbqe, zzeew<Context> zzeew, zzeew<zzazo> zzeew2, zzeew<zzdei> zzeew3, zzeew<zzaud> zzeew4) {
        return new zzbqd(zzbqe, zzeew, zzeew2, zzeew3, zzeew4);
    }

    @Nullable
    public final /* synthetic */ Object get() {
        Context context = this.zzelc.get();
        zzazo zzazo = this.zzfkh.get();
        zzdei zzdei = this.zzffh.get();
        zzaud zzaud = this.zzfki.get();
        if (zzdei.zzgpu != null) {
            return new zzats(context, zzazo, zzdei.zzgpu, zzdei.zzgpq.zzdiu, zzaud);
        }
        return null;
    }
}
