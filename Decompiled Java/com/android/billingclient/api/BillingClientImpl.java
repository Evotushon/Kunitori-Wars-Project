package com.android.billingclient.api;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import androidx.core.app.BundleCompat;
import com.android.billingclient.BuildConfig;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.vending.billing.util.IabHelper;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
class BillingClientImpl extends BillingClient {
    /* access modifiers changed from: private */
    public volatile int zza;
    private final String zzb;
    private final Handler zzc;
    private volatile zzi zzd;
    /* access modifiers changed from: private */
    public Context zze;
    /* access modifiers changed from: private */
    public volatile zze zzf;
    private volatile zzaj zzg;
    /* access modifiers changed from: private */
    public boolean zzh;
    /* access modifiers changed from: private */
    public boolean zzi;
    /* access modifiers changed from: private */
    public int zzj;
    /* access modifiers changed from: private */
    public boolean zzk;
    /* access modifiers changed from: private */
    public boolean zzl;
    /* access modifiers changed from: private */
    public boolean zzm;
    /* access modifiers changed from: private */
    public boolean zzn;
    /* access modifiers changed from: private */
    public boolean zzo;
    /* access modifiers changed from: private */
    public boolean zzp;
    /* access modifiers changed from: private */
    public boolean zzq;
    /* access modifiers changed from: private */
    public boolean zzr;
    /* access modifiers changed from: private */
    public boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private ExecutorService zzv;

    private BillingClientImpl(Activity activity, boolean z, String str) {
        this(activity.getApplicationContext(), z, new zzan(), str, (String) null, (zzc) null);
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, boolean z, @Nullable zzc zzc2) {
        this.zze = context.getApplicationContext();
        this.zzd = new zzi(this.zze, purchasesUpdatedListener);
        this.zzt = z;
        this.zzu = zzc2 != null;
    }

    private int launchBillingFlowCpp(Activity activity, BillingFlowParams billingFlowParams) {
        return launchBillingFlow(activity, billingFlowParams).getResponseCode();
    }

    private void launchPriceChangeConfirmationFlow(Activity activity, PriceChangeFlowParams priceChangeFlowParams, long j) {
        launchPriceChangeConfirmationFlow(activity, priceChangeFlowParams, (PriceChangeConfirmationListener) new zzan(j));
    }

