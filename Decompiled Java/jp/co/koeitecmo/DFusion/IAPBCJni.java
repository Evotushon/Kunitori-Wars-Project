package jp.co.koeitecmo.DFusion;

import android.app.Application;
import android.util.Log;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jp.co.koeitecmo.ktgl.Jni;

public class IAPBCJni extends Jni {
    public static final int RC_REQUEST = 10001;
    private static final String TAG = "ktasdk.IAPBCJni";
    public static List<String> arINAPPSku;
    public static ArrayList<Purchase> arPurchase;
    public static String[] arSKUs;
    public static List<String> arSUBSSku;
    public static List<SkuDetails> arSkuDetails;
    protected static BillingClient billingClient;
    protected static KTBaseActivity m_activity;
    /* access modifiers changed from: private */
    public static IAPBCListener m_listener;

    public static class Product {
        public static int iPrice;
        public static String strDescription;
        public static String strProductId;
        public static String strShowName;
        public static String strType;
    }

    public static native void InAppCheckConsumeErrored(int i);

    public static native void InAppCheckConsumeFinished();

    public static native void InAppConsumeErrored(int i);

    public static native void InAppConsumeFinished();

    public static native void InAppErrored(int i);

    public static native void InAppFinished(int i, String str, String str2);

    public static native void InAppGetProductListErrored(int i);

    public static native void InAppGetProductListFinished(ArrayList<Product> arrayList, int i);

    public static void InAppPurchaseController_requestGetProductListBC(String[] strArr) {
    }

    public static void InAppPurchaseController_requestRestoreBC(String[] strArr) {
    }

    public static native void InAppRestoreErrored(int i);

    public static native void InAppRestoreFinished(ArrayList<Purchase> arrayList, ArrayList<SkuDetails> arrayList2);

    public static native void InAppSetUpErrored(int i);

    public static native void InAppSetUpFinished();

    public IAPBCJni(Application application, KTBaseActivity kTBaseActivity, KTBaseView kTBaseView) {
        super(kTBaseView, application);
        m_activity = kTBaseActivity;
        m_listener = new IAPBCListener();
    }

    public static void InAppPurchaseController_createBC(String[] strArr) {
        StartInAppSetupBC(strArr);
    }

    public static void StartInAppSetupBC(String[] strArr) {
        Log.d(TAG, "Starting setup.");
        if (billingClient == null) {
            billingClient = BillingClient.newBuilder(m_activity).setListener(m_listener).enablePendingPurchases().build();
        }
        if (billingClient.isReady()) {
            InAppSetUpFinished();
            return;
        }
        arINAPPSku = Arrays.asList(strArr);
        arPurchase = new ArrayList<>();
        arSkuDetails = new ArrayList();
        billingClient.startConnection(m_listener);
    }

    public static void querySkuDetailsAsync(String str, List<String> list, SkuDetailsResponseListener skuDetailsResponseListener) {
        SkuDetailsParams build = SkuDetailsParams.newBuilder().setSkusList(list).setType(str).build();
        Log.d(TAG, "querySkuDetailsAsync for " + str);
        billingClient.querySkuDetailsAsync(build, skuDetailsResponseListener);
    }

    public static void InAppPurchaseController_checkConsumeBC(String[] strArr) {
        queryCheckConsumeAsync();
    }

    public static void queryCheckConsumeAsync() {
        Log.d(TAG, "queryCheckConsumeAsync called");
        BillingClient billingClient2 = billingClient;
        IAPBCListener iAPBCListener = m_listener;
        billingClient2.queryPurchasesAsync("inapp", IAPBCListener.mQueryPurchasesAsyncFinishedINAPPListener);
    }

    public static void InAppPurchaseController_requestAddPaymentBC(String str, final String str2) {
        Log.d(TAG, "c2j_OnBuyButtonClicked.");
        Log.d(TAG, "Launching purchase flow = " + str);
        final SkuDetails skuDetailsByProductID = getSkuDetailsByProductID(str);
        if (skuDetailsByProductID == null) {
            InAppErrored(-7000);
        } else {
            m_activity.runOnUiThread(new Runnable() {
                public void run() {
                    int responseCode = IAPBCJni.billingClient.launchBillingFlow(IAPBCJni.m_activity, BillingFlowParams.newBuilder().setSkuDetails(SkuDetails.this).setObfuscatedAccountId(str2).build()).getResponseCode();
                    if (responseCode != 0) {
                        Log.e(IAPBCJni.TAG, "BillingFlow \"failed\" to start.");
                        IAPBCJni.InAppErrored(responseCode);
                    }
                    Log.d(IAPBCJni.TAG, "BillingFlow start.");
                }
            });
        }
    }

    public static boolean InAppPurchaseController_callFinishTransactionBC(int i) {
        Purchase purchase = arPurchase.get(i);
        if (purchase == null) {
            return false;
        }
        final ConsumeParams build = ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build();
        m_activity.runOnUiThread(new Runnable() {
            public void run() {
                BillingClient billingClient = IAPBCJni.billingClient;
                ConsumeParams consumeParams = ConsumeParams.this;
                IAPBCListener unused = IAPBCJni.m_listener;
                billingClient.consumeAsync(consumeParams, IAPBCListener.mConsumeFinishedListener);
                IAPBCJni.m_activity.m_Indicator.show();
            }
        });
        return true;
    }

    public static void InAppPurchaseController_destroyBC() {
        Log.d(TAG, "c2j_BillingDestroyBC.");
        billingDestroyBC();
    }

    public static void billingDestroyBC() {
        Log.d(TAG, "Destroying billingClient.");
        BillingClient billingClient2 = billingClient;
        if (billingClient2 != null) {
            billingClient2.endConnection();
            billingClient = null;
        }
    }

    private static SkuDetails getSkuDetailsByProductID(String str) {
        for (SkuDetails next : arSkuDetails) {
            if (next.getSku().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
