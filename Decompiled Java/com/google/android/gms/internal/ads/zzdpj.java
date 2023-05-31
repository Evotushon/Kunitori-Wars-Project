package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzduc;
import com.google.android.gms.internal.ads.zzeah;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzdpj<KeyProtoT extends zzeah> {
    private final Class<KeyProtoT> zzhdy;
    private final Map<Class<?>, zzdpl<?, KeyProtoT>> zzhdz;
    private final Class<?> zzhea;

    @SafeVarargs
    protected zzdpj(Class<KeyProtoT> cls, zzdpl<?, KeyProtoT>... zzdplArr) {
        this.zzhdy = cls;
        HashMap hashMap = new HashMap();
        int length = zzdplArr.length;
        int i = 0;
        while (i < length) {
            zzdpl<?, KeyProtoT> zzdpl = zzdplArr[i];
            if (hashMap.containsKey(zzdpl.zzauy())) {
                String valueOf = String.valueOf(zzdpl.zzauy().getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            } else {
                hashMap.put(zzdpl.zzauy(), zzdpl);
                i++;
            }
        }
        if (zzdplArr.length > 0) {
            this.zzhea = zzdplArr[0].zzauy();
        } else {
            this.zzhea = Void.class;
        }
        this.zzhdz = Collections.unmodifiableMap(hashMap);
    }

    public abstract String getKeyType();

    public abstract zzduc.zzb zzavc();

    public abstract void zze(KeyProtoT keyprotot) throws GeneralSecurityException;

    public abstract KeyProtoT zzr(zzdxn zzdxn) throws zzdzh;

    public final Class<KeyProtoT> zzavb() {
        return this.zzhdy;
    }

    public final <P> P zza(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        zzdpl zzdpl = this.zzhdz.get(cls);
        if (zzdpl != null) {
            return zzdpl.zzak(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
        sb.append("Requested primitive class ");
        sb.append(canonicalName);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final Set<Class<?>> zzavd() {
        return this.zzhdz.keySet();
    }

    /* access modifiers changed from: package-private */
    public final Class<?> zzave() {
        return this.zzhea;
    }

    public zzdpi<?, KeyProtoT> zzavf() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }
}
