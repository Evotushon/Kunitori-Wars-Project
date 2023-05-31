package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbnv {
    private final zzdeq zzenb;
    private final zzdei zzfdq;
    private final String zzfik;

    public zzbnv(zzdeq zzdeq, zzdei zzdei, @Nullable String str) {
        this.zzenb = zzdeq;
        this.zzfdq = zzdei;
        this.zzfik = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public final zzdeq zzahm() {
        return this.zzenb;
    }

    public final zzdei zzahn() {
        return this.zzfdq;
    }

    public final String zzaho() {
        return this.zzfik;
    }
}
