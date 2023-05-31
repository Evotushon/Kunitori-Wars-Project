package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdzy implements zzebg {
    private static final zzeai zzhuw = new zzdzx();
    private final zzeai zzhuv;

    public zzdzy() {
        this(new zzeaa(zzdyx.zzbcr(), zzbdy()));
    }

    private zzdzy(zzeai zzeai) {
        this.zzhuv = (zzeai) zzdzc.zza(zzeai, "messageInfoFactory");
    }

    public final <T> zzebd<T> zzg(Class<T> cls) {
        zzebf.zzi(cls);
        zzeaf zzd = this.zzhuv.zzd(cls);
        if (zzd.zzbed()) {
            if (zzdyz.class.isAssignableFrom(cls)) {
                return zzean.zza(zzebf.zzbet(), zzdyq.zzbcl(), zzd.zzbee());
            }
            return zzean.zza(zzebf.zzber(), zzdyq.zzbcm(), zzd.zzbee());
        } else if (zzdyz.class.isAssignableFrom(cls)) {
            if (zza(zzd)) {
                return zzeal.zza(cls, zzd, zzear.zzbej(), zzdzr.zzbdx(), zzebf.zzbet(), zzdyq.zzbcl(), zzeag.zzbeg());
            }
            return zzeal.zza(cls, zzd, zzear.zzbej(), zzdzr.zzbdx(), zzebf.zzbet(), (zzdyo<?>) null, zzeag.zzbeg());
        } else if (zza(zzd)) {
            return zzeal.zza(cls, zzd, zzear.zzbei(), zzdzr.zzbdw(), zzebf.zzber(), zzdyq.zzbcm(), zzeag.zzbef());
        } else {
            return zzeal.zza(cls, zzd, zzear.zzbei(), zzdzr.zzbdw(), zzebf.zzbes(), (zzdyo<?>) null, zzeag.zzbef());
        }
    }

    private static boolean zza(zzeaf zzeaf) {
        return zzeaf.zzbec() == zzdyz.zzf.zzhtk;
    }

    private static zzeai zzbdy() {
        try {
            return (zzeai) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return zzhuw;
        }
    }
}
