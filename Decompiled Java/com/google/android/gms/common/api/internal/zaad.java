package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zaad implements OnCompleteListener<TResult> {
    private final /* synthetic */ zaab zafp;
    private final /* synthetic */ TaskCompletionSource zaft;

    zaad(zaab zaab, TaskCompletionSource taskCompletionSource) {
        this.zafp = zaab;
        this.zaft = taskCompletionSource;
    }

    public final void onComplete(@NonNull Task<TResult> task) {
        this.zafp.zafr.remove(this.zaft);
    }
}
