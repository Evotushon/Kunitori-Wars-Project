package com.google.android.gms.ads.rewarded;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class ServerSideVerificationOptions {
    private final String zzdpa;
    private final String zzdpb;

    private ServerSideVerificationOptions(Builder builder) {
        this.zzdpa = builder.zzdpa;
        this.zzdpb = builder.zzdpb;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public static final class Builder {
        /* access modifiers changed from: private */
        public String zzdpa = "";
        /* access modifiers changed from: private */
        public String zzdpb = "";

        public final Builder setUserId(String str) {
            this.zzdpa = str;
            return this;
        }

        public final Builder setCustomData(String str) {
            this.zzdpb = str;
            return this;
        }

        public final ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this);
        }
    }

    public String getUserId() {
        return this.zzdpa;
    }

    public String getCustomData() {
        return this.zzdpb;
    }
}
