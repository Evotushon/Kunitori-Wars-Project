package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.vending.billing.util.IabHelper;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zzb;

@zzf
@UsedByReflection("PlatformActivityProxy")
/* compiled from: com.android.billingclient:billing@@4.1.0 */
public class ProxyBillingActivity extends Activity {
    static final String KEY_IN_APP_MESSAGE_RESULT_RECEIVER = "in_app_message_result_receiver";
    static final String KEY_PRICE_CHANGE_RESULT_RECEIVER = "result_receiver";
    private static final String KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED = "send_cancelled_broadcast_if_finished";
    private static final int REQUEST_CODE_IN_APP_MESSAGE_FLOW = 101;
    private static final int REQUEST_CODE_LAUNCH_ACTIVITY = 100;
    private static final String TAG = "ProxyBillingActivity";
    @Nullable
    private ResultReceiver inAppMessageResultReceiver;
    @Nullable
    private ResultReceiver priceChangeResultReceiver;
    private boolean sendCancelledBroadcastIfFinished;

    private Intent makePurchasesUpdatedIntent() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049  */
    @com.android.billingclient.api.zzf
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r6, int r7, @androidx.annotation.Nullable android.content.Intent r8) {
        /*
            r5 = this;
            super.onActivityResult(r6, r7, r8)
            r0 = 0
            r1 = 0
            java.lang.String r2 = "ProxyBillingActivity"
            r3 = 100
            if (r6 != r3) goto L_0x0073
            com.android.billingclient.api.BillingResult r6 = com.google.android.gms.internal.play_billing.zzb.zzh(r8, r2)
            int r6 = r6.getResponseCode()
            r3 = -1
            if (r7 != r3) goto L_0x001c
            if (r6 == 0) goto L_0x001a
            r7 = -1
            goto L_0x001c
        L_0x001a:
            r6 = 0
            goto L_0x003a
        L_0x001c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 85
            r3.<init>(r4)
            java.lang.String r4 = "Activity finished with resultCode "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = " and billing's responseCode: "
            r3.append(r7)
            r3.append(r6)
            java.lang.String r7 = r3.toString()
            com.google.android.gms.internal.play_billing.zzb.zzn(r2, r7)
        L_0x003a:
            android.os.ResultReceiver r7 = r5.priceChangeResultReceiver
            if (r7 == 0) goto L_0x0049
            if (r8 != 0) goto L_0x0041
            goto L_0x0045
        L_0x0041:
            android.os.Bundle r0 = r8.getExtras()
        L_0x0045:
            r7.send(r6, r0)
            goto L_0x00a5
        L_0x0049:
            android.content.Intent r6 = r5.makePurchasesUpdatedIntent()
            if (r8 == 0) goto L_0x006f
            android.os.Bundle r7 = r8.getExtras()
            if (r7 == 0) goto L_0x005d
            android.os.Bundle r7 = r8.getExtras()
            r6.putExtras(r7)
            goto L_0x006f
        L_0x005d:
            java.lang.String r7 = "Got null bundle!"
            com.google.android.gms.internal.play_billing.zzb.zzn(r2, r7)
            r7 = 6
            java.lang.String r8 = "RESPONSE_CODE"
            r6.putExtra(r8, r7)
            java.lang.String r7 = "DEBUG_MESSAGE"
            java.lang.String r8 = "An internal error occurred."
            r6.putExtra(r7, r8)
        L_0x006f:
            r5.sendBroadcast(r6)
            goto L_0x00a5
        L_0x0073:
            r7 = 101(0x65, float:1.42E-43)
            if (r6 != r7) goto L_0x008a
            int r6 = com.google.android.gms.internal.play_billing.zzb.zza(r8, r2)
            android.os.ResultReceiver r7 = r5.inAppMessageResultReceiver
            if (r7 == 0) goto L_0x00a5
            if (r8 != 0) goto L_0x0082
            goto L_0x0086
        L_0x0082:
            android.os.Bundle r0 = r8.getExtras()
        L_0x0086:
            r7.send(r6, r0)
            goto L_0x00a5
        L_0x008a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = 69
            r7.<init>(r8)
            java.lang.String r8 = "Got onActivityResult with wrong requestCode: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = "; skipping..."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.google.android.gms.internal.play_billing.zzb.zzn(r2, r6)
        L_0x00a5:
            r5.sendCancelledBroadcastIfFinished = r1
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    /* access modifiers changed from: protected */
    @zzf
    public void onCreate(@Nullable Bundle bundle) {
        PendingIntent pendingIntent;
        int i;
        super.onCreate(bundle);
        if (bundle == null) {
            zzb.zzm(TAG, "Launching Play Store billing flow");
            if (getIntent().hasExtra(IabHelper.RESPONSE_BUY_INTENT)) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra(IabHelper.RESPONSE_BUY_INTENT);
            } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.priceChangeResultReceiver = (ResultReceiver) getIntent().getParcelableExtra(KEY_PRICE_CHANGE_RESULT_RECEIVER);
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.inAppMessageResultReceiver = (ResultReceiver) getIntent().getParcelableExtra(KEY_IN_APP_MESSAGE_RESULT_RECEIVER);
                i = 101;
                this.sendCancelledBroadcastIfFinished = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), 0, 0, 0);
            } else {
                pendingIntent = null;
            }
            i = 100;
            try {
                this.sendCancelledBroadcastIfFinished = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                zzb.zzo(TAG, "Got exception while trying to start a purchase flow.", e);
                ResultReceiver resultReceiver = this.priceChangeResultReceiver;
                if (resultReceiver != null) {
                    resultReceiver.send(6, (Bundle) null);
                } else {
                    ResultReceiver resultReceiver2 = this.inAppMessageResultReceiver;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, (Bundle) null);
                    } else {
                        Intent makePurchasesUpdatedIntent = makePurchasesUpdatedIntent();
                        makePurchasesUpdatedIntent.putExtra(IabHelper.RESPONSE_CODE, 6);
                        makePurchasesUpdatedIntent.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(makePurchasesUpdatedIntent);
                    }
                }
                this.sendCancelledBroadcastIfFinished = false;
                finish();
            }
        } else {
            zzb.zzm(TAG, "Launching Play Store billing flow from savedInstanceState");
            this.sendCancelledBroadcastIfFinished = bundle.getBoolean(KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED, false);
            if (bundle.containsKey(KEY_PRICE_CHANGE_RESULT_RECEIVER)) {
                this.priceChangeResultReceiver = (ResultReceiver) bundle.getParcelable(KEY_PRICE_CHANGE_RESULT_RECEIVER);
            } else if (bundle.containsKey(KEY_IN_APP_MESSAGE_RESULT_RECEIVER)) {
                this.inAppMessageResultReceiver = (ResultReceiver) bundle.getParcelable(KEY_IN_APP_MESSAGE_RESULT_RECEIVER);
            }
        }
    }

    /* access modifiers changed from: protected */
    @zzf
    public void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.sendCancelledBroadcastIfFinished) {
            Intent makePurchasesUpdatedIntent = makePurchasesUpdatedIntent();
            makePurchasesUpdatedIntent.putExtra(IabHelper.RESPONSE_CODE, 1);
            makePurchasesUpdatedIntent.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(makePurchasesUpdatedIntent);
        }
    }

    /* access modifiers changed from: protected */
    @zzf
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        ResultReceiver resultReceiver = this.priceChangeResultReceiver;
        if (resultReceiver != null) {
            bundle.putParcelable(KEY_PRICE_CHANGE_RESULT_RECEIVER, resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.inAppMessageResultReceiver;
        if (resultReceiver2 != null) {
            bundle.putParcelable(KEY_IN_APP_MESSAGE_RESULT_RECEIVER, resultReceiver2);
        }
        bundle.putBoolean(KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED, this.sendCancelledBroadcastIfFinished);
    }
}
