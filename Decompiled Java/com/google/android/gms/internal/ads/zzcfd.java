package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcfd implements zzeej<zzsn> {
    private final zzeew<Context> zzelc;
    private final zzeew<Integer> zzffj;
    private final zzeew<String> zzfjs;
    private final zzeew<zzazo> zzfkh;
    private final zzeew<String> zzfuy;

    private zzcfd(zzeew<Context> zzeew, zzeew<String> zzeew2, zzeew<zzazo> zzeew3, zzeew<Integer> zzeew4, zzeew<String> zzeew5) {
        this.zzelc = zzeew;
        this.zzfjs = zzeew2;
        this.zzfkh = zzeew3;
        this.zzffj = zzeew4;
        this.zzfuy = zzeew5;
    }

    public static zzcfd zze(zzeew<Context> zzeew, zzeew<String> zzeew2, zzeew<zzazo> zzeew3, zzeew<Integer> zzeew4, zzeew<String> zzeew5) {
        return new zzcfd(zzeew, zzeew2, zzeew3, zzeew4, zzeew5);
    }

    public final /* synthetic */ Object get() {
        String str = this.zzfjs.get();
        zzazo zzazo = this.zzfkh.get();
        int intValue = this.zzffj.get().intValue();
        String str2 = this.zzfuy.get();
        zzsn zzsn = new zzsn(new zzss(this.zzelc.get()));
        zztu zztu = new zztu();
        zztu.zzcba = Integer.valueOf(zzazo.zzdxf);
        zztu.zzcbb = Integer.valueOf(zzazo.zzdxg);
        zztu.zzcbc = Integer.valueOf(zzazo.zzdxh ? 0 : 2);
        zzsn.zza((zzsq) new zzcfa(intValue, str, zztu, str2));
        return (zzsn) zzeep.zza(zzsn, "Cannot return null from a non-@Nullable @Provides method");
    }
}
