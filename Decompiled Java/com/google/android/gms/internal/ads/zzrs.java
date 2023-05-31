package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzrs {
    private final Object zzbro = new Object();
    @GuardedBy("poolLock")
    private boolean zzbrp = false;
}
