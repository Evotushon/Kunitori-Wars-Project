package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.play_billing.zzb;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
final class zzh extends BroadcastReceiver {
    final /* synthetic */ zzi zza;
    /* access modifiers changed from: private */
    public final PurchasesUpdatedListener zzb;
    /* access modifiers changed from: private */
    public final zzaw zzc;
    private boolean zzd;

    /* synthetic */ zzh(zzi zzi, zzaw zzaw, zzg zzg) {
        this.zza = zzi;
        this.zzb = null;
        this.zzc = null;
    }

    public final void onReceive(Context context, Intent intent) {
        this.zzb.onPurchasesUpdated(zzb.zzh(intent, "BillingBroadcastManager"), zzb.zzl(intent.getExtras()));
    }

    public final void zzc(Context context, IntentFilter intentFilter) {
        if (!this.zzd) {
            context.registerReceiver(this.zza.zzb, intentFilter);
            this.zzd = true;
        }
    }

    public final void zzd(Context context) {
        if (this.zzd) {
            context.unregisterReceiver(this.zza.zzb);
            this.zzd = false;
            return;
        }
        zzb.zzn("BillingBroadcastManager", "Receiver is not registered.");
    }

    /* synthetic */ zzh(zzi zzi, PurchasesUpdatedListener purchasesUpdatedListener, zzg zzg) {
        this.zza = zzi;
        this.zzb = purchasesUpdatedListener;
        this.zzc = null;
    }
}
