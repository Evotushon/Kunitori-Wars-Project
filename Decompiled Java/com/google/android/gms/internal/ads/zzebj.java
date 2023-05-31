package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzebj extends zzebp {
    private final /* synthetic */ zzebi zzhxd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzebj(zzebi zzebi) {
        super(zzebi, (zzebh) null);
        this.zzhxd = zzebi;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzebk(this.zzhxd, (zzebh) null);
    }

    /* synthetic */ zzebj(zzebi zzebi, zzebh zzebh) {
        this(zzebi);
    }
}
