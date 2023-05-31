package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzebh extends zzebi<FieldDescriptorType, Object> {
    zzebh(int i) {
        super(i, (zzebh) null);
    }

    public final void zzban() {
        if (!isImmutable()) {
            for (int i = 0; i < zzbew(); i++) {
                Map.Entry zzgx = zzgx(i);
                if (((zzdyr) zzgx.getKey()).zzbcp()) {
                    zzgx.setValue(Collections.unmodifiableList((List) zzgx.getValue()));
                }
            }
            for (Map.Entry entry : zzbex()) {
                if (((zzdyr) entry.getKey()).zzbcp()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzban();
    }
}
