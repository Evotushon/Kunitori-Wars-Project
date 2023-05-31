package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zaaa implements PendingResult.StatusListener {
    private final /* synthetic */ BasePendingResult zafo;
    private final /* synthetic */ zaab zafp;

    zaaa(zaab zaab, BasePendingResult basePendingResult) {
        this.zafp = zaab;
        this.zafo = basePendingResult;
    }

    public final void onComplete(Status status) {
        this.zafp.zafq.remove(this.zafo);
    }
}
