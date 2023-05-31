package com.android.billingclient.api;

import android.text.TextUtils;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
public final class zzbb {
    private String zza;

    private zzbb() {
    }

    /* synthetic */ zzbb(zzba zzba) {
    }

    public final zzbb zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzbd zzb() {
        if (!TextUtils.isEmpty(this.zza)) {
            return new zzbd(this.zza, (String) null, (String) null, 0, (zzbc) null);
        }
        throw new IllegalArgumentException("SKU must be set.");
    }
}
