package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
final class zzam {
    private final List zza;
    private final BillingResult zzb;

    zzam(BillingResult billingResult, @Nullable List list) {
        this.zza = list;
        this.zzb = billingResult;
    }

    /* access modifiers changed from: package-private */
    public final BillingResult zza() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final List zzb() {
        return this.zza;
    }
}
