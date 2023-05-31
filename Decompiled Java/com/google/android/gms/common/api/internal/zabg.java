package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import com.google.android.gms.internal.base.zal;
import com.google.android.gms.internal.base.zaq;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zabg {
    private static final ExecutorService zaip = zal.zact().zaa(2, new NumberedThreadFactory("GAC_Executor"), zaq.zasj);

    public static ExecutorService zabd() {
        return zaip;
    }
}
