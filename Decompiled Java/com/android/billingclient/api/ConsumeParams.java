package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
public final class ConsumeParams {
    /* access modifiers changed from: private */
    public String zza;

    /* compiled from: com.android.billingclient:billing@@4.1.0 */
    public static final class Builder {
        private String zza;

        private Builder() {
        }

        /* synthetic */ Builder(zzau zzau) {
        }

        @NonNull
        public ConsumeParams build() {
            String str = this.zza;
            if (str != null) {
                ConsumeParams consumeParams = new ConsumeParams((zzav) null);
                consumeParams.zza = str;
                return consumeParams;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        @NonNull
        public Builder setPurchaseToken(@NonNull String str) {
            this.zza = str;
            return this;
        }
    }

    private ConsumeParams() {
    }

    /* synthetic */ ConsumeParams(zzav zzav) {
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder((zzau) null);
    }

    @NonNull
    public String getPurchaseToken() {
        return this.zza;
    }
}
