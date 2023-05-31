package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import com.android.vending.billing.util.IabHelper;
import com.google.android.gms.internal.play_billing.zzb;
import java.util.ArrayList;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
final class zzay {
    static BillingResult zza(Bundle bundle, String str, String str2) {
        BillingResult billingResult = zzat.zzj;
        if (bundle == null) {
            zzb.zzn("BillingClient", String.format("%s got null owned items list", new Object[]{str2}));
            return billingResult;
        }
        int zzb = zzb.zzb(bundle, "BillingClient");
        String zzj = zzb.zzj(bundle, "BillingClient");
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(zzb);
        newBuilder.setDebugMessage(zzj);
        BillingResult build = newBuilder.build();
        if (zzb != 0) {
            zzb.zzn("BillingClient", String.format("%s failed. Response code: %s", new Object[]{str2, Integer.valueOf(zzb)}));
            return build;
        } else if (!bundle.containsKey(IabHelper.RESPONSE_INAPP_ITEM_LIST) || !bundle.containsKey(IabHelper.RESPONSE_INAPP_PURCHASE_DATA_LIST) || !bundle.containsKey(IabHelper.RESPONSE_INAPP_SIGNATURE_LIST)) {
            zzb.zzn("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", new Object[]{str2}));
            return billingResult;
        } else {
            ArrayList<String> stringArrayList = bundle.getStringArrayList(IabHelper.RESPONSE_INAPP_ITEM_LIST);
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList(IabHelper.RESPONSE_INAPP_PURCHASE_DATA_LIST);
            ArrayList<String> stringArrayList3 = bundle.getStringArrayList(IabHelper.RESPONSE_INAPP_SIGNATURE_LIST);
            if (stringArrayList == null) {
                zzb.zzn("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", new Object[]{str2}));
                return billingResult;
            } else if (stringArrayList2 == null) {
                zzb.zzn("BillingClient", String.format("Bundle returned from %s contains null purchases list.", new Object[]{str2}));
                return billingResult;
            } else if (stringArrayList3 != null) {
                return zzat.zzl;
            } else {
                zzb.zzn("BillingClient", String.format("Bundle returned from %s contains null signatures list.", new Object[]{str2}));
                return billingResult;
            }
        }
    }
}
