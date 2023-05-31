package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeah;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdps<PrimitiveT, KeyProtoT extends zzeah, PublicKeyProtoT extends zzeah> extends zzdph<PrimitiveT, KeyProtoT> implements zzdpe<PrimitiveT> {
    private final zzdpv<KeyProtoT, PublicKeyProtoT> zzhek;
    private final zzdpj<PublicKeyProtoT> zzhel;

    public zzdps(zzdpv<KeyProtoT, PublicKeyProtoT> zzdpv, zzdpj<PublicKeyProtoT> zzdpj, Class<PrimitiveT> cls) {
        super(zzdpv, cls);
        this.zzhek = zzdpv;
        this.zzhel = zzdpj;
    }
}
