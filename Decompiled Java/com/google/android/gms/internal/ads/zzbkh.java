package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbkh implements zzeej<zzpo> {
    private final zzeew<JSONObject> zzenn;
    private final zzeew<zzdei> zzffh;
    private final zzeew<zzazo> zzffi;
    private final zzeew<String> zzffj;

    private zzbkh(zzeew<zzdei> zzeew, zzeew<zzazo> zzeew2, zzeew<JSONObject> zzeew3, zzeew<String> zzeew4) {
        this.zzffh = zzeew;
        this.zzffi = zzeew2;
        this.zzenn = zzeew3;
        this.zzffj = zzeew4;
    }

    public static zzbkh zza(zzeew<zzdei> zzeew, zzeew<zzazo> zzeew2, zzeew<JSONObject> zzeew3, zzeew<String> zzeew4) {
        return new zzbkh(zzeew, zzeew2, zzeew3, zzeew4);
    }

    public final /* synthetic */ Object get() {
        zzdei zzdei = this.zzffh.get();
        String str = this.zzffj.get();
        boolean equals = "native".equals(str);
        zzq.zzkv();
        return (zzpo) zzeep.zza(new zzpo(zzawo.zzwp(), this.zzffi.get(), str, this.zzenn.get(), false, equals), "Cannot return null from a non-@Nullable @Provides method");
    }
}
