package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
public class PriceChangeFlowParams {
    /* access modifiers changed from: private */
    public SkuDetails zza;

    /* compiled from: com.android.billingclient:billing@@4.1.0 */
    public static class Builder {
        private SkuDetails zza;

        @NonNull
        public PriceChangeFlowParams build() {
            SkuDetails skuDetails = this.zza;
            if (skuDetails != null) {
                PriceChangeFlowParams priceChangeFlowParams = new PriceChangeFlowParams();
                priceChangeFlowParams.zza = skuDetails;
                return priceChangeFlowParams;
            }
            throw new IllegalArgumentException("SkuDetails must be set");
        }

        @NonNull
        public Builder setSkuDetails(@NonNull SkuDetails skuDetails) {
            this.zza = skuDetails;
            return this;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    @NonNull
    public SkuDetails getSkuDetails() {
        return this.zza;
    }
}
