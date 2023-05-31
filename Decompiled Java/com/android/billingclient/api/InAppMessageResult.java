package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@zzd
/* compiled from: com.android.billingclient:billing@@4.1.0 */
public final class InAppMessageResult {
    @Nullable
    private final String mPurchaseToken;
    private final int mResponseCode;

    @zzd
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.android.billingclient:billing@@4.1.0 */
    public @interface InAppMessageResponseCode {
        public static final int NO_ACTION_NEEDED = 0;
        public static final int SUBSCRIPTION_STATUS_UPDATED = 1;
    }

    public InAppMessageResult(int i, @Nullable String str) {
        this.mResponseCode = i;
        this.mPurchaseToken = str;
    }

    @Nullable
    public String getPurchaseToken() {
        return this.mPurchaseToken;
    }

    public int getResponseCode() {
        return this.mResponseCode;
    }
}
