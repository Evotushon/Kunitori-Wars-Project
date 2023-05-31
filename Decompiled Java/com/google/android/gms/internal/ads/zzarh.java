package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzarh implements Callable<zzarg> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzari zzdom;

    zzarh(zzari zzari, Context context) {
        this.zzdom = zzari;
        this.val$context = context;
    }

    public final /* synthetic */ Object call() throws Exception {
        zzarg zzarg;
        zzark zzark = (zzark) this.zzdom.zzdon.get(this.val$context);
        if (zzark != null) {
            if (!(zzark.zzdoq + zzaba.zzcto.get().longValue() < zzq.zzlc().currentTimeMillis())) {
                zzarg = new zzarf(this.val$context, zzark.zzdor).zzul();
                this.zzdom.zzdon.put(this.val$context, new zzark(this.zzdom, zzarg));
                return zzarg;
            }
        }
        zzarg = new zzarf(this.val$context).zzul();
        this.zzdom.zzdon.put(this.val$context, new zzark(this.zzdom, zzarg));
        return zzarg;
    }
}
