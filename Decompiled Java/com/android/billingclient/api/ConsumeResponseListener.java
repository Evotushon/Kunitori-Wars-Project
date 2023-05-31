package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
public interface ConsumeResponseListener {
    void onConsumeResponse(@NonNull BillingResult billingResult, @NonNull String str);
}
