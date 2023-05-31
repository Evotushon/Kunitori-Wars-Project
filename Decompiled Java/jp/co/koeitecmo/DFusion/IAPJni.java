package jp.co.koeitecmo.DFusion;

import android.app.Application;
import android.content.Intent;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.android.vending.billing.util.IabHelper;
import com.android.vending.billing.util.IabResult;
import com.android.vending.billing.util.Inventory;
import com.android.vending.billing.util.Purchase;
import com.android.vending.billing.util.SkuDetails;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import jp.co.koeitecmo.ktgl.Jni;

public class IAPJni extends Jni {
    public static final int RC_REQUEST = 10001;
    private static final String TAG = "ktasdk.IAPJni";
    public static ArrayList<Purchase> arPurchase;
    public static String[] arSKUs;
    public static ArrayList<SkuDetails> arSkuDetails;
    static IabHelper.QueryInventoryFinishedListener mCheckConsumeListener = new IabHelper.QueryInventoryFinishedListener() {
        public void onQueryInventoryFinished(IabResult iabResult, Inventory inventory) {
            String str;
            String str2 = "";
            Log.d(IAPJni.TAG, "Query inventory finished.");
            if (IAPJni.mHelper == null) {
                IAPJni.InAppCheckConsumeErrored(-6000);
                IAPJni.m_activity.m_Indicator.dismiss();
            } else if (iabResult.isFailure()) {
                Log.e(IAPJni.TAG, iabResult.toString());
                IAPJni.InAppCheckConsumeErrored(iabResult.getResponse());
                IAPJni.m_activity.m_Indicator.dismiss();
            } else {
                Log.d(IAPJni.TAG, "Query inventory was successful.result is >" + iabResult);
                Log.d(IAPJni.TAG, "inventory is >" + inventory);
                IAPJni.arPurchase.clear();
                for (String purchase : IAPJni.arSKUs) {
                    Purchase purchase2 = inventory.getPurchase(purchase);
                    if (purchase2 != null) {
                        Log.d(IAPJni.TAG, "Unconsumed Item Found");
                        IAPJni.arPurchase.add(purchase2);
                        try {
                            str = URLEncoder.encode(purchase2.getOriginalJson(), Constants.ENCODING);
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                            str = str2;
                        }
                        try {
                            str2 = URLEncoder.encode(purchase2.getSignature(), Constants.ENCODING);
                        } catch (UnsupportedEncodingException e2) {
                            e2.printStackTrace();
                        }
                        IAPJni.InAppFinished(IAPJni.arPurchase.indexOf(purchase2), str, str2);
                        return;
                    }
                }
                IAPJni.InAppCheckConsumeFinished();
                Log.d(IAPJni.TAG, "Initial inventory query finished; enabling main UI.");
                IAPJni.m_activity.m_Indicator.dismiss();
            }
        }
    };
    static IabHelper.OnConsumeFinishedListener mConsumeFinishedListener = new IabHelper.OnConsumeFinishedListener() {
        public void onConsumeFinished(Purchase purchase, IabResult iabResult) {
            Log.d(IAPJni.TAG, "Consumption finished. Purchase: " + purchase + ", result: " + iabResult);
            if (IAPJni.mHelper != null) {
                if (iabResult.isSuccess()) {
                    Log.d(IAPJni.TAG, "Consumption successful. Provisioning.");
                    int i = -1;
                    Iterator<Purchase> it = IAPJni.arPurchase.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Purchase next = it.next();
                        if (next.getOrderId().equals(purchase.getOrderId())) {
                            i = IAPJni.arPurchase.indexOf(next);
                            break;
                        }
                    }
                    if (i >= 0) {
                        IAPJni.arPurchase.remove(i);
                    }
                    IAPJni.InAppConsumeFinished();
                } else {
                    Log.e(IAPJni.TAG, iabResult.toString());
                    IAPJni.InAppConsumeErrored(iabResult.getResponse());
                }
                Log.d(IAPJni.TAG, "End consumption flow.");
                IAPJni.m_activity.runOnUiThread(new Runnable() {
                    public void run() {
                        IAPJni.m_activity.m_Indicator.dismiss();
                    }
                });
            }
        }
    };
    static IabHelper.QueryInventoryFinishedListener mGotProductListListener = new IabHelper.QueryInventoryFinishedListener() {
        public void onQueryInventoryFinished(IabResult iabResult, Inventory inventory) {
            Log.d(IAPJni.TAG, "Query inventory finished.");
            if (IAPJni.mHelper == null) {
                IAPJni.InAppGetProductListErrored(-6000);
                IAPJni.m_activity.m_Indicator.dismiss();
            } else if (iabResult.isFailure()) {
                Log.e(IAPJni.TAG, iabResult.toString());
                IAPJni.InAppGetProductListErrored(iabResult.getResponse());
                IAPJni.m_activity.m_Indicator.dismiss();
            } else {
                Log.d(IAPJni.TAG, "Query inventory was successful.result is >" + iabResult);
                Log.d(IAPJni.TAG, "inventory is >" + inventory);
                ArrayList arrayList = new ArrayList();
                for (String str : IAPJni.arSKUs) {
                    if (inventory.getSkuDetails(str) != null) {
                        Product product = new Product();
                        Product.strProductId = str;
                        Product.iPrice = Integer.parseInt(inventory.getSkuDetails(str).getPrice().replaceAll("[^0-9]", ""));
                        Product.strType = inventory.getSkuDetails(str).getType();
                        Product.strShowName = inventory.getSkuDetails(str).getTitle();
                        Product.strDescription = inventory.getSkuDetails(str).getDescription();
                        arrayList.add(product);
                    }
                }
                IAPJni.InAppGetProductListFinished(arrayList, arrayList.size());
                Log.d(IAPJni.TAG, "Initial inventory query finished; enabling main UI.");
                IAPJni.m_activity.m_Indicator.dismiss();
            }
        }
    };
    static IabHelper.QueryInventoryFinishedListener mGotRestoreListener = new IabHelper.QueryInventoryFinishedListener() {
        public void onQueryInventoryFinished(IabResult iabResult, Inventory inventory) {
            Log.d(IAPJni.TAG, "Query inventory finished.");
            if (IAPJni.mHelper == null) {
                IAPJni.InAppRestoreErrored(-6000);
                IAPJni.m_activity.m_Indicator.dismiss();
            } else if (iabResult.isFailure()) {
                Log.e(IAPJni.TAG, iabResult.toString());
                IAPJni.InAppRestoreErrored(iabResult.getResponse());
                IAPJni.m_activity.m_Indicator.dismiss();
            } else {
                Log.d(IAPJni.TAG, "Query inventory was successful.result is >" + iabResult);
                Log.d(IAPJni.TAG, "inventory is >" + inventory);
                IAPJni.arPurchase.clear();
                for (String str : IAPJni.arSKUs) {
                    Purchase purchase = inventory.getPurchase(str);
                    if (purchase != null) {
                        IAPJni.arPurchase.add(purchase);
                        IAPJni.arSkuDetails.add(inventory.getSkuDetails(str));
                    }
                }
                IAPJni.InAppRestoreFinished(IAPJni.arPurchase, IAPJni.arSkuDetails);
                Log.d(IAPJni.TAG, "restore finished.");
                IAPJni.m_activity.m_Indicator.dismiss();
            }
        }
    };
    public static IabHelper mHelper;
    static IabHelper.OnIabPurchaseFinishedListener mPurchaseFinishedListener = new IabHelper.OnIabPurchaseFinishedListener() {
        public void onIabPurchaseFinished(IabResult iabResult, Purchase purchase) {
            String str;
            String str2 = "";
            Log.d(IAPJni.TAG, "Purchase finished: " + iabResult + ", purchase: " + purchase);
            if (IAPJni.mHelper != null) {
                if (iabResult.isFailure()) {
                    IAPJni.complain("Error purchasing: " + iabResult);
                    try {
                        URLEncoder.encode(iabResult.toString(), Constants.ENCODING);
                        Log.e(IAPJni.TAG, iabResult.toString());
                        IAPJni.InAppErrored(iabResult.getResponse());
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                } else {
                    Log.d(IAPJni.TAG, "Purchase successful.");
                    IAPJni.arPurchase.add(purchase);
                    try {
                        str = URLEncoder.encode(purchase.getOriginalJson(), Constants.ENCODING);
                    } catch (UnsupportedEncodingException e2) {
                        e2.printStackTrace();
                        str = str2;
                    }
                    try {
                        str2 = URLEncoder.encode(purchase.getSignature(), Constants.ENCODING);
                    } catch (UnsupportedEncodingException e3) {
                        e3.printStackTrace();
                    }
                    IAPJni.InAppFinished(IAPJni.arPurchase.indexOf(purchase), str, str2);
                    IAPJni.m_activity.runOnUiThread(new Runnable() {
                        public void run() {
                            IAPJni.m_activity.m_Indicator.dismiss();
                        }
                    });
                }
            }
        }
    };
    protected static KTBaseActivity m_activity;

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

    public static native void InAppRestoreErrored(int i);

    public static native void InAppRestoreFinished(ArrayList<Purchase> arrayList, ArrayList<SkuDetails> arrayList2);

    public static native void InAppSetUpErrored(int i);

    public static native void InAppSetUpFinished();

    public IAPJni(Application application, KTBaseActivity kTBaseActivity, KTBaseView kTBaseView) {
        super(kTBaseView, application);
        m_activity = kTBaseActivity;
    }

    public static boolean handleResult(int i, int i2, Intent intent) {
        return mHelper.handleActivityResult(i, i2, intent);
    }

    public static void InAppPurchaseController_create(String str) {
        billingDestroy();
        StartInAppSetup(str);
    }

    public static void InAppPurchaseController_destroy() {
        Log.d(TAG, "c2j_BillingDestroy.");
        billingDestroy();
    }

    public static void InAppPurchaseController_checkConsume(String[] strArr) {
        QueryInventory(strArr, mCheckConsumeListener);
    }

    public static void InAppPurchaseController_requestGetProductList(String[] strArr) {
        QueryInventory(strArr, mGotProductListListener);
    }

    public static void InAppPurchaseController_requestRestore(String[] strArr) {
        QueryInventory(strArr, mGotRestoreListener);
    }

    public static void InAppPurchaseController_requestAddPayment(final String str, final String str2) {
        Log.d(TAG, "c2j_OnBuyButtonClicked.");
        Log.d(TAG, "Launching purchase flow = " + str);
        m_activity.runOnUiThread(new Runnable() {
            public void run() {
                IAPJni.mHelper.launchPurchaseFlow(IAPJni.m_activity, str, 10001, IAPJni.mPurchaseFinishedListener, str2);
            }
        });
    }

    public static boolean InAppPurchaseController_callFinishTransaction(int i) {
        final Purchase purchase = arPurchase.get(i);
        if (purchase == null) {
            return false;
        }
        m_activity.runOnUiThread(new Runnable() {
            public void run() {
                IAPJni.mHelper.consumeAsync(Purchase.this, IAPJni.mConsumeFinishedListener);
                IAPJni.m_activity.m_Indicator.show();
            }
        });
        return true;
    }

    public static void StartInAppSetup(String str) {
        if (mHelper != null) {
            InAppSetUpFinished();
            return;
        }
        mHelper = new IabHelper(m_activity, str);
        arPurchase = new ArrayList<>();
        mHelper.enableDebugLogging(false);
        Log.d(TAG, "Starting setup.");
        mHelper.startSetup(new IabHelper.OnIabSetupFinishedListener() {
            public void onIabSetupFinished(IabResult iabResult) {
                Log.d(IAPJni.TAG, "Setup finished.");
                if (!iabResult.isSuccess()) {
                    Log.e(IAPJni.TAG, iabResult.toString());
                    IAPJni.InAppSetUpErrored(iabResult.getResponse());
                } else if (IAPJni.mHelper == null) {
                    IAPJni.InAppSetUpErrored(-6000);
                } else {
                    IAPJni.InAppSetUpFinished();
                }
            }
        });
    }

    public static void QueryInventory(String[] strArr, final IabHelper.QueryInventoryFinishedListener queryInventoryFinishedListener) {
        arSKUs = strArr;
        Log.d(TAG, "Setup successful. Querying inventory.");
        final ArrayList arrayList = new ArrayList();
        for (String add : arSKUs) {
            arrayList.add(add);
        }
        m_activity.runOnUiThread(new Runnable() {
            public void run() {
                IAPJni.m_activity.m_Indicator.show();
                IAPJni.mHelper.queryInventoryAsync(true, arrayList, queryInventoryFinishedListener);
            }
        });
    }

    public static void c2j_BillingCleaning(String str, String str2) {
        Log.d(TAG, "c2j_BillingCleaning.");
        Log.d(TAG, "Launching onBillingCreaning flow");
    }

    public static void billingDestroy() {
        Log.d(TAG, "Destroying helper.");
        IabHelper iabHelper = mHelper;
        if (iabHelper != null) {
            iabHelper.dispose();
            mHelper = null;
        }
    }

    static void complain(String str) {
        Log.e(TAG, "**** IAPJni Error: " + str);
    }
}
