package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zai implements PendingResult.StatusListener {
    private final /* synthetic */ PendingResult zapi;
    private final /* synthetic */ TaskCompletionSource zapj;
    private final /* synthetic */ PendingResultUtil.ResultConverter zapk;
    private final /* synthetic */ PendingResultUtil.zaa zapl;

    zai(PendingResult pendingResult, TaskCompletionSource taskCompletionSource, PendingResultUtil.ResultConverter resultConverter, PendingResultUtil.zaa zaa) {
        this.zapi = pendingResult;
        this.zapj = taskCompletionSource;
        this.zapk = resultConverter;
        this.zapl = zaa;
    }

    public final void onComplete(Status status) {
        if (status.isSuccess()) {
            this.zapj.setResult(this.zapk.convert(this.zapi.await(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.zapj.setException(this.zapl.zaf(status));
    }
}
