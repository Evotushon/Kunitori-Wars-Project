package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzari {
    /* access modifiers changed from: private */
    public WeakHashMap<Context, zzark> zzdon = new WeakHashMap<>();

    public final Future<zzarg> zzz(Context context) {
        return zzazq.zzdxk.zzd(new zzarh(this, context));
    }
}
