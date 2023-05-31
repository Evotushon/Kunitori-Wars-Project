package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeah;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzdpv<KeyProtoT extends zzeah, PublicKeyProtoT extends zzeah> extends zzdpj<KeyProtoT> {
    private final Class<PublicKeyProtoT> zzher;

    @SafeVarargs
    protected zzdpv(Class<KeyProtoT> cls, Class<PublicKeyProtoT> cls2, zzdpl<?, KeyProtoT>... zzdplArr) {
        super(cls, zzdplArr);
        this.zzher = cls2;
    }
}
