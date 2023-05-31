package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzbln {
    private final View view;
    private final zzbdv zzdae;
    private final zzdeh zzffr;
    private final zzbnc zzfgd;

    public zzbln(View view2, @Nullable zzbdv zzbdv, zzbnc zzbnc, zzdeh zzdeh) {
        this.view = view2;
        this.zzdae = zzbdv;
        this.zzfgd = zzbnc;
        this.zzffr = zzdeh;
    }

    @Nullable
    public final zzbdv zzagc() {
        return this.zzdae;
    }

    public final View zzagm() {
        return this.view;
    }

    public final zzbnc zzagu() {
        return this.zzfgd;
    }

    public final zzdeh zzagv() {
        return this.zzffr;
    }

    public zzbrm zza(Set<zzbuv<zzbrn>> set) {
        return new zzbrm(set);
    }
}
