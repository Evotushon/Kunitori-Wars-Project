package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcbr {
    public final int type = 2;
    public final String zzcc;
    public final String zzfsu;
    public final zzacd zzfsv;

    @VisibleForTesting
    public zzcbr(String str, String str2) {
        this.zzcc = str;
        this.zzfsu = str2;
        this.zzfsv = null;
    }

    @VisibleForTesting
    public zzcbr(String str, zzacd zzacd) {
        this.zzcc = str;
        this.zzfsu = null;
        this.zzfsv = zzacd;
    }
}
