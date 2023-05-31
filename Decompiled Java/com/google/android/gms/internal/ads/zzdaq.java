package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdaq implements zzeej<zzcyd<JSONObject>> {
    public static zzcyd<JSONObject> zza(zzavj zzavj, Object obj, zzcyy zzcyy, zzczv zzczv, zzeed<zzcys> zzeed, zzeed<zzczc> zzeed2, zzeed<zzczg> zzeed3, zzeed<zzczm> zzeed4, zzeed<zzczr> zzeed5, zzeed<zzdaa> zzeed6, zzeed<zzdae> zzeed7, zzeed<zzdas> zzeed8, Executor executor) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzczn) obj);
        hashSet.add(zzcyy);
        hashSet.add(zzczv);
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcqc)).booleanValue()) {
            hashSet.add(zzeed.get());
        }
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcqd)).booleanValue()) {
            hashSet.add(zzeed2.get());
        }
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcqe)).booleanValue()) {
            hashSet.add(zzeed3.get());
        }
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcqf)).booleanValue()) {
            hashSet.add(zzeed4.get());
        }
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcqj)).booleanValue()) {
            hashSet.add(zzeed6.get());
        }
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcql)).booleanValue()) {
            hashSet.add(zzeed7.get());
        }
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcqm)).booleanValue()) {
            hashSet.add(zzeed8.get());
        }
        return (zzcyd) zzeep.zza(new zzcyd(executor, hashSet), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        throw new NoSuchMethodError();
    }
}
