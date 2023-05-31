package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbjs {
    /* access modifiers changed from: private */
    public final Executor executor;
    private final String zzbmi;
    private final zzakt zzfdw;
    /* access modifiers changed from: private */
    public zzbkb zzfdx;
    private final zzafz<Object> zzfdy = new zzbjv(this);
    private final zzafz<Object> zzfdz = new zzbjx(this);

    public zzbjs(String str, zzakt zzakt, Executor executor2) {
        this.zzbmi = str;
        this.zzfdw = zzakt;
        this.executor = executor2;
    }

    public final void zza(zzbkb zzbkb) {
        this.zzfdw.zzc("/updateActiveView", this.zzfdy);
        this.zzfdw.zzc("/untrackActiveViewUnit", this.zzfdz);
        this.zzfdx = zzbkb;
    }

    public final void zzd(zzbdv zzbdv) {
        zzbdv.zza("/updateActiveView", (zzafz<? super zzbdv>) this.zzfdy);
        zzbdv.zza("/untrackActiveViewUnit", (zzafz<? super zzbdv>) this.zzfdz);
    }

    public final void zze(zzbdv zzbdv) {
        zzbdv.zzb("/updateActiveView", (zzafz<? super zzbdv>) this.zzfdy);
        zzbdv.zzb("/untrackActiveViewUnit", (zzafz<? super zzbdv>) this.zzfdz);
    }

    public final void zzafv() {
        this.zzfdw.zzd("/updateActiveView", this.zzfdy);
        this.zzfdw.zzd("/untrackActiveViewUnit", this.zzfdz);
    }

    /* access modifiers changed from: private */
    public final boolean zzl(@Nullable Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        if (TextUtils.isEmpty(str) || !str.equals(this.zzbmi)) {
            return false;
        }
        return true;
    }
}
