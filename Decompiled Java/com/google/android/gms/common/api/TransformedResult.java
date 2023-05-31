package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public abstract class TransformedResult<R extends Result> {
    public abstract void andFinally(@NonNull ResultCallbacks<? super R> resultCallbacks);

    @NonNull
    public abstract <S extends Result> TransformedResult<S> then(@NonNull ResultTransform<? super R, ? extends S> resultTransform);
}
