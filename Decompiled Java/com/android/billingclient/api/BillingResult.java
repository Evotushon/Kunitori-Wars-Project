package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.zzb;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
public final class BillingResult {
    /* access modifiers changed from: private */
    public int zza;
    /* access modifiers changed from: private */
    public String zzb;

    /* compiled from: com.android.billingclient:billing@@4.1.0 */
    public static class Builder {
        private int zza;
        private String zzb = "";

        private Builder() {
        }

        /* synthetic */ Builder(zzas zzas) {
        }

        @NonNull
        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.zza = this.zza;
            billingResult.zzb = this.zzb;
            return billingResult;
        }

        @NonNull
        public Builder setDebugMessage(@NonNull String str) {
            this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setResponseCode(int i) {
            this.zza = i;
            return this;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder((zzas) null);
    }

    @NonNull
    public String getDebugMessage() {
        return this.zzb;
    }

    public int getResponseCode() {
        return this.zza;
    }

    @NonNull
    public String toString() {
        String zzk = zzb.zzk(this.zza);
        String str = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(zzk).length() + 32 + String.valueOf(str).length());
        sb.append("Response Code: ");
        sb.append(zzk);
        sb.append(", Debug Message: ");
        sb.append(str);
        return sb.toString();
    }
}
