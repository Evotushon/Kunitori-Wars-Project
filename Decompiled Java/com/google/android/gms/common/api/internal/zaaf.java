package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zaaf {
    private final ApiKey<?> zafv;
    private final TaskCompletionSource<Boolean> zafw = new TaskCompletionSource<>();

    public zaaf(ApiKey<?> apiKey) {
        this.zafv = apiKey;
    }

    public final ApiKey<?> getApiKey() {
        return this.zafv;
    }

    public final TaskCompletionSource<Boolean> zaaj() {
        return this.zafw;
    }
}
