package jp.co.koeitecmo.DFusion;

import android.util.Log;
import com.adjust.sdk.Constants;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsResponseListener;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jp.co.koeitecmo.DFusion.IAPBCJni;

class IAPBCListener implements PurchasesUpdatedListener, BillingClientStateListener {
    private static final String TAG = "ktasdk.IAPBCListener";
    public static ConsumeResponseListener mConsumeFinishedListener = new ConsumeResponseListener() {
        public void onConsumeResponse(BillingResult billingResult, String str) {
            int responseCode = billingResult.getResponseCode();
            String debugMessage = billingResult.getDebugMessage();
            if (responseCode != 0) {
                Log.e(IAPBCListener.TAG, "Consume error. msg=" + debugMessage);
                IAPBCJni.InAppConsumeErrored(responseCode);
            } else {
                Log.d(IAPBCListener.TAG, "Consumption successful. Provisioning.");
                int i = -1;
                Iterator<Purchase> it = IAPBCJni.arPurchase.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Purchase next = it.next();
                    if (next.getPurchaseToken().equals(str)) {
                        i = IAPBCJni.arPurchase.indexOf(next);
                        break;
                    }
                }
                if (i >= 0) {
                    IAPBCJni.arPurchase.remove(i);
                }
                IAPBCJni.InAppConsumeFinished();
            }
            Log.d(IAPBCListener.TAG, "End consumption flow.");
            IAPBCJni.m_activity.runOnUiThread(new Runnable() {
                public void run() {
                    IAPBCJni.m_activity.m_Indicator.dismiss();
                }
            });
        }
    };
    static PurchasesResponseListener mQueryPurchasesAsyncFinishedINAPPListener = new PurchasesResponseListener() {
        public void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {
            String str;
            String str2 = "";
            Log.d(IAPBCListener.TAG, "queryCheckConsumeAsync INAPP results size: " + list.toString());
            IAPBCJni.arPurchase.clear();
            for (Purchase next : list) {
                if (next.getPurchaseState() == 1) {
                    Log.d(IAPBCListener.TAG, "queryCheckConsumeAsync: unconsumed item found.");
                    IAPBCJni.arPurchase.add(next);
                    try {
                        str = URLEncoder.encode(next.getOriginalJson(), Constants.ENCODING);
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                        str = str2;
                    }
                    try {
                        str2 = URLEncoder.encode(next.getSignature(), Constants.ENCODING);
                    } catch (UnsupportedEncodingException e2) {
                        e2.printStackTrace();
                    }
                    IAPBCJni.InAppFinished(IAPBCJni.arPurchase.indexOf(next), str, str2);
                    return;
                } else if (next.getPurchaseState() == 2) {
                    Log.d(IAPBCListener.TAG, "Received a pending purchase of SKU: " + next.getSkus().get(0));
                } else {
                    Log.e(IAPBCListener.TAG, "purchase UNSPECIFIED_STATE. purchase:" + next.toString());
                }
            }
            Log.d(IAPBCListener.TAG, "queryCheckConsumeAsync: unconsumed item not found.");
            IAPBCJni.InAppCheckConsumeFinished();
        }
    };
    static SkuDetailsResponseListener mSkuDetailFinishedSetupForINAPPListener = new SkuDetailsResponseListener() {
        public void onSkuDetailsResponse(BillingResult billingResult, List<SkuDetails> list) {
            Log.d(IAPBCListener.TAG, "Query SkuDetails for INAPP finished.(set up)");
            int responseCode = billingResult.getResponseCode();
            String debugMessage = billingResult.getDebugMessage();
            if (responseCode != 0) {
                Log.e(IAPBCListener.TAG, "Query SkuDetails for INAPP error: " + debugMessage);
                IAPBCJni.InAppSetUpErrored(responseCode);
                IAPBCJni.m_activity.runOnUiThread(new Runnable() {
                    public void run() {
                        IAPBCJni.m_activity.m_Indicator.dismiss();
                    }
                });
                return;
            }
            Log.d(IAPBCListener.TAG, "Query SkuDetails for INAPP was successful. msg=" + debugMessage);
            Log.d(IAPBCListener.TAG, "INAPP list is >" + list);
            IAPBCJni.arSkuDetails = list;
            Log.d(IAPBCListener.TAG, "Set up finished for INAPP;");
            ArrayList arrayList = new ArrayList();
            for (SkuDetails next : list) {
                IAPBCJni.Product product = new IAPBCJni.Product();
                IAPBCJni.Product.strProductId = next.getSku();
                IAPBCJni.Product.strType = next.getType();
                IAPBCJni.Product.iPrice = Integer.parseInt(next.getPrice().replaceAll("[^0-9]", ""));
                IAPBCJni.Product.strShowName = next.getTitle();
                IAPBCJni.Product.strDescription = next.getDescription();
                arrayList.add(product);
            }
            IAPBCJni.InAppSetUpFinished();
            IAPBCJni.m_activity.runOnUiThread(new Runnable() {
                public void run() {
                    IAPBCJni.m_activity.m_Indicator.dismiss();
                }
            });
        }
    };

    IAPBCListener() {
    }

    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        String str;
        Log.d(TAG, "onPurchasesUpdatedListener start.");
        int responseCode = billingResult.getResponseCode();
        String debugMessage = billingResult.getDebugMessage();
        if (responseCode != 0) {
            Log.e(TAG, "onPurchasesUpdate failed purchase. msg:" + debugMessage);
            IAPBCJni.InAppErrored(responseCode);
            return;
        }
        Log.d(TAG, "Purchase successful.");
        Iterator<Purchase> it = list.iterator();
        if (it.hasNext()) {
            Purchase next = it.next();
            String str2 = "";
            if (next.getPurchaseState() == 1) {
                Log.d(TAG, "Items:" + next.toString());
                IAPBCJni.arPurchase.add(next);
                try {
                    str = URLEncoder.encode(next.getOriginalJson(), Constants.ENCODING);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    str = str2;
                }
                try {
                    str2 = URLEncoder.encode(next.getSignature(), Constants.ENCODING);
                } catch (UnsupportedEncodingException e2) {
                    e2.printStackTrace();
                }
            } else {
                if (next.getPurchaseState() == 2) {
                    Log.d(TAG, "Received a pending purchase of SKU: " + next.getSkus().get(0));
                } else {
                    Log.e(TAG, "purchase UNSPECIFIED_STATE. purchase:" + next.toString());
                }
                str = str2;
            }
            IAPBCJni.InAppFinished(IAPBCJni.arPurchase.indexOf(next), str, str2);
            IAPBCJni.m_activity.runOnUiThread(new Runnable() {
                public void run() {
                    IAPBCJni.m_activity.m_Indicator.dismiss();
                }
            });
        }
    }

    public void onBillingSetupFinished(BillingResult billingResult) {
        int responseCode = billingResult.getResponseCode();
        String debugMessage = billingResult.getDebugMessage();
        if (responseCode != 0) {
            Log.e(TAG, "Billing Client failed to set up. msg: " + debugMessage);
            IAPBCJni.InAppSetUpErrored(responseCode);
            return;
        }
        Log.d(TAG, "Billing Client set up complete. msg:" + debugMessage);
        IAPBCJni.querySkuDetailsAsync("inapp", IAPBCJni.arINAPPSku, mSkuDetailFinishedSetupForINAPPListener);
    }

    public void onBillingServiceDisconnected() {
        Log.d(TAG, "billing client destroyed.");
    }
}
