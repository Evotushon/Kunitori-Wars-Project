package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.InAppMessageResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.zzbd;
import com.android.vending.billing.util.IabHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
public final class zzb {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zza(Intent intent, String str) {
        if (intent != null) {
            return zzp(intent.getExtras(), "ProxyBillingActivity");
        }
        zzn("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int zzb(Bundle bundle, String str) {
        if (bundle == null) {
            zzn(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get(IabHelper.RESPONSE_CODE);
        if (obj == null) {
            zzm(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            String valueOf = String.valueOf(obj.getClass().getName());
            zzn(str, valueOf.length() != 0 ? "Unexpected type for bundle response code: ".concat(valueOf) : new String("Unexpected type for bundle response code: "));
            return 6;
        }
    }

    public static Bundle zzc(AcknowledgePurchaseParams acknowledgePurchaseParams, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    public static Bundle zzd(ConsumeParams consumeParams, boolean z, String str) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        return bundle;
    }

    public static Bundle zze(int i, boolean z, String str, @Nullable String str2, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        if (i >= 9) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (i >= 9 && z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (i >= 14) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            boolean z2 = false;
            boolean z3 = false;
            for (int i2 = 0; i2 < size; i2++) {
                zzbd zzbd = (zzbd) arrayList.get(i2);
                arrayList2.add((Object) null);
                z2 |= !TextUtils.isEmpty((CharSequence) null);
                arrayList3.add((Object) null);
                z3 |= !TextUtils.isEmpty((CharSequence) null);
                arrayList4.add(0);
            }
            if (z2) {
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
            }
            if (z3) {
                bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList3);
            }
        }
        return bundle;
    }

    public static Bundle zzf(BillingFlowParams billingFlowParams, boolean z, boolean z2, boolean z3, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (billingFlowParams.zza() != 0) {
            bundle.putInt(BillingFlowParams.EXTRA_PARAM_KEY_REPLACE_SKUS_PRORATION_MODE, billingFlowParams.zza());
        }
        if (!TextUtils.isEmpty(billingFlowParams.zzb())) {
            bundle.putString(BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID, billingFlowParams.zzb());
        }
        if (!TextUtils.isEmpty(billingFlowParams.zzc())) {
            bundle.putString("obfuscatedProfileId", billingFlowParams.zzc());
        }
        if (billingFlowParams.getVrPurchaseFlow()) {
            bundle.putBoolean(BillingFlowParams.EXTRA_PARAM_KEY_VR, true);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            bundle.putStringArrayList(BillingFlowParams.EXTRA_PARAM_KEY_OLD_SKUS, new ArrayList(Arrays.asList(new String[]{null})));
        }
        if (!TextUtils.isEmpty(billingFlowParams.zzd())) {
            bundle.putString(BillingFlowParams.EXTRA_PARAM_KEY_OLD_SKU_PURCHASE_TOKEN, billingFlowParams.zzd());
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            bundle.putString("oldSkuPurchaseId", (String) null);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            bundle.putString("paymentsPurchaseParams", (String) null);
        }
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z3) {
            bundle.putBoolean("enableAlternativeBilling", true);
        }
        return bundle;
    }

    public static Bundle zzg(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static BillingResult zzh(Intent intent, String str) {
        if (intent == null) {
            zzn("BillingHelper", "Got null intent!");
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(6);
            newBuilder.setDebugMessage("An internal error occurred.");
            return newBuilder.build();
        }
        BillingResult.Builder newBuilder2 = BillingResult.newBuilder();
        newBuilder2.setResponseCode(zzb(intent.getExtras(), str));
        newBuilder2.setDebugMessage(zzj(intent.getExtras(), str));
        return newBuilder2.build();
    }

    public static InAppMessageResult zzi(Bundle bundle, String str) {
        if (bundle == null) {
            return new InAppMessageResult(0, (String) null);
        }
        return new InAppMessageResult(zzp(bundle, "BillingClient"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
    }

    public static String zzj(Bundle bundle, String str) {
        if (bundle == null) {
            zzn(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzm(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            String valueOf = String.valueOf(obj.getClass().getName());
            zzn(str, valueOf.length() != 0 ? "Unexpected type for debug message: ".concat(valueOf) : new String("Unexpected type for debug message: "));
            return "";
        }
    }

    public static String zzk(int i) {
        return zza.zza(i).toString();
    }

    @Nullable
    public static List zzl(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(IabHelper.RESPONSE_INAPP_PURCHASE_DATA_LIST);
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList(IabHelper.RESPONSE_INAPP_SIGNATURE_LIST);
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase zzq = zzq(bundle.getString(IabHelper.RESPONSE_INAPP_PURCHASE_DATA), bundle.getString(IabHelper.RESPONSE_INAPP_SIGNATURE));
            if (zzq == null) {
                zzm("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(zzq);
        } else {
            int size = stringArrayList.size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Found purchase list of ");
            sb.append(size);
            sb.append(" items");
            zzm("BillingHelper", sb.toString());
            int i = 0;
            while (i < stringArrayList.size() && i < stringArrayList2.size()) {
                Purchase zzq2 = zzq(stringArrayList.get(i), stringArrayList2.get(i));
                if (zzq2 != null) {
                    arrayList.add(zzq2);
                }
                i++;
            }
        }
        return arrayList;
    }

    public static void zzm(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }

    public static void zzn(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void zzo(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    private static int zzp(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        zzn(str, "Unexpected null bundle received!");
        return 0;
    }

    @Nullable
    private static Purchase zzq(String str, String str2) {
        if (str == null || str2 == null) {
            zzm("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            zzn("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return null;
        }
    }
}
