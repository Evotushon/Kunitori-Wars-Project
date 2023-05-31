package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbbb {
    private final Context zzcgw;
    private final zzbbm zzdza;
    private final ViewGroup zzdzv;
    private zzbav zzdzw;

    public zzbbb(Context context, ViewGroup viewGroup, zzbdv zzbdv) {
        this(context, viewGroup, zzbdv, (zzbav) null);
    }

    @VisibleForTesting
    private zzbbb(Context context, ViewGroup viewGroup, zzbbm zzbbm, zzbav zzbav) {
        this.zzcgw = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzdzv = viewGroup;
        this.zzdza = zzbbm;
        this.zzdzw = null;
    }

    public final void zze(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzbav zzbav = this.zzdzw;
        if (zzbav != null) {
            zzbav.zzd(i, i2, i3, i4);
        }
    }

    public final void zza(int i, int i2, int i3, int i4, int i5, boolean z, zzbbj zzbbj) {
        if (this.zzdzw == null) {
            zzaaf.zza(this.zzdza.zzyv().zzqw(), this.zzdza.zzyr(), "vpr2");
            Context context = this.zzcgw;
            zzbbm zzbbm = this.zzdza;
            this.zzdzw = new zzbav(context, zzbbm, i5, z, zzbbm.zzyv().zzqw(), zzbbj);
            this.zzdzv.addView(this.zzdzw, 0, new ViewGroup.LayoutParams(-1, -1));
            int i6 = i;
            int i7 = i2;
            int i8 = i3;
            int i9 = i4;
            this.zzdzw.zzd(i, i2, i3, i4);
            this.zzdza.zzav(false);
        }
    }

    public final zzbav zzyj() {
        Preconditions.checkMainThread("getAdVideoUnderlay must be called from the UI thread.");
        return this.zzdzw;
    }

    public final void onPause() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzbav zzbav = this.zzdzw;
        if (zzbav != null) {
            zzbav.pause();
        }
    }

    public final void onDestroy() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzbav zzbav = this.zzdzw;
        if (zzbav != null) {
            zzbav.destroy();
            this.zzdzv.removeView(this.zzdzw);
            this.zzdzw = null;
        }
    }
}
