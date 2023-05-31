package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzdpl<PrimitiveT, KeyT> {
    private final Class<PrimitiveT> zzhdy;

    public zzdpl(Class<PrimitiveT> cls) {
        this.zzhdy = cls;
    }

    public abstract PrimitiveT zzak(KeyT keyt) throws GeneralSecurityException;

    /* access modifiers changed from: package-private */
    public final Class<PrimitiveT> zzauy() {
        return this.zzhdy;
    }
}
