package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbyl implements zzeej<zzpo> {
    private final zzeew<zzazo> zzffi;
    private final zzeew<String> zzffj;

    public zzbyl(zzeew<zzazo> zzeew, zzeew<String> zzeew2) {
        this.zzffi = zzeew;
        this.zzffj = zzeew2;
    }

    public final /* synthetic */ Object get() {
        zzq.zzkv();
        return (zzpo) zzeep.zza(new zzpo(zzawo.zzwp(), this.zzffi.get(), this.zzffj.get(), new JSONObject(), false, true), "Cannot return null from a non-@Nullable @Provides method");
    }
}