    private void startConnection(long j) {
        zzan zzan = new zzan(j);
        if (isReady()) {
            zzb.zzm("BillingClient", "Service connection is valid. No need to re-initialize.");
            zzan.onBillingSetupFinished(zzat.zzl);
        } else if (this.zza == 1) {
            zzb.zzn("BillingClient", "Client is already in the process of connecting to billing service.");
            zzan.onBillingSetupFinished(zzat.zzd);
        } else if (this.zza == 3) {
            zzb.zzn("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            zzan.onBillingSetupFinished(zzat.zzm);
        } else {
            this.zza = 1;
            this.zzd.zze();
            zzb.zzm("BillingClient", "Starting in-app billing setup.");
            this.zzg = new zzaj(this, zzan, (zzai) null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        zzb.zzn("BillingClient", "The device doesn't have valid Play Store.");
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.zzb);
                        if (this.zze.bindService(intent2, this.zzg, 1)) {
                            zzb.zzm("BillingClient", "Service was bonded successfully.");
                            return;
                        }
                        zzb.zzn("BillingClient", "Connection to Billing service is blocked.");
                    }
                }
            }
            this.zza = 0;
            zzb.zzm("BillingClient", "Billing service unavailable on device.");
            zzan.onBillingSetupFinished(zzat.zzc);
        }
    }

    /* access modifiers changed from: private */
    public final Handler zzF() {
        return Looper.myLooper() == null ? this.zzc : new Handler(Looper.myLooper());
    }

    private final BillingResult zzG(BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.zzc.post(new zzs(this, billingResult));
        return billingResult;
    }

    /* access modifiers changed from: private */
    public final BillingResult zzH() {
        if (this.zza == 0 || this.zza == 3) {
            return zzat.zzm;
        }
        return zzat.zzj;
    }

    private final BillingResult zzI(String str) {
        try {
            if (((Integer) zzL(new zzp(this, str), 5000, (Runnable) null, zzF()).get(5000, TimeUnit.MILLISECONDS)).intValue() == 0) {
                return zzat.zzl;
            }
            return zzat.zzs;
        } catch (Exception e) {
            zzb.zzo("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
            return zzat.zzm;
        }
    }

    @SuppressLint({"PrivateApi"})
    private static String zzJ() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get((Object) null);
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    @Nullable
    private final Future zzK(Callable callable, long j, @Nullable Runnable runnable) {
        return zzL(callable, 5000, (Runnable) null, this.zzc);
    }

    /* access modifiers changed from: private */
    @Nullable
    public final Future zzL(Callable callable, long j, @Nullable Runnable runnable, Handler handler) {
        double d = (double) j;
        Double.isNaN(d);
        long j2 = (long) (d * 0.95d);
        if (this.zzv == null) {
            this.zzv = Executors.newFixedThreadPool(zzb.zza, new zzaf(this));
        }
        try {
            Future submit = this.zzv.submit(callable);
            handler.postDelayed(new zzz(submit, runnable), j2);
            return submit;
        } catch (Exception e) {
            zzb.zzo("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    private final void zzM(BillingResult billingResult, PriceChangeConfirmationListener priceChangeConfirmationListener) {
        if (!Thread.interrupted()) {
            this.zzc.post(new zzv(priceChangeConfirmationListener, billingResult));
        }
    }

    static /* bridge */ /* synthetic */ zzam zzg(BillingClientImpl billingClientImpl, String str) {
        String str2;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Querying purchase history, item type: ".concat(valueOf);
        } else {
            str2 = new String("Querying purchase history, item type: ");
        }
        zzb.zzm("BillingClient", str2);
        ArrayList arrayList = new ArrayList();
        Bundle zzg2 = zzb.zzg(billingClientImpl.zzm, billingClientImpl.zzt, billingClientImpl.zzb);
        String str3 = null;
        while (billingClientImpl.zzk) {
            try {
                Bundle zzh2 = billingClientImpl.zzf.zzh(6, billingClientImpl.zze.getPackageName(), str, str3, zzg2);
                BillingResult zza2 = zzay.zza(zzh2, "BillingClient", "getPurchaseHistory()");
                if (zza2 != zzat.zzl) {
                    return new zzam(zza2, (List) null);
                }
                ArrayList<String> stringArrayList = zzh2.getStringArrayList(IabHelper.RESPONSE_INAPP_ITEM_LIST);
                ArrayList<String> stringArrayList2 = zzh2.getStringArrayList(IabHelper.RESPONSE_INAPP_PURCHASE_DATA_LIST);
                ArrayList<String> stringArrayList3 = zzh2.getStringArrayList(IabHelper.RESPONSE_INAPP_SIGNATURE_LIST);
                int i = 0;
                while (i < stringArrayList2.size()) {
                    String str4 = stringArrayList2.get(i);
                    String str5 = stringArrayList3.get(i);
                    String valueOf2 = String.valueOf(stringArrayList.get(i));
                    zzb.zzm("BillingClient", valueOf2.length() != 0 ? "Purchase record found for sku : ".concat(valueOf2) : new String("Purchase record found for sku : "));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str4, str5);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.getPurchaseToken())) {
                            zzb.zzn("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchaseHistoryRecord);
                        i++;
                    } catch (JSONException e) {
                        zzb.zzo("BillingClient", "Got an exception trying to decode the purchase!", e);
                        return new zzam(zzat.zzj, (List) null);
                    }
                }
                str3 = zzh2.getString(IabHelper.INAPP_CONTINUATION_TOKEN);
                String valueOf3 = String.valueOf(str3);
                zzb.zzm("BillingClient", valueOf3.length() != 0 ? "Continuation token: ".concat(valueOf3) : new String("Continuation token: "));
                if (TextUtils.isEmpty(str3)) {
                    return new zzam(zzat.zzl, arrayList);
                }
            } catch (RemoteException e2) {
                zzb.zzo("BillingClient", "Got exception trying to get purchase history, try to reconnect", e2);
                return new zzam(zzat.zzm, (List) null);
            }
        }
        zzb.zzn("BillingClient", "getPurchaseHistory is not supported on current device");
        return new zzam(zzat.zzq, (List) null);
    }

    static /* bridge */ /* synthetic */ Purchase.PurchasesResult zzi(BillingClientImpl billingClientImpl, String str) {
        Bundle bundle;
        String valueOf = String.valueOf(str);
        zzb.zzm("BillingClient", valueOf.length() != 0 ? "Querying owned items, item type: ".concat(valueOf) : new String("Querying owned items, item type: "));
        ArrayList arrayList = new ArrayList();
        Bundle zzg2 = zzb.zzg(billingClientImpl.zzm, billingClientImpl.zzt, billingClientImpl.zzb);
        String str2 = null;
        do {
            try {
                if (billingClientImpl.zzm) {
                    bundle = billingClientImpl.zzf.zzj(9, billingClientImpl.zze.getPackageName(), str, str2, zzg2);
                } else {
                    bundle = billingClientImpl.zzf.zzi(3, billingClientImpl.zze.getPackageName(), str, str2);
                }
                BillingResult zza2 = zzay.zza(bundle, "BillingClient", "getPurchase()");
                if (zza2 != zzat.zzl) {
                    return new Purchase.PurchasesResult(zza2, (List<Purchase>) null);
                }
                ArrayList<String> stringArrayList = bundle.getStringArrayList(IabHelper.RESPONSE_INAPP_ITEM_LIST);
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList(IabHelper.RESPONSE_INAPP_PURCHASE_DATA_LIST);
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList(IabHelper.RESPONSE_INAPP_SIGNATURE_LIST);
                int i = 0;
                while (i < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i);
                    String str4 = stringArrayList3.get(i);
                    String valueOf2 = String.valueOf(stringArrayList.get(i));
                    zzb.zzm("BillingClient", valueOf2.length() != 0 ? "Sku is owned: ".concat(valueOf2) : new String("Sku is owned: "));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                            zzb.zzn("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchase);
                        i++;
                    } catch (JSONException e) {
                        zzb.zzo("BillingClient", "Got an exception trying to decode the purchase!", e);
                        return new Purchase.PurchasesResult(zzat.zzj, (List<Purchase>) null);
                    }
                }
                str2 = bundle.getString(IabHelper.INAPP_CONTINUATION_TOKEN);
                String valueOf3 = String.valueOf(str2);
                zzb.zzm("BillingClient", valueOf3.length() != 0 ? "Continuation token: ".concat(valueOf3) : new String("Continuation token: "));
            } catch (Exception e2) {
                zzb.zzo("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                return new Purchase.PurchasesResult(zzat.zzm, (List<Purchase>) null);
            }
        } while (!TextUtils.isEmpty(str2));
        return new Purchase.PurchasesResult(zzat.zzl, arrayList);
    }

    public final void acknowledgePurchase(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzat.zzm);
        } else if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            zzb.zzn("BillingClient", "Please provide a valid purchase token.");
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzat.zzi);
        } else if (!this.zzm) {
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzat.zzb);
        } else {
            if (zzL(new zzn(this, acknowledgePurchaseParams, acknowledgePurchaseResponseListener), 30000, new zzk(acknowledgePurchaseResponseListener), zzF()) == null) {
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzH());
            }
        }
    }

    public final void consumeAsync(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            consumeResponseListener.onConsumeResponse(zzat.zzm, consumeParams.getPurchaseToken());
            return;
        }
        if (zzL(new zzo(this, consumeParams, consumeResponseListener), 30000, new zzu(consumeResponseListener, consumeParams), zzF()) == null) {
            consumeResponseListener.onConsumeResponse(zzH(), consumeParams.getPurchaseToken());
        }
    }

    public final void endConnection() {
        try {
            this.zzd.zzd();
            if (this.zzg != null) {
                this.zzg.zzc();
            }
            if (!(this.zzg == null || this.zzf == null)) {
                zzb.zzm("BillingClient", "Unbinding from service.");
                this.zze.unbindService(this.zzg);
                this.zzg = null;
            }
            this.zzf = null;
            ExecutorService executorService = this.zzv;
            if (executorService != null) {
                executorService.shutdownNow();
                this.zzv = null;
            }
        } catch (Exception e) {
            zzb.zzo("BillingClient", "There was an exception while ending connection!", e);
        } finally {
            this.zza = 3;
        }
    }

    public final int getConnectionState() {
        return this.zza;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.android.billingclient.api.BillingResult isFeatureSupported(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = r2.isReady()
            if (r0 != 0) goto L_0x0009
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzat.zzm
            return r3
        L_0x0009:
            int r0 = r3.hashCode()
            switch(r0) {
                case -422092961: goto L_0x007a;
                case 96321: goto L_0x0070;
                case 97314: goto L_0x0066;
                case 98307: goto L_0x005b;
                case 99300: goto L_0x0051;
                case 100293: goto L_0x0046;
                case 101286: goto L_0x003b;
                case 207616302: goto L_0x0031;
                case 292218239: goto L_0x0027;
                case 1219490065: goto L_0x001d;
                case 1987365622: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0084
        L_0x0012:
            java.lang.String r0 = "subscriptions"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0084
            r0 = 0
            goto L_0x0085
        L_0x001d:
            java.lang.String r0 = "subscriptionsOnVr"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0084
            r0 = 3
            goto L_0x0085
        L_0x0027:
            java.lang.String r0 = "inAppItemsOnVr"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0084
            r0 = 2
            goto L_0x0085
        L_0x0031:
            java.lang.String r0 = "priceChangeConfirmation"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0084
            r0 = 4
            goto L_0x0085
        L_0x003b:
            java.lang.String r0 = "fff"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0084
            r0 = 10
            goto L_0x0085
        L_0x0046:
            java.lang.String r0 = "eee"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0084
            r0 = 9
            goto L_0x0085
        L_0x0051:
            java.lang.String r0 = "ddd"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0084
            r0 = 7
            goto L_0x0085
        L_0x005b:
            java.lang.String r0 = "ccc"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0084
            r0 = 8
            goto L_0x0085
        L_0x0066:
            java.lang.String r0 = "bbb"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0084
            r0 = 5
            goto L_0x0085
        L_0x0070:
            java.lang.String r0 = "aaa"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0084
            r0 = 6
            goto L_0x0085
        L_0x007a:
            java.lang.String r0 = "subscriptionsUpdate"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0084
            r0 = 1
            goto L_0x0085
        L_0x0084:
            r0 = -1
        L_0x0085:
            switch(r0) {
                case 0: goto L_0x00ed;
                case 1: goto L_0x00e3;
                case 2: goto L_0x00dc;
                case 3: goto L_0x00d5;
                case 4: goto L_0x00cb;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00b7;
                case 7: goto L_0x00ad;
                case 8: goto L_0x00a3;
                case 9: goto L_0x00a3;
                case 10: goto L_0x0099;
                default: goto L_0x0088;
            }
        L_0x0088:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "Unsupported feature: "
            int r1 = r3.length()
            if (r1 == 0) goto L_0x00f7
            java.lang.String r3 = r0.concat(r3)
            goto L_0x00fc
        L_0x0099:
            boolean r3 = r2.zzs
            if (r3 == 0) goto L_0x00a0
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzat.zzl
            goto L_0x00a2
        L_0x00a0:
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzat.zzw
        L_0x00a2:
            return r3
        L_0x00a3:
            boolean r3 = r2.zzr
            if (r3 == 0) goto L_0x00aa
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzat.zzl
            goto L_0x00ac
        L_0x00aa:
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzat.zzu
        L_0x00ac:
            return r3
        L_0x00ad:
            boolean r3 = r2.zzp
            if (r3 == 0) goto L_0x00b4
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzat.zzl
            goto L_0x00b6
        L_0x00b4:
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzat.zzv
        L_0x00b6:
            return r3
        L_0x00b7:
            boolean r3 = r2.zzq
            if (r3 == 0) goto L_0x00be
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzat.zzl
            goto L_0x00c0
        L_0x00be:
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzat.zzt
        L_0x00c0:
            return r3
        L_0x00c1:
            boolean r3 = r2.zzo
            if (r3 == 0) goto L_0x00c8
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzat.zzl
            goto L_0x00ca
        L_0x00c8:
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzat.zzx
        L_0x00ca:
            return r3
        L_0x00cb:
            boolean r3 = r2.zzl
            if (r3 == 0) goto L_0x00d2
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzat.zzl
            goto L_0x00d4
        L_0x00d2:
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzat.zzr
        L_0x00d4:
            return r3
        L_0x00d5:
            java.lang.String r3 = "subs"
            com.android.billingclient.api.BillingResult r3 = r2.zzI(r3)
            return r3
        L_0x00dc:
            java.lang.String r3 = "inapp"
            com.android.billingclient.api.BillingResult r3 = r2.zzI(r3)
            return r3
        L_0x00e3:
            boolean r3 = r2.zzi
            if (r3 == 0) goto L_0x00ea
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzat.zzl
            goto L_0x00ec
        L_0x00ea:
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzat.zzp
        L_0x00ec:
            return r3
        L_0x00ed:
            boolean r3 = r2.zzh
            if (r3 == 0) goto L_0x00f4
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzat.zzl
            goto L_0x00f6
        L_0x00f4:
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzat.zzo
        L_0x00f6:
            return r3
        L_0x00f7:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
        L_0x00fc:
            java.lang.String r0 = "BillingClient"
            com.google.android.gms.internal.play_billing.zzb.zzn(r0, r3)
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzat.zzz
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.isFeatureSupported(java.lang.String):com.android.billingclient.api.BillingResult");
    }

    public final boolean isReady() {
        return (this.zza != 2 || this.zzf == null || this.zzg == null) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0311 A[Catch:{ CancellationException | TimeoutException -> 0x035f, Exception -> 0x0353 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0339 A[Catch:{ CancellationException | TimeoutException -> 0x035f, Exception -> 0x0353 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.android.billingclient.api.BillingResult launchBillingFlow(android.app.Activity r32, com.android.billingclient.api.BillingFlowParams r33) {
        /*
            r31 = this;
            r8 = r31
            r0 = r32
            java.lang.String r9 = "BUY_INTENT"
            java.lang.String r1 = "proxyPackageVersion"
            boolean r2 = r31.isReady()
            if (r2 != 0) goto L_0x0014
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzat.zzm
            r8.zzG(r0)
            return r0
        L_0x0014:
            java.util.ArrayList r2 = r33.zze()
            java.util.List r3 = r33.zzf()
            r4 = 0
            java.lang.Object r5 = com.google.android.gms.internal.play_billing.zzz.zza(r2, r4)
            com.android.billingclient.api.SkuDetails r5 = (com.android.billingclient.api.SkuDetails) r5
            java.lang.Object r6 = com.google.android.gms.internal.play_billing.zzz.zza(r3, r4)
            com.android.billingclient.api.BillingFlowParams$zza r6 = (com.android.billingclient.api.BillingFlowParams.zza) r6
            if (r5 == 0) goto L_0x036d
            java.lang.String r7 = r5.getSku()
            java.lang.String r10 = r5.getType()
            java.lang.String r11 = "subs"
            boolean r11 = r10.equals(r11)
            java.lang.String r12 = "BillingClient"
            if (r11 == 0) goto L_0x004d
            boolean r11 = r8.zzh
            if (r11 == 0) goto L_0x0042
            goto L_0x004d
        L_0x0042:
            java.lang.String r0 = "Current client doesn't support subscriptions."
            com.google.android.gms.internal.play_billing.zzb.zzn(r12, r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzat.zzo
            r8.zzG(r0)
            return r0
        L_0x004d:
            boolean r11 = r33.zzo()
            if (r11 == 0) goto L_0x0063
            boolean r11 = r8.zzk
            if (r11 == 0) goto L_0x0058
            goto L_0x0063
        L_0x0058:
            java.lang.String r0 = "Current client doesn't support extra params for buy intent."
            com.google.android.gms.internal.play_billing.zzb.zzn(r12, r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzat.zzh
            r8.zzG(r0)
            return r0
        L_0x0063:
            int r11 = r2.size()
            r13 = 1
            if (r11 <= r13) goto L_0x007a
            boolean r11 = r8.zzr
            if (r11 == 0) goto L_0x006f
            goto L_0x007a
        L_0x006f:
            java.lang.String r0 = "Current client doesn't support multi-item purchases."
            com.google.android.gms.internal.play_billing.zzb.zzn(r12, r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzat.zzu
            r8.zzG(r0)
            return r0
        L_0x007a:
            boolean r11 = r3.isEmpty()
            if (r11 != 0) goto L_0x0090
            boolean r11 = r8.zzs
            if (r11 == 0) goto L_0x0085
            goto L_0x0090
        L_0x0085:
            java.lang.String r0 = "Current client doesn't support purchases with ProductDetails."
            com.google.android.gms.internal.play_billing.zzb.zzn(r12, r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzat.zzw
            r8.zzG(r0)
            return r0
        L_0x0090:
            boolean r11 = r8.zzu
            if (r11 == 0) goto L_0x00a4
            boolean r14 = r8.zzk
            if (r14 == 0) goto L_0x0099
            goto L_0x00a4
        L_0x0099:
            java.lang.String r0 = "Current client doesn't support alternative billing."
            com.google.android.gms.internal.play_billing.zzb.zzn(r12, r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzat.zzy
            r8.zzG(r0)
            return r0
        L_0x00a4:
            boolean r14 = r8.zzk
            if (r14 == 0) goto L_0x02e2
            boolean r14 = r8.zzm
            boolean r15 = r8.zzt
            java.lang.String r4 = r8.zzb
            r13 = r33
            android.os.Bundle r11 = com.google.android.gms.internal.play_billing.zzb.zzf(r13, r14, r15, r11, r4)
            boolean r4 = r2.isEmpty()
            java.lang.String r14 = "additionalSkuTypes"
            java.lang.String r15 = "additionalSkus"
            java.lang.String r13 = "skuDetailsTokens"
            r17 = r9
            java.lang.String r9 = "SKU_OFFER_ID_TOKEN_LIST"
            if (r4 != 0) goto L_0x01ce
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r18 = r10
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r19 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r20 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r21 = r2.iterator()
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
        L_0x00ef:
            boolean r26 = r21.hasNext()
            if (r26 == 0) goto L_0x015d
            java.lang.Object r26 = r21.next()
            com.android.billingclient.api.SkuDetails r26 = (com.android.billingclient.api.SkuDetails) r26
            java.lang.String r27 = r26.zzf()
            boolean r27 = r27.isEmpty()
            if (r27 != 0) goto L_0x010f
            r27 = r12
            java.lang.String r12 = r26.zzf()
            r4.add(r12)
            goto L_0x0111
        L_0x010f:
            r27 = r12
        L_0x0111:
            java.lang.String r12 = r26.zzc()
            r28 = r6
            java.lang.String r6 = r26.zzb()
            int r29 = r26.zza()
            r30 = r5
            java.lang.String r5 = r26.zze()
            r0.add(r12)
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            r16 = 1
            r12 = r12 ^ 1
            r22 = r22 | r12
            r10.add(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r6 = r6 ^ 1
            r23 = r23 | r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r29)
            r7.add(r6)
            if (r29 == 0) goto L_0x0148
            r6 = 1
            goto L_0x0149
        L_0x0148:
            r6 = 0
        L_0x0149:
            r24 = r24 | r6
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            r6 = r6 ^ 1
            r25 = r25 | r6
            r1.add(r5)
            r12 = r27
            r6 = r28
            r5 = r30
            goto L_0x00ef
        L_0x015d:
            r30 = r5
            r28 = r6
            r27 = r12
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x016c
            r11.putStringArrayList(r13, r4)
        L_0x016c:
            if (r22 == 0) goto L_0x0171
            r11.putStringArrayList(r9, r0)
        L_0x0171:
            if (r23 == 0) goto L_0x0178
            java.lang.String r0 = "SKU_OFFER_ID_LIST"
            r11.putStringArrayList(r0, r10)
        L_0x0178:
            if (r24 == 0) goto L_0x017f
            java.lang.String r0 = "SKU_OFFER_TYPE_LIST"
            r11.putIntegerArrayList(r0, r7)
        L_0x017f:
            if (r25 == 0) goto L_0x0186
            java.lang.String r0 = "SKU_SERIALIZED_DOCID_LIST"
            r11.putStringArrayList(r0, r1)
        L_0x0186:
            int r0 = r2.size()
            r1 = 1
            if (r0 <= r1) goto L_0x0219
            java.util.ArrayList r0 = new java.util.ArrayList
            int r4 = r2.size()
            int r4 = r4 + -1
            r0.<init>(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r2.size()
            int r5 = r5 + -1
            r4.<init>(r5)
            r5 = 1
        L_0x01a4:
            int r6 = r2.size()
            if (r5 >= r6) goto L_0x01c7
            java.lang.Object r6 = r2.get(r5)
            com.android.billingclient.api.SkuDetails r6 = (com.android.billingclient.api.SkuDetails) r6
            java.lang.String r6 = r6.getSku()
            r0.add(r6)
            java.lang.Object r6 = r2.get(r5)
            com.android.billingclient.api.SkuDetails r6 = (com.android.billingclient.api.SkuDetails) r6
            java.lang.String r6 = r6.getType()
            r4.add(r6)
            int r5 = r5 + 1
            goto L_0x01a4
        L_0x01c7:
            r11.putStringArrayList(r15, r0)
            r11.putStringArrayList(r14, r4)
            goto L_0x0219
        L_0x01ce:
            r20 = r1
            r30 = r5
            r28 = r6
            r19 = r7
            r18 = r10
            r27 = r12
            r1 = 1
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r3.size()
            int r2 = r2 + -1
            r0.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = r3.size()
            int r4 = r4 + -1
            r2.<init>(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r3.size()
            if (r6 > 0) goto L_0x02d9
            r11.putStringArrayList(r9, r5)
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x020d
            r11.putStringArrayList(r13, r4)
        L_0x020d:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x0219
            r11.putStringArrayList(r15, r0)
            r11.putStringArrayList(r14, r2)
        L_0x0219:
            boolean r0 = r11.containsKey(r9)
            if (r0 == 0) goto L_0x022a
            boolean r0 = r8.zzp
            if (r0 == 0) goto L_0x0224
            goto L_0x022a
        L_0x0224:
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzat.zzv
            r8.zzG(r0)
            return r0
        L_0x022a:
            java.lang.String r0 = r30.zzd()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x023f
            java.lang.String r0 = r30.zzd()
            java.lang.String r2 = "skuPackageName"
            r11.putString(r2, r0)
            r0 = 0
            goto L_0x0243
        L_0x023f:
            if (r28 != 0) goto L_0x02d7
            r0 = 0
            r1 = 0
        L_0x0243:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x024e
            java.lang.String r2 = "accountName"
            r11.putString(r2, r0)
        L_0x024e:
            android.content.Intent r0 = r32.getIntent()
            if (r0 != 0) goto L_0x025c
            java.lang.String r0 = "Activity's intent is null."
            r9 = r27
            com.google.android.gms.internal.play_billing.zzb.zzn(r9, r0)
            goto L_0x028d
        L_0x025c:
            r9 = r27
            java.lang.String r2 = "PROXY_PACKAGE"
            java.lang.String r4 = r0.getStringExtra(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x028d
            java.lang.String r0 = r0.getStringExtra(r2)
            java.lang.String r2 = "proxyPackage"
            r11.putString(r2, r0)
            android.content.Context r2 = r8.zze     // Catch:{ NameNotFoundException -> 0x0286 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0286 }
            r4 = 0
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r0, r4)     // Catch:{ NameNotFoundException -> 0x0286 }
            java.lang.String r0 = r0.versionName     // Catch:{ NameNotFoundException -> 0x0286 }
            r2 = r20
            r11.putString(r2, r0)     // Catch:{ NameNotFoundException -> 0x0288 }
            goto L_0x028d
        L_0x0286:
            r2 = r20
        L_0x0288:
            java.lang.String r0 = "package not found"
            r11.putString(r2, r0)
        L_0x028d:
            boolean r0 = r8.zzs
            if (r0 == 0) goto L_0x029c
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x029c
            r0 = 17
            r3 = 17
            goto L_0x02bb
        L_0x029c:
            boolean r0 = r8.zzq
            if (r0 == 0) goto L_0x02a7
            if (r1 == 0) goto L_0x02a7
            r0 = 15
            r3 = 15
            goto L_0x02bb
        L_0x02a7:
            boolean r0 = r8.zzm
            if (r0 == 0) goto L_0x02b0
            r0 = 9
            r3 = 9
            goto L_0x02bb
        L_0x02b0:
            boolean r0 = r33.getVrPurchaseFlow()
            if (r0 == 0) goto L_0x02b9
            r0 = 7
            r3 = 7
            goto L_0x02bb
        L_0x02b9:
            r0 = 6
            r3 = 6
        L_0x02bb:
            com.android.billingclient.api.zzl r0 = new com.android.billingclient.api.zzl
            r1 = r0
            r2 = r31
            r4 = r19
            r5 = r18
            r6 = r33
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r3 = 5000(0x1388, double:2.4703E-320)
            r5 = 0
            android.os.Handler r6 = r8.zzc
            r1 = r31
            r2 = r0
            java.util.concurrent.Future r0 = r1.zzL(r2, r3, r5, r6)
            goto L_0x02fd
        L_0x02d7:
            r0 = 0
            throw r0
        L_0x02d9:
            r0 = 0
            r1 = 0
            java.lang.Object r1 = r3.get(r1)
            com.android.billingclient.api.BillingFlowParams$zza r1 = (com.android.billingclient.api.BillingFlowParams.zza) r1
            throw r0
        L_0x02e2:
            r19 = r7
            r17 = r9
            r18 = r10
            r9 = r12
            com.android.billingclient.api.zzr r2 = new com.android.billingclient.api.zzr
            r1 = r18
            r0 = r19
            r2.<init>(r8, r0, r1)
            r3 = 5000(0x1388, double:2.4703E-320)
            r5 = 0
            android.os.Handler r6 = r8.zzc
            r1 = r31
            java.util.concurrent.Future r0 = r1.zzL(r2, r3, r5, r6)
        L_0x02fd:
            r1 = 5000(0x1388, double:2.4703E-320)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            java.lang.Object r0 = r0.get(r1, r3)     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            int r1 = com.google.android.gms.internal.play_billing.zzb.zzb(r0, r9)     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            java.lang.String r2 = com.google.android.gms.internal.play_billing.zzb.zzj(r0, r9)     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            if (r1 == 0) goto L_0x0339
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            r3 = 52
            r0.<init>(r3)     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            java.lang.String r3 = "Unable to buy item, Error response code: "
            r0.append(r3)     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            r0.append(r1)     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            java.lang.String r0 = r0.toString()     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            com.google.android.gms.internal.play_billing.zzb.zzn(r9, r0)     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            com.android.billingclient.api.BillingResult$Builder r0 = com.android.billingclient.api.BillingResult.newBuilder()     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            r0.setResponseCode(r1)     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            r0.setDebugMessage(r2)     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            com.android.billingclient.api.BillingResult r0 = r0.build()     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            r8.zzG(r0)     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            return r0
        L_0x0339:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            java.lang.Class<com.android.billingclient.api.ProxyBillingActivity> r2 = com.android.billingclient.api.ProxyBillingActivity.class
            r3 = r32
            r1.<init>(r3, r2)     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            r2 = r17
            android.os.Parcelable r0 = r0.getParcelable(r2)     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            r1.putExtra(r2, r0)     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            r3.startActivity(r1)     // Catch:{ TimeoutException -> 0x0361, CancellationException -> 0x035f, Exception -> 0x0353 }
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzat.zzl
            return r0
        L_0x0353:
            r0 = move-exception
            java.lang.String r1 = "Exception while launching billing flow. Try to reconnect"
            com.google.android.gms.internal.play_billing.zzb.zzo(r9, r1, r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzat.zzm
            r8.zzG(r0)
            return r0
        L_0x035f:
            r0 = move-exception
            goto L_0x0362
        L_0x0361:
            r0 = move-exception
        L_0x0362:
            java.lang.String r1 = "Time out while launching billing flow. Try to reconnect"
            com.google.android.gms.internal.play_billing.zzb.zzo(r9, r1, r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzat.zzn
            r8.zzG(r0)
            return r0
        L_0x036d:
            r0 = r4
            goto L_0x0370
        L_0x036f:
            throw r0
        L_0x0370:
            goto L_0x036f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.launchBillingFlow(android.app.Activity, com.android.billingclient.api.BillingFlowParams):com.android.billingclient.api.BillingResult");
    }

    public final void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzat.zzm, (List<PurchaseHistoryRecord>) null);
            return;
        }
        if (zzL(new zzad(this, str, purchaseHistoryResponseListener), 30000, new zzw(purchaseHistoryResponseListener), zzF()) == null) {
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzH(), (List<PurchaseHistoryRecord>) null);
        }
    }

    public final Purchase.PurchasesResult queryPurchases(String str) {
        if (!isReady()) {
            return new Purchase.PurchasesResult(zzat.zzm, (List<Purchase>) null);
        }
        if (TextUtils.isEmpty(str)) {
            zzb.zzn("BillingClient", "Please provide a valid SKU type.");
            return new Purchase.PurchasesResult(zzat.zzf, (List<Purchase>) null);
        }
        try {
            return (Purchase.PurchasesResult) zzK(new zzab(this, str), 5000, (Runnable) null).get(5000, TimeUnit.MILLISECONDS);
        } catch (CancellationException | TimeoutException unused) {
            return new Purchase.PurchasesResult(zzat.zzn, (List<Purchase>) null);
        } catch (Exception unused2) {
            return new Purchase.PurchasesResult(zzat.zzj, (List<Purchase>) null);
        }
    }

    @zze
    public void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) {
        if (!isReady()) {
            purchasesResponseListener.onQueryPurchasesResponse(zzat.zzm, zzu.zzh());
        } else if (TextUtils.isEmpty(str)) {
            zzb.zzn("BillingClient", "Please provide a valid product type.");
            purchasesResponseListener.onQueryPurchasesResponse(zzat.zzg, zzu.zzh());
        } else {
            if (zzL(new zzac(this, str, purchasesResponseListener), 30000, new zzx(purchasesResponseListener), zzF()) == null) {
                purchasesResponseListener.onQueryPurchasesResponse(zzH(), zzu.zzh());
            }
        }
    }

    public final void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            skuDetailsResponseListener.onSkuDetailsResponse(zzat.zzm, (List<SkuDetails>) null);
            return;
        }
        String skuType = skuDetailsParams.getSkuType();
        List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            zzb.zzn("BillingClient", "Please fix the input params. SKU type can't be empty.");
            skuDetailsResponseListener.onSkuDetailsResponse(zzat.zzf, (List<SkuDetails>) null);
        } else if (skusList != null) {
            ArrayList arrayList = new ArrayList();
            for (String zza2 : skusList) {
                zzbb zzbb = new zzbb((zzba) null);
                zzbb.zza(zza2);
                arrayList.add(zzbb.zzb());
            }
            if (zzL(new zzt(this, skuType, arrayList, (String) null, skuDetailsResponseListener), 30000, new zzy(skuDetailsResponseListener), zzF()) == null) {
                skuDetailsResponseListener.onSkuDetailsResponse(zzH(), (List<SkuDetails>) null);
            }
        } else {
            zzb.zzn("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
            skuDetailsResponseListener.onSkuDetailsResponse(zzat.zze, (List<SkuDetails>) null);
        }
    }

    @zzd
    public BillingResult showInAppMessages(Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!isReady()) {
            zzb.zzn("BillingClient", "Service disconnected.");
            return zzat.zzm;
        } else if (!this.zzo) {
            zzb.zzn("BillingClient", "Current client doesn't support showing in-app messages.");
            return zzat.zzx;
        } else {
            View findViewById = activity.findViewById(16908290);
            IBinder windowToken = findViewById.getWindowToken();
            Rect rect = new Rect();
            findViewById.getGlobalVisibleRect(rect);
            Bundle bundle = new Bundle();
            BundleCompat.putBinder(bundle, "KEY_WINDOW_TOKEN", windowToken);
            bundle.putInt("KEY_DIMEN_LEFT", rect.left);
            bundle.putInt("KEY_DIMEN_TOP", rect.top);
            bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
            bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
            bundle.putString("playBillingLibraryVersion", this.zzb);
            bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.getInAppMessageCategoriesToShow());
            zzK(new zzm(this, bundle, activity, new zzae(this, this.zzc, inAppMessageResponseListener)), 5000, (Runnable) null);
            return zzat.zzl;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzE(BillingResult billingResult) {
        if (this.zzd.zzc() != null) {
            this.zzd.zzc().onPurchasesUpdated(billingResult, (List<Purchase>) null);
            return;
        }
        this.zzd.zzb();
        zzb.zzn("BillingClient", "No valid listener is set in BroadcastManager");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Bundle zzc(int i, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) throws Exception {
        return this.zzf.zzg(i, this.zze.getPackageName(), str, str2, (String) null, bundle);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Bundle zzd(String str, String str2) throws Exception {
        return this.zzf.zzf(3, this.zze.getPackageName(), str, str2, (String) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Bundle zze(String str, Bundle bundle) throws Exception {
        return this.zzf.zzm(8, this.zze.getPackageName(), str, "subs", bundle);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Integer zzk(String str) throws Exception {
        zze zze2 = this.zzf;
        String packageName = this.zze.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putBoolean(BillingFlowParams.EXTRA_PARAM_KEY_VR, true);
        return Integer.valueOf(zze2.zzc(7, packageName, str, bundle));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzl(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) throws Exception {
        try {
            Bundle zzd2 = this.zzf.zzd(9, this.zze.getPackageName(), acknowledgePurchaseParams.getPurchaseToken(), zzb.zzc(acknowledgePurchaseParams, this.zzb));
            int zzb2 = zzb.zzb(zzd2, "BillingClient");
            String zzj2 = zzb.zzj(zzd2, "BillingClient");
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(zzb2);
            newBuilder.setDebugMessage(zzj2);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(newBuilder.build());
            return null;
        } catch (Exception e) {
            zzb.zzo("BillingClient", "Error acknowledge purchase!", e);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzat.zzm);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzm(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) throws Exception {
        String str;
        int i;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            String valueOf = String.valueOf(purchaseToken);
            zzb.zzm("BillingClient", valueOf.length() != 0 ? "Consuming purchase with token: ".concat(valueOf) : new String("Consuming purchase with token: "));
            if (this.zzm) {
                Bundle zze2 = this.zzf.zze(9, this.zze.getPackageName(), purchaseToken, zzb.zzd(consumeParams, this.zzm, this.zzb));
                i = zze2.getInt(IabHelper.RESPONSE_CODE);
                str = zzb.zzj(zze2, "BillingClient");
            } else {
                i = this.zzf.zza(3, this.zze.getPackageName(), purchaseToken);
                str = "";
            }
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(i);
            newBuilder.setDebugMessage(str);
            BillingResult build = newBuilder.build();
            if (i == 0) {
                zzb.zzm("BillingClient", "Successfully consumed purchase.");
                consumeResponseListener.onConsumeResponse(build, purchaseToken);
                return null;
            }
            StringBuilder sb = new StringBuilder(63);
            sb.append("Error consuming purchase with token. Response code: ");
            sb.append(i);
            zzb.zzn("BillingClient", sb.toString());
            consumeResponseListener.onConsumeResponse(build, purchaseToken);
            return null;
        } catch (Exception e) {
            zzb.zzo("BillingClient", "Error consuming purchase!", e);
            consumeResponseListener.onConsumeResponse(zzat.zzm, purchaseToken);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008d, code lost:
        r0 = null;
        r6 = 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object zzn(java.lang.String r22, java.util.List r23, java.lang.String r24, com.android.billingclient.api.SkuDetailsResponseListener r25) throws java.lang.Exception {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r2 = "BillingClient"
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r3 = r23.size()
            r5 = 0
        L_0x000e:
            r6 = 6
            r7 = 4
            java.lang.String r8 = "Item is unavailable for purchase."
            r9 = 0
            if (r5 >= r3) goto L_0x010b
            int r10 = r5 + 20
            if (r10 <= r3) goto L_0x001b
            r11 = r3
            goto L_0x001c
        L_0x001b:
            r11 = r10
        L_0x001c:
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = r23
            java.util.List r5 = r13.subList(r5, r11)
            r12.<init>(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r11 = r12.size()
            r14 = 0
        L_0x0031:
            if (r14 >= r11) goto L_0x0043
            java.lang.Object r15 = r12.get(r14)
            com.android.billingclient.api.zzbd r15 = (com.android.billingclient.api.zzbd) r15
            java.lang.String r15 = r15.zza()
            r5.add(r15)
            int r14 = r14 + 1
            goto L_0x0031
        L_0x0043:
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.lang.String r14 = "ITEM_ID_LIST"
            r11.putStringArrayList(r14, r5)
            java.lang.String r5 = r1.zzb
            java.lang.String r14 = "playBillingLibraryVersion"
            r11.putString(r14, r5)
            boolean r5 = r1.zzn     // Catch:{ Exception -> 0x00ff }
            if (r5 == 0) goto L_0x0077
            com.google.android.gms.internal.play_billing.zze r15 = r1.zzf     // Catch:{ Exception -> 0x00ff }
            r16 = 10
            android.content.Context r5 = r1.zze     // Catch:{ Exception -> 0x00ff }
            java.lang.String r17 = r5.getPackageName()     // Catch:{ Exception -> 0x00ff }
            int r5 = r1.zzj     // Catch:{ Exception -> 0x00ff }
            boolean r14 = r1.zzt     // Catch:{ Exception -> 0x00ff }
            java.lang.String r4 = r1.zzb     // Catch:{ Exception -> 0x00ff }
            android.os.Bundle r20 = com.google.android.gms.internal.play_billing.zzb.zze(r5, r14, r4, r9, r12)     // Catch:{ Exception -> 0x00ff }
            r18 = r22
            r19 = r11
            android.os.Bundle r4 = r15.zzl(r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x00ff }
            r14 = r22
            goto L_0x0086
        L_0x0077:
            com.google.android.gms.internal.play_billing.zze r4 = r1.zzf     // Catch:{ Exception -> 0x00ff }
            r5 = 3
            android.content.Context r12 = r1.zze     // Catch:{ Exception -> 0x00ff }
            java.lang.String r12 = r12.getPackageName()     // Catch:{ Exception -> 0x00ff }
            r14 = r22
            android.os.Bundle r4 = r4.zzk(r5, r12, r14, r11)     // Catch:{ Exception -> 0x00ff }
        L_0x0086:
            if (r4 != 0) goto L_0x0091
            java.lang.String r0 = "querySkuDetailsAsync got null sku details list"
            com.google.android.gms.internal.play_billing.zzb.zzn(r2, r0)
        L_0x008d:
            r0 = r9
            r6 = 4
            goto L_0x010e
        L_0x0091:
            java.lang.String r5 = "DETAILS_LIST"
            boolean r11 = r4.containsKey(r5)
            if (r11 != 0) goto L_0x00c1
            int r3 = com.google.android.gms.internal.play_billing.zzb.zzb(r4, r2)
            java.lang.String r8 = com.google.android.gms.internal.play_billing.zzb.zzj(r4, r2)
            if (r3 == 0) goto L_0x00bb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 50
            r4.<init>(r5)
            java.lang.String r5 = "getSkuDetails() failed. Response code: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.google.android.gms.internal.play_billing.zzb.zzn(r2, r4)
            r6 = r3
            goto L_0x010e
        L_0x00bb:
            java.lang.String r3 = "getSkuDetails() returned a bundle with neither an error nor a detail list."
            com.google.android.gms.internal.play_billing.zzb.zzn(r2, r3)
            goto L_0x010e
        L_0x00c1:
            java.util.ArrayList r4 = r4.getStringArrayList(r5)
            if (r4 != 0) goto L_0x00cd
            java.lang.String r0 = "querySkuDetailsAsync got null response list"
            com.google.android.gms.internal.play_billing.zzb.zzn(r2, r0)
            goto L_0x008d
        L_0x00cd:
            r5 = 0
        L_0x00ce:
            int r7 = r4.size()
            if (r5 >= r7) goto L_0x00fc
            java.lang.Object r7 = r4.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            com.android.billingclient.api.SkuDetails r8 = new com.android.billingclient.api.SkuDetails     // Catch:{ JSONException -> 0x00f2 }
            r8.<init>(r7)     // Catch:{ JSONException -> 0x00f2 }
            java.lang.String r7 = r8.toString()
            java.lang.String r11 = "Got sku details: "
            java.lang.String r7 = r11.concat(r7)
            com.google.android.gms.internal.play_billing.zzb.zzm(r2, r7)
            r0.add(r8)
            int r5 = r5 + 1
            goto L_0x00ce
        L_0x00f2:
            r0 = move-exception
            java.lang.String r3 = "Got a JSON exception trying to decode SkuDetails."
            com.google.android.gms.internal.play_billing.zzb.zzo(r2, r3, r0)
            java.lang.String r8 = "Error trying to decode SkuDetails."
            r0 = r9
            goto L_0x010e
        L_0x00fc:
            r5 = r10
            goto L_0x000e
        L_0x00ff:
            r0 = move-exception
            java.lang.String r3 = "querySkuDetailsAsync got a remote exception (try to reconnect)."
            com.google.android.gms.internal.play_billing.zzb.zzo(r2, r3, r0)
            r4 = -1
            java.lang.String r8 = "Service connection is disconnected."
            r0 = r9
            r6 = -1
            goto L_0x010e
        L_0x010b:
            java.lang.String r8 = ""
            r6 = 0
        L_0x010e:
            com.android.billingclient.api.BillingResult$Builder r2 = com.android.billingclient.api.BillingResult.newBuilder()
            r2.setResponseCode(r6)
            r2.setDebugMessage(r8)
            com.android.billingclient.api.BillingResult r2 = r2.build()
            r3 = r25
            r3.onSkuDetailsResponse(r2, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.zzn(java.lang.String, java.util.List, java.lang.String, com.android.billingclient.api.SkuDetailsResponseListener):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzo(Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {
        this.zzf.zzn(12, this.zze.getPackageName(), bundle, new zzal(new WeakReference(activity), resultReceiver, (zzak) null));
        return null;
    }

    public final void launchPriceChangeConfirmationFlow(Activity activity, PriceChangeFlowParams priceChangeFlowParams, PriceChangeConfirmationListener priceChangeConfirmationListener) {
        if (!isReady()) {
            zzM(zzat.zzm, priceChangeConfirmationListener);
        } else if (priceChangeFlowParams == null || priceChangeFlowParams.getSkuDetails() == null) {
            zzb.zzn("BillingClient", "Please fix the input params. priceChangeFlowParams must contain valid sku.");
            zzM(zzat.zzk, priceChangeConfirmationListener);
        } else {
            String sku = priceChangeFlowParams.getSkuDetails().getSku();
            if (sku == null) {
                zzb.zzn("BillingClient", "Please fix the input params. priceChangeFlowParams must contain valid sku.");
                zzM(zzat.zzk, priceChangeConfirmationListener);
            } else if (!this.zzl) {
                zzb.zzn("BillingClient", "Current client doesn't support price change confirmation flow.");
                zzM(zzat.zzr, priceChangeConfirmationListener);
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("playBillingLibraryVersion", this.zzb);
                bundle.putBoolean("subs_price_change", true);
                try {
                    Bundle bundle2 = (Bundle) zzL(new zzq(this, sku, bundle), 5000, (Runnable) null, this.zzc).get(5000, TimeUnit.MILLISECONDS);
                    int zzb2 = zzb.zzb(bundle2, "BillingClient");
                    String zzj2 = zzb.zzj(bundle2, "BillingClient");
                    BillingResult.Builder newBuilder = BillingResult.newBuilder();
                    newBuilder.setResponseCode(zzb2);
                    newBuilder.setDebugMessage(zzj2);
                    BillingResult build = newBuilder.build();
                    if (zzb2 != 0) {
                        StringBuilder sb = new StringBuilder(68);
                        sb.append("Unable to launch price change flow, error response code: ");
                        sb.append(zzb2);
                        zzb.zzn("BillingClient", sb.toString());
                        zzM(build, priceChangeConfirmationListener);
                        return;
                    }
                    zzaa zzaa = new zzaa(this, this.zzc, priceChangeConfirmationListener);
                    Intent intent = new Intent(activity, ProxyBillingActivity.class);
                    intent.putExtra("SUBS_MANAGEMENT_INTENT", (PendingIntent) bundle2.getParcelable("SUBS_MANAGEMENT_INTENT"));
                    intent.putExtra("result_receiver", zzaa);
                    activity.startActivity(intent);
                } catch (CancellationException | TimeoutException e) {
                    StringBuilder sb2 = new StringBuilder(sku.length() + 70);
                    sb2.append("Time out while launching Price Change Flow for sku: ");
                    sb2.append(sku);
                    sb2.append("; try to reconnect");
                    zzb.zzo("BillingClient", sb2.toString(), e);
                    zzM(zzat.zzn, priceChangeConfirmationListener);
                } catch (Exception e2) {
                    StringBuilder sb3 = new StringBuilder(sku.length() + 78);
                    sb3.append("Exception caught while launching Price Change Flow for sku: ");
                    sb3.append(sku);
                    sb3.append("; try to reconnect");
                    zzb.zzo("BillingClient", sb3.toString(), e2);
                    zzM(zzat.zzm, priceChangeConfirmationListener);
                }
            }
        }
    }

    @AnyThread
    private BillingClientImpl(Context context, boolean z, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2, @Nullable zzc zzc2) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzj = 0;
        this.zzb = str;
        initialize(context, purchasesUpdatedListener, z, (zzc) null);
    }

    private BillingClientImpl(String str) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzj = 0;
        this.zzb = str;
    }

    @AnyThread
    BillingClientImpl(@Nullable String str, boolean z, Context context, zzaw zzaw) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzj = 0;
        this.zzb = zzJ();
        this.zze = context.getApplicationContext();
        this.zzd = new zzi(this.zze, (zzaw) null);
        this.zzt = z;
    }

    @AnyThread
    BillingClientImpl(@Nullable String str, boolean z, Context context, PurchasesUpdatedListener purchasesUpdatedListener, @Nullable zzc zzc2) {
        this(context, z, purchasesUpdatedListener, zzJ(), (String) null, (zzc) null);
    }

    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        if (isReady()) {
            zzb.zzm("BillingClient", "Service connection is valid. No need to re-initialize.");
            billingClientStateListener.onBillingSetupFinished(zzat.zzl);
        } else if (this.zza == 1) {
            zzb.zzn("BillingClient", "Client is already in the process of connecting to billing service.");
            billingClientStateListener.onBillingSetupFinished(zzat.zzd);
        } else if (this.zza == 3) {
            zzb.zzn("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            billingClientStateListener.onBillingSetupFinished(zzat.zzm);
        } else {
            this.zza = 1;
            this.zzd.zze();
            zzb.zzm("BillingClient", "Starting in-app billing setup.");
            this.zzg = new zzaj(this, billingClientStateListener, (zzai) null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        zzb.zzn("BillingClient", "The device doesn't have valid Play Store.");
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.zzb);
                        if (this.zze.bindService(intent2, this.zzg, 1)) {
                            zzb.zzm("BillingClient", "Service was bonded successfully.");
                            return;
                        }
                        zzb.zzn("BillingClient", "Connection to Billing service is blocked.");
                    }
                }
            }
            this.zza = 0;
            zzb.zzm("BillingClient", "Billing service unavailable on device.");
            billingClientStateListener.onBillingSetupFinished(zzat.zzc);
        }
    }
}
