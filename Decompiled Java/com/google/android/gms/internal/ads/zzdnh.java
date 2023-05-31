package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdna;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdnh<V> extends zzdna<Object, V> {
    /* access modifiers changed from: private */
    public zzdnj<?> zzhcp;

    zzdnh(zzdlq<? extends zzdof<?>> zzdlq, boolean z, Executor executor, Callable<V> callable) {
        super(zzdlq, z, false);
        this.zzhcp = new zzdnk(this, callable, executor);
        zzaum();
    }

    /* access modifiers changed from: package-private */
    public final void zzb(int i, @NullableDecl Object obj) {
    }

    /* access modifiers changed from: package-private */
    public final void zzaun() {
        zzdnj<?> zzdnj = this.zzhcp;
        if (zzdnj != null) {
            zzdnj.execute();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzdna.zza zza) {
        super.zza(zza);
        if (zza == zzdna.zza.OUTPUT_FUTURE_DONE) {
            this.zzhcp = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void interruptTask() {
        zzdnj<?> zzdnj = this.zzhcp;
        if (zzdnj != null) {
            zzdnj.interruptTask();
        }
    }
}
