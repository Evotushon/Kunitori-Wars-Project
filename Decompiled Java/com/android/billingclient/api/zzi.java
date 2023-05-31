package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.Nullable;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
final class zzi {
    private final Context zza;
    /* access modifiers changed from: private */
    public final zzh zzb;

    zzi(Context context, zzaw zzaw) {
        this.zza = context;
        this.zzb = new zzh(this, (zzaw) null, (zzg) null);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final zzaw zzb() {
        zzaw unused = this.zzb.zzc;
        return null;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final PurchasesUpdatedListener zzc() {
        return this.zzb.zzb;
    }

    /* access modifiers changed from: package-private */
    public final void zzd() {
        this.zzb.zzd(this.zza);
    }

    /* access modifiers changed from: package-private */
    public final void zze() {
        this.zzb.zzc(this.zza, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"));
    }

    zzi(Context context, PurchasesUpdatedListener purchasesUpdatedListener) {
        this.zza = context;
        this.zzb = new zzh(this, purchasesUpdatedListener, (zzg) null);
    }
}
