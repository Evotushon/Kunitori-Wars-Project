package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zaab {
    /* access modifiers changed from: private */
    public final Map<BasePendingResult<?>, Boolean> zafq = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */
    public final Map<TaskCompletionSource<?>, Boolean> zafr = Collections.synchronizedMap(new WeakHashMap());

    /* access modifiers changed from: package-private */
    public final void zaa(BasePendingResult<? extends Result> basePendingResult, boolean z) {
        this.zafq.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.addStatusListener(new zaaa(this, basePendingResult));
    }

    /* access modifiers changed from: package-private */
    public final <TResult> void zaa(TaskCompletionSource<TResult> taskCompletionSource, boolean z) {
        this.zafr.put(taskCompletionSource, Boolean.valueOf(z));
        taskCompletionSource.getTask().addOnCompleteListener(new zaad(this, taskCompletionSource));
    }

    /* access modifiers changed from: package-private */
    public final boolean zaae() {
        return !this.zafq.isEmpty() || !this.zafr.isEmpty();
    }

    public final void zaaf() {
        zaa(false, GoogleApiManager.zaia);
    }

    public final void zaag() {
        zaa(true, zaco.zalc);
    }

    private final void zaa(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.zafq) {
            hashMap = new HashMap(this.zafq);
        }
        synchronized (this.zafr) {
            hashMap2 = new HashMap(this.zafr);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).zab(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new ApiException(status));
            }
        }
    }
}
