package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzbnf {
    protected final zzdeq zzfdp;
    protected final zzdei zzfhg;
    private final zzbqw zzfhu;
    private final zzbrm zzfhv;
    @Nullable
    private final zzdcl zzfhw;
    private final zzbqc zzfhx;

    protected zzbnf(zzbne zzbne) {
        this.zzfdp = zzbne.zzfdp;
        this.zzfhg = zzbne.zzfhg;
        this.zzfhu = zzbne.zzfhu;
        this.zzfhv = zzbne.zzfhv;
        this.zzfhw = zzbne.zzfhw;
        this.zzfhx = zzbne.zzfhx;
    }

    public final zzbqw zzahh() {
        return this.zzfhu;
    }

    public void zzags() {
        this.zzfhv.onAdLoaded();
    }

    public final zzbqc zzahi() {
        return this.zzfhx;
    }

    public void destroy() {
        this.zzfhu.zzca((Context) null);
    }

    @Nullable
    public final zzdcl zzahj() {
        return this.zzfhw;
    }
}
